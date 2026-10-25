package l;

import android.content.Intent;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;

/* compiled from: 71RQ */
/* renamed from: l.ܺ᩹᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC16234 extends ActivityC7747 implements IWXAPIEventHandler {

    /* renamed from: ᩷۫ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f49974 = {3111, 539, 537, 534, 537, 522, ColorResourcesTableCreator.HEADER_TYPE_TYPE, 527, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, 541, 589, 589, 585, 586, 587, 577, 586, 539, 590, 540, 576, 584, 586, 589, 577, 527, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, 541, 538, 539, 587, 542, 538, 538, 591, 591, 588, 585, 539, 585, 590, 539, 541};

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static WeakReference f49975;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IWXAPI f49976;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        int i = 662362755;
        int i2 = RunnableC1937.f6483;
        int i3 = C3537.f11231;
        int m6981 = (C2105.m6981("᩹ܶ") ^ i3) * (-9);
        int i4 = ((m6981 ^ i2) * 31431) ^ 1844090249;
        int i5 = -693412719;
        while (true) {
            i = ((((i ^ i2) * 11049) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2001217407:
                case 1555941529:
                    setIntent(intent);
                    this.f49976.handleIntent(intent, this);
                    break;
                case -1583835266:
                case -1499269978:
                    if (C2958.f9394 < 0) {
                        m6981 = (C2105.m6981("᩶ۖ") + i2) * (-111);
                        i4 = ((m6981 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۚ֡")) * 51;
                        i4 = ((m6981 ^ i2) * 17819) ^ (-222137768);
                        i5 = -2035847343;
                    }
                case -1539106649:
                case 400071440:
                    if (C0237.f1507 != 0) {
                        m6981 = (C2105.m6981("ۛܶ") + i2) * (-121);
                        i4 = ((m6981 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        m6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * 26399) ^ 1012534684;
                        i5 = 1846217625;
                    }
                case -1297540694:
                case -468198315:
                    if (C2105.f7037 != 0) {
                        m6981 = (C2105.m6981("᩶ۖ") + i2) * (-111);
                        i4 = ((m6981 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        m6981 = C2105.m6981("۬ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14935) ^ (-1536878881);
                        i5 = -1027080412;
                    }
                case -1165179405:
                case 2042209636:
                    super.onNewIntent(intent);
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("ۛܶ") + i2) * (-121);
                        i4 = ((m6981 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        m6981 = C0630.m2566("ۛ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26961)) ^ 1648257415;
                        i5 = 1494093754;
                    }
                case -1162180769:
                case -774662748:
                    C0237.m1481();
                    m6981 = (C2105.m6981("᩶ۖ") + i2) * (-111);
                    i4 = ((m6981 ^ i3) * 14999) ^ 1986634121;
                    i5 = 1878365208;
                case -1096578525:
                case -58603970:
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = (C2105.m6981("ۛܶ") + i2) * (-121);
                        i4 = ((m6981 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        m6981 = C2105.m6981("ۗۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 25569) ^ 598848292;
                        i5 = 143460428;
                    }
                case -1078900590:
                case 1530948593:
                    if (C0237.f1507 != 0) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = C2105.m6981("ۡ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22541)) ^ (-1868094619);
                        i5 = 592059038;
                    }
                case -1068018379:
                case 606122913:
                    C3683.m11222();
                    if (C1711.f5919) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = (C2105.m6981("᩶ۖ") + i2) * (-111);
                        i4 = ((m6981 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    }
                case -750907918:
                case 556477723:
                    RunnableC3474.m10630();
                    break;
                case -533960975:
                case 1091922952:
                    C0630.m2564();
                    if (C0237.f1507 == 0) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = C0630.m2566("ۖ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-765)) ^ 1444958612;
                        i5 = 1370776703;
                    }
                case -210902828:
                case 1994348320:
                    if (C3019.f9544 >= 0) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۗۜ")) * 53;
                        i4 = ((m6981 ^ i3) * 4783) ^ (-692229015);
                        i5 = 791394341;
                    }
                case -42593353:
                case 327025257:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = C2105.m6981("֨ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-16811)) ^ 1786003426;
                        i5 = -2014035852;
                    }
                case 370616780:
                case 1943561076:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        m6981 = C0630.m2566("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22431)) ^ 1459748427;
                        i5 = 728520165;
                    }
                case 483678828:
                case 1632754696:
                    if (C22628.f73083 <= 0) {
                        m6981 = (C2105.m6981("᩶ۖ") + i2) * (-111);
                        i4 = ((m6981 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        m6981 = (C2105.m6981("ۗۖ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((m6981 ^ i2) * 26397) ^ 2017083406;
                        i5 = 1871081979;
                    }
                default:
                    if (C7811.f24123 >= 0) {
                        m6981 = C0630.m2566("ۖ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-765)) ^ 1444958612;
                        i5 = 1370776703;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۤ᩺")) * (-125);
                        i4 = ((m6981 ^ i3) * 17441) ^ 1211504001;
                        i5 = -739649492;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (l.C4263.m12819() < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (l.C2272.f7362 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L63;
     */
    @Override // l.ActivityC7747, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16234.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        WeakReference weakReference = null;
        InterfaceC9180 interfaceC9180 = null;
        int i = 402481512;
        int i2 = C3911.f12484;
        int i3 = C1128.f4106;
        int m6981 = C2105.m6981("ܿۛ") ^ i3;
        int i4 = ((m6981 ^ i2) * 14483) ^ (-1152524461);
        int i5 = 2001777770;
        while (true) {
            i = ((((i ^ i2) * (-28271)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1982750175:
                case 1321828530:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C0630.m2566("᩺ۡ") ^ i2) * (-63);
                        i4 = ((m6981 ^ i3) * (-9897)) ^ 1672120387;
                        i5 = -552099835;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩷ۗ")) * 87;
                        i4 = ((m6981 ^ i2) * (-21143)) ^ 1278037581;
                        i5 = -1752242783;
                    }
                case -1751948118:
                case -587171136:
                    if (C3911.f12484 >= 0) {
                        m6981 = C0630.m2566("ۜ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        m6981 = C2105.m6981("۠ۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26123) ^ (-2019459198);
                        i5 = 953390963;
                    }
                case -1376217439:
                case 1951098777:
                    weakReference = f49975;
                    if (weakReference != null) {
                        m6981 = C2105.m6981("᩻ۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13871)) ^ (-922927836);
                        i5 = -1631190988;
                    } else {
                        m6981 = C2105.m6981("ۗۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32165)) ^ (-1116718623);
                        i5 = 75800145;
                    }
                case -1362741656:
                case 2015763937:
                    interfaceC9180 = (InterfaceC9180) weakReference.get();
                    if (interfaceC9180 != null) {
                        m6981 = C0630.m2566("ܶۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-17153)) ^ (-2036055940);
                        i5 = 694951609;
                    } else {
                        m6981 = C2105.m6981("֫ۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21657) ^ (-545045959);
                        i5 = -877708366;
                    }
                case -1204937468:
                case 70036380:
                    if (C0798.m2998() != 0) {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩸") + i2) * 5;
                        i4 = ((m6981 ^ i3) * 29323) ^ (-1676358148);
                        i5 = -1182423766;
                    }
                case -1020556556:
                case 1698194518:
                    f49975 = null;
                    m6981 = C2105.m6981("ۗۨ") ^ i3;
                    i4 = ((m6981 ^ i2) * (-32165)) ^ (-1116718623);
                    i5 = 75800145;
                case -820027015:
                case 2006168950:
                    C2105.m6982();
                    C4616.m13552();
                    m6981 = C0630.m2566("ܿ᩹") ^ i3;
                    i4 = ((m6981 ^ i2) * (-17607)) ^ 1758097277;
                    i5 = 185126907;
                case -238087881:
                case 2076672386:
                    if (C1773.m5908() <= 0) {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        m6981 = (C2105.m6981("᩹ۗ") ^ i2) * 65;
                        i4 = ((m6981 ^ i3) * (-4781)) ^ 142588130;
                        i5 = -1910593582;
                    }
                case -212465088:
                case 1504754906:
                    ViewOnClickListenerC1958.m6429();
                    if (C2520.f8000 < 0) {
                        m6981 = C0630.m2566("ܿ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    } else {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    }
                case -100747678:
                case 1383695057:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        m6981 = C0630.m2566("ᩳܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2643) ^ (-191215994);
                        i5 = 1865531166;
                    }
                case 59519785:
                case 2087603995:
                    C4117.m12364();
                    C1916.m6308();
                    break;
                case 189525346:
                case 868769331:
                    if (C0050.m940() <= 0) {
                        m6981 = C0630.m2566("ۜ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        m6981 = C2105.m6981("᩹᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-7567)) ^ (-555912830);
                        i5 = -1264981032;
                    }
                case 201343848:
                case 539417133:
                    C2272.m7505(this);
                    break;
                case 284811257:
                case 1195571842:
                    C1294.m4372();
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        m6981 = C0630.m2566("ۜ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    }
                case 466887500:
                case 811027266:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        m6981 = (i2 - C2105.m6981("֨֡")) * 127;
                        i4 = ((m6981 ^ i3) * 26169) ^ (-1154494447);
                        i5 = -561291567;
                    }
                case 579670658:
                case 1552466420:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ܿ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    } else {
                        m6981 = (C2105.m6981("ۚ֨") ^ i3) * 19;
                        i4 = ((m6981 ^ i2) * (-27027)) ^ 634440522;
                        i5 = -1844171903;
                    }
                case 946407144:
                case 1423786549:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C0630.m2566("ܿ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    } else {
                        m6981 = (C0630.m2566("ۙܰ") + i3) * (-83);
                        i4 = ((m6981 ^ i2) * 3609) ^ (-1320262048);
                        i5 = 1617072999;
                    }
                case 1005650330:
                case 1049755214:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("᩺ۡ") ^ i2) * (-63);
                        i4 = ((m6981 ^ i3) * (-9897)) ^ 1672120387;
                        i5 = -552099835;
                    } else {
                        m6981 = C0630.m2566("ۜۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23129) ^ 987219045;
                        i5 = 1004767151;
                    }
                case 1569967614:
                case 2144621790:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("ۜ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        m6981 = C2105.m6981("ۨ᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20649)) ^ (-1878211302);
                        i5 = 212360391;
                    }
                default:
                    interfaceC9180.onResp(baseResp);
                    m6981 = C2105.m6981("֫ۙ") ^ i3;
                    i4 = ((m6981 ^ i2) * 21657) ^ (-545045959);
                    i5 = -877708366;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38197(InterfaceC9180 interfaceC9180) {
        f49975 = new WeakReference(interfaceC9180);
    }
}
