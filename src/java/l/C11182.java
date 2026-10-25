package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: F1FO */
/* renamed from: l.ۧᩴۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11182 {

    /* renamed from: ۛܶۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f33561 = {1720, -3697, -13476, -3505, 2635, 337, 819, -26315, -26310, -26307, -26313, -26363, -26310, -26314, -26332, -26351, -26326, -26342, -26313, -26245, -26243, -26243, -26243, -26246, 7134, -5947, 969, -5040, -6396, 3982, 4499, -2597, -7062, 6779, -6593, -5067, -7439, 6068, -14227, 4236, -3618, -13451, 8030, -13638, 861, -3829, 5130, -8117, 2695, -6804, 5582, 6860, -6060, -10612, 2445, -7013, -8037, -6174, 8189, 5557, -26244, -6015, 946, -15302, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26332, -26310, -26313, -26316, -26314, -26329, -26243, -26361, -26314, -26325, -26329, -26363, -26310, -26314, -26332, -26271, -26243, -26271, -26267, -26243, -26270, -26269, -26253, -26245, -26271, -26267, -26270, -26269, -26270, -26269, -26267, -26270, -26246, -26241, -26253, -26361, -26368, -26271, -26261, -14325, -6943, -12609, -14703, -6193, -2199, 3003, -964, -7637, 2185, -1124, -2476, -1729, 7090, 231, -2148, 2928, 3456, -13607, 4486, 74, -6968, -2802, 7474, 4328, -4674, -2790, -26367, -26340, -26340, -26361, -14622, -1462, -8014, -6195, 7380, -13764, -26368, -26341, -26346, -26337, -26337, 4268, -6226, 4814, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26331, -26310, -26314, -26332, -26243, -26363, -26310, -26314, -26332, -1358, -2822, -7791, -26316, -26314, -26329, -26367, -26314, -26336, -26308, -26330, -26335, -26320, -26314, -26336, -26245, -26243, -26243, -26243, -26246, 4185, 5312, 1166, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26331, -26310, -26314, -26332, -26243, -26363, -26310, -26314, -26332, -26348, -26335, -26308, -26330, -26333, 5453, -23074, -23102, -23102, -23076, -23101, -23082, -23075, -23104, -23081, -23080, -23086, -23101, -23078, -23159, -23140, -23140, -23087, -23078, -23095, -23054, -23084, -23082, -23075, -23097, -23140, -23102, -23074, -23140, -23102, -23103, -23156, -23098, -23103, -23073, -23154, -23077, -23097, -23097, -23101, -23146, -23168, -23054, -23146, -23167, -23051, -23146, -23167, -23051, -23102, -23074, -23139, -23102, -23102, -23139, -23088, -23076, -23074, -23146, -23167, -23051, -23088, -23084, -23078, -23138, -23087, -23078, -23075, -23146, -23167, -23051, -23102, -23074, -23146, -23167, -23051, -23102, -23103, -23146, -23168, -23051, -23083, -23103, -23076, -23074, -23146, -23168, -23049, -23086, -23101, -23101, -23146, -23167, -23163, -23101, -23146, -23168, -23049, -23086, -23075, -23081, -23103, -23076, -23078, -23081, -23146, -23167, -23163, -23079, -23098, -23074, -23101, -23060, -23083, -23103, -23076, -23074, -23146, -23168, -23049, -23100, -23082, -23087, -23086, -23101, -23078, -23146, -23167, -23163, -23080, -23146, -23168, -23049, 8078, 21091, 21089, 21110, 21099, 21108, 21099, 21110, 21115, 9294, 8844, 8851, 8863, 8845, 18208, -17350, -20045, 8859, 8854, 8842, 8850, 8859, 8846, 8840, 8859, 8852, 8841, 8854, 8859, 8846, 8851, 8853, 8852, 8867, -21770, 18597, 17279, 8840, 8853, 8846, 8859, 8846, 8851, 8853, 8852, -20992, 31898, -17245, -18653, -16533, -19698, 18927, 20900, -20432, -18104, -20766, 27854, -23721, -17377, 18880, 8852, 8847, 8854, 8854, 8922, 8857, 8859, 8852, 8852, 8853, 8846, 8922, 8856, 8863, 8922, 8857, 8859, 8841, 8846, 8922, 8846, 8853, 8922, 8852, 8853, 8852, 8919, 8852, 8847, 8854, 8854, 8922, 8846, 8835, 8842, 8863, 8922, 8859, 8852, 8862, 8840, 8853, 8851, 8862, 8916, 8844, 8851, 8863, 8845, 8916, 8876, 8851, 8863, 8845, 8893, 8840, 8853, 8847, 8842, 23086, 24280, 30136, 23041, 22247, -23832, 8852, 8847, 8854, 8854, 8922, 8857, 8859, 8852, 8852, 8853, 8846, 8922, 8856, 8863, 8922, 8857, 8859, 8841, 8846, 8922, 8846, 8853, 8922, 8852, 8853, 8852, 8919, 8852, 8847, 8854, 8854, 8922, 8846, 8835, 8842, 8863, 8922, 8859, 8852, 8862, 8840, 8853, 8851, 8862, 8916, 8844, 8851, 8863, 8845, 8916, 8876, 8851, 8863, 8845, -24135, 24501, -23246};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8817 f33562 = C8817.m22788();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33563 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static WeakReference f33564;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f33565;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f33566;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6874 f33567;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient boolean f33568;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27724(AbstractActivityC3346 abstractActivityC3346, String str, String str2) {
        String str3;
        int m2566;
        int i;
        int m6981;
        int i2;
        AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
        Intent intent = null;
        String str4 = null;
        Uri uri = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -450584031;
        int i7 = C0630.f2410;
        int i8 = C11340.f33930;
        int m69812 = (C2105.m6981("᩹ᩴ") ^ i7) * 69;
        int i9 = ((m69812 ^ i8) * 28309) ^ (-959455376);
        int i10 = 449739425;
        while (true) {
            int i11 = m69812 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * (-13563)) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2040154242:
                    case -601058932:
                        C22628.m50608(abstractActivityC33462, str2);
                        break;
                    case -1954560333:
                    case 1137643961:
                        C7106.m19120();
                        ServiceConnectionC3453.m10564();
                        break;
                    case -1869288870:
                    case 1031664709:
                        intent = new Intent();
                        if (C7811.f24123 < 0) {
                            short[] sArr2 = f33561;
                            if (C7106.f21815 == 0) {
                                str3 = str4;
                                String m3841 = C1128.m3841(sArr2, 330, 132, i5);
                                if (C0630.f2410 > 0) {
                                    StringBuilder sb = new StringBuilder(m3841);
                                    C3245.m9923(sb, str);
                                    String m947 = C0050.m947(sb);
                                    if (C11340.f33930 >= 0) {
                                        str3 = m947;
                                    } else {
                                        int m25662 = C0630.m2566("ۢ᩷") ^ i7;
                                        i9 = ((m25662 ^ i8) * 31259) ^ 1099649574;
                                        str4 = m947;
                                        i11 = m25662 ^ (-1893063998);
                                        intent = intent;
                                        abstractActivityC33462 = abstractActivityC3346;
                                    }
                                }
                                intent = intent;
                                m2566 = C2105.m6981("ܰ۫") ^ i8;
                                i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                                i = -1724124358;
                                i11 = m2566 ^ i;
                                str4 = str3;
                                abstractActivityC33462 = abstractActivityC3346;
                            }
                            m6981 = C0630.m2566("۬ܶ") ^ i8;
                            i9 = ((m6981 ^ i7) * 18773) ^ 134551812;
                            i2 = -1696724583;
                            i11 = m6981 ^ i2;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        str3 = str4;
                        m2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -1482960795:
                    case 1356837002:
                        intent.setData(uri);
                        C1711.m5738(intent, 268435456);
                        m6981 = C2105.m6981("۫ۘ") ^ i8;
                        i9 = ((m6981 ^ i7) * 21665) ^ 946422537;
                        i2 = -1068727864;
                        i11 = m6981 ^ i2;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -1409409369:
                    case -1051731362:
                        str3 = str4;
                        sArr = f33561;
                        if (!C2272.f7362) {
                            m2566 = (C0630.m2566("۫᩷") ^ i7) * (-107);
                            i9 = ((m2566 ^ i8) * (-9929)) ^ 1118433287;
                            i = 1310274196;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        m2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -1273568392:
                    case 485030808:
                        C3911.m11924();
                        if (C7811.f24123 < 0) {
                            break;
                        }
                        m6981 = C0630.m2566("۬ܶ") ^ i8;
                        i9 = ((m6981 ^ i7) * 18773) ^ 134551812;
                        i2 = -1696724583;
                        i11 = m6981 ^ i2;
                        abstractActivityC33462 = abstractActivityC3346;
                        break;
                    case -917717233:
                    case -518307539:
                        str3 = str4;
                        int i12 = s + s2;
                        i3 = i12 * i12;
                        s3 = 2;
                        if (C3245.f10203 > 0) {
                            m2566 = (i8 - C0630.m2566("᩵ۘ")) * 75;
                            i9 = ((m2566 ^ i7) * 13881) ^ (-468683947);
                            i = 1616071392;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        m2566 = C2105.m6981("ۜۙ") ^ i7;
                        i9 = ((m2566 ^ i8) * 9095) ^ (-349706927);
                        i = 1180225443;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -840896138:
                    case 2127637031:
                        str3 = str4;
                        i5 = 42419;
                        m2566 = C0630.m2566("᩻ܳ") ^ i7;
                        i9 = ((m2566 ^ i8) * 24083) ^ (-1329594023);
                        i = 1741563675;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -798240218:
                    case 87280593:
                        str3 = str4;
                        if ((i4 + 1) - i3 > 0) {
                            m2566 = (C0630.m2566("ۘܶ") + i8) * q.h;
                            i9 = ((m2566 ^ i7) * (-20661)) ^ 1345579614;
                            i = -1583327740;
                        } else {
                            m2566 = (i8 - C0630.m2566("۟֫")) * (-61);
                            i9 = ((m2566 ^ i7) * 22137) ^ (-58389225);
                            i = 217705367;
                        }
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -601897181:
                    case 1450963302:
                        str3 = str4;
                        s = sArr[329];
                        s2 = 1;
                        if (C4117.f13076 > 0) {
                            m2566 = (i7 - C0630.m2566("ܽ۟")) * 7;
                            i9 = ((m2566 ^ i8) * (-7329)) ^ (-1323494718);
                            i = -1681163983;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        m2566 = C2105.m6981("ۜۙ") ^ i7;
                        i9 = ((m2566 ^ i8) * 9095) ^ (-349706927);
                        i = 1180225443;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case -239341681:
                    case -213507278:
                        C1047.m3599();
                        if (AbstractC2021.f6743 <= 0) {
                            break;
                        }
                        str3 = str4;
                        m2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                        break;
                    case -31229199:
                    case 1755595696:
                        str3 = str4;
                        if (C1294.m4372() > 0) {
                            m2566 = (C0630.m2566("֫᩶") ^ i8) * (-71);
                            i9 = ((m2566 ^ i7) * 19039) ^ 872373630;
                            i = -2082070472;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        m2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case 104907412:
                    case 950014774:
                        str3 = str4;
                        i5 = 13485;
                        m2566 = C0630.m2566("᩻ܳ") ^ i7;
                        i9 = ((m2566 ^ i8) * 24083) ^ (-1329594023);
                        i = 1741563675;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case 262768923:
                    case 1324675951:
                        C1773.m5908();
                        if (!C0483.m2121()) {
                            str3 = str4;
                            m2566 = C0630.m2566("۠ۗ") ^ i7;
                            i9 = ((m2566 ^ i8) * (-3665)) ^ 1993594590;
                            i = -1443489917;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        str3 = str4;
                        m2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((m2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case 298998567:
                    case 342260665:
                        try {
                            C4075.m12261(abstractActivityC33462, intent);
                            int m69813 = (i7 - C2105.m6981("۠᩷")) * (-67);
                            i11 = m69813 ^ 88675210;
                            i9 = ((m69813 ^ i8) * 24795) ^ (-1973900182);
                        } catch (Exception unused) {
                            m6981 = (C2105.m6981("᩺ܽ") ^ i8) * (-57);
                            i9 = ((m6981 ^ i7) * 16971) ^ 748873223;
                            i2 = 519339893;
                            break;
                        }
                        abstractActivityC33462 = abstractActivityC3346;
                    case 777104011:
                    case 1194622547:
                        str3 = str4;
                        i4 = s * s3;
                        if (C7106.f21815 == 0) {
                            m2566 = (i7 - C2105.m6981("ۜ۬")) * (-127);
                            i9 = ((m2566 ^ i8) * (-8443)) ^ (-168572347);
                            i = 127267687;
                            i11 = m2566 ^ i;
                            str4 = str3;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        m2566 = C0630.m2566("۠ۗ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-3665)) ^ 1993594590;
                        i = -1443489917;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                    case 1186531001:
                    case 1989138438:
                        break;
                    case 1292972477:
                    case 1733000858:
                        C3911.m11924();
                        C4616.m13552();
                        break;
                    default:
                        uri = Uri.parse(str4);
                        if (!AbstractC2021.m6574()) {
                            m6981 = C0630.m2566("ܿۡ") ^ i8;
                            i9 = ((m6981 ^ i7) * (-6135)) ^ 2041057111;
                            i2 = -2064289740;
                            i11 = m6981 ^ i2;
                            abstractActivityC33462 = abstractActivityC3346;
                        }
                        str3 = str4;
                        m2566 = C0630.m2566("۠ۗ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-3665)) ^ 1993594590;
                        i = -1443489917;
                        i11 = m2566 ^ i;
                        str4 = str3;
                        abstractActivityC33462 = abstractActivityC3346;
                }
                return;
            }
            m69812 = C0630.m2566("ۘ᩶") ^ i7;
            i9 = ((m69812 ^ i8) * (-26797)) ^ (-893927194);
            i10 = -774912149;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public C11182(l.AbstractActivityC3346 r88, boolean r89, boolean r90, java.lang.Runnable r91) {
        /*
            Method dump skipped, instructions count: 9492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11182.<init>(l.ۗܺ᩷, boolean, boolean, java.lang.Runnable):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27731(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object obj = null;
        int i2 = -258611577;
        int i3 = C3432.f10845;
        int i4 = C2520.f8000;
        int m6981 = (C2105.m6981("۬ۡ") ^ i3) * (-119);
        int i5 = ((m6981 ^ i4) * (-9715)) ^ (-1288649760);
        int i6 = 546159172;
        while (true) {
            i2 = ((((i2 ^ i4) * (-1469)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2105977337:
                case 1046238886:
                    if (C3746.f11829 <= 0) {
                        m6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((m6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        m6981 = C2105.m6981("ۙܳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-5085)) ^ (-1900557105);
                        i6 = -1195329962;
                    }
                case -1921672266:
                case -1317243900:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    } else {
                        m6981 = C2105.m6981("۬ۙ") ^ i4;
                        i5 = ((m6981 ^ i3) * 3007) ^ (-669826063);
                        i6 = 1823055681;
                    }
                case -1870112217:
                case -1441289433:
                    if (C21923.f70183 != 0) {
                        m6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((m6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    } else {
                        m6981 = C0630.m2566("ۨܳ") ^ i4;
                        i5 = ((m6981 ^ i3) * 4623) ^ (-1376685160);
                        i6 = -1242020935;
                    }
                case -1782134295:
                case 1845645967:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("۬ܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-16545)) ^ 1132145731;
                        i6 = 945888589;
                    } else {
                        m6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((m6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    }
                case -1748033876:
                case -861359100:
                    C3663.m11168();
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    } else {
                        m6981 = (C2105.m6981("֫۠") ^ i3) * (-19);
                        i5 = ((m6981 ^ i4) * (-2553)) ^ 896531668;
                        i6 = 1800878626;
                    }
                case -1472110823:
                case -1341208619:
                    str = (String) C22628.m50605(list, i);
                    if (C3683.m11222()) {
                        m6981 = (C0630.m2566("ܺۡ") + i3) * 33;
                        i5 = ((m6981 ^ i4) * 23759) ^ 1422711453;
                        i6 = -1066230461;
                    } else {
                        m6981 = (C0630.m2566("ܽۜ") + i4) * 83;
                        i5 = ((m6981 ^ i3) * (-18857)) ^ (-1131070457);
                        i6 = 1955464327;
                    }
                case -1195336303:
                case -448692140:
                    C2272.m7503();
                    C4159.m12565();
                    break;
                case -418542984:
                case 1744449574:
                    if (C22628.f73083 <= 0) {
                        m6981 = (C2105.m6981("֫۠") ^ i3) * (-19);
                        i5 = ((m6981 ^ i4) * (-2553)) ^ 896531668;
                        i6 = 1800878626;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۜۧ")) * 37;
                        i5 = ((m6981 ^ i4) * 10817) ^ 1283420484;
                        i6 = 1623878172;
                    }
                case -201838463:
                case 846604348:
                    if (C3911.f12484 >= 0) {
                        m6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((m6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    } else {
                        m6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i5 = ((m6981 ^ i4) * (-5655)) ^ 164558684;
                        i6 = 520298127;
                    }
                case -147536130:
                case 842655790:
                    obj = C21923.m49339(list, 1);
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ܺۡ") + i3) * 33;
                        i5 = ((m6981 ^ i4) * 23759) ^ 1422711453;
                        i6 = -1066230461;
                    } else {
                        m6981 = C2105.m6981("᩹ܽ") ^ i3;
                        i5 = ((m6981 ^ i4) * 18413) ^ (-774396865);
                        i6 = -885396114;
                    }
                case -101775307:
                case 1847443704:
                    ViewOnClickListenerC1958.m6429();
                    C1711.m5736();
                    m6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                    i5 = ((m6981 ^ i4) * 24109) ^ 1590448866;
                    i6 = 842194662;
                case 151498700:
                case 1260067757:
                    i = 2;
                    if (C4159.m12565() >= 0) {
                        m6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((m6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        m6981 = C0630.m2566("۬۬") ^ i4;
                        i5 = ((m6981 ^ i3) * (-28993)) ^ 1511075528;
                        i6 = 1001050625;
                    }
                case 232011268:
                case 1327143449:
                    if (C0050.m940() <= 0) {
                        m6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((m6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        m6981 = (C0630.m2566("֡ۗ") + i4) * (-111);
                        i5 = ((m6981 ^ i3) * (-1595)) ^ (-1463202292);
                        i6 = -419935581;
                    }
                case 261489061:
                case 790293829:
                    if (C0050.m940() > 0) {
                        m6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((m6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        m6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    }
                case 1340871973:
                case 2116980130:
                    m27724(abstractActivityC3346, str, (String) obj);
                    break;
                default:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    } else {
                        m6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((m6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27725(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object obj = null;
        int i2 = -420958498;
        int i3 = C5695.f17556;
        int i4 = C0483.f2088;
        int m6981 = (C2105.m6981("۫᩷") + i3) * (-17);
        int i5 = ((m6981 ^ i4) * 31855) ^ (-1568660834);
        int i6 = 984514373;
        while (true) {
            i2 = ((((i2 ^ i4) * (-11877)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2131007881:
                case -2033935900:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((m6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    } else {
                        m6981 = C0630.m2566("֡ۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-2721)) ^ 70017766;
                        i6 = 858867929;
                    }
                case -2118600695:
                case 2026166241:
                    str = (String) C22628.m50605(list, i);
                    if (C4263.f13799 <= 0) {
                        m6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((m6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩺ۚ")) * 39;
                        i5 = ((m6981 ^ i4) * (-19887)) ^ 738722775;
                        i6 = 963653034;
                    }
                case -2025312804:
                case 2146033720:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((m6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    } else {
                        m6981 = (C2105.m6981("ܳܶ") ^ i4) * 95;
                        i5 = ((m6981 ^ i3) * (-2217)) ^ (-1719017646);
                        i6 = -1088288933;
                    }
                case -1965043420:
                case -1211745649:
                    i = 2;
                    if (C1420.f5096 <= 0) {
                        m6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((m6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    } else {
                        m6981 = (C0630.m2566("᩵ۤ") ^ i4) * 109;
                        i5 = ((m6981 ^ i3) * 13607) ^ 659299205;
                        i6 = -2122918379;
                    }
                case -1279504780:
                case 2102853635:
                    m27724(abstractActivityC3346, str, (String) obj);
                    break;
                case -1178779294:
                case -478208896:
                    if (C4159.f13567) {
                        m6981 = (i3 - C0630.m2566("۫ܶ")) * (-25);
                        i5 = ((m6981 ^ i4) * 21223) ^ (-1504514318);
                        i6 = -1983857714;
                    } else {
                        m6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((m6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    }
                case -1103740039:
                case 956936947:
                    if (C2520.f8000 < 0) {
                        m6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((m6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    } else {
                        m6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((m6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    }
                case -732197124:
                case -520615079:
                    C5695.m16023();
                    m6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                    i5 = ((m6981 ^ i4) * (-17165)) ^ (-656382910);
                    i6 = -1949358556;
                case -613138748:
                case 99132872:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((m6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۤۙ")) * 35;
                        i5 = ((m6981 ^ i4) * 6845) ^ (-861424139);
                        i6 = -383555014;
                    }
                case 41091473:
                case 363184823:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((m6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    } else {
                        m6981 = C0630.m2566("ܰۧ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31569)) ^ 2031568978;
                        i6 = -487968636;
                    }
                case 266204516:
                case 849713435:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("ۘܺ") ^ i3;
                        i5 = ((m6981 ^ i4) * 27871) ^ 1678524833;
                        i6 = 1525793210;
                    } else {
                        m6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((m6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    }
                case 462944843:
                case 1543882014:
                    obj = C22628.m50605(list, 1);
                    if (C1773.f6144 <= 0) {
                        m6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((m6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        m6981 = C0630.m2566("֫֫") ^ i4;
                        i5 = ((m6981 ^ i3) * 29159) ^ (-1811064421);
                        i6 = -1569397920;
                    }
                case 522473925:
                case 607603959:
                    C0422.m1963();
                    break;
                case 1339012265:
                case 1551091450:
                    if (C0630.m2564()) {
                        m6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((m6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    } else {
                        m6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((m6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    }
                case 1897690363:
                case 2091020888:
                    if (C3432.f10845 >= 0) {
                        m6981 = (i3 - C0630.m2566("۫ܶ")) * (-25);
                        i5 = ((m6981 ^ i4) * 21223) ^ (-1504514318);
                        i6 = -1983857714;
                    } else {
                        m6981 = (i4 - C2105.m6981("֡ۨ")) * 61;
                        i5 = ((m6981 ^ i3) * (-415)) ^ 1112375816;
                        i6 = -1413799077;
                    }
                default:
                    if (C0382.f1805) {
                        m6981 = (i4 - C2105.m6981("᩷᩹")) * 43;
                        i5 = ((m6981 ^ i3) * (-7299)) ^ 858950218;
                        i6 = 2014458650;
                    } else {
                        m6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((m6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27729(C11182 c11182, final AbstractActivityC3346 abstractActivityC3346, final DialogInterfaceC0206 dialogInterfaceC0206, View view, final boolean z, View view2) {
        String str;
        View view3;
        long j;
        View view4;
        int i;
        int i2;
        View view5;
        int i3;
        View view6;
        View view7;
        ViewParent viewParent;
        float[] fArr;
        String str2;
        ObjectAnimator objectAnimator;
        String str3;
        int i4;
        int i5;
        short[] sArr;
        AnimatorSet animatorSet;
        View view8;
        View view9;
        String str4;
        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160;
        View view10;
        long j2;
        View view11;
        int i6;
        int i7;
        View view12;
        int i8;
        View view13;
        ViewParent viewParent2;
        String str5;
        ObjectAnimator objectAnimator2;
        String str6;
        View view14;
        int i9;
        short[] sArr2;
        float[] fArr2;
        int m2566;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view15;
        String str7;
        AnimatorSet animatorSet2;
        int i16;
        String m2128;
        int m25662;
        int i17;
        int i18;
        int m25663;
        int i19;
        int i20;
        int i21;
        int m6981;
        int i22;
        AnimatorSet animatorSet3;
        View view16;
        int m69812;
        int i23;
        int i24;
        AnimatorSet animatorSet4;
        int i25;
        int i26;
        int i27;
        int i28;
        long j3;
        View view17;
        int i29;
        View view18;
        int i30;
        View view19;
        ViewParent viewParent3;
        int i31;
        String str8;
        ObjectAnimator objectAnimator3;
        String str9;
        AnimatorSet animatorSet5;
        View view20;
        int i32;
        float[] fArr3;
        View view21;
        View view22;
        String str10;
        View view23;
        int m25664;
        int i33;
        int i34;
        long j4;
        View view24;
        int i35;
        View view25;
        View view26;
        int i36;
        View view27;
        ViewParent viewParent4;
        String str11;
        int i37;
        String str12;
        View view28;
        ObjectAnimator objectAnimator4;
        String str13;
        AnimatorSet animatorSet6;
        View view29;
        int i38;
        float[] fArr4;
        View view30;
        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221602;
        View m3507;
        int m25665;
        int i39;
        int i40;
        long j5;
        String str14;
        View view31;
        int i41;
        View view32;
        int i42;
        View view33;
        ViewParent viewParent5;
        String str15;
        int i43;
        String str16;
        View view34;
        ObjectAnimator objectAnimator5;
        View view35;
        int i44;
        float[] fArr5;
        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221603;
        View view36;
        View view37;
        AnimatorSet animatorSet7;
        View m12361;
        int m25666;
        int i45;
        int i46;
        int m25667;
        int i47;
        int i48;
        long j6;
        View view38;
        int i49;
        View view39;
        ViewParent viewParent6;
        int i50;
        String str17;
        ObjectAnimator objectAnimator6;
        View view40;
        View view41;
        int i51;
        float[] fArr6;
        View view42;
        String str18;
        View view43;
        int m25668;
        int i52;
        int i53;
        long j7;
        View view44;
        View view45;
        View view46;
        View view47;
        int i54;
        View view48;
        ViewParent viewParent7;
        String str19;
        ObjectAnimator objectAnimator7;
        View view49;
        int i55;
        float[] fArr7;
        View view50;
        String str20;
        long j8;
        int m69813;
        int i56;
        int i57;
        int i58;
        View view51;
        ViewParent viewParent8;
        String str21;
        String str22;
        View view52;
        float[] fArr8;
        long j9;
        ObjectAnimator objectAnimator8;
        int i59;
        ObjectAnimator objectAnimator9;
        View view53;
        String str23;
        View view54;
        float[] fArr9;
        View view55;
        String str24;
        int m69814;
        int i60;
        int i61;
        View view56;
        int m69815;
        int i62;
        View view57 = view;
        ObjectAnimator objectAnimator10 = null;
        ObjectAnimator objectAnimator11 = null;
        float f = 0.0f;
        ObjectAnimator objectAnimator12 = null;
        float f2 = 0.0f;
        ObjectAnimator objectAnimator13 = null;
        float f3 = 0.0f;
        char c = 0;
        ObjectAnimator objectAnimator14 = null;
        String str25 = null;
        String str26 = null;
        short s = 0;
        int i63 = -1735558903;
        int i64 = C5695.f17556;
        int i65 = C4117.f13076;
        int m69816 = (i65 - C2105.m6981("ܽۡ")) * (-85);
        int i66 = ((m69816 ^ i64) * (-7951)) ^ 882145621;
        int i67 = m69816 ^ (-1253418850);
        int i68 = i66;
        ObjectAnimator objectAnimator15 = null;
        View view58 = null;
        View view59 = null;
        View view60 = null;
        float[] fArr10 = null;
        ObjectAnimator objectAnimator16 = null;
        short[] sArr3 = null;
        boolean z2 = false;
        int i69 = 0;
        int i70 = 0;
        View view61 = null;
        float[] fArr11 = null;
        String str27 = null;
        View view62 = null;
        ViewParent viewParent9 = null;
        int i71 = 0;
        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221604 = null;
        View view63 = null;
        View view64 = null;
        AnimatorSet animatorSet8 = null;
        int i72 = 0;
        int i73 = 0;
        View view65 = null;
        View view66 = null;
        Runnable runnable = null;
        Window window = null;
        AnimatorSet animatorSet9 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        long j10 = 0;
        int i74 = 0;
        while (true) {
            i63 = i67 ^ ((((i63 ^ i64) * 4163) >> 31) & i68);
            switch (i63) {
                case -2143546514:
                case 1543891795:
                    j6 = j10;
                    view11 = view59;
                    i49 = i71;
                    view39 = view62;
                    viewParent6 = viewParent9;
                    str17 = str27;
                    objectAnimator6 = objectAnimator16;
                    view41 = view60;
                    i51 = i70;
                    fArr6 = fArr10;
                    String str31 = str30;
                    view43 = view58;
                    view38 = view63;
                    view38.setTranslationY(C11340.m28026(view));
                    animatorSet3 = animatorSet8;
                    i50 = i74;
                    view40 = view66;
                    view42 = view65;
                    str18 = str31;
                    View view67 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view67;
                    m25668 = C0630.m2566("ܳ᩹") ^ i65;
                    i52 = ((m25668 ^ i64) * 7289) ^ 454998342;
                    i53 = -1739897259;
                    int i75 = m25668 ^ i53;
                    i74 = i50;
                    view63 = view38;
                    i68 = i52;
                    i70 = i51;
                    fArr10 = fArr6;
                    objectAnimator16 = objectAnimator6;
                    view60 = view41;
                    viewParent9 = viewParent6;
                    j10 = j6;
                    i67 = i75;
                    str27 = str17;
                    view58 = view43;
                    str30 = str18;
                    view65 = view42;
                    view66 = view40;
                    view62 = view39;
                    i71 = i49;
                    animatorSet8 = animatorSet3;
                    view59 = view11;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221605 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221605;
                case -2139171071:
                case 1916117259:
                    long j11 = j10;
                    int i76 = i71;
                    View view68 = view60;
                    View view69 = view62;
                    ViewParent viewParent10 = viewParent9;
                    float[] fArr12 = fArr10;
                    ObjectAnimator objectAnimator17 = objectAnimator16;
                    int i77 = i70;
                    String str32 = str30;
                    View view70 = view58;
                    c11182.f33568 = z2;
                    Object tag = view2.getTag();
                    View view71 = view59;
                    String m6435 = ViewOnClickListenerC1958.m6435(f33561, 587, 54, i77);
                    if (tag == null) {
                        m69813 = C0630.m2566("᩷ۚ") ^ i65;
                        i56 = ((m69813 ^ i64) * 30537) ^ (-537999464);
                        i57 = -383039988;
                    } else {
                        m69813 = C2105.m6981("᩷ۢ") ^ i64;
                        i56 = ((m69813 ^ i65) * 16693) ^ 1888926098;
                        i57 = 364018428;
                    }
                    int i78 = m69813 ^ i57;
                    i70 = i77;
                    view62 = view69;
                    fArr10 = fArr12;
                    objectAnimator16 = objectAnimator17;
                    view60 = view68;
                    viewParent9 = viewParent10;
                    view59 = view71;
                    i71 = i76;
                    str27 = m6435;
                    str30 = str32;
                    view58 = view70;
                    i67 = i78;
                    i68 = i56;
                    j10 = j11;
                case -2106766693:
                case 799188469:
                    C4616.m13552();
                    C2520.m8026();
                    break;
                case -2085608552:
                case 1069164110:
                    if (C0422.f1886 <= 0) {
                        str = str27;
                        int m25669 = C0630.m2566("ۜܿ") ^ i65;
                        i67 = m25669 ^ 103695786;
                        str27 = str;
                        i68 = ((m25669 ^ i64) * (-27999)) ^ (-314026725);
                        animatorSet9 = null;
                    } else {
                        m69815 = (i64 - C2105.m6981("ᩴۗ")) * (-101);
                        i68 = ((m69815 ^ i65) * 10351) ^ (-178054605);
                        i62 = -457150749;
                        i67 = m69815 ^ i62;
                    }
                case -2083756759:
                case 35553628:
                    c11182.f33567.m18609(z2, new RunnableC0709());
                    break;
                case -2071046785:
                case -759780240:
                    long j12 = j10;
                    view11 = view59;
                    int i79 = i73;
                    AnimatorSet animatorSet10 = animatorSet8;
                    View view72 = view63;
                    View view73 = view62;
                    ViewParent viewParent11 = viewParent9;
                    String str33 = str27;
                    ObjectAnimator objectAnimator18 = objectAnimator16;
                    View view74 = view66;
                    View view75 = view60;
                    int i80 = i70;
                    float[] fArr13 = fArr10;
                    View view76 = view65;
                    String str34 = str30;
                    View view77 = view58;
                    View view78 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view78;
                    short[] sArr4 = sArr3;
                    String m1840 = C0382.m1840(sArr4, 484, 12, i80);
                    int m256610 = C0630.m2566(C3019.m9250(f33561, 496, 3, i80)) ^ 2097281642;
                    i69 = 2;
                    str28 = C2126.m7036(f33561, 499, 8, i80);
                    int i81 = i72;
                    if (i79 == i81) {
                        int m69817 = C2105.m6981("᩻᩻") ^ i65;
                        i68 = ((m69817 ^ i64) * 18921) ^ (-2047985768);
                        i70 = i80;
                        sArr3 = sArr4;
                        view63 = view72;
                        fArr10 = fArr13;
                        objectAnimator16 = objectAnimator18;
                        view58 = view77;
                        view60 = view75;
                        viewParent9 = viewParent11;
                        z2 = false;
                        str29 = m1840;
                        i73 = i79;
                        str30 = str34;
                        view65 = view76;
                        view66 = view74;
                        str27 = str33;
                        animatorSet8 = animatorSet10;
                        j10 = j12;
                        i74 = 1;
                        view57 = view;
                        i67 = m69817 ^ (-542686617);
                        view62 = view73;
                        i71 = m256610;
                        i72 = i81;
                        view59 = view11;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216052 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216052;
                    } else {
                        int m69818 = (C2105.m6981("᩶ۜ") + i64) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i70 = i80;
                        sArr3 = sArr4;
                        i72 = i81;
                        view63 = view72;
                        fArr10 = fArr13;
                        objectAnimator16 = objectAnimator18;
                        view58 = view77;
                        view60 = view75;
                        viewParent9 = viewParent11;
                        view59 = view11;
                        str29 = m1840;
                        i73 = i79;
                        str30 = str34;
                        view65 = view76;
                        view66 = view74;
                        str27 = str33;
                        animatorSet8 = animatorSet10;
                        j10 = j12;
                        i74 = 1;
                        view57 = view;
                        i67 = m69818 ^ 1690038295;
                        i68 = ((m69818 ^ i65) * 31695) ^ 1741180863;
                        view62 = view73;
                        z2 = false;
                        i71 = m256610;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160522 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160522;
                    }
                case -1989306464:
                case -1985400792:
                    j3 = j10;
                    view17 = view59;
                    i29 = i73;
                    view18 = view63;
                    i30 = i71;
                    view19 = view62;
                    viewParent3 = viewParent9;
                    i31 = i74;
                    str8 = str27;
                    objectAnimator3 = objectAnimator16;
                    str9 = str29;
                    animatorSet5 = animatorSet8;
                    view20 = view60;
                    i32 = i70;
                    fArr3 = fArr10;
                    view21 = view66;
                    view22 = view65;
                    str10 = str30;
                    view23 = view58;
                    View view79 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view79;
                    if (C1047.m3602()) {
                        m25664 = C2105.m6981("᩵ۤ") ^ i65;
                        i33 = ((m25664 ^ i64) * 14415) ^ 1952900614;
                        i34 = -436351429;
                    } else {
                        m25664 = C2105.m6981("۟ۤ") ^ i64;
                        i33 = ((m25664 ^ i65) * (-5363)) ^ (-2001780358);
                        i34 = -1594006764;
                    }
                    int i82 = m25664 ^ i34;
                    i70 = i32;
                    fArr10 = fArr3;
                    objectAnimator16 = objectAnimator3;
                    view58 = view23;
                    view60 = view20;
                    viewParent9 = viewParent3;
                    view59 = view17;
                    str30 = str10;
                    view65 = view22;
                    view66 = view21;
                    str27 = str8;
                    animatorSet8 = animatorSet5;
                    i74 = i31;
                    i68 = i33;
                    str29 = str9;
                    view62 = view19;
                    i71 = i30;
                    view63 = view18;
                    i73 = i29;
                    j10 = j3;
                    i67 = i82;
                    view57 = view;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221605222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221605222;
                case -1908008993:
                case -652810791:
                    C21923.m49329();
                    if (C0483.m2121()) {
                        str = str27;
                        int m256692 = C0630.m2566("ۜܿ") ^ i65;
                        i67 = m256692 ^ 103695786;
                        str27 = str;
                        i68 = ((m256692 ^ i64) * (-27999)) ^ (-314026725);
                        animatorSet9 = null;
                    } else {
                        m69815 = (C0630.m2566("֨ᩴ") + i64) * 57;
                        i68 = ((m69815 ^ i65) * (-1277)) ^ 1548286250;
                        i62 = 1394502480;
                        i67 = m69815 ^ i62;
                    }
                case -1847685598:
                case -1773256361:
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    animatorSet3 = animatorSet8;
                    view16 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    view8 = view66;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view80 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view80;
                    if (view2.getTag() == null) {
                        m69812 = C2105.m6981("۬ۢ") ^ i65;
                        i23 = ((m69812 ^ i64) * 7151) ^ 1147461804;
                        i24 = 1750340396;
                    } else {
                        m69812 = C0630.m2566("ۙ۬") ^ i64;
                        i23 = ((m69812 ^ i65) * 15111) ^ (-74274389);
                        i24 = -2074183985;
                    }
                    int i83 = m69812 ^ i24;
                    i74 = i4;
                    i73 = i7;
                    i70 = i16;
                    i68 = i23;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view63 = view16;
                    str27 = str5;
                    j10 = j2;
                    i67 = i83;
                    view62 = view13;
                    view58 = view3;
                    i71 = i8;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet3;
                    view59 = view11;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216052222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216052222;
                case -1826448055:
                case 1982315585:
                    objectAnimator12.cancel();
                    view56 = view60;
                    str23 = str27;
                    fArr9 = fArr10;
                    String str35 = str30;
                    view55 = view58;
                    str24 = str35;
                    m69814 = (C2105.m6981("ᩴۨ") ^ i65) * 27;
                    view54 = view56;
                    i60 = ((m69814 ^ i64) * (-25409)) ^ 881123075;
                    i61 = -1664144039;
                    i67 = m69814 ^ i61;
                    fArr10 = fArr9;
                    view60 = view54;
                    str27 = str23;
                    i68 = i60;
                    View view81 = view55;
                    str30 = str24;
                    view58 = view81;
                case -1778696457:
                case -1055332638:
                    fArr10[z2 ? 1 : 0] = f3;
                    c = 1;
                    fArr10[1] = f2;
                    objectAnimator14 = C1711.m5730(C5695.m16025(view59, str28, fArr10), 350L);
                    float[] fArr14 = new float[i69];
                    fArr14[z2 ? 1 : 0] = view60.getTranslationY();
                    fArr14[1] = f2;
                    View view82 = view60;
                    objectAnimator16 = C2520.m8018(view82, str29, fArr14);
                    if (C0382.f1805) {
                        int m69819 = C2105.m6981("᩺᩶") ^ i64;
                        i67 = m69819 ^ (-62912614);
                        view60 = view82;
                        i68 = ((m69819 ^ i65) * 8791) ^ (-515980085);
                        j10 = 350;
                    } else {
                        fArr4 = fArr10;
                        j4 = 350;
                        view24 = view59;
                        i35 = i73;
                        m3507 = view65;
                        view26 = view63;
                        viewParent4 = viewParent9;
                        str11 = str30;
                        i37 = i74;
                        view28 = view58;
                        objectAnimator4 = objectAnimator16;
                        str13 = str29;
                        textureViewSurfaceTextureListenerC221602 = textureViewSurfaceTextureListenerC221604;
                        view25 = view61;
                        animatorSet6 = animatorSet8;
                        i38 = i70;
                        view30 = view66;
                        String str36 = str27;
                        view29 = view82;
                        i36 = i71;
                        view27 = view62;
                        str12 = str36;
                        m25665 = C2105.m6981("᩸۬") ^ i64;
                        i39 = ((m25665 ^ i65) * (-30655)) ^ (-515205729);
                        i40 = -1195532374;
                        int i84 = m25665 ^ i40;
                        i70 = i38;
                        view61 = view25;
                        view66 = view30;
                        fArr10 = fArr4;
                        objectAnimator16 = objectAnimator4;
                        animatorSet8 = animatorSet6;
                        view60 = view29;
                        viewParent9 = viewParent4;
                        view59 = view24;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221602;
                        i74 = i37;
                        i68 = i39;
                        str29 = str13;
                        str27 = str12;
                        view58 = view28;
                        view63 = view26;
                        str30 = str11;
                        view62 = view27;
                        i71 = i36;
                        view65 = m3507;
                        i73 = i35;
                        j10 = j4;
                        i67 = i84;
                        view57 = view;
                    }
                case -1726658863:
                case -1209942288:
                    if (C3432.m10477() <= 0) {
                        m69815 = (C0630.m2566("֨ᩴ") + i64) * 57;
                        i68 = ((m69815 ^ i65) * (-1277)) ^ 1548286250;
                        i62 = 1394502480;
                        i67 = m69815 ^ i62;
                    } else {
                        j7 = j10;
                        view44 = view59;
                        view45 = view65;
                        view46 = view66;
                        view47 = view63;
                        i54 = i71;
                        view48 = view62;
                        viewParent7 = viewParent9;
                        str19 = str27;
                        objectAnimator7 = objectAnimator16;
                        view49 = view60;
                        i55 = i70;
                        fArr7 = fArr10;
                        String str37 = str30;
                        view50 = view58;
                        str20 = str37;
                        int m256611 = (C0630.m2566("۟᩵") ^ i64) * 89;
                        String str38 = str20;
                        int i85 = ((m256611 ^ i65) * 18233) ^ 1959962710;
                        view63 = view47;
                        view66 = view46;
                        i70 = i55;
                        fArr10 = fArr7;
                        objectAnimator16 = objectAnimator7;
                        view60 = view49;
                        viewParent9 = viewParent7;
                        j10 = j7;
                        i67 = m256611 ^ (-1242488956);
                        str27 = str19;
                        view59 = view44;
                        view62 = view48;
                        i71 = i54;
                        View view83 = view45;
                        i68 = i85;
                        view58 = view50;
                        str30 = str38;
                        view65 = view83;
                    }
                case -1709823809:
                case 846573308:
                    j2 = j10;
                    view11 = view59;
                    i6 = i72;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i9 = i70;
                    sArr2 = sArr3;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view84 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view84;
                    s = f33561[471];
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = C2105.m6981("ۖۨ") ^ i64;
                        i10 = ((m2566 ^ i65) * (-12705)) ^ 1073936041;
                        i11 = -1063132930;
                        i12 = m2566 ^ i11;
                        i70 = i9;
                        sArr3 = sArr2;
                        i72 = i6;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i86 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i86;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606;
                    }
                    m2566 = C0630.m2566("֨ܿ") ^ i64;
                    i10 = ((m2566 ^ i65) * (-21681)) ^ 1615412110;
                    i11 = -388642408;
                    i12 = m2566 ^ i11;
                    i70 = i9;
                    sArr3 = sArr2;
                    i72 = i6;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i862 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i862;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062;
                case -1677674891:
                case -288649789:
                    C22628.m50608(abstractActivityC3346, C23986.m52803());
                    break;
                case -1589568339:
                case -12847436:
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view85 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view85;
                    window = dialogInterfaceC0206.m1445();
                    if (window != null) {
                        m6981 = (i64 - C0630.m2566("ۗ۫")) * 11;
                        i10 = ((m6981 ^ i65) * 17913) ^ (-1365044759);
                        i22 = 2059711695;
                        i12 = m6981 ^ i22;
                        i70 = i16;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i8622 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i8622;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622;
                    }
                    m6981 = C0630.m2566("ܰᩴ") ^ i65;
                    i10 = ((m6981 ^ i64) * (-7099)) ^ 836298944;
                    i22 = -1587991367;
                    i12 = m6981 ^ i22;
                    i70 = i16;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i86222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i86222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222;
                case -1573125136:
                case -3450622:
                    C1504.m5179();
                    if (C0798.f2919) {
                        str = str27;
                        int m2566922 = C0630.m2566("ۜܿ") ^ i65;
                        i67 = m2566922 ^ 103695786;
                        str27 = str;
                        i68 = ((m2566922 ^ i64) * (-27999)) ^ (-314026725);
                        animatorSet9 = null;
                    } else {
                        j2 = j10;
                        view11 = view59;
                        i6 = i72;
                        i7 = i73;
                        view12 = view63;
                        i8 = i71;
                        view13 = view62;
                        viewParent2 = viewParent9;
                        i4 = i74;
                        str5 = str27;
                        objectAnimator2 = objectAnimator16;
                        str6 = str29;
                        animatorSet = animatorSet8;
                        view14 = view60;
                        i9 = i70;
                        sArr2 = sArr3;
                        fArr2 = fArr10;
                        view8 = view66;
                        view9 = view65;
                        str4 = str30;
                        view3 = view58;
                        View view86 = view61;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                        view10 = view86;
                        m2566 = C0630.m2566("֨ܿ") ^ i64;
                        i10 = ((m2566 ^ i65) * (-21681)) ^ 1615412110;
                        i11 = -388642408;
                        i12 = m2566 ^ i11;
                        i70 = i9;
                        sArr3 = sArr2;
                        i72 = i6;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i862222 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i862222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222;
                    }
                case -1563659829:
                case 1789436457:
                    float[] fArr15 = new float[i69];
                    fArr15[z2 ? 1 : 0] = 0.0f;
                    fArr15[i74] = f;
                    ObjectAnimator m16025 = C5695.m16025(viewParent9, str29, fArr15);
                    float[] fArr16 = new float[i69];
                    // fill-array-data instruction
                    fArr16[0] = 0.0f;
                    fArr16[1] = 90.0f;
                    ObjectAnimator m160252 = C5695.m16025(view62, str28, fArr16);
                    m160252.setStartDelay(150L);
                    c11182.f33565 = m160252;
                    m16025.addListener(new C22742(view57, c11182, abstractActivityC3346));
                    C22628.m50603(m16025);
                    C21923.m49341(m160252);
                    break;
                case -1463623230:
                case 579398600:
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view87 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view87;
                    if (i7 == (C0630.m2566(C4117.m12355(f33561, 513, 3, i16)) ^ 2125104550)) {
                        m6981 = (i65 - C0630.m2566("ܶᩳ")) * 9;
                        i10 = ((m6981 ^ i64) * 5295) ^ (-619732784);
                        i22 = -1069828591;
                    } else {
                        m6981 = C2105.m6981("ᩴ۟") ^ i64;
                        i10 = ((m6981 ^ i65) * (-4287)) ^ 113101956;
                        i22 = -116466698;
                    }
                    i12 = m6981 ^ i22;
                    i70 = i16;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i8622222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i8622222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222;
                case -1461253054:
                case -296278663:
                    float[] fArr17 = new float[i69];
                    // fill-array-data instruction
                    fArr17[0] = 0.0f;
                    fArr17[1] = 90.0f;
                    ObjectAnimator m160253 = C5695.m16025(view61, str28, fArr17);
                    m160253.setStartDelay(150L);
                    ObjectAnimator objectAnimator19 = objectAnimator15;
                    objectAnimator19.addListener(new C7220(view65, abstractActivityC3346, dialogInterfaceC0206, c11182, view66));
                    C21923.m49341(objectAnimator19);
                    C22628.m50603(m160253);
                    break;
                case -1325700060:
                case -1288212589:
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view88 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view88;
                    if (c11182.f33568) {
                        m6981 = (C2105.m6981("ۛۘ") + i64) * 49;
                        i10 = ((m6981 ^ i65) * (-31603)) ^ (-1933790915);
                        i22 = -539462822;
                        i12 = m6981 ^ i22;
                        i70 = i16;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i86222222 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i86222222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222;
                    }
                    m6981 = (C0630.m2566("֡֨") + i64) * 73;
                    i10 = ((m6981 ^ i65) * 26739) ^ 1342427456;
                    i22 = 2109777197;
                    i12 = m6981 ^ i22;
                    i70 = i16;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i862222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i862222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222;
                case -1209681996:
                case -155909369:
                    j2 = j10;
                    view11 = view59;
                    i6 = i72;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    sArr2 = sArr3;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view89 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view89;
                    i70 = 43166;
                    int m698110 = C2105.m6981("᩹ۨ") ^ i64;
                    i10 = ((m698110 ^ i65) * (-13437)) ^ (-1484985799);
                    i12 = m698110 ^ (-835169069);
                    sArr3 = sArr2;
                    i72 = i6;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i8622222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i8622222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222;
                case -1200660946:
                case -720182236:
                    j4 = j10;
                    view24 = view59;
                    i35 = i73;
                    view25 = view61;
                    view26 = view63;
                    i36 = i71;
                    view27 = view62;
                    viewParent4 = viewParent9;
                    str11 = str30;
                    i37 = i74;
                    str12 = str27;
                    view28 = view58;
                    objectAnimator4 = objectAnimator16;
                    str13 = str29;
                    animatorSet6 = animatorSet8;
                    view29 = view60;
                    i38 = i70;
                    fArr4 = fArr10;
                    view30 = view66;
                    c11182.f33568 = z2;
                    textureViewSurfaceTextureListenerC221602 = (TextureViewSurfaceTextureListenerC22160) C11340.m28028(view57, i36);
                    m3507 = C1005.m3507(view57, C0630.m2566(RunnableC1108.m3789(f33561, 516, 3, i38)) ^ 2102639137);
                    str26 = RunnableC3474.m10633(f33561, 519, 3, i38);
                    if (C1420.f5096 > 0) {
                        m25665 = (C0630.m2566("ۧ᩺") + i65) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i39 = ((m25665 ^ i64) * (-13243)) ^ 1081561082;
                        i40 = 114894029;
                        int i842 = m25665 ^ i40;
                        i70 = i38;
                        view61 = view25;
                        view66 = view30;
                        fArr10 = fArr4;
                        objectAnimator16 = objectAnimator4;
                        animatorSet8 = animatorSet6;
                        view60 = view29;
                        viewParent9 = viewParent4;
                        view59 = view24;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221602;
                        i74 = i37;
                        i68 = i39;
                        str29 = str13;
                        str27 = str12;
                        view58 = view28;
                        view63 = view26;
                        str30 = str11;
                        view62 = view27;
                        i71 = i36;
                        view65 = m3507;
                        i73 = i35;
                        j10 = j4;
                        i67 = i842;
                        view57 = view;
                    }
                    m25665 = C2105.m6981("᩸۬") ^ i64;
                    i39 = ((m25665 ^ i65) * (-30655)) ^ (-515205729);
                    i40 = -1195532374;
                    int i8422 = m25665 ^ i40;
                    i70 = i38;
                    view61 = view25;
                    view66 = view30;
                    fArr10 = fArr4;
                    objectAnimator16 = objectAnimator4;
                    animatorSet8 = animatorSet6;
                    view60 = view29;
                    viewParent9 = viewParent4;
                    view59 = view24;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221602;
                    i74 = i37;
                    i68 = i39;
                    str29 = str13;
                    str27 = str12;
                    view58 = view28;
                    view63 = view26;
                    str30 = str11;
                    view62 = view27;
                    i71 = i36;
                    view65 = m3507;
                    i73 = i35;
                    j10 = j4;
                    i67 = i8422;
                    view57 = view;
                case -1148074600:
                case 1032263025:
                    c11182.f33566 = null;
                    c11182.f33565 = null;
                    ViewGroup viewGroup = (ViewGroup) view2;
                    view59 = C4117.m12361(viewGroup, i69);
                    Object parent = viewGroup.getParent();
                    str = str27;
                    C11233.m27800(parent, str);
                    Object parent2 = ((View) parent).getParent();
                    C11233.m27800(parent2, str);
                    view60 = (View) parent2;
                    if (C1294.m4372() <= 0) {
                        int m25669222 = C0630.m2566("ۜܿ") ^ i65;
                        i67 = m25669222 ^ 103695786;
                        str27 = str;
                        i68 = ((m25669222 ^ i64) * (-27999)) ^ (-314026725);
                        animatorSet9 = null;
                    } else {
                        animatorSet9 = new AnimatorSet();
                        float[] fArr18 = new float[i69];
                        fArr18[z2 ? 1 : 0] = view58.getAlpha();
                        f2 = 0.0f;
                        fArr18[i74] = 0.0f;
                        String str39 = str30;
                        view3 = view58;
                        ObjectAnimator m3008 = C0798.m3008(C2520.m8018(view58, str39, fArr18), 150L);
                        f3 = view59.getRotation();
                        fArr10 = new float[i69];
                        if (C4117.m12364() != 0) {
                            j = j10;
                            view4 = view59;
                            i = i72;
                            i2 = i73;
                            view5 = view63;
                            i3 = i71;
                            view6 = view60;
                            view7 = view62;
                            viewParent = viewParent9;
                            fArr = fArr10;
                            str2 = str;
                            objectAnimator = objectAnimator16;
                            str3 = str29;
                            i4 = i74;
                            i5 = i70;
                            sArr = sArr3;
                            animatorSet = animatorSet8;
                            view8 = view66;
                            view9 = view65;
                            str4 = str39;
                            objectAnimator13 = m3008;
                            View view90 = view61;
                            textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                            view10 = view90;
                            i14 = C2105.m6981("ܺܽ") ^ i65;
                            i10 = ((i14 ^ i64) * (-32733)) ^ (-652601973);
                            i13 = -185237996;
                            i70 = i5;
                            sArr3 = sArr;
                            str29 = str3;
                            fArr10 = fArr;
                            objectAnimator16 = objectAnimator;
                            view60 = view6;
                            viewParent9 = viewParent;
                            j10 = j;
                            i67 = i14 ^ i13;
                            view63 = view5;
                            str27 = str2;
                            view57 = view;
                            i73 = i2;
                            view62 = view7;
                            i71 = i3;
                            i72 = i;
                            view59 = view4;
                            int i86222222222 = i4;
                            i68 = i10;
                            view58 = view3;
                            str30 = str4;
                            view65 = view9;
                            view66 = view8;
                            animatorSet8 = animatorSet;
                            i74 = i86222222222;
                            TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222222 = textureViewSurfaceTextureListenerC22160;
                            view61 = view10;
                            textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222222;
                        } else {
                            int m256612 = C0630.m2566("ۨ᩸") ^ i64;
                            i67 = m256612 ^ 741291557;
                            i68 = ((m256612 ^ i65) * 24037) ^ (-543244299);
                            view58 = view3;
                            str30 = str39;
                            objectAnimator13 = m3008;
                            str27 = str;
                        }
                    }
                case -1130771636:
                case 862089363:
                    j2 = j10;
                    view11 = view59;
                    animatorSet4 = animatorSet8;
                    View view91 = view64;
                    float[] fArr19 = fArr11;
                    View view92 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    view8 = view66;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    if (c11182.f33568) {
                        int m256613 = (C0630.m2566("ۙ᩸") ^ i65) * 33;
                        view64 = view91;
                        i68 = ((m256613 ^ i64) * 845) ^ 617470409;
                        i25 = m256613 ^ (-1349967847);
                        view63 = view92;
                        fArr11 = fArr19;
                        i70 = i16;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        j10 = j2;
                        i67 = i25;
                        str27 = str5;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        view62 = view13;
                        i71 = i8;
                        animatorSet8 = animatorSet4;
                        view59 = view11;
                    } else {
                        view64 = view91;
                        fArr11 = fArr19;
                        str6 = str29;
                        i7 = i73;
                        i4 = i74;
                        view12 = view92;
                        animatorSet = animatorSet4;
                        View view93 = view61;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                        view10 = view93;
                        m6981 = (C0630.m2566("֡֨") + i64) * 73;
                        i10 = ((m6981 ^ i65) * 26739) ^ 1342427456;
                        i22 = 2109777197;
                        i12 = m6981 ^ i22;
                        i70 = i16;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i862222222222 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i862222222222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222222;
                    }
                case -1075714072:
                case 312152443:
                    str23 = str27;
                    view54 = view60;
                    fArr9 = fArr10;
                    String str40 = str30;
                    view55 = view58;
                    str24 = str40;
                    C0964.m3404(view2, view2);
                    int i87 = i71;
                    ((TextureViewSurfaceTextureListenerC22160) C11340.m28028(view57, i87)).m49797();
                    i71 = i87;
                    ViewGroup viewGroup2 = (ViewGroup) view2;
                    view62 = C2958.m9024(viewGroup2, i69);
                    Object parent3 = viewGroup2.getParent();
                    C11233.m27800(parent3, str23);
                    viewParent9 = ((View) parent3).getParent();
                    f = (-viewGroup2.getTop()) - r5.getTop();
                    if (C3746.m11369() < 0) {
                        m69814 = (C2105.m6981("ܽᩴ") + i64) * 5;
                        i60 = ((m69814 ^ i65) * (-6569)) ^ 1048347893;
                        i61 = -927980081;
                        i67 = m69814 ^ i61;
                        fArr10 = fArr9;
                        view60 = view54;
                        str27 = str23;
                        i68 = i60;
                        View view812 = view55;
                        str30 = str24;
                        view58 = view812;
                    }
                    m69814 = C0630.m2566("ۧ᩶") ^ i65;
                    i60 = ((m69814 ^ i64) * 8295) ^ 1341872653;
                    i61 = 182597713;
                    i67 = m69814 ^ i61;
                    fArr10 = fArr9;
                    view60 = view54;
                    str27 = str23;
                    i68 = i60;
                    View view8122 = view55;
                    str30 = str24;
                    view58 = view8122;
                case -1048801595:
                case -125410848:
                    i58 = i71;
                    view51 = view62;
                    viewParent8 = viewParent9;
                    str21 = str30;
                    str22 = str27;
                    view52 = view60;
                    fArr8 = fArr10;
                    C0964.m3404(view2, null);
                    j9 = j10;
                    objectAnimator8 = objectAnimator16;
                    i59 = i70;
                    View m28028 = C11340.m28028(view57, C2105.m6981(C2958.m9031(f33561, 641, 3, i59)) ^ 2130080466);
                    objectAnimator9 = c11182.f33566;
                    if (objectAnimator9 != null) {
                        int m256614 = (i64 - C0630.m2566("᩺ᩴ")) * (-101);
                        i68 = ((m256614 ^ i65) * 25013) ^ (-971857336);
                        str30 = str21;
                        i70 = i59;
                        view58 = m28028;
                        fArr10 = fArr8;
                        objectAnimator16 = objectAnimator8;
                        view60 = view52;
                        viewParent9 = viewParent8;
                        objectAnimator11 = objectAnimator9;
                        str27 = str22;
                        view62 = view51;
                        i71 = i58;
                        j8 = j9;
                        i67 = m256614 ^ 841126920;
                        j10 = j8;
                    } else {
                        view53 = m28028;
                        int m698111 = (i65 - C2105.m6981("ۚ֡")) * 13;
                        str30 = str21;
                        i70 = i59;
                        view58 = view53;
                        fArr10 = fArr8;
                        objectAnimator16 = objectAnimator8;
                        view60 = view52;
                        viewParent9 = viewParent8;
                        objectAnimator11 = objectAnimator9;
                        str27 = str22;
                        view62 = view51;
                        i71 = i58;
                        j8 = j9;
                        i67 = m698111 ^ 1996638020;
                        i68 = ((m698111 ^ i64) * 10097) ^ (-1271723732);
                        j10 = j8;
                    }
                case -972894137:
                case 1862759106:
                    runnable.run();
                    break;
                case -948591801:
                case 470919746:
                    j2 = j10;
                    view11 = view59;
                    i6 = i72;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    sArr2 = sArr3;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view94 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view94;
                    i70 = 8954;
                    int m6981102 = C2105.m6981("᩹ۨ") ^ i64;
                    i10 = ((m6981102 ^ i65) * (-13437)) ^ (-1484985799);
                    i12 = m6981102 ^ (-835169069);
                    sArr3 = sArr2;
                    i72 = i6;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i8622222222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i8622222222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222222;
                case -867477896:
                case -852093973:
                    ActivityC10717.m26893((Context) abstractActivityC3346, C23986.m52804(), (boolean) i74);
                    break;
                case -856898529:
                case 98721624:
                    if (C1294.m4372() <= 0) {
                        str23 = str27;
                        view54 = view60;
                        fArr9 = fArr10;
                        String str41 = str30;
                        view55 = view58;
                        str24 = str41;
                        m69814 = C0630.m2566("ۧ᩶") ^ i65;
                        i60 = ((m69814 ^ i64) * 8295) ^ 1341872653;
                        i61 = 182597713;
                        i67 = m69814 ^ i61;
                        fArr10 = fArr9;
                        view60 = view54;
                        str27 = str23;
                        i68 = i60;
                        View view81222 = view55;
                        str30 = str24;
                        view58 = view81222;
                    } else {
                        j4 = j10;
                        view24 = view59;
                        i35 = i73;
                        m3507 = view65;
                        view26 = view63;
                        i36 = i71;
                        view27 = view62;
                        viewParent4 = viewParent9;
                        str11 = str30;
                        i37 = i74;
                        str12 = str27;
                        view28 = view58;
                        objectAnimator4 = objectAnimator16;
                        str13 = str29;
                        textureViewSurfaceTextureListenerC221602 = textureViewSurfaceTextureListenerC221604;
                        view25 = view61;
                        animatorSet6 = animatorSet8;
                        view29 = view60;
                        i38 = i70;
                        fArr4 = fArr10;
                        view30 = view66;
                        m25665 = C2105.m6981("᩸۬") ^ i64;
                        i39 = ((m25665 ^ i65) * (-30655)) ^ (-515205729);
                        i40 = -1195532374;
                        int i84222 = m25665 ^ i40;
                        i70 = i38;
                        view61 = view25;
                        view66 = view30;
                        fArr10 = fArr4;
                        objectAnimator16 = objectAnimator4;
                        animatorSet8 = animatorSet6;
                        view60 = view29;
                        viewParent9 = viewParent4;
                        view59 = view24;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221602;
                        i74 = i37;
                        i68 = i39;
                        str29 = str13;
                        str27 = str12;
                        view58 = view28;
                        view63 = view26;
                        str30 = str11;
                        view62 = view27;
                        i71 = i36;
                        view65 = m3507;
                        i73 = i35;
                        j10 = j4;
                        i67 = i84222;
                        view57 = view;
                    }
                case -845799939:
                case 1744907973:
                    if (C7811.f24123 >= 0) {
                        m69815 = (C0630.m2566("֨ᩴ") + i64) * 57;
                        i68 = ((m69815 ^ i65) * (-1277)) ^ 1548286250;
                        i62 = 1394502480;
                        i67 = m69815 ^ i62;
                    } else {
                        j2 = j10;
                        view11 = view59;
                        i15 = i73;
                        view15 = view63;
                        i8 = i71;
                        view13 = view62;
                        viewParent2 = viewParent9;
                        m2128 = str30;
                        i28 = i74;
                        str5 = str27;
                        view3 = view58;
                        objectAnimator2 = objectAnimator16;
                        str7 = str29;
                        animatorSet2 = animatorSet8;
                        view14 = view60;
                        i16 = i70;
                        fArr2 = fArr10;
                        view8 = view66;
                        view9 = view65;
                        View view95 = view61;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                        view10 = view95;
                        i27 = i28;
                        m25662 = (C2105.m6981("ۗۨ") + i65) * (-65);
                        i17 = ((m25662 ^ i64) * 24551) ^ 1368010767;
                        i18 = 1965557744;
                        i26 = i27;
                        i21 = m25662 ^ i18;
                        i70 = i16;
                        view65 = view9;
                        view66 = view8;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view58 = view3;
                        animatorSet8 = animatorSet2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        str30 = m2128;
                        i74 = i26;
                        i68 = i17;
                        str27 = str5;
                        view59 = view11;
                        view57 = view;
                        view62 = view13;
                        i71 = i8;
                        View view96 = view15;
                        i73 = i15;
                        j10 = j2;
                        i67 = i21;
                        str29 = str7;
                        view63 = view96;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222222222;
                    }
                case -830331564:
                case 2132256692:
                    j7 = j10;
                    view44 = view59;
                    view45 = view65;
                    view46 = view66;
                    view47 = view63;
                    i54 = i71;
                    view48 = view62;
                    viewParent7 = viewParent9;
                    str19 = str27;
                    objectAnimator7 = objectAnimator16;
                    view49 = view60;
                    i55 = i70;
                    fArr7 = fArr10;
                    String str42 = str30;
                    view50 = view58;
                    str20 = str42;
                    view64 = C4117.m12361((ViewGroup) view2, i69);
                    animatorSet8 = new AnimatorSet();
                    float[] fArr20 = new float[i69];
                    // fill-array-data instruction
                    fArr20[0] = 1.0f;
                    fArr20[1] = 0.0f;
                    objectAnimator10 = C5695.m16025(view45, str20, fArr20);
                    float[] fArr21 = new float[i69];
                    // fill-array-data instruction
                    fArr21[0] = 90.0f;
                    fArr21[1] = 0.0f;
                    if (C0714.f2697 >= 0) {
                        fArr11 = fArr21;
                        int m2566112 = (C0630.m2566("۟᩵") ^ i64) * 89;
                        String str382 = str20;
                        int i852 = ((m2566112 ^ i65) * 18233) ^ 1959962710;
                        view63 = view47;
                        view66 = view46;
                        i70 = i55;
                        fArr10 = fArr7;
                        objectAnimator16 = objectAnimator7;
                        view60 = view49;
                        viewParent9 = viewParent7;
                        j10 = j7;
                        i67 = m2566112 ^ (-1242488956);
                        str27 = str19;
                        view59 = view44;
                        view62 = view48;
                        i71 = i54;
                        View view832 = view45;
                        i68 = i852;
                        view58 = view50;
                        str30 = str382;
                        view65 = view832;
                    } else {
                        int m256615 = C0630.m2566("᩷֡") ^ i65;
                        i68 = ((m256615 ^ i64) * 29109) ^ (-1727363596);
                        view63 = view47;
                        i70 = i55;
                        fArr11 = fArr21;
                        fArr10 = fArr7;
                        objectAnimator16 = objectAnimator7;
                        view60 = view49;
                        viewParent9 = viewParent7;
                        view59 = view44;
                        str27 = str19;
                        view62 = view48;
                        i71 = i54;
                        j8 = j7;
                        i67 = m256615 ^ 676978483;
                        view58 = view50;
                        str30 = str20;
                        view65 = view45;
                        view66 = view46;
                        j10 = j8;
                    }
                case -732900232:
                case 1475402137:
                    view3 = view58;
                    j2 = j10;
                    view11 = view59;
                    i15 = i73;
                    view15 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    int i88 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str7 = str29;
                    animatorSet2 = animatorSet8;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    View view97 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view97;
                    i72 = C0630.m2566(str25) ^ 2123899719;
                    m2128 = C0483.m2128(f33561, 479, 5, i16);
                    sArr3 = f33561;
                    i27 = i88;
                    if (C1005.f3721) {
                        m25662 = (i64 - C0630.m2566("᩶᩺")) * (-117);
                        i17 = ((m25662 ^ i65) * (-7973)) ^ (-774546691);
                        i18 = 1172806561;
                        i26 = i88;
                        i21 = m25662 ^ i18;
                        i70 = i16;
                        view65 = view9;
                        view66 = view8;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view58 = view3;
                        animatorSet8 = animatorSet2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        str30 = m2128;
                        i74 = i26;
                        i68 = i17;
                        str27 = str5;
                        view59 = view11;
                        view57 = view;
                        view62 = view13;
                        i71 = i8;
                        View view962 = view15;
                        i73 = i15;
                        j10 = j2;
                        i67 = i21;
                        str29 = str7;
                        view63 = view962;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222222222;
                    }
                    m25662 = (C2105.m6981("ۗۨ") + i65) * (-65);
                    i17 = ((m25662 ^ i64) * 24551) ^ 1368010767;
                    i18 = 1965557744;
                    i26 = i27;
                    i21 = m25662 ^ i18;
                    i70 = i16;
                    view65 = view9;
                    view66 = view8;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view58 = view3;
                    animatorSet8 = animatorSet2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    str30 = m2128;
                    i74 = i26;
                    i68 = i17;
                    str27 = str5;
                    view59 = view11;
                    view57 = view;
                    view62 = view13;
                    i71 = i8;
                    View view9622 = view15;
                    i73 = i15;
                    j10 = j2;
                    i67 = i21;
                    str29 = str7;
                    view63 = view9622;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222222222;
                case -722868371:
                case 1386957274:
                    j5 = j10;
                    view31 = view59;
                    i41 = i73;
                    AnimatorSet animatorSet11 = animatorSet8;
                    View view98 = view63;
                    i42 = i71;
                    view33 = view62;
                    viewParent5 = viewParent9;
                    i43 = i74;
                    str16 = str27;
                    objectAnimator5 = objectAnimator16;
                    str14 = str29;
                    View view99 = view66;
                    view35 = view60;
                    i44 = i70;
                    fArr5 = fArr10;
                    view32 = view65;
                    str15 = str30;
                    view34 = view58;
                    View view100 = view61;
                    textureViewSurfaceTextureListenerC221603 = textureViewSurfaceTextureListenerC221604;
                    view36 = view100;
                    C1128.m3853(view98, z2 ? 1 : 0);
                    m12361 = view98;
                    animatorSet7 = animatorSet11;
                    view37 = view99;
                    m25666 = C2105.m6981("ۨᩳ") ^ i64;
                    i45 = ((m25666 ^ i65) * 14993) ^ 276349662;
                    i46 = 2095668990;
                    int i89 = m25666 ^ i46;
                    i70 = i44;
                    fArr10 = fArr5;
                    objectAnimator16 = objectAnimator5;
                    animatorSet8 = animatorSet7;
                    view60 = view35;
                    viewParent9 = viewParent5;
                    view59 = view31;
                    i74 = i43;
                    i68 = i45;
                    str29 = str14;
                    str27 = str16;
                    view63 = m12361;
                    view62 = view33;
                    view58 = view34;
                    i71 = i42;
                    str30 = str15;
                    view65 = view32;
                    view66 = view37;
                    i73 = i41;
                    long j13 = j5;
                    i67 = i89;
                    j10 = j13;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221607 = textureViewSurfaceTextureListenerC221603;
                    view61 = view36;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221607;
                case -700159791:
                case 1267748750:
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    AnimatorSet animatorSet12 = animatorSet8;
                    View view101 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    view8 = view66;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view102 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view102;
                    window.setWindowAnimations(z2 ? 1 : 0);
                    view12 = view101;
                    animatorSet = animatorSet12;
                    m6981 = C0630.m2566("ܰᩴ") ^ i65;
                    i10 = ((m6981 ^ i64) * (-7099)) ^ 836298944;
                    i22 = -1587991367;
                    i12 = m6981 ^ i22;
                    i70 = i16;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i86222222222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i86222222222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222222222222;
                case -651480381:
                case 328825928:
                    break;
                case -144919019:
                case 339394890:
                    long j14 = j10;
                    view11 = view59;
                    int i90 = i73;
                    animatorSet3 = animatorSet8;
                    View view103 = view63;
                    int i91 = i71;
                    View view104 = view62;
                    ViewParent viewParent12 = viewParent9;
                    int i92 = i74;
                    String str43 = str27;
                    ObjectAnimator objectAnimator20 = objectAnimator16;
                    String str44 = str29;
                    view8 = view66;
                    View view105 = view60;
                    int i93 = i70;
                    float[] fArr22 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    View view106 = view58;
                    View view107 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view107;
                    if (i90 == (C0630.m2566(C4117.m12355(f33561, 581, 3, i93)) ^ 2128540572)) {
                        m25667 = (i65 - C0630.m2566("ܺۚ")) * (-61);
                        i47 = ((m25667 ^ i64) * (-7283)) ^ (-806452817);
                        i48 = 1345562825;
                    } else {
                        m25667 = (i65 - C0630.m2566("ܳۖ")) * (-21);
                        i47 = ((m25667 ^ i64) * 14889) ^ 1167524020;
                        i48 = -270857089;
                    }
                    int i94 = m25667 ^ i48;
                    i74 = i92;
                    i68 = i47;
                    i70 = i93;
                    str29 = str44;
                    fArr10 = fArr22;
                    objectAnimator16 = objectAnimator20;
                    view60 = view105;
                    viewParent9 = viewParent12;
                    view63 = view103;
                    str27 = str43;
                    i73 = i90;
                    view62 = view104;
                    j10 = j14;
                    i67 = i94;
                    i71 = i91;
                    view58 = view106;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet3;
                    view59 = view11;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160522222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160522222;
                case -141537446:
                case 443033630:
                    C3911.m11926(runnable);
                    break;
                case 240263923:
                case 1376312660:
                    j2 = j10;
                    view11 = view59;
                    animatorSet3 = animatorSet8;
                    view16 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    view8 = view66;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view108 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view108;
                    str6 = str29;
                    i7 = i73;
                    if (i7 == (C2105.m6981(C4616.m13542(f33561, 584, 3, i16)) ^ 2128524665)) {
                        m69812 = (C2105.m6981("֡ܳ") ^ i64) * (-47);
                        i23 = ((m69812 ^ i65) * (-21093)) ^ 1358463097;
                        i24 = 1101597286;
                        int i832 = m69812 ^ i24;
                        i74 = i4;
                        i73 = i7;
                        i70 = i16;
                        i68 = i23;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view63 = view16;
                        str27 = str5;
                        j10 = j2;
                        i67 = i832;
                        view62 = view13;
                        view58 = view3;
                        i71 = i8;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet3;
                        view59 = view11;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221605222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221605222222;
                    } else {
                        view12 = view16;
                        animatorSet = animatorSet3;
                        m6981 = (C0630.m2566("֡֨") + i64) * 73;
                        i10 = ((m6981 ^ i65) * 26739) ^ 1342427456;
                        i22 = 2109777197;
                        i12 = m6981 ^ i22;
                        i70 = i16;
                        str29 = str6;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        view59 = view11;
                        view63 = view12;
                        str27 = str5;
                        i73 = i7;
                        view62 = view13;
                        j10 = j2;
                        i67 = i12;
                        i71 = i8;
                        view57 = view;
                        int i862222222222222 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i862222222222222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222222222222;
                    }
                case 523472740:
                case 1853242319:
                    view56 = view60;
                    str23 = str27;
                    fArr9 = fArr10;
                    String str45 = str30;
                    view55 = view58;
                    str24 = str45;
                    ObjectAnimator objectAnimator21 = c11182.f33565;
                    if (objectAnimator21 != null) {
                        int m256616 = (i65 - C0630.m2566("ܰۖ")) * (-91);
                        int i95 = ((m256616 ^ i64) * (-27865)) ^ (-1649347626);
                        i67 = m256616 ^ (-1249561108);
                        objectAnimator12 = objectAnimator21;
                        str27 = str23;
                        i68 = i95;
                        fArr10 = fArr9;
                        view60 = view56;
                        View view812222 = view55;
                        str30 = str24;
                        view58 = view812222;
                    } else {
                        objectAnimator12 = objectAnimator21;
                        m69814 = (C2105.m6981("ᩴۨ") ^ i65) * 27;
                        view54 = view56;
                        i60 = ((m69814 ^ i64) * (-25409)) ^ 881123075;
                        i61 = -1664144039;
                        i67 = m69814 ^ i61;
                        fArr10 = fArr9;
                        view60 = view54;
                        str27 = str23;
                        i68 = i60;
                        View view8122222 = view55;
                        str30 = str24;
                        view58 = view8122222;
                    }
                case 527955428:
                case 1075966812:
                    j3 = j10;
                    view17 = view59;
                    i29 = i73;
                    view18 = view63;
                    i30 = i71;
                    view19 = view62;
                    viewParent3 = viewParent9;
                    i31 = i74;
                    str8 = str27;
                    objectAnimator3 = objectAnimator16;
                    str9 = str29;
                    animatorSet5 = animatorSet8;
                    view20 = view60;
                    i32 = i70;
                    fArr3 = fArr10;
                    view21 = view66;
                    view22 = view65;
                    str10 = str30;
                    view23 = view58;
                    View view109 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view109;
                    if (i29 == (C2105.m6981(C21923.m49334(f33561, 510, 3, i32)) ^ 2102143674)) {
                        m25664 = C2105.m6981("ܶ᩸") ^ i65;
                        i33 = ((m25664 ^ i64) * (-28437)) ^ 657491344;
                        i34 = -892741936;
                    } else {
                        m25664 = (i64 - C0630.m2566("ܶ۠")) * (-49);
                        i33 = ((m25664 ^ i65) * 3135) ^ 1789097974;
                        i34 = -1172962709;
                    }
                    int i822 = m25664 ^ i34;
                    i70 = i32;
                    fArr10 = fArr3;
                    objectAnimator16 = objectAnimator3;
                    view58 = view23;
                    view60 = view20;
                    viewParent9 = viewParent3;
                    view59 = view17;
                    str30 = str10;
                    view65 = view22;
                    view66 = view21;
                    str27 = str8;
                    animatorSet8 = animatorSet5;
                    i74 = i31;
                    i68 = i33;
                    str29 = str9;
                    view62 = view19;
                    i71 = i30;
                    view63 = view18;
                    i73 = i29;
                    j10 = j3;
                    i67 = i822;
                    view57 = view;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216052222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216052222222;
                case 588009227:
                case 848911823:
                    j = j10;
                    view4 = view59;
                    i = i72;
                    view5 = view63;
                    i3 = i71;
                    view7 = view62;
                    viewParent = viewParent9;
                    i4 = i74;
                    str2 = str27;
                    objectAnimator = objectAnimator16;
                    str3 = str29;
                    animatorSet = animatorSet8;
                    view6 = view60;
                    i5 = i70;
                    sArr = sArr3;
                    fArr = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view110 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view110;
                    RunnableC0588.m2430(view2, C11340.m28025(f33561, 472, 4, i5));
                    i2 = C0798.m3006(view2);
                    str25 = C0798.m3005(f33561, 476, 3, i5);
                    if (!C2167.m7155()) {
                        i14 = (C0630.m2566("ۘܺ") ^ i65) * 83;
                        i10 = ((i14 ^ i64) * 27427) ^ (-1533833863);
                        i13 = 1957727046;
                        i70 = i5;
                        sArr3 = sArr;
                        str29 = str3;
                        fArr10 = fArr;
                        objectAnimator16 = objectAnimator;
                        view60 = view6;
                        viewParent9 = viewParent;
                        j10 = j;
                        i67 = i14 ^ i13;
                        view63 = view5;
                        str27 = str2;
                        view57 = view;
                        i73 = i2;
                        view62 = view7;
                        i71 = i3;
                        i72 = i;
                        view59 = view4;
                        int i8622222222222222 = i4;
                        i68 = i10;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        animatorSet8 = animatorSet;
                        i74 = i8622222222222222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222222222222;
                    }
                    i14 = C2105.m6981("ܺܽ") ^ i65;
                    i10 = ((i14 ^ i64) * (-32733)) ^ (-652601973);
                    i13 = -185237996;
                    i70 = i5;
                    sArr3 = sArr;
                    str29 = str3;
                    fArr10 = fArr;
                    objectAnimator16 = objectAnimator;
                    view60 = view6;
                    viewParent9 = viewParent;
                    j10 = j;
                    i67 = i14 ^ i13;
                    view63 = view5;
                    str27 = str2;
                    view57 = view;
                    i73 = i2;
                    view62 = view7;
                    i71 = i3;
                    i72 = i;
                    view59 = view4;
                    int i86222222222222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i86222222222222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222222222222222;
                case 764705867:
                case 1050498301:
                    j2 = j10;
                    view11 = view59;
                    animatorSet4 = animatorSet8;
                    View view111 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    view8 = view66;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    C0964.m3404(view2, view2);
                    boolean z3 = i74;
                    textureViewSurfaceTextureListenerC221604.m49796(z3);
                    view61 = C4117.m12361((ViewGroup) view2, i69);
                    float m28026 = C11340.m28026(view111);
                    float[] fArr23 = new float[i69];
                    fArr23[z2 ? 1 : 0] = 0.0f;
                    fArr23[z3 ? 1 : 0] = m28026;
                    objectAnimator15 = C2520.m8018(view111, str29, fArr23);
                    if (C4117.m12364() != 0) {
                        str7 = str29;
                        animatorSet2 = animatorSet4;
                        i15 = i73;
                        m2128 = str4;
                        view15 = view111;
                        i28 = z3;
                        View view952 = view61;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                        view10 = view952;
                        i27 = i28;
                        m25662 = (C2105.m6981("ۗۨ") + i65) * (-65);
                        i17 = ((m25662 ^ i64) * 24551) ^ 1368010767;
                        i18 = 1965557744;
                        i26 = i27;
                        i21 = m25662 ^ i18;
                        i70 = i16;
                        view65 = view9;
                        view66 = view8;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view58 = view3;
                        animatorSet8 = animatorSet2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        str30 = m2128;
                        i74 = i26;
                        i68 = i17;
                        str27 = str5;
                        view59 = view11;
                        view57 = view;
                        view62 = view13;
                        i71 = i8;
                        View view96222 = view15;
                        i73 = i15;
                        j10 = j2;
                        i67 = i21;
                        str29 = str7;
                        view63 = view96222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222222222222222;
                    } else {
                        int m698112 = (C2105.m6981("ۜܽ") ^ i64) * 109;
                        int i96 = ((m698112 ^ i65) * (-30253)) ^ 2023029984;
                        i25 = m698112 ^ (-293533433);
                        i74 = z3 ? 1 : 0;
                        view63 = view111;
                        i68 = i96;
                        i70 = i16;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        j10 = j2;
                        i67 = i25;
                        str27 = str5;
                        view58 = view3;
                        str30 = str4;
                        view65 = view9;
                        view66 = view8;
                        view62 = view13;
                        i71 = i8;
                        animatorSet8 = animatorSet4;
                        view59 = view11;
                    }
                case 764811899:
                case 2030822476:
                    j2 = j10;
                    view11 = view59;
                    i6 = i72;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i9 = i70;
                    sArr2 = sArr3;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view112 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view112;
                    int i97 = s + 1;
                    if ((i97 * i97) - ((s * 2) + 1) < 0) {
                        m2566 = (i65 - C0630.m2566("۬ܽ")) * (-53);
                        i10 = ((m2566 ^ i64) * (-12415)) ^ (-1967631914);
                        i11 = -20585291;
                    } else {
                        m2566 = C2105.m6981("ۙܿ") ^ i65;
                        i10 = ((m2566 ^ i64) * 17889) ^ 297566131;
                        i11 = -1849892250;
                    }
                    i12 = m2566 ^ i11;
                    i70 = i9;
                    sArr3 = sArr2;
                    i72 = i6;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i862222222222222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i862222222222222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222222222222222;
                case 934506664:
                case 2123595678:
                    ObjectAnimator m160254 = C5695.m16025(view64, str28, fArr11);
                    Animator[] animatorArr = new Animator[i69];
                    animatorArr[z2 ? 1 : 0] = objectAnimator10;
                    animatorArr[i74] = m160254;
                    AnimatorSet animatorSet13 = animatorSet8;
                    animatorSet13.playTogether(animatorArr);
                    animatorSet13.addListener(new C2009(view66, view65, view63, c11182));
                    animatorSet13.start();
                    break;
                case 1108829319:
                case 1487727495:
                    View view113 = view60;
                    String str46 = str27;
                    String str47 = str30;
                    View view114 = view58;
                    str21 = str47;
                    objectAnimator11.cancel();
                    fArr8 = fArr10;
                    view52 = view113;
                    j9 = j10;
                    objectAnimator9 = objectAnimator11;
                    i58 = i71;
                    view51 = view62;
                    viewParent8 = viewParent9;
                    view53 = view114;
                    str22 = str46;
                    objectAnimator8 = objectAnimator16;
                    i59 = i70;
                    int m6981112 = (i65 - C2105.m6981("ۚ֡")) * 13;
                    str30 = str21;
                    i70 = i59;
                    view58 = view53;
                    fArr10 = fArr8;
                    objectAnimator16 = objectAnimator8;
                    view60 = view52;
                    viewParent9 = viewParent8;
                    objectAnimator11 = objectAnimator9;
                    str27 = str22;
                    view62 = view51;
                    i71 = i58;
                    j8 = j9;
                    i67 = m6981112 ^ 1996638020;
                    i68 = ((m6981112 ^ i64) * 10097) ^ (-1271723732);
                    j10 = j8;
                case 1138740520:
                case 2129070463:
                    j3 = j10;
                    view17 = view59;
                    i29 = i73;
                    view18 = view63;
                    i30 = i71;
                    view19 = view62;
                    viewParent3 = viewParent9;
                    i31 = i74;
                    str8 = str27;
                    objectAnimator3 = objectAnimator16;
                    str9 = str29;
                    animatorSet5 = animatorSet8;
                    view20 = view60;
                    i32 = i70;
                    fArr3 = fArr10;
                    view21 = view66;
                    view22 = view65;
                    str10 = str30;
                    view23 = view58;
                    View view115 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view115;
                    if (i29 == (C2105.m6981(AbstractC2021.m6573(f33561, 507, 3, i32)) ^ 2098676438)) {
                        m25664 = (C0630.m2566("᩷۬") + i64) * 71;
                        i33 = ((m25664 ^ i65) * 26787) ^ 2038366238;
                        i34 = -1528368705;
                    } else {
                        m25664 = C0630.m2566("۠ܺ") ^ i65;
                        i33 = ((m25664 ^ i64) * (-25241)) ^ 519149278;
                        i34 = 1237234457;
                    }
                    int i8222 = m25664 ^ i34;
                    i70 = i32;
                    fArr10 = fArr3;
                    objectAnimator16 = objectAnimator3;
                    view58 = view23;
                    view60 = view20;
                    viewParent9 = viewParent3;
                    view59 = view17;
                    str30 = str10;
                    view65 = view22;
                    view66 = view21;
                    str27 = str8;
                    animatorSet8 = animatorSet5;
                    i74 = i31;
                    i68 = i33;
                    str29 = str9;
                    view62 = view19;
                    i71 = i30;
                    view63 = view18;
                    i73 = i29;
                    j10 = j3;
                    i67 = i8222;
                    view57 = view;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160522222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160522222222;
                case 1219558156:
                case 1875483915:
                    C22628.m50608(abstractActivityC3346, C23986.m52810(C3172.m9730()));
                    break;
                case 1237205687:
                case 2024328044:
                    j5 = j10;
                    str14 = str29;
                    view31 = view59;
                    i41 = i73;
                    view32 = view65;
                    i42 = i71;
                    view33 = view62;
                    viewParent5 = viewParent9;
                    str15 = str30;
                    i43 = i74;
                    str16 = str27;
                    view34 = view58;
                    objectAnimator5 = objectAnimator16;
                    view35 = view60;
                    i44 = i70;
                    fArr5 = fArr10;
                    View view116 = view61;
                    textureViewSurfaceTextureListenerC221603 = textureViewSurfaceTextureListenerC221604;
                    view36 = view116;
                    View m35072 = C1005.m3507(view57, C2105.m6981(str26) ^ 2129687020);
                    ViewParent parent4 = view2.getParent();
                    view37 = m35072;
                    animatorSet7 = animatorSet8;
                    C11233.m27800((Object) parent4, C0422.m1955(f33561, 522, 59, i44));
                    m12361 = C4117.m12361((ViewGroup) parent4, i43);
                    C2167.m7151(m12361);
                    if (m12361.getVisibility() == 8) {
                        m25666 = (C0630.m2566("ۢ᩶") ^ i65) * (-71);
                        i45 = ((m25666 ^ i64) * (-21237)) ^ 363987187;
                        i46 = -1131731775;
                        int i892 = m25666 ^ i46;
                        i70 = i44;
                        fArr10 = fArr5;
                        objectAnimator16 = objectAnimator5;
                        animatorSet8 = animatorSet7;
                        view60 = view35;
                        viewParent9 = viewParent5;
                        view59 = view31;
                        i74 = i43;
                        i68 = i45;
                        str29 = str14;
                        str27 = str16;
                        view63 = m12361;
                        view62 = view33;
                        view58 = view34;
                        i71 = i42;
                        str30 = str15;
                        view65 = view32;
                        view66 = view37;
                        i73 = i41;
                        long j132 = j5;
                        i67 = i892;
                        j10 = j132;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216072 = textureViewSurfaceTextureListenerC221603;
                        view61 = view36;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216072;
                    }
                    m25666 = C2105.m6981("ۨᩳ") ^ i64;
                    i45 = ((m25666 ^ i65) * 14993) ^ 276349662;
                    i46 = 2095668990;
                    int i8922 = m25666 ^ i46;
                    i70 = i44;
                    fArr10 = fArr5;
                    objectAnimator16 = objectAnimator5;
                    animatorSet8 = animatorSet7;
                    view60 = view35;
                    viewParent9 = viewParent5;
                    view59 = view31;
                    i74 = i43;
                    i68 = i45;
                    str29 = str14;
                    str27 = str16;
                    view63 = m12361;
                    view62 = view33;
                    view58 = view34;
                    i71 = i42;
                    str30 = str15;
                    view65 = view32;
                    view66 = view37;
                    i73 = i41;
                    long j1322 = j5;
                    i67 = i8922;
                    j10 = j1322;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160722 = textureViewSurfaceTextureListenerC221603;
                    view61 = view36;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160722;
                case 1305122982:
                case 1754393805:
                    j2 = j10;
                    View view117 = view59;
                    i15 = i73;
                    view15 = view63;
                    i8 = i71;
                    View view118 = view62;
                    ViewParent viewParent13 = viewParent9;
                    int i98 = i74;
                    String str48 = str27;
                    ObjectAnimator objectAnimator22 = objectAnimator16;
                    str7 = str29;
                    AnimatorSet animatorSet14 = animatorSet8;
                    View view119 = view60;
                    int i99 = i70;
                    float[] fArr24 = fArr10;
                    View view120 = view66;
                    View view121 = view65;
                    String str49 = str30;
                    View view122 = view58;
                    View view123 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view123;
                    Runnable runnable2 = new Runnable() { // from class: l.᩵ۘۡ
                        {
                            int i100 = -226960039;
                            int i101 = C3911.f12484;
                            int i102 = C4117.f13076;
                            int m698113 = C2105.m6981("ۧۖ") ^ i102;
                            int i103 = ((m698113 ^ i101) * 8633) ^ 1990705383;
                            int i104 = -1371275260;
                            while (true) {
                                i100 = ((((i100 ^ i101) * 667) >> 31) & i103) ^ (m698113 ^ i104);
                                switch (i100) {
                                    case -2112545392:
                                    case 1637109486:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m698113 = C2105.m6981("ܺ۠") ^ i101;
                                            i103 = ((m698113 ^ i102) * 5109) ^ 1612917104;
                                            i104 = 1344405479;
                                        } else {
                                            m698113 = (C0630.m2566("ᩴۗ") + i102) * 127;
                                            i103 = ((m698113 ^ i101) * (-30499)) ^ (-428923216);
                                            i104 = -701792283;
                                        }
                                    case -1619542188:
                                    case 1030880041:
                                        if (C4616.f14690 <= 0) {
                                            m698113 = C0630.m2566("۠᩶") ^ i102;
                                            i103 = ((m698113 ^ i101) * 8345) ^ (-1620621233);
                                            i104 = -1293574234;
                                        } else {
                                            m698113 = (i101 - C2105.m6981("ۚܰ")) * 25;
                                            i103 = ((m698113 ^ i102) * 1695) ^ 420323177;
                                            i104 = 883815344;
                                        }
                                    case -1600365817:
                                    case 1705355647:
                                        if (C4159.f13567) {
                                            m698113 = C0630.m2566("ۨᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-11025)) ^ (-61766876);
                                            i104 = -93054314;
                                        } else {
                                            m698113 = (C0630.m2566("ᩴܿ") + i102) * 93;
                                            i103 = ((m698113 ^ i101) * 23841) ^ (-52966733);
                                            i104 = 1520178524;
                                        }
                                    case -1396870982:
                                    case 1653583529:
                                        if (C3432.f10845 >= 0) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = C0630.m2566("۫֡") ^ i102;
                                            i103 = ((m698113 ^ i101) * 3675) ^ 1883335349;
                                            i104 = 237897012;
                                        }
                                    case -1249687846:
                                    case -755651146:
                                        C1128.m3851();
                                        if (C4159.f13567) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = C2105.m6981("ܺ۠") ^ i101;
                                            i103 = ((m698113 ^ i102) * 5109) ^ 1612917104;
                                            i104 = 1344405479;
                                        }
                                    case -1228783852:
                                    case 1809692672:
                                        if (C0798.f2919) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = (C2105.m6981("֫᩵") ^ i101) * (-107);
                                            i103 = ((m698113 ^ i102) * (-32339)) ^ 624376183;
                                            i104 = 956983163;
                                        }
                                    case -1196116521:
                                    case 1834791422:
                                        return;
                                    case -1116009285:
                                    case 1203119824:
                                        C0237.m1481();
                                        throw new RuntimeException();
                                    case -654345348:
                                    case 1491551109:
                                        if (C0630.m2564()) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = C2105.m6981("᩵֨") ^ i101;
                                            i103 = ((m698113 ^ i102) * (-15195)) ^ (-389982992);
                                            i104 = -1332393401;
                                        }
                                    case -642346861:
                                    case 466928724:
                                        if (C1047.m3599() >= 0) {
                                            m698113 = C2105.m6981("ܺ۠") ^ i101;
                                            i103 = ((m698113 ^ i102) * 5109) ^ 1612917104;
                                            i104 = 1344405479;
                                        } else {
                                            m698113 = (C0630.m2566("֨ۚ") ^ i101) * (-75);
                                            i103 = ((m698113 ^ i102) * 16285) ^ (-695704676);
                                            i104 = -70738028;
                                        }
                                    case -466818409:
                                    case -386166180:
                                        C4117.m12364();
                                        if (C3019.m9255() <= 0) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = (C0630.m2566("ᩴܿ") + i102) * 93;
                                            i103 = ((m698113 ^ i101) * 23841) ^ (-52966733);
                                            i104 = 1520178524;
                                        }
                                    case -124959124:
                                    case 1260736990:
                                        if (C3663.m11168() >= 0) {
                                            m698113 = (C0630.m2566("ᩴܿ") + i102) * 93;
                                            i103 = ((m698113 ^ i101) * 23841) ^ (-52966733);
                                            i104 = 1520178524;
                                        } else {
                                            m698113 = C2105.m6981("ۨᩴ") ^ i101;
                                            i103 = ((m698113 ^ i102) * (-26989)) ^ 1194936548;
                                            i104 = -2022205321;
                                        }
                                    case 652131024:
                                    case 1748265969:
                                        if (C0382.f1805) {
                                            m698113 = (C0630.m2566("᩶᩶") ^ i102) * 57;
                                            i103 = ((m698113 ^ i101) * 22377) ^ (-116790025);
                                            i104 = 1851306438;
                                        } else {
                                            m698113 = (C0630.m2566("ᩴܿ") + i102) * 93;
                                            i103 = ((m698113 ^ i101) * 23841) ^ (-52966733);
                                            i104 = 1520178524;
                                        }
                                    case 899934153:
                                    case 2019696215:
                                        C0237.m1481();
                                        m698113 = (C2105.m6981("֫᩵") ^ i101) * (-107);
                                        i103 = ((m698113 ^ i102) * (-32339)) ^ 624376183;
                                        i104 = 956983163;
                                    case 1450530177:
                                    case 1899248372:
                                        if (C1128.m3851() <= 0) {
                                            m698113 = (C2105.m6981("֫᩵") ^ i101) * (-107);
                                            i103 = ((m698113 ^ i102) * (-32339)) ^ 624376183;
                                            i104 = 956983163;
                                        } else {
                                            m698113 = (C2105.m6981("ۤۤ") ^ i102) * 3;
                                            i103 = ((m698113 ^ i101) * 4093) ^ 310292497;
                                            i104 = 1031322297;
                                        }
                                    default:
                                        if (C7106.f21815 != 0) {
                                            m698113 = C2105.m6981("ᩴᩳ") ^ i102;
                                            i103 = ((m698113 ^ i101) * (-2533)) ^ (-1120837631);
                                            i104 = 1667838737;
                                        } else {
                                            m698113 = C2105.m6981("ۢܶ") ^ i101;
                                            i103 = ((m698113 ^ i102) * (-29411)) ^ (-1519320209);
                                            i104 = -1898475152;
                                        }
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogInterfaceC0206 dialogInterfaceC02062 = null;
                            int i100 = 1564946397;
                            int i101 = C0422.f1886;
                            int i102 = C2520.f8000;
                            int m256617 = (C0630.m2566("᩵۫") ^ i101) * (-75);
                            int i103 = ((m256617 ^ i102) * 10681) ^ 512742090;
                            int i104 = -579851221;
                            while (true) {
                                i100 = ((((i100 ^ i102) * 26815) >> 31) & i103) ^ (m256617 ^ i104);
                                switch (i100) {
                                    case -1994185684:
                                    case -1114833688:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m256617 = C2105.m6981("ܺܳ") ^ i102;
                                            i103 = ((m256617 ^ i101) * (-30841)) ^ 1574189940;
                                            i104 = -1387173452;
                                        } else {
                                            m256617 = (i102 - C2105.m6981("ۚۛ")) * (-111);
                                            i103 = ((m256617 ^ i101) * (-31199)) ^ (-896284990);
                                            i104 = 1410726734;
                                        }
                                    case -1633882230:
                                    case 427533178:
                                        if (C4616.f14690 <= 0) {
                                            m256617 = (C2105.m6981("᩶ۙ") ^ i101) * 49;
                                            i103 = ((m256617 ^ i102) * (-19323)) ^ (-2078669165);
                                            i104 = -1482528083;
                                        } else {
                                            m256617 = (i101 - C0630.m2566("᩶۟")) * 57;
                                            i103 = ((m256617 ^ i102) * 26725) ^ 1231628344;
                                            i104 = 42638132;
                                        }
                                    case -1631235045:
                                    case -381059578:
                                        if (C3746.f11829 > 0) {
                                            m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                            i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                            i104 = 500638931;
                                        } else {
                                            m256617 = C2105.m6981("ܺܳ") ^ i102;
                                            i103 = ((m256617 ^ i101) * (-30841)) ^ 1574189940;
                                            i104 = -1387173452;
                                        }
                                    case -1459620729:
                                    case -1078048885:
                                        C1504.m5172(dialogInterfaceC02062);
                                        if (C0382.f1805) {
                                            m256617 = C0630.m2566("᩶۠") ^ i102;
                                            i103 = ((m256617 ^ i101) * 27485) ^ (-1957413790);
                                            i104 = -1049592537;
                                        } else {
                                            m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                            i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                            i104 = 500638931;
                                        }
                                    case -779487923:
                                    case 670683021:
                                        if (C3663.m11168() >= 0) {
                                            m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                            i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                            i104 = 500638931;
                                        } else {
                                            m256617 = C2105.m6981("ۧۢ") ^ i101;
                                            i103 = ((m256617 ^ i102) * (-23153)) ^ (-1758128811);
                                            i104 = -77362566;
                                        }
                                    case -477620832:
                                    case 1636789927:
                                        if (C1420.f5096 <= 0) {
                                            m256617 = C2105.m6981("ۨ᩸") ^ i101;
                                            i103 = ((m256617 ^ i102) * 4955) ^ (-1076542288);
                                            i104 = 455949025;
                                        } else {
                                            m256617 = C0630.m2566("᩺֨") ^ i102;
                                            i103 = ((m256617 ^ i101) * (-14087)) ^ 319200428;
                                            i104 = -315221747;
                                        }
                                    case -10267705:
                                    case 63342960:
                                        C2126.m7040();
                                        if (C7811.m20844() != 0) {
                                            m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                            i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                            i104 = 500638931;
                                        } else {
                                            m256617 = (i102 - C2105.m6981("ܽۧ")) * 45;
                                            i103 = ((m256617 ^ i101) * 20755) ^ (-1771777436);
                                            i104 = 353098457;
                                        }
                                    case 189009400:
                                    case 1720838967:
                                        if (C5695.f17556 >= 0) {
                                            m256617 = (i102 - C2105.m6981("ܽۧ")) * 45;
                                            i103 = ((m256617 ^ i101) * 20755) ^ (-1771777436);
                                            i104 = 353098457;
                                        } else {
                                            m256617 = C0630.m2566("۠᩶") ^ i101;
                                            i103 = ((m256617 ^ i102) * 19397) ^ (-25308269);
                                            i104 = 1484152746;
                                        }
                                    case 384673286:
                                    case 1083075294:
                                        C5695.m16023();
                                        C4159.m12565();
                                        break;
                                    case 545098657:
                                    case 1084093245:
                                        if (RunnableC1937.m6387() != 0) {
                                            m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                            i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                            i104 = 500638931;
                                        } else {
                                            m256617 = C2105.m6981("۠ۙ") ^ i101;
                                            i103 = ((m256617 ^ i102) * 16909) ^ (-91044944);
                                            i104 = -1487544461;
                                        }
                                    case 653608665:
                                    case 1602379097:
                                        RunnableC3474.m10630();
                                        C5695.m16023();
                                        m256617 = (i101 - C2105.m6981("ۚۚ")) * 21;
                                        i103 = ((m256617 ^ i102) * 3413) ^ (-399211251);
                                        i104 = 500638931;
                                    case 1255640665:
                                    case 1361215768:
                                        boolean z4 = z;
                                        if (C2272.f7362) {
                                            m256617 = (C2105.m6981("᩶ۙ") ^ i101) * 49;
                                            i103 = ((m256617 ^ i102) * (-19323)) ^ (-2078669165);
                                            i104 = -1482528083;
                                        } else {
                                            DialogInterfaceOnCancelListenerC6514 dialogInterfaceOnCancelListenerC6514 = new DialogInterfaceOnCancelListenerC6514(dialogInterfaceC02062, z4);
                                            if (C0964.f3626 == 0) {
                                                new ViewOnClickListenerC0059(abstractActivityC3346, dialogInterfaceOnCancelListenerC6514);
                                                break;
                                            }
                                            m256617 = C2105.m6981("ܺܳ") ^ i102;
                                            i103 = ((m256617 ^ i101) * (-30841)) ^ 1574189940;
                                            i104 = -1387173452;
                                        }
                                    case 1406166930:
                                    case 1675400239:
                                        C1420.m4913();
                                        if (C0630.f2410 > 0) {
                                            m256617 = (i102 - C2105.m6981("ܽۧ")) * 45;
                                            i103 = ((m256617 ^ i101) * 20755) ^ (-1771777436);
                                            i104 = 353098457;
                                        } else {
                                            m256617 = C2105.m6981("ۨ᩸") ^ i101;
                                            i103 = ((m256617 ^ i102) * 4955) ^ (-1076542288);
                                            i104 = 455949025;
                                        }
                                    default:
                                        dialogInterfaceC02062 = dialogInterfaceC0206;
                                        if (C22628.f73083 <= 0) {
                                            m256617 = (C2105.m6981("᩶ۙ") ^ i101) * 49;
                                            i103 = ((m256617 ^ i102) * (-19323)) ^ (-2078669165);
                                            i104 = -1482528083;
                                        } else {
                                            m256617 = C0630.m2566("ۡۙ") ^ i102;
                                            i103 = ((m256617 ^ i101) * (-745)) ^ (-906118117);
                                            i104 = 356056006;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    if (z) {
                        m25663 = (C2105.m6981("ۛۡ") ^ i64) * (-47);
                        i19 = ((m25663 ^ i65) * 4715) ^ 1804858235;
                        i20 = -738591060;
                    } else {
                        m25663 = C0630.m2566("۠ۗ") ^ i65;
                        i19 = ((m25663 ^ i64) * (-21899)) ^ (-542352202);
                        i20 = 969814930;
                    }
                    i21 = m25663 ^ i20;
                    runnable = runnable2;
                    i70 = i99;
                    fArr10 = fArr24;
                    objectAnimator16 = objectAnimator22;
                    view58 = view122;
                    view60 = view119;
                    viewParent9 = viewParent13;
                    view57 = view;
                    str30 = str49;
                    view65 = view121;
                    view66 = view120;
                    str27 = str48;
                    animatorSet8 = animatorSet14;
                    i74 = i98;
                    i68 = i19;
                    view62 = view118;
                    view59 = view117;
                    i71 = i8;
                    View view962222 = view15;
                    i73 = i15;
                    j10 = j2;
                    i67 = i21;
                    str29 = str7;
                    view63 = view962222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221606222222222222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221606222222222222222222222;
                case 1357317358:
                case 1357624070:
                    C0382.m1848();
                    m69815 = (C0630.m2566("֨ᩴ") + i64) * 57;
                    i68 = ((m69815 ^ i65) * (-1277)) ^ 1548286250;
                    i62 = 1394502480;
                    i67 = m69815 ^ i62;
                case 1382749074:
                case 1435075721:
                    AbstractC2021.m6574();
                    if (C3683.f11629 < 0) {
                        m69815 = (C2105.m6981("֨֡") + i65) * 5;
                        i68 = ((m69815 ^ i64) * 31601) ^ 1548801958;
                        i62 = 686213361;
                        i67 = m69815 ^ i62;
                    } else {
                        str23 = str27;
                        view54 = view60;
                        fArr9 = fArr10;
                        String str412 = str30;
                        view55 = view58;
                        str24 = str412;
                        m69814 = C0630.m2566("ۧ᩶") ^ i65;
                        i60 = ((m69814 ^ i64) * 8295) ^ 1341872653;
                        i61 = 182597713;
                        i67 = m69814 ^ i61;
                        fArr10 = fArr9;
                        view60 = view54;
                        str27 = str23;
                        i68 = i60;
                        View view81222222 = view55;
                        str30 = str24;
                        view58 = view81222222;
                    }
                case 1451735381:
                case 1768525227:
                    j6 = j10;
                    view11 = view59;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221608 = textureViewSurfaceTextureListenerC221604;
                    view10 = view61;
                    animatorSet3 = animatorSet8;
                    view38 = view63;
                    i49 = i71;
                    view39 = view62;
                    viewParent6 = viewParent9;
                    i50 = i74;
                    str17 = str27;
                    objectAnimator6 = objectAnimator16;
                    view40 = view66;
                    view41 = view60;
                    i51 = i70;
                    fArr6 = fArr10;
                    view42 = view65;
                    str18 = str30;
                    view43 = view58;
                    C4263.m12823(view2, null);
                    textureViewSurfaceTextureListenerC221608.m49796(z2);
                    if (view38.getTranslationY() == 0.0f) {
                        m25668 = (C0630.m2566("᩵ܺ") ^ i64) * 43;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221608;
                        i52 = ((m25668 ^ i65) * (-26207)) ^ 1590445404;
                        i53 = -1949992395;
                        int i752 = m25668 ^ i53;
                        i74 = i50;
                        view63 = view38;
                        i68 = i52;
                        i70 = i51;
                        fArr10 = fArr6;
                        objectAnimator16 = objectAnimator6;
                        view60 = view41;
                        viewParent9 = viewParent6;
                        j10 = j6;
                        i67 = i752;
                        str27 = str17;
                        view58 = view43;
                        str30 = str18;
                        view65 = view42;
                        view66 = view40;
                        view62 = view39;
                        i71 = i49;
                        animatorSet8 = animatorSet3;
                        view59 = view11;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC221605222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC221605222222222;
                    } else {
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221608;
                        m25668 = C0630.m2566("ܳ᩹") ^ i65;
                        i52 = ((m25668 ^ i64) * 7289) ^ 454998342;
                        i53 = -1739897259;
                        int i7522 = m25668 ^ i53;
                        i74 = i50;
                        view63 = view38;
                        i68 = i52;
                        i70 = i51;
                        fArr10 = fArr6;
                        objectAnimator16 = objectAnimator6;
                        view60 = view41;
                        viewParent9 = viewParent6;
                        j10 = j6;
                        i67 = i7522;
                        str27 = str17;
                        view58 = view43;
                        str30 = str18;
                        view65 = view42;
                        view66 = view40;
                        view62 = view39;
                        i71 = i49;
                        animatorSet8 = animatorSet3;
                        view59 = view11;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216052222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216052222222222;
                    }
                case 1546343065:
                case 2138303853:
                    if (C3683.f11629 >= 0) {
                        j2 = j10;
                        view11 = view59;
                        i15 = i73;
                        view15 = view63;
                        i8 = i71;
                        view13 = view62;
                        viewParent2 = viewParent9;
                        m2128 = str30;
                        i28 = i74;
                        str5 = str27;
                        view3 = view58;
                        objectAnimator2 = objectAnimator16;
                        str7 = str29;
                        animatorSet2 = animatorSet8;
                        view14 = view60;
                        i16 = i70;
                        fArr2 = fArr10;
                        view8 = view66;
                        view9 = view65;
                        View view9522 = view61;
                        textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                        view10 = view9522;
                        i27 = i28;
                        m25662 = (C2105.m6981("ۗۨ") + i65) * (-65);
                        i17 = ((m25662 ^ i64) * 24551) ^ 1368010767;
                        i18 = 1965557744;
                        i26 = i27;
                        i21 = m25662 ^ i18;
                        i70 = i16;
                        view65 = view9;
                        view66 = view8;
                        fArr10 = fArr2;
                        objectAnimator16 = objectAnimator2;
                        view58 = view3;
                        animatorSet8 = animatorSet2;
                        view60 = view14;
                        viewParent9 = viewParent2;
                        str30 = m2128;
                        i74 = i26;
                        i68 = i17;
                        str27 = str5;
                        view59 = view11;
                        view57 = view;
                        view62 = view13;
                        i71 = i8;
                        View view9622222 = view15;
                        i73 = i15;
                        j10 = j2;
                        i67 = i21;
                        str29 = str7;
                        view63 = view9622222;
                        TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC2216062222222222222222222222 = textureViewSurfaceTextureListenerC22160;
                        view61 = view10;
                        textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC2216062222222222222222222222;
                    } else {
                        m69815 = (C2105.m6981("֨֡") + i65) * 5;
                        i68 = ((m69815 ^ i64) * 31601) ^ 1548801958;
                        i62 = 686213361;
                        i67 = m69815 ^ i62;
                    }
                default:
                    ObjectAnimator m30082 = C0798.m3008(objectAnimator16, j10);
                    Animator[] animatorArr2 = new Animator[3];
                    animatorArr2[z2 ? 1 : 0] = objectAnimator13;
                    animatorArr2[c] = objectAnimator14;
                    animatorArr2[i69] = m30082;
                    animatorSet9.playTogether(animatorArr2);
                    animatorSet9.addListener(new C13569(view57, view58, c11182));
                    animatorSet9.start();
                    j2 = j10;
                    view11 = view59;
                    i7 = i73;
                    view12 = view63;
                    i8 = i71;
                    view13 = view62;
                    viewParent2 = viewParent9;
                    i4 = i74;
                    str5 = str27;
                    objectAnimator2 = objectAnimator16;
                    str6 = str29;
                    animatorSet = animatorSet8;
                    view14 = view60;
                    i16 = i70;
                    fArr2 = fArr10;
                    view8 = view66;
                    view9 = view65;
                    str4 = str30;
                    view3 = view58;
                    View view932 = view61;
                    textureViewSurfaceTextureListenerC22160 = textureViewSurfaceTextureListenerC221604;
                    view10 = view932;
                    m6981 = (C0630.m2566("֡֨") + i64) * 73;
                    i10 = ((m6981 ^ i65) * 26739) ^ 1342427456;
                    i22 = 2109777197;
                    i12 = m6981 ^ i22;
                    i70 = i16;
                    str29 = str6;
                    fArr10 = fArr2;
                    objectAnimator16 = objectAnimator2;
                    view60 = view14;
                    viewParent9 = viewParent2;
                    view59 = view11;
                    view63 = view12;
                    str27 = str5;
                    i73 = i7;
                    view62 = view13;
                    j10 = j2;
                    i67 = i12;
                    i71 = i8;
                    view57 = view;
                    int i8622222222222222222 = i4;
                    i68 = i10;
                    view58 = view3;
                    str30 = str4;
                    view65 = view9;
                    view66 = view8;
                    animatorSet8 = animatorSet;
                    i74 = i8622222222222222222;
                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160622222222222222222222222 = textureViewSurfaceTextureListenerC22160;
                    view61 = view10;
                    textureViewSurfaceTextureListenerC221604 = textureViewSurfaceTextureListenerC22160622222222222222222222222;
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27732(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object obj = null;
        int i2 = -1604397226;
        int i3 = C3432.f10845;
        int i4 = C11340.f33930;
        int m6981 = C2105.m6981("۠֡") ^ i3;
        int i5 = ((m6981 ^ i4) * (-18643)) ^ 813361266;
        int i6 = -1456939360;
        while (true) {
            i2 = ((((i2 ^ i4) * (-19415)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -1679625211:
                case 1796971138:
                    str = (String) C22628.m50605(list, i);
                    if (C1504.m5179()) {
                        m6981 = (i4 - C2105.m6981("۬۠")) * (-83);
                        i5 = ((m6981 ^ i3) * (-25285)) ^ (-17153859);
                        i6 = 1088111037;
                    } else {
                        m6981 = C2105.m6981("۬᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * 4303) ^ (-1842120167);
                        i6 = 879463543;
                    }
                case -1485179159:
                case 190436553:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((m6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        m6981 = C0630.m2566("ܶܰ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-25247)) ^ 893941969;
                        i6 = -1689681484;
                    }
                case -1175317223:
                case 777862182:
                    i = 2;
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C2105.m6981("ۧۖ") ^ i3) * (-11);
                        i5 = ((m6981 ^ i4) * (-3951)) ^ (-323488674);
                        i6 = 2090376022;
                    } else {
                        m6981 = (C0630.m2566("ۗᩴ") ^ i4) * 127;
                        i5 = ((m6981 ^ i3) * (-30927)) ^ (-981884960);
                        i6 = -623172806;
                    }
                case -1079762904:
                case 1984320917:
                    obj = C21923.m49339(list, 1);
                    if (C4075.m12263() <= 0) {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((m6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        m6981 = (C2105.m6981("ۨ᩸") + i3) * 127;
                        i5 = ((m6981 ^ i4) * 13073) ^ (-37507688);
                        i6 = -1662325470;
                    }
                case -1033267128:
                case 18128498:
                    if (C3245.m9925() != 0) {
                        m6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((m6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        m6981 = C2105.m6981("۠᩸") ^ i4;
                        i5 = ((m6981 ^ i3) * (-14353)) ^ (-740442685);
                        i6 = 226829019;
                    }
                case -790379512:
                case -642782593:
                    if (C11340.f33930 >= 0) {
                        m6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((m6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    } else {
                        m6981 = C0630.m2566("ۨ᩹") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29737)) ^ 670894801;
                        i6 = 1636194524;
                    }
                case -728566939:
                case -434060537:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((m6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        m6981 = C0630.m2566("᩵ܽ") ^ i4;
                        i5 = ((m6981 ^ i3) * 4347) ^ 1262240487;
                        i6 = 266020768;
                    }
                case -532587962:
                case -132675736:
                    C3019.m9255();
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("ۧۖ") ^ i3) * (-11);
                        i5 = ((m6981 ^ i4) * (-3951)) ^ (-323488674);
                        i6 = 2090376022;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((m6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    }
                case -491915285:
                case 814577407:
                    if (C3537.f11231 >= 0) {
                        m6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((m6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((m6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    }
                case -99187300:
                case 1297811106:
                    ViewOnClickListenerC1958.m6429();
                    C3663.m11168();
                    m6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                    i5 = ((m6981 ^ i3) * 16801) ^ 259818144;
                    i6 = 1716865052;
                case -78931386:
                case 1232764266:
                    m27724(abstractActivityC3346, str, (String) obj);
                    break;
                case 41181530:
                case 564036426:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((m6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        m6981 = (C2105.m6981("ܺܶ") + i4) * 35;
                        i5 = ((m6981 ^ i3) * (-32139)) ^ (-42332064);
                        i6 = -1499788159;
                    }
                case 372646218:
                case 473718601:
                    if (C1916.m6308() >= 0) {
                        m6981 = C2105.m6981("۬᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * 4303) ^ (-1842120167);
                        i6 = 879463543;
                    } else {
                        m6981 = (C0630.m2566("֨ܽ") + i3) * (-77);
                        i5 = ((m6981 ^ i4) * (-18347)) ^ 1954760653;
                        i6 = -1984089003;
                    }
                case 547905156:
                case 1149678149:
                    if (C3019.f9544 < 0) {
                        m6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((m6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((m6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    }
                case 684669192:
                case 1787981844:
                    C0237.m1481();
                    C4616.m13552();
                    break;
                default:
                    if (C2272.f7362) {
                        m6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((m6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܽۢ")) * 35;
                        i5 = ((m6981 ^ i4) * 3501) ^ 328648129;
                        i6 = -533308605;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (l.C0714.f2697 >= 0) goto L7;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27726(l.AbstractActivityC3346 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11182.m27726(l.ۗܺ᩷, boolean):void");
    }
}
