package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* compiled from: N5YQ */
/* renamed from: l.۫ۡ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC12313 extends AbstractActivityC3346 implements View.OnClickListener, View.OnKeyListener, ServiceConnection {

    /* renamed from: ᩸۠ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f36857 = {4582, -6341, 7567, -4387, -288, -2190, -5645, -979, -22, 2463, 1619, -439, 8250, -3001, -1496, 10256, -13438, 14297, 8717, -9596, -13115, -274, 8700, -10176, -2563, -15440, -11415, 12654, 9843, -3298, -11445, -11084, 10718, 9318, -11029, -13326, 15487, -9658, -11407, 13264, -3804, 4570, -46, -8918, -9283, 15879, -15540, -14887, 6478, -7946, 1856, -13183, 1106, -13810, -13763, -13764, -13780, -13794, -13766, -13782, -13763, -13770, -13810, -13780, -13765, -13786, -13767, -13786, -13765, -13770};

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public long f36858;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC8597 f36859;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public BinderC3141 f36860;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C15651 f36861;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36862 = false;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

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
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1401237881;
        int i7 = C4075.f12947;
        int i8 = AbstractC2021.f6743;
        int m2566 = C0630.m2566("ۖۚ") ^ i7;
        int i9 = ((m2566 ^ i8) * 10347) ^ (-1460862334);
        int i10 = 696659341;
        while (true) {
            i6 = ((((i6 ^ i8) * (-19417)) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -1597874132:
                case 606446169:
                    C1773.m5908();
                    if (C4075.f12947 < 0) {
                        m2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    } else {
                        m2566 = C0630.m2566("ܳ֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 17121) ^ (-1257431642);
                        i10 = -631976160;
                    }
                case -1579293039:
                case -392142234:
                    sArr = f36857;
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("֫ܽ") ^ i8) * 5;
                        i9 = ((m2566 ^ i7) * (-4699)) ^ (-2114327288);
                        i10 = -1262239925;
                    } else {
                        m2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    }
                case -1384166729:
                case 93364350:
                    if (C4117.m12364() != 0) {
                        m2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۖ᩺")) * (-57);
                        i9 = ((m2566 ^ i8) * 32121) ^ 1247518420;
                        i10 = -138185906;
                    }
                case -1199740296:
                case 761108642:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    } else {
                        m2566 = (i8 - C0630.m2566("ۗ֡")) * 41;
                        i9 = ((m2566 ^ i7) * 7663) ^ 1904294571;
                        i10 = -1656585470;
                    }
                case -1156753345:
                case 2087492803:
                    s2 = 11709;
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        m2566 = C0630.m2566("֫ۧ") ^ i8;
                        i9 = ((m2566 ^ i7) * 8341) ^ (-1556929766);
                        i10 = 23718865;
                    }
                case -724237979:
                case 1376729654:
                    C3537.m10746();
                    if (C4075.f12947 < 0) {
                        m2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    } else {
                        m2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    }
                case -618704725:
                case -42192540:
                    i4 = 51791;
                    m2566 = C2105.m6981("֨ܽ") ^ i8;
                    i9 = ((m2566 ^ i7) * (-13213)) ^ 1795742028;
                    i10 = 2091045421;
                case -374367250:
                case 792964995:
                    C1128.m3851();
                    return null;
                case -368391827:
                case 1074908103:
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    } else {
                        m2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    }
                case 13607232:
                case 122104181:
                    i4 = 58093;
                    m2566 = C2105.m6981("֨ܽ") ^ i8;
                    i9 = ((m2566 ^ i7) * (-13213)) ^ 1795742028;
                    i10 = 2091045421;
                case 96533523:
                case 1271660039:
                    C0237.m1481();
                    C1128.m3851();
                    m2566 = C2105.m6981("᩸۬") ^ i8;
                    i9 = ((m2566 ^ i7) * (-8927)) ^ 1448995426;
                    i10 = 2045385588;
                case 308662064:
                case 328680902:
                    i = s * s;
                    i2 = 137100681;
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        m2566 = C2105.m6981("ܰۨ") ^ i7;
                        i9 = ((m2566 ^ i8) * 1859) ^ 1723225011;
                        i10 = 807837208;
                    }
                case 327510535:
                case 1472451278:
                    int i12 = s + s2;
                    if (i3 - (i12 * i12) < 0) {
                        m2566 = C2105.m6981("ۛۛ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-4963)) ^ (-419016422);
                        i10 = -2003538952;
                    } else {
                        m2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-1223)) ^ (-1061507522);
                        i10 = 1965300894;
                    }
                case 585873765:
                case 2055013932:
                    return RunnableC1937.m6385(sArr2, i5, 17, i4);
                case 599937711:
                case 1131339294:
                    c = '4';
                    if (C1711.m5736() <= 0) {
                        m2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩵᩷")) * (-57);
                        i9 = ((m2566 ^ i8) * (-14137)) ^ 467759755;
                        i10 = -2111426375;
                    }
                case 643020867:
                case 1007590855:
                    s = sArr[c];
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ܳ֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 17121) ^ (-1257431642);
                        i10 = -631976160;
                    } else {
                        m2566 = C2105.m6981("᩵ᩴ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-1103)) ^ 1715210610;
                        i10 = 1161725146;
                    }
                case 705227579:
                case 2079907293:
                    sArr2 = f36857;
                    i5 = 53;
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    } else {
                        m2566 = (C2105.m6981("۬֡") ^ i7) * (-3);
                        i9 = ((m2566 ^ i8) * (-31821)) ^ (-555576249);
                        i10 = 479301653;
                    }
                case 1412261986:
                case 1953844993:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    } else {
                        m2566 = C2105.m6981("ۛۢ") ^ i7;
                        i9 = ((m2566 ^ i8) * 15765) ^ (-379296523);
                        i10 = 1651267760;
                    }
                default:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    } else {
                        m2566 = C2105.m6981("᩷ۧ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-26247)) ^ (-1595663998);
                        i10 = 365390541;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (l.C2105.f7037 == 0) goto L14;
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
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12313.onPause():void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        BinderC3141 binderC3141 = null;
        int i = 1306984090;
        int i2 = C2958.f9394;
        int i3 = RunnableC3474.f10992;
        int m2566 = C0630.m2566("۟᩶") ^ i3;
        int i4 = ((m2566 ^ i2) * 25949) ^ 1106286063;
        int i5 = 517812242;
        while (true) {
            i = ((((i ^ i2) * (-11535)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2106169549:
                case -1141369307:
                    if (C2958.m9033(this)) {
                        m2566 = C2105.m6981("֡ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * 27447) ^ (-1436419346);
                        i5 = 1643252850;
                    } else {
                        m2566 = (C0630.m2566("ܰ᩷") ^ i3) * (-67);
                        i4 = ((m2566 ^ i2) * (-13527)) ^ (-1588064984);
                        i5 = 285926504;
                    }
                case -2065858506:
                case 1383889094:
                    if (C3537.f11231 >= 0) {
                        m2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    } else {
                        m2566 = (C2105.m6981("ᩳܽ") + i2) * 49;
                        i4 = ((m2566 ^ i3) * 13231) ^ (-1875779992);
                        i5 = -1912793340;
                    }
                case -2019615386:
                case -425565620:
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        m2566 = C0630.m2566("ۜ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 7797) ^ (-1122868249);
                        i5 = -2017704866;
                    }
                case -1840466920:
                case 555974662:
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((m2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    } else {
                        m2566 = (C2105.m6981("ۧܳ") + i2) * q.h;
                        i4 = ((m2566 ^ i3) * 27855) ^ (-1874082741);
                        i5 = -1176999567;
                    }
                case -761797723:
                case 202217886:
                    if (C1128.f4106 <= 0) {
                        m2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((m2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    } else {
                        m2566 = (C2105.m6981("ۙۘ") ^ i2) * (-123);
                        i4 = ((m2566 ^ i3) * (-20413)) ^ 1461534885;
                        i5 = -831236609;
                    }
                case -718375826:
                case -105224321:
                    binderC3141.m9569();
                    m2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                    i4 = ((m2566 ^ i3) * (-15913)) ^ 996209475;
                    i5 = 1715106875;
                case -551947330:
                case 871511393:
                    if (C0382.f1805) {
                        stopService(new Intent(this, (Class<?>) ServiceC13018.class));
                        m2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                        i4 = ((m2566 ^ i3) * (-15913)) ^ 996209475;
                        i5 = 1715106875;
                    } else {
                        m2566 = C0630.m2566("᩺ۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * 25091) ^ 989118465;
                        i5 = 721849355;
                    }
                case -541541749:
                case 195613510:
                    if (this.f36862) {
                        m2566 = C0630.m2566("ۖۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-11487)) ^ 222788608;
                        i5 = -1091312426;
                    } else {
                        m2566 = C0630.m2566("᩺۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 14439) ^ (-985394330);
                        i5 = 128643041;
                    }
                case -535421153:
                case 1321124522:
                    C2272.m7505(this);
                    m2566 = C2105.m6981("֡ۖ") ^ i3;
                    i4 = ((m2566 ^ i2) * 27447) ^ (-1436419346);
                    i5 = 1643252850;
                case -510865987:
                case -153282985:
                    if (C3432.f10845 >= 0) {
                        m2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((m2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    } else {
                        m2566 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15723)) ^ (-640192365);
                        i5 = -109875986;
                    }
                case -326717066:
                case 1715673577:
                    binderC3141 = this.f36860;
                    if (binderC3141 != null) {
                        m2566 = (C2105.m6981("ۙۚ") ^ i2) * 67;
                        i4 = ((m2566 ^ i3) * 4111) ^ (-903597328);
                        i5 = -221772084;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                        i4 = ((m2566 ^ i3) * (-15913)) ^ 996209475;
                        i5 = 1715106875;
                    }
                case -177224759:
                case 1257208326:
                    C5695.m16023();
                    if (C0382.m1848()) {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((m2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    }
                case 1602698:
                case 2022098109:
                    break;
                case 206662812:
                case 579194052:
                    if (C0798.f2919) {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        m2566 = (C0630.m2566("ۚۢ") + i3) * (-73);
                        i4 = ((m2566 ^ i2) * (-14723)) ^ (-1250162482);
                        i5 = -1806446779;
                    }
                case 271777303:
                case 411072830:
                    C3683.m11222();
                    m2566 = C0630.m2566("᩺ܰ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-8115)) ^ 1942812486;
                    i5 = -2075293533;
                case 805080697:
                case 1639399157:
                    if (C0382.f1805) {
                        m2566 = (C0630.m2566("ۚ֫") ^ i3) * 17;
                        i4 = ((m2566 ^ i2) * 19323) ^ (-1819186953);
                        i5 = -1582820486;
                    } else {
                        m2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((m2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    }
                case 854386534:
                case 974695290:
                    RunnableC1108.m3790();
                    if (C1128.f4106 > 0) {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        m2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((m2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    }
                case 1213027084:
                case 1922975065:
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        m2566 = C0630.m2566("ᩴۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 17755) ^ 1898985162;
                        i5 = -449546385;
                    }
                case 1495427032:
                case 1902930370:
                    C3537.m10746();
                    break;
                case 1748964318:
                case 2134315720:
                    super.onStop();
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    } else {
                        m2566 = (C2105.m6981("ۜۗ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m2566 ^ i2) * (-30279)) ^ (-251243572);
                        i5 = 1072189469;
                    }
                default:
                    if (C0630.f2410 > 0) {
                        m2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    } else {
                        m2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    }
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C15651 c15651 = null;
        int i = -433401978;
        int i2 = C3537.f11231;
        int i3 = C3683.f11629;
        int m2566 = (i2 - C0630.m2566("ۢۘ")) * 63;
        int i4 = ((m2566 ^ i3) * 28967) ^ (-641088238);
        int i5 = 1898374973;
        while (true) {
            i = ((((i ^ i3) * (-22301)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1961790354:
                case -954575475:
                    C4159.m12565();
                    if (C0964.f3626 == 0) {
                        m2566 = (C2105.m6981("᩸ܺ") + i2) * 83;
                        i4 = ((m2566 ^ i3) * 4057) ^ 1253447170;
                        i5 = 710133800;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    }
                case -1591192860:
                case -311086127:
                    super.onDestroy();
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    } else {
                        m2566 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3285)) ^ (-727457383);
                        i5 = 996676425;
                    }
                case -1583987663:
                case 1528907592:
                    if (C1420.f5096 <= 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = C2105.m6981("ۗۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31253)) ^ 1455849789;
                        i5 = -436417033;
                    }
                case -1402442737:
                case -857002963:
                    C1711.m5736();
                    if (C22628.f73083 > 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩻ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i2) * (-24243)) ^ 1868599039;
                        i5 = -2112556425;
                    }
                case -1353181803:
                case 919198409:
                    if (C2105.f7037 != 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = (C0630.m2566("۫᩻") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m2566 ^ i3) * (-14413)) ^ (-10058410);
                        i5 = 1101529358;
                    }
                case -957567130:
                case 624518758:
                    ServiceC13018.f38962 = C0050.m947(C2958.m9028(c15651));
                    break;
                case -947310383:
                case -637927541:
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۜۢ")) * 27;
                        i4 = ((m2566 ^ i2) * 6433) ^ (-995369685);
                        i5 = 1700944200;
                    }
                case -897671951:
                case -340084457:
                    if (RunnableC3474.m10630()) {
                        m2566 = (i3 - C2105.m6981("ᩳᩳ")) * 123;
                        i4 = ((m2566 ^ i2) * 27727) ^ 1430297826;
                        i5 = -634011506;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    }
                case -597942508:
                case 2122895320:
                    C21923.m49329();
                    C4117.m12364();
                    m2566 = (C2105.m6981("᩸ܺ") + i2) * 83;
                    i4 = ((m2566 ^ i3) * 4057) ^ 1253447170;
                    i5 = 710133800;
                case -482008664:
                case 1194810246:
                    if (C22628.f73083 <= 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    }
                case -388260497:
                case 710448076:
                    C1773.m5908();
                    break;
                case -384510416:
                case 1128901103:
                    if (C0483.f2088 >= 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۢ᩻")) * 67;
                        i4 = ((m2566 ^ i2) * 8003) ^ (-65656194);
                        i5 = -2035995908;
                    }
                case -355351492:
                case 607794733:
                    if (C2167.f7158 >= 0) {
                        m2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((m2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۡ֨")) * (-19);
                        i4 = ((m2566 ^ i2) * (-16531)) ^ (-336557934);
                        i5 = 327304831;
                    }
                case 330364508:
                case 2045628864:
                    unbindService(this);
                    if (RunnableC0588.m2441() >= 0) {
                        m2566 = (i3 - C2105.m6981("᩻ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i2) * (-24243)) ^ 1868599039;
                        i5 = -2112556425;
                    } else {
                        m2566 = (C0630.m2566("ۡۗ") + i2) * (-13);
                        i4 = ((m2566 ^ i3) * 6485) ^ 1031793959;
                        i5 = 579414045;
                    }
                case 366433547:
                case 2063997757:
                    c15651 = this.f36861;
                    if (C0714.f2697 >= 0) {
                        m2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 123;
                        i4 = ((m2566 ^ i2) * 15295) ^ 2032973322;
                        i5 = -1218735169;
                    } else {
                        m2566 = (C2105.m6981("ۙ۟") ^ i3) * (-17);
                        i4 = ((m2566 ^ i2) * (-32065)) ^ (-1103213199);
                        i5 = 99325923;
                    }
                default:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 123;
                        i4 = ((m2566 ^ i2) * 15295) ^ 2032973322;
                        i5 = -1218735169;
                    } else {
                        m2566 = (C0630.m2566("ۗ֨") ^ i2) * 127;
                        i4 = ((m2566 ^ i3) * (-5321)) ^ (-250333438);
                        i5 = -758589426;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        if (l.C1711.f5919 == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, android.content.ServiceConnection, android.view.View$OnKeyListener, java.lang.Object, l.۫ۡ᩷] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r1v154, types: [android.view.View, l.ܺۖᩳ] */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12313.onCreate(android.os.Bundle):void");
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ViewOnClickListenerC8597 viewOnClickListenerC8597 = null;
        int i2 = -977946489;
        int i3 = RunnableC3474.f10992;
        int i4 = C3911.f12484;
        int m6981 = C2105.m6981("ᩳۤ") ^ i3;
        int i5 = ((m6981 ^ i4) * (-21817)) ^ 2089937046;
        int i6 = 999046065;
        while (true) {
            i2 = ((((i2 ^ i4) * 23809) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2070732268:
                case -1358536120:
                    if (i == 66) {
                        m6981 = (C2105.m6981("ܶۖ") + i3) * 115;
                        i5 = ((m6981 ^ i4) * (-32333)) ^ (-352262702);
                        i6 = 1785328248;
                    } else {
                        m6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((m6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                case -1769466961:
                case -1286563621:
                    viewOnClickListenerC8597 = this.f36859;
                    if (viewOnClickListenerC8597 != null) {
                        m6981 = C2105.m6981("֡ᩳ") ^ i4;
                        i5 = ((m6981 ^ i3) * 27311) ^ 1348894376;
                        i6 = -1698891100;
                    } else {
                        m6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((m6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                case -1750256743:
                case -893326558:
                    RunnableC1108.m3781(this);
                    return true;
                case -1620213022:
                case -1529992074:
                    if (C0050.f910 >= 0) {
                        m6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((m6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        m6981 = C0630.m2566("ܶۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 19335) ^ 96834468;
                        i6 = 1230175154;
                    }
                case -1586256867:
                case 571730278:
                    if (C0798.m2998() != 0) {
                        m6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((m6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        m6981 = (C0630.m2566("֫ۜ") + i3) * (-47);
                        i5 = ((m6981 ^ i4) * 24509) ^ (-1857438934);
                        i6 = 102015021;
                    }
                case -1474095682:
                case 1577003749:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((m6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        m6981 = (C0630.m2566("ۢ۬") + i4) * 53;
                        i5 = ((m6981 ^ i3) * 9745) ^ 1913389382;
                        i6 = 846845151;
                    }
                case -1462243781:
                case 47422166:
                    if (i == 4) {
                        m6981 = (C2105.m6981("ۖۖ") + i3) * (-37);
                        i5 = ((m6981 ^ i4) * 11085) ^ (-1448146919);
                        i6 = 305152797;
                    } else {
                        m6981 = C0630.m2566("ۧ۠") ^ i4;
                        i5 = ((m6981 ^ i3) * 20381) ^ (-497211564);
                        i6 = -550303101;
                    }
                case -1432003077:
                case 1388597736:
                    C3663.m11168();
                    C3432.m10477();
                    return false;
                case -1303477497:
                case 2079656444:
                    return false;
                case -1153957370:
                case 64362675:
                    if (C0964.f3626 != 0) {
                        m6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((m6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        m6981 = (C2105.m6981("ۘ۫") + i3) * (-9);
                        i5 = ((m6981 ^ i4) * (-323)) ^ (-1469968230);
                        i6 = 647234814;
                    }
                case -1008368010:
                case 1879289139:
                    C1504.m5179();
                    if (C0483.f2088 < 0) {
                        m6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        m6981 = C0630.m2566("ܿᩴ") ^ i4;
                        i5 = ((m6981 ^ i3) * 933) ^ 1689359183;
                        i6 = -475728073;
                    }
                case -784197167:
                case 1699490016:
                    if (C4263.m12819() >= 0) {
                        m6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        m6981 = (C2105.m6981("ᩴۜ") ^ i3) * 123;
                        i5 = ((m6981 ^ i4) * (-19819)) ^ (-725989490);
                        i6 = -1811657531;
                    }
                case -781103237:
                case 280790813:
                    C21923.m49329();
                    C0237.m1481();
                    m6981 = C0630.m2566("۬ᩳ") ^ i3;
                    i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                    i6 = 858680642;
                case -563540435:
                case -180078370:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((m6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        m6981 = (C2105.m6981("۫ۖ") + i3) * 43;
                        i5 = ((m6981 ^ i4) * 6407) ^ 159188422;
                        i6 = -633185901;
                    }
                case -240615205:
                case 683200635:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * 79;
                        i5 = ((m6981 ^ i3) * (-27603)) ^ (-1971993652);
                        i6 = 975727858;
                    }
                case 88549943:
                case 1174372345:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        m6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((m6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    }
                case 741228178:
                case 1894697691:
                    C0483.m2121();
                    if (C4075.m12263() > 0) {
                        m6981 = C0630.m2566("ܿᩴ") ^ i4;
                        i5 = ((m6981 ^ i3) * 933) ^ 1689359183;
                        i6 = -475728073;
                    } else {
                        m6981 = (i3 - C0630.m2566("ܰ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((m6981 ^ i4) * (-18989)) ^ (-1393294930);
                        i6 = 1492321455;
                    }
                case 969994319:
                case 1932538470:
                    if (keyEvent.getAction() == 0) {
                        m6981 = C2105.m6981("ᩴ᩸") ^ i4;
                        i5 = ((m6981 ^ i3) * (-2203)) ^ (-856599312);
                        i6 = 1651722885;
                    } else {
                        m6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((m6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                case 1004710269:
                case 2086605891:
                    viewOnClickListenerC8597.onClick(null);
                    m6981 = C0630.m2566("۠֨") ^ i3;
                    i5 = ((m6981 ^ i4) * 4845) ^ 1632054859;
                    i6 = 438247065;
                case 1449340215:
                case 2054769994:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((m6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        m6981 = (C0630.m2566("᩷ܺ") + i4) * (-75);
                        i5 = ((m6981 ^ i3) * (-23673)) ^ 1782819456;
                        i6 = -1346017338;
                    }
                case 1516621005:
                case 1912317636:
                    if (C1916.f6442) {
                        m6981 = (i4 - C2105.m6981("ۨۙ")) * (-61);
                        i5 = ((m6981 ^ i3) * (-32759)) ^ (-579825486);
                        i6 = 1567045233;
                    } else {
                        m6981 = (i3 - C0630.m2566("ܰ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((m6981 ^ i4) * (-18989)) ^ (-1393294930);
                        i6 = 1492321455;
                    }
                default:
                    if (C0050.f910 >= 0) {
                        m6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        m6981 = (i4 - C0630.m2566("۠ܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((m6981 ^ i3) * (-2665)) ^ 1438703826;
                        i6 = 950047721;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        if (l.C2105.f7037 == 0) goto L10;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r28) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12313.onClick(android.view.View):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        short[] sArr = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = -690190052;
        int i4 = RunnableC3474.f10992;
        int i5 = C1773.f6144;
        int m2566 = (C0630.m2566("ۨᩴ") + i5) * 41;
        int i6 = ((m2566 ^ i4) * 23669) ^ 1171340574;
        int i7 = -836420703;
        while (true) {
            i3 = ((((i3 ^ i4) * 1827) >> 31) & i6) ^ (m2566 ^ i7);
            switch (i3) {
                case -1938301887:
                case -62089909:
                    C2520.m8026();
                    m2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                    i6 = ((m2566 ^ i4) * 22005) ^ (-2077672137);
                    i7 = -1897999531;
                case -1751173887:
                case -1745424971:
                    i2 = 39137;
                    m2566 = (C2105.m6981("۟ۡ") ^ i4) * 41;
                    i6 = ((m2566 ^ i5) * 271) ^ 1210073510;
                    i7 = -1589924385;
                case -1706257700:
                case -1308637859:
                    short[] sArr2 = f36857;
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    } else {
                        String m6311 = C1916.m6311(sArr2, 49, 3, i2);
                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                            m2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                            i6 = ((m2566 ^ i4) * (-4947)) ^ 1255736872;
                            i7 = -650478129;
                        } else {
                            int m25662 = C0630.m2566(m6311);
                            if (RunnableC1937.f6483 < 0) {
                                View m12813 = C4263.m12813(this, m25662 ^ 2128377421);
                                if (C4159.m12565() < 0) {
                                    C12534 m9567 = this.f36860.m9567();
                                    if (C11340.m28031()) {
                                        ViewOnClickListenerC8597 viewOnClickListenerC8597 = new ViewOnClickListenerC8597(this, m12813, m9567);
                                        this.f36859 = viewOnClickListenerC8597;
                                        viewOnClickListenerC8597.m22326(ServiceC13018.f38962);
                                        break;
                                    }
                                    m2566 = C2105.m6981("۟ۨ") ^ i4;
                                    i6 = ((m2566 ^ i5) * (-3397)) ^ (-1953964010);
                                    i7 = -994926453;
                                }
                            }
                            m2566 = (i5 - C2105.m6981("ۢ۫")) * 75;
                            i6 = ((m2566 ^ i4) * 7433) ^ (-949730809);
                            i7 = 4114029;
                        }
                    }
                case -1679480866:
                case 1404895029:
                    i = (s * s) + 197964900;
                    if (C7106.m19120() <= 0) {
                        m2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((m2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        m2566 = C0630.m2566("ܳۛ") ^ i5;
                        i6 = ((m2566 ^ i4) * 9227) ^ (-800921592);
                        i7 = -522855510;
                    }
                case -1520912689:
                case 42526175:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    } else {
                        m2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                        i6 = ((m2566 ^ i4) * (-4947)) ^ 1255736872;
                        i7 = -650478129;
                    }
                case -1434516576:
                case 325256585:
                    i2 = 5298;
                    m2566 = (C2105.m6981("۟ۡ") ^ i4) * 41;
                    i6 = ((m2566 ^ i5) * 271) ^ 1210073510;
                    i7 = -1589924385;
                case -1360203352:
                case -346222196:
                    sArr = f36857;
                    if (C11340.f33930 >= 0) {
                        m2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                        i6 = ((m2566 ^ i4) * (-4947)) ^ 1255736872;
                        i7 = -650478129;
                    } else {
                        m2566 = (C2105.m6981("ᩳ᩶") ^ i4) * 89;
                        i6 = ((m2566 ^ i5) * (-32679)) ^ (-484157114);
                        i7 = 1883915330;
                    }
                case -1325011006:
                case 1750373335:
                    if (C1420.f5096 > 0) {
                        m2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((m2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        m2566 = C2105.m6981("۟ۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-3397)) ^ (-1953964010);
                        i7 = -994926453;
                    }
                case -1323734579:
                case -832021420:
                    if ((s * 28140) - i > 0) {
                        m2566 = C0630.m2566("ۛۛ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-29481)) ^ (-1183686492);
                        i7 = -2067613386;
                    } else {
                        m2566 = C0630.m2566("۫ܰ") ^ i4;
                        i6 = ((m2566 ^ i5) * 21639) ^ (-1997689786);
                        i7 = -160094967;
                    }
                case -1302459021:
                case 227976550:
                    if (C1005.m3501()) {
                        m2566 = (C0630.m2566("ۧ᩶") ^ i5) * (-107);
                        i6 = ((m2566 ^ i4) * 20413) ^ (-757400060);
                        i7 = -1650903935;
                    } else {
                        m2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    }
                case -1292043361:
                case 1912187996:
                    C3683.m11222();
                    C1005.m3501();
                    break;
                case 187165793:
                case 256262008:
                    BinderC3141 binderC3141 = (BinderC3141) iBinder;
                    this.f36860 = binderC3141;
                    binderC3141.m9568();
                    if (C0798.f2919) {
                        m2566 = C2105.m6981("۟ۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-3397)) ^ (-1953964010);
                        i7 = -994926453;
                    } else {
                        m2566 = (C0630.m2566("֡ۧ") ^ i5) * (-57);
                        i6 = ((m2566 ^ i4) * 22203) ^ 1852462190;
                        i7 = 234305836;
                    }
                case 1155895474:
                case 2053412572:
                    s = sArr[48];
                    if (C0237.m1481() >= 0) {
                        m2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((m2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        m2566 = (C2105.m6981("ۤᩳ") + i4) * 127;
                        i6 = ((m2566 ^ i5) * 16829) ^ 1764584065;
                        i7 = 135661466;
                    }
                default:
                    if (C0714.f2697 < 0) {
                        m2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((m2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        m2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    }
            }
            return;
        }
    }
}
