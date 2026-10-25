package bin.mt.plus;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.o;
import l.AbstractC2021;
import l.ActivityC7747;
import l.C0050;
import l.C0237;
import l.C0630;
import l.C0714;
import l.C0798;
import l.C0964;
import l.C1005;
import l.C1047;
import l.C1128;
import l.C11340;
import l.C2105;
import l.C2126;
import l.C2167;
import l.C22470;
import l.C22628;
import l.C2272;
import l.C2958;
import l.C3019;
import l.C3245;
import l.C3432;
import l.C3683;
import l.C3746;
import l.C3911;
import l.C4075;
import l.C4263;
import l.C4616;
import l.C5242;
import l.C5695;
import l.RunnableC1937;
import moe.shizuku.server.IShizukuService;

/* loaded from: classes.dex */
public class WXPayEntryActivity extends ActivityC7747 implements IWXAPIEventHandler {

    /* renamed from: ܳܺۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f69 = {7013, 6036, 15459, 4267, 8228, 5521, 1374, -6238, -1708, 29339, 6036, 15459, -1520, 8557, 7987};
    public IWXAPI api;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // l.ActivityC7747, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = null;
        IWXAPI iwxapi = null;
        int i = 360783757;
        int i2 = C2167.f7158;
        int i3 = C3245.f10203;
        int m2566 = C0630.m2566("᩵᩶") ^ i3;
        int i4 = ((m2566 ^ i2) * 14883) ^ (-1511347354);
        int i5 = 400933612;
        while (true) {
            i = ((((i ^ i2) * 10091) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2061342614:
                case -2036566063:
                    if (C0798.m2998() != 0) {
                        m2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        m2566 = (C0630.m2566("ۛ᩻") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * 1949) ^ 1356922652;
                        i5 = 2146181508;
                    }
                case -2029521409:
                case 258431399:
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        m2566 = C0630.m2566("᩵ܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-5809)) ^ 565042823;
                        i5 = -280113683;
                    }
                case -1998926665:
                case -486953713:
                    C3683.m11222();
                    RunnableC1937.m6387();
                    break;
                case -1459569192:
                case 971198966:
                    C5695.m16023();
                    m2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                    i4 = ((m2566 ^ i2) * 9579) ^ (-1453284106);
                    i5 = 1831384131;
                case -1295927898:
                case -715504820:
                    super.onCreate(bundle);
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        m2566 = C0630.m2566("ܶۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 27801) ^ (-914013403);
                        i5 = 524420464;
                    }
                case -1199309378:
                case 951538898:
                    if (C3432.m10477() <= 0) {
                        m2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((m2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        m2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 20739) ^ (-265963991);
                        i5 = -560355155;
                    }
                case -971739331:
                case 130922501:
                    C5242 c5242 = C22470.f72770;
                    str = C22470.m50420();
                    if (C0798.m2998() != 0) {
                        m2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        m2566 = C2105.m6981("۬ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-7385)) ^ 89785452;
                        i5 = -716302792;
                    }
                case -498717714:
                case 899666981:
                    if (C4075.m12263() <= 0) {
                        m2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((m2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩶ۖ")) * (-41);
                        i4 = ((m2566 ^ i2) * (-32053)) ^ (-638383150);
                        i5 = -65881465;
                    }
                case -464150483:
                case 874068376:
                    RunnableC1937.m6387();
                    if (C11340.f33930 < 0) {
                        m2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((m2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        m2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    }
                case -147352769:
                case 38547540:
                    iwxapi = WXAPIFactory.createWXAPI(this, str);
                    this.api = iwxapi;
                    if (C0237.f1507 != 0) {
                        m2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        m2566 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * 18959) ^ 1821625873;
                        i5 = -1542596517;
                    }
                case 131043882:
                case 405922766:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("ۗۡ") + i2) * 41;
                        i4 = ((m2566 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    } else {
                        m2566 = C0630.m2566("ۗܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23129)) ^ 579598348;
                        i5 = -1487148227;
                    }
                case 907573934:
                case 1859474796:
                    if (C3911.m11924() <= 0) {
                        m2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        m2566 = (C0630.m2566("۫ܽ") ^ i2) * 63;
                        i4 = ((m2566 ^ i3) * (-24349)) ^ 910183318;
                        i5 = -780595560;
                    }
                case 1139595930:
                case 2103152415:
                    iwxapi.handleIntent(C2126.m7034(this), this);
                    break;
                case 1515717138:
                case 1664959261:
                    C1128.m3851();
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((m2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        m2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((m2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    }
                case 1820013787:
                case 1910408019:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ۗۡ") + i2) * 41;
                        i4 = ((m2566 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    } else {
                        m2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((m2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    }
                default:
                    if (C2958.m9034() <= 0) {
                        m2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((m2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        m2566 = C0630.m2566("ۜۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * 9221) ^ 104478056;
                        i5 = -1694859604;
                    }
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int i = 782484538;
        int i2 = AbstractC2021.f6743;
        int i3 = C0714.f2697;
        int m2566 = (C0630.m2566("ۚ᩷") + i3) * 7;
        int i4 = ((m2566 ^ i2) * (-8433)) ^ (-1245331077);
        int i5 = -1858427885;
        while (true) {
            i = ((((i ^ i2) * 32319) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1812627455:
                case 1129581192:
                    setIntent(intent);
                    this.api.handleIntent(intent, this);
                    break;
                case -1803014888:
                case 115531014:
                    super.onNewIntent(intent);
                    if (C22628.f73083 <= 0) {
                        m2566 = C0630.m2566("ۤ۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        m2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6813)) ^ 1699051220;
                        i5 = 368980906;
                    }
                case -1797274719:
                case 1972731735:
                    if (C3432.m10477() <= 0) {
                        m2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        m2566 = (C2105.m6981("ۛ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * 7953) ^ 1956743434;
                        i5 = -1680089214;
                    }
                case -1764926128:
                case -1543688331:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((m2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        m2566 = C0630.m2566("ۡ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25851)) ^ 555992531;
                        i5 = -2001917780;
                    }
                case -1530307954:
                case 1469687432:
                    if (C0237.f1507 != 0) {
                        m2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((m2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        m2566 = (C2105.m6981("᩵ۤ") ^ i2) * 47;
                        i4 = ((m2566 ^ i3) * (-13643)) ^ 1995574408;
                        i5 = 935767452;
                    }
                case -1256766738:
                case 875439383:
                    if (C0964.f3626 != 0) {
                        m2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((m2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        m2566 = (i2 - C2105.m6981("ܰۧ")) * (-79);
                        i4 = ((m2566 ^ i3) * 17151) ^ 869420569;
                        i5 = -713336403;
                    }
                case -1210550516:
                case -875704990:
                    C3746.m11369();
                    m2566 = C2105.m6981("ۨۧ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                    i5 = 813124556;
                case -554792920:
                case -57747235:
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        m2566 = (C0630.m2566("ۨᩳ") ^ i3) * 3;
                        i4 = ((m2566 ^ i2) * (-22345)) ^ 233193870;
                        i5 = 536411436;
                    }
                case -270853463:
                case 1209879916:
                    if (C3019.f9544 < 0) {
                        m2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        m2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((m2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    }
                case -194205011:
                case 1475559019:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("ۤ۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        m2566 = C0630.m2566("֡ۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * o.a.n) ^ 848242414;
                        i5 = 713487861;
                    }
                case 120112729:
                case 2004679783:
                    if (C4263.f13799 <= 0) {
                        m2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        m2566 = (C2105.m6981("᩶ۨ") + i3) * (-67);
                        i4 = ((m2566 ^ i2) * (-6687)) ^ 227417366;
                        i5 = 874448638;
                    }
                case 256304722:
                case 1725765808:
                    C3683.m11222();
                    break;
                case 586257173:
                case 1163332407:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((m2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        m2566 = C2105.m6981("ܺ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 20267) ^ 152765110;
                        i5 = 411214570;
                    }
                case 894038485:
                case 981372743:
                    C1005.m3501();
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        m2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    }
                case 1190868293:
                case 1963629253:
                    if (C2272.f7362) {
                        m2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        m2566 = (C0630.m2566("ۤᩳ") + i2) * 19;
                        i4 = ((m2566 ^ i3) * 27461) ^ 1197361801;
                        i5 = 432442289;
                    }
                default:
                    if (C2958.m9034() <= 0) {
                        m2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        m2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((m2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L14;
     */
    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResp(com.tencent.mm.opensdk.modelbase.BaseResp r28) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.plus.WXPayEntryActivity.onResp(com.tencent.mm.opensdk.modelbase.BaseResp):void");
    }
}
