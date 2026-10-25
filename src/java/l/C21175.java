package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import moe.shizuku.server.IShizukuService;

/* compiled from: 650G */
/* renamed from: l.᩷᩹᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21175 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static WeakReference f68243;

    /* renamed from: ᩺ۗۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f68244 = {1671, -26945, -26951, -26964, -26949, -26949, -26957, -26949, -26960, -26966, -26896, -26966, -26970, -26966, -26897, -26897, -26897, -26924, -22834, -15468, 2268, 27654, -30755, 24301, 32617, 28997, 22927, 22582, 32256, -28498, -26959, 31200, 25886, 31607, 6633, 30252, 22294, 23443, 24817, 28942, 26005, -31868, -29880, 28417};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f68245;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f68246;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f68247;

    public C21175(AbstractActivityC3346 abstractActivityC3346) {
        String str;
        int m6981;
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        int m69812;
        int i3;
        int i4 = RunnableC0588.f2309;
        int i5 = C3019.f9544;
        short s = f68244[0];
        int i6 = (s * 29786) - ((s * s) + 221801449) > 0 ? 30403 : 38622;
        int m69813 = (i4 - C2105.m6981("᩵֨")) * (-111);
        BufferedReader bufferedReader = null;
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z2 = false;
        BufferedReader bufferedReader2 = null;
        int i12 = -1711832198;
        BufferedReader bufferedReader3 = null;
        int i13 = ((m69813 ^ i5) * 14201) ^ 1339323136;
        String str3 = null;
        int i14 = m69813 ^ (-1664904415);
        int i15 = 0;
        while (true) {
            i12 = i14 ^ (i13 & (((i12 ^ i5) * 18725) >> 31));
            switch (i12) {
                case -2138496983:
                case 844567289:
                    C1128.m3852(bufferedReader);
                    break;
                case -2133456860:
                case 1197915689:
                    if (i7 > 0) {
                        m6981 = C0630.m2566("ۧ᩺") ^ i4;
                        i13 = ((m6981 ^ i5) * 3517) ^ 1517042876;
                        i = 1280399573;
                        i14 = m6981 ^ i;
                    }
                    m6981 = (C0630.m2566("ۢۚ") + i5) * (-29);
                    i13 = ((m6981 ^ i4) * (-20417)) ^ (-912544935);
                    i = 594296949;
                    i14 = m6981 ^ i;
                case -1967899136:
                case -501278220:
                    this.f68245 = spannableStringBuilder2;
                    m6981 = C0630.m2566("᩵ܰ") ^ i4;
                    i13 = ((m6981 ^ i5) * 4713) ^ (-1259831116);
                    i = -1197670283;
                    i14 = m6981 ^ i;
                case -1786275183:
                case 560317569:
                    break;
                case -1579047235:
                case 898274993:
                    str = str3;
                    i15 = 1;
                    this.f68247 = true;
                    this.f68246 = abstractActivityC3346;
                    bufferedReader2 = null;
                    int m2566 = C0630.m2566("ܳۗ") ^ i4;
                    i14 = m2566 ^ 1995870006;
                    i13 = ((m2566 ^ i5) * (-30875)) ^ 1086974773;
                    str3 = str;
                case -1319506654:
                case 525434167:
                    if (z) {
                        i2 = i15;
                        str = str3;
                        m69812 = C2105.m6981("ۜܺ") ^ i5;
                        i13 = (-98915938) ^ ((m69812 ^ i4) * (-21257));
                        i3 = 812986370;
                        i14 = i3 ^ m69812;
                        i15 = i2;
                        str3 = str;
                    } else {
                        m6981 = C2105.m6981("᩷ۗ") ^ i5;
                        i13 = ((m6981 ^ i4) * 21803) ^ 475965204;
                        i = -55860969;
                        i14 = m6981 ^ i;
                    }
                case -1284344643:
                case 938880269:
                    C0237.m1490(spannableStringBuilder2, ServiceConnectionC3453.m10568(f68244, 14, 3, i6));
                    i8 = 0;
                    i9 = 17;
                    C2105.m6985(spannableStringBuilder2, new ForegroundColorSpan(0), RunnableC1937.m6382(spannableStringBuilder2) - 3, C1047.m3592(spannableStringBuilder2), 17);
                    i10 = RunnableC1937.m6382(spannableStringBuilder2);
                    C3911.m11921(spannableStringBuilder2, str2);
                    i11 = C1047.m3592(spannableStringBuilder2);
                    z2 = C7811.m20838(str2, C0714.m2816(f68244, 18, 1, i6));
                    m6981 = C2105.m6981("۬ᩳ") ^ i5;
                    i13 = ((m6981 ^ i4) * 1603) ^ (-1546634071);
                    i = -1342638796;
                    i14 = m6981 ^ i;
                case -1229222577:
                case -284322147:
                    try {
                        spannableStringBuilder2 = new SpannableStringBuilder();
                        try {
                            i2 = i15;
                            try {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = str3;
                                try {
                                    bufferedReader3 = new BufferedReader(new InputStreamReader(abstractActivityC3346.getAssets().open(C1504.m5177(f68244, 1, 13, i6)), StandardCharsets.UTF_8));
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    m69812 = C2105.m6981("ۜܺ") ^ i5;
                                    i13 = (-98915938) ^ ((m69812 ^ i4) * (-21257));
                                    i3 = 812986370;
                                } catch (IOException unused) {
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    bufferedReader3 = null;
                                    bufferedReader = bufferedReader2;
                                    m69812 = C2105.m6981("۬ۙ") ^ i5;
                                    i13 = (-882359890) ^ ((m69812 ^ i4) * 28951);
                                    i3 = 1831367860;
                                    i14 = i3 ^ m69812;
                                    i15 = i2;
                                    str3 = str;
                                }
                            } catch (IOException unused2) {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = str3;
                            }
                        } catch (IOException unused3) {
                            i2 = i15;
                            str = str3;
                        }
                    } catch (IOException unused4) {
                        i2 = i15;
                        str = str3;
                        spannableStringBuilder2 = null;
                    }
                    i14 = i3 ^ m69812;
                    i15 = i2;
                    str3 = str;
                case -804964133:
                case -346646548:
                    C0630.m2576(spannableStringBuilder2, new RelativeSizeSpan(1.1f), i10, i11, i9);
                    C0630.m2576(spannableStringBuilder2, new StyleSpan(i15), i10, i11, i9);
                    C0237.m1490(spannableStringBuilder2, C5695.m16034(f68244, 19, 1, i6));
                    int i16 = i11 + 1;
                    C2105.m6985(spannableStringBuilder2, new ForegroundColorSpan(i8), i11, i16, i9);
                    C2105.m6985(spannableStringBuilder2, new RelativeSizeSpan(1.5f), i11, i16, i9);
                    C2105.m6985(spannableStringBuilder2, new StyleSpan(i15), i11, i16, i9);
                    i2 = i15;
                    str = str3;
                    m69812 = C2105.m6981("ۜܺ") ^ i5;
                    i13 = (-98915938) ^ ((m69812 ^ i4) * (-21257));
                    i3 = 812986370;
                    i14 = i3 ^ m69812;
                    i15 = i2;
                    str3 = str;
                case -710256887:
                case -261938743:
                    C3911.m11921(spannableStringBuilder2, RunnableC1108.m3789(f68244, 17, 1, i6));
                    m6981 = (C0630.m2566("ۢۚ") + i5) * (-29);
                    i13 = ((m6981 ^ i4) * (-20417)) ^ (-912544935);
                    i = 594296949;
                    i14 = m6981 ^ i;
                case 285807527:
                case 1020038022:
                    i7 = C1047.m3592(spannableStringBuilder2);
                    m6981 = C2105.m6981("ܺ۫") ^ i4;
                    i13 = ((m6981 ^ i5) * 10889) ^ (-410824941);
                    i = 422383994;
                    i14 = m6981 ^ i;
                case 333050044:
                case 1059341595:
                    str2 = C4159.m12570(str3);
                    z = C7106.m19121(str2);
                    m6981 = (C2105.m6981("ܳۡ") + i5) * (-121);
                    i13 = ((m6981 ^ i4) * 23137) ^ 118223912;
                    i = -1318556219;
                    i14 = m6981 ^ i;
                case 391338496:
                case 1567384086:
                    if (str3 != null) {
                        m6981 = C0630.m2566("ܽܺ") ^ i5;
                        i13 = ((m6981 ^ i4) * 22351) ^ (-2088346247);
                        i = -763024522;
                    } else {
                        m6981 = (i4 - C2105.m6981("۬ۨ")) * (-113);
                        i13 = ((m6981 ^ i5) * (-25709)) ^ (-473498109);
                        i = -365232503;
                    }
                    i14 = m6981 ^ i;
                case 1113165251:
                case 1934937442:
                    if (z2) {
                        m6981 = C2105.m6981("ۤ᩸") ^ i4;
                        i13 = ((m6981 ^ i5) * (-10357)) ^ (-1762178930);
                        i = 1923979351;
                        i14 = m6981 ^ i;
                    } else {
                        i2 = i15;
                        str = str3;
                        m69812 = C2105.m6981("ۜܺ") ^ i5;
                        i13 = (-98915938) ^ ((m69812 ^ i4) * (-21257));
                        i3 = 812986370;
                        i14 = i3 ^ m69812;
                        i15 = i2;
                        str3 = str;
                    }
                default:
                    try {
                        str3 = bufferedReader3.readLine();
                        m6981 = (i4 - C0630.m2566("᩻ܿ")) * 23;
                        i13 = ((m6981 ^ i5) * (-7319)) ^ 147136707;
                        i = -2009730197;
                        i14 = m6981 ^ i;
                    } catch (IOException unused5) {
                        i2 = i15;
                        str = str3;
                        bufferedReader = bufferedReader3;
                        m69812 = C2105.m6981("۬ۙ") ^ i5;
                        i13 = (-882359890) ^ ((m69812 ^ i4) * 28951);
                        i3 = 1831367860;
                        i14 = i3 ^ m69812;
                        i15 = i2;
                        str3 = str;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48120() {
        int i = -1657610372;
        int i2 = C3245.f10203;
        int i3 = C4075.f12947;
        int m6981 = C2105.m6981("֨ܽ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-23231)) ^ (-945246348);
        int i5 = -1596442381;
        while (true) {
            i = ((((i ^ i3) * (-747)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2103323122:
                case -2026252257:
                    if (this.f68247) {
                        m6981 = (C0630.m2566("֨ۘ") ^ i3) * 29;
                        i4 = ((m6981 ^ i2) * 32515) ^ 2000469206;
                        i5 = 1751859244;
                    } else {
                        m6981 = C0630.m2566("ۙ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5649)) ^ (-742143211);
                        i5 = -577340014;
                    }
                case -1758382447:
                case -1048887:
                    throw new IllegalStateException();
                case -1743345448:
                case -458857194:
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ۧᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17433) ^ (-1931576888);
                        i5 = -600908240;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩸֫")) * (-109);
                        i4 = ((m6981 ^ i2) * 7997) ^ (-1754083653);
                        i5 = 265113647;
                    }
                case -1715017200:
                case -44794224:
                    if (C1916.f6442) {
                        m6981 = (i2 - C2105.m6981("ۡ۠")) * (-45);
                        i4 = ((m6981 ^ i3) * (-20401)) ^ (-110922736);
                        i5 = -1463771590;
                    } else {
                        m6981 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    }
                case -1291015700:
                case 1432326203:
                    C4616.m13552();
                    RunnableC0588.m2441();
                    return;
                case -1229242110:
                case 1309179029:
                    C3432.m10477();
                    C7811.m20844();
                    m6981 = (C0630.m2566("᩺ۜ") + i3) * 15;
                    i4 = ((m6981 ^ i2) * (-21275)) ^ (-2004435439);
                    i5 = -1462167011;
                case -886568698:
                case 95029691:
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        m6981 = C0630.m2566("ۤۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15519) ^ (-865368258);
                        i5 = 1419012025;
                    }
                case -799109810:
                case 394405538:
                    if (C1128.f4106 <= 0) {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        m6981 = (C2105.m6981("ܺᩴ") ^ i2) * (-55);
                        i4 = ((m6981 ^ i3) * (-6085)) ^ (-1190755504);
                        i5 = 1937263412;
                    }
                case -787226708:
                case 919088391:
                    if (C2126.f7087) {
                        m6981 = C2105.m6981("ۧᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17433) ^ (-1931576888);
                        i5 = -600908240;
                    } else {
                        m6981 = C2105.m6981("ۖ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25429)) ^ (-599491556);
                        i5 = -1613113062;
                    }
                case -719063321:
                case 1658377393:
                    if (C3432.m10477() <= 0) {
                        m6981 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    } else {
                        m6981 = C0630.m2566("۠ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 713) ^ 335722438;
                        i5 = 668188224;
                    }
                case -595879381:
                case 1420516126:
                    if (C5695.m16023() < 0) {
                        m6981 = (C0630.m2566("᩺ۜ") + i3) * 15;
                        i4 = ((m6981 ^ i2) * (-21275)) ^ (-2004435439);
                        i5 = -1462167011;
                    } else {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    }
                case -290386222:
                case 436815204:
                    this.f68247 = false;
                    if (C0714.f2697 >= 0) {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        m6981 = (C2105.m6981("ܿۙ") + i3) * (-37);
                        i4 = ((m6981 ^ i2) * 17863) ^ 1608018420;
                        i5 = 678175639;
                    }
                case -262288900:
                case 1477622033:
                    if (C2126.f7087) {
                        m6981 = (C0630.m2566("᩺ۜ") + i3) * 15;
                        i4 = ((m6981 ^ i2) * (-21275)) ^ (-2004435439);
                        i5 = -1462167011;
                    } else {
                        m6981 = (C0630.m2566("֡ܶ") + i2) * (-51);
                        i4 = ((m6981 ^ i3) * 20361) ^ 814233798;
                        i5 = 2080420251;
                    }
                case 658319629:
                case 1571783074:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        C3911.m11926(new RunnableC16940(0, this));
                        return;
                    }
                    m6981 = C2105.m6981("ۧᩳ") ^ i3;
                    i4 = ((m6981 ^ i2) * 17433) ^ (-1931576888);
                    i5 = -600908240;
                case 1051551815:
                case 1512218728:
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        m6981 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    }
                case 1995301713:
                case 2096598207:
                    if (C0483.m2121()) {
                        m6981 = C2105.m6981("᩺ۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-10513)) ^ (-1079640487);
                        i5 = 1498150378;
                    } else {
                        m6981 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    }
                default:
                    if (C7106.m19120() > 0) {
                        m6981 = C2105.m6981("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        m6981 = C2105.m6981("ܰ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-11553)) ^ (-1662764443);
                        i5 = 2019230022;
                    }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48119(C21175 c21175) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        String str = null;
        int i = -1974190046;
        int i2 = C2520.f8000;
        int i3 = C1047.f3863;
        int m6981 = C2105.m6981("֡ۘ") ^ i2;
        int i4 = ((m6981 ^ i3) * 18039) ^ (-2104166117);
        int i5 = 1186752476;
        while (true) {
            i = ((((i ^ i3) * (-9811)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1914459721:
                case 801454742:
                    if (C2105.m6982() != 0) {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        m6981 = C0630.m2566("ܽᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-3039)) ^ (-497274324);
                        i5 = 1016368329;
                    }
                case -1913695081:
                case 799288200:
                    if (C4263.m12819() >= 0) {
                        m6981 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    } else {
                        m6981 = (C0630.m2566("᩸ۚ") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 21099) ^ 868394222;
                        i5 = 650789994;
                    }
                case -1895800946:
                case 357936124:
                    str = C23986.m52827();
                    if (C4075.m12263() <= 0) {
                        m6981 = (C0630.m2566("ܰ۠") ^ i3) * (-7);
                        i4 = ((m6981 ^ i2) * 29045) ^ 1234444251;
                        i5 = 1666031919;
                    } else {
                        m6981 = (C0630.m2566("ۚ᩻") ^ i2) * 9;
                        i4 = ((m6981 ^ i3) * (-21973)) ^ (-1284926740);
                        i5 = 521149290;
                    }
                case -1832322804:
                case -1002271109:
                    C2167.m7155();
                    if (C2105.f7037 == 0) {
                        m6981 = C0630.m2566("ᩳۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    } else {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    }
                case -1643402652:
                case 1609180156:
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ᩳۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    } else {
                        m6981 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    }
                case -1615502317:
                case 1385218889:
                    if (C2105.m6982() != 0) {
                        m6981 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    } else {
                        m6981 = C2105.m6981("ۤۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 10399) ^ (-1277425184);
                        i5 = 2117174424;
                    }
                case -1309904010:
                case -596348911:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C0630.m2566("ᩳۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    } else {
                        m6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31895) ^ 1972772260;
                        i5 = -1543481956;
                    }
                case -1082029041:
                case -1050843120:
                    if (C2105.f7037 != 0) {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        m6981 = C0630.m2566("ܰᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27009)) ^ 564182155;
                        i5 = -233496714;
                    }
                case -854058273:
                case 920917634:
                    abstractActivityC3346 = c21175.f68246;
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        m6981 = (C2105.m6981("֡ܳ") ^ i3) * (-47);
                        i4 = ((m6981 ^ i2) * 13065) ^ 1436326985;
                        i5 = -659672196;
                    }
                case -785515041:
                case 865540:
                    C2167.m7155();
                    C2272.m7503();
                    break;
                case -483840111:
                case -174747471:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("۠᩷") + i3) * 39;
                        i4 = ((m6981 ^ i2) * (-6019)) ^ (-1476300388);
                        i5 = 325515620;
                    } else {
                        m6981 = (C2105.m6981("֡ۤ") + i3) * (-75);
                        i4 = ((m6981 ^ i2) * (-12835)) ^ (-1925659718);
                        i5 = -1728778816;
                    }
                case -137017545:
                case 1047156327:
                    ActivityC10717.m26893((Context) abstractActivityC3346, str, true);
                    break;
                case 64596588:
                case 1123842878:
                    ServiceConnectionC3453.m10564();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        m6981 = (C2105.m6981("۠᩷") + i3) * 39;
                        i4 = ((m6981 ^ i2) * (-6019)) ^ (-1476300388);
                        i5 = 325515620;
                    }
                case 963428936:
                case 1646854412:
                    C3245.m9925();
                    C1504.m5179();
                    m6981 = C0630.m2566("ᩳۢ") ^ i2;
                    i4 = ((m6981 ^ i3) * 26093) ^ 1795935697;
                    i5 = 1518997316;
                case 1733210583:
                case 2137908059:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("۟ۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * 12155) ^ 2127998045;
                        i5 = 315472546;
                    } else {
                        m6981 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    }
                default:
                    if (C3746.f11829 <= 0) {
                        m6981 = C2105.m6981("ۗ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳۙ")) * (-81);
                        i4 = ((m6981 ^ i3) * (-14767)) ^ (-16320310);
                        i5 = 1543610277;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48116(C21175 c21175) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        String str = null;
        int i = 872934349;
        int i2 = C1773.f6144;
        int i3 = C4075.f12947;
        int m6981 = (i3 - C2105.m6981("᩵ܶ")) * (-49);
        int i4 = ((m6981 ^ i2) * 6413) ^ (-1329900562);
        int i5 = -1801898123;
        while (true) {
            i = ((((i ^ i2) * 18623) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2090931755:
                case 2117227848:
                    if (C1420.m4913()) {
                        m6981 = (C2105.m6981("۫ۗ") ^ i2) * 53;
                        i4 = ((m6981 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        m6981 = C2105.m6981("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25573)) ^ (-2122066668);
                        i5 = 367583119;
                    }
                case -1718843139:
                case -800264009:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (C2105.m6981("۫ۗ") ^ i2) * 53;
                        i4 = ((m6981 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        m6981 = (C2105.m6981("ۘ֨") + i3) * 21;
                        i4 = ((m6981 ^ i2) * (-32337)) ^ 1743085426;
                        i5 = 1916607195;
                    }
                case -1649347308:
                case 344670335:
                    if (C4117.f13076 <= 0) {
                        m6981 = C2105.m6981("ۤܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30127)) ^ (-970838000);
                        i5 = -824617851;
                    } else {
                        m6981 = (C2105.m6981("ۖᩴ") ^ i3) * 77;
                        i4 = ((m6981 ^ i2) * 32291) ^ (-2040454493);
                        i5 = 730751844;
                    }
                case -1570452259:
                case -1287559088:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("᩸ۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2825)) ^ (-1160202282);
                        i5 = 1351356381;
                    } else {
                        m6981 = C0630.m2566("ܳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                case -1480368203:
                case -1134237917:
                    C5695.m16023();
                    m6981 = (C0630.m2566("ۘۤ") + i3) * 83;
                    i4 = ((m6981 ^ i2) * (-28563)) ^ (-1387815973);
                    i5 = -2082264899;
                case -1238440623:
                case 2026150296:
                    C3019.m9255();
                    C3537.m10746();
                    break;
                case -1191135583:
                case -724193865:
                    if (C1916.f6442) {
                        m6981 = (C2105.m6981("ܽ۠") + i3) * 79;
                        i4 = ((m6981 ^ i2) * 32345) ^ 1431501025;
                        i5 = -1913825368;
                    } else {
                        m6981 = C0630.m2566("ܳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                case -972928784:
                case -661000093:
                    if (C0050.f910 < 0) {
                        m6981 = C0630.m2566("ܳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    } else {
                        m6981 = C0630.m2566("ۢۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4145) ^ (-1485270980);
                        i5 = 1935397904;
                    }
                case -530257496:
                case 1560613437:
                    if (C7106.f21815 != 0) {
                        m6981 = (C0630.m2566("ۘۤ") + i3) * 83;
                        i4 = ((m6981 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        m6981 = C0630.m2566("ܳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                case -196702815:
                case 673560618:
                    str = C23986.m52827();
                    if (C7106.f21815 != 0) {
                        m6981 = (C2105.m6981("۫ۗ") ^ i2) * 53;
                        i4 = ((m6981 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        m6981 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12899)) ^ (-997458099);
                        i5 = 462068014;
                    }
                case -83879439:
                case 9497002:
                    C2167.m7155();
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = (C0630.m2566("ۘۤ") + i3) * 83;
                        i4 = ((m6981 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        m6981 = C2105.m6981("ۤܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30127)) ^ (-970838000);
                        i5 = -824617851;
                    }
                case 290286007:
                case 1751748678:
                    if (C0050.f910 >= 0) {
                        m6981 = C0630.m2566("ܳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    } else {
                        m6981 = (C2105.m6981("ܿۤ") ^ i2) * 49;
                        i4 = ((m6981 ^ i3) * 11967) ^ 481758067;
                        i5 = 1262881442;
                    }
                case 892650153:
                case 1567789735:
                    ActivityC10717.m26893((Context) abstractActivityC3346, str, true);
                    break;
                case 1258402307:
                case 1572294163:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ۘۤ") + i3) * 83;
                        i4 = ((m6981 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        m6981 = (C2105.m6981("۟ۧ") ^ i2) * (-109);
                        i4 = ((m6981 ^ i3) * (-20507)) ^ (-1189413721);
                        i5 = -1152184857;
                    }
                case 1338653729:
                case 1941357644:
                    abstractActivityC3346 = c21175.f68246;
                    if (C0237.f1507 != 0) {
                        m6981 = (C0630.m2566("ۘۤ") + i3) * 83;
                        i4 = ((m6981 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        m6981 = C2105.m6981("ۗۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6435) ^ 2110611044;
                        i5 = 961743599;
                    }
                default:
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("ۢۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4145) ^ (-1485270980);
                        i5 = 1935397904;
                    } else {
                        m6981 = (C2105.m6981("֡֫") ^ i3) * (-113);
                        i4 = ((m6981 ^ i2) * 14819) ^ (-1537318023);
                        i5 = -557405799;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48121(RunnableC12791 runnableC12791) {
        int i = -736716015;
        int i2 = C3746.f11829;
        int i3 = C4075.f12947;
        int m2566 = (C0630.m2566("ۧ֨") ^ i3) * (-63);
        int i4 = ((m2566 ^ i2) * 25867) ^ (-2057622712);
        int i5 = -1427835675;
        while (true) {
            i = ((((i ^ i2) * 15089) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2065516964:
                case 2058792697:
                    this.f68247 = false;
                    if (C1711.f5919) {
                        m2566 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        m2566 = C0630.m2566("᩹ۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-17281)) ^ 1509916064;
                        i5 = 1637974416;
                    }
                case -2058190958:
                case -957976363:
                    if (C4075.m12263() <= 0) {
                        m2566 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        m2566 = (C2105.m6981("᩸ܳ") + i2) * 5;
                        i4 = ((m2566 ^ i3) * 923) ^ (-1384256854);
                        i5 = 90171045;
                    }
                case -1862388167:
                case -1351016456:
                    throw new IllegalStateException();
                case -1423087417:
                case 185186264:
                    if (C1047.f3863 < 0) {
                        m2566 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    }
                case -1397366900:
                case 63020751:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C0630.m2566("᩻۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    } else {
                        m2566 = (C2105.m6981("۠ۤ") + i3) * 39;
                        i4 = ((m2566 ^ i2) * (-29299)) ^ 1717933117;
                        i5 = 244004282;
                    }
                case -1095882278:
                case 827493317:
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("ۜۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7911) ^ (-340346009);
                        i5 = 229846593;
                    } else {
                        m2566 = C0630.m2566("ۗܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19313) ^ (-1067340276);
                        i5 = -477369295;
                    }
                case -1031154976:
                case -611460900:
                    if (RunnableC1108.f4040) {
                        m2566 = (C0630.m2566("ۖ۠") ^ i3) * 123;
                        i4 = ((m2566 ^ i2) * (-4353)) ^ (-1808658014);
                        i5 = 984922236;
                    } else {
                        m2566 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    }
                case -1004120770:
                case 1965976272:
                    C3746.m11369();
                    if (C1711.f5919) {
                        m2566 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        m2566 = C0630.m2566("᩻۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    }
                case -737020014:
                case 1640341071:
                    C22628.m50615();
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ۜۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7911) ^ (-340346009);
                        i5 = 229846593;
                    } else {
                        m2566 = C0630.m2566("᩻۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    }
                case -449067918:
                case 1223669084:
                    if (C2167.f7158 >= 0) {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    } else {
                        m2566 = (C2105.m6981("ۜ۬") ^ i2) * 5;
                        i4 = ((m2566 ^ i3) * (-31897)) ^ (-137092506);
                        i5 = -31690296;
                    }
                case -369513674:
                case 1142105515:
                    if (C1005.m3501()) {
                        int i6 = 0;
                        if (C22628.f73083 > 0) {
                            ViewOnClickListenerC1958.m6443(new RunnableC18352(i6, this, runnableC12791), 1000L);
                            return;
                        }
                        m2566 = C0630.m2566("ܺ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    } else {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    }
                case -338910729:
                case 205451620:
                    C1005.m3501();
                    return;
                case -64778111:
                case 1859276720:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("ܺ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    } else {
                        m2566 = C2105.m6981("᩸᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31489)) ^ (-1531255422);
                        i5 = -1952858091;
                    }
                case 63483384:
                case 1802157352:
                    C1005.m3501();
                    m2566 = C0630.m2566("᩻۬") ^ i3;
                    i4 = ((m2566 ^ i2) * 20259) ^ 1858407127;
                    i5 = -2073633939;
                case 118583685:
                case 1911634695:
                    if (C1420.f5096 <= 0) {
                        m2566 = C0630.m2566("ܺ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    } else {
                        m2566 = (C0630.m2566("ܿ֫") + i3) * 17;
                        i4 = ((m2566 ^ i2) * (-13203)) ^ (-2051457597);
                        i5 = 1190448952;
                    }
                default:
                    if (this.f68247) {
                        m2566 = (C0630.m2566("ܿۛ") ^ i2) * (-47);
                        i4 = ((m2566 ^ i3) * (-27505)) ^ 1710118138;
                        i5 = -1695910731;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۢۡ")) * 39;
                        i4 = ((m2566 ^ i3) * (-16667)) ^ (-226868389);
                        i5 = 92377778;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48117(C21175 c21175, RunnableC12791 runnableC12791) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        boolean z;
        int m2566;
        int i;
        int i2;
        int m6981;
        int i3;
        int i4;
        C19258 c19258;
        short[] sArr;
        int m69812;
        int i5;
        int i6;
        int i7;
        int m69813;
        int i8;
        int i9;
        C19258 c192582;
        short[] sArr2;
        int i10;
        boolean z2;
        int m69814;
        int i11;
        final C21175 c211752 = c21175;
        C19258 c192583 = null;
        DialogInterfaceOnClickListenerC17646 dialogInterfaceOnClickListenerC17646 = null;
        DialogInterfaceOnClickListenerC14823 dialogInterfaceOnClickListenerC14823 = null;
        boolean z3 = false;
        DialogInterfaceC0206 dialogInterfaceC02062 = null;
        final DialogInterfaceC0206 dialogInterfaceC02063 = null;
        TextView textView = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr3 = null;
        char c = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 1517743008;
        int i17 = C3683.f11629;
        int i18 = RunnableC1937.f6483;
        int m69815 = (C2105.m6981("֫᩵") ^ i18) * (-83);
        int i19 = ((m69815 ^ i17) * 24311) ^ 62054161;
        int i20 = m69815 ^ 249435697;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        WeakReference weakReference = null;
        int i24 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 14493) >> 31));
            switch (i16) {
                case -2004488928:
                case -1061046594:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    dialogInterfaceC02063 = RunnableC0588.m2438(c192583);
                    f68243 = new WeakReference(dialogInterfaceC02063);
                    if (z3) {
                        m69813 = (C2105.m6981("ۚ֨") + i17) * (-43);
                        i8 = ((m69813 ^ i18) * (-8259)) ^ 1743219046;
                        i9 = 382063123;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    m69813 = (C2105.m6981("ۡۜ") ^ i17) * (-39);
                    i8 = ((m69813 ^ i18) * (-32029)) ^ 484275557;
                    i9 = 25791583;
                    i20 = m69813 ^ i9;
                    i19 = i8;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1992356797:
                case 1548873485:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    sArr = sArr4;
                    i5 = i24;
                    c19258 = c192583;
                    i21 = 9989;
                    m69812 = (C2105.m6981("ܳۖ") ^ i17) * 35;
                    i6 = ((m69812 ^ i18) * 10187) ^ 298435435;
                    i7 = 1205633715;
                    sArr4 = sArr;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i5;
                    i20 = m69812 ^ i7;
                    i19 = i6;
                    c192583 = c19258;
                    z4 = z;
                case -1976756979:
                case -1749628946:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    C5695.m16035(c192583, i14 ^ 2118684214, dialogInterfaceOnClickListenerC14823);
                    z3 = C9523.m24407();
                    if (z3) {
                        m69813 = C2105.m6981("᩸ܰ") ^ i17;
                        i8 = ((m69813 ^ i18) * (-1435)) ^ (-1097401760);
                        i9 = 228466151;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    m69813 = C2105.m6981("ۧۤ") ^ i18;
                    i8 = ((m69813 ^ i17) * 18631) ^ 1873701288;
                    i9 = 1361229129;
                    i20 = m69813 ^ i9;
                    i19 = i8;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1893346111:
                case 1352905298:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    i12 = C2105.m6981(C2520.m8030(sArr5, 24, 3, i21));
                    i13 = 2130307264;
                    if (C0714.f2697 < 0) {
                        m69813 = (C2105.m6981("ۡܳ") + i17) * 49;
                        i8 = ((m69813 ^ i18) * (-23937)) ^ 846143521;
                        i9 = -967124041;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    m69813 = C2105.m6981("ۢܶ") ^ i18;
                    i8 = ((m69813 ^ i17) * 19673) ^ (-1637860703);
                    i9 = -1266679717;
                    i20 = m69813 ^ i9;
                    i19 = i8;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1568203805:
                case 1969645812:
                    C11340.m28031();
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                    i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                    i4 = -783761845;
                    i20 = m6981 ^ i4;
                    z4 = z;
                    i19 = i3;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1399379097:
                case -178578865:
                    C0630.m2564();
                    if (C1916.f6442) {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        z = z4;
                        m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                        i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                        i4 = -783761845;
                        i20 = m6981 ^ i4;
                        z4 = z;
                        i19 = i3;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    } else {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        z2 = z4;
                        sArr2 = sArr4;
                        i10 = i24;
                        c192582 = c192583;
                        m69814 = C0630.m2566("᩸ۚ") ^ i17;
                        i19 = ((m69814 ^ i18) * 28961) ^ 1309203538;
                        i11 = 1443094892;
                        int i25 = m69814 ^ i11;
                        sArr4 = sArr2;
                        c192583 = c192582;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i10;
                        i20 = i25;
                        z4 = z2;
                        c211752 = c21175;
                    }
                case -1210326694:
                case 219627095:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    i14 = C2105.m6981(C4117.m12355(f68244, 27, 3, i21));
                    if (C3911.m11924() > 0) {
                        m69813 = C0630.m2566("ۢ۫") ^ i18;
                        i8 = ((m69813 ^ i17) * (-25457)) ^ 1523771313;
                        i9 = 466490990;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    z = z4;
                    m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                    i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                    i4 = -783761845;
                    i20 = m6981 ^ i4;
                    z4 = z;
                    i19 = i3;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1111611599:
                case 894206603:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z2 = z4;
                    sArr2 = sArr4;
                    i10 = i24;
                    c192582 = c192583;
                    sArr3 = f68244;
                    c = 20;
                    if (RunnableC0588.m2441() < 0) {
                        m69814 = C2105.m6981("ܿۡ") ^ i17;
                        i19 = ((m69814 ^ i18) * (-8611)) ^ 2093297151;
                        i11 = 815185376;
                        int i252 = m69814 ^ i11;
                        sArr4 = sArr2;
                        c192583 = c192582;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i10;
                        i20 = i252;
                        z4 = z2;
                        c211752 = c21175;
                    }
                    m69814 = C0630.m2566("᩸ۚ") ^ i17;
                    i19 = ((m69814 ^ i18) * 28961) ^ 1309203538;
                    i11 = 1443094892;
                    int i2522 = m69814 ^ i11;
                    sArr4 = sArr2;
                    c192583 = c192582;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i10;
                    i20 = i2522;
                    z4 = z2;
                    c211752 = c21175;
                case -1099149769:
                case 739838898:
                    C2958.m9034();
                    C1047.m3599();
                    break;
                case -1092361255:
                case -585263560:
                    textView = (TextView) dialogInterfaceC02063.m1433(R.id.message);
                    f = 0.0f;
                    f2 = 1.3f;
                    if (C11340.f33930 >= 0) {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        z = z4;
                        int m25662 = C0630.m2566("ۖ᩸") ^ i18;
                        i19 = ((m25662 ^ i17) * (-23337)) ^ 1295099435;
                        i20 = m25662 ^ (-15586981);
                        z4 = z;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    } else {
                        m2566 = C0630.m2566("᩶֡") ^ i18;
                        i = ((m2566 ^ i17) * 11553) ^ (-275270912);
                        i2 = 2036529508;
                        i20 = m2566 ^ i2;
                        i19 = i;
                    }
                case -1032997182:
                case 142379928:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    ViewOnClickListenerC1958.m6441(c192583, i12 ^ i13, dialogInterfaceOnClickListenerC17646);
                    dialogInterfaceOnClickListenerC14823 = new DialogInterfaceOnClickListenerC14823();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m69813 = C0630.m2566("ۡ᩵") ^ i18;
                        i8 = ((m69813 ^ i17) * 8041) ^ 1970219558;
                        i9 = 641257924;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    z = z4;
                    m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                    i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                    i4 = -783761845;
                    i20 = m6981 ^ i4;
                    z4 = z;
                    i19 = i3;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -1031114581:
                case 1861294099:
                    C0237.m1481();
                    if (C3911.f12484 < 0) {
                        m2566 = C2105.m6981("ᩴۢ") ^ i17;
                        i = ((m2566 ^ i18) * 3009) ^ (-1197722431);
                        i2 = 1477693540;
                        i20 = m2566 ^ i2;
                        i19 = i;
                    } else {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        m69813 = C2105.m6981("ۢܶ") ^ i18;
                        i8 = ((m69813 ^ i17) * 19673) ^ (-1637860703);
                        i9 = -1266679717;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                case -1021068774:
                case 220261259:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    sArr = sArr4;
                    i5 = i24;
                    c19258 = c192583;
                    i21 = 33;
                    m69812 = (C2105.m6981("ܳۖ") ^ i17) * 35;
                    i6 = ((m69812 ^ i18) * 10187) ^ 298435435;
                    i7 = 1205633715;
                    sArr4 = sArr;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i5;
                    i20 = m69812 ^ i7;
                    i19 = i6;
                    c192583 = c19258;
                    z4 = z;
                case -1005479025:
                case -733490591:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    short[] sArr6 = sArr4;
                    int i26 = i24;
                    C19258 c192584 = c192583;
                    short s2 = sArr3[c];
                    int i27 = s2 + 165;
                    if (C2272.f7362) {
                        s = s2;
                        i15 = i27;
                        sArr4 = sArr6;
                        c192583 = c192584;
                        i24 = i26;
                        m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                        i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                        i4 = -783761845;
                        i20 = m6981 ^ i4;
                        z4 = z;
                        i19 = i3;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    } else {
                        int m69816 = (i18 - C2105.m6981("᩻᩷")) * 25;
                        int i28 = ((m69816 ^ i17) * 28563) ^ 1495413106;
                        i15 = i27;
                        sArr4 = sArr6;
                        c192583 = c192584;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i26;
                        z4 = z ? 1 : 0;
                        i20 = m69816 ^ 1285574481;
                        s = s2;
                        i19 = i28;
                        c211752 = c21175;
                    }
                case -782447415:
                case -115677262:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    c192583.m44437(C1128.m3841(f68244, 30, 4, i21), (DialogInterface.OnClickListener) null);
                    m69813 = C2105.m6981("ۧۤ") ^ i18;
                    i8 = ((m69813 ^ i17) * 18631) ^ 1873701288;
                    i9 = 1361229129;
                    i20 = m69813 ^ i9;
                    i19 = i8;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -394125403:
                case 859530249:
                    textView.setLineSpacing(f, f2);
                    C1294.m4383(new Runnable() { // from class: l.ۜ᩹᩷

                        /* renamed from: ۨۢܶ, reason: not valid java name and contains not printable characters */
                        private static final short[] f21735 = {7694, 15798, 10418, 1491};

                        /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
                        
                            if (l.C1420.f5096 > 0) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
                        
                            if (l.C3245.f10203 > 0) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
                        
                            if (l.C3245.f10203 <= 0) goto L67;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 850
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC7063.run():void");
                        }
                    }, 500L);
                    break;
                case -70771004:
                case 387863403:
                    C2126.m7039(C7811.m20839(dialogInterfaceC02063), new View.OnClickListener() { // from class: l.᩻᩹᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C21175.m48119(C21175.this);
                        }
                    });
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    m69813 = (C2105.m6981("ۡۜ") ^ i17) * (-39);
                    i8 = ((m69813 ^ i18) * (-32029)) ^ 484275557;
                    i9 = 25791583;
                    i20 = m69813 ^ i9;
                    i19 = i8;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case -26923101:
                case 1626585768:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    AbstractActivityC3346 abstractActivityC3346 = c211752.f68246;
                    int i29 = DialogInterfaceC0206.f1451;
                    c192583 = new C19258(abstractActivityC3346);
                    sArr4 = f68244;
                    i24 = 21;
                    if (C11340.m28031()) {
                        m6981 = (C2105.m6981("ᩳ֡") + i18) * (-29);
                        i3 = ((m6981 ^ i17) * (-31939)) ^ 2146474315;
                        i4 = 1462649010;
                        i20 = m6981 ^ i4;
                        z4 = z;
                        i19 = i3;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                    i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                    i4 = -783761845;
                    i20 = m6981 ^ i4;
                    z4 = z;
                    i19 = i3;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                case 627246053:
                case 1729783071:
                    if (C4616.m13552() == 0) {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        z2 = z4;
                        sArr2 = sArr4;
                        i10 = i24;
                        c192582 = c192583;
                        m69814 = C0630.m2566("᩸ۚ") ^ i17;
                        i19 = ((m69814 ^ i18) * 28961) ^ 1309203538;
                        i11 = 1443094892;
                        int i25222 = m69814 ^ i11;
                        sArr4 = sArr2;
                        c192583 = c192582;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i10;
                        i20 = i25222;
                        z4 = z2;
                        c211752 = c21175;
                    } else {
                        m2566 = C2105.m6981("ᩴۢ") ^ i17;
                        i = ((m2566 ^ i18) * 3009) ^ (-1197722431);
                        i2 = 1477693540;
                        i20 = m2566 ^ i2;
                        i19 = i;
                    }
                case 687623456:
                case 805073818:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    c19258 = c192583;
                    sArr = sArr4;
                    int i30 = i24;
                    i22 = C2105.m6981(C7106.m19110(sArr, i30, 3, i21));
                    i23 = 2125782631;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        i24 = i30;
                        sArr4 = sArr;
                        c192583 = c19258;
                        m6981 = (C2105.m6981("ᩳۨ") + i18) * 7;
                        i3 = ((m6981 ^ i17) * (-24107)) ^ 138308897;
                        i4 = -783761845;
                        i20 = m6981 ^ i4;
                        z4 = z;
                        i19 = i3;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    } else {
                        m69812 = C2105.m6981("۠᩻") ^ i17;
                        i5 = i30;
                        i6 = ((m69812 ^ i18) * 15155) ^ 2012792190;
                        i7 = -1575518819;
                        sArr4 = sArr;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i5;
                        i20 = m69812 ^ i7;
                        i19 = i6;
                        c192583 = c19258;
                        z4 = z;
                    }
                case 698808121:
                case 800561330:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    sArr = sArr4;
                    i5 = i24;
                    c19258 = c192583;
                    weakReference = f68243;
                    if (weakReference != null) {
                        m69812 = C0630.m2566("᩺۫") ^ i17;
                        i6 = ((m69812 ^ i18) * 21697) ^ 1734688184;
                        i7 = -1438065917;
                        sArr4 = sArr;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i5;
                        i20 = m69812 ^ i7;
                        i19 = i6;
                        c192583 = c19258;
                        z4 = z;
                    }
                    m69812 = (C2105.m6981("᩺֫") ^ i18) * 53;
                    i6 = ((m69812 ^ i17) * (-8519)) ^ 839142113;
                    i7 = 1400684927;
                    sArr4 = sArr;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i5;
                    i20 = m69812 ^ i7;
                    i19 = i6;
                    c192583 = c19258;
                    z4 = z;
                case 852661172:
                case 1917731919:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    sArr = sArr4;
                    i5 = i24;
                    c19258 = c192583;
                    int i31 = (s * s) + 27225;
                    if ((i31 + i31) - (i15 * i15) < 0) {
                        m69812 = (C2105.m6981("ܰᩴ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m69812 ^ i17) * 18915) ^ (-1070724297);
                        i7 = 1595264861;
                    } else {
                        m69812 = C2105.m6981("᩻᩵") ^ i17;
                        i6 = ((m69812 ^ i18) * 3315) ^ (-689535594);
                        i7 = 933704877;
                    }
                    sArr4 = sArr;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i5;
                    i20 = m69812 ^ i7;
                    i19 = i6;
                    c192583 = c19258;
                    z4 = z;
                case 1452299243:
                case 1473568705:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    C3432.m10490(c192583, i22 ^ i23);
                    C3537.m10741(c192583, c211752.f68245);
                    z4 = false;
                    if (C7811.f24123 >= 0) {
                        c192582 = c192583;
                        sArr2 = sArr4;
                        i10 = i24;
                        z2 = false;
                        m69814 = C0630.m2566("᩸ۚ") ^ i17;
                        i19 = ((m69814 ^ i18) * 28961) ^ 1309203538;
                        i11 = 1443094892;
                        int i252222 = m69814 ^ i11;
                        sArr4 = sArr2;
                        c192583 = c192582;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i10;
                        i20 = i252222;
                        z4 = z2;
                        c211752 = c21175;
                    } else {
                        m69813 = C2105.m6981("ܶ֡") ^ i17;
                        i8 = ((m69813 ^ i18) * 397) ^ 1598656109;
                        i9 = 2028542832;
                        i20 = m69813 ^ i9;
                        i19 = i8;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                case 1590436191:
                case 1923410193:
                    dialogInterfaceC02062 = (DialogInterfaceC0206) weakReference.get();
                    if (dialogInterfaceC02062 != null) {
                        m2566 = (i18 - C2105.m6981("ܺ᩵")) * (-67);
                        i = ((m2566 ^ i17) * (-2693)) ^ (-1111926748);
                        i2 = -1138147274;
                        i20 = m2566 ^ i2;
                        i19 = i;
                    } else {
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        z = z4;
                        sArr = sArr4;
                        i5 = i24;
                        c19258 = c192583;
                        m69812 = (C2105.m6981("᩺֫") ^ i18) * 53;
                        i6 = ((m69812 ^ i17) * (-8519)) ^ 839142113;
                        i7 = 1400684927;
                        sArr4 = sArr;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                        i24 = i5;
                        i20 = m69812 ^ i7;
                        i19 = i6;
                        c192583 = c19258;
                        z4 = z;
                    }
                case 1719001995:
                case 1840735749:
                    C1504.m5172(dialogInterfaceC02062);
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    sArr = sArr4;
                    i5 = i24;
                    c19258 = c192583;
                    m69812 = (C2105.m6981("᩺֫") ^ i18) * 53;
                    i6 = ((m69812 ^ i17) * (-8519)) ^ 839142113;
                    i7 = 1400684927;
                    sArr4 = sArr;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
                    i24 = i5;
                    i20 = m69812 ^ i7;
                    i19 = i6;
                    c192583 = c19258;
                    z4 = z;
                default:
                    dialogInterfaceC0206 = dialogInterfaceC02062;
                    z = z4;
                    C0483.m2135(c192583, z);
                    dialogInterfaceOnClickListenerC17646 = new DialogInterfaceOnClickListenerC17646(z ? 1 : 0, runnableC12791);
                    sArr5 = f68244;
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (C0630.m2566("֫۠") ^ i18) * (-17);
                        i3 = ((m6981 ^ i17) * (-31703)) ^ (-1303713905);
                        i4 = 524699651;
                        i20 = m6981 ^ i4;
                        z4 = z;
                        i19 = i3;
                        dialogInterfaceC02062 = dialogInterfaceC0206;
                    }
                    int m256622 = C0630.m2566("ۖ᩸") ^ i18;
                    i19 = ((m256622 ^ i17) * (-23337)) ^ 1295099435;
                    i20 = m256622 ^ (-15586981);
                    z4 = z;
                    dialogInterfaceC02062 = dialogInterfaceC0206;
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48118(C21175 c21175) {
        int m6981;
        int i;
        int i2;
        int m69812;
        int i3;
        short s;
        C21175 c211752 = c21175;
        int i4 = C0422.f1886;
        int i5 = RunnableC0588.f2309;
        int m2566 = (C0630.m2566("᩵᩵") + i5) * 109;
        int i6 = ((m2566 ^ i4) * (-17687)) ^ 1581870995;
        Button button = null;
        String str = null;
        short[] sArr = null;
        int i7 = m2566 ^ (-1501210911);
        C19258 c19258 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1435854139;
        short s2 = 0;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        Object obj = null;
        int i15 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * (-17383)) >> 31));
            switch (i14) {
                case -2084243387:
                case 120978367:
                    C0382.m1849(c19258, C0630.m2566(C3537.m10748(sArr, i12, i13, i11)) ^ 2126724932);
                    if (!C2126.f7087) {
                        m6981 = (i5 - C2105.m6981("᩸۟")) * 7;
                        i = ((m6981 ^ i4) * 17399) ^ 1856540775;
                        i2 = 1952873378;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = (i5 - C0630.m2566("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((m6981 ^ i4) * 16059) ^ (-717808709);
                    i2 = 721535902;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -1984619637:
                case -1524070584:
                    if (C7106.f21815 == 0) {
                        m6981 = C0630.m2566("ۛ֡") ^ i5;
                        i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    } else {
                        m69812 = (i5 - C2105.m6981("ۢ᩻")) * 43;
                        i6 = ((m69812 ^ i4) * (-15479)) ^ (-1653571187);
                        i3 = 840169744;
                        i7 = m69812 ^ i3;
                        c211752 = c21175;
                    }
                case -1712115542:
                case -1034380708:
                    C3663.m11168();
                    m6981 = C0630.m2566("ۛ֡") ^ i5;
                    i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                    i2 = -588464380;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -1637892884:
                case 2102890703:
                    i11 = 43350;
                    m6981 = C2105.m6981("֨ۡ") ^ i4;
                    i = ((m6981 ^ i5) * (-2945)) ^ 1421999372;
                    i2 = 546330958;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -1495221502:
                case 1101735514:
                    C3019.m9252(c19258, c211752.f68245);
                    str = C4616.m13542(f68244, 38, 3, i11);
                    if (C0422.f1886 > 0) {
                        m6981 = C2105.m6981("᩷ۖ") ^ i5;
                        i = ((m6981 ^ i4) * 19291) ^ (-634796654);
                        i2 = 1917282731;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = (i5 - C0630.m2566("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((m6981 ^ i4) * 16059) ^ (-717808709);
                    i2 = 721535902;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -1421950174:
                case -339759813:
                    i15 = 2126477448 ^ C0630.m2566(str);
                    obj = null;
                    if (C0630.f2410 > 0) {
                        m6981 = (C0630.m2566("ۧ۟") ^ i4) * 43;
                        i = ((m6981 ^ i5) * 13679) ^ 497676802;
                        i2 = 1737261879;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = (i5 - C0630.m2566("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((m6981 ^ i4) * 16059) ^ (-717808709);
                    i2 = 721535902;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -1370648988:
                case -281521694:
                    C11340.m28031();
                    if (C3663.m11168() >= 0) {
                        m6981 = C0630.m2566("ۛ֡") ^ i5;
                        i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    } else {
                        s = s2;
                        int m25662 = (C0630.m2566("ۚܶ") + i4) * 71;
                        i7 = m25662 ^ 723838935;
                        s2 = s;
                        i6 = ((m25662 ^ i5) * 5613) ^ 277595554;
                        c211752 = c21175;
                    }
                case -1219686855:
                case 1190587602:
                    C5695.m16017(c19258, 2100374950 ^ i9, obj);
                    dialogInterfaceC0206 = C3683.m11213(c19258);
                    button = C7811.m20839(dialogInterfaceC0206);
                    if (C3537.m10746() > 0) {
                        m6981 = (C2105.m6981("֡ܳ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((m6981 ^ i4) * (-10487)) ^ (-662340866);
                        i2 = -1882727582;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = C0630.m2566("ۛ֡") ^ i5;
                    i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                    i2 = -588464380;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -922703948:
                case 1359094917:
                    int i16 = (s2 * s2) + 231952900;
                    if ((i10 * i10) - (i16 + i16) > 0) {
                        m6981 = (C0630.m2566("ۤۖ") ^ i5) * (-25);
                        i = ((m6981 ^ i4) * (-3113)) ^ 213350181;
                        i2 = -1959858268;
                    } else {
                        m6981 = C2105.m6981("ܶܶ") ^ i4;
                        i = ((m6981 ^ i5) * (-1035)) ^ (-1968008535);
                        i2 = 1901259039;
                    }
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -773211343:
                case 1773751518:
                    i11 = 3805;
                    m6981 = C2105.m6981("֨ۡ") ^ i4;
                    i = ((m6981 ^ i5) * (-2945)) ^ 1421999372;
                    i2 = 546330958;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case -226308830:
                case 1210014276:
                    C1294.m4380(c19258, i15, obj);
                    i9 = C2105.m6981(C1047.m3603(f68244, 41, 3, i11));
                    if (C0237.f1507 == 0) {
                        m6981 = C0630.m2566("֫᩶") ^ i4;
                        i = ((m6981 ^ i5) * (-1511)) ^ (-965765610);
                        i2 = 1578984952;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = C0630.m2566("ۗۤ") ^ i4;
                    i = ((m6981 ^ i5) * (-28813)) ^ (-1851276838);
                    i2 = -1111286108;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case 40868566:
                case 201940722:
                    C3245.m9925();
                    if (C2126.f7087) {
                        m69812 = (i5 - C2105.m6981("ۢ᩻")) * 43;
                        i6 = ((m69812 ^ i4) * (-15479)) ^ (-1653571187);
                        i3 = 840169744;
                        i7 = m69812 ^ i3;
                        c211752 = c21175;
                    } else {
                        m6981 = C0630.m2566("ۗۤ") ^ i4;
                        i = ((m6981 ^ i5) * (-28813)) ^ (-1851276838);
                        i2 = -1111286108;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                case 718044563:
                case 947629174:
                    AbstractActivityC3346 abstractActivityC3346 = c211752.f68246;
                    int i17 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC3346);
                    if (C4263.f13799 > 0) {
                        m6981 = (C0630.m2566("ܰܺ") + i5) * (-97);
                        i = ((m6981 ^ i4) * 1737) ^ 873285772;
                        i2 = -1742038935;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = (i5 - C0630.m2566("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((m6981 ^ i4) * 16059) ^ (-717808709);
                    i2 = 721535902;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case 721944363:
                case 2072599308:
                    s = s2;
                    i10 = s + 15230;
                    if (RunnableC0588.f2309 >= 0) {
                        int m256622 = (C0630.m2566("ۚܶ") + i4) * 71;
                        i7 = m256622 ^ 723838935;
                        s2 = s;
                        i6 = ((m256622 ^ i5) * 5613) ^ 277595554;
                        c211752 = c21175;
                    } else {
                        int m25663 = C0630.m2566("ۡ᩷") ^ i4;
                        i = ((m25663 ^ i5) * 5131) ^ 1244918073;
                        i7 = m25663 ^ 1240041522;
                        c211752 = c21175;
                        s2 = s;
                        i6 = i;
                    }
                case 925958466:
                case 1855788451:
                    s2 = f68244[34];
                    if (RunnableC1108.f4040) {
                        m69812 = (i5 - C2105.m6981("ۙ۟")) * (-43);
                        i6 = ((m69812 ^ i4) * 3549) ^ 471223467;
                        i3 = 1499039729;
                        i7 = m69812 ^ i3;
                        c211752 = c21175;
                    }
                    m69812 = (i5 - C2105.m6981("ۢ᩻")) * 43;
                    i6 = ((m69812 ^ i4) * (-15479)) ^ (-1653571187);
                    i3 = 840169744;
                    i7 = m69812 ^ i3;
                    c211752 = c21175;
                case 1057385614:
                case 1226171284:
                    sArr = f68244;
                    i12 = 35;
                    i13 = 3;
                    if (C3746.f11829 > 0) {
                        m6981 = C0630.m2566("۫۫") ^ i4;
                        i = ((m6981 ^ i5) * (-19497)) ^ (-207213064);
                        i2 = -1691392476;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = C0630.m2566("ۛ֡") ^ i5;
                    i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                    i2 = -588464380;
                    i7 = m6981 ^ i2;
                    i6 = i;
                case 1159174797:
                case 1881839043:
                    C3019.m9255();
                    break;
                case 1913508013:
                case 2070618469:
                    C4159.m12564(button, new ViewOnClickListenerC0775(3, c211752));
                    i8 = R.id.message;
                    if (!C0798.f2919) {
                        m6981 = (C0630.m2566("ۚ᩺") ^ i4) * 61;
                        i = ((m6981 ^ i5) * 21109) ^ (-1641796893);
                        i2 = -1652391266;
                        i7 = m6981 ^ i2;
                        i6 = i;
                    }
                    m6981 = C0630.m2566("ۛ֡") ^ i5;
                    i = ((m6981 ^ i4) * (-2641)) ^ (-1326239306);
                    i2 = -588464380;
                    i7 = m6981 ^ i2;
                    i6 = i;
                default:
                    ((TextView) dialogInterfaceC0206.m1433(i8)).setLineSpacing(0.0f, 1.3f);
                    break;
            }
            return;
        }
    }
}
