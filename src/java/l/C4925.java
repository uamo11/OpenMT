package l;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.ClipboardManager;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import moe.shizuku.server.IShizukuService;

/* compiled from: 02QQ */
/* renamed from: l.ۙ᩸᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4925 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Handler f15519;

    /* renamed from: ۘۡܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f15520 = {115, 30113, 30125, 30124, 30124, 30119, 30113, 30134, 30123, 30132, 30123, 30134, 30139, 30124, 30135, 30126, 30126, 30178, 30113, 30115, 30124, 30124, 30125, 30134, 30178, 30112, 30119, 30178, 30113, 30115, 30129, 30134, 30178, 30134, 30125, 30178, 30124, 30125, 30124, 30191, 30124, 30135, 30126, 30126, 30178, 30134, 30139, 30130, 30119, 30178, 30115, 30124, 30118, 30128, 30125, 30123, 30118, 30188, 30124, 30119, 30134, 30188, 30081, 30125, 30124, 30124, 30119, 30113, 30134, 30123, 30132, 30123, 30134, 30139, 30095, 30115, 30124, 30115, 30117, 30119, 30128, 8433, 7620, 7622, 7639, 7650, 7635, 7635, 7631, 7626, 7616, 7618, 7639, 7626, 7628, 7629, 7658, 7629, 7621, 7628, 7563, 7565, 7565, 7565, 7562, 946, -27035, -27020, -27018, -27010, -27020, -27022, -27024, -27045, -27020, -27016, -27024, -27022, -27024, -27039, -27067, -27020, -27018, -27010, -27020, -27022, -27024, -27044, -27013, -27021, -27014, -27075, -27077, -27077, -27077, -27076, 2431, 17459, 17466, 17447, 17464, 17460, 17441, 17428, 17447, 17458, 17446, 17458, 17456, 17441, 17414, 17441, 17447, 17468, 17467, 17458, 17533, 17531, 17531, 17531, 17532, 7146, -11313, -11328, -11323, -11300, -11314, -11325, -11315, -11298, -11320, -11326, -11303, -11328, -11328, -11380, -11313, -11315, -11326, -11326, -11325, -11304, -11380, -11314, -11319, -11380, -11313, -11315, -11297, -11304, -11380, -11304, -11325, -11380, -11326, -11325, -11326, -11391, -11326, -11303, -11328, -11328, -11380, -11304, -11307, -11300, -11319, -11380, -11315, -11326, -11320, -11298, -11325, -11323, -11320, -11390, -11304, -11319, -11308, -11304, -11390, -11281, -11328, -11323, -11300, -11314, -11325, -11315, -11298, -11320, -11295, -11315, -11326, -11315, -11317, -11319, -11298, -22110, -21419, -29486, 9026, -21610, -21631, -21625, -21631, -21619, -21614, -21631, -21610, 9832, -22031, -22042, -22048, -22042, -22038, -22027, -22042, -22031, 6178, 14858, 14861, 14871, 14854, 14861, 14871, 3736, -31678, -29958, -31591, 6511, -11811, 8258, -21670, 4483, 3686, 3704, 3692, 3688, 3687, 3682, 3707, 3689, 3684, 3690, 3705, 3695, 3685, 3710, 3687, 3687, 3627, 3688, 3690, 3685, 3685, 3684, 3711, 3627, 3689, 3694, 3627, 3688, 3690, 3704, 3711, 3627, 3711, 3684, 3627, 3685, 3684, 3685, 3622, 3685, 3710, 3687, 3687, 3627, 3711, 3698, 3707, 3694, 3627, 3690, 3685, 3695, 3705, 3684, 3682, 3695, 3621, 3711, 3694, 3699, 3711, 3621, 3656, 3687, 3682, 3707, 3689, 3684, 3690, 3705, 3695, 3654, 3690, 3685, 3690, 3692, 3694, 3705, -30463, 32323, -24816, 7994, 29750, 29748, 29733, 29703, 29744, 29757, 29732, 29748, 29817, 29823, 29823, 29823, 29816, 4714, -28542, -28544, -28527, -28491, -28540, -28538, -28530, -28540, -28542, -28544, -28504, -28540, -28533, -28540, -28542, -28544, -28521, -28467, -28469, -28469, -28469, -28468, 3029, 22712, 22719, 22712, 22689, 22691, 22708, 22690, 22708, 22691, 22695, 22708, 22670, 22711, 22712, 22717, 22708, 22670, 22693, 22712, 22716, 22708, 5986, -30692, -30690, -30705, -30659, -30702, -30697, -30690, -30712, -30657, -30702, -30711, -30637, -30635, -30635, -30635, -30638, 4821, 10867, 10865, 10848, 10818, 10869, 10872, 10849, 10865, 10812, 10810, 10810, 10810, 10813, 3498, 9679, 9677, 9692, 9705, 9691, 9691, 9677, 9692, 9691, 9600, 9606, 9606, 9606, 9601, 2665, 23876, 23878, 23895, 23920, 23895, 23889, 23882, 23885, 23876, 23819, 23821, 23821, 23821, 23818, 6357, 16227, 16228, 16250, 16255, 16254, 16213, 16231, 16239, 16254, 16226, 16229, 16238, 16228, 16255, 16230, 16230, 16170, 16233, 16235, 16228, 16228, 16229, 16254, 16170, 16232, 16239, 16170, 16233, 16235, 16249, 16254, 16170, 16254, 16229, 16170, 16228, 16229, 16228, 16167, 16228, 16255, 16230, 16230, 16170, 16254, 16243, 16250, 16239, 16170, 16235, 16228, 16238, 16248, 16229, 16227, 16238, 16164, 16252, 16227, 16239, 16253, 16164, 16227, 16228, 16250, 16255, 16254, 16231, 16239, 16254, 16226, 16229, 16238, 16164, 16195, 16228, 16250, 16255, 16254, 16199, 16239, 16254, 16226, 16229, 16238, 16199, 16235, 16228, 16235, 16237, 16239, 16248, 4047, -12339, -12350, -12345, -12322, -12340, -12351, -12337, -12324, -12342, -12352, -12325, -12350, -12350, -12402, -12339, -12337, -12352, -12352, -12351, -12326, -12402, -12340, -12341, -12402, -12339, -12337, -12323, -12326, -12402, -12326, -12351, -12402, -12352, -12351, -12352, -12413, -12352, -12325, -12350, -12350, -12402, -12326, -12329, -12322, -12341, -12402, -12337, -12352, -12342, -12324, -12351, -12345, -12342, -12416, -12339, -12351, -12352, -12326, -12341, -12352, -12326, -12416, -12307, -12350, -12345, -12322, -12340, -12351, -12337, -12324, -12342, -12317, -12337, -12352, -12337, -12343, -12341, -12324, 716, -13910, -13912, -13895, -13938, -13908, -13906, -13915, -13912, -13943, -13916, -13889, -13851, -13853, -13853, -13853, -13852, 7410, -17910, -17912, -17895, -17863, -17912, -17899, -17895, -17851, -17853, -17853, -17853, -17852, 7811, 23243, 23239, 23238, 23260, 23245, 23248, 23260, 7208, -13763, -13761, -13778, -13799, -13771, -13772, -13778, -13761, -13772, -13778, -13816, -13761, -13783, -13771, -13770, -13780, -13761, -13784, -13710, -13708, -13708, -13708, -13709, 3241, -13451, -13449, -13466, -13502, -13453, -13455, -13447, -13453, -13451, -13449, -13476, -13453, -13441, -13449, -13510, -13508, -13508, -13508, -13509, 8628, -8265, -8267, -8284, -8318, -8267, -8285, -8257, -8283, -8286, -8269, -8267, -8285, -8200, -8194, -8194, -8194, -8199};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f15521;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ApplicationC20075 f15522;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f15523;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f15524;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f15525;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f15526;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC12344 f15527;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (l.C7106.f21815 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (l.C4159.f13567 != false) goto L15;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m14327(int r18) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14327(int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (l.C0050.m940() > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (l.C1047.f3863 < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (l.C0382.f1805 == false) goto L64;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14315(java.lang.Runnable r19) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14315(java.lang.Runnable):void");
    }

    static {
        C6700 c6700 = null;
        C21859 c21859 = null;
        InterfaceC17230 interfaceC17230 = null;
        int i = -1746542136;
        int i2 = C0714.f2697;
        int i3 = C0422.f1886;
        int m2566 = C0630.m2566("ۖ۫") ^ i2;
        int i4 = ((m2566 ^ i3) * 27461) ^ 528610030;
        int i5 = -510383583;
        while (true) {
            i = ((((i ^ i3) * (-20933)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2133436792:
                case -687250144:
                    f15526 = C14407.m34431(c21859);
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    } else {
                        m2566 = (C0630.m2566("ۙۗ") + i2) * 123;
                        i4 = ((m2566 ^ i3) * 25493) ^ 231869974;
                        i5 = 1869001830;
                    }
                case -1882480548:
                case -1399891809:
                    C0422.m1963();
                    if (C3432.f10845 < 0) {
                        m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        m2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((m2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    }
                case -1540952519:
                case -160401023:
                    C4159.m12565();
                    m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                    i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                    i5 = 619609887;
                case -1250037457:
                case 790187752:
                    if (C1294.f4556 >= 0) {
                        m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        m2566 = (i2 - C2105.m6981("ᩴۛ")) * 15;
                        i4 = ((m2566 ^ i3) * 19365) ^ 1666199758;
                        i5 = -1314514492;
                    }
                case -1151382254:
                case 1363187645:
                    C0483.m2121();
                    if (C3683.f11629 < 0) {
                        m2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((m2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        m2566 = (C0630.m2566("ۧ᩻") + i3) * 61;
                        i4 = ((m2566 ^ i2) * 23879) ^ (-1139162841);
                        i5 = 1556552318;
                    }
                case -821235640:
                case 189938279:
                    f15527 = c6700;
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((m2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        m2566 = (C2105.m6981("ܿۧ") ^ i3) * 89;
                        i4 = ((m2566 ^ i2) * 14965) ^ 2129842748;
                        i5 = -48696199;
                    }
                case -708482563:
                case 380844296:
                    C1294.m4372();
                    throw new RuntimeException();
                case -695161538:
                case 1176411802:
                    if (RunnableC1937.f6483 < 0) {
                        f15519 = new Handler(C0630.m2565());
                        return;
                    }
                    m2566 = C2105.m6981("֫۬") ^ i2;
                    i4 = ((m2566 ^ i3) * 21917) ^ 792788019;
                    i5 = -447654269;
                case -405533202:
                case 299563671:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("᩹ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 30003) ^ 1193533789;
                        i5 = -2061624416;
                    } else {
                        m2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    }
                case 252471103:
                case 1021665809:
                    if (C7811.m20844() != 0) {
                        m2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 21917) ^ 792788019;
                        i5 = -447654269;
                    } else {
                        interfaceC17230 = C14407.m34431(new C22564());
                        if (C4075.m12263() <= 0) {
                            m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                            i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                            i5 = 619609887;
                        } else {
                            m2566 = C0630.m2566("ۚ᩶") ^ i3;
                            i4 = ((m2566 ^ i2) * (-14499)) ^ 898897326;
                            i5 = 1546767453;
                        }
                    }
                case 1057013512:
                case 1425328088:
                    c21859 = new C21859();
                    if (C0237.f1507 != 0) {
                        m2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    } else {
                        m2566 = (C0630.m2566("᩻ۗ") ^ i3) * 39;
                        i4 = ((m2566 ^ i2) * (-19439)) ^ 571135902;
                        i5 = 1270624835;
                    }
                case 1155162496:
                case 2107864302:
                    f15521 = interfaceC17230;
                    if (C1420.f5096 <= 0) {
                        m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        m2566 = C0630.m2566("۠֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-32355)) ^ 1441989247;
                        i5 = -934191540;
                    }
                case 1654571493:
                case 1797192255:
                    if (AbstractC2021.f6743 > 0) {
                        m2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((m2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        m2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    }
                default:
                    c6700 = new C6700();
                    if (C0237.f1507 != 0) {
                        m2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((m2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        m2566 = (C2105.m6981("ܿܽ") ^ i3) * (-75);
                        i4 = ((m2566 ^ i2) * 5637) ^ (-1099214775);
                        i5 = -1645216701;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (l.C1773.m5908() > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (l.C0050.f910 >= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (l.C0483.f2088 < 0) goto L64;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14312(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14312(android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (l.C3537.f11231 < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (l.C5695.f17556 >= 0) goto L50;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14310(android.content.BroadcastReceiver r20) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14310(android.content.BroadcastReceiver):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (l.C2272.f7362 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (l.C3663.f11553 == false) goto L54;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.app.Application m14335() {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14335():android.app.Application");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m14329(final View view) {
        Runnable runnable = null;
        int i = 454541698;
        int i2 = C2958.f9394;
        int i3 = C0630.f2410;
        int m6981 = C2105.m6981("᩵᩹") ^ i3;
        int i4 = ((m6981 ^ i2) * 805) ^ (-128025258);
        int i5 = -760572033;
        while (true) {
            i = ((((i ^ i2) * 22773) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2132328413:
                case -1952064837:
                    break;
                case -2046451466:
                case -1372175774:
                    RunnableC1937.m6387();
                    C4263.m12819();
                    break;
                case -2011613539:
                case 1681816866:
                    if (view != null) {
                        m6981 = (C0630.m2566("ۚۗ") + i2) * (-19);
                        i4 = ((m6981 ^ i3) * (-6003)) ^ (-635242146);
                        i5 = 2114211320;
                    } else {
                        m6981 = (C2105.m6981("᩷ۜ") + i3) * 55;
                        i4 = ((m6981 ^ i2) * 491) ^ (-314983818);
                        i5 = -61709314;
                    }
                case -1927169682:
                case 768653048:
                    if (C21923.f70183 != 0) {
                        m6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        m6981 = C0630.m2566("ܰᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11731)) ^ (-1909184728);
                        i5 = 1097569853;
                    }
                case -1730662605:
                case -1316451135:
                    if (C2105.f7037 != 0) {
                        m6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((m6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        m6981 = (i3 - C0630.m2566("۠ۘ")) * 57;
                        i4 = ((m6981 ^ i2) * (-2415)) ^ 940023981;
                        i5 = -2095510238;
                    }
                case -1719435244:
                case -41704665:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = (C2105.m6981("۫֡") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * (-32465)) ^ (-1982854404);
                        i5 = -1119611953;
                    } else {
                        m6981 = (i2 - C2105.m6981("۫ۜ")) * 41;
                        i4 = ((m6981 ^ i3) * 19409) ^ (-1730546914);
                        i5 = -293747870;
                    }
                case -1651363728:
                case 857688890:
                    if (C0483.f2088 >= 0) {
                        m6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    } else {
                        m6981 = C2105.m6981("ۡ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2601)) ^ 223295400;
                        i5 = 1845112643;
                    }
                case -1581526554:
                case -866478242:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((m6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        m6981 = (C2105.m6981("᩸ۙ") ^ i2) * (-67);
                        i4 = ((m6981 ^ i3) * 6043) ^ (-1184644002);
                        i5 = -168727962;
                    }
                case -1530041336:
                case -1305656964:
                    if (C5695.f17556 >= 0) {
                        m6981 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 32703) ^ 1139301700;
                        i5 = -1378720167;
                    } else {
                        m6981 = (i3 - C2105.m6981("ᩴܿ")) * 51;
                        i4 = ((m6981 ^ i2) * 10043) ^ (-1022007074);
                        i5 = 736115959;
                    }
                case -1408478380:
                case -761562566:
                    view.postDelayed(runnable, 250L);
                    m6981 = (C2105.m6981("᩷ۜ") + i3) * 55;
                    i4 = ((m6981 ^ i2) * 491) ^ (-314983818);
                    i5 = -61709314;
                case -1336030020:
                case 1212044024:
                    runnable = new Runnable() { // from class: l.᩶᩸᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4925.m14328(0, view);
                        }
                    };
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("۫᩶") ^ i2) * 119;
                        i4 = ((m6981 ^ i3) * 17511) ^ 2134694907;
                        i5 = -425072753;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((m6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    }
                case -1193636013:
                case 2114121548:
                    C0483.m2121();
                    C2105.m6982();
                    m6981 = C0630.m2566("ۚ᩶") ^ i2;
                    i4 = ((m6981 ^ i3) * 12223) ^ (-587517145);
                    i5 = 1931973821;
                case -370925894:
                case 467370040:
                    if (C0382.m1848()) {
                        m6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((m6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        m6981 = C2105.m6981("ܰ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * (-12721)) ^ (-430506266);
                        i5 = -1489783509;
                    }
                case -132981147:
                case 1492150188:
                    if (AbstractC2021.m6574()) {
                        m6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((m6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    }
                case 29997242:
                case 997910518:
                    if (C4159.m12565() >= 0) {
                        m6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    } else {
                        m6981 = C2105.m6981("᩸۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13439)) ^ 502365853;
                        i5 = 1419390981;
                    }
                case 340285483:
                case 960958782:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        m6981 = C0630.m2566("᩸᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 9917) ^ (-1741716339);
                        i5 = 1772940158;
                    }
                case 1396233216:
                case 2116016172:
                    C2272.m7503();
                    if (C4075.m12263() <= 0) {
                        m6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    } else {
                        m6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    }
                default:
                    C3537.m10746();
                    if (C7811.f24123 < 0) {
                        m6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        m6981 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 32703) ^ 1139301700;
                        i5 = -1378720167;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14318(boolean z) {
        f15525 = z;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean m14331() {
        return f15525;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (l.C4117.m12364() == 0) goto L15;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence m14333(int r18) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14333(int):java.lang.CharSequence");
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final void m14302() {
        f15524 = true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean m14339() {
        return f15524;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14308(int i, CharSequence charSequence) {
        int m2566;
        int i2;
        int i3;
        String str;
        Object obj;
        int m6981;
        int i4;
        int i5;
        int m69812;
        int i6;
        int i7;
        String str2;
        Object obj2 = null;
        String str3 = null;
        ClipboardManager clipboardManager = null;
        String str4 = null;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 2019572688;
        int i12 = C0050.f910;
        int i13 = ViewOnClickListenerC1958.f6529;
        int m69813 = C2105.m6981("ܽܽ") ^ i12;
        int i14 = ((m69813 ^ i13) * 925) ^ 1585991882;
        int i15 = m69813 ^ (-671196668);
        short[] sArr2 = null;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        String str5 = null;
        int i20 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-3005)) >> 31));
            switch (i11) {
                case -2137402158:
                case -1293924087:
                    sArr2 = f15520;
                    i16 = 237;
                    i17 = 3;
                    if (!C2520.m8026()) {
                        m2566 = (C0630.m2566("᩸֡") + i13) * (-19);
                        i2 = ((m2566 ^ i12) * (-7897)) ^ 815752438;
                        i3 = 1841486017;
                        i15 = m2566 ^ i3;
                        i14 = i2;
                    }
                    m2566 = C2105.m6981("ۜۨ") ^ i12;
                    i2 = ((m2566 ^ i13) * (-4959)) ^ 280529564;
                    i3 = 1912755604;
                    i15 = m2566 ^ i3;
                    i14 = i2;
                case -2066982463:
                case -560535590:
                    str = str4;
                    int i21 = i18 + i19;
                    i20 = i21 + i21;
                    s2 = 2664;
                    if (C1128.f4106 <= 0) {
                        str4 = str;
                        int m25662 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = obj2;
                        i4 = ((m25662 ^ i13) * 24699) ^ (-2051729390);
                        i15 = m25662 ^ 915590484;
                        i14 = i4;
                        obj2 = obj;
                    } else {
                        m69812 = (i13 - C0630.m2566("᩷۟")) * 21;
                        i6 = ((m69812 ^ i12) * 7621) ^ 975720251;
                        i7 = -157719547;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                case -2058751079:
                case 1305540069:
                    C11340.m28031();
                    C1005.m3501();
                    break;
                case -1907657103:
                case 764578357:
                    break;
                case -1901620397:
                case -489266881:
                    C0714.m2805();
                    C3911.m11924();
                    str = str4;
                    m69812 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                    i6 = ((m69812 ^ i12) * 21819) ^ 1114531370;
                    i7 = 995928844;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1891256102:
                case -1394629087:
                    str4 = C3683.m11225(sArr2, i16, i17, i8);
                    if (C3911.f12484 >= 0) {
                        int m256622 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = obj2;
                        i4 = ((m256622 ^ i13) * 24699) ^ (-2051729390);
                        i15 = m256622 ^ 915590484;
                        i14 = i4;
                        obj2 = obj;
                    } else {
                        m2566 = C0630.m2566("᩷ܿ") ^ i12;
                        i2 = ((m2566 ^ i13) * (-13693)) ^ 700767948;
                        i3 = -217615592;
                        i15 = m2566 ^ i3;
                        i14 = i2;
                    }
                case -1739116343:
                case 727425263:
                    obj = obj2;
                    str = str4;
                    sArr3 = f15520;
                    if (RunnableC0588.f2309 >= 0) {
                        obj2 = obj;
                        m69812 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((m69812 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    } else {
                        m6981 = C2105.m6981("ۤ۫") ^ i12;
                        i4 = ((m6981 ^ i13) * 27793) ^ (-104687466);
                        i5 = 334599161;
                        int i22 = m6981 ^ i5;
                        str4 = str;
                        i15 = i22;
                        i14 = i4;
                        obj2 = obj;
                    }
                case -1604857990:
                case 2048901732:
                    str = str4;
                    sArr = f15520;
                    i9 = 162;
                    i10 = 9;
                    if (C3432.f10845 < 0) {
                        m69812 = (i12 - C2105.m6981("۬᩺")) * 47;
                        i6 = ((m69812 ^ i13) * (-13967)) ^ 928260315;
                        i7 = -1787157348;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    m69812 = C0630.m2566("۟ۜ") ^ i13;
                    i6 = ((m69812 ^ i12) * (-20761)) ^ 260364437;
                    i7 = 1561108285;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1562902167:
                case 1038621358:
                    str = str4;
                    i8 = 54188;
                    m69812 = (i13 - C0630.m2566("ۤܽ")) * (-109);
                    i6 = ((m69812 ^ i12) * 829) ^ 1979807539;
                    i7 = -1922641024;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1492726379:
                case 308541337:
                    if (C22628.f73083 > 0) {
                        m2566 = C2105.m6981("ۜۨ") ^ i12;
                        i2 = ((m2566 ^ i13) * (-4959)) ^ 280529564;
                        i3 = 1912755604;
                        i15 = m2566 ^ i3;
                        i14 = i2;
                    } else {
                        str = str4;
                        m69812 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((m69812 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                case -1411747625:
                case 704169410:
                    str = str4;
                    str3 = C11340.m28025(sArr4, 171, 66, i8);
                    if (C1773.f6144 > 0) {
                        m69812 = (C2105.m6981("ۚ᩹") + i12) * (-95);
                        i6 = ((m69812 ^ i13) * 22109) ^ (-894815874);
                        i7 = -42242097;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    m69812 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                    i6 = ((m69812 ^ i12) * 21819) ^ 1114531370;
                    i7 = 995928844;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1373751791:
                case 1154639814:
                    if (i != -1) {
                        m69812 = (C2105.m6981("۠ܽ") ^ i13) * (-79);
                        str = str4;
                        i6 = ((m69812 ^ i12) * (-6159)) ^ 12408023;
                        i7 = -490369837;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    str = str4;
                    m69812 = C0630.m2566("᩵֫") ^ i12;
                    i6 = ((m69812 ^ i13) * (-15631)) ^ (-212006834);
                    i7 = 1928155884;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1095237963:
                case 271712158:
                    str = str4;
                    int i23 = s + s2;
                    if ((i23 * i23) - i20 <= 0) {
                        m69812 = C0630.m2566("᩸᩶") ^ i12;
                        i6 = ((m69812 ^ i13) * 31919) ^ (-2008600039);
                        i7 = 1585337052;
                    } else {
                        m69812 = C2105.m6981("᩺᩵") ^ i13;
                        i6 = ((m69812 ^ i12) * 27023) ^ 822848739;
                        i7 = 500031451;
                    }
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -1021701211:
                case 122156306:
                    str = str4;
                    C11233.m27800(obj2, str3);
                    clipboardManager = (ClipboardManager) obj2;
                    m69812 = C2105.m6981("ۡ֡") ^ i13;
                    i6 = ((m69812 ^ i12) * (-29727)) ^ (-2050251897);
                    i7 = -1076147894;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -593177594:
                case -336054371:
                    str = str4;
                    try {
                        clipboardManager.setText(charSequence);
                        int m25663 = C0630.m2566("ᩳܽ") ^ i13;
                        i14 = ((m25663 ^ i12) * 4791) ^ 810968749;
                        str2 = str;
                        i15 = m25663 ^ 284358875;
                    } catch (Throwable unused) {
                        m69812 = C2105.m6981("ܶ۟") ^ i12;
                        i6 = ((m69812 ^ i13) * (-6331)) ^ 2123828850;
                        i7 = 2084319216;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    str4 = str2;
                case -370441088:
                case 503687899:
                    str = str4;
                    obj2 = m14326(str5);
                    sArr4 = f15520;
                    if (C1047.f3863 < 0) {
                        m69812 = (C0630.m2566("ۨۜ") + i12) * 9;
                        i6 = ((m69812 ^ i13) * 2289) ^ (-2112529131);
                        i7 = 1242545376;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    m69812 = C0630.m2566("۟ۜ") ^ i13;
                    i6 = ((m69812 ^ i12) * (-20761)) ^ 260364437;
                    i7 = 1561108285;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -339190887:
                case 593043135:
                    try {
                        C3663.m11161(i);
                        str = str4;
                        m69812 = C0630.m2566("᩵֫") ^ i12;
                        i6 = ((m69812 ^ i13) * (-15631)) ^ (-212006834);
                        i7 = 1928155884;
                    } catch (Throwable unused2) {
                        str = str4;
                        m69812 = C2105.m6981("ܶ۟") ^ i12;
                        i6 = ((m69812 ^ i13) * (-6331)) ^ 2123828850;
                        i7 = 2084319216;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case -279686603:
                case 833842568:
                    str = str4;
                    c = 161;
                    if (C2958.f9394 < 0) {
                        obj = obj2;
                        m6981 = (C2105.m6981("᩹ۚ") ^ i13) * (-57);
                        i4 = ((m6981 ^ i12) * 15175) ^ (-1941465569);
                        i5 = 1570123343;
                        int i222 = m6981 ^ i5;
                        str4 = str;
                        i15 = i222;
                        i14 = i4;
                        obj2 = obj;
                    }
                    str4 = str;
                    int m2566222 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                    obj = obj2;
                    i4 = ((m2566222 ^ i13) * 24699) ^ (-2051729390);
                    i15 = m2566222 ^ 915590484;
                    i14 = i4;
                    obj2 = obj;
                case -265180240:
                case -144819281:
                    str = str4;
                    str5 = C4616.m13542(sArr, i9, i10, i8);
                    if (!C2520.m8026()) {
                        m69812 = C0630.m2566("֡۠") ^ i13;
                        i6 = ((m69812 ^ i12) * 5811) ^ (-1389670366);
                        i7 = 1244052403;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                    m69812 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                    i6 = ((m69812 ^ i12) * 21819) ^ 1114531370;
                    i7 = 995928844;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                case 50353413:
                case 154132695:
                    C2272.m7503();
                    if (C4263.m12819() < 0) {
                        str = str4;
                        m69812 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((m69812 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    } else {
                        m2566 = C0630.m2566("᩹ۜ") ^ i12;
                        i2 = ((m2566 ^ i13) * 23159) ^ (-1379755889);
                        i3 = 1243318001;
                        i15 = m2566 ^ i3;
                        i14 = i2;
                    }
                case 262231547:
                case 886878539:
                    C1504.m5167(C0630.m2566(str4) ^ 2127039692);
                    break;
                case 422207029:
                case 2119850941:
                    str = str4;
                    s = sArr3[c];
                    i18 = s * s;
                    i19 = 7096896;
                    if (C1047.f3863 >= 0) {
                        str4 = str;
                        int m25662222 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = obj2;
                        i4 = ((m25662222 ^ i13) * 24699) ^ (-2051729390);
                        i15 = m25662222 ^ 915590484;
                        i14 = i4;
                        obj2 = obj;
                    } else {
                        m69812 = (i12 - C2105.m6981("ۗۚ")) * (-77);
                        i6 = ((m69812 ^ i13) * 9557) ^ (-1332667808);
                        i7 = -2041290887;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    }
                case 1240282327:
                case 1815160989:
                    str = str4;
                    i8 = 11391;
                    m69812 = (i13 - C0630.m2566("ۤܽ")) * (-109);
                    i6 = ((m69812 ^ i12) * 829) ^ 1979807539;
                    i7 = -1922641024;
                    str2 = str;
                    i15 = m69812 ^ i7;
                    i14 = i6;
                    str4 = str2;
                default:
                    if (C3019.f9544 >= 0) {
                        str = str4;
                        m69812 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((m69812 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                        str2 = str;
                        i15 = m69812 ^ i7;
                        i14 = i6;
                        str4 = str2;
                    } else {
                        m2566 = C2105.m6981("ۜۨ") ^ i12;
                        i2 = ((m2566 ^ i13) * (-4959)) ^ 280529564;
                        i3 = 1912755604;
                        i15 = m2566 ^ i3;
                        i14 = i2;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        if (l.C5695.f17556 >= 0) goto L17;
     */
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final l.C17209 m14323() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14323():l.ܿ۟᩵");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m14334(View view) {
        int i = 0;
        int i2 = -194065089;
        int i3 = C1294.f4556;
        int i4 = C4117.f13076;
        int m2566 = (C0630.m2566("֨۬") + i3) * (-37);
        int i5 = ((m2566 ^ i4) * (-10447)) ^ (-137821132);
        int i6 = -1138875232;
        while (true) {
            i2 = ((((i2 ^ i4) * (-5451)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2058736372:
                case 248907940:
                    if (C7106.f21815 == 0) {
                        m2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        m2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((m2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    }
                case -1928830013:
                case -1066013680:
                    m14328(i, view);
                    m2566 = (C0630.m2566("᩵ᩴ") + i4) * 85;
                    i5 = ((m2566 ^ i3) * 4629) ^ (-1546677252);
                    i6 = 1207087756;
                case -1778661710:
                case 1459499255:
                    break;
                case -1648359396:
                case 1390127266:
                    C3683.m11222();
                    if (C2272.f7362) {
                        m2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((m2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    } else {
                        m2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((m2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    }
                case -1431425251:
                case 1901586004:
                    if (C1504.f5354) {
                        m2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((m2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    } else {
                        m2566 = C2105.m6981("֨֡") ^ i4;
                        i5 = ((m2566 ^ i3) * (-30521)) ^ 1157158077;
                        i6 = 309414919;
                    }
                case -1352896174:
                case 1398208799:
                    ViewOnClickListenerC1958.m6429();
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((m2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    } else {
                        m2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((m2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    }
                case -1331825812:
                case -552065020:
                    if (RunnableC3474.m10630()) {
                        m2566 = (C2105.m6981("ۤ۠") ^ i3) * (-123);
                        i5 = ((m2566 ^ i4) * 16849) ^ 360682160;
                        i6 = -1305356623;
                    } else {
                        m2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((m2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    }
                case -1290708902:
                case 1940477366:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((m2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    } else {
                        m2566 = C2105.m6981("ܶۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9765)) ^ 1297840268;
                        i6 = -430665813;
                    }
                case -1237394977:
                case 1461862056:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        m2566 = (i3 - C2105.m6981("۫ܶ")) * 115;
                        i5 = ((m2566 ^ i4) * (-9827)) ^ (-2067174693);
                        i6 = -1294864079;
                    }
                case -478565679:
                case 1011765254:
                    ViewOnClickListenerC1958.m6429();
                    C2105.m6982();
                    break;
                case -56667940:
                case 1572420992:
                    if (C21923.f70183 != 0) {
                        m2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((m2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    } else {
                        m2566 = C2105.m6981("᩶ۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24805) ^ 2130440997;
                        i6 = 570683098;
                    }
                case 264075093:
                case 927339987:
                    if (view != null) {
                        m2566 = (i3 - C0630.m2566("ۛ֨")) * (-21);
                        i5 = ((m2566 ^ i4) * 15179) ^ (-768028102);
                        i6 = 1124967702;
                    } else {
                        m2566 = (C0630.m2566("᩵ᩴ") + i4) * 85;
                        i5 = ((m2566 ^ i3) * 4629) ^ (-1546677252);
                        i6 = 1207087756;
                    }
                case 307736753:
                case 1913171841:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((m2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    } else {
                        m2566 = C2105.m6981("֨ۜ") ^ i4;
                        i5 = ((m2566 ^ i3) * 25673) ^ 2038600484;
                        i6 = 191893779;
                    }
                case 484982385:
                case 1709666448:
                    if (C4263.f13799 <= 0) {
                        m2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        m2566 = (C2105.m6981("۬۫") + i3) * (-9);
                        i5 = ((m2566 ^ i4) * 11949) ^ 1187300897;
                        i6 = -1426023760;
                    }
                case 624309464:
                case 742994492:
                    C22628.m50615();
                    m2566 = C0630.m2566("ۗۘ") ^ i4;
                    i5 = ((m2566 ^ i3) * (-25377)) ^ 344256036;
                    i6 = 1787236416;
                case 1039708902:
                case 1422212738:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ۢ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-13721)) ^ 2094919455;
                        i6 = 32197595;
                    } else {
                        m2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((m2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    }
                case 1152934489:
                case 1715870743:
                    if (C0422.f1886 <= 0) {
                        m2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۢ۟")) * (-103);
                        i5 = ((m2566 ^ i3) * (-1815)) ^ (-1550912200);
                        i6 = 164846891;
                    }
                default:
                    i = 0;
                    if (C1128.m3851() <= 0) {
                        m2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((m2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    } else {
                        m2566 = (C0630.m2566("ۜ᩷") + i3) * (-47);
                        i5 = ((m2566 ^ i4) * (-25381)) ^ 1655183634;
                        i6 = -1402122638;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (l.C2272.f7362 != false) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m14306(int r25, java.lang.Object... r26) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14306(int, java.lang.Object[]):java.lang.String");
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Typeface m14319() {
        Object obj = null;
        String str = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1422248670;
        int i7 = ViewOnClickListenerC1958.f6529;
        int i8 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("ۢۛ") ^ i8;
        int i9 = ((m6981 ^ i7) * 13377) ^ 1821186774;
        int i10 = -447770448;
        while (true) {
            i6 = ((((i6 ^ i7) * 26369) >> 31) & i9) ^ (m6981 ^ i10);
            switch (i6) {
                case -2083628019:
                case -366621271:
                    i2 = s * s;
                    i3 = 352650841;
                    if (C4117.m12364() != 0) {
                        m6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((m6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        m6981 = C2105.m6981("ܰ۟") ^ i7;
                        i9 = ((m6981 ^ i8) * (-1383)) ^ (-816140046);
                        i10 = -389742199;
                    }
                case -2053793819:
                case 863587551:
                    C0237.m1481();
                    C3432.m10477();
                    m6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                    i9 = ((m6981 ^ i7) * (-26951)) ^ (-1290754269);
                    i10 = 1981695299;
                case -1958014549:
                case 657380084:
                    i4 = 29777;
                    m6981 = C2105.m6981("ۡۚ") ^ i7;
                    i9 = ((m6981 ^ i8) * (-12731)) ^ (-1337908067);
                    i10 = -1230509708;
                case -1514149410:
                case 1369360979:
                    str = RunnableC3474.m10633(sArr2, i5, 13, i4);
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("ۨ۬") + i7) * 109;
                        i9 = ((m6981 ^ i8) * 4383) ^ 426505197;
                        i10 = -1466894957;
                    } else {
                        m6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((m6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    }
                case -1510041720:
                case 974296247:
                    C1420.m4913();
                    return null;
                case -1500289872:
                case -1136896085:
                    if (C5695.m16023() >= 0) {
                        m6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((m6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    } else {
                        m6981 = (C0630.m2566("ۨۖ") + i8) * 119;
                        i9 = ((m6981 ^ i7) * (-17097)) ^ (-95564500);
                        i10 = -265596698;
                    }
                case -1125761007:
                case -539337599:
                    if (i - (i2 + i3) <= 0) {
                        m6981 = C2105.m6981("ۚ᩷") ^ i8;
                        i9 = ((m6981 ^ i7) * 15403) ^ (-166206433);
                        i10 = 447225948;
                    } else {
                        m6981 = (C2105.m6981("ۘ۬") + i7) * (-89);
                        i9 = ((m6981 ^ i8) * 29263) ^ 826767385;
                        i10 = 1399439506;
                    }
                case -1021503180:
                case 1167078715:
                    sArr2 = f15520;
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        m6981 = C0630.m2566("ۗܶ") ^ i8;
                        i9 = ((m6981 ^ i7) * 13863) ^ (-1869587524);
                        i10 = -393534449;
                    }
                case -993742042:
                case 542440106:
                    i = 37558 * s;
                    if (C4263.f13799 <= 0) {
                        m6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((m6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        m6981 = (C2105.m6981("֨᩻") + i8) * 53;
                        i9 = ((m6981 ^ i7) * (-32205)) ^ 470668422;
                        i10 = -1214734228;
                    }
                case -960935751:
                case 460811985:
                    C7106.m19120();
                    if (C0714.m2805()) {
                        m6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((m6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    } else {
                        m6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((m6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    }
                case -835725198:
                case 381923040:
                    if (C4263.f13799 > 0) {
                        m6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((m6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    } else {
                        m6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    }
                case -494628518:
                case -24409645:
                    obj = f15521.getValue();
                    if (C2520.m8026()) {
                        m6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((m6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        m6981 = C2105.m6981("ܶۨ") ^ i8;
                        i9 = ((m6981 ^ i7) * 27197) ^ 1721259388;
                        i10 = -730657693;
                    }
                case -333021569:
                case -136459249:
                    i4 = 46087;
                    m6981 = C2105.m6981("ۡۚ") ^ i7;
                    i9 = ((m6981 ^ i8) * (-12731)) ^ (-1337908067);
                    i10 = -1230509708;
                case -47745973:
                case 561528782:
                    s = sArr[c];
                    if (C4616.m13552() != 0) {
                        m6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((m6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        m6981 = (C2105.m6981("ܰܺ") ^ i7) * 39;
                        i9 = ((m6981 ^ i8) * 5119) ^ (-1703247341);
                        i10 = 362521709;
                    }
                case 736619144:
                case 2036867098:
                    i5 = 356;
                    if (C4117.m12364() != 0) {
                        m6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        m6981 = (C2105.m6981("ۡ᩶") + i7) * 93;
                        i9 = ((m6981 ^ i8) * 3599) ^ (-1353766329);
                        i10 = 888558946;
                    }
                case 1093990303:
                case 1963953458:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((m6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    } else {
                        m6981 = (i7 - C2105.m6981("۠ۙ")) * 59;
                        i9 = ((m6981 ^ i8) * 9619) ^ 231983386;
                        i10 = 1467837077;
                    }
                case 1341933905:
                case 1957467043:
                    sArr = f15520;
                    c = 355;
                    if (C0050.f910 >= 0) {
                        m6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        m6981 = (C0630.m2566("᩹֫") + i7) * (-51);
                        i9 = ((m6981 ^ i8) * (-9535)) ^ (-91877091);
                        i10 = 1794688290;
                    }
                case 1454993303:
                case 1715104853:
                    if (C3746.f11829 <= 0) {
                        m6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((m6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        m6981 = (C0630.m2566("ۧ֫") ^ i8) * (-105);
                        i9 = ((m6981 ^ i7) * 7647) ^ 1129202288;
                        i10 = -1780517271;
                    }
                default:
                    C4159.m12575(obj, str);
                    return (Typeface) obj;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (l.C1294.f4556 < 0) goto L7;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14311(android.content.BroadcastReceiver r19, android.content.IntentFilter r20) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14311(android.content.BroadcastReceiver, android.content.IntentFilter):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (l.C1916.f6442 != false) goto L43;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14316(java.lang.Runnable r21, long r22) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14316(java.lang.Runnable, long):void");
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Handler m14324() {
        return f15519;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14309(long j, Runnable runnable) {
        f15519.postDelayed(runnable, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (l.C3537.f11231 >= 0) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14314(java.lang.CharSequence r22) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14314(java.lang.CharSequence):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007d, code lost:
    
        if (l.C7106.f21815 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        r2 = l.C2105.m6981("ܶ᩸") ^ r21;
        r5 = ((r2 ^ r22) * 2071) ^ 1204184905;
        r12 = 1305606625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (l.C0630.m2564() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        if (l.C3663.f11553 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (l.C1047.f3863 >= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        if (l.C0798.m3010(r28) == false) goto L57;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m14328(final int r27, final android.view.View r28) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14328(int, android.view.View):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Drawable m14305(int i) {
        Drawable m48345 = C21311.m48345(C0382.m1842(), i);
        C0714.m2808(m48345);
        return m48345;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14307(int i, View view) {
        int i2 = -1245195250;
        int i3 = C3537.f11231;
        int i4 = C2167.f7158;
        int m2566 = (i4 - C0630.m2566("ۘۙ")) * (-77);
        int i5 = ((m2566 ^ i3) * 23341) ^ (-1107144456);
        int i6 = -1246729424;
        while (true) {
            i2 = ((((i2 ^ i3) * (-275)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1992676789:
                case -663317106:
                    C3683.m11222();
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("۫ܶ") ^ i4) * 61;
                        i5 = ((m2566 ^ i3) * (-5709)) ^ (-243024206);
                        i6 = 939262902;
                    } else {
                        m2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((m2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    }
                case -1807388312:
                case 605358270:
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((m2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        m2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((m2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    }
                case -1386824022:
                case 1806046263:
                    if (C3245.m9925() != 0) {
                        m2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((m2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        m2566 = (C2105.m6981("ܽܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * 19717) ^ 1094270350;
                        i6 = -1261385159;
                    }
                case -1322573882:
                case -83917384:
                    m14328(i + 1, view);
                    m2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i5 = ((m2566 ^ i4) * (-449)) ^ 490425476;
                    i6 = -1739647133;
                case -1297422807:
                case -218355907:
                    if (C3911.f12484 >= 0) {
                        m2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((m2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    } else {
                        m2566 = (i4 - C2105.m6981("۠᩹")) * (-39);
                        i5 = ((m2566 ^ i3) * (-7409)) ^ (-331661413);
                        i6 = 383341340;
                    }
                case -1001602675:
                case -506695391:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((m2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        m2566 = C2105.m6981("᩻ۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-1639)) ^ (-1450998895);
                        i6 = -1821832582;
                    }
                case -972269153:
                case 2042652316:
                    if (view.isFocused()) {
                        m2566 = C2105.m6981("ۧۡ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-1621)) ^ 663579116;
                        i6 = 1753042746;
                    } else {
                        m2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                case -945867538:
                case -424829861:
                    if (C0483.m2121()) {
                        m2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((m2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    } else {
                        m2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((m2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    }
                case -721294392:
                case -37173643:
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("ᩴ᩶") ^ i3;
                        i5 = ((m2566 ^ i4) * 10669) ^ (-1250085438);
                        i6 = 591816181;
                    } else {
                        m2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((m2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    }
                case -597088513:
                case -108853516:
                    break;
                case -412662750:
                case 717246429:
                    if (C2272.m7503()) {
                        m2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((m2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    } else {
                        m2566 = C0630.m2566("ۘۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * 18003) ^ 1558963771;
                        i6 = -1945461659;
                    }
                case -181635687:
                case 1217021219:
                    if (view.isAttachedToWindow()) {
                        m2566 = (i4 - C2105.m6981("ۤ᩻")) * (-101);
                        i5 = ((m2566 ^ i3) * (-28997)) ^ 1587219614;
                        i6 = 1345575580;
                    } else {
                        m2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                case -26383057:
                case 1286797076:
                    ServiceConnectionC3453.m10564();
                    C5695.m16023();
                    break;
                case 148642142:
                case 728552484:
                    C0630.m2564();
                    m2566 = (C0630.m2566("۫ܶ") ^ i4) * 61;
                    i5 = ((m2566 ^ i3) * (-5709)) ^ (-243024206);
                    i6 = 939262902;
                case 285914249:
                case 778581362:
                    if (view.isShown()) {
                        m2566 = C2105.m6981("ᩳۙ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4181)) ^ (-2106107251);
                        i6 = 397831955;
                    } else {
                        m2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                case 292085946:
                case 970870992:
                    if (C1128.m3851() <= 0) {
                        m2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((m2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    } else {
                        m2566 = C2105.m6981("֫֫") ^ i4;
                        i5 = ((m2566 ^ i3) * (-321)) ^ 27881483;
                        i6 = -208243045;
                    }
                case 344579311:
                case 600144934:
                    if (C3746.f11829 <= 0) {
                        m2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((m2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    } else {
                        m2566 = C2105.m6981("ۘۢ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-29531)) ^ (-852687098);
                        i6 = -41038312;
                    }
                case 923455749:
                case 1121140209:
                    if (C3019.m9255() <= 0) {
                        m2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((m2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        m2566 = (i4 - C0630.m2566("ۖ᩷")) * 127;
                        i5 = ((m2566 ^ i3) * (-3673)) ^ 295683677;
                        i6 = -1072585727;
                    }
                case 1505891772:
                case 1572031277:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((m2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        m2566 = (C2105.m6981("۟ۛ") ^ i4) * (-21);
                        i5 = ((m2566 ^ i3) * 14433) ^ (-363324119);
                        i6 = 1078778953;
                    }
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((m2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        m2566 = (C0630.m2566("᩵᩹") ^ i3) * 57;
                        i5 = ((m2566 ^ i4) * (-25529)) ^ (-1113329340);
                        i6 = 1404344287;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (l.C22628.m50615() == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (l.C0483.f2088 < 0) goto L61;
     */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.pm.PackageManager m14320() {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14320():android.content.pm.PackageManager");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AssetManager m14325() {
        AssetManager assetManager = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1958934046;
        int i7 = C1420.f5096;
        int i8 = C0630.f2410;
        int m6981 = C2105.m6981("۫ܳ") ^ i8;
        int i9 = ((m6981 ^ i7) * 16195) ^ 145624398;
        int i10 = -222835601;
        while (true) {
            i6 = ((((i6 ^ i7) * 1103) >> 31) & i9) ^ (m6981 ^ i10);
            switch (i6) {
                case -1688156773:
                case -1134649628:
                    if ((i2 + i3) - i >= 0) {
                        m6981 = (C2105.m6981("ᩳۗ") ^ i8) * 21;
                        i9 = ((m6981 ^ i7) * 15985) ^ (-1941615818);
                        i10 = 987500260;
                    } else {
                        m6981 = (i7 - C2105.m6981("ܺ֫")) * 79;
                        i9 = ((m6981 ^ i8) * 22593) ^ 1993335900;
                        i10 = -148327197;
                    }
                case -1661491843:
                case 882677939:
                    if (C1005.f3721) {
                        m6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((m6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        m6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    }
                case -1493840523:
                case 1301264963:
                    assetManager = C3432.m10479().getAssets();
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((m6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    } else {
                        m6981 = C2105.m6981("ۛ᩺") ^ i7;
                        i9 = ((m6981 ^ i8) * 25135) ^ (-1555033810);
                        i10 = 444266233;
                    }
                case -1475871103:
                case 1242157857:
                    sArr = f15520;
                    c = 445;
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((m6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        m6981 = C2105.m6981("ܰ֫") ^ i7;
                        i9 = ((m6981 ^ i8) * 12093) ^ 1871676941;
                        i10 = 1457238176;
                    }
                case -1251092678:
                case 997819621:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((m6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    } else {
                        m6981 = C0630.m2566("ۖ֨") ^ i8;
                        i9 = ((m6981 ^ i7) * 9725) ^ 158040849;
                        i10 = -1119995653;
                    }
                case -1241851719:
                case 477779438:
                    i4 = 47786;
                    m6981 = C0630.m2566("᩶ܶ") ^ i8;
                    i9 = ((m6981 ^ i7) * 12255) ^ (-2126638760);
                    i10 = -62514765;
                case -885680223:
                case -636259139:
                    i5 = 446;
                    if (C7811.f24123 >= 0) {
                        m6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((m6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        m6981 = C2105.m6981("᩷ᩴ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-28743)) ^ 1950514423;
                        i10 = 350518495;
                    }
                case -826920666:
                case 1243385166:
                    i4 = 9640;
                    m6981 = C0630.m2566("᩶ܶ") ^ i8;
                    i9 = ((m6981 ^ i7) * 12255) ^ (-2126638760);
                    i10 = -62514765;
                case -728462175:
                case 1815431068:
                    i = s * 1486;
                    if (C1711.f5919) {
                        m6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((m6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    } else {
                        m6981 = C0630.m2566("ܰܳ") ^ i8;
                        i9 = ((m6981 ^ i7) * 4093) ^ 1540767706;
                        i10 = 291123197;
                    }
                case -656313425:
                case -360881805:
                    C1420.m4913();
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((m6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        m6981 = C2105.m6981("ܰᩴ") ^ i8;
                        i9 = ((m6981 ^ i7) * 14529) ^ (-1159269416);
                        i10 = -968379521;
                    }
                case -653463629:
                case -27224968:
                    C1128.m3851();
                    if (C0050.f910 < 0) {
                        m6981 = C2105.m6981("ܰᩴ") ^ i8;
                        i9 = ((m6981 ^ i7) * 14529) ^ (-1159269416);
                        i10 = -968379521;
                    } else {
                        m6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((m6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    }
                case -468929017:
                case 353472335:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((m6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    } else {
                        m6981 = C2105.m6981("ۚۜ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-32089)) ^ 1785915494;
                        i10 = 1596831570;
                    }
                case -410120657:
                case 472069502:
                    s = sArr[c];
                    if (C1773.f6144 <= 0) {
                        m6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        m6981 = (C0630.m2566("ۨۨ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((m6981 ^ i8) * (-24847)) ^ (-1448343569);
                        i10 = -1578502872;
                    }
                case -310185396:
                case 913328814:
                    C2958.m9034();
                    C1420.m4913();
                    return null;
                case -201509788:
                case 1314381124:
                    C2126.m7031(assetManager, C0382.m1840(sArr2, i5, 14, i4));
                    return assetManager;
                case 94208854:
                case 1923485120:
                    if (C3911.f12484 >= 0) {
                        m6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        m6981 = C0630.m2566("ۨ᩻") ^ i7;
                        i9 = ((m6981 ^ i8) * 6913) ^ (-2110141282);
                        i10 = -156763075;
                    }
                case 1273636536:
                case 1887473391:
                    i2 = s * s;
                    i3 = 552049;
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        m6981 = (i7 - C0630.m2566("ۚ᩻")) * 77;
                        i9 = ((m6981 ^ i8) * 6597) ^ 261961194;
                        i10 = -538792141;
                    }
                case 1341364991:
                case 1504756626:
                    sArr2 = f15520;
                    if (C1916.f6442) {
                        m6981 = (i8 - C2105.m6981("᩹۠")) * (-95);
                        i9 = ((m6981 ^ i7) * (-9019)) ^ 256111339;
                        i10 = -1832920130;
                    } else {
                        m6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((m6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    }
                default:
                    ViewOnClickListenerC1958.m6429();
                    m6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                    i9 = ((m6981 ^ i8) * 15321) ^ (-1126366225);
                    i10 = 447684959;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (l.C3245.f10203 > 0) goto L20;
     */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.res.Resources m14338() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14338():android.content.res.Resources");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ContentResolver m14336() {
        ContentResolver contentResolver = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -725426835;
        int i7 = C4263.f13799;
        int i8 = C4075.f12947;
        int m2566 = (C0630.m2566("ܰۨ") ^ i7) * (-115);
        int i9 = ((m2566 ^ i8) * (-31051)) ^ 1813085893;
        int i10 = 1292092574;
        while (true) {
            i6 = ((((i6 ^ i8) * 27779) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -2054487261:
                case 928243662:
                    sArr = f15520;
                    c = 685;
                    if (C4263.f13799 <= 0) {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        m2566 = C0630.m2566("ۗܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-12067)) ^ 1348114083;
                        i10 = -1289157586;
                    }
                case -2037291254:
                case 1957189424:
                    sArr2 = f15520;
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("ܳ᩷") ^ i8;
                        i9 = ((m2566 ^ i7) * (-19915)) ^ 1232288442;
                        i10 = -1657393406;
                    } else {
                        m2566 = (C2105.m6981("᩺۫") ^ i7) * (-125);
                        i9 = ((m2566 ^ i8) * (-26693)) ^ (-1478482481);
                        i10 = 1856034760;
                    }
                case -2022312391:
                case 255310121:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        m2566 = (i8 - C0630.m2566("ᩳܶ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((m2566 ^ i7) * (-1071)) ^ (-1718239191);
                        i10 = 527195562;
                    }
                case -1330324434:
                case 1715812333:
                    i4 = 51802;
                    m2566 = C2105.m6981("ۡۘ") ^ i8;
                    i9 = ((m2566 ^ i7) * 23259) ^ 563595538;
                    i10 = 1605458890;
                case -1304216735:
                case -1125371702:
                    if (C3537.m10746() > 0) {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        m2566 = C2105.m6981("֡ܿ") ^ i8;
                        i9 = ((m2566 ^ i7) * 27955) ^ 1084240703;
                        i10 = 1608643036;
                    }
                case -1225656160:
                case 189756538:
                    C0798.m2998();
                    return null;
                case -1185705836:
                case 1073795857:
                    s = sArr[c];
                    if (C1047.f3863 >= 0) {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        m2566 = C2105.m6981("ۛ۠") ^ i8;
                        i9 = ((m2566 ^ i7) * 18637) ^ 1226250777;
                        i10 = -765233249;
                    }
                case -861039712:
                case 359516030:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                        i9 = ((m2566 ^ i8) * 31171) ^ 1952674161;
                        i10 = -1767497637;
                    } else {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    }
                case -807688403:
                case 53689475:
                    i5 = 686;
                    if (C3746.m11369() >= 0) {
                        m2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((m2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        m2566 = (C0630.m2566("۟۬") ^ i8) * (-101);
                        i9 = ((m2566 ^ i7) * 5977) ^ 2145817517;
                        i10 = 715304100;
                    }
                case -800695237:
                case -598336945:
                    if (C1047.m3599() >= 0) {
                        m2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((m2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        m2566 = (C2105.m6981("ܽ᩷") + i8) * (-55);
                        i9 = ((m2566 ^ i7) * (-8437)) ^ (-2013083765);
                        i10 = -197552429;
                    }
                case -703052826:
                case 1041987483:
                    i4 = 40468;
                    m2566 = C2105.m6981("ۡۘ") ^ i8;
                    i9 = ((m2566 ^ i7) * 23259) ^ 563595538;
                    i10 = 1605458890;
                case -675654214:
                case 1001470479:
                    C1128.m3851();
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((m2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        m2566 = C0630.m2566("ܳ᩷") ^ i8;
                        i9 = ((m2566 ^ i7) * (-19915)) ^ 1232288442;
                        i10 = -1657393406;
                    }
                case -672492027:
                case 1464293514:
                    contentResolver = C0382.m1842().getContentResolver();
                    if (C4159.m12565() >= 0) {
                        m2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((m2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        m2566 = C2105.m6981("ۡ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * 7605) ^ 616083480;
                        i10 = 248163064;
                    }
                case -646151830:
                case 1513667874:
                    i = s * s;
                    i2 = 9174841;
                    if (C4159.f13567) {
                        m2566 = (C2105.m6981("ۙ֡") ^ i7) * 33;
                        i9 = ((m2566 ^ i8) * (-14391)) ^ 587229675;
                        i10 = -993038634;
                    } else {
                        m2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((m2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    }
                case -472195059:
                case 148069787:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C2105.m6981("֡ܿ") ^ i8;
                        i9 = ((m2566 ^ i7) * 27955) ^ 1084240703;
                        i10 = 1608643036;
                    } else {
                        m2566 = (i7 - C2105.m6981("ܶ᩵")) * 47;
                        i9 = ((m2566 ^ i8) * (-6937)) ^ (-1812289843);
                        i10 = 1291580604;
                    }
                case 426481075:
                case 1640319225:
                    C4159.m12575(contentResolver, C3019.m9250(sArr2, i5, 23, i4));
                    return contentResolver;
                case 961950767:
                case 1928077396:
                    C2958.m9034();
                    C2105.m6982();
                    m2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                    i9 = ((m2566 ^ i8) * 31171) ^ 1952674161;
                    i10 = -1767497637;
                case 1596544037:
                case 2067031574:
                    i3 = i + i2;
                    s2 = 6058;
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                        i9 = ((m2566 ^ i8) * 31171) ^ 1952674161;
                        i10 = -1767497637;
                    } else {
                        m2566 = C0630.m2566("ۗ᩶") ^ i7;
                        i9 = ((m2566 ^ i8) * 5389) ^ 1917185526;
                        i10 = -1896213547;
                    }
                default:
                    if (i3 - (s * s2) < 0) {
                        m2566 = C2105.m6981("֨ۜ") ^ i7;
                        i9 = ((m2566 ^ i8) * 25975) ^ (-1965718175);
                        i10 = 172484743;
                    } else {
                        m2566 = C2105.m6981("ۜۜ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-13463)) ^ (-1411910861);
                        i10 = 955192950;
                    }
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final File m14322() {
        File file = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 674260061;
        int i7 = C4117.f13076;
        int i8 = AbstractC2021.f6743;
        int m2566 = (C0630.m2566("ܳۧ") + i8) * (-11);
        int i9 = ((m2566 ^ i7) * (-25993)) ^ (-1348426);
        int i10 = -175790241;
        while (true) {
            i6 = ((((i6 ^ i7) * 11697) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -1882308569:
                case 672913356:
                    i = s * s;
                    i2 = 25735329;
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((m2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        m2566 = (i7 - C2105.m6981("ܰ۬")) * 7;
                        i9 = ((m2566 ^ i8) * (-32437)) ^ 1909275203;
                        i10 = -331748448;
                    }
                case -1792855418:
                case -1483039142:
                    i4 = 34939;
                    m2566 = C2105.m6981("ܺ᩹") ^ i8;
                    i9 = ((m2566 ^ i7) * 30667) ^ (-159236322);
                    i10 = 1818523129;
                case -1542371031:
                case 117525598:
                    C1005.m3501();
                    return null;
                case -1368706398:
                case -1124344371:
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    } else {
                        m2566 = (C2105.m6981("ۙۖ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((m2566 ^ i8) * 32323) ^ 999685085;
                        i10 = 716282297;
                    }
                case -1289464356:
                case 1271212502:
                    sArr = f15520;
                    c = 414;
                    if (C11340.f33930 >= 0) {
                        m2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((m2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    } else {
                        m2566 = (i8 - C0630.m2566("ۖ֡")) * (-67);
                        i9 = ((m2566 ^ i7) * (-5295)) ^ (-48890363);
                        i10 = 1081044606;
                    }
                case -1287317043:
                case -1143606988:
                    i3 = i + i2;
                    s2 = 10146;
                    if (C0714.f2697 >= 0) {
                        m2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((m2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    } else {
                        m2566 = C2105.m6981("ܶۤ") ^ i8;
                        i9 = ((m2566 ^ i7) * 23461) ^ (-1725737112);
                        i10 = 116335365;
                    }
                case -1156990180:
                case -888341686:
                    if (C1128.f4106 <= 0) {
                        m2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((m2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        m2566 = C0630.m2566("ۚ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * 15709) ^ (-18673938);
                        i10 = -363755233;
                    }
                case -1044055963:
                case 314517349:
                    s = sArr[c];
                    if (C0382.f1805) {
                        m2566 = (C0630.m2566("ۤ᩵") + i8) * (-61);
                        i9 = ((m2566 ^ i7) * (-32209)) ^ (-414461922);
                        i10 = -689120869;
                    } else {
                        m2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((m2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    }
                case -1041439927:
                case 2060167469:
                    sArr2 = f15520;
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((m2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩻ܽ")) * 97;
                        i9 = ((m2566 ^ i8) * 18871) ^ 2050715092;
                        i10 = 832481620;
                    }
                case -793282255:
                case 265172879:
                    i5 = 415;
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩶") ^ i7) * 23;
                        i9 = ((m2566 ^ i8) * 4981) ^ (-570261268);
                        i10 = -1035749841;
                    }
                case -538221784:
                case 240828706:
                    C2126.m7031(file, C5695.m16034(sArr2, i5, 16, i4));
                    return file;
                case -152927528:
                case 254694746:
                    ViewOnClickListenerC1958.m6429();
                    if (C3537.f11231 < 0) {
                        m2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((m2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    } else {
                        m2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    }
                case 243335474:
                case 1346718440:
                    if (i3 - (s * s2) >= 0) {
                        m2566 = C2105.m6981("ۨܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * 29995) ^ (-1712856281);
                        i10 = -246163032;
                    } else {
                        m2566 = (C2105.m6981("֡ۛ") ^ i7) * 95;
                        i9 = ((m2566 ^ i8) * (-9021)) ^ 1544022971;
                        i10 = 2102139266;
                    }
                case 265168178:
                case 986578949:
                    file = C3432.m10479().getFilesDir();
                    if (C4263.f13799 <= 0) {
                        m2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((m2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    } else {
                        m2566 = C0630.m2566("ܺᩳ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8903)) ^ (-677257519);
                        i10 = -1756981581;
                    }
                case 301600358:
                case 1597397772:
                    if (C7106.f21815 != 0) {
                        m2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((m2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    } else {
                        m2566 = (C2105.m6981("ܽۤ") + i7) * 41;
                        i9 = ((m2566 ^ i8) * (-9075)) ^ (-1291533777);
                        i10 = 761410644;
                    }
                case 345892180:
                case 1157859542:
                    RunnableC3474.m10630();
                    m2566 = C0630.m2566("ۨۛ") ^ i8;
                    i9 = ((m2566 ^ i7) * 13555) ^ 11028066;
                    i10 = 1370169134;
                case 453743648:
                case 1830275030:
                    if (C0964.f3626 != 0) {
                        m2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((m2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    } else {
                        m2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((m2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    }
                case 1130721530:
                case 1239734113:
                    i4 = 17877;
                    m2566 = C2105.m6981("ܺ᩹") ^ i8;
                    i9 = ((m2566 ^ i7) * 30667) ^ (-159236322);
                    i10 = 1818523129;
                default:
                    if (C2105.f7037 != 0) {
                        m2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((m2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    } else {
                        m2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((m2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final File m14340() {
        File file = null;
        int i = 781623778;
        int i2 = C1420.f5096;
        int i3 = C22628.f73083;
        int m2566 = C0630.m2566("ۨۘ") ^ i3;
        int i4 = ((m2566 ^ i2) * (-8543)) ^ 250954444;
        int i5 = 930710170;
        while (true) {
            i = ((((i ^ i2) * 5951) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1927749349:
                case 1122196190:
                    if (C1773.m5908() <= 0) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܺܶ")) * 69;
                        i4 = ((m2566 ^ i3) * 21859) ^ (-1448996003);
                        i5 = 508447094;
                    }
                case -1517775716:
                case 618724392:
                    File dataDir = C3432.m10479().getDataDir();
                    C0714.m2808(dataDir);
                    return dataDir;
                case -1180819163:
                case -902060120:
                    if (C1294.m4372() <= 0) {
                        m2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        m2566 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 19067) ^ (-226971253);
                        i5 = 1579223120;
                    }
                case -1101274464:
                case 351770389:
                    if (C11340.f33930 >= 0) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = C2105.m6981("֡۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 7245) ^ (-217876309);
                        i5 = 823886941;
                    }
                case -960294585:
                case -203200711:
                    file = C3432.m10479().getFilesDir();
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    } else {
                        m2566 = (i3 - C2105.m6981("֡᩶")) * 31;
                        i4 = ((m2566 ^ i2) * (-19271)) ^ 617744495;
                        i5 = 1728920276;
                    }
                case -954760591:
                case 969572833:
                    C2272.m7503();
                    C2272.m7503();
                    return null;
                case -590739576:
                case 614715259:
                    AbstractC2021.m6574();
                    if (C0714.f2697 < 0) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 69;
                        i4 = ((m2566 ^ i2) * 14735) ^ (-1534133355);
                        i5 = 189155391;
                    }
                case -521874427:
                case 1586836277:
                    if (C0483.f2088 >= 0) {
                        m2566 = (i2 - C0630.m2566("ܺܶ")) * 69;
                        i4 = ((m2566 ^ i3) * 21859) ^ (-1448996003);
                        i5 = 508447094;
                    } else {
                        m2566 = C2105.m6981("ᩴ۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 4179) ^ 1480409079;
                        i5 = 162128539;
                    }
                case -513260282:
                case 1922212863:
                    if (C0382.m1848()) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = (C2105.m6981("᩹᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-20457)) ^ 2134502074;
                        i5 = 1181447079;
                    }
                case -433849534:
                case 83376097:
                    if (C22628.f73083 <= 0) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = (C0630.m2566("ܽᩳ") ^ i2) * 11;
                        i4 = ((m2566 ^ i3) * 25509) ^ (-710832764);
                        i5 = -1295124282;
                    }
                case -331355257:
                case 1247806436:
                    if (C5695.f17556 >= 0) {
                        m2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    } else {
                        m2566 = (C0630.m2566("֫᩹") + i2) * 65;
                        i4 = ((m2566 ^ i3) * 21881) ^ (-1918950228);
                        i5 = 574783831;
                    }
                case 74809533:
                case 1533187344:
                    if (C1128.f4106 <= 0) {
                        m2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        m2566 = (C0630.m2566("ᩳ۫") ^ i3) * 73;
                        i4 = ((m2566 ^ i2) * (-28925)) ^ (-1054406834);
                        i5 = 186070132;
                    }
                case 501942657:
                case 1314476300:
                    File parentFile = file.getParentFile();
                    C2167.m7151(parentFile);
                    return parentFile;
                case 1035634228:
                case 1579105365:
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 69;
                        i4 = ((m2566 ^ i2) * 14735) ^ (-1534133355);
                        i5 = 189155391;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩵") ^ i2) * 47;
                        i4 = ((m2566 ^ i3) * (-11399)) ^ (-441692705);
                        i5 = -1205572055;
                    }
                case 1051509122:
                case 2143387842:
                    C0237.m1481();
                    m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                    i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                    i5 = 456043787;
                case 1406750882:
                case 1528861390:
                    if (C3746.f11829 <= 0) {
                        m2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((m2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        m2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    }
                case 1474697383:
                case 1934397756:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        m2566 = C2105.m6981("᩶᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * 5539) ^ (-660840610);
                        i5 = 1811903604;
                    }
                default:
                    if (Build.VERSION.SDK_INT >= 24) {
                        m2566 = C0630.m2566("֡֫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-32255)) ^ (-1792685079);
                        i5 = 285429473;
                    } else {
                        m2566 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 7055) ^ (-1122021156);
                        i5 = -2062880358;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (l.C11340.f33930 >= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (l.C0237.f1507 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (l.C2520.f8000 < 0) goto L18;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m14330() {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14330():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (l.C2520.f8000 < 0) goto L59;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File m14332() {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14332():java.io.File");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x008e, code lost:
    
        if (l.C2167.f7158 >= 0) goto L44;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14317(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14317(java.lang.String, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ApplicationInfo m14303() {
        ApplicationInfo applicationInfo = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -760440059;
        int i6 = C2167.f7158;
        int i7 = C0630.f2410;
        int m2566 = (C0630.m2566("ܽۚ") ^ i6) * 101;
        int i8 = ((m2566 ^ i7) * (-27893)) ^ (-636463149);
        int i9 = 59543065;
        while (true) {
            i5 = ((((i5 ^ i7) * (-12235)) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -1893550709:
                case 745390788:
                    i = s + 5378;
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        m2566 = (C2105.m6981("ܳ᩵") + i6) * (-93);
                        i8 = ((m2566 ^ i7) * 22231) ^ 1575905073;
                        i9 = -1253004960;
                    }
                case -1688520570:
                case 1929619208:
                    C2958.m9034();
                    return null;
                case -1639302653:
                case 1978081186:
                    i4 = 82;
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((m2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    } else {
                        m2566 = (C2105.m6981("᩶ᩴ") ^ i7) * (-117);
                        i8 = ((m2566 ^ i6) * 28759) ^ (-1549213909);
                        i9 = -1164025651;
                    }
                case -1609570184:
                case -884515696:
                    C3746.m11369();
                    m2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                    i8 = ((m2566 ^ i7) * (-4227)) ^ 92562672;
                    i9 = 1435101718;
                case -1413151958:
                case 271376709:
                    if (C4616.f14690 <= 0) {
                        m2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((m2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        m2566 = C0630.m2566("ܿ֨") ^ i6;
                        i8 = ((m2566 ^ i7) * 11323) ^ 69243851;
                        i9 = -2147222499;
                    }
                case -1131098178:
                case 1833774790:
                    sArr = f15520;
                    c = 'Q';
                    if (C1294.f4556 >= 0) {
                        m2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((m2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    } else {
                        m2566 = C2105.m6981("᩹֨") ^ i7;
                        i8 = ((m2566 ^ i6) * (-1215)) ^ (-1181459584);
                        i9 = -243870173;
                    }
                case -1100689608:
                case 534090811:
                    i2 = i * i;
                    s2 = 21512;
                    if (C5695.f17556 >= 0) {
                        m2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        m2566 = (C0630.m2566("ۘ᩶") ^ i6) * 31;
                        i8 = ((m2566 ^ i7) * (-22593)) ^ 1220888124;
                        i9 = -2080191914;
                    }
                case -1044753405:
                case 1396853599:
                    if (C1504.f5354) {
                        m2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((m2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        m2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                        i8 = ((m2566 ^ i7) * (-4227)) ^ 92562672;
                        i9 = 1435101718;
                    }
                case -713605602:
                case -602592944:
                    if (i2 - (s * s2) < 0) {
                        m2566 = C2105.m6981("֨ۖ") ^ i6;
                        i8 = ((m2566 ^ i7) * 27963) ^ (-1272613667);
                        i9 = -1348909035;
                    } else {
                        m2566 = (C0630.m2566("ܽ۬") ^ i7) * 59;
                        i8 = ((m2566 ^ i6) * 17455) ^ (-1563322887);
                        i9 = -1817825290;
                    }
                case -630407323:
                case -209617500:
                    if (C7106.f21815 != 0) {
                        m2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((m2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        m2566 = C0630.m2566("۟ۚ") ^ i6;
                        i8 = ((m2566 ^ i7) * 28379) ^ (-2073598519);
                        i9 = -1520734926;
                    }
                case -541698804:
                case 829987173:
                    C2126.m7031(applicationInfo, C2126.m7036(sArr2, i4, 23, i3));
                    return applicationInfo;
                case -293677686:
                case 923317789:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((m2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    } else {
                        m2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((m2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    }
                case -141900652:
                case 197041867:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        m2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                        i8 = ((m2566 ^ i7) * (-4227)) ^ 92562672;
                        i9 = 1435101718;
                    } else {
                        m2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((m2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    }
                case 1421620902:
                case 2083583997:
                    sArr2 = f15520;
                    if (C2105.f7037 != 0) {
                        m2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        m2566 = C2105.m6981("ܺ᩵") ^ i6;
                        i8 = ((m2566 ^ i7) * (-25411)) ^ (-1495443122);
                        i9 = 1193036894;
                    }
                case 1484175818:
                case 1498781298:
                    if (C3432.f10845 >= 0) {
                        m2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((m2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        m2566 = C2105.m6981("ᩳ֫") ^ i7;
                        i8 = ((m2566 ^ i6) * 20213) ^ 903503257;
                        i9 = -1456297094;
                    }
                case 1844402234:
                case 1993306653:
                    i3 = 64593;
                    m2566 = C0630.m2566("֡ۧ") ^ i7;
                    i8 = ((m2566 ^ i6) * 24465) ^ 1355136733;
                    i9 = 772449718;
                case 1958412182:
                case 2069115437:
                    applicationInfo = C3432.m10479().getApplicationInfo();
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        m2566 = (C2105.m6981("ᩳۚ") ^ i7) * 87;
                        i8 = ((m2566 ^ i6) * (-32401)) ^ 1755084324;
                        i9 = -1355974358;
                    }
                case 1966601701:
                case 2140702631:
                    i3 = 7587;
                    m2566 = C0630.m2566("֡ۧ") ^ i7;
                    i8 = ((m2566 ^ i6) * 24465) ^ 1355136733;
                    i9 = 772449718;
                default:
                    s = sArr[c];
                    if (C4075.f12947 >= 0) {
                        m2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((m2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    } else {
                        m2566 = C0630.m2566("ۛۧ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-13239)) ^ 472349731;
                        i9 = -711818847;
                    }
            }
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String m14337() {
        String str = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1540387515;
        int i7 = C1047.f3863;
        int i8 = RunnableC3474.f10992;
        int m2566 = C0630.m2566("ܰ᩸") ^ i8;
        int i9 = ((m2566 ^ i7) * 1169) ^ 1484037241;
        int i10 = -675617376;
        while (true) {
            i6 = ((((i6 ^ i7) * 31451) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -1925131844:
                case -847834076:
                    i = s * s;
                    i2 = 128029225;
                    if (C0964.m3413()) {
                        m2566 = C0630.m2566("ۙۡ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-11367)) ^ 1457340754;
                        i10 = -896008774;
                    } else {
                        m2566 = C0630.m2566("ۧۗ") ^ i7;
                        i9 = ((m2566 ^ i8) * 21157) ^ (-541526932);
                        i10 = 1832301890;
                    }
                case -1920388463:
                case 1316847657:
                    if (C22628.f73083 <= 0) {
                        m2566 = C0630.m2566("֡۫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-16165)) ^ 751467723;
                        i10 = 353752266;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩻᩶")) * (-87);
                        i9 = ((m2566 ^ i8) * 30221) ^ (-770601648);
                        i10 = -1733979626;
                    }
                case -1814365752:
                case -455014668:
                    C4075.m12263();
                    if (C1047.f3863 >= 0) {
                        m2566 = C0630.m2566("֡۫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-16165)) ^ 751467723;
                        i10 = 353752266;
                    } else {
                        m2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((m2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    }
                case -1737661239:
                case 1967201240:
                    C5695.m16023();
                    return null;
                case -1656620273:
                case 1978905384:
                    if (C0422.f1886 <= 0) {
                        m2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((m2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        m2566 = C0630.m2566("ۤ᩵") ^ i8;
                        i9 = ((m2566 ^ i7) * 24985) ^ (-633069424);
                        i10 = -1460173814;
                    }
                case -1526788443:
                case 1206854651:
                    i3 = i + i2;
                    s2 = 22630;
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("ۧۗ") ^ i7;
                        i9 = ((m2566 ^ i8) * 21157) ^ (-541526932);
                        i10 = 1832301890;
                    } else {
                        m2566 = (C0630.m2566("᩺᩹") + i7) * (-73);
                        i9 = ((m2566 ^ i8) * (-11103)) ^ (-673375598);
                        i10 = -1252968149;
                    }
                case -1448080016:
                case -1236217531:
                    sArr = f15520;
                    c = 709;
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("᩺ܳ") ^ i7;
                        i9 = ((m2566 ^ i8) * 15085) ^ (-1987397223);
                        i10 = 1580409827;
                    } else {
                        m2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    }
                case -1403557164:
                case 83883043:
                    i5 = 710;
                    if (C4075.f12947 >= 0) {
                        m2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((m2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        m2566 = (i8 - C2105.m6981("ۨۘ")) * (-53);
                        i9 = ((m2566 ^ i7) * 7015) ^ (-979912413);
                        i10 = 1147485608;
                    }
                case -1180519600:
                case -1002888394:
                    C4616.m13552();
                    m2566 = C0630.m2566("֡۫") ^ i7;
                    i9 = ((m2566 ^ i8) * (-16165)) ^ 751467723;
                    i10 = 353752266;
                case -995690124:
                case 310764851:
                    if ((s * s2) - i3 <= 0) {
                        m2566 = (i8 - C0630.m2566("ᩳۜ")) * (-113);
                        i9 = ((m2566 ^ i7) * (-3041)) ^ (-633336906);
                        i10 = -727932258;
                    } else {
                        m2566 = C0630.m2566("۟ܰ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-5195)) ^ 1726155477;
                        i10 = 2049608621;
                    }
                case -920798794:
                case -642435733:
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        m2566 = C2105.m6981("ۗ᩸") ^ i8;
                        i9 = ((m2566 ^ i7) * 13219) ^ (-23471753);
                        i10 = -324341104;
                    }
                case -821144628:
                case 83308090:
                    sArr2 = f15520;
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        m2566 = C0630.m2566("۠ܽ") ^ i8;
                        i9 = ((m2566 ^ i7) * 14463) ^ (-128896752);
                        i10 = 1695933907;
                    }
                case -750248589:
                case 1324918163:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        m2566 = (i8 - C0630.m2566("ۧ۫")) * (-43);
                        i9 = ((m2566 ^ i7) * 22325) ^ 1850136284;
                        i10 = 4045996;
                    }
                case -531731205:
                case 2070134899:
                    C21923.m49329();
                    if (C3746.f11829 <= 0) {
                        m2566 = C2105.m6981("ۢܿ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-29807)) ^ 1279993429;
                        i10 = 513941564;
                    } else {
                        m2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    }
                case -398830723:
                case 744562255:
                    C2272.m7503();
                    if (C2272.m7503()) {
                        m2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((m2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        m2566 = C2105.m6981("ۢܿ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-29807)) ^ 1279993429;
                        i10 = 513941564;
                    }
                case -396992993:
                case 475302850:
                    i4 = 51986;
                    m2566 = (C0630.m2566("ܳᩴ") ^ i7) * (-7);
                    i9 = ((m2566 ^ i8) * (-31699)) ^ 1889568535;
                    i10 = -751891886;
                case -17558153:
                case 767572590:
                    C2126.m7031(str, C3683.m11225(sArr2, i5, 19, i4));
                    return str;
                case 465607217:
                case 984819933:
                    i4 = 64063;
                    m2566 = (C0630.m2566("ܳᩴ") ^ i7) * (-7);
                    i9 = ((m2566 ^ i8) * (-31699)) ^ 1889568535;
                    i10 = -751891886;
                default:
                    str = C0382.m1842().getPackageName();
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((m2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        m2566 = (C0630.m2566("ᩴۘ") + i7) * 79;
                        i9 = ((m2566 ^ i8) * (-29517)) ^ (-907550948);
                        i10 = 1711703055;
                    }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object m14326(String str) {
        return C2272.m7509(C0382.m1842(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (l.C1294.f4556 >= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (l.C1711.f5919 == false) goto L19;
     */
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m14321() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14321():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (l.C0964.f3626 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (l.C1773.f6144 <= 0) goto L52;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.pm.PackageInfo m14304(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14304(java.lang.String):android.content.pm.PackageInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (l.C3746.f11829 <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (l.C1047.f3863 < 0) goto L69;
     */
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m14301() {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4925.m14301():boolean");
    }
}
