package l;

import android.animation.Animator;
import android.view.View;

/* compiled from: F1FO */
/* renamed from: l.᩺ۘۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22742 implements Animator.AnimatorListener {

    /* renamed from: ۢۖ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f73451 = {8983, 29073, 25750, -28805, 1544, 25077, 25082, 25085, 25081, 25077, 25056, 25085, 25083, 25082, 2106, -15341, -15332, -15333, -15329, -15341, -15354, -15333, -15331, -15332, -15341, -15330, -15358, -15334, -15341, 8003, 29482, 29477, 29474, 29478, 29482, 29503, 29474, 29476, 29477, 6089, -6566, -6571, -6574, -6570, -6566, -6577, -6574, -6572, -6571, -17621, 30210, -18729, -6654, -6647, -6646, -6642, -6642, -6653, -6641, -6641, -6642, -6533, -6582, -6582, -6635, -6568, -6572, -6570, -6564, -6562, -6577, -6531, -6583, -6572, -6570, -6536, -6566, -6568, -6573, -6562, -6637, -6635, -6635, -6635, -6638, -6582, -6582, -6556, -6582, -6578, -6571, -6646, -6582, -6582, -6556, -6582, -6578, -6571, -6647, -6648, -6645, -6644, -6653, -6646, -6644, -6645, -6642, -6653, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6535, -6644, -6544, -6646, -6573, -6563, -6544, -6552, -6585, -6578, -6541, -6547, -6581, -6582, -6538, -6645, -6546, -6571, -6578, -6558, -6578, -6573, -6654, -6589, -6546, -6552, -6572, -6542, -6562, -6537, -6642, -6583, -6580, -6539, -6641, -6564, -6566, -6573, -6642, -6642, -6579, -6582, -6582, -6556, -6582, -6578, -6571, -6648, -6647, -6642, -6647, -6647, -6648, -6648, -6653, -6654, -6646, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6580, -6548, -6646, -6564, -6546, -6579, -6563, -6580, -6585, -6648, -6537, -6557, -6536, -6534, -6642, -6578, -6580, -6549, -6591, -6571, -6561, -6574, -6568, -6559, -6654, -6564, -6561, -6645, -6550, -6562, -6584, -6577, -6545, -6539, -6646, -6549, -6539, -6534, -6541, -6546, -6530, -6582, -6582, -6556, -6568, -6573, -6566, -6571, -6571, -6562, -6569, -6641, -6653, -6644, -6647, -6641, -6641, -6648, -6654, -6647, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6581, -6548, -6539, -6557, -6566, -6572, -6566, -6529, -6585, -6531, -6568, -6654, -6544, -6538, -6546, -6545, -6531, -6577, -6583, -6576, -6644, -6568, -6563, -6581, -6570, -6571, -6645, -6535, -6574, -6642, -6641, -6552, -6543, -6540, -6571, -6563, -6531, -6566, -6569, -6568, -6558, 30287, 30480, -19695, 31078, -32185, -25750, -17028, -22211, -28393, -19245, 24726, -16537, 30193, -20427, 26696, -20171, -26674, 26247, 24859, 27114, -26240, -6541, -6549, -6545, -6642, -6647, -6542, -6544, -6530, -6558, -6643, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6581, -6561, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6584, -6636, -6644, -6642, -6642, -6644, -6584, -6579, -6568, -6562, -6572};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f73452;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f73453;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11182 f73454;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0035, code lost:
    
        if (l.C1294.f4556 < 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0056, code lost:
    
        r17 = r2;
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        if (l.C0237.m1481() < 0) goto L14;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationRepeat(android.animation.Animator r19) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22742.onAnimationRepeat(android.animation.Animator):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        if (l.C3537.f11231 < 0) goto L25;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationStart(android.animation.Animator r39) {
        /*
            Method dump skipped, instructions count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22742.onAnimationStart(android.animation.Animator):void");
    }

    public C22742(View view, C11182 c11182, AbstractActivityC3346 abstractActivityC3346) {
        int m6981;
        int i;
        int i2;
        int m69812;
        int i3;
        int i4;
        int i5 = 0;
        String str = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 752868052;
        int i10 = C22628.f73083;
        int i11 = AbstractC2021.f6743;
        short s = f73451[0];
        int i12 = s * 19944;
        int i13 = s + 4986;
        int i14 = i12 - (i13 * i13) <= 0 ? 61390 : 55834;
        int m2566 = C0630.m2566("᩺۫") ^ i10;
        int i15 = ((m2566 ^ i11) * 25437) ^ 1258094125;
        int i16 = m2566 ^ 919717281;
        while (true) {
            i9 = ((((i9 ^ i11) * (-2909)) >> 31) & i15) ^ i16;
            switch (i9) {
                case -1699916463:
                case -605632145:
                    ServiceConnectionC3453.m10564();
                    C2958.m9034();
                    m6981 = (C2105.m6981("᩻ۨ") ^ i10) * 57;
                    i = ((m6981 ^ i11) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -1441790708:
                case -562036475:
                    if (C0237.f1507 != 0) {
                        m69812 = C2105.m6981("ܺ۠") ^ i11;
                        i3 = ((m69812 ^ i10) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i16 = m69812 ^ i4;
                        i15 = i3;
                    } else {
                        m6981 = (C2105.m6981("ۗۧ") + i10) * (-71);
                        i = ((m6981 ^ i11) * (-8007)) ^ (-484604206);
                        i2 = -803472390;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                case -1132147149:
                case 53606643:
                    this.f73454 = c11182;
                    this.f73452 = abstractActivityC3346;
                    if (C3683.f11629 < 0) {
                        m69812 = C2105.m6981("ۤۖ") ^ i11;
                        i3 = ((m69812 ^ i10) * (-20717)) ^ 1578539615;
                        i4 = -54896899;
                        i16 = m69812 ^ i4;
                        i15 = i3;
                    }
                    m69812 = C2105.m6981("ܺ۠") ^ i11;
                    i3 = ((m69812 ^ i10) * 26165) ^ 1323900878;
                    i4 = -1282792683;
                    i16 = m69812 ^ i4;
                    i15 = i3;
                case -1009206533:
                case 1423662694:
                    C7106.m19120();
                    throw new RuntimeException();
                case -998852958:
                case -163043272:
                    if (C5695.f17556 < 0) {
                        m6981 = C0630.m2566("᩸ۙ") ^ i11;
                        i = ((m6981 ^ i10) * (-21203)) ^ (-386481995);
                        i2 = 2016384510;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = C0630.m2566("ۤ۟") ^ i11;
                    i = ((m6981 ^ i10) * (-8657)) ^ 1013093835;
                    i2 = -871954775;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -573069951:
                case 230989675:
                    if (RunnableC1937.m6387() == 0) {
                        m6981 = C2105.m6981("֡ܳ") ^ i10;
                        i = ((m6981 ^ i11) * 443) ^ 881029053;
                        i2 = -809065983;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (i10 - C2105.m6981("ܺܿ")) * (-39);
                    i = ((m6981 ^ i11) * 31739) ^ 1188629612;
                    i2 = -1868061038;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -452188158:
                case -363159955:
                    i6 = C2105.m6981(str);
                    i7 = 2104083186;
                    if (C4075.m12263() > 0) {
                        m6981 = C2105.m6981("ۢ᩵") ^ i11;
                        i = ((m6981 ^ i10) * (-14993)) ^ 1384169459;
                        i2 = 1770877591;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (C2105.m6981("᩻ۨ") ^ i10) * 57;
                    i = ((m6981 ^ i11) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -450868624:
                case 2070556416:
                    C3432.m10477();
                    if (C2105.f7037 != 0) {
                        m6981 = C0630.m2566("ۤ۟") ^ i11;
                        i = ((m6981 ^ i10) * (-8657)) ^ 1013093835;
                        i2 = -871954775;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (C2105.m6981("᩻ۨ") ^ i10) * 57;
                    i = ((m6981 ^ i11) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -427488362:
                case 583026338:
                    C1420.m4913();
                    if (C7811.m20844() == 0) {
                        m6981 = (i10 - C2105.m6981("ܺܿ")) * (-39);
                        i = ((m6981 ^ i11) * 31739) ^ 1188629612;
                        i2 = -1868061038;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (C2105.m6981("᩻ۨ") ^ i10) * 57;
                    i = ((m6981 ^ i11) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -98953596:
                case 780542236:
                    sArr = f73451;
                    if (C0714.f2697 < 0) {
                        m6981 = (i10 - C2105.m6981("ۤܽ")) * 127;
                        i = ((m6981 ^ i11) * 7779) ^ (-918983654);
                        i2 = -1313774779;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (i10 - C2105.m6981("ܺܿ")) * (-39);
                    i = ((m6981 ^ i11) * 31739) ^ 1188629612;
                    i2 = -1868061038;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -98234032:
                case 18497931:
                    if (!C2126.f7087) {
                        m6981 = C0630.m2566("ۙܺ") ^ i11;
                        i = ((m6981 ^ i10) * (-28393)) ^ 311983533;
                        i2 = -1595769798;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (C2105.m6981("᩶ܿ") + i11) * 59;
                    i = ((m6981 ^ i10) * 20071) ^ (-1345117819);
                    i2 = 478724178;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case -62769114:
                case 1452617233:
                    str = C3911.m11919(sArr, i8, 3, i14);
                    if (C1773.f6144 > 0) {
                        m6981 = (C2105.m6981("۟ۖ") + i10) * (-97);
                        i = ((m6981 ^ i11) * (-9571)) ^ (-225195138);
                        i2 = 1907048324;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                    m6981 = (C2105.m6981("᩶ܿ") + i11) * 59;
                    i = ((m6981 ^ i10) * 20071) ^ (-1345117819);
                    i2 = 478724178;
                    i16 = m6981 ^ i2;
                    i15 = i;
                case 176404915:
                case 2018908054:
                    i8 = 1;
                    if (C2272.f7362) {
                        m69812 = C2105.m6981("ܺ۠") ^ i11;
                        i3 = ((m69812 ^ i10) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i16 = m69812 ^ i4;
                        i15 = i3;
                    } else {
                        m6981 = (C2105.m6981("ۘܿ") + i11) * (-95);
                        i = ((m6981 ^ i10) * (-6035)) ^ 2135865506;
                        i2 = 706833164;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
                case 375936675:
                case 2066413041:
                    this.f73453 = C1005.m3507(view, i5);
                    return;
                case 966336719:
                case 1512736892:
                    if (C7811.f24123 >= 0) {
                        m6981 = (C2105.m6981("᩻ۨ") ^ i10) * 57;
                        i = ((m6981 ^ i11) * (-10947)) ^ (-1105405292);
                        i2 = 1026893253;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    } else {
                        m69812 = C2105.m6981("ܺ۠") ^ i11;
                        i3 = ((m69812 ^ i10) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i16 = m69812 ^ i4;
                        i15 = i3;
                    }
                default:
                    i5 = i6 ^ i7;
                    if (C3432.f10845 >= 0) {
                        m69812 = C2105.m6981("ܺ۠") ^ i11;
                        i3 = ((m69812 ^ i10) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i16 = m69812 ^ i4;
                        i15 = i3;
                    } else {
                        m6981 = C2105.m6981("᩺᩶") ^ i10;
                        i = ((m6981 ^ i11) * 23351) ^ (-2066615658);
                        i2 = 1321909294;
                        i16 = m6981 ^ i2;
                        i15 = i;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (l.C0237.m1481() < 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (l.C7106.m19120() <= 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationCancel(android.animation.Animator r21) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22742.onAnimationCancel(android.animation.Animator):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (l.C4117.m12364() != 0) goto L34;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r25) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22742.onAnimationEnd(android.animation.Animator):void");
    }
}
