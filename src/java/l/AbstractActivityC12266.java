package l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* compiled from: Q62Z */
/* renamed from: l.۫۟ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC12266 extends AbstractActivityC3346 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* renamed from: ۜۜܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f36523 = {2107, -26692, -26694, -26711, -26714, -26693, -26632, 3167, 19834, -19102, -17270, 2959, 28667, 28502, -26127, 127, 3324, 7627, 3024, 6947, 6232, 2343, 30256, 30250, 6973, -19625, -19618, -19645, -19629, -19624, -19627, -19602, -19643, -19624, -19647, -19602, -19630, -19623, -19628, -19630, -19622, -19602, -19643, -19645, -19632, -19617, -19646, -19619, -19632, -19643, -19624, -19618, -19617, -19602, -19625, -19618, -19645, -19620, -19632, -19643, -19602, -19630, -19618, -19617, -19643, -19645, -19618, -19619, -10827, -10229, -7689, 9949, -22664, -29216, -19949, 17676, 22151, 21644, 2376, 1430, 11809, -8820, 7664, 706, 12065, -2445, 9564, 4372, 12043, -7360, 8153, -665, -3149, 3239, -7145, -4693, 11427, 3540, 8824, 11404, 10016, 8048, 7273, 4565, 6223, -270, -7033, -15586, -6400, 4045, 1648, 846, -4824, 2557, 5797, -4311, 1744, 5258, -881, -13885, 3240, 24389, -18756, 24551, 20596, -20522, 18390, -18236, -21297, -19017, 18720, -20789, 22996, -18938, 21377, -23668, -17849, 24032, 20305, -19095, 22769, -21248, 25306, 31340, 27051, -23215, -21878, 19329, 13331, 13332, 13313, 13332, 13317, 13359, 13355, 13332, 13330, 13313, 13326, 13331, 13324, 13313, 13332, 13321, 13327, 13326, 13375, 13325, 13327, 13316, 13317, 13375, 13331, 13327, 13330, 13332, 13317, 13316, 161, 24140, -19308, -20369, 22585, -16923, -19562, 28814, 23437, -21786, 370, -3934, -5933, -2828, 6410, -4116, 6495, -13903, -992, -12942, 6010, -15349, 5234, -13315, -7791, 8055, -1423, 611, 4074, -13876, -5833, -13009, 3603, -692, 4987, -14262, -6459, 5403, 6786, -10139, -6120, -13991, -8172, 448, -1529, -13543, 4597, -7493, 5043, 7076, -2761, 4674, -9734, -14477, 6788, -6305, -16154, -5366, -15920, 3171, 2984, 7883, -27056, -27045, -27050, -27056, -27048, -27028, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27051, -27044, -27071, -27042, -27054, -27065, -27028, -27056, -27044, -27043, -27065, -27071, -27044, -27041, -27051, -27044, -27071, -27055, -27046, -27049, -27028, -27065, -27046, -27069, -27028, 7463, 2380, 609, 5670, -12943, 6657, -5878, 4895, -12739, 2429, 700, 4349, 543, -4130, -5468, 5641, 7868, 2241, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27042, -27044, -27049, -27050, -27028, -27072, -27044, -27071, -27065, -27050, -27049, 253, -12654, 5491, 4804, -30134, -30131, -30120, -30131, -30116, -30090, -30094, 1551, 8139, 8132, 8137, 8132, 83, -24172, 24095, -32252};

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36524 = 0;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f36525;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36526;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public String f36527;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36528;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public int f36529;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36530;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int[] f36531;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceOnDismissListenerC5317 f36532;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f36533;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f36534;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f36535;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f36536;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36537;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C19712 f36538;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12971 f36539;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f36540;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C5242 f36541;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36542;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36543;

    /* renamed from: ֫ */
    public abstract void mo19677(RunnableC18617 runnableC18617);

    /* renamed from: ֫ */
    public abstract void mo19678(boolean z);

    /* renamed from: ֫֫ */
    public String mo19679() {
        return null;
    }

    /* renamed from: ۨ */
    public boolean mo19680() {
        return false;
    }

    /* renamed from: ܳ֫ */
    public abstract void mo19681();

    /* renamed from: ܽ */
    public boolean mo19682(String str) {
        return true;
    }

    /* renamed from: ܽ֫ */
    public boolean mo19683() {
        return false;
    }

    /* renamed from: ᩳ */
    public CharSequence mo19685(String str) {
        return str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo29796(int i) {
    }

    /* renamed from: ᩻֫ */
    public boolean mo19687() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (l.C1711.m5736() > 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (l.C3245.f10203 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (l.C4075.f12947 < 0) goto L85;
     */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onItemLongClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (l.RunnableC3474.f10992 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r5 = (l.C2105.m6981("ۨۜ") + r4) * (-91);
        r6 = ((r5 ^ r3) * (-29289)) ^ 670195940;
        r8 = 1526498744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (l.C1294.m4372() <= 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractActivityC12266() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.<init>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (l.C0964.f3626 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (l.C0050.m940() > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0042, code lost:
    
        if (l.C7811.f24123 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0188, code lost:
    
        continue;
     */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m29793() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29793():java.util.List");
    }

    static {
        AbstractC15440 abstractC15440 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1159760954;
        int i7 = C1128.f4106;
        int i8 = C3746.f11829;
        int m2566 = (C0630.m2566("ۛۤ") ^ i8) * (-13);
        int i9 = ((m2566 ^ i7) * (-19207)) ^ 866237809;
        int i10 = 1665997497;
        while (true) {
            i6 = ((((i6 ^ i7) * (-11871)) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -1917890018:
                case 40907422:
                    f36525 = C3663.m11176(abstractC15440, C22628.m50602(sArr2, i4, i5, i3));
                    return;
                case -1912698471:
                case 1495497545:
                    i2 = i * i;
                    s2 = 36096;
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        m2566 = (C2105.m6981("ۜۘ") + i8) * (-79);
                        i9 = ((m2566 ^ i7) * (-6481)) ^ (-720021226);
                        i10 = -199696591;
                    }
                case -1864431450:
                case -483252525:
                    i5 = 6;
                    if (C4263.f13799 <= 0) {
                        m2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    } else {
                        m2566 = (C2105.m6981("ܿۧ") ^ i8) * (-31);
                        i9 = ((m2566 ^ i7) * 7777) ^ (-728105627);
                        i10 = 101487571;
                    }
                case -1766050085:
                case 1793954577:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((m2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩺") ^ i8) * 127;
                        i9 = ((m2566 ^ i7) * 12981) ^ (-1771433130);
                        i10 = 805563330;
                    }
                case -1514235043:
                case -1066182944:
                    sArr = f36523;
                    c = 0;
                    if (C1128.f4106 <= 0) {
                        m2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((m2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        m2566 = (C0630.m2566("ۧܳ") ^ i7) * (-85);
                        i9 = ((m2566 ^ i8) * (-2293)) ^ (-212618402);
                        i10 = -1918724625;
                    }
                case -1508216992:
                case 905623481:
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    } else {
                        m2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((m2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    }
                case -1505638493:
                case 329072830:
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((m2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        m2566 = (C2105.m6981("᩷֨") + i8) * (-97);
                        i9 = ((m2566 ^ i7) * 323) ^ (-641349883);
                        i10 = -510887060;
                    }
                case -1326620288:
                case 995190875:
                    abstractC15440 = C16293.f50117;
                    sArr2 = f36523;
                    if (C7106.m19120() <= 0) {
                        m2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        m2566 = (C0630.m2566("ۖܳ") + i7) * 81;
                        i9 = ((m2566 ^ i8) * (-23393)) ^ (-1860901729);
                        i10 = -1922012804;
                    }
                case -1229580000:
                case 942225761:
                    if (i2 - (s * s2) < 0) {
                        m2566 = C0630.m2566("᩶۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-13179)) ^ (-1501453135);
                        i10 = 825262515;
                    } else {
                        m2566 = (C2105.m6981("ۘܰ") + i7) * 27;
                        i9 = ((m2566 ^ i8) * (-20823)) ^ 2027049039;
                        i10 = -1918137173;
                    }
                case -988907167:
                case -560757112:
                    s = sArr[c];
                    if (C4263.f13799 <= 0) {
                        m2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((m2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        m2566 = (C0630.m2566("۟֡") ^ i8) * (-31);
                        i9 = ((m2566 ^ i7) * 7163) ^ (-69023048);
                        i10 = 1128759285;
                    }
                case -924830062:
                case 2145937087:
                    i = s + 9024;
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((m2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        m2566 = C0630.m2566("᩹ۛ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-25357)) ^ 180982989;
                        i10 = 1369720579;
                    }
                case -703191382:
                case 1475015267:
                    i3 = 16744;
                    m2566 = C0630.m2566("᩸ܺ") ^ i7;
                    i9 = ((m2566 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                case -636418864:
                case 1046502345:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    } else {
                        m2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    }
                case -556258523:
                case -402777178:
                    if (C0382.f1805) {
                        m2566 = (C2105.m6981("ܳ֡") + i8) * (-7);
                        i9 = ((m2566 ^ i7) * (-16523)) ^ (-317515707);
                        i10 = 959977129;
                    } else {
                        m2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((m2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    }
                case -38203752:
                case 154195634:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((m2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۧ᩵")) * 19;
                        i9 = ((m2566 ^ i8) * 24091) ^ (-1585591040);
                        i10 = 2133409062;
                    }
                case 137891527:
                case 2082322127:
                    C4159.m12565();
                    throw new RuntimeException();
                case 326758729:
                case 1806203083:
                    i3 = 38856;
                    m2566 = C0630.m2566("᩸ܺ") ^ i7;
                    i9 = ((m2566 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                case 700190950:
                case 1065067273:
                    i4 = 1;
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((m2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        m2566 = C2105.m6981("᩷۠") ^ i8;
                        i9 = ((m2566 ^ i7) * (-18005)) ^ (-180540231);
                        i10 = -2048371329;
                    }
                default:
                    C4616.m13552();
                    C3746.m11369();
                    m2566 = C2105.m6981("ۛ۫") ^ i7;
                    i9 = ((m2566 ^ i8) * (-10391)) ^ 867913005;
                    i10 = 12374655;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00a3, code lost:
    
        r13 = (r11 - l.C0630.m2566("ۡۘ")) * 57;
        r14 = ((r13 ^ r12) * 11473) ^ 1917421488;
        r15 = 1998905520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r13 = l.C2105.m6981("ܽۢ") ^ r12;
        r14 = ((r13 ^ r11) * (-13303)) ^ (-1613093226);
        r15 = -1359248534;
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0148, code lost:
    
        if (l.C21923.f70183 == 0) goto L30;
     */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.AttributeSet, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r45) {
        /*
            Method dump skipped, instructions count: 3976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0138, code lost:
    
        if (l.C1420.f5096 > 0) goto L14;
     */
    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29792() {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29792():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (l.C1916.f6442 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (l.C11340.m28031() == false) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m29762(l.AbstractActivityC12266 r20) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29762(l.۫۟ܽ):void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int m6981;
        int i2;
        int i3;
        C12951 c12951;
        Exception exc;
        int i4;
        int m69812;
        int i5;
        int i6;
        boolean z = false;
        AbstractC15440 abstractC15440 = null;
        boolean z2 = false;
        Exception exc2 = null;
        C12951 c129512 = null;
        Exception exc3 = null;
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        int i9 = 0;
        int i10 = 121685618;
        int i11 = C2520.f8000;
        int i12 = C4263.f13799;
        int m69813 = (i12 - C2105.m6981("ۤۛ")) * (-19);
        int i13 = ((m69813 ^ i11) * 24609) ^ 172385143;
        int i14 = m69813 ^ (-1914213825);
        ArrayList arrayList = null;
        int i15 = 0;
        while (true) {
            int i16 = i14 ^ (i13 & (((i10 ^ i11) * 23887) >> 31));
            switch (i16) {
                case -1864489758:
                case -430313412:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    short s = f36523[120];
                    if ((s * 10844) - ((s * s) + 29398084) > 0) {
                        m69812 = C0630.m2566("ܽۚ") ^ i11;
                        i5 = ((m69812 ^ i12) * (-3359)) ^ (-1845827602);
                        i6 = 2032960828;
                    } else {
                        m69812 = C2105.m6981("۬ۡ") ^ i12;
                        i5 = ((m69812 ^ i11) * (-3925)) ^ (-816776694);
                        i6 = -675432750;
                    }
                    int i17 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i17;
                    i13 = i5;
                    c129512 = c12951;
                case -1760537428:
                case 603710308:
                    i = i16;
                    mo19681();
                    m6981 = (i12 - C2105.m6981("᩶ܺ")) * (-11);
                    i2 = ((m6981 ^ i11) * 30331) ^ 514195243;
                    i3 = 503200428;
                    int i18 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i18;
                case -1682034042:
                case -471776625:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    i9 = 13408;
                    m69812 = C0630.m2566("۠ۨ") ^ i12;
                    i5 = ((m69812 ^ i11) * 21439) ^ (-1029003607);
                    i6 = -274244047;
                    int i172 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i172;
                    i13 = i5;
                    c129512 = c12951;
                case -1665416758:
                case -617367182:
                    i = i16;
                    if (z3) {
                        m6981 = C2105.m6981("ᩳۘ") ^ i11;
                        i2 = ((m6981 ^ i12) * (-29957)) ^ 62470107;
                        i3 = -1242022256;
                        int i182 = i;
                        i14 = m6981 ^ i3;
                        i13 = i2;
                        i10 = i182;
                    }
                    m6981 = C2105.m6981("۫ۜ") ^ i11;
                    i2 = ((m6981 ^ i12) * (-18225)) ^ 1985938745;
                    i3 = -1119394053;
                    int i1822 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i1822;
                case -1497113343:
                case 203758321:
                    i = i16;
                    C22124.m49722((InterfaceC20008) c129512, -1985229329);
                    this.f36540 = C4263.m12815(c129512);
                    this.f36529 = C2520.m8022(c129512);
                    this.f36533 = C4263.m12815(c129512);
                    this.f36531 = c129512.m31491();
                    this.f36534 = C2520.m8022(c129512);
                    this.f36536 = C2520.m8022(c129512);
                    this.f36543 = C0964.m3406(c129512);
                    this.f36542 = C0964.m3406(c129512);
                    setTitle(c129512.m31506());
                    this.f36527 = c129512.m31503();
                    z3 = this.f36540;
                    m6981 = C0630.m2566("ۡۤ") ^ i12;
                    i2 = ((m6981 ^ i11) * 8757) ^ (-251450861);
                    i3 = -277918599;
                    int i18222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i18222;
                case -1397976478:
                case 776603124:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    if (C1005.m3504(bundle, ServiceConnectionC3453.m10568(f36523, 148, 7, i9))) {
                        m69812 = (C0630.m2566("۬֨") ^ i12) * (-17);
                        i5 = ((m69812 ^ i11) * (-6021)) ^ 1928255210;
                        i6 = 1065616453;
                        int i1722 = m69812 ^ i6;
                        i10 = i4;
                        exc3 = exc;
                        i14 = i1722;
                        i13 = i5;
                        c129512 = c12951;
                    }
                    m69812 = C0630.m2566("ۢ᩹") ^ i11;
                    i5 = ((m69812 ^ i12) * 25045) ^ 1691968835;
                    i6 = -1870470940;
                    int i17222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i17222;
                    i13 = i5;
                    c129512 = c12951;
                case -1351387084:
                case -604263663:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    super.onCreate(bundle);
                    m10214();
                    C4263.m12813(this, C2105.m6981(C0382.m1840(f36523, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i9)) ^ 2125429319);
                    C0964.m3409(this, C0630.m2566(RunnableC0588.m2436(f36523, 124, 3, i9)) ^ 2123953986);
                    C9762 c9762 = (C9762) C4263.m12813(this, C0630.m2566(C1711.m5726(f36523, 127, 3, i9)) ^ 2099836054);
                    this.f10584 = c9762;
                    C2272.m7515(this, c9762);
                    C1773.m5915(this);
                    C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C5211 c5211 = new C5211(this);
                    AbstractC2021.m6565(onBackPressedDispatcher);
                    onBackPressedDispatcher.m28891(c5211);
                    RunnableC3474.m10625(this.f10584, new ViewOnClickListenerC0911(1, this));
                    C19712 c19712 = (C19712) C0964.m3409(this, C2105.m6981(C1773.m5917(f36523, 130, 3, i9)) ^ 2128827711);
                    this.f36538 = c19712;
                    c19712.m45422(C0630.m2566(ViewOnClickListenerC1958.m6435(f36523, 133, 3, i9)) ^ 2130620369, 0);
                    this.f36538.m45422(C0630.m2566(C3683.m11225(f36523, 136, 3, i9)) ^ 2099962074, 0);
                    this.f36538.m45422(C0630.m2566(C3537.m10748(f36523, 139, 3, i9)) ^ 2130322180, 45);
                    this.f36538.m45422(C2105.m6981(C21923.m49334(f36523, 142, 3, i9)) ^ 2118607793, 0);
                    this.f36538.m45422(C2105.m6981(C0798.m3005(f36523, 145, 3, i9)) ^ 2101134825, 0);
                    ListView listView = (ListView) C0964.m3409(this, R.id.list);
                    z = true;
                    listView.setFastScrollEnabled(true);
                    listView.setOnItemClickListener(this);
                    listView.setOnItemLongClickListener(this);
                    C12971 c12971 = new C12971(this);
                    this.f36539 = c12971;
                    listView.setAdapter((ListAdapter) c12971);
                    listView.setOnItemClickListener(this);
                    this.f36532 = new DialogInterfaceOnDismissListenerC5317(this);
                    AbstractC15440 abstractC154402 = f36525;
                    if (bundle != null) {
                        int m2566 = (C0630.m2566("᩻᩵") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        abstractC15440 = abstractC154402;
                        i13 = ((m2566 ^ i12) * 21385) ^ (-958033328);
                        i10 = i4;
                        exc3 = exc;
                        i15 = 0;
                        i14 = m2566 ^ (-1361075364);
                        c129512 = c12951;
                    } else {
                        abstractC15440 = abstractC154402;
                        i15 = 0;
                        m69812 = C0630.m2566("ۢ᩹") ^ i11;
                        i5 = ((m69812 ^ i12) * 25045) ^ 1691968835;
                        i6 = -1870470940;
                        int i172222 = m69812 ^ i6;
                        i10 = i4;
                        exc3 = exc;
                        i14 = i172222;
                        i13 = i5;
                        c129512 = c12951;
                    }
                case -1293579373:
                case -573312168:
                    C2126.m7039(this.f36538, new ViewOnClickListenerC4428(2, this));
                    this.f36538.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡۟ܽ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            AbstractActivityC12266 abstractActivityC12266 = null;
                            int i19 = -239256275;
                            int i20 = C0422.f1886;
                            int i21 = C2958.f9394;
                            int m69814 = C2105.m6981("᩸᩻") ^ i20;
                            int i22 = ((m69814 ^ i21) * (-15945)) ^ 978615468;
                            int i23 = 236945957;
                            while (true) {
                                i19 = ((((i19 ^ i21) * 30577) >> 31) & i22) ^ (m69814 ^ i23);
                                switch (i19) {
                                    case -2035064495:
                                    case 2019208868:
                                        AbstractActivityC12266.m29789(abstractActivityC12266);
                                        return true;
                                    case -1937552691:
                                    case -1303052549:
                                        C7106.m19120();
                                        if (C21923.f70183 != 0) {
                                            m69814 = (C0630.m2566("ۚۜ") + i21) * 41;
                                            i22 = ((m69814 ^ i20) * 28495) ^ 1047601315;
                                            i23 = -1878858944;
                                        } else {
                                            m69814 = (C0630.m2566("ۚ᩺") + i20) * 115;
                                            i22 = ((m69814 ^ i21) * 25843) ^ (-1379540204);
                                            i23 = -1523679696;
                                        }
                                    case -1873167891:
                                    case -120648246:
                                        C4117.m12364();
                                        C1047.m3599();
                                        return false;
                                    case -1758194141:
                                    case 2055009915:
                                        if (C2126.f7087) {
                                            m69814 = (C0630.m2566("ۚۜ") + i21) * 41;
                                            i22 = ((m69814 ^ i20) * 28495) ^ 1047601315;
                                            i23 = -1878858944;
                                        } else {
                                            m69814 = C0630.m2566("ۡ۫") ^ i20;
                                            i22 = ((m69814 ^ i21) * (-32011)) ^ (-371490613);
                                            i23 = -534474015;
                                        }
                                    case -1332750795:
                                    case -258273841:
                                        C2520.m8026();
                                        C1773.m5908();
                                        m69814 = C0630.m2566("ۡ۫") ^ i20;
                                        i22 = ((m69814 ^ i21) * (-32011)) ^ (-371490613);
                                        i23 = -534474015;
                                    case -1313729905:
                                    case 1733885650:
                                        if (C21923.f70183 != 0) {
                                            m69814 = (C2105.m6981("ۚܰ") + i20) * 15;
                                            i22 = ((m69814 ^ i21) * 31799) ^ 1580072180;
                                            i23 = -111771628;
                                        } else {
                                            m69814 = (C0630.m2566("ܽ֫") + i20) * 45;
                                            i22 = ((m69814 ^ i21) * (-1015)) ^ 697981635;
                                            i23 = -1554651008;
                                        }
                                    case -1043063865:
                                    case 2130768362:
                                        if (C3245.f10203 <= 0) {
                                            m69814 = (C0630.m2566("ۚۜ") + i21) * 41;
                                            i22 = ((m69814 ^ i20) * 28495) ^ 1047601315;
                                            i23 = -1878858944;
                                        } else {
                                            m69814 = C2105.m6981("۫ܶ") ^ i21;
                                            i22 = ((m69814 ^ i20) * 9067) ^ 113414837;
                                            i23 = 282403282;
                                        }
                                    case -1026105565:
                                    case 1521484596:
                                        if (C0422.m1963()) {
                                            m69814 = C0630.m2566("ۘ֫") ^ i20;
                                            i22 = ((m69814 ^ i21) * (-25975)) ^ (-1346171712);
                                            i23 = -650149611;
                                        } else {
                                            m69814 = C0630.m2566("ۢܳ") ^ i21;
                                            i22 = ((m69814 ^ i20) * 21641) ^ 189327173;
                                            i23 = 1169018931;
                                        }
                                    case -1023575342:
                                    case -165769050:
                                        abstractActivityC12266 = AbstractActivityC12266.this;
                                        if (C3911.f12484 >= 0) {
                                            m69814 = (C2105.m6981("ۚܰ") + i20) * 15;
                                            i22 = ((m69814 ^ i21) * 31799) ^ 1580072180;
                                            i23 = -111771628;
                                        } else {
                                            m69814 = (C0630.m2566("ܽ۫") + i21) * 81;
                                            i22 = ((m69814 ^ i20) * (-20989)) ^ 1431431337;
                                            i23 = 383989796;
                                        }
                                    case -911791860:
                                    case -459764810:
                                        if (C0382.f1805) {
                                            m69814 = (C0630.m2566("᩷֨") ^ i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i22 = ((m69814 ^ i20) * (-31723)) ^ 1316919771;
                                            i23 = -480380086;
                                        } else {
                                            m69814 = (C0630.m2566("ۚ᩺") + i20) * 115;
                                            i22 = ((m69814 ^ i21) * 25843) ^ (-1379540204);
                                            i23 = -1523679696;
                                        }
                                    case -759497599:
                                    case -398785694:
                                        C11340.m28031();
                                        if (C22628.f73083 > 0) {
                                            m69814 = C0630.m2566("ۡ۫") ^ i20;
                                            i22 = ((m69814 ^ i21) * (-32011)) ^ (-371490613);
                                            i23 = -534474015;
                                        } else {
                                            m69814 = C0630.m2566("ۢܳ") ^ i21;
                                            i22 = ((m69814 ^ i20) * 21641) ^ 189327173;
                                            i23 = 1169018931;
                                        }
                                    case -574169819:
                                    case 36481408:
                                        if (C5695.m16023() >= 0) {
                                            m69814 = (C0630.m2566("ۚۜ") + i21) * 41;
                                            i22 = ((m69814 ^ i20) * 28495) ^ 1047601315;
                                            i23 = -1878858944;
                                        } else {
                                            m69814 = (C2105.m6981("ܳۨ") ^ i21) * 25;
                                            i22 = ((m69814 ^ i20) * (-22933)) ^ (-549357717);
                                            i23 = 349135620;
                                        }
                                    case -436787474:
                                    case 71723044:
                                        if (C0050.f910 >= 0) {
                                            m69814 = (C2105.m6981("ۚܰ") + i20) * 15;
                                            i22 = ((m69814 ^ i21) * 31799) ^ 1580072180;
                                            i23 = -111771628;
                                        } else {
                                            m69814 = (C2105.m6981("ܶ᩹") ^ i20) * (-111);
                                            i22 = ((m69814 ^ i21) * (-765)) ^ (-1570507925);
                                            i23 = -214453520;
                                        }
                                    case -206954027:
                                    case 1141766654:
                                        if (C3683.m11222()) {
                                            m69814 = (C0630.m2566("ۚ᩺") + i20) * 115;
                                            i22 = ((m69814 ^ i21) * 25843) ^ (-1379540204);
                                            i23 = -1523679696;
                                        } else {
                                            m69814 = (C0630.m2566("֫ۗ") ^ i21) * (-105);
                                            i22 = ((m69814 ^ i20) * (-22229)) ^ (-1186823943);
                                            i23 = -984368542;
                                        }
                                    case 385322535:
                                    case 1033063176:
                                        if (C2126.m7040()) {
                                            m69814 = (C2105.m6981("ۚܰ") + i20) * 15;
                                            i22 = ((m69814 ^ i21) * 31799) ^ 1580072180;
                                            i23 = -111771628;
                                        } else {
                                            m69814 = C2105.m6981("֫ܳ") ^ i20;
                                            i22 = ((m69814 ^ i21) * 13469) ^ 1844301027;
                                            i23 = 449272937;
                                        }
                                    default:
                                        if (C1916.f6442) {
                                            m69814 = C2105.m6981("᩻ۡ") ^ i20;
                                            i22 = ((m69814 ^ i21) * 21019) ^ 1274766939;
                                            i23 = -347973358;
                                        } else {
                                            m69814 = (C0630.m2566("ۚ᩺") + i20) * 115;
                                            i22 = ((m69814 ^ i21) * 25843) ^ (-1379540204);
                                            i23 = -1523679696;
                                        }
                                }
                            }
                        }
                    });
                    break;
                case -1168654871:
                case 135129387:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    if (C3245.m9926(abstractC15440)) {
                        m69812 = (C2105.m6981("ܽۗ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((m69812 ^ i12) * 31877) ^ 380135518;
                        i6 = 1614262775;
                        int i1722222 = m69812 ^ i6;
                        i10 = i4;
                        exc3 = exc;
                        i14 = i1722222;
                        i13 = i5;
                        c129512 = c12951;
                    }
                    m69812 = C0630.m2566("ۢ᩹") ^ i11;
                    i5 = ((m69812 ^ i12) * 25045) ^ 1691968835;
                    i6 = -1870470940;
                    int i17222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i17222222;
                    i13 = i5;
                    c129512 = c12951;
                case -1092153279:
                case 10710186:
                    i4 = i16;
                    c12951 = c129512;
                    exc = exc3;
                    this.f36526 = C0964.m3400(ApplicationC20075.f65008, C1773.m5917(f36523, 155, 23, i9), z);
                    m69812 = (C2105.m6981("۬ܺ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i5 = ((m69812 ^ i11) * 21789) ^ (-1466083373);
                    i6 = 1319983687;
                    int i172222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i172222222;
                    i13 = i5;
                    c129512 = c12951;
                case -989559803:
                case -246191146:
                    i = i16;
                    c129512 = C12951.m31485(C1294.m4379(abstractC15440));
                    i7 = C2520.m8022(c129512);
                    try {
                        arrayList = new ArrayList(i7);
                        this.f36537 = arrayList;
                        this.f36528 = arrayList;
                        i8 = i15;
                        m6981 = (i11 - C2105.m6981("᩷ۖ")) * (-99);
                        i2 = ((m6981 ^ i12) * 31899) ^ (-961042540);
                        i3 = 1781974962;
                    } catch (Exception e) {
                        exc3 = e;
                        arrayList = null;
                        m6981 = C2105.m6981("᩺ᩴ") ^ i11;
                        i2 = ((m6981 ^ i12) * 9159) ^ 343925359;
                        i3 = -248277778;
                        int i182222 = i;
                        i14 = m6981 ^ i3;
                        i13 = i2;
                        i10 = i182222;
                    }
                    int i1822222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i1822222;
                case -921871005:
                case 455526247:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    z2 = false;
                    m69812 = C2105.m6981("᩻ܶ") ^ i12;
                    i5 = ((m69812 ^ i11) * (-29487)) ^ (-1626045139);
                    i6 = -895396323;
                    int i1722222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i1722222222;
                    i13 = i5;
                    c129512 = c12951;
                case -879494267:
                case 2056524672:
                    m10224(exc3, z);
                    break;
                case -635138454:
                case 933553617:
                    m10224(exc2, z);
                    break;
                case -253916616:
                case 1607193293:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    if (z2) {
                        m69812 = (i11 - C2105.m6981("᩵᩹")) * 127;
                        i5 = ((m69812 ^ i12) * (-5501)) ^ (-417710661);
                        i6 = -1270336122;
                    } else {
                        m69812 = C0630.m2566("ۤܳ") ^ i12;
                        i5 = ((m69812 ^ i11) * (-32147)) ^ 985636095;
                        i6 = 396826243;
                    }
                    int i17222222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i17222222222;
                    i13 = i5;
                    c129512 = c12951;
                case -225924523:
                case 1272429722:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    i9 = 17773;
                    m69812 = C0630.m2566("۠ۨ") ^ i12;
                    i5 = ((m69812 ^ i11) * 21439) ^ (-1029003607);
                    i6 = -274244047;
                    int i172222222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i172222222222;
                    i13 = i5;
                    c129512 = c12951;
                case -77065209:
                case 1787829154:
                    i = i16;
                    C1916.m6307(arrayList, new C8739(c129512));
                    m6981 = C2105.m6981("۠ۗ") ^ i11;
                    i2 = ((m6981 ^ i12) * 21707) ^ 1859825927;
                    i3 = -672163135;
                    int i18222222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i18222222;
                case -56960567:
                case 1048039853:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    z2 = true;
                    m69812 = C2105.m6981("᩻ܶ") ^ i12;
                    i5 = ((m69812 ^ i11) * (-29487)) ^ (-1626045139);
                    i6 = -895396323;
                    int i1722222222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i1722222222222;
                    i13 = i5;
                    c129512 = c12951;
                case -39333100:
                case -16891090:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    try {
                        mo19678(z2);
                        m69812 = C2105.m6981("᩷۫") ^ i11;
                        i5 = ((m69812 ^ i12) * 9995) ^ (-1297474455);
                        i6 = -440956805;
                        int i17222222222222 = m69812 ^ i6;
                        i10 = i4;
                        exc3 = exc;
                        i14 = i17222222222222;
                    } catch (Exception e2) {
                        int m25662 = C0630.m2566("ۤܰ") ^ i12;
                        i5 = ((m25662 ^ i11) * 32145) ^ 473533195;
                        i10 = i4;
                        exc3 = exc;
                        i14 = m25662 ^ 66588725;
                        exc2 = e2;
                    }
                    i13 = i5;
                    c129512 = c12951;
                case 424661945:
                case 1046465537:
                    try {
                        this.f36538.m45419();
                        i = i16;
                        m6981 = C2105.m6981("۫ۜ") ^ i11;
                        i2 = ((m6981 ^ i12) * (-18225)) ^ 1985938745;
                        i3 = -1119394053;
                    } catch (Exception e3) {
                        exc3 = e3;
                        i = i16;
                        m6981 = C2105.m6981("᩺ᩴ") ^ i11;
                        i2 = ((m6981 ^ i12) * 9159) ^ 343925359;
                        i3 = -248277778;
                        int i182222222 = i;
                        i14 = m6981 ^ i3;
                        i13 = i2;
                        i10 = i182222222;
                    }
                    int i1822222222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i1822222222;
                case 678459044:
                case 920876030:
                    try {
                        i = i16;
                        try {
                            this.f36541.mo1669(C3245.m9921(this.f36540));
                            m29792();
                            m6981 = (i12 - C2105.m6981("᩶ܺ")) * (-11);
                            i2 = ((m6981 ^ i11) * 30331) ^ 514195243;
                            i3 = 503200428;
                        } catch (Exception e4) {
                            e = e4;
                            exc3 = e;
                            m6981 = C2105.m6981("᩺ᩴ") ^ i11;
                            i2 = ((m6981 ^ i12) * 9159) ^ 343925359;
                            i3 = -248277778;
                            int i18222222222 = i;
                            i14 = m6981 ^ i3;
                            i13 = i2;
                            i10 = i18222222222;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = i16;
                    }
                    int i182222222222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i182222222222;
                case 1119097002:
                case 1846573947:
                    c12951 = c129512;
                    exc = exc3;
                    i4 = i16;
                    if (mo19683()) {
                        m69812 = C2105.m6981("ܳۙ") ^ i11;
                        i5 = ((m69812 ^ i12) * (-4013)) ^ 45527141;
                        i6 = 893599251;
                        int i172222222222222 = m69812 ^ i6;
                        i10 = i4;
                        exc3 = exc;
                        i14 = i172222222222222;
                        i13 = i5;
                        c129512 = c12951;
                    }
                    m69812 = (C2105.m6981("۬ܺ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i5 = ((m69812 ^ i11) * 21789) ^ (-1466083373);
                    i6 = 1319983687;
                    int i1722222222222222 = m69812 ^ i6;
                    i10 = i4;
                    exc3 = exc;
                    i14 = i1722222222222222;
                    i13 = i5;
                    c129512 = c12951;
                case 1789966163:
                case 1874241652:
                    i = i16;
                    if (i8 < i7) {
                        m6981 = (C2105.m6981("۬᩺") ^ i12) * 7;
                        i2 = ((m6981 ^ i11) * 12857) ^ 1181271627;
                        i3 = 68809384;
                    } else {
                        m6981 = C2105.m6981("᩷᩵") ^ i12;
                        i2 = ((m6981 ^ i11) * (-8345)) ^ 1719209950;
                        i3 = 947551495;
                    }
                    int i1822222222222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i1822222222222;
                default:
                    i = i16;
                    i8++;
                    m6981 = (i11 - C2105.m6981("᩷ۖ")) * (-99);
                    i2 = ((m6981 ^ i12) * 31899) ^ (-961042540);
                    i3 = 1781974962;
                    int i18222222222222 = i;
                    i14 = m6981 ^ i3;
                    i13 = i2;
                    i10 = i18222222222222;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
    
        if (l.C22628.f73083 > 0) goto L16;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r27v54 */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m29781(AbstractActivityC12266 abstractActivityC12266) {
        int m2566;
        int i;
        int i2;
        boolean z;
        short[] sArr;
        int m25662;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int m25663;
        int i6;
        int i7;
        int m6981;
        int i8;
        int i9;
        int i10 = C2167.f7158;
        int i11 = C0714.f2697;
        int m69812 = (i10 - C2105.m6981("ۛۗ")) * (-53);
        int i12 = ((m69812 ^ i11) * 23775) ^ 2009327530;
        Iterator it = null;
        ArrayList arrayList2 = null;
        String str = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i13 = m69812 ^ (-2030129400);
        boolean z2 = false;
        boolean z3 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i20 = 0;
        short s3 = 0;
        int i21 = 0;
        int i22 = 0;
        ?? r27 = 0;
        int i23 = -749235298;
        Iterator it2 = null;
        ArrayList arrayList3 = null;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i23 = i13 ^ (i12 & (((i23 ^ i11) * 31603) >> 31));
            switch (i23) {
                case -2123493403:
                case -112572009:
                    z = r27;
                    sArr = sArr4;
                    int i26 = i21;
                    arrayList = arrayList3;
                    i5 = i26;
                    if (z != z3) {
                        m25663 = C2105.m6981("ۚᩴ") ^ i11;
                        i6 = ((m25663 ^ i10) * (-22859)) ^ 266570757;
                        i7 = -1763244042;
                    } else {
                        m25663 = (C0630.m2566("ܶ۫") ^ i10) * (-115);
                        i6 = ((m25663 ^ i11) * 29135) ^ (-1829805591);
                        i7 = 1809731803;
                    }
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList4 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList4;
                case -2089616783:
                case -1798906673:
                    z = r27;
                    sArr = sArr4;
                    int i27 = i21;
                    arrayList = arrayList3;
                    i5 = i27;
                    int i28 = s + s2;
                    i20 = i28 * i28;
                    s3 = 54596;
                    if (C7811.f24123 < 0) {
                        m25663 = C0630.m2566("ۙ᩺") ^ i11;
                        i6 = ((m25663 ^ i10) * (-10141)) ^ (-483554685);
                        i7 = 1412560304;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42;
                    }
                    m25663 = (C0630.m2566("ܿۨ") + i10) * (-73);
                    i6 = ((m25663 ^ i11) * 20321) ^ (-1244896121);
                    i7 = 342610518;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList422 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422;
                case -2061587743:
                case -2017670874:
                    z = r27;
                    sArr = sArr4;
                    int i29 = i21;
                    arrayList = arrayList3;
                    i5 = i29;
                    sArr2 = f36523;
                    c = 'G';
                    if (C0964.f3626 == 0) {
                        m25663 = (i10 - C0630.m2566("ܿۘ")) * (-13);
                        i6 = ((m25663 ^ i11) * (-11917)) ^ 1508421892;
                        i7 = -1451074624;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222;
                    }
                    m25663 = (C0630.m2566("ۚ᩵") + i11) * 13;
                    i6 = ((m25663 ^ i10) * 85) ^ (-756712849);
                    i7 = -1314311422;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList42222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList42222;
                case -2042885163:
                case -1486383126:
                    z = r27;
                    sArr = sArr4;
                    int i30 = i21;
                    arrayList = arrayList3;
                    i5 = i30;
                    i14 = 55380;
                    m25663 = C0630.m2566("ۤۛ") ^ i11;
                    i6 = ((m25663 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList422222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422222;
                case -1990189670:
                case -161019158:
                    z = r27;
                    sArr = sArr4;
                    int i31 = i21;
                    arrayList = arrayList3;
                    i5 = i31;
                    i14 = 52386;
                    m25663 = C0630.m2566("ۤۛ") ^ i11;
                    i6 = ((m25663 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList4222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList4222222;
                case -1969147071:
                case -629276308:
                    z = r27;
                    sArr = sArr4;
                    int i32 = i21;
                    arrayList = arrayList3;
                    i5 = i32;
                    if (i20 - (s * s3) >= 0) {
                        m25663 = C0630.m2566("ܳۡ") ^ i10;
                        i6 = ((m25663 ^ i11) * (-9255)) ^ 100921298;
                        i7 = 1600807421;
                    } else {
                        m25663 = (C2105.m6981("ۢ۠") + i10) * 69;
                        i6 = ((m25663 ^ i11) * 6725) ^ (-997189699);
                        i7 = 502218606;
                    }
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList42222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList42222222;
                case -1950791782:
                case 801942243:
                    C2272.m7503();
                    if (C1294.f4556 >= 0) {
                        m2566 = C2105.m6981("֡ᩴ") ^ i11;
                        i = ((m2566 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    } else {
                        z = r27;
                        sArr = sArr4;
                        m25662 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((m25662 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    }
                case -1930074187:
                case 971967464:
                    if (C0630.m2564()) {
                        z = r27;
                        sArr = sArr4;
                        m25662 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((m25662 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    } else {
                        m2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((m2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                case -1913885805:
                case -991689722:
                    RunnableC1108.m3790();
                    if (C0050.f910 < 0) {
                        m2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((m2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    } else {
                        z = r27;
                        sArr = sArr4;
                        int i33 = i21;
                        arrayList = arrayList3;
                        i5 = i33;
                        m25663 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((m25663 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList422222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList422222222;
                    }
                case -1825267265:
                case 144964289:
                    break;
                case -1648792269:
                case 618935764:
                    z = r27;
                    sArr = sArr4;
                    int i34 = i21;
                    arrayList = arrayList3;
                    i5 = i34;
                    int i35 = i22;
                    if (i35 < abstractActivityC12266.f36534) {
                        m25663 = C2105.m6981("ۗܿ") ^ i11;
                        i22 = i35;
                        i6 = ((m25663 ^ i10) * (-5529)) ^ 1430353853;
                        i7 = 779720154;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222;
                    } else {
                        i22 = i35;
                        m25663 = C0630.m2566("ۙܰ") ^ i10;
                        i6 = ((m25663 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42222222222;
                    }
                case -1624901601:
                case 1595879092:
                    abstractActivityC12266.m29780(z3);
                    abstractActivityC12266.f36539.notifyDataSetChanged();
                    break;
                case -1607052145:
                case 737240183:
                    z = r27;
                    sArr = sArr4;
                    ArrayList arrayList5 = abstractActivityC12266.f36537;
                    i21 = abstractActivityC12266.f36531[i22];
                    if (C1005.f3721) {
                        int m25664 = C0630.m2566("۫ۨ") ^ i10;
                        arrayList3 = arrayList5;
                        i12 = ((m25664 ^ i11) * (-1127)) ^ 657319183;
                        i13 = m25664 ^ (-1380477793);
                        sArr4 = sArr;
                        r27 = z;
                    } else {
                        arrayList3 = arrayList5;
                        m25662 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((m25662 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    }
                case -1557778784:
                case 321280788:
                    i17 = i18 ^ 2130322989;
                    sArr4 = f36523;
                    if (C22628.f73083 > 0) {
                        m2566 = (C0630.m2566("ᩴܰ") + i10) * (-13);
                        i = ((m2566 ^ i11) * 5871) ^ 1432856957;
                        i2 = -1182831524;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = (C2105.m6981("ܺۗ") + i11) * 101;
                    i = ((m2566 ^ i10) * 19637) ^ 756170748;
                    i2 = 2036093383;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -1552481460:
                case 310104399:
                    if (C5695.f17556 < 0) {
                        m2566 = C2105.m6981("ۧ᩷") ^ i11;
                        i = ((m2566 ^ i10) * (-26669)) ^ 1885452994;
                        i2 = 1781057980;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                    i = ((m2566 ^ i11) * 12615) ^ (-1692139109);
                    i2 = 2119147079;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -1427923611:
                case 1261375080:
                    if (((C8739) RunnableC1108.m3791(it)).m22602()) {
                        m2566 = C0630.m2566("ۡܽ") ^ i10;
                        i = ((m2566 ^ i11) * 32283) ^ 934619083;
                        i2 = 466063929;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    } else {
                        z = r27;
                        sArr = sArr4;
                        m25662 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                        i3 = ((m25662 ^ i10) * 9391) ^ (-405813789);
                        i4 = 515928501;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    }
                case -1404070249:
                case 1554979506:
                    z = r27;
                    sArr = sArr4;
                    abstractActivityC12266.f36529 += z3 ? 1 : 0;
                    int i36 = i21;
                    arrayList = arrayList3;
                    i5 = i36;
                    m25663 = (i11 - C0630.m2566("֫ۢ")) * 99;
                    i6 = ((m25663 ^ i10) * (-6443)) ^ (-1096112717);
                    i7 = -1204488943;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList422222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422222222222;
                case -1367618891:
                case -82745241:
                    if (C11340.m28031()) {
                        z = r27;
                        sArr = sArr4;
                        int i37 = i21;
                        arrayList = arrayList3;
                        i5 = i37;
                        m25663 = (C0630.m2566("ۚ᩵") + i11) * 13;
                        i6 = ((m25663 ^ i10) * 85) ^ (-756712849);
                        i7 = -1314311422;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222222;
                    } else {
                        m2566 = C2105.m6981("֡ᩴ") ^ i11;
                        i = ((m2566 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                case -1335588413:
                case 948150132:
                    z = r27;
                    sArr = sArr4;
                    i22++;
                    int i38 = i21;
                    arrayList = arrayList3;
                    i5 = i38;
                    m25663 = (C2105.m6981("֨ۧ") + i11) * 71;
                    i6 = ((m25663 ^ i10) * (-29461)) ^ 1064557393;
                    i7 = 1556544592;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList42222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList42222222222222;
                case -1261063141:
                case -1217422293:
                    abstractActivityC12266.f36532.m15259();
                    break;
                case -1245636293:
                case 568629844:
                    abstractActivityC12266.f36529 += z3 ? 1 : 0;
                    z = r27;
                    sArr = sArr4;
                    int i39 = i21;
                    arrayList = arrayList3;
                    i5 = i39;
                    m25663 = (C2105.m6981("᩶ܺ") + i11) * 101;
                    i6 = ((m25663 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList422222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422222222222222;
                case -1230250035:
                case 1556886373:
                    RunnableC1937.m6387();
                    if (C4616.f14690 <= 0) {
                        m2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((m2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    } else {
                        z = r27;
                        sArr = sArr4;
                        int i40 = i21;
                        arrayList = arrayList3;
                        i5 = i40;
                        m25663 = (C0630.m2566("ܿۨ") + i10) * (-73);
                        i6 = ((m25663 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222222222;
                    }
                case -1211620831:
                case 413725489:
                    z = r27;
                    sArr = sArr4;
                    int i41 = i21;
                    arrayList = arrayList3;
                    i5 = i41;
                    if (z != 2) {
                        m25663 = C0630.m2566("ܶ᩻") ^ i10;
                        i6 = ((m25663 ^ i11) * 28387) ^ (-397102967);
                        i7 = -256858175;
                    } else {
                        m25663 = (C0630.m2566("֨᩸") ^ i11) * (-45);
                        i6 = ((m25663 ^ i10) * (-31013)) ^ 1805882866;
                        i7 = 1118531432;
                    }
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList42222222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList42222222222222222;
                case -1185109089:
                case 297438886:
                    abstractActivityC12266.m29780(abstractActivityC12266.f36538.m45423());
                    break;
                case -1095213586:
                case 870679910:
                    abstractActivityC12266.m29780(z3);
                    abstractActivityC12266.f36539.notifyDataSetChanged();
                    break;
                case -1089149937:
                case 736375744:
                    i19 = C2105.m6981(str);
                    if (C4075.f12947 < 0) {
                        m2566 = (C2105.m6981("ܽܿ") + i11) * 73;
                        i = ((m2566 ^ i10) * (-23145)) ^ (-281406979);
                        i2 = -1851183652;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = C2105.m6981("֡᩶") ^ i10;
                    i = ((m2566 ^ i11) * 11239) ^ (-1814476169);
                    i2 = 498221269;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -1030634909:
                case 1461527253:
                    abstractActivityC12266.f36529 += z3 ? 1 : 0;
                    z = r27;
                    sArr = sArr4;
                    m25662 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                    i3 = ((m25662 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case -963476798:
                case -299226483:
                    if (((C8739) C3019.m9263(arrayList2, i16)).m22602()) {
                        m2566 = (C2105.m6981("᩵ۗ") + i10) * 93;
                        i = ((m2566 ^ i11) * 15753) ^ 66205015;
                        i2 = -1117094625;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = C2105.m6981("᩺ۤ") ^ i11;
                    i = ((m2566 ^ i10) * (-16889)) ^ (-1544940840);
                    i2 = -403827462;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -947896077:
                case 904948844:
                    z = r27;
                    sArr = sArr4;
                    int i42 = i21;
                    arrayList = arrayList3;
                    i5 = i42;
                    abstractActivityC12266.f36529 = z2 ? 1 : 0;
                    if (abstractActivityC12266.f36533) {
                        m25663 = (C2105.m6981("ᩴܳ") + i10) * 115;
                        i6 = ((m25663 ^ i11) * (-19495)) ^ 1375116752;
                        i7 = 1888588920;
                    } else {
                        m25663 = C0630.m2566("ܶ֨") ^ i11;
                        i6 = ((m25663 ^ i10) * (-31443)) ^ (-6631949);
                        i7 = -66349754;
                    }
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList422222222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422222222222222222;
                case -906204756:
                case -402722955:
                    z = r27;
                    sArr = sArr4;
                    if (C1773.m5910(it)) {
                        m25662 = C2105.m6981("ܰܽ") ^ i11;
                        i3 = ((m25662 ^ i10) * (-12565)) ^ 497280671;
                        i4 = 615276917;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    }
                    m25662 = C0630.m2566("᩸᩷") ^ i10;
                    i3 = ((m25662 ^ i11) * 30347) ^ (-687382957);
                    i4 = -1629408634;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case -889449022:
                case -463002671:
                    if (!C1504.f5354) {
                        m2566 = (C2105.m6981("֨ۢ") ^ i10) * 49;
                        i = ((m2566 ^ i11) * (-12307)) ^ (-2139344709);
                        i2 = -863503220;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                    i = ((m2566 ^ i11) * 12615) ^ (-1692139109);
                    i2 = 2119147079;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -742062553:
                case 1986608645:
                    z = r27;
                    sArr = sArr4;
                    i15 = 0;
                    m25662 = (C2105.m6981("֫ܳ") ^ i10) * (-7);
                    i3 = ((m25662 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case -721873149:
                case 1498941853:
                    arrayList2 = abstractActivityC12266.f36537;
                    i16 = abstractActivityC12266.f36531[i15];
                    if (C2167.f7158 < 0) {
                        m2566 = C2105.m6981("ᩴ۬") ^ i11;
                        i = ((m2566 ^ i10) * (-18149)) ^ (-513897506);
                        i2 = 1617300072;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = C2105.m6981("֡᩶") ^ i10;
                    i = ((m2566 ^ i11) * 11239) ^ (-1814476169);
                    i2 = 498221269;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -705199057:
                case -286113175:
                    C1420.m4913();
                    C3537.m10746();
                    m2566 = C2105.m6981("֡ᩴ") ^ i11;
                    i = ((m2566 ^ i10) * (-30359)) ^ (-2138438129);
                    i2 = -1742244562;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -649006062:
                case 1326419034:
                    str = C0237.m1483(sArr4, 75, 3, i14);
                    if (C1128.f4106 > 0) {
                        m2566 = (i10 - C0630.m2566("ۙ᩸")) * 101;
                        i = ((m2566 ^ i11) * (-3499)) ^ 939789785;
                        i2 = -1792857501;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                    m2566 = (C2105.m6981("ܺۗ") + i11) * 101;
                    i = ((m2566 ^ i10) * 19637) ^ 756170748;
                    i2 = 2036093383;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case -597085923:
                case 1960953316:
                    ArrayList arrayList6 = arrayList3;
                    z = r27;
                    sArr = sArr4;
                    int i43 = i21;
                    arrayList = arrayList6;
                    if (((C8739) C3019.m9263(arrayList6, i43)).m22596(z3)) {
                        m25663 = C0630.m2566("ۙ֡") ^ i10;
                        i5 = i43;
                        i6 = ((m25663 ^ i11) * 7737) ^ (-1424100386);
                        i7 = -2047258756;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222222222222;
                    } else {
                        i5 = i43;
                        m25663 = (i11 - C0630.m2566("֫ۢ")) * 99;
                        i6 = ((m25663 ^ i10) * (-6443)) ^ (-1096112717);
                        i7 = -1204488943;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42222222222222222222;
                    }
                case -577244994:
                case 834727469:
                    short[] sArr5 = sArr4;
                    int i44 = i21;
                    arrayList = arrayList3;
                    i5 = i44;
                    int m45427 = abstractActivityC12266.f36538.m45427();
                    z2 = false;
                    z3 = true;
                    if (m45427 != 0) {
                        m6981 = (C2105.m6981("ܳܰ") ^ i10) * 95;
                        i8 = ((m6981 ^ i11) * 1513) ^ (-130103798);
                        i9 = 1583073842;
                    } else {
                        m6981 = C2105.m6981("ۨ᩷") ^ i11;
                        i8 = ((m6981 ^ i10) * (-30907)) ^ (-1554136896);
                        i9 = -1405555182;
                    }
                    i13 = m6981 ^ i9;
                    sArr4 = sArr5;
                    r27 = m45427;
                    i12 = i8;
                    ArrayList arrayList422222222222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList422222222222222222222;
                case -373293167:
                case 702992866:
                    z = r27;
                    sArr = sArr4;
                    if (z != 3) {
                        m25662 = C2105.m6981("ۗ᩶") ^ i11;
                        i3 = ((m25662 ^ i10) * 20093) ^ 1708305681;
                        i4 = -711380851;
                    } else {
                        m25662 = C0630.m2566("ۖ۟") ^ i11;
                        i3 = ((m25662 ^ i10) * 21555) ^ (-1527540730);
                        i4 = 958422271;
                    }
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case -181699517:
                case -81103479:
                    z = r27;
                    sArr = sArr4;
                    if (i15 < abstractActivityC12266.f36534) {
                        m25662 = (i10 - C2105.m6981("֡۫")) * 9;
                        i3 = ((m25662 ^ i11) * 24161) ^ 1246132863;
                        i4 = -44268287;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    }
                    m25662 = C0630.m2566("᩸᩷") ^ i10;
                    i3 = ((m25662 ^ i11) * 30347) ^ (-687382957);
                    i4 = -1629408634;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case -110666044:
                case 578225280:
                    z = r27;
                    sArr = sArr4;
                    int i45 = i21;
                    arrayList = arrayList3;
                    i5 = i45;
                    abstractActivityC12266.f36529 = z2 ? 1 : 0;
                    if (abstractActivityC12266.f36533) {
                        i22 = z2 ? 1 : 0;
                        m25663 = (C2105.m6981("֨ۧ") + i11) * 71;
                        i6 = ((m25663 ^ i10) * (-29461)) ^ 1064557393;
                        i7 = 1556544592;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222222222222222;
                    } else {
                        m25663 = C2105.m6981("ۗ۫") ^ i10;
                        i6 = ((m25663 ^ i11) * 12859) ^ 653536617;
                        i7 = -723772992;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42222222222222222222222;
                    }
                case -11454214:
                case 1932649142:
                    i18 = C2105.m6981(RunnableC1108.m3789(sArr3, i24, i25, i14));
                    if (C3537.f11231 >= 0) {
                        z = r27;
                        sArr = sArr4;
                        int i402 = i21;
                        arrayList = arrayList3;
                        i5 = i402;
                        m25663 = (C0630.m2566("ܿۨ") + i10) * (-73);
                        i6 = ((m25663 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList422222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList422222222222222222222222;
                    } else {
                        m2566 = (C0630.m2566("᩹ܰ") ^ i11) * (-23);
                        i = ((m2566 ^ i10) * 1925) ^ (-317538984);
                        i2 = -1810966406;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                case 25673140:
                case 100065093:
                    abstractActivityC12266.m29780(z2);
                    break;
                case 91837099:
                case 676919953:
                    abstractActivityC12266.m10217(i17, i19 ^ 2104653483, z2);
                    break;
                case 227168018:
                case 682312654:
                    z = r27;
                    sArr = sArr4;
                    int i46 = i21;
                    arrayList = arrayList3;
                    i5 = i46;
                    it2 = C2958.m9029(abstractActivityC12266.f36537);
                    m25663 = (C2105.m6981("᩶ܺ") + i11) * 101;
                    i6 = ((m25663 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList4222222222222222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList4222222222222222222222222;
                case 375957440:
                case 2025474503:
                    C1711.m5736();
                    break;
                case 379959933:
                case 1224156311:
                    abstractActivityC12266.f36529 += z3 ? 1 : 0;
                    m2566 = C2105.m6981("᩺ۤ") ^ i11;
                    i = ((m2566 ^ i10) * (-16889)) ^ (-1544940840);
                    i2 = -403827462;
                    i13 = m2566 ^ i2;
                    i12 = i;
                case 565201921:
                case 735888845:
                    sArr3 = f36523;
                    i24 = 72;
                    i25 = 3;
                    if (C1128.f4106 <= 0) {
                        z = r27;
                        sArr = sArr4;
                        int i332 = i21;
                        arrayList = arrayList3;
                        i5 = i332;
                        m25663 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((m25663 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42222222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42222222222222222222222222;
                    } else {
                        m2566 = (C0630.m2566("ۖۙ") + i10) * (-61);
                        i = ((m2566 ^ i11) * (-7647)) ^ (-1813798038);
                        i2 = -914537855;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                case 811896753:
                case 1364647728:
                    z = r27;
                    sArr = sArr4;
                    if (((C8739) C2272.m7513(it2)).m22596(z3)) {
                        m25662 = (C2105.m6981("ܽۨ") ^ i10) * 57;
                        i3 = ((m25662 ^ i11) * (-22971)) ^ 1544003543;
                        i4 = 1171878161;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    } else {
                        int i392 = i21;
                        arrayList = arrayList3;
                        i5 = i392;
                        m25663 = (C2105.m6981("᩶ܺ") + i11) * 101;
                        i6 = ((m25663 ^ i10) * (-4323)) ^ (-1020884064);
                        i7 = 1199732378;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList422222222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList422222222222222222222222222;
                    }
                case 1003332704:
                case 1203040351:
                    if (abstractActivityC12266.f36529 == 0) {
                        m2566 = C0630.m2566("ۙۛ") ^ i11;
                        i = ((m2566 ^ i10) * (-26129)) ^ 652773798;
                        i2 = -1882686325;
                    } else {
                        m2566 = C0630.m2566("᩺᩵") ^ i11;
                        i = ((m2566 ^ i10) * (-4195)) ^ 777244040;
                        i2 = -1112944576;
                    }
                    i13 = m2566 ^ i2;
                    i12 = i;
                case 1146013384:
                case 1643757087:
                    z = r27;
                    sArr = sArr4;
                    if (C0483.m2123(it2)) {
                        m25662 = C0630.m2566("ۚۘ") ^ i10;
                        i3 = ((m25662 ^ i11) * (-1679)) ^ (-1606579020);
                        i4 = -382543703;
                        i13 = m25662 ^ i4;
                        i12 = i3;
                        sArr4 = sArr;
                        r27 = z;
                    } else {
                        int i47 = i21;
                        arrayList = arrayList3;
                        i5 = i47;
                        m25663 = C0630.m2566("ۙܰ") ^ i10;
                        i6 = ((m25663 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList4222222222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList4222222222222222222222222222;
                    }
                case 1253276514:
                case 1772238157:
                    i15++;
                    z = r27;
                    sArr = sArr4;
                    m25662 = (C2105.m6981("֫ܳ") ^ i10) * (-7);
                    i3 = ((m25662 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case 1338228550:
                case 1426514896:
                    if (C2958.f9394 < 0) {
                        z = r27;
                        sArr = sArr4;
                        int i3322 = i21;
                        arrayList = arrayList3;
                        i5 = i3322;
                        m25663 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((m25663 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList42222222222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList42222222222222222222222222222;
                    } else {
                        m2566 = C2105.m6981("֡᩶") ^ i10;
                        i = ((m2566 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                        i13 = m2566 ^ i2;
                        i12 = i;
                    }
                case 1540801775:
                case 1947211978:
                    z = r27;
                    if (z != 4) {
                        m25662 = C0630.m2566("ۧۡ") ^ i10;
                        sArr = sArr4;
                        i3 = ((m25662 ^ i11) * 6743) ^ (-1331423479);
                        i4 = 1247998275;
                    } else {
                        sArr = sArr4;
                        m25662 = C0630.m2566("۟ܳ") ^ i11;
                        i3 = ((m25662 ^ i10) * (-15967)) ^ (-2017367133);
                        i4 = -1342207448;
                    }
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
                case 1596258551:
                case 1630748205:
                    z = r27;
                    sArr = sArr4;
                    int i48 = i21;
                    arrayList = arrayList3;
                    i5 = i48;
                    s = sArr2[c];
                    s2 = 13649;
                    if (!C1711.f5919) {
                        m25663 = C0630.m2566("ܳ᩹") ^ i11;
                        i6 = ((m25663 ^ i10) * (-20973)) ^ 1184290841;
                        i7 = 222108106;
                        i13 = m25663 ^ i7;
                        i12 = i6;
                        sArr4 = sArr;
                        r27 = z;
                        ArrayList arrayList422222222222222222222222222222 = arrayList;
                        i21 = i5;
                        arrayList3 = arrayList422222222222222222222222222222;
                    }
                    m25663 = (C0630.m2566("۫᩶") + i11) * 65;
                    i6 = ((m25663 ^ i10) * (-30169)) ^ (-226437537);
                    i7 = 465422048;
                    i13 = m25663 ^ i7;
                    i12 = i6;
                    sArr4 = sArr;
                    r27 = z;
                    ArrayList arrayList4222222222222222222222222222222 = arrayList;
                    i21 = i5;
                    arrayList3 = arrayList4222222222222222222222222222222;
                default:
                    z = r27;
                    sArr = sArr4;
                    it = C4117.m12354(abstractActivityC12266.f36537);
                    m25662 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                    i3 = ((m25662 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = m25662 ^ i4;
                    i12 = i3;
                    sArr4 = sArr;
                    r27 = z;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00af, code lost:
    
        if (l.C2126.f7087 == false) goto L13;
     */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m29789(l.AbstractActivityC12266 r35) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29789(l.۫۟ܽ):void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36532.m15258();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0063, code lost:
    
        if (l.C1504.f5354 != false) goto L14;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m29782(l.AbstractActivityC12266 r20) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29782(l.۫۟ܽ):void");
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo29795() {
        throw new RuntimeException();
    }

    /* renamed from: ᩺ */
    public String mo19686() {
        int i;
        int i2;
        int m6981;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -193345948;
        int i13 = C1047.f3863;
        int i14 = ServiceConnectionC3453.f10921;
        int m2566 = C0630.m2566("ܽܺ") ^ i14;
        int i15 = ((m2566 ^ i13) * (-18197)) ^ 374024919;
        int i16 = m2566 ^ (-11676758);
        String str = null;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * 12395) >> 31));
            switch (i17) {
                case -2125556784:
                case 1757775400:
                    i2 = i17;
                    C1047.m3599();
                    if (C2520.f8000 < 0) {
                        i = i5;
                        m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                        i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                        i4 = -1964312995;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                    i = i5;
                    i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                    i4 = -187235104;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -2102383350:
                case -1280722612:
                    i = i5;
                    i2 = i17;
                    int i18 = s + s2;
                    if ((i18 * i18) - i8 < 0) {
                        m6981 = C0630.m2566("᩻֨") ^ i14;
                        i3 = ((m6981 ^ i13) * (-15139)) ^ (-1964577599);
                        i4 = -812988481;
                    } else {
                        m6981 = (C0630.m2566("ܶܶ") ^ i13) * 69;
                        i3 = ((m6981 ^ i14) * 3379) ^ (-1887268212);
                        i4 = -580370208;
                    }
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -1815181300:
                case -1721849470:
                    ViewOnClickListenerC1958.m6429();
                    C7106.m19120();
                    return null;
                case -1676603987:
                case 2083469965:
                    i = i5;
                    i2 = i17;
                    i11 = 3;
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("ܿܳ") ^ i13;
                        i3 = ((m6981 ^ i14) * (-30839)) ^ 495843898;
                        i4 = 1801146046;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    i5 = i;
                    m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                    i = i5;
                    i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                    i4 = -187235104;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -1640613754:
                case -50520979:
                    i = i5;
                    i2 = i17;
                    i9 = 54418;
                    m6981 = C0630.m2566("᩹᩸") ^ i14;
                    i3 = ((m6981 ^ i13) * (-18835)) ^ (-224278306);
                    i4 = -1258686988;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -1635199673:
                case 595462210:
                    i = i5;
                    i2 = i17;
                    i9 = 38568;
                    m6981 = C0630.m2566("᩹᩸") ^ i14;
                    i3 = ((m6981 ^ i13) * (-18835)) ^ (-224278306);
                    i4 = -1258686988;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -1604336165:
                case 269301090:
                    i = i5;
                    i2 = i17;
                    i8 = i7 + 1;
                    if (C4075.f12947 < 0) {
                        m6981 = C0630.m2566("ᩴ۫") ^ i13;
                        i3 = ((m6981 ^ i14) * (-26665)) ^ 2008938539;
                        i4 = -349897733;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                    i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                    i4 = -1964312995;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -1448975630:
                case -1266240781:
                    C7811.m20844();
                    if (C3019.f9544 < 0) {
                        i = i5;
                        i2 = i17;
                        m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                        i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                        i4 = -1964312995;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    } else {
                        int m25662 = C0630.m2566("᩸ۘ") ^ i14;
                        i16 = m25662 ^ (-2077145032);
                        i15 = ((m25662 ^ i13) * 1745) ^ 423487025;
                        i12 = i17;
                    }
                case -1307578976:
                case 953938044:
                    return C0050.m946(this, i5 ^ i6);
                case -1029069046:
                case 1240308015:
                    i = i5;
                    i2 = i17;
                    c = 340;
                    if (RunnableC3474.f10992 > 0) {
                        m6981 = C2105.m6981("᩺ܰ") ^ i13;
                        i3 = ((m6981 ^ i14) * (-1031)) ^ 2056876298;
                        i4 = -1769607013;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                    i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                    i4 = -1964312995;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case -476093550:
                case 396990476:
                    C2958.m9034();
                    if (C3537.f11231 >= 0) {
                        i2 = i17;
                        m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                        i = i5;
                        i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                        i4 = -187235104;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    } else {
                        i = i5;
                        i2 = i17;
                        m6981 = C2105.m6981("ۛۛ") ^ i14;
                        i3 = ((m6981 ^ i13) * (-1569)) ^ 211967846;
                        i4 = 1483840739;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                case -433869821:
                case 1761444236:
                    i2 = i17;
                    str = C3911.m11919(sArr2, i10, i11, i9);
                    if (C1047.f3863 >= 0) {
                        i = i5;
                        m6981 = (i13 - C0630.m2566("ۢۡ")) * (-127);
                        i3 = ((m6981 ^ i14) * 24355) ^ (-1120252208);
                        i4 = -968160218;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    } else {
                        m6981 = (C2105.m6981("᩹᩻") ^ i14) * 97;
                        i = i5;
                        i3 = ((m6981 ^ i13) * 2291) ^ 88315818;
                        i4 = -472725927;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                case -150098052:
                case 1477449959:
                    i = i5;
                    i2 = i17;
                    i7 = s * 2;
                    if (C2958.f9394 < 0) {
                        m6981 = (i13 - C0630.m2566("۬۟")) * (-39);
                        i3 = ((m6981 ^ i14) * (-13169)) ^ 2050868691;
                        i4 = 1658182884;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (i13 - C0630.m2566("ۢۡ")) * (-127);
                    i3 = ((m6981 ^ i14) * 24355) ^ (-1120252208);
                    i4 = -968160218;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case 331006279:
                case 1246535100:
                    i = i5;
                    i2 = i17;
                    sArr = f36523;
                    if (!C1711.f5919) {
                        m6981 = C2105.m6981("᩷ܳ") ^ i14;
                        i3 = ((m6981 ^ i13) * (-10093)) ^ (-1891095686);
                        i4 = -1525065789;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                    i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                    i4 = -1964312995;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case 469683716:
                case 1083248505:
                    i = i5;
                    i2 = i17;
                    s = sArr[c];
                    if (C4263.m12819() < 0) {
                        m6981 = C2105.m6981("۬֨") ^ i14;
                        i3 = ((m6981 ^ i13) * (-23253)) ^ (-783878996);
                        i4 = -1259916885;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    i5 = i;
                    m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                    i = i5;
                    i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                    i4 = -187235104;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case 728260427:
                case 1656072224:
                    i2 = i17;
                    i5 = C0630.m2566(str);
                    if (C2520.f8000 >= 0) {
                        i6 = 2128242756;
                        m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                        i = i5;
                        i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                        i4 = -187235104;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    } else {
                        int m25663 = C0630.m2566("۟ᩴ") ^ i13;
                        i12 = i2;
                        i16 = m25663 ^ (-1247602080);
                        i15 = ((m25663 ^ i14) * 249) ^ 1860275664;
                        i6 = 2128242756;
                    }
                case 855720474:
                case 1514616088:
                    i2 = i17;
                    C2272.m7503();
                    m6981 = (i14 - C0630.m2566("ۛܽ")) * (-73);
                    i = i5;
                    i3 = ((m6981 ^ i13) * (-10027)) ^ 1818179753;
                    i4 = -187235104;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                case 1477267355:
                case 1931026123:
                    i = i5;
                    i2 = i17;
                    sArr2 = f36523;
                    i10 = 341;
                    if (C1047.m3599() < 0) {
                        m6981 = C2105.m6981("᩺᩷") ^ i13;
                        i3 = ((m6981 ^ i14) * (-27783)) ^ (-837143772);
                        i4 = 292177913;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = C2105.m6981("ۛۛ") ^ i14;
                    i3 = ((m6981 ^ i13) * (-1569)) ^ 211967846;
                    i4 = 1483840739;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
                default:
                    i = i5;
                    i2 = i17;
                    s2 = 1;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = (C2105.m6981("ۤܳ") + i14) * (-87);
                        i3 = ((m6981 ^ i13) * 30959) ^ 1606316132;
                        i4 = -992397861;
                        i12 = i2;
                        i16 = m6981 ^ i4;
                        i15 = i3;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("۠ۨ") ^ i13) * 101;
                    i3 = ((m6981 ^ i14) * (-8919)) ^ 1011816575;
                    i4 = -1964312995;
                    i12 = i2;
                    i16 = m6981 ^ i4;
                    i15 = i3;
                    i5 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004a, code lost:
    
        if (l.C3911.f12484 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        r7 = l.C0630.m2566("᩸ܽ") ^ r6;
        r8 = ((r7 ^ r5) * (-7957)) ^ 1554248649;
        r12 = 1795540801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
    
        if (l.C22628.f73083 > 0) goto L50;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29791(java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29791(java.util.ArrayList):void");
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final void m29797() {
        this.f36539.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c9, code lost:
    
        r7 = (l.C2105.m6981("ܿ᩵") + r5) * (-65);
        r8 = ((r7 ^ r6) * 10261) ^ 558411228;
        r9 = -511982811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02a4, code lost:
    
        r7 = l.C2105.m6981("۫᩹") ^ r6;
        r8 = ((r7 ^ r5) * (-26819)) ^ (-387879311);
        r9 = 1812655140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0240, code lost:
    
        r7 = (l.C2105.m6981("ۡۡ") ^ r6) * (-83);
        r8 = ((r7 ^ r5) * (-3637)) ^ 1825876422;
        r9 = 1178236954;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        r7 = l.C2105.m6981("ܿۙ") ^ r6;
        r8 = ((r7 ^ r5) * (-19585)) ^ (-2003103280);
        r9 = -772058476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        r7 = l.C0630.m2566("֨ۨ") ^ r6;
        r8 = ((r7 ^ r5) * (-3515)) ^ 2074091716;
        r9 = 1296159142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0210, code lost:
    
        r7 = (l.C2105.m6981("ܳ۠") + r6) * 127;
        r8 = ((r7 ^ r5) * 31713) ^ (-705814969);
        r9 = 252380924;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        r7 = (l.C0630.m2566("ܰۤ") ^ r5) * 15;
        r8 = ((r7 ^ r6) * 20805) ^ 494278351;
        r9 = -119136651;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m29780(boolean r11) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29780(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public void m29788() {
        String str;
        String str2;
        int i;
        int i2;
        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC22555;
        String str3;
        int i3;
        int i4;
        int m6981;
        int i5;
        int i6;
        int m69812;
        int i7;
        int i8;
        int m2566;
        int i9;
        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC225552;
        String str4;
        int i10;
        int m25662;
        int i11;
        int i12;
        AbstractActivityC12266 abstractActivityC12266 = this;
        C19258 c19258 = null;
        int i13 = 0;
        boolean z = false;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        String str5 = null;
        ViewGroup viewGroup = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        String str6 = null;
        int i17 = 0;
        String str7 = null;
        short s = 0;
        short s2 = 0;
        int i18 = 586814579;
        int i19 = C0714.f2697;
        int i20 = C0483.f2088;
        int m25663 = (i20 - C0630.m2566("ܳۤ")) * (-79);
        int i21 = ((m25663 ^ i19) * (-15319)) ^ (-1276222585);
        int i22 = m25663 ^ (-840863315);
        Iterator it = null;
        short[] sArr = null;
        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC225553 = null;
        int i23 = 0;
        DialogInterfaceOnClickListenerC20173 dialogInterfaceOnClickListenerC20173 = null;
        int i24 = 0;
        ArrayList arrayList = null;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * (-20055)) >> 31));
            switch (i18) {
                case -2131036088:
                case -79159200:
                    str = str5;
                    C2520.m8033(c19258, i17 ^ 2102298975, null);
                    m69812 = (C2105.m6981("ۙ۠") + i20) * 97;
                    i7 = ((m69812 ^ i19) * 21731) ^ (-440084496);
                    i8 = 2025733575;
                    str3 = str;
                    i22 = m69812 ^ i8;
                    i21 = i7;
                    str5 = str3;
                case -2063228968:
                case -200762067:
                    str = str5;
                    dialogInterfaceC0206 = RunnableC0588.m2438(c19258);
                    if (z) {
                        m69812 = (C0630.m2566("᩸ۤ") + i19) * 75;
                        i7 = ((m69812 ^ i20) * 15197) ^ 30323274;
                        i8 = -304872549;
                        str3 = str;
                        i22 = m69812 ^ i8;
                        i21 = i7;
                        str5 = str3;
                    }
                    m69812 = (C2105.m6981("ۨۤ") + i20) * (-107);
                    i7 = ((m69812 ^ i19) * 11459) ^ (-906081222);
                    i8 = 162962141;
                    str3 = str;
                    i22 = m69812 ^ i8;
                    i21 = i7;
                    str5 = str3;
                case -2023689448:
                case -1905362504:
                    if (C2958.f9394 >= 0) {
                        m25662 = (C0630.m2566("ۧۧ") ^ i20) * 99;
                        i11 = ((m25662 ^ i19) * (-18935)) ^ 1481597197;
                        i12 = 1314838682;
                        i22 = m25662 ^ i12;
                        i21 = i11;
                    } else {
                        str = str5;
                        i = i24;
                        i4 = i25;
                        m6981 = C2105.m6981("ۖܿ") ^ i20;
                        dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                        i5 = ((m6981 ^ i19) * 11477) ^ (-456181855);
                        i6 = 298979272;
                        int i27 = m6981 ^ i6;
                        i25 = i4;
                        str3 = str;
                        i22 = i27;
                        i21 = i5;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str3;
                    }
                case -1882356577:
                case -809906583:
                    str = str5;
                    C1294.m4380(c19258, 2099769225 ^ i16, dialogInterfaceOnClickListenerC225553);
                    if (ServiceConnectionC3453.m10564() > 0) {
                        dialogInterfaceOnClickListenerC20173 = new DialogInterfaceOnClickListenerC20173(i13, abstractActivityC12266);
                        str6 = RunnableC0588.m2436(f36523, 92, 3, i23);
                        if (C1773.f6144 > 0) {
                            m69812 = C0630.m2566("۬ܿ") ^ i19;
                            i7 = ((m69812 ^ i20) * (-23829)) ^ (-1099377334);
                            i8 = 944514734;
                            str3 = str;
                            i22 = m69812 ^ i8;
                            i21 = i7;
                            str5 = str3;
                        }
                    }
                    str5 = str;
                    int m25664 = C0630.m2566("ܺܶ") ^ i19;
                    i22 = m25664 ^ (-2147071595);
                    i21 = ((m25664 ^ i20) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC225553 = null;
                    dialogInterfaceOnClickListenerC20173 = null;
                case -1748080348:
                case -1209308980:
                    C2272.m7505(this);
                    break;
                case -1576169080:
                case 2131086172:
                    RunnableC1108.m3781(this);
                    break;
                case -1564739218:
                case -1301793354:
                    break;
                case -1418352456:
                case 159302391:
                    str = str5;
                    i17 = C0630.m2566(C1128.m3841(f36523, 95, 3, i23));
                    m69812 = (i20 - C0630.m2566("ۛۧ")) * (-27);
                    i7 = ((m69812 ^ i19) * (-22737)) ^ 238044346;
                    i8 = -1944767885;
                    str3 = str;
                    i22 = m69812 ^ i8;
                    i21 = i7;
                    str5 = str3;
                case -1241259680:
                case -379869947:
                    str = str5;
                    C2520.m8029(c19258, C2105.m6981(str6) ^ 2129461435, dialogInterfaceOnClickListenerC20173);
                    z = abstractActivityC12266 instanceof ActivityC19507;
                    if (z) {
                        m69812 = C2105.m6981("᩺۬") ^ i19;
                        i7 = ((m69812 ^ i20) * (-29853)) ^ 778224075;
                        i8 = -2026708136;
                        str3 = str;
                        i22 = m69812 ^ i8;
                        i21 = i7;
                        str5 = str3;
                    }
                    m69812 = (C2105.m6981("ۙ۠") + i20) * 97;
                    i7 = ((m69812 ^ i19) * 21731) ^ (-440084496);
                    i8 = 2025733575;
                    str3 = str;
                    i22 = m69812 ^ i8;
                    i21 = i7;
                    str5 = str3;
                case -1208731047:
                case -304054129:
                    str = str5;
                    i = i24;
                    i4 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    if (((C8739) C2272.m7513(it)).m22599()) {
                        m6981 = (C0630.m2566("ۡۙ") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((m6981 ^ i20) * 17521) ^ (-251820074);
                        i6 = 1597013255;
                        int i272 = m6981 ^ i6;
                        i25 = i4;
                        str3 = str;
                        i22 = i272;
                        i21 = i5;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str3;
                    }
                    m6981 = C2105.m6981("֡ܺ") ^ i20;
                    i5 = ((m6981 ^ i19) * (-8895)) ^ 1759524138;
                    i6 = 1013138195;
                    int i2722 = m6981 ^ i6;
                    i25 = i4;
                    str3 = str;
                    i22 = i2722;
                    i21 = i5;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str3;
                case -1177681755:
                case 1991967599:
                    C3746.m11369();
                    C1916.m6308();
                    break;
                case -1168371613:
                case 308540622:
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    i23 = 62922;
                    m2566 = C0630.m2566("᩶᩻") ^ i19;
                    i21 = ((m2566 ^ i20) * 12443) ^ (-1808411966);
                    i9 = 1865212596;
                    i3 = m2566 ^ i9;
                    i25 = i2;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str2;
                    i22 = i3;
                    abstractActivityC12266 = this;
                case -915177902:
                case 1607142584:
                    str5 = mo29795();
                    Button m20839 = C7811.m20839(dialogInterfaceC0206);
                    viewGroup = (ViewGroup) m20839.getParent();
                    i14 = viewGroup.indexOfChild(m20839);
                    if (C1504.m5179()) {
                        m25662 = C0630.m2566("ܰ۬") ^ i20;
                        i11 = ((m25662 ^ i19) * (-25099)) ^ 2115499950;
                        i12 = -1464521321;
                        i22 = m25662 ^ i12;
                        i21 = i11;
                    } else {
                        int m256642 = C0630.m2566("ܺܶ") ^ i19;
                        i22 = m256642 ^ (-2147071595);
                        i21 = ((m256642 ^ i20) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC225553 = null;
                        dialogInterfaceOnClickListenerC20173 = null;
                    }
                case -823033118:
                case 1131016576:
                    if (C1005.f3721) {
                        str2 = str5;
                        i = i24;
                        i2 = i25;
                        dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                        m2566 = (C2105.m6981("֡᩸") + i19) * 67;
                        i21 = ((m2566 ^ i20) * 30421) ^ 1165481377;
                        i9 = 1213427027;
                        i3 = m2566 ^ i9;
                        i25 = i2;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str2;
                        i22 = i3;
                        abstractActivityC12266 = this;
                    } else {
                        m25662 = (C0630.m2566("ۧۧ") ^ i20) * 99;
                        i11 = ((m25662 ^ i19) * (-18935)) ^ 1481597197;
                        i12 = 1314838682;
                        i22 = m25662 ^ i12;
                        i21 = i11;
                    }
                case -775916586:
                case 1951009476:
                    str = str5;
                    C1916.m6295(c19258, i26 ^ i15);
                    i13 = 1;
                    if (C2105.f7037 == 0) {
                        dialogInterfaceOnClickListenerC225553 = new DialogInterfaceOnClickListenerC22555(i13, abstractActivityC12266);
                        i16 = C2105.m6981(C11340.m28025(f36523, 89, 3, i23));
                        if (C4263.f13799 > 0) {
                            m69812 = C0630.m2566("֫ۗ") ^ i19;
                            i7 = ((m69812 ^ i20) * (-24175)) ^ (-305531836);
                            i8 = 1106666232;
                            str3 = str;
                            i22 = m69812 ^ i8;
                            i21 = i7;
                            str5 = str3;
                        }
                    }
                    str5 = str;
                    int m2566422 = C0630.m2566("ܺܶ") ^ i19;
                    i22 = m2566422 ^ (-2147071595);
                    i21 = ((m2566422 ^ i20) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC225553 = null;
                    dialogInterfaceOnClickListenerC20173 = null;
                case -723703374:
                case 33261242:
                    dialogInterfaceOnClickListenerC225552 = dialogInterfaceOnClickListenerC225553;
                    str4 = str5;
                    int i28 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC12266);
                    sArr = f36523;
                    i10 = 83;
                    i25 = 3;
                    if (C0237.m1481() >= 0) {
                        int m25665 = (i19 - C0630.m2566("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC225554 = dialogInterfaceOnClickListenerC225552;
                        i24 = i10;
                        i21 = ((m25665 ^ i20) * (-30993)) ^ 1105133170;
                        str5 = str4;
                        i22 = m25665 ^ 862783477;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC225554;
                    } else {
                        int m69813 = (C2105.m6981("۠ܰ") + i20) * (-49);
                        i21 = ((m69813 ^ i19) * (-18535)) ^ (-332341909);
                        str5 = str4;
                        i22 = m69813 ^ (-1154652115);
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC225552;
                        i24 = 83;
                    }
                case -564768933:
                case -247515600:
                    str = str5;
                    i = i24;
                    i4 = i25;
                    C0382.m1849(c19258, C0630.m2566(AbstractC2021.m6573(sArr, i, i4, i23)) ^ 2125200366);
                    if (C7811.m20844() == 0) {
                        dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                        m6981 = (C2105.m6981("֡֨") + i19) * 69;
                        i5 = ((m6981 ^ i20) * 8437) ^ (-943308735);
                        i6 = -2078398606;
                        int i27222 = m6981 ^ i6;
                        i25 = i4;
                        str3 = str;
                        i22 = i27222;
                        i21 = i5;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str3;
                    }
                    m6981 = C2105.m6981("ۖܿ") ^ i20;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    i5 = ((m6981 ^ i19) * 11477) ^ (-456181855);
                    i6 = 298979272;
                    int i272222 = m6981 ^ i6;
                    i25 = i4;
                    str3 = str;
                    i22 = i272222;
                    i21 = i5;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str3;
                case -543375578:
                case 822060580:
                    str = str5;
                    i26 = C0630.m2566(C0050.m948(f36523, 86, 3, i23));
                    i15 = 2119803576;
                    if (!C0382.m1848()) {
                        m69812 = (C2105.m6981("۬ۙ") ^ i20) * 93;
                        i7 = ((m69812 ^ i19) * (-2763)) ^ 149781173;
                        i8 = -567683808;
                        str3 = str;
                        i22 = m69812 ^ i8;
                        i21 = i7;
                        str5 = str3;
                    }
                    i = i24;
                    i4 = i25;
                    m6981 = C2105.m6981("ۖܿ") ^ i20;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    i5 = ((m6981 ^ i19) * 11477) ^ (-456181855);
                    i6 = 298979272;
                    int i2722222 = m6981 ^ i6;
                    i25 = i4;
                    str3 = str;
                    i22 = i2722222;
                    i21 = i5;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str3;
                case -528261490:
                case 1522464202:
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    i23 = 28737;
                    m2566 = C0630.m2566("᩶᩻") ^ i19;
                    i21 = ((m2566 ^ i20) * 12443) ^ (-1808411966);
                    i9 = 1865212596;
                    i3 = m2566 ^ i9;
                    i25 = i2;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str2;
                    i22 = i3;
                    abstractActivityC12266 = this;
                case -513755540:
                case 1810542135:
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    ArrayList arrayList2 = abstractActivityC12266.f36537;
                    if (arrayList2 == null) {
                        int m25666 = C0630.m2566("᩹ۤ") ^ i20;
                        arrayList = arrayList2;
                        i25 = i2;
                        i21 = ((m25666 ^ i19) * 14455) ^ 484192171;
                        abstractActivityC12266 = this;
                        str3 = str2;
                        i22 = m25666 ^ 1223558316;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str3;
                    } else {
                        int m25667 = C0630.m2566("᩹᩹") ^ i19;
                        int i29 = ((m25667 ^ i20) * (-23621)) ^ 832762067;
                        i3 = m25667 ^ (-1510926815);
                        arrayList = arrayList2;
                        i21 = i29;
                        i25 = i2;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str2;
                        i22 = i3;
                        abstractActivityC12266 = this;
                    }
                case -373422593:
                case 949436639:
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    s = f36523[82];
                    s2 = 13594;
                    if (!C1504.f5354) {
                        m2566 = (C0630.m2566("ۗۨ") ^ i19) * (-61);
                        i21 = ((m2566 ^ i20) * 17) ^ (-1904267292);
                        i9 = -269325288;
                        i3 = m2566 ^ i9;
                        i25 = i2;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                        i24 = i;
                        str5 = str2;
                        i22 = i3;
                        abstractActivityC12266 = this;
                    }
                    m2566 = (C2105.m6981("֡᩸") + i19) * 67;
                    i21 = ((m2566 ^ i20) * 30421) ^ 1165481377;
                    i9 = 1213427027;
                    i3 = m2566 ^ i9;
                    i25 = i2;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str2;
                    i22 = i3;
                    abstractActivityC12266 = this;
                case -286925940:
                case 2006359592:
                    str = str5;
                    str7 = C3019.m9250(f36523, 98, 3, i23);
                    if (C3663.f11553) {
                        str5 = str;
                        int m25664222 = C0630.m2566("ܺܶ") ^ i19;
                        i22 = m25664222 ^ (-2147071595);
                        i21 = ((m25664222 ^ i20) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC225553 = null;
                        dialogInterfaceOnClickListenerC20173 = null;
                    } else {
                        m69812 = C2105.m6981("ܿۧ") ^ i19;
                        i7 = ((m69812 ^ i20) * (-617)) ^ (-1589740207);
                        i8 = -683086051;
                        str3 = str;
                        i22 = m69812 ^ i8;
                        i21 = i7;
                        str5 = str3;
                    }
                case -116560932:
                case 282274319:
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    if ((s * s2) - ((s * s) + 46199209) > 0) {
                        m2566 = C2105.m6981("۬֨") ^ i20;
                        i21 = ((m2566 ^ i19) * 509) ^ 1290106679;
                        i9 = 1702861404;
                    } else {
                        m2566 = (i20 - C0630.m2566("ܰۤ")) * (-103);
                        i21 = ((m2566 ^ i19) * (-31973)) ^ 211450666;
                        i9 = -643330375;
                    }
                    i3 = m2566 ^ i9;
                    i25 = i2;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str2;
                    i22 = i3;
                    abstractActivityC12266 = this;
                case 81816915:
                case 1392831018:
                    C0422.m1963();
                    str2 = str5;
                    i = i24;
                    i2 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    m2566 = (C2105.m6981("֡᩸") + i19) * 67;
                    i21 = ((m2566 ^ i20) * 30421) ^ 1165481377;
                    i9 = 1213427027;
                    i3 = m2566 ^ i9;
                    i25 = i2;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str2;
                    i22 = i3;
                    abstractActivityC12266 = this;
                case 239711412:
                case 1059664436:
                    AbstractC2021.m6574();
                    if (C21923.f70183 != 0) {
                        m25662 = (C0630.m2566("ۧۧ") ^ i20) * 99;
                        i11 = ((m25662 ^ i19) * (-18935)) ^ 1481597197;
                        i12 = 1314838682;
                        i22 = m25662 ^ i12;
                        i21 = i11;
                    } else {
                        str4 = str5;
                        i10 = i24;
                        dialogInterfaceOnClickListenerC225552 = dialogInterfaceOnClickListenerC225553;
                        int m256652 = (i19 - C0630.m2566("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC2255542 = dialogInterfaceOnClickListenerC225552;
                        i24 = i10;
                        i21 = ((m256652 ^ i20) * (-30993)) ^ 1105133170;
                        str5 = str4;
                        i22 = m256652 ^ 862783477;
                        dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC2255542;
                    }
                case 733823772:
                case 1039559557:
                    str = str5;
                    i = i24;
                    i4 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    it = C4117.m12354(arrayList);
                    m6981 = C2105.m6981("֡ܺ") ^ i20;
                    i5 = ((m6981 ^ i19) * (-8895)) ^ 1759524138;
                    i6 = 1013138195;
                    int i27222222 = m6981 ^ i6;
                    i25 = i4;
                    str3 = str;
                    i22 = i27222222;
                    i21 = i5;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str3;
                case 959388835:
                case 1493635720:
                    CheckBox checkBox = (CheckBox) C3537.m10739(abstractActivityC12266, C0630.m2566(str7) ^ 2118991330);
                    viewGroup.removeViewAt(i14);
                    viewGroup.addView(checkBox, i14);
                    C10025.m25194(abstractActivityC12266, checkBox, str5);
                    str = str5;
                    m69812 = (C2105.m6981("ۨۤ") + i20) * (-107);
                    i7 = ((m69812 ^ i19) * 11459) ^ (-906081222);
                    i8 = 162962141;
                    str3 = str;
                    i22 = m69812 ^ i8;
                    i21 = i7;
                    str5 = str3;
                default:
                    str = str5;
                    i = i24;
                    i4 = i25;
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC225553;
                    if (C0483.m2123(it)) {
                        m6981 = (C2105.m6981("᩻᩸") + i20) * (-35);
                        i5 = ((m6981 ^ i19) * 7699) ^ 1671956753;
                        i6 = -1873288337;
                    } else {
                        m6981 = C2105.m6981("ۧۙ") ^ i19;
                        i5 = ((m6981 ^ i20) * 26409) ^ 1705844344;
                        i6 = -246805101;
                    }
                    int i272222222 = m6981 ^ i6;
                    i25 = i4;
                    str3 = str;
                    i22 = i272222222;
                    i21 = i5;
                    dialogInterfaceOnClickListenerC225553 = dialogInterfaceOnClickListenerC22555;
                    i24 = i;
                    str5 = str3;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (l.C3432.m10477() > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        if (l.C1294.m4372() > 0) goto L51;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r28) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // l.ActivityC2124
    /* renamed from: ᩴ */
    public final void mo2954() {
        m29788();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m29764(l.AbstractActivityC12266 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29764(l.۫۟ܽ, boolean):void");
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m29794() {
        return this.f36528;
    }

    /* renamed from: ܿ֫ */
    public void mo19684() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (l.C3245.f10203 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (l.C1504.f5354 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L61;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m29775(l.AbstractActivityC12266 r22) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29775(l.۫۟ܽ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cd, code lost:
    
        if (l.ViewOnClickListenerC1958.m6437(r15, r14) != false) goto L64;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m29774(boolean r44) {
        /*
            Method dump skipped, instructions count: 2620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29774(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01ce, code lost:
    
        r6 = l.C0630.m2566("ۚ֫") ^ r4;
        r7 = ((r6 ^ r5) * 23741) ^ (-946486436);
        r8 = -1874510273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0213, code lost:
    
        r6 = l.C2105.m6981("᩻ܺ") ^ r5;
        r7 = ((r6 ^ r4) * (-22653)) ^ (-1967144788);
        r8 = -1014163101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x016a, code lost:
    
        r6 = l.C2105.m6981("֡ۙ") ^ r5;
        r7 = ((r6 ^ r4) * 30293) ^ 1669600778;
        r8 = -302316139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        r6 = (l.C2105.m6981("ۛۚ") ^ r5) * 13;
        r7 = ((r6 ^ r4) * 25421) ^ (-1632024753);
        r8 = 1902293166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0244, code lost:
    
        r6 = (l.C0630.m2566("֫֨") ^ r4) * 61;
        r7 = ((r6 ^ r5) * 801) ^ (-1788511310);
        r8 = -819007863;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29790(int r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12266.m29790(int, android.view.View):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m29771(AbstractActivityC12266 abstractActivityC12266, int i) {
        return abstractActivityC12266.f36531[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m29761(AbstractActivityC12266 abstractActivityC12266, int i) {
        return abstractActivityC12266.f36531[i];
    }
}
