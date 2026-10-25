package l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: J2SS */
/* renamed from: l.ܽܳ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C16709 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11459 f51294;

    /* renamed from: ۡ᩹ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f51295;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f51296;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f51297;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f51298;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f51299;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f51300;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18090 f51301;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f51302;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Object f51303;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f51304;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f51305;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f51306;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51307;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f51308;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51309;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10632 f51310;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f51311;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f51312;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f51313;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f51314;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f51315;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51316;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51317;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51318;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51319;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m39294(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39296() {
        this.f51309 = false;
        this.f51298 = null;
        m39289();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m39308() {
        short s = f51295[812];
        int i = s * 22560;
        int i2 = s + 5640;
        int i3 = i - (i2 * i2) <= 0 ? 56144 : 23863;
        synchronized (this) {
            if (this.f51316) {
                return this.f51302;
            }
            this.f51316 = true;
            Bitmap m39283 = m39283(m39285());
            if (m39283 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(m39283);
                this.f51302 = bitmapDrawable;
                return bitmapDrawable;
            }
            Drawable m14305 = C4925.m14305(C0630.m2566(C2272.m7507(f51295, 813, 3, i3)) ^ 2124609787);
            this.f51302 = m14305;
            return m14305;
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m39321();

    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
    
        if (r15 <= r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e0, code lost:
    
        r1 = l.C2105.m6981("ᩳܿ") ^ r34;
        r6 = ((r1 ^ r33) * 7181) ^ (-576779629);
        r31 = -1453819525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dd, code lost:
    
        if (r9 > r10) goto L56;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m39283(l.C18090 r43) {
        /*
            Method dump skipped, instructions count: 2614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39283(l.ᩳܰۡ):android.graphics.Bitmap");
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۤ᩻᩷, l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39289() {
        Object obj = null;
        ?? r1 = 0;
        int i = 1808574260;
        int i2 = AbstractC2021.f6743;
        int i3 = ServiceConnectionC3453.f10921;
        int m2566 = C0630.m2566("ܽ᩶") ^ i2;
        int i4 = ((m2566 ^ i3) * (-26501)) ^ 633986601;
        int i5 = -223631184;
        while (true) {
            i = ((((i ^ i3) * 21693) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1829541025:
                case 1580104513:
                    if (obj instanceof C18090) {
                        m2566 = C2105.m6981("ܶ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6995)) ^ 35883253;
                        i5 = 2104268596;
                    } else {
                        m2566 = (C2105.m6981("ᩳ᩺") ^ i2) * 31;
                        i4 = ((m2566 ^ i3) * 25397) ^ (-311231934);
                        i5 = -386506730;
                    }
                case -1806842991:
                case -113478420:
                    RunnableC0588.m2441();
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        m2566 = C0630.m2566("֡ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    }
                case -1770513782:
                case 786034452:
                    C3746.m11371(this.f51301);
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        m2566 = (C0630.m2566("۠֡") + i2) * (-25);
                        i4 = ((m2566 ^ i3) * 2801) ^ (-1748915921);
                        i5 = -792464595;
                    }
                case -1762137502:
                case 1787567588:
                    if (C0483.f2088 >= 0) {
                        m2566 = C0630.m2566("֡ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    } else {
                        m2566 = C0630.m2566("᩵ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27615)) ^ (-958140665);
                        i5 = 244324191;
                    }
                case -1648269127:
                case 734461634:
                    C3746.m11371((Closeable) obj);
                    if (C3537.f11231 >= 0) {
                        m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                        i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        m2566 = (C2105.m6981("᩻۠") ^ i3) * (-47);
                        i4 = ((m2566 ^ i2) * (-7229)) ^ 830355504;
                        i5 = 1360008171;
                    }
                case -1543381526:
                case 252938221:
                    obj = this.f51303;
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (i3 - C2105.m6981("ۢܳ")) * 39;
                        i4 = ((m2566 ^ i2) * 8387) ^ 1062798448;
                        i5 = 565196567;
                    } else {
                        m2566 = (C2105.m6981("ۢ᩸") + i2) * (-107);
                        i4 = ((m2566 ^ i3) * (-23943)) ^ (-1608034420);
                        i5 = 1063150294;
                    }
                case -1437618225:
                case -1120282758:
                    C4616.m13552();
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                        i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۢܳ")) * 39;
                        i4 = ((m2566 ^ i2) * 8387) ^ 1062798448;
                        i5 = 565196567;
                    }
                case -1016619559:
                case 1839800018:
                    if (C3746.f11829 <= 0) {
                        m2566 = C2105.m6981("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩹ۘ")) * (-71);
                        i4 = ((m2566 ^ i2) * 4361) ^ (-2029836060);
                        i5 = 370021736;
                    }
                case -988643853:
                case 418804361:
                    C3683.m11222();
                    m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                    i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                    i5 = -1065697230;
                case -595468600:
                case 1480172494:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                        i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        m2566 = (C2105.m6981("۫᩷") ^ i3) * 19;
                        i4 = ((m2566 ^ i2) * (-16673)) ^ (-1961483774);
                        i5 = 1429403469;
                    }
                case -315793392:
                case 470864837:
                    this.f51301 = r1;
                    this.f51310 = r1;
                    break;
                case -116414693:
                case 2072990658:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                        i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        m2566 = C2105.m6981("᩻᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * 32145) ^ (-1839470916);
                        i5 = -1876313306;
                    }
                case 84909995:
                case 617051110:
                    if (C3537.f11231 >= 0) {
                        m2566 = C2105.m6981("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        m2566 = C2105.m6981("۫᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * 21837) ^ (-527993154);
                        i5 = 2046881785;
                    }
                case 132322416:
                case 940900078:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("ۘۖ") ^ i3) * 47;
                        i4 = ((m2566 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        m2566 = C0630.m2566("֡ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    }
                case 168900428:
                case 773725998:
                    this.f51303 = this.f51306;
                    m2566 = (C2105.m6981("ᩳ᩺") ^ i2) * 31;
                    i4 = ((m2566 ^ i3) * 25397) ^ (-311231934);
                    i5 = -386506730;
                case 464416306:
                case 1501654129:
                    r1 = 0;
                    r1 = 0;
                    if (C0483.m2121()) {
                        m2566 = C2105.m6981("᩹᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-6575)) ^ (-1754660697);
                        i5 = -253466220;
                    } else {
                        m2566 = (C0630.m2566("ܺ᩵") + i2) * 13;
                        i4 = ((m2566 ^ i3) * (-16273)) ^ 402799223;
                        i5 = -218381705;
                    }
                case 831329913:
                case 1092320032:
                    C3746.m11369();
                    C0422.m1963();
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        m2566 = C0630.m2566("ܰۘ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26851)) ^ (-1745463806);
                        i5 = 1919752653;
                    }
            }
            return;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m39297() {
        int i = 0;
        int i2 = 0;
        int i3 = -1822741520;
        int i4 = C1047.f3863;
        int i5 = C3746.f11829;
        int m2566 = (i5 - C0630.m2566("ܺۗ")) * (-41);
        int i6 = ((m2566 ^ i4) * (-7569)) ^ 1186567475;
        int i7 = -1277251858;
        while (true) {
            i3 = ((((i3 ^ i4) * (-19945)) >> 31) & i6) ^ (m2566 ^ i7);
            switch (i3) {
                case -2058083211:
                case -1364119363:
                    if (C3663.f11553) {
                        m2566 = (i5 - C2105.m6981("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m2566 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        m2566 = C2105.m6981("᩷ۙ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-31459)) ^ (-1062967875);
                        i7 = 1538216633;
                    }
                case -2042842547:
                case 1101751547:
                    AbstractC2021.m6574();
                    C0714.m2805();
                    m2566 = (C2105.m6981("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((m2566 ^ i4) * 13273) ^ (-1941939559);
                    i7 = 22790491;
                case -1715167316:
                case 367403409:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C0630.m2566("ۙᩳ") + i4) * 17;
                        i6 = ((m2566 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    } else {
                        m2566 = (C2105.m6981("ۘۘ") + i4) * (-43);
                        i6 = ((m2566 ^ i5) * (-25955)) ^ (-1159734764);
                        i7 = 113279068;
                    }
                case -1663618781:
                case 9271953:
                    C0050.m940();
                    C3432.m10477();
                    return null;
                case -1658219885:
                case 2016644639:
                    if (C2272.m7503()) {
                        m2566 = C0630.m2566("᩸֡") ^ i5;
                        i6 = ((m2566 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    } else {
                        m2566 = (C2105.m6981("۫ۗ") ^ i4) * 25;
                        i6 = ((m2566 ^ i5) * 22675) ^ 109024213;
                        i7 = 1225360433;
                    }
                case -1383061554:
                case 1848444724:
                    C11340.m28031();
                    if (C3537.m10746() <= 0) {
                        m2566 = (C2105.m6981("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((m2566 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    } else {
                        m2566 = C0630.m2566("᩸֡") ^ i5;
                        i6 = ((m2566 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    }
                case -1186932247:
                case -196700972:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("᩸֡") ^ i5;
                        i6 = ((m2566 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    } else {
                        m2566 = (i4 - C0630.m2566("᩸᩺")) * (-7);
                        i6 = ((m2566 ^ i5) * (-14801)) ^ (-1123178958);
                        i7 = 553333699;
                    }
                case -902035864:
                case 1214951955:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("ۙᩳ") + i4) * 17;
                        i6 = ((m2566 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    } else {
                        m2566 = (C2105.m6981("ܺ᩶") ^ i5) * 57;
                        i6 = ((m2566 ^ i4) * (-6579)) ^ (-24240748);
                        i7 = 2068928130;
                    }
                case -379128582:
                case 881254998:
                    i = this.f51308;
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = (i4 - C0630.m2566("ۙۧ")) * 47;
                        i6 = ((m2566 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    } else {
                        m2566 = (C0630.m2566("᩶۠") + i4) * (-69);
                        i6 = ((m2566 ^ i5) * (-7367)) ^ 131624364;
                        i7 = 1937156316;
                    }
                case 123053396:
                case 293249528:
                    C3432.m10477();
                    if (C1005.m3501()) {
                        m2566 = (C0630.m2566("ۙᩳ") + i4) * 17;
                        i6 = ((m2566 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    } else {
                        m2566 = (C2105.m6981("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((m2566 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    }
                case 195935869:
                case 445027664:
                    if (C1294.f4556 >= 0) {
                        m2566 = (i5 - C2105.m6981("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m2566 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        m2566 = (C0630.m2566("۬᩵") + i4) * (-101);
                        i6 = ((m2566 ^ i5) * 13149) ^ 174878732;
                        i7 = -444939410;
                    }
                case 288873065:
                case 367672706:
                    if (C3245.m9925() == 0) {
                        m2566 = (C2105.m6981("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((m2566 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    } else {
                        m2566 = (i4 - C0630.m2566("ۙۧ")) * 47;
                        i6 = ((m2566 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    }
                case 980602369:
                case 1314446029:
                    i2 = this.f51314;
                    if (C3537.m10746() <= 0) {
                        m2566 = (i5 - C2105.m6981("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m2566 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        m2566 = (C0630.m2566("۬ۚ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m2566 ^ i4) * 5701) ^ (-44948215);
                        i7 = 1314590784;
                    }
                case 1031086366:
                case 1602437109:
                    if (C0422.f1886 <= 0) {
                        m2566 = (i5 - C2105.m6981("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((m2566 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        m2566 = C2105.m6981("۟ۢ") ^ i5;
                        i6 = ((m2566 ^ i4) * 9617) ^ (-1673366814);
                        i7 = -543601937;
                    }
                case 1411970264:
                case 1634027075:
                    return m39277(i, i2, this.f51313);
                default:
                    if (C0422.f1886 <= 0) {
                        m2566 = (i4 - C0630.m2566("ۙۧ")) * 47;
                        i6 = ((m2566 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    } else {
                        m2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((m2566 ^ i4) * (-27189)) ^ 857947723;
                        i7 = 1836562534;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39276(int i) {
        int i2;
        int i3;
        int m2566;
        int i4;
        int i5;
        int i6;
        C12164 c12164;
        int m25662;
        int i7;
        int i8;
        int i9;
        int m25663;
        int i10;
        int i11;
        int i12;
        int m6981;
        int i13;
        int i14 = -774747917;
        int i15 = RunnableC0588.f2309;
        int i16 = C4075.f12947;
        int m69812 = C2105.m6981("ۖ۫") ^ i15;
        int i17 = ((m69812 ^ i16) * 25213) ^ (-1270382550);
        int i18 = m69812 ^ 1900677006;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        C12164 c121642 = null;
        short[] sArr4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i29 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 6851) >> 31));
            switch (i14) {
                case -2061822441:
                case 211132895:
                    i2 = i19;
                    c12164 = c121642;
                    i29 = 2;
                    if (C1047.f3863 >= 0) {
                        i19 = i2;
                        m25663 = C0630.m2566("ܿۡ") ^ i15;
                        i10 = i19;
                        i11 = ((m25663 ^ i16) * (-19287)) ^ (-249316435);
                        i12 = -83259603;
                        i5 = m25663 ^ i12;
                        c121642 = c12164;
                        i17 = i11;
                        i19 = i10;
                        i18 = i5;
                    } else {
                        m25662 = (C0630.m2566("᩻ܶ") + i15) * (-31);
                        i7 = ((m25662 ^ i16) * 10795) ^ (-631653372);
                        i8 = -1967836865;
                        i9 = m25662 ^ i8;
                        c121642 = c12164;
                        i17 = i7;
                        int i30 = i2;
                        i18 = i9;
                        i19 = i30;
                    }
                case -1971892261:
                case 33971603:
                    return C19462.m44858(str3, str, C0964.m3396(sArr3, 89, 1, i21), str2);
                case -1939801584:
                case 1660065536:
                    AbstractC2021.m6574();
                    if (C3911.f12484 >= 0) {
                        m6981 = (C0630.m2566("֡ܽ") ^ i15) * 67;
                        i6 = ((m6981 ^ i16) * (-18051)) ^ (-2100183152);
                        i13 = 2003938024;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    } else {
                        i2 = i19;
                        i3 = i28;
                        m2566 = C0630.m2566("ܿۗ") ^ i16;
                        i17 = ((m2566 ^ i15) * 7531) ^ (-148482814);
                        i4 = -655717144;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i302 = i2;
                        i18 = i9;
                        i19 = i302;
                    }
                case -1890602081:
                case 1028182931:
                    if (C4616.m13554(str4, C2272.m7507(sArr, i22, i23, i21))) {
                        m6981 = C0630.m2566("᩶᩹") ^ i16;
                        i6 = ((m6981 ^ i15) * (-27717)) ^ 323411321;
                        i13 = 1388314252;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    } else {
                        str2 = str4;
                        m6981 = (C0630.m2566("֫ۙ") ^ i16) * 3;
                        i6 = ((m6981 ^ i15) * (-24845)) ^ (-1489955423);
                        i13 = -481520627;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    }
                case -1694561032:
                case -281762037:
                    i2 = i19;
                    i3 = i28;
                    s = sArr4[c];
                    s2 = 14428;
                    if (C2958.f9394 < 0) {
                        m2566 = (C0630.m2566("᩵᩻") ^ i16) * (-113);
                        i17 = ((m2566 ^ i15) * (-17369)) ^ (-2143826405);
                        i4 = 470811271;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i3022 = i2;
                        i18 = i9;
                        i19 = i3022;
                    }
                    m2566 = C0630.m2566("ۖ֫") ^ i15;
                    i17 = ((m2566 ^ i16) * 28795) ^ (-685407079);
                    i4 = 1027170003;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i30222 = i2;
                    i18 = i9;
                    i19 = i30222;
                case -1689107181:
                case -1676585480:
                    i2 = i19;
                    i3 = i28;
                    if (i == 0) {
                        int m25664 = C0630.m2566("᩷ۡ") ^ i15;
                        int i31 = ((m25664 ^ i16) * 1591) ^ 1513988276;
                        int i32 = m25664 ^ (-1247570969);
                        i28 = i3;
                        i17 = i31;
                        i19 = i2;
                        i18 = i32;
                    } else {
                        m2566 = C0630.m2566("᩹ۧ") ^ i15;
                        i17 = ((m2566 ^ i16) * (-21955)) ^ 1003239518;
                        i4 = -705133055;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i302222 = i2;
                        i18 = i9;
                        i19 = i302222;
                    }
                case -1530758935:
                case -477477402:
                    RunnableC0588.m2441();
                    return null;
                case -1472716338:
                case -89630446:
                    sArr = f51295;
                    i22 = 86;
                    i23 = 1;
                    if (C0483.f2088 >= 0) {
                        i2 = i19;
                        i3 = i28;
                        m2566 = C0630.m2566("ܿۗ") ^ i16;
                        i17 = ((m2566 ^ i15) * 7531) ^ (-148482814);
                        i4 = -655717144;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i3022222 = i2;
                        i18 = i9;
                        i19 = i3022222;
                    } else {
                        m6981 = (C2105.m6981("۫᩶") ^ i15) * 45;
                        i6 = ((m6981 ^ i16) * 1871) ^ 169628312;
                        i13 = 745110887;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    }
                case -1418024558:
                case -561478625:
                    return C0050.m935(i);
                case -1345958070:
                case 862280792:
                    str3 = C1711.m5726(sArr2, i24, i19, i21);
                    sArr3 = f51295;
                    if (C4263.f13799 <= 0) {
                        c12164 = c121642;
                        m25663 = C0630.m2566("ܿۡ") ^ i15;
                        i10 = i19;
                        i11 = ((m25663 ^ i16) * (-19287)) ^ (-249316435);
                        i12 = -83259603;
                        i5 = m25663 ^ i12;
                        c121642 = c12164;
                        i17 = i11;
                        i19 = i10;
                        i18 = i5;
                    } else {
                        m6981 = C2105.m6981("ܺۗ") ^ i16;
                        i6 = ((m6981 ^ i15) * 3315) ^ (-1289673962);
                        i13 = 36485342;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    }
                case -1344928430:
                case 234738706:
                    i2 = i19;
                    c12164 = c121642;
                    if (c12164.matches()) {
                        m25662 = C0630.m2566("ۤۡ") ^ i16;
                        i7 = ((m25662 ^ i15) * (-16497)) ^ (-1618015138);
                        i8 = 1630890434;
                        i9 = m25662 ^ i8;
                        c121642 = c12164;
                        i17 = i7;
                        int i30222222 = i2;
                        i18 = i9;
                        i19 = i30222222;
                    } else {
                        c121642 = c12164;
                        int m25665 = (C0630.m2566("۠ۡ") + i16) * 57;
                        i6 = ((m25665 ^ i15) * (-17895)) ^ 618007428;
                        i19 = i2;
                        i18 = m25665 ^ 1048723293;
                        i17 = i6;
                    }
                case -1280764476:
                case -391044364:
                    i2 = i19;
                    i3 = i28;
                    sArr4 = f51295;
                    if (C0714.m2805()) {
                        m2566 = C0630.m2566("ۗܶ") ^ i15;
                        i17 = ((m2566 ^ i16) * 22031) ^ 153702933;
                        i4 = -1238273493;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i302222222 = i2;
                        i18 = i9;
                        i19 = i302222222;
                    }
                    m2566 = C0630.m2566("ܿۗ") ^ i16;
                    i17 = ((m2566 ^ i15) * 7531) ^ (-148482814);
                    i4 = -655717144;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i3022222222 = i2;
                    i18 = i9;
                    i19 = i3022222222;
                case -856826907:
                case 830169285:
                    i2 = i19;
                    i3 = i28;
                    i26 = s * s2;
                    i27 = s * s;
                    i25 = 52041796;
                    if (!C2126.f7087) {
                        m2566 = (C0630.m2566("ۖۧ") + i15) * 53;
                        i17 = ((m2566 ^ i16) * 3145) ^ (-2099571450);
                        i4 = 1043284419;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i30222222222 = i2;
                        i18 = i9;
                        i19 = i30222222222;
                    }
                    m2566 = C0630.m2566("ܿۗ") ^ i16;
                    i17 = ((m2566 ^ i15) * 7531) ^ (-148482814);
                    i4 = -655717144;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i302222222222 = i2;
                    i18 = i9;
                    i19 = i302222222222;
                case -794627147:
                case -412500617:
                    c12164 = c121642;
                    str4 = c12164.group(i29);
                    C3537.m10749(str4);
                    if (C4075.f12947 >= 0) {
                        i2 = i19;
                        c121642 = c12164;
                        i3 = i28;
                        m2566 = (C0630.m2566("᩶ۨ") + i16) * (-117);
                        i17 = ((m2566 ^ i15) * 3863) ^ 1339290568;
                        i4 = -245746140;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i3022222222222 = i2;
                        i18 = i9;
                        i19 = i3022222222222;
                    } else {
                        m25663 = (C0630.m2566("ۧۙ") ^ i16) * (-29);
                        i10 = i19;
                        i11 = ((m25663 ^ i15) * 24839) ^ (-1807478069);
                        i12 = 1999740108;
                        i5 = m25663 ^ i12;
                        c121642 = c12164;
                        i17 = i11;
                        i19 = i10;
                        i18 = i5;
                    }
                case -682309203:
                case 744183554:
                    return C3683.m11225(f51295, 80, 6, i21);
                case -646098161:
                case 1353808456:
                    if (C3663.f11553) {
                        m6981 = (C0630.m2566("֡ܽ") ^ i15) * 67;
                        i6 = ((m6981 ^ i16) * (-18051)) ^ (-2100183152);
                        i13 = 2003938024;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    } else {
                        i2 = i19;
                        i3 = i28;
                        m2566 = C0630.m2566("ۖ֫") ^ i15;
                        i17 = ((m2566 ^ i16) * 28795) ^ (-685407079);
                        i4 = 1027170003;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i30222222222222 = i2;
                        i18 = i9;
                        i19 = i30222222222222;
                    }
                case -622354025:
                case -21445742:
                    str2 = C3432.m10478(str4, i20);
                    m6981 = (C0630.m2566("֫ۙ") ^ i16) * 3;
                    i6 = ((m6981 ^ i15) * (-24845)) ^ (-1489955423);
                    i13 = -481520627;
                    i18 = m6981 ^ i13;
                    i17 = i6;
                case -545882813:
                case 1444046429:
                    i2 = i19;
                    i3 = i28;
                    if ((i27 + i25) - i26 >= 0) {
                        m2566 = (i15 - C0630.m2566("۠᩵")) * (-89);
                        i17 = ((m2566 ^ i16) * (-11129)) ^ 183735566;
                        i4 = 564421146;
                    } else {
                        m2566 = C0630.m2566("֡۬") ^ i16;
                        i17 = ((m2566 ^ i15) * 16209) ^ 267539165;
                        i4 = -1217447903;
                    }
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i302222222222222 = i2;
                    i18 = i9;
                    i19 = i302222222222222;
                case -378624921:
                case 1562821039:
                    i2 = i19;
                    c12164 = c121642;
                    i20 = 1;
                    str = c12164.group(1);
                    C3019.m9257(str);
                    if (!C1504.f5354) {
                        m25662 = (i15 - C0630.m2566("᩷ܿ")) * (-51);
                        i7 = ((m25662 ^ i16) * 29049) ^ 2122336867;
                        i8 = 1608864580;
                        i9 = m25662 ^ i8;
                        c121642 = c12164;
                        i17 = i7;
                        int i3022222222222222 = i2;
                        i18 = i9;
                        i19 = i3022222222222222;
                    }
                    c121642 = c12164;
                    i3 = i28;
                    m2566 = (C0630.m2566("᩶ۨ") + i16) * (-117);
                    i17 = ((m2566 ^ i15) * 3863) ^ 1339290568;
                    i4 = -245746140;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i30222222222222222 = i2;
                    i18 = i9;
                    i19 = i30222222222222222;
                case -55948394:
                case 801789627:
                    i2 = i19;
                    i3 = i28;
                    c = 'O';
                    if (C0237.m1481() < 0) {
                        m2566 = C2105.m6981("ۚ֫") ^ i16;
                        i17 = ((m2566 ^ i15) * (-10889)) ^ 1029739161;
                        i4 = 1735355586;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i302222222222222222 = i2;
                        i18 = i9;
                        i19 = i302222222222222222;
                    }
                    m2566 = (C0630.m2566("᩶ۨ") + i16) * (-117);
                    i17 = ((m2566 ^ i15) * 3863) ^ 1339290568;
                    i4 = -245746140;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i3022222222222222222 = i2;
                    i18 = i9;
                    i19 = i3022222222222222222;
                case 232153248:
                case 1444087020:
                    i2 = i19;
                    i3 = i28;
                    i21 = 22621;
                    m2566 = (C2105.m6981("ۘᩳ") ^ i16) * 29;
                    i17 = ((m2566 ^ i15) * (-22813)) ^ 1041117251;
                    i4 = -293945489;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i30222222222222222222 = i2;
                    i18 = i9;
                    i19 = i30222222222222222222;
                case 988707219:
                case 1060412562:
                    i2 = i19;
                    i3 = i28;
                    i21 = 24266;
                    m2566 = (C2105.m6981("ۘᩳ") ^ i16) * 29;
                    i17 = ((m2566 ^ i15) * (-22813)) ^ 1041117251;
                    i4 = -293945489;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i302222222222222222222 = i2;
                    i18 = i9;
                    i19 = i302222222222222222222;
                case 1001768977:
                case 1904830364:
                    C1128.m3851();
                    i2 = i19;
                    i3 = i28;
                    m2566 = C0630.m2566("ۖ֫") ^ i15;
                    i17 = ((m2566 ^ i16) * 28795) ^ (-685407079);
                    i4 = 1027170003;
                    i9 = m2566 ^ i4;
                    i28 = i3;
                    int i3022222222222222222222 = i2;
                    i18 = i9;
                    i19 = i3022222222222222222222;
                case 1275085344:
                case 1575234603:
                    i2 = i19;
                    c121642 = f51294.matcher((CharSequence) C0050.m935(i));
                    if (i >= 26040000) {
                        int m25666 = C0630.m2566("ۚۗ") ^ i15;
                        i17 = ((m25666 ^ i16) * 28273) ^ 1018593514;
                        i5 = m25666 ^ (-1811484544);
                        i19 = i2;
                        i28 = 26040000;
                        i18 = i5;
                    } else {
                        i28 = 26040000;
                        int m256652 = (C0630.m2566("۠ۡ") + i16) * 57;
                        i6 = ((m256652 ^ i15) * (-17895)) ^ 618007428;
                        i19 = i2;
                        i18 = m256652 ^ 1048723293;
                        i17 = i6;
                    }
                case 1572666442:
                case 1772694741:
                    if (C21923.m49329()) {
                        c12164 = c121642;
                        m25663 = C0630.m2566("ܿۡ") ^ i15;
                        i10 = i19;
                        i11 = ((m25663 ^ i16) * (-19287)) ^ (-249316435);
                        i12 = -83259603;
                        i5 = m25663 ^ i12;
                        c121642 = c12164;
                        i17 = i11;
                        i19 = i10;
                        i18 = i5;
                    } else {
                        i2 = i19;
                        i3 = i28;
                        m2566 = C0630.m2566("ۖ֫") ^ i15;
                        i17 = ((m2566 ^ i16) * 28795) ^ (-685407079);
                        i4 = 1027170003;
                        i9 = m2566 ^ i4;
                        i28 = i3;
                        int i30222222222222222222222 = i2;
                        i18 = i9;
                        i19 = i30222222222222222222222;
                    }
                case 2047902361:
                case 2053005839:
                    sArr2 = f51295;
                    i24 = 87;
                    i19 = 2;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        c12164 = c121642;
                        m25663 = C0630.m2566("ܿۡ") ^ i15;
                        i10 = i19;
                        i11 = ((m25663 ^ i16) * (-19287)) ^ (-249316435);
                        i12 = -83259603;
                        i5 = m25663 ^ i12;
                        c121642 = c12164;
                        i17 = i11;
                        i19 = i10;
                        i18 = i5;
                    } else {
                        m6981 = (i15 - C2105.m6981("۠᩹")) * (-93);
                        i6 = ((m6981 ^ i16) * (-25167)) ^ 1761321640;
                        i13 = 1018066010;
                        i18 = m6981 ^ i13;
                        i17 = i6;
                    }
                default:
                    i2 = i19;
                    i3 = i28;
                    C12164 c121643 = c121642;
                    if (i < i3) {
                        c121642 = c121643;
                        int m256642 = C0630.m2566("᩷ۡ") ^ i15;
                        int i312 = ((m256642 ^ i16) * 1591) ^ 1513988276;
                        int i322 = m256642 ^ (-1247570969);
                        i28 = i3;
                        i17 = i312;
                        i19 = i2;
                        i18 = i322;
                    } else {
                        int m25667 = (C0630.m2566("ۢۤ") + i16) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        c121642 = c121643;
                        i17 = ((m25667 ^ i15) * 25935) ^ 1365225850;
                        i19 = i2;
                        i18 = m25667 ^ 2005296612;
                        i28 = i3;
                    }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39317() {
        PluginContext pluginContext = null;
        String str = null;
        String str2 = null;
        int i = -415260335;
        int i2 = C4117.f13076;
        int i3 = C1773.f6144;
        int m6981 = (C2105.m6981("᩺ۚ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i4 = ((m6981 ^ i2) * (-28839)) ^ (-1126738264);
        int i5 = -1076660728;
        while (true) {
            i = ((((i ^ i2) * 27919) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2114102400:
                case -1876373691:
                    C0382.m1848();
                    if (C2520.f8000 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۛ᩺")) * (-117);
                        i4 = ((m6981 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        m6981 = C2105.m6981("ܿ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    }
                case -2014235711:
                case -882160281:
                    if (C0798.m3007(str) >= 3) {
                        m6981 = C0630.m2566("֨᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * 753) ^ (-702614900);
                        i5 = -1723457456;
                    } else {
                        m6981 = C2105.m6981("᩵᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                case -1869351144:
                case 1753051826:
                    str2 = C1711.m5739((C10632) pluginContext, str);
                    if (str2 != null) {
                        m6981 = (C2105.m6981("ܳᩳ") + i3) * (-81);
                        i4 = ((m6981 ^ i2) * 10547) ^ 1638568247;
                        i5 = -1796276253;
                    } else {
                        m6981 = C2105.m6981("᩵᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                case -1658952893:
                case 1600828434:
                    if (RunnableC3474.m10630()) {
                        m6981 = (i3 - C2105.m6981("ܺ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i2) * 10851) ^ (-1820321035);
                        i5 = 2070642298;
                    } else {
                        m6981 = C0630.m2566("۬ܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    }
                case -1590953367:
                case 25199017:
                    return str2;
                case -1511634306:
                case 1680806915:
                    if (C1005.m3500(1, str) == '}') {
                        m6981 = (C0630.m2566("ᩴ֡") ^ i2) * 47;
                        i4 = ((m6981 ^ i3) * 14027) ^ 1993522122;
                        i5 = 2141198798;
                    } else {
                        m6981 = C2105.m6981("᩵᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                case -856185337:
                case 2063333069:
                    if (C0798.f2919) {
                        m6981 = (C0630.m2566("۬ۤ") + i2) * 35;
                        i4 = ((m6981 ^ i3) * 4909) ^ 1677477687;
                        i5 = -905816199;
                    } else {
                        m6981 = C0630.m2566("᩶ۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4057) ^ 1184601968;
                        i5 = 9306388;
                    }
                case -812682458:
                case 1415121706:
                    if (C0798.m3000(str, 0) == '{') {
                        m6981 = C2105.m6981("֨֫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11693)) ^ (-429132053);
                        i5 = -1956929909;
                    } else {
                        m6981 = C2105.m6981("᩵᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                case -712433004:
                case -589354844:
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        m6981 = (C0630.m2566("֡۬") + i3) * 37;
                        i4 = ((m6981 ^ i2) * 17497) ^ (-362361940);
                        i5 = -815989874;
                    }
                case -468536022:
                case -432868901:
                    if (C2167.f7158 >= 0) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        m6981 = C2105.m6981("۫۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4159)) ^ 273780736;
                        i5 = -1978241182;
                    }
                case -397894948:
                case 780444700:
                    if (C2958.f9394 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۛ᩺")) * (-117);
                        i4 = ((m6981 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۨ۟")) * (-15);
                        i4 = ((m6981 ^ i2) * 3547) ^ (-994272142);
                        i5 = 940557250;
                    }
                case -313822960:
                case 1101158836:
                    C3245.m9925();
                    if (C3746.f11829 > 0) {
                        m6981 = (C0630.m2566("۬ۤ") + i2) * 35;
                        i4 = ((m6981 ^ i3) * 4909) ^ 1677477687;
                        i5 = -905816199;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۛ᩺")) * (-117);
                        i4 = ((m6981 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    }
                case -231511806:
                case 332744244:
                    C3911.m11924();
                    m6981 = (C0630.m2566("۬ۤ") + i2) * 35;
                    i4 = ((m6981 ^ i3) * 4909) ^ 1677477687;
                    i5 = -905816199;
                case -220687997:
                case 1412400791:
                    return str;
                case 20743973:
                case 1591763071:
                    if (C3911.m11924() <= 0) {
                        m6981 = C2105.m6981("ܿ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    } else {
                        m6981 = C2105.m6981("᩵ۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    }
                case 237345419:
                case 1528681077:
                    str = this.f51311;
                    if (C0382.m1848()) {
                        m6981 = C0630.m2566("۬ܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    } else {
                        m6981 = (C2105.m6981("ܿۖ") ^ i2) * (-113);
                        i4 = ((m6981 ^ i3) * (-29009)) ^ (-1878844420);
                        i5 = 2053388887;
                    }
                case 397163332:
                case 1343160796:
                    C1128.m3851();
                    return null;
                case 737587490:
                case 1818728144:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C0630.m2566("۬ܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    } else {
                        m6981 = (C2105.m6981("᩹ۖ") + i3) * 127;
                        i4 = ((m6981 ^ i2) * (-24633)) ^ 749928663;
                        i5 = -675484202;
                    }
                case 774921159:
                case 1231233763:
                    if (C1773.f6144 <= 0) {
                        m6981 = C2105.m6981("ܿ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    } else {
                        m6981 = C0630.m2566("ۡ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15599)) ^ 2035524514;
                        i5 = -575505281;
                    }
                case 1727715343:
                case 1890324818:
                    pluginContext = m39304();
                    if (C1128.f4106 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۛ᩺")) * (-117);
                        i4 = ((m6981 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        m6981 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18723)) ^ (-1491740040);
                        i5 = -1098761422;
                    }
                default:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        m6981 = (C0630.m2566("ܽۢ") + i2) * 63;
                        i4 = ((m6981 ^ i3) * 15011) ^ (-1236771657);
                        i5 = -959735209;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (l.C0237.m1481() < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (l.C3663.m11168() < 0) goto L48;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m39312() {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39312():java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39290(Throwable th) {
        PluginContext pluginContext = null;
        int i = -894980230;
        int i2 = C3019.f9544;
        int i3 = C3245.f10203;
        int m2566 = (i2 - C0630.m2566("ۤᩴ")) * 9;
        int i4 = ((m2566 ^ i3) * 30709) ^ 1212056279;
        int i5 = -1820380319;
        while (true) {
            i = ((((i ^ i3) * (-18795)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2069007490:
                case -908436607:
                    if (C3019.f9544 >= 0) {
                        m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                        i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        m2566 = (C0630.m2566("ܺۘ") ^ i2) * 83;
                        i4 = ((m2566 ^ i3) * 29043) ^ (-1845218981);
                        i5 = 1419426994;
                    }
                case -1929895434:
                case -243119161:
                    if (C4075.f12947 >= 0) {
                        m2566 = (i3 - C0630.m2566("᩶ۚ")) * (-85);
                        i4 = ((m2566 ^ i2) * 18747) ^ 1340324612;
                        i5 = -948059490;
                    } else {
                        m2566 = C2105.m6981("ܶ֨") ^ i3;
                        i4 = ((m2566 ^ i2) * 19545) ^ 345820473;
                        i5 = 1871163627;
                    }
                case -1694287520:
                case -813755510:
                    if (C3537.f11231 >= 0) {
                        m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                        i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        m2566 = (C2105.m6981("ۧᩴ") ^ i2) * 109;
                        i4 = ((m2566 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    }
                case -1528016856:
                case 1106044557:
                    if (C22628.f73083 <= 0) {
                        m2566 = (C2105.m6981("ۧᩴ") ^ i2) * 109;
                        i4 = ((m2566 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    } else {
                        m2566 = C0630.m2566("ᩳۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8309) ^ 1928041332;
                        i5 = -477794674;
                    }
                case -1305663171:
                case 358683328:
                    C3911.m11924();
                    if (C3537.m10746() <= 0) {
                        m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                        i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩶ۚ")) * (-85);
                        i4 = ((m2566 ^ i2) * 18747) ^ 1340324612;
                        i5 = -948059490;
                    }
                case -799371387:
                case 944884326:
                    C2520.m8026();
                    ViewOnClickListenerC1958.m6429();
                    m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                    i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                    i5 = -1943017356;
                case -773128309:
                case 685251920:
                    ((C10632) pluginContext).log(th);
                    break;
                case -188069264:
                case 2034018081:
                    if (C1005.m3501()) {
                        m2566 = C0630.m2566("ۛ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 24119) ^ (-2045670338);
                        i5 = 472062278;
                    } else {
                        m2566 = (C2105.m6981("ۧᩴ") ^ i2) * 109;
                        i4 = ((m2566 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    }
                case 111473187:
                case 147270723:
                    C0714.m2805();
                    break;
                case 398666498:
                case 1236634354:
                    if (RunnableC1108.f4040) {
                        m2566 = (C2105.m6981("۟ۚ") ^ i2) * (-107);
                        i4 = ((m2566 ^ i3) * 21003) ^ (-1772435409);
                        i5 = 1659747213;
                    } else {
                        m2566 = (C2105.m6981("ۧᩴ") ^ i2) * 109;
                        i4 = ((m2566 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    }
                case 682493842:
                case 1308495281:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("᩶᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1603)) ^ 2028026109;
                        i5 = -1122711328;
                    } else {
                        m2566 = (C2105.m6981("ۧ֫") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    }
                case 923506289:
                case 991535532:
                    if (C4263.m12819() >= 0) {
                        m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                        i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۨ۫")) * 31;
                        i4 = ((m2566 ^ i3) * (-28931)) ^ (-1454445366);
                        i5 = -2020075970;
                    }
                case 1063412581:
                case 1607317336:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C2105.m6981("ۧᩴ") ^ i2) * 109;
                        i4 = ((m2566 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    } else {
                        m2566 = (C2105.m6981("ۚ֨") + i3) * (-67);
                        i4 = ((m2566 ^ i2) * (-21639)) ^ 1598668999;
                        i5 = -1321971270;
                    }
                case 1261476516:
                case 1503315485:
                    if (C5695.f17556 >= 0) {
                        m2566 = (i3 - C2105.m6981("ᩳۘ")) * 93;
                        i4 = ((m2566 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        m2566 = (C2105.m6981("᩸ۧ") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * 27713) ^ 778628462;
                        i5 = -1062604369;
                    }
                case 1354108881:
                case 1537082009:
                    pluginContext = m39304();
                    if (C3746.f11829 <= 0) {
                        m2566 = (C2105.m6981("ۧ֫") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    } else {
                        m2566 = C2105.m6981("֡ۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1275)) ^ 745676576;
                        i5 = -208465276;
                    }
                default:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C2105.m6981("ۧ֫") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    } else {
                        m2566 = (C0630.m2566("᩶ܰ") + i3) * (-11);
                        i4 = ((m2566 ^ i2) * (-24151)) ^ 1256091035;
                        i5 = -40304021;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (l.RunnableC1108.f4040 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (l.C1504.f5354 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (l.RunnableC3474.f10992 <= 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16709() {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.<init>():void");
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39298() {
        m39289();
        this.f51303 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PluginContext m39304() {
        int i = 1934591637;
        int i2 = C22628.f73083;
        int i3 = C3019.f9544;
        int m6981 = C2105.m6981("۟۠") ^ i2;
        int i4 = ((m6981 ^ i3) * 1547) ^ (-95086371);
        int i5 = 82392901;
        while (true) {
            i = ((((i ^ i3) * (-655)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1977453168:
                case -1564717366:
                    if (C3746.m11369() >= 0) {
                        m6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        m6981 = (C2105.m6981("᩷ۗ") + i2) * (-77);
                        i4 = ((m6981 ^ i3) * 1535) ^ (-903299890);
                        i5 = 1015749321;
                    }
                case -1704976817:
                case 1179756654:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        m6981 = (C2105.m6981("֨۫") ^ i3) * (-123);
                        i4 = ((m6981 ^ i2) * 3485) ^ 769255082;
                        i5 = 727204459;
                    }
                case -1619875815:
                case 371268922:
                    return this.f51310;
                case -1504567799:
                case -181075536:
                    if (C4616.f14690 <= 0) {
                        m6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        m6981 = (C2105.m6981("ۘ᩷") + i3) * 47;
                        i4 = ((m6981 ^ i2) * 24875) ^ 1009791671;
                        i5 = -835682658;
                    }
                case -1485178416:
                case 1419236569:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C0630.m2566("ᩳ᩹") + i2) * 47;
                        i4 = ((m6981 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        m6981 = (C2105.m6981("᩶۬") ^ i3) * (-107);
                        i4 = ((m6981 ^ i2) * (-22927)) ^ (-1317325381);
                        i5 = -2136646429;
                    }
                case -1477384354:
                case 1860459743:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("ܺ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    } else {
                        m6981 = (C2105.m6981("᩹ܺ") ^ i2) * 3;
                        i4 = ((m6981 ^ i3) * 26577) ^ 2125942239;
                        i5 = -180919329;
                    }
                case -1375175424:
                case -565387600:
                    C1773.m5908();
                    return null;
                case -742797377:
                case 230745430:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("֡ܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14435) ^ (-1836629356);
                        i5 = 1327588575;
                    } else {
                        m6981 = C2105.m6981("ᩳۤ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26759)) ^ 1010278068;
                        i5 = -417628803;
                    }
                case -583511837:
                case 1176653698:
                    if (C4159.m12565() < 0) {
                        m6981 = C0630.m2566("ܺ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    } else {
                        m6981 = (C0630.m2566("֡ۤ") ^ i2) * (-119);
                        i4 = ((m6981 ^ i3) * 24305) ^ (-732512628);
                        i5 = -1220606732;
                    }
                case -333032036:
                case 1030982338:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("֡ܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14435) ^ (-1836629356);
                        i5 = 1327588575;
                    } else {
                        m6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    }
                case -277587687:
                case 998367056:
                    if (C3683.m11222()) {
                        m6981 = (C0630.m2566("ᩳ᩹") + i2) * 47;
                        i4 = ((m6981 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        m6981 = C0630.m2566("۠ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1241)) ^ 2017663337;
                        i5 = -430299441;
                    }
                case -164609101:
                case 2059589523:
                    C3432.m10477();
                    if (C7106.f21815 == 0) {
                        m6981 = C0630.m2566("ܺ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    } else {
                        m6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    }
                case 179949148:
                case 1963722330:
                    if (C2958.m9034() <= 0) {
                        m6981 = (C0630.m2566("ᩳ᩹") + i2) * 47;
                        i4 = ((m6981 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        m6981 = C2105.m6981("۟᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21121)) ^ (-348659381);
                        i5 = -1755338923;
                    }
                case 327721212:
                case 822798919:
                    if (C1005.f3721) {
                        m6981 = (i2 - C0630.m2566("֫᩵")) * 97;
                        i4 = ((m6981 ^ i3) * (-32453)) ^ 688787858;
                        i5 = -254206890;
                    } else {
                        m6981 = C0630.m2566("ܺ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    }
                case 744102877:
                case 997215979:
                    if (this.f51310 == null) {
                        m6981 = (i2 - C2105.m6981("ۢۚ")) * (-93);
                        i4 = ((m6981 ^ i3) * (-3219)) ^ 1676135496;
                        i5 = 937047264;
                    } else {
                        m6981 = C0630.m2566("ۨۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29597)) ^ 452446496;
                        i5 = 1926495515;
                    }
                case 813657972:
                case 1527532289:
                    m39282((C18090) null);
                    m6981 = C0630.m2566("ۨۚ") ^ i3;
                    i4 = ((m6981 ^ i2) * (-29597)) ^ 452446496;
                    i5 = 1926495515;
                case 1142459252:
                case 1657215624:
                    C2126.m7040();
                    m6981 = C0630.m2566("ܺ᩸") ^ i3;
                    i4 = ((m6981 ^ i2) * (-25811)) ^ (-1155661671);
                    i5 = 1135152782;
                default:
                    if (C3663.f11553) {
                        m6981 = (C0630.m2566("֡ۤ") ^ i2) * (-119);
                        i4 = ((m6981 ^ i3) * 24305) ^ (-732512628);
                        i5 = -1220606732;
                    } else {
                        m6981 = (C2105.m6981("᩺᩵") ^ i3) * 87;
                        i4 = ((m6981 ^ i2) * (-27443)) ^ (-595599793);
                        i5 = -103788115;
                    }
            }
        }
    }

    static {
        ApplicationC12518.m30701(127);
        f51295 = new short[]{5876, 23874, 23896, 23857, 23900, 23879, 23891, 23863, 23830, 23857, 23897, 23902, 23863, 23857, 23898, 23879, 23891, 23863, 23875, 23874, 23898, 23857, 23899, 23879, 23891, 23863, 23830, 23899, 23857, 23898, 23879, 23896, 23863, 23875, 23874, 23898, 23857, 23899, 23879, 23891, 23863, 23830, 23857, 23899, 23896, 23863, 23857, 23898, 23879, 23891, 23863, 23830, 23897, 23857, 23898, 23879, 23899, 23863, 23875, 23874, 23857, 23898, 23879, 23891, 23863, 23857, 23898, 23879, 23891, 23863, 23875, 1399, -115, -97, -97, -119, -104, -97, -61, 7766, 22639, 22643, 22639, 22635, 22643, 22638, 22637, 22639, 22643, 22643, 7651, -25244, -25335, -25328, -25116, -25233, -25321, -25344, -25329, -25244, -25226, -25233, -25339, -25302, -25312, -25290, -25301, -25299, -25312, -25244, -25339, -25302, -25312, -25290, -25301, -25299, -25312, -25116, -25244, -25244, 698, 31309, 31306, 31312, 31297, 31318, 31298, 31301, 31303, 31297, 31319, 31297, 31306, 31301, 31302, 31304, 31297, 31305, 31296, 31249, 31309, 31306, 31319, 31312, 31301, 31304, 31304, 31330, 31318, 31307, 31305, 31335, 31297, 31306, 31312, 31297, 31318, 2345, -8235, -8238, -8248, -8231, -8242, -8230, -8227, -8225, -8231, -8241, 3144, 8981, 8986, 8991, 8982, 8960, 6763, -16586, -16580, -16592, -16591, -16527, -16600, -16582, -16579, -16593, -16586, -16580, -16592, -16591, -16527, -16593, -16591, -16584, -16586, -16580, -16592, -16591, -16527, -16587, -16593, -16584, 2323, 21897, 21909, 21900, 21918, 21904, 21911, 21930, 21917, 21906, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21897, 21909, 21900, 21918, 21904, 21911, 21930, 21917, 21906, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21956, 21977, 21961, 21897, 21909, 21900, 21918, 21904, 21911, 21936, 21949, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21946, 21910, 21917, 21916, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21946, 21910, 21917, 21916, 21977, 21957, 21956, 21977, 21961, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21943, 21912, 21908, 21916, 21911, 21912, 21908, 21916, 21917, 21916, 21898, 21914, 21899, 21904, 21897, 21901, 21904, 21910, 21911, 21908, 21912, 21904, 21911, 21929, 21899, 21916, 21919, 21916, 21899, 21916, 21911, 21914, 21916, 21908, 21904, 21911, 21937, 21910, 21898, 21901, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21908, 21904, 21911, 21944, 21911, 21917, 21899, 21910, 21904, 21917, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21917, 21916, 21889, 21940, 21910, 21917, 21916, 21908, 21904, 21911, 21937, 21910, 21898, 21901, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21977, 21961, 21901, 21916, 21898, 21901, 21942, 21911, 21909, 21888, 21908, 21904, 21911, 21944, 21911, 21917, 21899, 21910, 21904, 21917, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21977, 21961, 2288, 15564, 15568, 15561, 15579, 15573, 15570, 15506, 15569, 15560, 15564, 2643, 24034, 24038, 24033, 24014, 24033, 24043, 24061, 24032, 24038, 24043, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24034, 24038, 24033, 24007, 24032, 24060, 24059, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24063, 24035, 24058, 24040, 24038, 24033, 24028, 24043, 24036, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24063, 24035, 24058, 24040, 24038, 24033, 24006, 24011, 24057, 24042, 24061, 24060, 24038, 24032, 24033, 24012, 24032, 24043, 24042, 24057, 24042, 24061, 24060, 24038, 24032, 24033, 24001, 24046, 24034, 24042, 24033, 24046, 24034, 24042, 24043, 24042, 24060, 24044, 24061, 24038, 24063, 24059, 24038, 24032, 24033, 24038, 24033, 24059, 24042, 24061, 24041, 24046, 24044, 24042, 24060, 24034, 24046, 24038, 24033, 24031, 24061, 24042, 24041, 24042, 24061, 24042, 24033, 24044, 24042, 24042, 24033, 24046, 24045, 24035, 24042, 24034, 24043, 23994, 24043, 24042, 24055, 24002, 24032, 24043, 24042, 24059, 24042, 24060, 24059, 24000, 24033, 24035, 24054, 24038, 24033, 24060, 24059, 24046, 24035, 24035, 24009, 24061, 24032, 24034, 24012, 24042, 24033, 24059, 24042, 24061, 9786, -15789, -15836, -15839, -15839, -15809, -15780, -15753, -15750, -15748, -15756, -15780, -15757, -15746, -15764, -15764, -15783, -15746, -15754, -15757, -15835, -15809, 21792, 19395, -17288, 23945, -26174, -27179, -15839, -15839, -15809, -15797, -15763, -15746, -15759, -15764, -15757, -15746, -15765, -15754, -15760, -15759, -15782, -15759, -15752, -15754, -15759, -15750, -15835, -15809, -15839, -15839, -15809, -15796, -15753, -15760, -15766, -15757, -15749, -15779, -15750, -15793, -15757, -15766, -15752, -15754, -15759, -15793, -15763, -15750, -15751, -15750, -15763, -15750, -15759, -15748, -15750, -15835, -15809, -18540, 18744, -28206, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15783, -15766, -15759, -15748, -15765, -15754, -15760, -15759, -15835, -15809, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15783, -15757, -15760, -15746, -15765, -15754, -15759, -15752, -15790, -15750, -15759, -15766, -15835, -15809, -15839, -15839, -15809, -15798, -15759, -15756, -15759, -15760, -15768, -15759, -15786, -15759, -15765, -15750, -15763, -15751, -15746, -15748, -15750, -15835, -15809, -29403, -19713, -17244, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15797, -15760, -15760, -15757, -15790, -15750, -15759, -15766, -15835, -15809, 8343, -21756, -21752, -21757, -21758, -2979, 12609, -11844, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21756, -21752, -21757, -21758, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21756, -21752, -21757, -21758, -21737, -21749, -21742, -21760, -21746, -21751, -21687, -21750, -21741, -21737, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21737, -21749, -21742, -21760, -21746, -21751, -21687, -21750, -21741, -21737, 9037, -18774, -19304, 17150, 2977, -2990, -2994, -2985, -3003, -2997, -2996, -3060, -2993, -2986, -2990, 1892, -18517, -18516, -18518, -18511, -18506, -18497, -18517, -18503, -18517, -18517, -18499, -18516, -18517, -18441, -18517, -18516, -18518, -18511, -18506, -18497, -18517, -18442, -18507, -18516, -18508, -18503, -18517, -18517, -18499, -18516, -18517, -18441, -18549, -18516, -18518, -18511, -18506, -18497, -18442, -18507, -18516, -18508, -18549, -18516, -18518, -18511, -18506, -18497, 3746, -3185, -3171, -3171, -3189, -3174, -3171, -3135, -3130, -3133, -3147, -3185, -3133, -3180, -3149, -3179, -3108, -3134, -3107, -3181, -3130, -3133, -3147, -3153, -3133, -3148, -3149, -3179, -3108, -3134, -3107, -3181, -3129, -3119, -3129, -3119, -3150, -3136, -3197, -3174, -3198, 9686, 27075, 27103, 27078, 27092, 27098, 27101, 27037, 27102, 27079, 27075, 27088, 27090, 27088, 27099, 27094, 27088, 27103, 27090, 27072, 27072, 27094, 27072, 27037, 27095, 27094, 27083, 27100, 27075, 27079, 27010, 27100, 27075, 27079, 27009, 27100, 27075, 27079, 27009, 27135, 27100, 27090, 27095, 27027, 27093, 27090, 27098, 27103, 27094, 27095};
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
        int i6 = -1697052165;
        int i7 = C3746.f11829;
        int i8 = C1773.f6144;
        int m6981 = C2105.m6981("ۨۜ") ^ i8;
        int i9 = ((m6981 ^ i7) * 11593) ^ (-688170600);
        int i10 = -1127230125;
        while (true) {
            i6 = ((((i6 ^ i7) * 2465) >> 31) & i9) ^ (m6981 ^ i10);
            switch (i6) {
                case -1942330810:
                case -522081133:
                    f51294 = C11459.m28260(C3746.m11357(sArr2, i4, i5, i3));
                    return;
                case -1859306588:
                case 689598701:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("᩻ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    } else {
                        m6981 = (C2105.m6981("ۖ۬") ^ i7) * 19;
                        i9 = ((m6981 ^ i8) * (-22965)) ^ 596074455;
                        i10 = -1482480767;
                    }
                case -1837995951:
                case 545949718:
                    sArr = f51295;
                    c = 0;
                    if (C0964.f3626 != 0) {
                        m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                        i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        m6981 = C2105.m6981("ܳۢ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-3969)) ^ 1120904298;
                        i10 = -376663756;
                    }
                case -1707530687:
                case -1648973731:
                    C11340.m28031();
                    throw new RuntimeException();
                case -1620772297:
                case -1180081396:
                    i3 = 23914;
                    m6981 = (i7 - C2105.m6981("᩸ۖ")) * 77;
                    i9 = ((m6981 ^ i8) * (-6571)) ^ 826645197;
                    i10 = 1420269714;
                case -1161459447:
                case -750431755:
                    sArr2 = f51295;
                    i4 = 1;
                    if (C3663.m11168() >= 0) {
                        m6981 = C0630.m2566("ۨܳ") ^ i7;
                        i9 = ((m6981 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        m6981 = C0630.m2566("ܳ֫") ^ i8;
                        i9 = ((m6981 ^ i7) * 26653) ^ 202089932;
                        i10 = 2138120013;
                    }
                case -953084211:
                case 418270275:
                    if (C5695.f17556 >= 0) {
                        m6981 = C0630.m2566("ۗᩳ") ^ i8;
                        i9 = ((m6981 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    } else {
                        m6981 = C0630.m2566("ۨ᩹") ^ i7;
                        i9 = ((m6981 ^ i8) * (-29383)) ^ (-1815073201);
                        i10 = 16459477;
                    }
                case -751462712:
                case 1899447089:
                    if (C1504.m5179()) {
                        m6981 = (C0630.m2566("֫۬") + i7) * (-113);
                        i9 = ((m6981 ^ i8) * (-11727)) ^ (-899351515);
                        i10 = 1080396230;
                    } else {
                        m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                        i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    }
                case -643580900:
                case -423857067:
                    s = sArr[c];
                    if (C2126.m7040()) {
                        m6981 = C2105.m6981("᩻ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    } else {
                        m6981 = C0630.m2566("ۤۖ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-13447)) ^ 1979689802;
                        i10 = 951938781;
                    }
                case -475767107:
                case 629346632:
                    i3 = 29904;
                    m6981 = (i7 - C2105.m6981("᩸ۖ")) * 77;
                    i9 = ((m6981 ^ i8) * (-6571)) ^ 826645197;
                    i10 = 1420269714;
                case -442232724:
                case 624470620:
                    if (i2 - (s * s2) >= 0) {
                        m6981 = (C2105.m6981("ۧܿ") ^ i7) * 79;
                        i9 = ((m6981 ^ i8) * 32557) ^ (-1375602022);
                        i10 = 76307519;
                    } else {
                        m6981 = (i8 - C2105.m6981("۬᩺")) * (-93);
                        i9 = ((m6981 ^ i7) * 18461) ^ 214578812;
                        i10 = -433150715;
                    }
                case -369700143:
                case 318481551:
                    i2 = i * i;
                    s2 = 8196;
                    if (C3537.f11231 >= 0) {
                        m6981 = C0630.m2566("ۨܳ") ^ i7;
                        i9 = ((m6981 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        m6981 = C0630.m2566("ۙ᩵") ^ i7;
                        i9 = ((m6981 ^ i8) * 2227) ^ 69840237;
                        i10 = 1138822149;
                    }
                case -250487258:
                case 1491493829:
                    C1504.m5179();
                    if (C11340.f33930 < 0) {
                        m6981 = C0630.m2566("ۗᩳ") ^ i8;
                        i9 = ((m6981 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    } else {
                        m6981 = (C2105.m6981("ۖ۬") ^ i7) * 19;
                        i9 = ((m6981 ^ i8) * (-22965)) ^ 596074455;
                        i10 = -1482480767;
                    }
                case 87240597:
                case 1374080354:
                    C3663.m11168();
                    C7811.m20844();
                    m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                    i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                    i10 = -242031287;
                case 92731976:
                case 1509323242:
                    C0422.m1963();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                        i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        m6981 = C0630.m2566("ۗᩳ") ^ i8;
                        i9 = ((m6981 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    }
                case 369152857:
                case 857054666:
                    i = s + 2049;
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ۨܳ") ^ i7;
                        i9 = ((m6981 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        m6981 = C0630.m2566("ۜܶ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-6449)) ^ (-1275424551);
                        i10 = 1011228323;
                    }
                case 1164448991:
                case 1367755369:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("᩻ۙ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    } else {
                        m6981 = C2105.m6981("᩻ۡ") ^ i8;
                        i9 = ((m6981 ^ i7) * 5663) ^ 35340338;
                        i10 = 1602820353;
                    }
                case 1372363363:
                case 2059597904:
                    i5 = 70;
                    if (C3019.f9544 >= 0) {
                        m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                        i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        m6981 = C2105.m6981("ۙܶ") ^ i7;
                        i9 = ((m6981 ^ i8) * 1693) ^ (-1353936989);
                        i10 = -354160162;
                    }
                default:
                    if (C3432.f10845 >= 0) {
                        m6981 = (i8 - C2105.m6981("ܰ᩺")) * 79;
                        i9 = ((m6981 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        m6981 = C0630.m2566("۠ۡ") ^ i7;
                        i9 = ((m6981 ^ i8) * 20097) ^ 694461604;
                        i10 = 598835259;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0099, code lost:
    
        if (l.AbstractC2021.f6743 <= 0) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m39282(l.C18090 r27) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39282(l.ᩳܰۡ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m39274(C16709 c16709, String str) {
        int m6981;
        int i;
        int i2;
        InputStream inputStream;
        C3545 c3545;
        int m2566;
        int i3;
        int i4;
        int i5 = C11340.f33930;
        int i6 = C1420.f5096;
        int m25662 = (C0630.m2566("ۜۙ") ^ i5) * 67;
        int i7 = ((m25662 ^ i6) * 203) ^ (-524806451);
        short[] sArr = null;
        int i8 = m25662 ^ (-524479043);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -775608400;
        InputStream inputStream2 = null;
        C3545 c35452 = null;
        InputStream inputStream3 = null;
        C18090 c18090 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 17299) >> 31));
            switch (i14) {
                case -2144878920:
                case -453742899:
                    if (C1504.f5354) {
                        inputStream = inputStream3;
                        c3545 = c35452;
                        m2566 = C0630.m2566("᩺ۧ") ^ i6;
                        i3 = ((m2566 ^ i5) * (-7511)) ^ (-907868919);
                        i4 = -800115398;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    inputStream = inputStream3;
                    c3545 = c35452;
                    m2566 = C2105.m6981("ܰ᩷") ^ i6;
                    i3 = ((m2566 ^ i5) * 1999) ^ 380063960;
                    i4 = -1935300924;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -2000529223:
                case 1165980343:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    c = 'G';
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = (C2105.m6981("᩷ۙ") ^ i5) * (-47);
                        i3 = ((m2566 ^ i6) * (-25105)) ^ (-1556762868);
                        i4 = 731532167;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C0630.m2566("᩺ۧ") ^ i6;
                    i3 = ((m2566 ^ i5) * (-7511)) ^ (-907868919);
                    i4 = -800115398;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -1858400872:
                case -213847679:
                    return inputStream3;
                case -1819880189:
                case -831644601:
                    if (C0798.m2998() != 0) {
                        m6981 = (i5 - C2105.m6981("᩷ܺ")) * 53;
                        i = ((m6981 ^ i6) * (-26059)) ^ 10899605;
                        i2 = -1219462110;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    } else {
                        inputStream = inputStream3;
                        c3545 = c35452;
                        m2566 = C2105.m6981("ܰ᩷") ^ i6;
                        i3 = ((m2566 ^ i5) * 1999) ^ 380063960;
                        i4 = -1935300924;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                case -1163591500:
                case 501232683:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    i9 = s + s2;
                    if (C22628.m50615() == 0) {
                        m2566 = C2105.m6981("᩹ۗ") ^ i6;
                        i3 = ((m2566 ^ i5) * (-31367)) ^ 597690619;
                        i4 = 483556155;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C0630.m2566("᩹ۜ") ^ i5;
                    i3 = ((m2566 ^ i6) * 17657) ^ 1504179366;
                    i4 = 1410245127;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -1134301968:
                case -233707737:
                    short[] sArr2 = f51295;
                    if (C7811.f24123 >= 0) {
                        inputStream = inputStream3;
                        c3545 = c35452;
                    } else {
                        inputStream = inputStream3;
                        if (AbstractC2021.f6743 <= 0) {
                            c3545 = c35452;
                            m2566 = C0630.m2566("᩺ۧ") ^ i6;
                            i3 = ((m2566 ^ i5) * (-7511)) ^ (-907868919);
                            i4 = -800115398;
                            inputStream3 = inputStream;
                            i8 = m2566 ^ i4;
                            i7 = i3;
                            c35452 = c3545;
                        } else {
                            c3545 = c35452;
                            String m2436 = RunnableC0588.m2436(sArr2, 72, 7, i13);
                            if (C3537.f11231 < 0) {
                                StringBuilder sb = new StringBuilder(m2436);
                                C1420.m4905(sb, str);
                                c35452 = C2167.m7156(c18090, C0422.m1959(sb));
                                if (c35452 == null) {
                                    int m69812 = (i6 - C2105.m6981("ۡۧ")) * (-75);
                                    i7 = ((m69812 ^ i5) * (-13661)) ^ (-489020768);
                                    inputStream3 = inputStream;
                                    i8 = m69812 ^ 1395511395;
                                } else {
                                    int m69813 = (C2105.m6981("ۡ۫") + i6) * (-17);
                                    i = ((m69813 ^ i5) * (-22217)) ^ (-1826950083);
                                    inputStream3 = inputStream;
                                    i8 = m69813 ^ 683353158;
                                    i7 = i;
                                }
                            }
                        }
                    }
                    m2566 = C0630.m2566("᩹ۜ") ^ i5;
                    i3 = ((m2566 ^ i6) * 17657) ^ 1504179366;
                    i4 = 1410245127;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -814775273:
                case 931561870:
                    C11340.m28031();
                    if (C3432.f10845 < 0) {
                        inputStream = inputStream3;
                        c3545 = c35452;
                        m2566 = (i5 - C2105.m6981("ۜ᩹")) * 67;
                        i3 = ((m2566 ^ i6) * (-12167)) ^ 2060249305;
                        i4 = -1559397927;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    } else {
                        m6981 = (i5 - C2105.m6981("᩷ܺ")) * 53;
                        i = ((m6981 ^ i6) * (-26059)) ^ 10899605;
                        i2 = -1219462110;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -798031314:
                case 1318445843:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    i13 = 65516;
                    m2566 = C0630.m2566("ᩴܽ") ^ i6;
                    i3 = ((m2566 ^ i5) * 29367) ^ (-1037935050);
                    i4 = 1843258362;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -560593656:
                case -542900804:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    int i15 = i11 + i12;
                    if ((i15 + i15) - i10 >= 0) {
                        m2566 = C2105.m6981("ܽܺ") ^ i6;
                        i3 = ((m2566 ^ i5) * (-4153)) ^ (-1281605618);
                        i4 = 224386842;
                    } else {
                        m2566 = (i5 - C2105.m6981("ۗ᩵")) * (-31);
                        i3 = ((m2566 ^ i6) * (-27329)) ^ 1580198859;
                        i4 = 823183604;
                    }
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -483998168:
                case 716258166:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    i12 = 266113969;
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = C0630.m2566("ۚܿ") ^ i5;
                        i3 = ((m2566 ^ i6) * 15163) ^ (-1466104245);
                        i4 = 180156817;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C0630.m2566("᩺ۧ") ^ i6;
                    i3 = ((m2566 ^ i5) * (-7511)) ^ (-907868919);
                    i4 = -800115398;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case -287289658:
                case 773063463:
                    c3545 = c35452;
                    c18090 = c16709.f51301;
                    if (c18090 == null) {
                        inputStream = null;
                        c35452 = c3545;
                        int m698122 = (i6 - C2105.m6981("ۡۧ")) * (-75);
                        i7 = ((m698122 ^ i5) * (-13661)) ^ (-489020768);
                        inputStream3 = inputStream;
                        i8 = m698122 ^ 1395511395;
                    } else {
                        int m69814 = C2105.m6981("ۢ۠") ^ i5;
                        i8 = m69814 ^ 641408037;
                        inputStream3 = null;
                        i7 = ((m69814 ^ i6) * (-16979)) ^ (-1214461815);
                        c35452 = c3545;
                    }
                case 73241303:
                case 2115168266:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    i13 = 42057;
                    m2566 = C0630.m2566("ᩴܽ") ^ i6;
                    i3 = ((m2566 ^ i5) * 29367) ^ (-1037935050);
                    i4 = 1843258362;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case 500953643:
                case 1895824037:
                    return inputStream3;
                case 622735628:
                case 1595644881:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C3911.f12484 < 0) {
                        m2566 = (C2105.m6981("᩻᩺") ^ i5) * 87;
                        i3 = ((m2566 ^ i6) * 7881) ^ 663677735;
                        i4 = -113983603;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C2105.m6981("ܰ᩷") ^ i6;
                    i3 = ((m2566 ^ i5) * 1999) ^ 380063960;
                    i4 = -1935300924;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case 628884188:
                case 633653700:
                    C3683.m11222();
                    return null;
                case 669618009:
                case 1382463555:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    s = sArr[c];
                    s2 = 16313;
                    if (C3746.f11829 > 0) {
                        m2566 = C0630.m2566("ۛ֡") ^ i6;
                        i3 = ((m2566 ^ i5) * 1875) ^ (-100706667);
                        i4 = 1579824537;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = (i5 - C2105.m6981("ۜ᩹")) * 67;
                    i3 = ((m2566 ^ i6) * (-12167)) ^ 2060249305;
                    i4 = -1559397927;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case 849222662:
                case 1962346621:
                    return inputStream2;
                case 1122408363:
                case 1595175133:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    sArr = f51295;
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("۟ۛ") ^ i5;
                        i3 = ((m2566 ^ i6) * (-31737)) ^ 1505349154;
                        i4 = -1856663977;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C2105.m6981("ܰ᩷") ^ i6;
                    i3 = ((m2566 ^ i5) * 1999) ^ 380063960;
                    i4 = -1935300924;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                case 1472456740:
                case 1678410539:
                    try {
                        inputStream2 = C3663.m11163(c18090, c35452);
                        m6981 = (i5 - C0630.m2566("ۨᩳ")) * (-67);
                        i = ((m6981 ^ i6) * 23625) ^ (-844581830);
                        i2 = 1269347243;
                    } catch (IOException unused) {
                        m6981 = (C0630.m2566("۟۫") + i6) * 51;
                        i = ((m6981 ^ i5) * (-22807)) ^ (-876701691);
                        i2 = 279872280;
                    }
                    i8 = m6981 ^ i2;
                    i7 = i;
                case 1566279630:
                case 1744638142:
                    inputStream = inputStream3;
                    c3545 = c35452;
                    if (C1128.m3851() > 0) {
                        m2566 = C0630.m2566("ۘۤ") ^ i6;
                        i3 = ((m2566 ^ i5) * (-31053)) ^ 1126525146;
                        i4 = 19699507;
                        inputStream3 = inputStream;
                        i8 = m2566 ^ i4;
                        i7 = i3;
                        c35452 = c3545;
                    }
                    m2566 = C2105.m6981("ܰ᩷") ^ i6;
                    i3 = ((m2566 ^ i5) * 1999) ^ 380063960;
                    i4 = -1935300924;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
                default:
                    C1916.m6308();
                    inputStream = inputStream3;
                    c3545 = c35452;
                    m2566 = (i5 - C2105.m6981("ۜ᩹")) * 67;
                    i3 = ((m2566 ^ i6) * (-12167)) ^ 2060249305;
                    i4 = -1559397927;
                    inputStream3 = inputStream;
                    i8 = m2566 ^ i4;
                    i7 = i3;
                    c35452 = c3545;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۟ܿ᩷] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C7621 m39278(final C16709 c16709) {
        c16709.m39285();
        return new InterfaceC12748() { // from class: l.۟ܿ᩷
            @Override // l.InterfaceC12748
            public final InputStream getAssetsAsStream(String str) {
                return C16709.m39274(C16709.this, str);
            }
        };
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m39302() {
        PluginContext pluginContext = null;
        String str = null;
        String str2 = null;
        int i = -358359574;
        int i2 = C4616.f14690;
        int i3 = RunnableC1937.f6483;
        int m2566 = (C0630.m2566("ᩴᩳ") + i3) * 119;
        int i4 = ((m2566 ^ i2) * (-8679)) ^ 1438627711;
        int i5 = 1381762769;
        while (true) {
            i = ((((i ^ i2) * 31285) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2144714914:
                case 1526108310:
                    pluginContext = m39304();
                    if (C3746.m11369() >= 0) {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        m2566 = C0630.m2566("ۤܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * 20315) ^ 1984379550;
                        i5 = 150080321;
                    }
                case -2121354617:
                case -1620430640:
                    if (C11340.m28021(1, str) == '}') {
                        m2566 = (C2105.m6981("ܶۡ") ^ i3) * (-125);
                        i4 = ((m2566 ^ i2) * (-29817)) ^ (-1386379369);
                        i5 = -1589446884;
                    } else {
                        m2566 = C0630.m2566("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                case -1985820827:
                case 1634071449:
                    if (C1711.f5919) {
                        m2566 = (C0630.m2566("ۘ֡") ^ i2) * (-79);
                        i4 = ((m2566 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    } else {
                        m2566 = C0630.m2566("ۛ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 26713) ^ 99595542;
                        i5 = -848544640;
                    }
                case -1796374779:
                case -232722745:
                    if (C0237.f1507 != 0) {
                        m2566 = C2105.m6981("᩺۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    } else {
                        m2566 = C2105.m6981("۠ۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * 4363) ^ (-54053607);
                        i5 = -554945785;
                    }
                case -1709872333:
                case 1650092186:
                    C2958.m9034();
                    if (C3683.f11629 < 0) {
                        m2566 = C0630.m2566("۫ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-32427)) ^ 1982667500;
                        i5 = 1221830048;
                    } else {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    }
                case -1676937710:
                case 1518926482:
                    if (C2520.f8000 >= 0) {
                        m2566 = C2105.m6981("᩺۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۖܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((m2566 ^ i2) * (-1027)) ^ (-1640410037);
                        i5 = -237390152;
                    }
                case -1483926959:
                case -712932862:
                    if (C1711.m5741(str) >= 3) {
                        m2566 = C0630.m2566("ۧ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * 2295) ^ (-983734194);
                        i5 = -1457238623;
                    } else {
                        m2566 = C0630.m2566("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                case -1168637710:
                case -933715160:
                    if (C1504.f5354) {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        m2566 = C2105.m6981("᩸֡") ^ i2;
                        i4 = ((m2566 ^ i3) * (-32667)) ^ 2141069167;
                        i5 = 2083528315;
                    }
                case -1059972195:
                case 776538455:
                    if (C3432.m10477() <= 0) {
                        m2566 = (C0630.m2566("ۘ֡") ^ i2) * (-79);
                        i4 = ((m2566 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    } else {
                        m2566 = (C2105.m6981("ۧܺ") ^ i3) * (-71);
                        i4 = ((m2566 ^ i2) * 27061) ^ (-1892096481);
                        i5 = 810707939;
                    }
                case -1008912356:
                case -128502223:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("۫ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-32427)) ^ 1982667500;
                        i5 = 1221830048;
                    } else {
                        m2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 13661) ^ (-399367105);
                        i5 = 406963514;
                    }
                case -946102367:
                case 265269116:
                    return str2;
                case -747948786:
                case 1852352212:
                    C0798.m2998();
                    return null;
                case -650046025:
                case 1531852707:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        m2566 = C2105.m6981("᩺۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    }
                case -631501559:
                case 392968303:
                    str = this.f51296;
                    if (C22628.f73083 <= 0) {
                        m2566 = (C2105.m6981("ۨ֡") + i2) * (-29);
                        i4 = ((m2566 ^ i3) * (-24167)) ^ 391824365;
                        i5 = -942614552;
                    } else {
                        m2566 = C0630.m2566("۟ۘ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14141)) ^ 1258265738;
                        i5 = 913184418;
                    }
                case -338216667:
                case 949395332:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        m2566 = C0630.m2566("ۙۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 8377) ^ (-1110027724);
                        i5 = -537638257;
                    }
                case -250189365:
                case 1738344448:
                    C1420.m4913();
                    m2566 = C0630.m2566("۫ܿ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-32427)) ^ 1982667500;
                    i5 = 1221830048;
                case 751613090:
                case 1280149744:
                    if (C0483.m2121()) {
                        m2566 = (C0630.m2566("ۘ֡") ^ i2) * (-79);
                        i4 = ((m2566 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    } else {
                        m2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    }
                case 919061213:
                case 1699740767:
                    str2 = C1711.m5739((C10632) pluginContext, str);
                    if (str2 != null) {
                        m2566 = (i3 - C0630.m2566("ᩴ᩶")) * (-71);
                        i4 = ((m2566 ^ i2) * (-27965)) ^ 28212261;
                        i5 = -2055713260;
                    } else {
                        m2566 = C0630.m2566("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                case 1310150282:
                case 1766827235:
                    if (C3683.f11629 >= 0) {
                        m2566 = (C2105.m6981("ۨ֡") + i2) * (-29);
                        i4 = ((m2566 ^ i3) * (-24167)) ^ 391824365;
                        i5 = -942614552;
                    } else {
                        m2566 = (C0630.m2566("۠۫") ^ i2) * 53;
                        i4 = ((m2566 ^ i3) * 7907) ^ (-2017600639);
                        i5 = -554985202;
                    }
                case 1724617328:
                case 2018762631:
                    return str;
                default:
                    if (C1711.m5733(str, 0) == '{') {
                        m2566 = (C0630.m2566("ܿۖ") + i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-1371)) ^ (-53860814);
                        i5 = -1636566164;
                    } else {
                        m2566 = C0630.m2566("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39281(ArrayList arrayList, int i) {
        int i2;
        String str;
        Iterator it = null;
        C11066 c11066 = null;
        Exception e = null;
        int i3 = 1066564604;
        int i4 = C1773.f6144;
        int i5 = RunnableC1937.f6483;
        int m2566 = (i5 - C0630.m2566("᩷ۚ")) * 23;
        int i6 = ((m2566 ^ i4) * (-2679)) ^ 1755810871;
        int i7 = 1225551430;
        while (true) {
            i3 = ((((i3 ^ i4) * (-2159)) >> 31) & i6) ^ (m2566 ^ i7);
            switch (i3) {
                case -2069673676:
                case 1435035116:
                    if (m39321()) {
                        m2566 = (i5 - C2105.m6981("ۚ᩷")) * (-49);
                        i6 = ((m2566 ^ i4) * 20201) ^ 1055694653;
                        i7 = -970855158;
                    } else {
                        m2566 = (C2105.m6981("ۗ۫") ^ i4) * 15;
                        i6 = ((m2566 ^ i5) * 18573) ^ (-509901540);
                        i7 = 1201588635;
                    }
                case -1928133143:
                case -1673899178:
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("ۖ֨") ^ i5) * 55;
                        i6 = ((m2566 ^ i4) * 10949) ^ 151241456;
                        i7 = -1646641489;
                    } else {
                        m2566 = (C2105.m6981("ۗ֡") ^ i4) * 101;
                        i6 = ((m2566 ^ i5) * (-8181)) ^ 1820118749;
                        i7 = 1333586740;
                    }
                case -1836003277:
                case 667553336:
                    C0630.m2564();
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ۡۡ") ^ i4;
                        i6 = ((m2566 ^ i5) * 7681) ^ (-1431219026);
                        i7 = 1972386695;
                    } else {
                        m2566 = (C0630.m2566("ۖ֨") ^ i5) * 55;
                        i6 = ((m2566 ^ i4) * 10949) ^ 151241456;
                        i7 = -1646641489;
                    }
                case -1656068481:
                case -332864282:
                    if (RunnableC1108.m3790()) {
                        m2566 = (i5 - C2105.m6981("ܰ᩶")) * (-7);
                        i6 = ((m2566 ^ i4) * 16721) ^ 14691843;
                        i7 = 1919941326;
                    } else {
                        m2566 = (i5 - C2105.m6981("ܽ᩶")) * (-83);
                        i6 = ((m2566 ^ i4) * (-12717)) ^ 429086822;
                        i7 = 1244146429;
                    }
                case -1360711963:
                case 1915525029:
                    if (RunnableC3474.m10630()) {
                        m2566 = (C2105.m6981("ܰۖ") + i5) * (-15);
                        i6 = ((m2566 ^ i4) * 14689) ^ (-1647145767);
                        i7 = -274586490;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܶۚ")) * 79;
                        i6 = ((m2566 ^ i5) * (-23071)) ^ (-187601233);
                        i7 = -21302723;
                    }
                case -917930820:
                case -778703591:
                    if (C2167.f7158 >= 0) {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܿܽ")) * (-63);
                        i6 = ((m2566 ^ i5) * (-1637)) ^ (-2108208161);
                        i7 = -489188761;
                    }
                case -904114393:
                case 1870123297:
                    C0382.m1848();
                    m2566 = C0630.m2566("ۡۡ") ^ i4;
                    i6 = ((m2566 ^ i5) * 7681) ^ (-1431219026);
                    i7 = 1972386695;
                case -709759927:
                case 1788434889:
                    try {
                        Object obj = this.f51298;
                        str = c11066.f33239;
                        C7106.m19117(arrayList, C5984.m16803(obj, str));
                        m2566 = (C2105.m6981("ۗ۫") ^ i4) * 15;
                        i6 = ((m2566 ^ i5) * 18573) ^ (-509901540);
                        i7 = 1201588635;
                    } catch (Exception e2) {
                        e = e2;
                        m2566 = (C0630.m2566("۫ᩳ") ^ i4) * (-9);
                        i6 = ((m2566 ^ i5) * (-26197)) ^ 1841621370;
                        i7 = 891864181;
                    }
                case -645339632:
                case 553215232:
                    if (C11340.m28031()) {
                        m2566 = (i4 - C2105.m6981("᩹᩻")) * 89;
                        i6 = ((m2566 ^ i5) * 5927) ^ 1050543980;
                        i7 = -1133894686;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܶۚ")) * 79;
                        i6 = ((m2566 ^ i5) * (-23071)) ^ (-187601233);
                        i7 = -21302723;
                    }
                case -590057799:
                case 162222787:
                    C0483.m2121();
                    if (C3663.m11168() >= 0) {
                        m2566 = C0630.m2566("ۡۡ") ^ i4;
                        i6 = ((m2566 ^ i5) * 7681) ^ (-1431219026);
                        i7 = 1972386695;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܶۚ")) * 79;
                        i6 = ((m2566 ^ i5) * (-23071)) ^ (-187601233);
                        i7 = -21302723;
                    }
                case -379833993:
                case -112733376:
                    it = C2958.m9029(this.f51304);
                    m2566 = (C2105.m6981("ۗ۫") ^ i4) * 15;
                    i6 = ((m2566 ^ i5) * 18573) ^ (-509901540);
                    i7 = 1201588635;
                case -160894139:
                case 2112083697:
                    c11066 = (C11066) RunnableC1108.m3791(it);
                    i2 = c11066.f33240;
                    if (i2 == i) {
                        m2566 = C2105.m6981("۫۫") ^ i5;
                        i6 = ((m2566 ^ i4) * 28285) ^ 786093588;
                        i7 = -999561306;
                    } else {
                        m2566 = (C2105.m6981("ۗ۫") ^ i4) * 15;
                        i6 = ((m2566 ^ i5) * 18573) ^ (-509901540);
                        i7 = 1201588635;
                    }
                case -92062587:
                case 1489200957:
                    if (C1773.m5910(it)) {
                        m2566 = (C2105.m6981("᩹ܺ") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-23173)) ^ 1063027311;
                        i7 = 1251344634;
                    } else {
                        m2566 = C0630.m2566("ۘ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-9117)) ^ (-434009308);
                        i7 = -615139058;
                    }
                case 313551640:
                case 1253476486:
                    break;
                case 364228277:
                case 1853694343:
                    m39290(e);
                    m2566 = (C2105.m6981("ۗ۫") ^ i4) * 15;
                    i6 = ((m2566 ^ i5) * 18573) ^ (-509901540);
                    i7 = 1201588635;
                case 748495466:
                case 1489076368:
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    } else {
                        m2566 = (C2105.m6981("᩷᩷") + i5) * (-119);
                        i6 = ((m2566 ^ i4) * 29483) ^ (-1991069276);
                        i7 = -2090027073;
                    }
                case 839619407:
                case 1493888339:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    } else {
                        m2566 = C0630.m2566("ۤܳ") ^ i4;
                        i6 = ((m2566 ^ i5) * 30251) ^ 1602140193;
                        i7 = -147498199;
                    }
                case 852237511:
                case 1067800440:
                    if (C1504.m5179()) {
                        m2566 = C0630.m2566("ۜ֡") ^ i5;
                        i6 = ((m2566 ^ i4) * 26731) ^ 1045646831;
                        i7 = -924194756;
                    } else {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    }
                case 1063991299:
                case 1529710161:
                    C0964.m3413();
                    C5695.m16023();
                    break;
                case 1316596443:
                case 1889815562:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    } else {
                        m2566 = (C0630.m2566("ۖ֨") ^ i5) * 55;
                        i6 = ((m2566 ^ i4) * 10949) ^ 151241456;
                        i7 = -1646641489;
                    }
                case 1378015111:
                case 1800471519:
                    if (C3911.f12484 >= 0) {
                        m2566 = (i5 - C2105.m6981("ܰ᩶")) * (-7);
                        i6 = ((m2566 ^ i4) * 16721) ^ 14691843;
                        i7 = 1919941326;
                    } else {
                        m2566 = (C2105.m6981("ᩳۘ") ^ i4) * 97;
                        i6 = ((m2566 ^ i5) * (-17701)) ^ (-275562887);
                        i7 = -287240509;
                    }
                default:
                    if (C7106.f21815 != 0) {
                        m2566 = C0630.m2566("ۢ᩺") ^ i5;
                        i6 = ((m2566 ^ i4) * (-30141)) ^ 1227382902;
                        i7 = 1295474251;
                    } else {
                        m2566 = C2105.m6981("֫ۨ") ^ i5;
                        i6 = ((m2566 ^ i4) * 16669) ^ (-1788616200);
                        i7 = 1081509038;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x003e, code lost:
    
        if (l.C3746.f11829 > 0) goto L14;
     */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String, l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C18090 m39285() {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39285():l.ᩳܰۡ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x008a, code lost:
    
        if (l.C0483.f2088 >= 0) goto L8;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m39277(int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39277(int, int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (l.C0483.m2121() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (l.C1047.f3863 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (l.C21923.f70183 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r3.isNull(r5) != false) goto L42;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16709 m39280(org.json.JSONObject r23, l.C18090 r24) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39280(org.json.JSONObject, l.ᩳܰۡ):l.ܽܳ᩷");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final PluginPreference m39316(String str) {
        String str2 = null;
        Class cls = null;
        int i = -2874343;
        int i2 = RunnableC3474.f10992;
        int i3 = RunnableC1937.f6483;
        int m6981 = (i3 - C2105.m6981("ܶ᩸")) * 49;
        int i4 = ((m6981 ^ i2) * (-32593)) ^ 1180027598;
        int i5 = -600571710;
        while (true) {
            i = ((((i ^ i2) * (-2905)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2114455454:
                case -173849033:
                    if (C3432.f10845 >= 0) {
                        m6981 = C2105.m6981("ܰۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 30439) ^ 881433029;
                        i5 = -1434008103;
                    } else {
                        m6981 = (C0630.m2566("᩻ۛ") + i3) * (-113);
                        i4 = ((m6981 ^ i2) * 30377) ^ (-42451978);
                        i5 = 2100446516;
                    }
                case -2092644182:
                case 675063599:
                    if (C3746.m11369() >= 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        m6981 = (C2105.m6981("ۡۨ") ^ i3) * (-99);
                        i4 = ((m6981 ^ i2) * 5609) ^ (-250840575);
                        i5 = -899201219;
                    }
                case -2084035486:
                case -1493509925:
                    cls = C5984.m16803(this.f51298, str2);
                    if (C3432.f10845 >= 0) {
                        m6981 = (C2105.m6981("ܳ᩹") + i2) * 99;
                        i4 = ((m6981 ^ i3) * 5397) ^ 373404407;
                        i5 = 1759740332;
                    } else {
                        m6981 = (i2 - C0630.m2566("۫᩸")) * (-113);
                        i4 = ((m6981 ^ i3) * 5309) ^ (-646953812);
                        i5 = -1910736626;
                    }
                case -1949527194:
                case -1521703512:
                    if (m39321()) {
                        m6981 = (C2105.m6981("ۘۜ") ^ i3) * (-75);
                        i4 = ((m6981 ^ i2) * 32479) ^ 2099452108;
                        i5 = -1045044508;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩵ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i3) * (-5103)) ^ (-511161075);
                        i5 = -1717154274;
                    }
                case -1841203342:
                case 269342199:
                    RunnableC1937.m6387();
                    return null;
                case -1466735398:
                case 97879807:
                    if (str2 != null) {
                        m6981 = C2105.m6981("᩹ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 27761) ^ 323739191;
                        i5 = 439121858;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩵ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i3) * (-5103)) ^ (-511161075);
                        i5 = -1717154274;
                    }
                case -1228041035:
                case -839130259:
                    C11340.m28031();
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        m6981 = C0630.m2566("ۤ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 24725) ^ (-1106581941);
                        i5 = 772795574;
                    }
                case -1075002486:
                case 1800477604:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    }
                case -808989178:
                case 847055611:
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("ۧᩴ") ^ i2) * 85;
                        i4 = ((m6981 ^ i3) * 7261) ^ (-1603723385);
                        i5 = 25315434;
                    } else {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    }
                case -788035899:
                case 171269103:
                    str2 = this.f51299;
                    m6981 = (i3 - C0630.m2566("ᩳ᩻")) * (-101);
                    i4 = ((m6981 ^ i2) * 16647) ^ (-1912864552);
                    i5 = -621443156;
                case -762757340:
                case 479500963:
                    if (C7811.m20844() != 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        m6981 = (C0630.m2566("ۨ֡") + i2) * 89;
                        i4 = ((m6981 ^ i3) * 7643) ^ (-1134758071);
                        i5 = -987092368;
                    }
                case -539884195:
                case 1193471657:
                    return null;
                case -440375201:
                case 1593054682:
                    if (C22628.m50615() != 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        m6981 = (C0630.m2566("᩷ۛ") ^ i3) * (-109);
                        i4 = ((m6981 ^ i2) * 29835) ^ 939719448;
                        i5 = 1657357640;
                    }
                case -439395454:
                case 1958719143:
                    return (PluginPreference) cls.newInstance();
                case -179039654:
                case -43895621:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        m6981 = C2105.m6981("֨֨") ^ i3;
                        i4 = ((m6981 ^ i2) * 13469) ^ (-437351348);
                        i5 = 1131042062;
                    }
                case -138378928:
                case 647864675:
                    if (C2105.f7037 != 0) {
                        m6981 = C2105.m6981("ܰۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 30439) ^ 881433029;
                        i5 = -1434008103;
                    } else {
                        m6981 = (C2105.m6981("᩸ܺ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i2) * (-17991)) ^ (-1170020980);
                        i5 = 94214211;
                    }
                case -37897299:
                case 712209905:
                    C4616.m13552();
                    C1294.m4372();
                    m6981 = C2105.m6981("᩺᩶") ^ i2;
                    i4 = ((m6981 ^ i3) * 17011) ^ 43971460;
                    i5 = 1910789990;
                case 137893024:
                case 1239021134:
                    if (AbstractC2021.m6574()) {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27027)) ^ 956037610;
                        i5 = 1198793684;
                    }
                case 811195498:
                case 1088304335:
                    if (str == null) {
                        m6981 = (i2 - C0630.m2566("֫ۛ")) * 53;
                        i4 = ((m6981 ^ i3) * (-951)) ^ (-1860666519);
                        i5 = 1329828590;
                    } else {
                        str2 = str;
                        m6981 = (i3 - C0630.m2566("ᩳ᩻")) * (-101);
                        i4 = ((m6981 ^ i2) * 16647) ^ (-1912864552);
                        i5 = -621443156;
                    }
                case 996540255:
                case 1057472343:
                    C0050.m940();
                    if (C0798.f2919) {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        m6981 = (C2105.m6981("ܳ᩹") + i2) * 99;
                        i4 = ((m6981 ^ i3) * 5397) ^ 373404407;
                        i5 = 1759740332;
                    }
                default:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C0630.m2566("ܰۛ") + i2) * 49;
                        i4 = ((m6981 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        m6981 = C0630.m2566("ᩳܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 19329) ^ 1415631528;
                        i5 = 1058923357;
                    }
            }
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39322() {
        return C0237.m1484(21, this.f51313);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m39303() {
        return this.f51314;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m39319() {
        return this.f51308;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m39295() {
        return this.f51297;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m39320() {
        return this.f51318;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m39286() {
        return this.f51315;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x016a, code lost:
    
        if (l.C2105.f7037 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0172, code lost:
    
        if (l.C2272.f7362 == false) goto L14;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m39314() {
        /*
            Method dump skipped, instructions count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39314():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x015e, code lost:
    
        r7 = (r6 - l.C0630.m2566("ۨ᩵")) * (-91);
        r8 = ((r7 ^ r5) * (-17267)) ^ (-853035004);
        r9 = -1233852014;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01d5, code lost:
    
        r7 = l.C2105.m6981("ܽ۠") ^ r6;
        r8 = ((r7 ^ r5) * 12651) ^ 1885270519;
        r9 = -987923497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0190, code lost:
    
        r7 = l.C0630.m2566("᩻᩶") ^ r5;
        r8 = ((r7 ^ r6) * (-20085)) ^ (-1120429529);
        r9 = -1191262720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012e, code lost:
    
        r7 = (l.C0630.m2566("ܳ᩶") ^ r5) * (-75);
        r8 = ((r7 ^ r6) * (-30253)) ^ 454895170;
        r9 = 670646527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0206, code lost:
    
        r7 = l.C0630.m2566("۠ܽ") ^ r5;
        r8 = ((r7 ^ r6) * 20431) ^ 751122986;
        r9 = -350494756;
     */
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m39299() {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39299():boolean");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m39325() {
        return this.f51299;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m39287() {
        return this.f51307;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m39324() {
        return this.f51317;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m39323() {
        int i = 599934842;
        int i2 = C1128.f4106;
        int i3 = C0630.f2410;
        int m6981 = (C2105.m6981("ۨ۬") ^ i3) * (-113);
        int i4 = ((m6981 ^ i2) * 31735) ^ (-1132261254);
        int i5 = -1698178233;
        while (true) {
            i = ((((i ^ i2) * (-101)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1939024219:
                case 1377910084:
                    ServiceConnectionC3453.m10564();
                    m6981 = C2105.m6981("۟۫") ^ i3;
                    i4 = ((m6981 ^ i2) * (-29451)) ^ (-957997755);
                    i5 = -961833576;
                case -1740717757:
                case 1011938347:
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("᩸᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    } else {
                        m6981 = (C2105.m6981("᩸ۘ") ^ i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    }
                case -1709172247:
                case 1144537834:
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = C2105.m6981("۟۫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    } else {
                        m6981 = C2105.m6981("᩸᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    }
                case -1675910862:
                case 1582397629:
                    C3019.m9255();
                    break;
                case -1621724046:
                case 1557735319:
                    if (C4117.f13076 > 0) {
                        m6981 = C2105.m6981("᩸᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    } else {
                        m6981 = (C0630.m2566("᩶᩸") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    }
                case -1545195114:
                case -770817865:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C2105.m6981("۟۫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    } else {
                        m6981 = C2105.m6981("ۡۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17673)) ^ (-44254742);
                        i5 = 2129343061;
                    }
                case -1545107858:
                case -105948223:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C2105.m6981("᩸ۘ") ^ i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    } else {
                        m6981 = (C0630.m2566("ܰ֨") ^ i3) * 17;
                        i4 = ((m6981 ^ i2) * (-10075)) ^ (-1558117912);
                        i5 = -648617510;
                    }
                case -1543568423:
                case 1660816281:
                    if (C3746.f11829 <= 0) {
                        m6981 = C2105.m6981("᩸᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    } else {
                        m6981 = C0630.m2566("ܿۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13835)) ^ 640528833;
                        i5 = -1419548962;
                    }
                case -1417744257:
                case 1091714106:
                    if (C0483.m2121()) {
                        m6981 = (C2105.m6981("᩵᩵") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i2) * (-13139)) ^ (-378765077);
                        i5 = -1360434742;
                    } else {
                        m6981 = (C0630.m2566("ۖ۬") + i2) * 39;
                        i4 = ((m6981 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    }
                case -1415386306:
                case -1302120989:
                    if (this.f51298 != null) {
                        m6981 = C0630.m2566("۟ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29179)) ^ (-1498118688);
                        i5 = 297602789;
                    } else {
                        m6981 = C0630.m2566("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-17573)) ^ 2044869503;
                        i5 = -886413392;
                    }
                case -1384937292:
                case 552655765:
                    if (C1420.m4913()) {
                        m6981 = (C0630.m2566("᩶᩸") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    } else {
                        m6981 = C0630.m2566("ۛۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14983) ^ (-953668613);
                        i5 = -1543885589;
                    }
                case -871378465:
                case 1745624912:
                    if (C4117.f13076 <= 0) {
                        m6981 = C2105.m6981("۟۫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۛۤ")) * (-53);
                        i4 = ((m6981 ^ i3) * 23661) ^ (-985080266);
                        i5 = -287731486;
                    }
                case -789543109:
                case 609943859:
                    if (C0050.m940() <= 0) {
                        m6981 = (C0630.m2566("ۖ۬") + i2) * 39;
                        i4 = ((m6981 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    } else {
                        m6981 = (C2105.m6981("ۙۜ") + i2) * 45;
                        i4 = ((m6981 ^ i3) * (-9003)) ^ 359873486;
                        i5 = 14541515;
                    }
                case -588882236:
                case 970911426:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("᩸ۘ") ^ i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    } else {
                        m6981 = (C0630.m2566("ۢۡ") ^ i3) * 89;
                        i4 = ((m6981 ^ i2) * 473) ^ 10742910;
                        i5 = 1263416526;
                    }
                case -469240473:
                case 423220506:
                    break;
                case -258100735:
                case 245071572:
                    if (RunnableC1108.m3790()) {
                        m6981 = (C0630.m2566("ۖ۬") + i2) * 39;
                        i4 = ((m6981 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    } else {
                        m6981 = C0630.m2566("᩹۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 24469) ^ 475460032;
                        i5 = 2051215168;
                    }
                case 338330935:
                case 2139488644:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C0630.m2566("᩶᩸") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    } else {
                        m6981 = (C2105.m6981("ܿۙ") ^ i2) * (-101);
                        i4 = ((m6981 ^ i3) * (-29949)) ^ 1728343893;
                        i5 = 1393486791;
                    }
                case 870316977:
                case 1880026236:
                    if (this.f51309) {
                        m6981 = (C2105.m6981("ܰ᩹") ^ i3) * (-3);
                        i4 = ((m6981 ^ i2) * 21665) ^ (-99534810);
                        i5 = 1145919213;
                    } else {
                        m6981 = C0630.m2566("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-17573)) ^ 2044869503;
                        i5 = -886413392;
                    }
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b9, code lost:
    
        if (l.C4117.f13076 <= 0) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m39292(l.C21507 r37) {
        /*
            Method dump skipped, instructions count: 2938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39292(l.᩸ۢ᩷):void");
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m39301() {
        return this.f51319;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39293(boolean z) {
        int i = 1790935196;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C2958.f9394;
        int m2566 = (i3 - C0630.m2566("ۘۧ")) * (-107);
        int i4 = ((m2566 ^ i2) * (-16877)) ^ 1672524988;
        int i5 = 582827056;
        while (true) {
            i = ((((i ^ i2) * 10203) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2087765745:
                case -1770971477:
                    if (C1128.f4106 <= 0) {
                        m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۚ֨")) * 53;
                        i4 = ((m2566 ^ i3) * 10267) ^ 1208410108;
                        i5 = -610162649;
                    }
                case -2011784947:
                case -294352099:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C2105.m6981("ۖ᩶") ^ i3) * 11;
                        i4 = ((m2566 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۛ۫")) * (-79);
                        i4 = ((m2566 ^ i2) * 3557) ^ (-1125704702);
                        i5 = 910210699;
                    }
                case -1670687010:
                case -729218195:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 9469) ^ (-1447276232);
                        i5 = -901102271;
                    } else {
                        m2566 = C2105.m6981("ۡ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 8981) ^ 1961084733;
                        i5 = -1589166609;
                    }
                case -1522852247:
                case 1947064423:
                    C3019.m9255();
                    C3537.m10746();
                    break;
                case -1468592616:
                case 1660330284:
                    if (C3537.m10746() <= 0) {
                        m2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        m2566 = (C2105.m6981("֡ᩴ") + i2) * 17;
                        i4 = ((m2566 ^ i3) * 21849) ^ (-766884693);
                        i5 = -1902619145;
                    }
                case -770644303:
                case 1600577784:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("ۖ᩶") ^ i3) * 11;
                        i4 = ((m2566 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        m2566 = (C0630.m2566("ۢ᩸") + i2) * 61;
                        i4 = ((m2566 ^ i3) * 21501) ^ 2001424453;
                        i5 = -1724241229;
                    }
                case -733915676:
                case 670109577:
                    C1294.m4372();
                    if (C21923.m49329()) {
                        m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        m2566 = C0630.m2566("ܽۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7523) ^ 937767058;
                        i5 = -641181595;
                    }
                case -640250182:
                case 2056165619:
                    if (C3683.m11222()) {
                        m2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        m2566 = (C2105.m6981("᩻ۧ") + i2) * (-69);
                        i4 = ((m2566 ^ i3) * (-31523)) ^ 834613069;
                        i5 = 1666771787;
                    }
                case -507842883:
                case 1824715900:
                    this.f51319 = z;
                    if (z) {
                        m2566 = (C2105.m6981("ۙܿ") ^ i3) * (-123);
                        i4 = ((m2566 ^ i2) * (-12269)) ^ 2104457150;
                        i5 = 1797340102;
                    } else {
                        m2566 = (C0630.m2566("ᩴۘ") ^ i2) * (-21);
                        i4 = ((m2566 ^ i3) * 22341) ^ 1205183545;
                        i5 = 1213512525;
                    }
                case -9773614:
                case 382760154:
                    C2105.m6982();
                    m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                    i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                    i5 = 1740119393;
                case 49256107:
                case 840757604:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        m2566 = C2105.m6981("ܶܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1765) ^ (-1112713096);
                        i5 = 754234007;
                    }
                case 164025425:
                case 1063798303:
                    if (C0422.f1886 > 0) {
                        m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        m2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    }
                case 668104594:
                case 1401440019:
                    break;
                case 893340255:
                case 934431018:
                    if (C0422.f1886 > 0) {
                        m2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        m2566 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 9469) ^ (-1447276232);
                        i5 = -901102271;
                    }
                case 1069109369:
                case 1483578644:
                    if (C2105.f7037 != 0) {
                        m2566 = (C2105.m6981("ۖ᩶") ^ i3) * 11;
                        i4 = ((m2566 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        m2566 = (C0630.m2566("ۤ۬") + i3) * 55;
                        i4 = ((m2566 ^ i2) * 16787) ^ 662805970;
                        i5 = -171264175;
                    }
                case 1125339551:
                case 1140579077:
                    if (C7106.f21815 != 0) {
                        m2566 = (C0630.m2566("᩹ۜ") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۤۤ")) * (-83);
                        i4 = ((m2566 ^ i2) * 30235) ^ 1372467933;
                        i5 = 108373892;
                    }
                case 1415920486:
                case 2121200182:
                    if (C3746.f11829 <= 0) {
                        m2566 = (C2105.m6981("ۖ᩶") ^ i3) * 11;
                        i4 = ((m2566 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        m2566 = C2105.m6981("ۙ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27359)) ^ (-2123547432);
                        i5 = -749830917;
                    }
                default:
                    m39289();
                    m2566 = (C2105.m6981("ۙܿ") ^ i3) * (-123);
                    i4 = ((m2566 ^ i2) * (-12269)) ^ 2104457150;
                    i5 = 1797340102;
            }
            return;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39300() {
        return this.f51300;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39315(String str) {
        this.f51300 = str;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m39309() {
        return this.f51305;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39307(boolean z) {
        this.f51305 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0117, code lost:
    
        r8 = l.C2105.m6981("ᩴܳ") ^ r7;
        r9 = ((r8 ^ r6) * 20207) ^ (-1836437902);
        r10 = -1552333978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01c6, code lost:
    
        r8 = (l.C2105.m6981("᩶᩻") ^ r7) * (-17);
        r9 = ((r8 ^ r6) * 30055) ^ (-921655928);
        r10 = 1028369535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0298, code lost:
    
        r8 = l.C0630.m2566("ۧ۠") ^ r7;
        r9 = ((r8 ^ r6) * (-13477)) ^ (-240329588);
        r10 = 1371883864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f4, code lost:
    
        r8 = l.C2105.m6981("۬֨") ^ r6;
        r9 = ((r8 ^ r7) * 16467) ^ 1652733700;
        r10 = 1549171788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0223, code lost:
    
        r8 = (l.C0630.m2566("ܰۗ") ^ r7) * 99;
        r9 = ((r8 ^ r6) * (-4501)) ^ 1180047874;
        r10 = 1245328406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r8 = (r6 - l.C0630.m2566("ܶᩳ")) * (-13);
        r9 = ((r8 ^ r7) * (-21157)) ^ 1045811579;
        r10 = -68384600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x026a, code lost:
    
        r8 = (l.C0630.m2566("ۧۡ") + r6) * (-5);
        r9 = ((r8 ^ r7) * 17699) ^ (-795333305);
        r10 = -738950826;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Class m39275(int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39275(int, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (l.C4159.f13567 != false) goto L15;
     */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC15440 m39310() {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39310():l.ܶ᩵ܿ");
    }

    public final void finalize() {
        m39289();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class m39305(String str) {
        return m39275(2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class m39288(String str) {
        return m39275(3, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class m39311(String str) {
        return m39275(4, str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39318(ArrayList arrayList) {
        m39281(arrayList, 1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39306(ArrayList arrayList) {
        m39281(arrayList, 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39291(ArrayList arrayList) {
        m39281(arrayList, 3);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39313(ArrayList arrayList) {
        m39281(arrayList, 4);
    }

    public final String toString() {
        int m6981;
        int i;
        JSONException e = null;
        Iterator it = null;
        boolean z = false;
        String str = null;
        String str2 = null;
        int i2 = 0;
        int i3 = -714340915;
        int i4 = ServiceConnectionC3453.f10921;
        int i5 = C7811.f24123;
        int m2566 = C0630.m2566("ۢۘ") ^ i4;
        int i6 = ((m2566 ^ i5) * (-8769)) ^ 618507457;
        int i7 = m2566 ^ (-471310795);
        JSONArray jSONArray = null;
        JSONObject jSONObject = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-13379)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2039453096:
                case -1008831681:
                    jSONObject.put(RunnableC1108.m3789(f51295, 502, 10, i2), jSONArray);
                    jSONObject.put(C3683.m11225(f51295, 526, 6, i2), this.f51319);
                    jSONObject.put(RunnableC3474.m10633(f51295, 532, 3, i2), this.f51300);
                    jSONObject.put(C4159.m12578(f51295, 535, 7, i2), this.f51307);
                    jSONObject.put(C0050.m948(f51295, 542, 8, i2), this.f51317);
                    jSONObject.put(C11340.m28025(f51295, 550, 17, i2), this.f51305);
                    str2 = C0422.m1959(jSONObject);
                    m6981 = (C0630.m2566("֫ۗ") + i5) * 5;
                    i6 = 1000694633 ^ ((m6981 ^ i4) * (-15899));
                    i = -589391506;
                    i7 = i ^ m6981;
                case -1543260207:
                case -1448840368:
                    str = this.f51299;
                    m6981 = C0630.m2566("ܽܰ") ^ i5;
                    i6 = 1901095032 ^ ((m6981 ^ i4) * (-11575));
                    i = -1283094935;
                    i7 = i ^ m6981;
                case -1543256992:
                case -823407922:
                    return C0050.m947(e);
                case -1519783311:
                case 85784915:
                    return str2;
                case -1420542388:
                case 1256792560:
                    z = C1773.m5910(it);
                    m6981 = (i5 - C2105.m6981("ۚۖ")) * 57;
                    i6 = (-181690658) ^ ((m6981 ^ i4) * 27085);
                    i = 585852146;
                    i7 = i ^ m6981;
                case -1132431231:
                case 1788032056:
                    if (z) {
                        m6981 = C2105.m6981("᩶ۜ") ^ i4;
                        i6 = (-1002112185) ^ ((m6981 ^ i5) * 4171);
                        i = -717401682;
                    } else {
                        m6981 = (C0630.m2566("ۤᩳ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = (-504780903) ^ ((m6981 ^ i4) * 32053);
                        i = 581171096;
                    }
                    i7 = i ^ m6981;
                case -783475967:
                case 41264317:
                    if (str != null) {
                        m6981 = C0630.m2566("᩷᩷") ^ i4;
                        i6 = (-1086853260) ^ ((m6981 ^ i5) * (-21075));
                        i = -332922015;
                        i7 = i ^ m6981;
                    }
                    m6981 = (C2105.m6981("ۘۚ") ^ i4) * (-19);
                    i6 = (-2134982318) ^ ((m6981 ^ i5) * 27913);
                    i = -1434845515;
                    i7 = i ^ m6981;
                case -654223922:
                case 14465265:
                    try {
                        jSONObject.put(C2167.m7159(f51295, 512, 14, i2), str);
                        m6981 = (C2105.m6981("ۘۚ") ^ i4) * (-19);
                        i6 = (-2134982318) ^ ((m6981 ^ i5) * 27913);
                        i = -1434845515;
                    } catch (JSONException e2) {
                        e = e2;
                        m6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i6 = 785957904 ^ ((m6981 ^ i5) * 13567);
                        i = 572313803;
                        i7 = i ^ m6981;
                    }
                    i7 = i ^ m6981;
                case -413156110:
                case 1434881312:
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(C1773.m5917(f51295, 410, 17, i2), this.f51313);
                        jSONObject.put(C0630.m2575(f51295, 427, 14, i2), this.f51314);
                        jSONObject.put(C4616.m13542(f51295, 441, 16, i2), this.f51308);
                        jSONObject.put(C0798.m3005(f51295, 457, 8, i2), this.f51297);
                        jSONObject.put(C0050.m948(f51295, 465, 11, i2), this.f51318);
                        jSONObject.put(C3537.m10748(f51295, 476, 11, i2), this.f51315);
                        jSONObject.put(C21923.m49334(f51295, 487, 4, i2), this.f51296);
                        jSONObject.put(C3683.m11225(f51295, 491, 11, i2), this.f51311);
                        try {
                            jSONArray = new JSONArray();
                            it = C2958.m9029(this.f51304);
                            m6981 = (i4 - C2105.m6981("֡ܺ")) * (-41);
                            i6 = (-854601506) ^ ((m6981 ^ i5) * (-28733));
                            i = -1489832451;
                        } catch (JSONException e3) {
                            e = e3;
                            jSONArray = null;
                            m6981 = C2105.m6981("۟ᩴ") ^ i4;
                            i6 = 785957904 ^ ((m6981 ^ i5) * 13567);
                            i = 572313803;
                            i7 = i ^ m6981;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        jSONObject = null;
                    }
                    i7 = i ^ m6981;
                case 253720435:
                case 2019961357:
                    short s = f51295[409];
                    if (((s * s) + 162307600) - (s * 25480) >= 0) {
                        m6981 = (i4 - C0630.m2566("ܽ᩸")) * 53;
                        i6 = 605665951 ^ ((m6981 ^ i5) * (-9827));
                        i = -967012671;
                    } else {
                        m6981 = C2105.m6981("֫᩵") ^ i5;
                        i6 = 599296424 ^ ((m6981 ^ i4) * 9835);
                        i = -1453961464;
                    }
                    i7 = i ^ m6981;
                case 413548645:
                case 711659986:
                    i2 = 65061;
                    m6981 = C0630.m2566("ۚ᩺") ^ i5;
                    i6 = (-1260906397) ^ ((m6981 ^ i4) * 21175);
                    i = -461986169;
                    i7 = i ^ m6981;
                case 969515000:
                case 2104305988:
                    C11066 c11066 = (C11066) C2272.m7513(it);
                    jSONArray.put(c11066.m27451());
                    jSONArray.put(c11066.m27454());
                    m6981 = (i4 - C2105.m6981("֡ܺ")) * (-41);
                    i6 = (-854601506) ^ ((m6981 ^ i5) * (-28733));
                    i = -1489832451;
                    i7 = i ^ m6981;
                default:
                    i2 = 23951;
                    m6981 = C0630.m2566("ۚ᩺") ^ i5;
                    i6 = (-1260906397) ^ ((m6981 ^ i4) * 21175);
                    i = -461986169;
                    i7 = i ^ m6981;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (l.C3019.f9544 >= 0) goto L20;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16709 m39279(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39279(org.json.JSONObject):l.ܽܳ᩷");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00b0, code lost:
    
        if (l.C0050.f910 >= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (l.C1711.f5919 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (l.C4616.f14690 <= 0) goto L8;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m39284(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16709.m39284(org.json.JSONObject):void");
    }
}
