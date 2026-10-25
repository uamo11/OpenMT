package l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* compiled from: J57L */
/* renamed from: l.᩺ۖᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22708 implements InterfaceC0397 {

    /* renamed from: ۗܿۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f73355 = {7937, 6712, 6680, 6724, 6732, 6657, 6666, 6673, 6665, 6733, 6727, 6695, 6667, 6664, 6667, 6678, 6724, 6674, 6661, 6664, 6673, 6657, 6724, 6669, 6666, 6674, 6661, 6664, 6669, 6656, 6724, 6732, 6658, 6664, 6661, 6659, 6679, 6733, 6672, 6678, 6673, 6657, 6747, 6747, 6747, 6658, 6661, 6664, 6679, 6657, 6690, 6664, 6667, 6661, 6672, 6724, 6674, 6661, 6664, 6673, 6657, 6724, 6669, 6679, 6724, 6666, 6667, 6672, 6724, 6661, 6664, 6664, 6667, 6675, 6657, 6656, 6690, 6678, 6661, 6663, 6672, 6669, 6667, 6666, 6724, 6674, 6661, 6664, 6673, 6657, 6724, 6669, 6679, 6724, 6666, 6667, 6672, 6724, 6661, 6664, 6664, 6667, 6675, 6657, 6656, 6688, 6669, 6665, 6657, 6666, 6679, 6669, 6667, 6666, 6724, 6674, 6661, 6664, 6673, 6657, 6724, 6669, 6679, 6724, 6666, 6667, 6672, 6724, 6661, 6664, 6664, 6667, 6675, 6657, 6656, 4014, -19694, -6396, 15392, 15653, -8301, 15610, -12356, -19596, -19628, 2754, -26727, -26711, -26723, -26723, -26749, -26711, -26667, -26686, -26673, -26666, -26682, -26711, -26711, -26678, -26681, -26711, -26682, -26675, -26665, -26671, -26662, -26746, -26733, -26725, -26661, -26749, -18895, -26749, -26724, -26724, -26724, -26686, -26675, -26681, -26671, -26676, -26678, -26681, -26727, -26740, -26678, -26681, -26711, -26669, -26686, -26671, -26682, -26675, -26665, -26722, 1216, 584, 605, 604, 606, 579, 522, 579, 580, 585, 604, 597, 604, 593, 585, 607, 581, 580, 620, 579, 538, 525, 620, 579, 538, 530, 536, 619, 622, 530, 621, 538, 527, 537, 530, 21386, 27681, 31805, 22681, 23577, 27922, -26109, -27296, -30281, 28015, 22899, 29702};

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f73356;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f73357;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22372 f73358;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f73359;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f73360;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f73361;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f73362;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73363;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16809 f73364;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12392 f73365;

    public C22708(C22372 c22372) {
        int i = -1543587037;
        int i2 = RunnableC0588.f2309;
        int i3 = RunnableC1937.f6483;
        int m6981 = (i2 - C2105.m6981("ܿ֫")) * 49;
        int i4 = ((m6981 ^ i3) * 31639) ^ 1305710593;
        int i5 = -1110362713;
        while (true) {
            i = ((((i ^ i3) * 28065) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1836143915:
                case -917708459:
                    if (C1504.f5354) {
                        m6981 = (i3 - C2105.m6981("֫᩻")) * 77;
                        i4 = ((m6981 ^ i2) * 6469) ^ 724746927;
                        i5 = -1675089261;
                    } else {
                        m6981 = (C0630.m2566("ۨۧ") ^ i2) * 87;
                        i4 = ((m6981 ^ i3) * 3129) ^ 328884568;
                        i5 = 320617135;
                    }
                case -1647329523:
                case 1195719327:
                    if (C1504.f5354) {
                        m6981 = (i3 - C2105.m6981("֫᩻")) * 77;
                        i4 = ((m6981 ^ i2) * 6469) ^ 724746927;
                        i5 = -1675089261;
                    } else {
                        m6981 = (C2105.m6981("֡۬") ^ i3) * (-109);
                        i4 = ((m6981 ^ i2) * 19955) ^ 1387171999;
                        i5 = -1577035547;
                    }
                case -1494954155:
                case -1325884676:
                    C11340.m28031();
                    if (C2126.f7087) {
                        m6981 = (i3 - C2105.m6981("֫᩻")) * 77;
                        i4 = ((m6981 ^ i2) * 6469) ^ 724746927;
                        i5 = -1675089261;
                    } else {
                        m6981 = (C0630.m2566("ۚ۬") ^ i2) * (-119);
                        i4 = ((m6981 ^ i3) * (-20169)) ^ (-202946207);
                        i5 = -1895644781;
                    }
                case -1322706443:
                case 1858336200:
                    C3683.m11222();
                    throw new RuntimeException();
                case -1208428254:
                case 411253251:
                    if (C7106.f21815 != 0) {
                        m6981 = (C0630.m2566("ۜ᩵") + i3) * (-97);
                        i4 = ((m6981 ^ i2) * 30075) ^ (-1385883222);
                        i5 = 82026005;
                    } else {
                        m6981 = C0630.m2566("ܺᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23601)) ^ 1234685318;
                        i5 = -1511411900;
                    }
                case -1129429368:
                case 1671819300:
                    C1916.m6308();
                    C11340.m28031();
                    m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                    i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                    i5 = 280356353;
                case -1105410344:
                case -64952915:
                    this.f73358 = c22372;
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C0630.m2566("᩷ۡ") ^ i2) * 81;
                        i4 = ((m6981 ^ i3) * (-8439)) ^ 1193196286;
                        i5 = 290620192;
                    } else {
                        m6981 = C2105.m6981("ᩴۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11455)) ^ 57229153;
                        i5 = -1666412259;
                    }
                case -992022956:
                case 1082548394:
                    this.f73363 = 0;
                    if (C4263.m12819() >= 0) {
                        m6981 = (i3 - C2105.m6981("֫᩻")) * 77;
                        i4 = ((m6981 ^ i2) * 6469) ^ 724746927;
                        i5 = -1675089261;
                    } else {
                        m6981 = C2105.m6981("ۚۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 5895) ^ (-1542571287);
                        i5 = 990049877;
                    }
                case -482144266:
                case 1792938094:
                    if (C3019.f9544 < 0) {
                        m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                        i5 = 280356353;
                    } else {
                        m6981 = (C0630.m2566("ۜ᩵") + i3) * (-97);
                        i4 = ((m6981 ^ i2) * 30075) ^ (-1385883222);
                        i5 = 82026005;
                    }
                case -115948971:
                case 873105943:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                        i5 = 280356353;
                    } else {
                        m6981 = (i2 - C2105.m6981("֡ۢ")) * 91;
                        i4 = ((m6981 ^ i3) * 9529) ^ (-310821488);
                        i5 = 786285423;
                    }
                case 223114452:
                case 1159237203:
                    this.f73365 = c22372.f72517;
                    return;
                case 597458986:
                case 1549577780:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                        i5 = 280356353;
                    } else {
                        m6981 = C2105.m6981("ۨ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 18853) ^ (-121247091);
                        i5 = -2122834411;
                    }
                case 792033780:
                case 1424766792:
                    if (C0964.f3626 != 0) {
                        m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                        i5 = 280356353;
                    } else {
                        m6981 = (i3 - C0630.m2566("۬ܿ")) * 39;
                        i4 = ((m6981 ^ i2) * (-4469)) ^ 772919332;
                        i5 = 436843627;
                    }
                case 908806239:
                case 2103797153:
                    if (C2958.m9034() <= 0) {
                        m6981 = (C2105.m6981("֨ܳ") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * 8583) ^ 699146031;
                        i5 = 280356353;
                    } else {
                        m6981 = (C0630.m2566("ۚ۬") ^ i2) * (-119);
                        i4 = ((m6981 ^ i3) * (-20169)) ^ (-202946207);
                        i5 = -1895644781;
                    }
                case 1003137053:
                case 1076599478:
                    if (C1504.m5179()) {
                        m6981 = C2105.m6981("۟۠") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12099)) ^ 158530465;
                        i5 = 1708900835;
                    } else {
                        m6981 = (C0630.m2566("᩷ۡ") ^ i2) * 81;
                        i4 = ((m6981 ^ i3) * (-8439)) ^ 1193196286;
                        i5 = 290620192;
                    }
                default:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (i3 - C2105.m6981("֫᩻")) * 77;
                        i4 = ((m6981 ^ i2) * 6469) ^ 724746927;
                        i5 = -1675089261;
                    } else {
                        m6981 = (C0630.m2566("ۜᩴ") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * 3493) ^ (-404406311);
                        i5 = -1922068838;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50734(C22708 c22708, int i, int i2, CharSequence[] charSequenceArr) {
        C12392 c12392 = null;
        InterfaceC7785 interfaceC7785 = null;
        CharSequence charSequence = null;
        int i3 = 0;
        int i4 = 1119784847;
        int i5 = C11340.f33930;
        int i6 = C2958.f9394;
        int m6981 = (C2105.m6981("ܳ۟") ^ i6) * 65;
        int i7 = ((m6981 ^ i5) * (-6439)) ^ 1687136390;
        int i8 = -1106045433;
        while (true) {
            i4 = ((((i4 ^ i5) * 11763) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -2126272494:
                case -139716544:
                    if (C4117.m12364() != 0) {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    } else {
                        m6981 = (i6 - C2105.m6981("֫ܿ")) * 73;
                        i7 = ((m6981 ^ i5) * 4115) ^ 1459944349;
                        i8 = -1869752825;
                    }
                case -2086505124:
                case -662218603:
                    if (C11340.m28031()) {
                        m6981 = (i5 - C2105.m6981("ۛۗ")) * (-113);
                        i7 = ((m6981 ^ i6) * (-7359)) ^ (-848451264);
                        i8 = -750291287;
                    } else {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    }
                case -2022280294:
                case 1296858222:
                    c12392.mo25919(C4075.m12247(charSequenceArr[i3]) + i);
                    m6981 = (C2105.m6981("ۛ۫") + i5) * 35;
                    i7 = ((m6981 ^ i6) * (-17517)) ^ 1199334027;
                    i8 = -502827839;
                case -1977631248:
                case 1245229018:
                    C1420.m4913();
                    break;
                case -1974967356:
                case -1925234317:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    } else {
                        m6981 = C0630.m2566("ܽ᩻") ^ i5;
                        i7 = ((m6981 ^ i6) * (-1859)) ^ (-729053667);
                        i8 = 1633116217;
                    }
                case -1971129207:
                case -161507650:
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("ۡܺ") ^ i6;
                        i7 = ((m6981 ^ i5) * 26883) ^ 2026935644;
                        i8 = -1088771788;
                    } else {
                        m6981 = (i6 - C0630.m2566("ܳۖ")) * 115;
                        i7 = ((m6981 ^ i5) * (-30375)) ^ (-1574648329);
                        i8 = -1811366472;
                    }
                case -1643107278:
                case -967407849:
                    interfaceC7785.replace(i, i2, charSequence);
                    i3 = c22708.f73363;
                    if (C1047.m3599() >= 0) {
                        m6981 = C2105.m6981("᩵۠") ^ i5;
                        i7 = ((m6981 ^ i6) * (-28405)) ^ (-517462073);
                        i8 = -1474092379;
                    } else {
                        m6981 = C2105.m6981("ۤ᩵") ^ i6;
                        i7 = ((m6981 ^ i5) * 30577) ^ (-1730835730);
                        i8 = 1918130460;
                    }
                case -1250050597:
                case 1128784551:
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    } else {
                        m6981 = (i6 - C2105.m6981("ۗۤ")) * 83;
                        i7 = ((m6981 ^ i5) * 5115) ^ (-519241989);
                        i8 = 157508505;
                    }
                case -1236554374:
                case -417102029:
                    if (C4117.m12364() != 0) {
                        m6981 = (C2105.m6981("۬ۙ") ^ i5) * q.h;
                        i7 = ((m6981 ^ i6) * 25925) ^ 754020799;
                        i8 = -992427130;
                    } else {
                        m6981 = (i6 - C2105.m6981("᩻᩺")) * 123;
                        i7 = ((m6981 ^ i5) * 3393) ^ 1049759110;
                        i8 = 831257512;
                    }
                case -970612438:
                case 1936099207:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    } else {
                        m6981 = (i5 - C2105.m6981("ᩴۛ")) * 53;
                        i7 = ((m6981 ^ i6) * 32545) ^ 2137727111;
                        i8 = 187525802;
                    }
                case -932472799:
                case -784109223:
                    c12392 = c22708.f73365;
                    if (c22708.f73363 != -1) {
                        m6981 = (C0630.m2566("ۘۘ") ^ i6) * (-73);
                        i7 = ((m6981 ^ i5) * (-1029)) ^ (-162603448);
                        i8 = 1699263851;
                    } else {
                        m6981 = (C2105.m6981("ۛ۫") + i5) * 35;
                        i7 = ((m6981 ^ i6) * (-17517)) ^ 1199334027;
                        i8 = -502827839;
                    }
                case -851430987:
                case 2081046162:
                    if (C1005.f3721) {
                        m6981 = C0630.m2566("᩻۫") ^ i5;
                        i7 = ((m6981 ^ i6) * 21649) ^ (-865089676);
                        i8 = -1925246358;
                    } else {
                        m6981 = (C2105.m6981("۬ۙ") ^ i5) * q.h;
                        i7 = ((m6981 ^ i6) * 25925) ^ 754020799;
                        i8 = -992427130;
                    }
                case -737309907:
                case 2080718490:
                    interfaceC7785 = C1005.m3497(c12392);
                    charSequence = charSequenceArr[c22708.f73363];
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    } else {
                        m6981 = (C0630.m2566("ܳ᩶") ^ i5) * (-97);
                        i7 = ((m6981 ^ i6) * 30933) ^ (-1094719061);
                        i8 = 1570185942;
                    }
                case -218006000:
                case 97569657:
                    C3746.m11369();
                    if (C2105.m6982() != 0) {
                        m6981 = C2105.m6981("ۡܺ") ^ i6;
                        i7 = ((m6981 ^ i5) * 26883) ^ 2026935644;
                        i8 = -1088771788;
                    } else {
                        m6981 = (C2105.m6981("۬ۙ") ^ i5) * q.h;
                        i7 = ((m6981 ^ i6) * 25925) ^ 754020799;
                        i8 = -992427130;
                    }
                case -59116618:
                case 1545927179:
                    C4075.m12263();
                    m6981 = C2105.m6981("ۡܺ") ^ i6;
                    i7 = ((m6981 ^ i5) * 26883) ^ 2026935644;
                    i8 = -1088771788;
                case 28446297:
                case 1494617734:
                    C0422.m1963();
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ۡܺ") ^ i6;
                        i7 = ((m6981 ^ i5) * 26883) ^ 2026935644;
                        i8 = -1088771788;
                    } else {
                        m6981 = C2105.m6981("ܽۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 30207) ^ 1843996162;
                        i8 = -252512560;
                    }
                case 53640100:
                case 1982988156:
                    if (C2105.f7037 != 0) {
                        m6981 = (C2105.m6981("۬ۙ") ^ i5) * q.h;
                        i7 = ((m6981 ^ i6) * 25925) ^ 754020799;
                        i8 = -992427130;
                    } else {
                        m6981 = (C2105.m6981("ܶۙ") ^ i5) * (-89);
                        i7 = ((m6981 ^ i6) * (-26531)) ^ (-2106698866);
                        i8 = -179741224;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        if (l.C1916.m6308() < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        if (l.C1711.m5736() > 0) goto L28;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m50736(l.C22708 r22, boolean[] r23, l.C16809 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22708.m50736(l.᩺ۖᩳ, boolean[], l.ܽᩳܽ, int, int):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // l.InterfaceC0397
    /* renamed from: ֫ */
    public final void mo1091(java.util.ArrayList r53) {
        /*
            Method dump skipped, instructions count: 4476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22708.mo1091(java.util.ArrayList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
    
        if (l.C1916.f6442 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0198, code lost:
    
        if (l.C3019.f9544 >= 0) goto L13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50732(final l.C22708 r58) {
        /*
            Method dump skipped, instructions count: 2778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22708.m50732(l.᩺ۖᩳ):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x007b. Please report as an issue. */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50735(C22708 c22708, C12392 c12392) {
        int i;
        StringBuilder sb;
        InterfaceC1454 interfaceC1454;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        char c;
        StringBuilder sb2;
        char c2;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        StringBuilder sb3;
        int i10;
        String str3;
        InterfaceC1454 interfaceC14542;
        String str4;
        int i11;
        int i12;
        C22372 c22372;
        int i13;
        int i14;
        String str5;
        char c3;
        StringBuilder sb4;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        char c4;
        ArrayList arrayList2;
        int i16;
        int m6981;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        StringBuilder sb5;
        ArrayList arrayList3;
        int i22;
        String str6;
        InterfaceC1454 interfaceC14543;
        char c5;
        StringBuilder sb6;
        int i23;
        int i24;
        int i25;
        String str7;
        int m3592;
        char c6;
        int i26;
        int i27;
        int i28;
        String str8;
        String str9;
        int i29;
        String str10;
        int i30;
        char c7;
        StringBuilder sb7;
        char c8;
        ArrayList arrayList4;
        int i31;
        int i32;
        int i33;
        StringBuilder sb8;
        int m2566;
        int i34;
        String str11;
        String str12;
        int i35;
        char c9;
        String str13;
        StringBuilder sb9;
        char c10;
        ArrayList arrayList5;
        String str14;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        char c11;
        int i42;
        int i43;
        int i44;
        int i45;
        char c12;
        StringBuilder sb10;
        char c13;
        ArrayList arrayList6;
        String str15;
        int i46;
        int i47;
        int i48;
        char c14;
        int m69812;
        int i49;
        int i50;
        ArrayList arrayList7;
        int i51;
        StringBuilder sb11;
        int i52;
        InterfaceC1454 interfaceC14544;
        String str16;
        int i53;
        String str17;
        int i54;
        int i55;
        int i56;
        char c15;
        StringBuilder sb12;
        char c16;
        int m69813;
        int i57;
        int i58;
        String m3789;
        int m25662;
        int i59;
        int i60;
        int i61;
        InterfaceC1454 interfaceC14545;
        int i62;
        char c17;
        StringBuilder sb13;
        InterfaceC1454 interfaceC14546;
        String str18;
        int i63;
        int i64;
        String str19;
        int i65;
        int i66;
        int i67;
        char c18;
        StringBuilder sb14;
        int m25663;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int m69814;
        int i73;
        int m25664;
        int i74;
        int i75;
        int i76;
        int m69815;
        int i77;
        String str20;
        int m25665;
        int i78;
        int i79;
        InterfaceC1454 interfaceC14547;
        int m25666;
        int i80;
        int m25667;
        int i81;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        InterfaceC21211 interfaceC21211 = null;
        boolean z = false;
        int i82 = 0;
        boolean z2 = false;
        Iterator it = null;
        InterfaceC21211 interfaceC212112 = null;
        Iterator it2 = null;
        InterfaceC1454 interfaceC14548 = null;
        int i83 = 523369879;
        int i84 = ServiceConnectionC3453.f10921;
        int i85 = C11340.f33930;
        int m25668 = C0630.m2566("ۢ֨") ^ i84;
        int i86 = ((m25668 ^ i85) * 18119) ^ 249690170;
        int i87 = m25668 ^ (-869170852);
        String str21 = null;
        String str22 = null;
        String str23 = null;
        StringBuilder sb15 = null;
        String str24 = null;
        int i88 = 0;
        int i89 = 0;
        int i90 = 0;
        int i91 = 0;
        char c19 = 0;
        int i92 = 0;
        int i93 = 0;
        int i94 = 0;
        String str25 = null;
        int i95 = 0;
        SpannableStringBuilder spannableStringBuilder2 = null;
        Exception exc = null;
        String str26 = null;
        StringBuilder sb16 = null;
        int i96 = 0;
        char c20 = 0;
        C22372 c223722 = null;
        int i97 = 0;
        while (true) {
            i83 = i87 ^ (i86 & (((i83 ^ i85) * (-9593)) >> 31));
            switch (i83) {
                case -2110585458:
                case -194120669:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    if (C1711.m5741(str12) == 9) {
                        m69812 = (i85 - C2105.m6981("ۡۜ")) * (-59);
                        i49 = ((m69812 ^ i84) * (-5073)) ^ (-2015318586);
                        i50 = 1334096662;
                        i61 = m69812 ^ i50;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = str14;
                        sb15 = sb9;
                        i89 = i20;
                        str25 = str12;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i61;
                        i86 = i49;
                        sb16 = sb3;
                    }
                    m69812 = (i84 - C0630.m2566("ۜۢ")) * 59;
                    i49 = ((m69812 ^ i85) * 345) ^ 256498476;
                    i50 = 1031837355;
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case -2105665685:
                case -1586336187:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    arrayList7 = null;
                    arrayList9 = arrayList7;
                    m69812 = (i85 - C2105.m6981("ܳ᩵")) * 17;
                    i49 = ((m69812 ^ i84) * 26159) ^ 1627918859;
                    i50 = -1450062143;
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case -2103944177:
                case -177371847:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    c22372 = c223722;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    spannableStringBuilder = spannableStringBuilder2;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    i91 = 19947;
                    m6981 = (i85 - C0630.m2566("ۤۢ")) * (-75);
                    i17 = ((m6981 ^ i84) * 8945) ^ (-290636198);
                    i18 = 163960485;
                    i19 = m6981 ^ i18;
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -2088177576:
                case 1347585033:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str9 = str25;
                    i12 = i97;
                    i72 = i95;
                    try {
                        i89 = C9896.m25001(C0382.m1844(str9, i72));
                        C0630.m2576(spannableStringBuilder2, new BackgroundColorSpan(i89), i90, i93, i92);
                        int m25669 = C0630.m2566("᩻ۡ") ^ i84;
                        i49 = ((m25669 ^ i85) * (-21077)) ^ 214959857;
                        i61 = m25669 ^ 1590034963;
                        i95 = i72;
                        str25 = str9;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i61;
                        i86 = i49;
                        sb16 = sb3;
                    } catch (Exception e) {
                        exc = e;
                        i29 = i89;
                        i27 = i90;
                        i28 = i82;
                        str8 = str22;
                        str10 = str26;
                        i32 = i72;
                        i33 = i93;
                        i30 = i96;
                        c7 = c20;
                        sb7 = sb15;
                        c8 = c19;
                        arrayList4 = arrayList8;
                        i31 = i88;
                        m2566 = (i85 - C2105.m6981("ᩴ᩷")) * (-3);
                        i17 = ((m2566 ^ i84) * 11529) ^ (-821438708);
                        i34 = -187977969;
                        i19 = m2566 ^ i34;
                        i88 = i31;
                        i95 = i32;
                        sb15 = sb7;
                        arrayList8 = arrayList4;
                        c20 = c7;
                        str22 = str8;
                        c19 = c8;
                        i93 = i33;
                        i96 = i30;
                        sb16 = sb3;
                        str26 = str10;
                        i82 = i28;
                        i89 = i29;
                        i90 = i27;
                        str25 = str9;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    }
                case -2016819481:
                case -1369223052:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    if (C0483.m2123(it2)) {
                        m69815 = C0630.m2566("֫ۗ") ^ i85;
                        i17 = ((m69815 ^ i84) * (-25467)) ^ (-1362079103);
                        i77 = -2040896376;
                        i19 = m69815 ^ i77;
                        sb16 = sb3;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    } else {
                        str20 = str24;
                        m25665 = C2105.m6981("ܶ֡") ^ i84;
                        i75 = ((m25665 ^ i85) * (-11255)) ^ 245099582;
                        i78 = -928320317;
                        i76 = m25665 ^ i78;
                        str24 = str20;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    }
                case -1971641450:
                case 549891882:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    c22372 = c223722;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    spannableStringBuilder = spannableStringBuilder2;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    short s = f73355[145];
                    int i98 = s + 9375;
                    int i99 = (s * s) + 87890625;
                    if ((i99 + i99) - (i98 * i98) >= 0) {
                        m6981 = (C2105.m6981("ܶᩳ") + i85) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i17 = ((m6981 ^ i84) * (-21545)) ^ (-278905330);
                        i18 = -2012936652;
                    } else {
                        m6981 = C2105.m6981("ۛ֫") ^ i84;
                        i17 = ((m6981 ^ i85) * (-14509)) ^ 1328807170;
                        i18 = 429566585;
                    }
                    i19 = m6981 ^ i18;
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -1968954857:
                case -1527516179:
                    sb13 = sb16;
                    interfaceC14546 = interfaceC14548;
                    str18 = str25;
                    i63 = i97;
                    i64 = i89;
                    i65 = i95;
                    i66 = i93;
                    StringBuilder sb17 = sb15;
                    C3245.m9923(sb17, C1294.m4373(f73355, 177, 8, i91));
                    sb14 = sb17;
                    i62 = i90;
                    c17 = c19;
                    str19 = str26;
                    c18 = c20;
                    i67 = i96;
                    m25663 = C2105.m6981("ܺۗ") ^ i84;
                    i68 = ((m25663 ^ i85) * 8377) ^ 192957389;
                    i69 = -696283061;
                    int i100 = m25663 ^ i69;
                    c20 = c18;
                    i96 = i67;
                    i93 = i66;
                    sb16 = sb13;
                    i95 = i65;
                    str26 = str19;
                    i97 = i63;
                    i89 = i64;
                    interfaceC14548 = interfaceC14546;
                    str25 = str18;
                    i87 = i100;
                    i90 = i62;
                    char c21 = c17;
                    sb15 = sb14;
                    i86 = i68;
                    c19 = c21;
                case -1910740619:
                case -1849946428:
                    i48 = i90;
                    sb3 = sb16;
                    i40 = i96;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    i36 = i95;
                    i39 = i93;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    m3789 = RunnableC1108.m3789(f73355, 158, 3, i91);
                    i88 = -1;
                    if (arrayList5 != null) {
                        m25662 = (C0630.m2566("ܺۜ") ^ i84) * 81;
                        i59 = ((m25662 ^ i85) * (-4561)) ^ 1668754385;
                        i60 = 1529807054;
                        int i101 = m25662 ^ i60;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = m3789;
                        i86 = i59;
                        sb15 = sb9;
                        sb16 = sb3;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i101;
                        i89 = i20;
                        str25 = str12;
                    }
                    m25662 = (i85 - C0630.m2566("֨᩵")) * q.h;
                    i59 = ((m25662 ^ i84) * 30439) ^ (-1239208447);
                    i60 = 1749390401;
                    int i1012 = m25662 ^ i60;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = m3789;
                    i86 = i59;
                    sb15 = sb9;
                    sb16 = sb3;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i1012;
                    i89 = i20;
                    str25 = str12;
                case -1823976836:
                case 2130008247:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    interfaceC212112 = (InterfaceC21211) C2272.m7513(it);
                    StringBuilder sb18 = new StringBuilder(str23);
                    C3245.m9923(sb18, interfaceC212112.mo29410().mo18744());
                    str20 = str24;
                    C1420.m4905(sb18, str20);
                    ViewOnClickListenerC8597.m22314(spannableStringBuilder2, C0422.m1959(sb18));
                    if (interfaceC212112.mo29412()) {
                        m25665 = (C2105.m6981("ܳܿ") + i85) * 85;
                        i75 = ((m25665 ^ i84) * 30293) ^ 1356560398;
                        i78 = 79722260;
                        i76 = m25665 ^ i78;
                        str24 = str20;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    }
                    m25665 = (C0630.m2566("۟ۢ") + i84) * 7;
                    i75 = ((m25665 ^ i85) * 6883) ^ 1145024460;
                    i78 = -1112222289;
                    i76 = m25665 ^ i78;
                    str24 = str20;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -1799821545:
                case 374070241:
                    i62 = i90;
                    c17 = c19;
                    sb13 = sb16;
                    interfaceC14546 = interfaceC14548;
                    str18 = str25;
                    i63 = i97;
                    i64 = i89;
                    str19 = str26;
                    i65 = i95;
                    i66 = i93;
                    i67 = i96;
                    c18 = c20;
                    ViewOnClickListenerC8597.m22314(spannableStringBuilder2, C0798.m3005(f73355, 161, 6, i91));
                    sb14 = new StringBuilder(str23);
                    C2105.m6979(sb14, C0798.m3000(str18, i94));
                    if (interfaceC21211.mo29407().mo12858() == i65) {
                        m25663 = C0630.m2566("ܳᩴ") ^ i85;
                        i68 = ((m25663 ^ i84) * (-24043)) ^ 1515472267;
                        i69 = 1586429066;
                        int i1002 = m25663 ^ i69;
                        c20 = c18;
                        i96 = i67;
                        i93 = i66;
                        sb16 = sb13;
                        i95 = i65;
                        str26 = str19;
                        i97 = i63;
                        i89 = i64;
                        interfaceC14548 = interfaceC14546;
                        str25 = str18;
                        i87 = i1002;
                        i90 = i62;
                        char c212 = c17;
                        sb15 = sb14;
                        i86 = i68;
                        c19 = c212;
                    }
                    m25663 = C2105.m6981("ܺۗ") ^ i84;
                    i68 = ((m25663 ^ i85) * 8377) ^ 192957389;
                    i69 = -696283061;
                    int i10022 = m25663 ^ i69;
                    c20 = c18;
                    i96 = i67;
                    i93 = i66;
                    sb16 = sb13;
                    i95 = i65;
                    str26 = str19;
                    i97 = i63;
                    i89 = i64;
                    interfaceC14548 = interfaceC14546;
                    str25 = str18;
                    i87 = i10022;
                    i90 = i62;
                    char c2122 = c17;
                    sb15 = sb14;
                    i86 = i68;
                    c19 = c2122;
                case -1763892231:
                case 1570959124:
                    InterfaceC1454 interfaceC14549 = interfaceC14548;
                    i12 = i97;
                    interfaceC14542 = interfaceC14549;
                    sb3 = sb16;
                    C3019.m9261(spannableStringBuilder2, C4117.m12351(C3911.m11919(f73355, 188, 8, i91), c223722.m50216().m30777(interfaceC212112.getParent())));
                    str20 = str24;
                    m25665 = (C0630.m2566("۟ۢ") + i84) * 7;
                    i75 = ((m25665 ^ i85) * 6883) ^ 1145024460;
                    i78 = -1112222289;
                    i76 = m25665 ^ i78;
                    str24 = str20;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -1753070352:
                case 1434188238:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    str21 = c22708.f73357;
                    c22372 = c223722;
                    spannableStringBuilder = spannableStringBuilder2;
                    int m256610 = (C0630.m2566("ۖۢ") ^ i85) * 119;
                    i17 = ((m256610 ^ i84) * 17741) ^ 1736603630;
                    i19 = m256610 ^ (-11242773);
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -1735996188:
                case -1625488150:
                    break;
                case -1672898976:
                case 333963014:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    arrayList7 = c223722.m50216().m30768(C3432.m10478(str12, i36));
                    arrayList9 = arrayList7;
                    m69812 = (i85 - C2105.m6981("ܳ᩵")) * 17;
                    i49 = ((m69812 ^ i84) * 26159) ^ 1627918859;
                    i50 = -1450062143;
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case -1666795664:
                case -318734779:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i44 = i95;
                    i20 = i89;
                    i45 = i93;
                    StringBuilder sb19 = new StringBuilder(C1711.m5726(f73355, 185, 1, i91));
                    C1420.m4905(sb19, interfaceC21211.mo29406());
                    str24 = C0050.m947(sb19);
                    m25664 = (C2105.m6981("᩻᩶") + i85) * (-75);
                    i70 = ((m25664 ^ i84) * (-8621)) ^ 943284546;
                    i74 = -595215327;
                    i71 = m25664 ^ i74;
                    i93 = i45;
                    sb16 = sb3;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i71;
                    i86 = i70;
                    i89 = i20;
                    str25 = str12;
                case -1642976883:
                case 1689360044:
                    i = i90;
                    sb = sb16;
                    interfaceC1454 = interfaceC14548;
                    str = str25;
                    i2 = i97;
                    i3 = i89;
                    str2 = str26;
                    i4 = i95;
                    i5 = i93;
                    i6 = i96;
                    c = c20;
                    sb2 = sb15;
                    c2 = c19;
                    arrayList = arrayList8;
                    i82 = -1;
                    int m69816 = (i84 - C2105.m6981("֨֫")) * (-119);
                    i7 = ((m69816 ^ i85) * 20995) ^ (-2110315748);
                    i8 = m69816 ^ (-331391899);
                    arrayList8 = arrayList;
                    i96 = i6;
                    c19 = c2;
                    sb16 = sb;
                    str26 = str2;
                    sb15 = sb2;
                    i89 = i3;
                    str25 = str;
                    c20 = c;
                    i93 = i5;
                    i95 = i4;
                    i97 = i2;
                    interfaceC14548 = interfaceC1454;
                    i87 = i8;
                    i86 = i7;
                    i90 = i;
                case -1633332114:
                case 1442782323:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    if (C9896.m24990(C3432.m10478(str12, i36))) {
                        m69812 = C0630.m2566("ܰ֫") ^ i84;
                        i49 = ((m69812 ^ i85) * (-30571)) ^ (-1079164911);
                        i50 = -473420240;
                        i61 = m69812 ^ i50;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = str14;
                        sb15 = sb9;
                        i89 = i20;
                        str25 = str12;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i61;
                        i86 = i49;
                        sb16 = sb3;
                    }
                    m69812 = (i84 - C0630.m2566("ۜۢ")) * 59;
                    i49 = ((m69812 ^ i85) * 345) ^ 256498476;
                    i50 = 1031837355;
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case -1593691652:
                case 833948351:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    if (C2167.m7161(arrayList5)) {
                        m3789 = str14;
                        m25662 = (i85 - C0630.m2566("֨᩵")) * q.h;
                        i59 = ((m25662 ^ i84) * 30439) ^ (-1239208447);
                        i60 = 1749390401;
                        int i10122 = m25662 ^ i60;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = m3789;
                        i86 = i59;
                        sb15 = sb9;
                        sb16 = sb3;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i10122;
                        i89 = i20;
                        str25 = str12;
                    } else {
                        m69812 = C0630.m2566("ۗ۠") ^ i85;
                        i49 = ((m69812 ^ i84) * 11999) ^ 1143371421;
                        i50 = -1218422254;
                        i61 = m69812 ^ i50;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = str14;
                        sb15 = sb9;
                        i89 = i20;
                        str25 = str12;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i61;
                        i86 = i49;
                        sb16 = sb3;
                    }
                case -1541502701:
                case -1452126752:
                    i = i90;
                    sb = sb16;
                    interfaceC1454 = interfaceC14548;
                    str = str25;
                    i2 = i97;
                    i3 = i89;
                    str2 = str26;
                    i4 = i95;
                    i5 = i93;
                    i6 = i96;
                    c = c20;
                    sb2 = sb15;
                    c2 = c19;
                    arrayList = arrayList8;
                    i82 = c223722.m50216().m30771(C3432.m10478(str, i4));
                    int m698162 = (i84 - C2105.m6981("֨֫")) * (-119);
                    i7 = ((m698162 ^ i85) * 20995) ^ (-2110315748);
                    i8 = m698162 ^ (-331391899);
                    arrayList8 = arrayList;
                    i96 = i6;
                    c19 = c2;
                    sb16 = sb;
                    str26 = str2;
                    sb15 = sb2;
                    i89 = i3;
                    str25 = str;
                    c20 = c;
                    i93 = i5;
                    i95 = i4;
                    i97 = i2;
                    interfaceC14548 = interfaceC1454;
                    i87 = i8;
                    i86 = i7;
                    i90 = i;
                case -1500395937:
                case -623383595:
                    i96 = C0237.m1493(sb16) + RunnableC1937.m6382(spannableStringBuilder2);
                    InterfaceC1454 interfaceC145410 = interfaceC14548;
                    C1420.m4905(sb16, c223722.m50216().m30766(interfaceC145410));
                    C3537.m10742(spannableStringBuilder2, C0050.m947(sb16));
                    int i102 = i97;
                    if (interfaceC145410.mo5004() >= 28) {
                        int m256611 = (C0630.m2566("ۛۢ") ^ i84) * (-117);
                        i87 = m256611 ^ 2022935375;
                        i86 = ((m256611 ^ i85) * 30157) ^ 1300707068;
                        i97 = i102;
                        interfaceC14548 = interfaceC145410;
                    } else {
                        interfaceC14542 = interfaceC145410;
                        sb3 = sb16;
                        i97 = i102;
                        int m256612 = (i84 - C0630.m2566("۠᩸")) * 49;
                        i75 = ((m256612 ^ i85) * 7317) ^ 467190183;
                        i76 = m256612 ^ (-181711316);
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    }
                case -1403104489:
                case 892227888:
                    i51 = i90;
                    sb11 = sb16;
                    i52 = i82;
                    interfaceC14544 = interfaceC14548;
                    str16 = str25;
                    i12 = i97;
                    i53 = i89;
                    str17 = str26;
                    i54 = i95;
                    i55 = i93;
                    i56 = i96;
                    c15 = c20;
                    sb12 = sb15;
                    c16 = c19;
                    if (i52 == i88) {
                        m69813 = (C2105.m6981("ۧۘ") + i84) * 63;
                        i57 = ((m69813 ^ i85) * (-1671)) ^ (-695586485);
                        i58 = -1380477169;
                    } else {
                        m69813 = C0630.m2566("ܺܰ") ^ i85;
                        i57 = ((m69813 ^ i84) * (-23547)) ^ (-2133159001);
                        i58 = 969737895;
                    }
                    int i103 = m69813 ^ i58;
                    i82 = i52;
                    i96 = i56;
                    sb16 = sb11;
                    i90 = i51;
                    str26 = str17;
                    i89 = i53;
                    str25 = str16;
                    interfaceC14545 = interfaceC14544;
                    i87 = i103;
                    i86 = i57;
                    c19 = c16;
                    sb15 = sb12;
                    c20 = c15;
                    i93 = i55;
                    i95 = i54;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -1369386580:
                case 170601397:
                    i27 = i90;
                    sb3 = sb16;
                    i28 = i82;
                    str8 = str22;
                    interfaceC14542 = interfaceC14548;
                    str9 = str25;
                    i12 = i97;
                    i29 = i89;
                    str10 = str26;
                    int i104 = i95;
                    int i105 = i93;
                    i30 = i96;
                    c7 = c20;
                    sb7 = sb15;
                    c8 = c19;
                    arrayList4 = arrayList8;
                    i31 = i88;
                    try {
                        int m35922 = C1047.m3592(spannableStringBuilder2);
                        try {
                            sb8 = new StringBuilder(str8);
                            i33 = m35922;
                            i32 = i104;
                        } catch (Exception e2) {
                            e = e2;
                            i33 = m35922;
                            i32 = i104;
                        }
                        try {
                            C3245.m9923(sb8, C1047.m3595(m50731(c22708.f73364, str9)));
                            ViewOnClickListenerC8597.m22320(spannableStringBuilder2, C0422.m1959(sb8));
                            z2 = f73356;
                            m2566 = (C0630.m2566("ۨۧ") ^ i84) * (-43);
                            i17 = ((m2566 ^ i85) * 11303) ^ 894113186;
                            i34 = -345640317;
                        } catch (Exception e3) {
                            e = e3;
                            exc = e;
                            m2566 = (i85 - C2105.m6981("ᩴ᩷")) * (-3);
                            i17 = ((m2566 ^ i84) * 11529) ^ (-821438708);
                            i34 = -187977969;
                            i19 = m2566 ^ i34;
                            i88 = i31;
                            i95 = i32;
                            sb15 = sb7;
                            arrayList8 = arrayList4;
                            c20 = c7;
                            str22 = str8;
                            c19 = c8;
                            i93 = i33;
                            i96 = i30;
                            sb16 = sb3;
                            str26 = str10;
                            i82 = i28;
                            i89 = i29;
                            i90 = i27;
                            str25 = str9;
                            interfaceC14545 = interfaceC14542;
                            i87 = i19;
                            i86 = i17;
                            i97 = i12;
                            interfaceC14548 = interfaceC14545;
                        }
                    } catch (Exception e4) {
                        i32 = i104;
                        exc = e4;
                        i33 = i105;
                    }
                    i19 = m2566 ^ i34;
                    i88 = i31;
                    i95 = i32;
                    sb15 = sb7;
                    arrayList8 = arrayList4;
                    c20 = c7;
                    str22 = str8;
                    c19 = c8;
                    i93 = i33;
                    i96 = i30;
                    sb16 = sb3;
                    str26 = str10;
                    i82 = i28;
                    i89 = i29;
                    i90 = i27;
                    str25 = str9;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -1328018998:
                case 1988886492:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    if (interfaceC212112.getParent() != 0) {
                        m69815 = (C2105.m6981("֫ܰ") ^ i84) * (-75);
                        i17 = ((m69815 ^ i85) * 6637) ^ (-1179749780);
                        i77 = -835855283;
                        i19 = m69815 ^ i77;
                        sb16 = sb3;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    } else {
                        str20 = str24;
                        m25665 = (C0630.m2566("۟ۢ") + i84) * 7;
                        i75 = ((m25665 ^ i85) * 6883) ^ 1145024460;
                        i78 = -1112222289;
                        i76 = m25665 ^ i78;
                        str24 = str20;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    }
                case -1305293659:
                case 164399994:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    if (((i89 >>> 24) & 255) > c19) {
                        m69815 = (C0630.m2566("ۚ᩻") + i85) * 51;
                        i17 = ((m69815 ^ i84) * 2669) ^ 410996783;
                        i77 = -1090259361;
                        i19 = m69815 ^ i77;
                        sb16 = sb3;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    } else {
                        str15 = str22;
                        str12 = str25;
                        i44 = i95;
                        i20 = i89;
                        i45 = i93;
                        str6 = str26;
                        c12 = c20;
                        sb10 = sb15;
                        c13 = c19;
                        i25 = i96;
                        arrayList6 = arrayList8;
                        i46 = i88;
                        i47 = i90;
                        i43 = i82;
                        int m69817 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m69817 ^ 1286354698;
                        i86 = ((m69817 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    }
                case -1273093045:
                case 406145576:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    i44 = i95;
                    i45 = i93;
                    C0630.m2576(spannableStringBuilder2, new ForegroundColorSpan(C21943.f70293), i90, C1047.m3592(spannableStringBuilder2), i92);
                    str15 = str22;
                    str6 = str26;
                    c12 = c20;
                    sb10 = sb15;
                    c13 = c19;
                    i25 = i96;
                    arrayList6 = arrayList8;
                    i46 = i88;
                    i47 = i90;
                    i43 = i82;
                    int m698172 = C2105.m6981("ۤܶ") ^ i85;
                    i82 = i43;
                    str22 = str15;
                    sb16 = sb3;
                    i90 = i47;
                    i88 = i46;
                    arrayList8 = arrayList6;
                    c19 = c13;
                    sb15 = sb10;
                    c20 = c12;
                    i93 = i45;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = m698172 ^ 1286354698;
                    i86 = ((m698172 ^ i84) * (-29663)) ^ 776241744;
                    i96 = i25;
                    str26 = str6;
                    i89 = i20;
                    str25 = str12;
                case -1243302052:
                case -715170853:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    c22372 = c223722;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    spannableStringBuilder = spannableStringBuilder2;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    i91 = 38819;
                    m6981 = (i85 - C0630.m2566("ۤۢ")) * (-75);
                    i17 = ((m6981 ^ i84) * 8945) ^ (-290636198);
                    i18 = 163960485;
                    i19 = m6981 ^ i18;
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -1202331249:
                case 1814587859:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    if (C11340.m28021(i36, str12) != c14) {
                        m69812 = C2105.m6981("ۨ֡") ^ i84;
                        i49 = ((m69812 ^ i85) * 1705) ^ 931731931;
                        i50 = 1891547305;
                        i61 = m69812 ^ i50;
                        i82 = i41;
                        arrayList8 = arrayList5;
                        i96 = i40;
                        c19 = c10;
                        i90 = i48;
                        str26 = str14;
                        sb15 = sb9;
                        i89 = i20;
                        str25 = str12;
                        c20 = c14;
                        i93 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i61;
                        i86 = i49;
                        sb16 = sb3;
                    } else {
                        i37 = i88;
                        c11 = c14;
                        str13 = str22;
                        i38 = i48;
                        int m69818 = C2105.m6981("֡ۛ") ^ i84;
                        int i106 = ((m69818 ^ i85) * 15099) ^ (-1674444993);
                        i42 = m69818 ^ 1858356644;
                        i82 = i41;
                        str22 = str13;
                        sb16 = sb3;
                        i90 = i38;
                        i88 = i37;
                        arrayList8 = arrayList5;
                        c19 = c10;
                        sb15 = sb9;
                        c20 = c11;
                        i86 = i106;
                        i96 = i40;
                        str26 = str14;
                        i89 = i20;
                        str25 = str12;
                        int i107 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i42;
                        i93 = i107;
                    }
                case -1087518213:
                case -396415898:
                    i51 = i90;
                    sb11 = sb16;
                    i52 = i82;
                    interfaceC14544 = interfaceC14548;
                    str16 = str25;
                    i12 = i97;
                    i53 = i89;
                    str17 = str26;
                    i54 = i95;
                    i55 = i93;
                    i56 = i96;
                    c15 = c20;
                    sb12 = sb15;
                    c16 = c19;
                    arrayList8 = arrayList9;
                    z = false;
                    m69813 = C2105.m6981("֡ܰ") ^ i85;
                    i57 = ((m69813 ^ i84) * 24935) ^ (-623793948);
                    i58 = 1513552870;
                    int i1032 = m69813 ^ i58;
                    i82 = i52;
                    i96 = i56;
                    sb16 = sb11;
                    i90 = i51;
                    str26 = str17;
                    i89 = i53;
                    str25 = str16;
                    interfaceC14545 = interfaceC14544;
                    i87 = i1032;
                    i86 = i57;
                    c19 = c16;
                    sb15 = sb12;
                    c20 = c15;
                    i93 = i55;
                    i95 = i54;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -948343574:
                case 507448429:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    it2 = C4616.m13555(interfaceC212112.values());
                    int m2566122 = (i84 - C0630.m2566("۠᩸")) * 49;
                    i75 = ((m2566122 ^ i85) * 7317) ^ 467190183;
                    i76 = m2566122 ^ (-181711316);
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -926607834:
                case -543360512:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    StringBuilder sb20 = new StringBuilder();
                    C1420.m4905(sb20, c22708.f73362);
                    c22372 = c223722;
                    spannableStringBuilder = spannableStringBuilder2;
                    C1420.m4905(sb20, C2126.m7036(f73355, 146, 1, i91));
                    C1420.m4905(sb20, c22708.f73357);
                    str21 = C0050.m947(sb20);
                    int m2566102 = (C0630.m2566("ۖۢ") ^ i85) * 119;
                    i17 = ((m2566102 ^ i84) * 17741) ^ 1736603630;
                    i19 = m2566102 ^ (-11242773);
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -879467470:
                case 171721667:
                    if (interfaceC14548.mo5004() <= 31) {
                        m25667 = C0630.m2566("᩹ۧ") ^ i85;
                        i75 = ((m25667 ^ i84) * 24399) ^ 2093654995;
                        i81 = 157425975;
                        i87 = m25667 ^ i81;
                        i86 = i75;
                    }
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    int m25661222 = (i84 - C0630.m2566("۠᩸")) * 49;
                    i75 = ((m25661222 ^ i85) * 7317) ^ 467190183;
                    i76 = m25661222 ^ (-181711316);
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -796445127:
                case 610133144:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    str20 = str24;
                    if (C1773.m5910(it)) {
                        m25665 = C0630.m2566("᩹ۤ") ^ i85;
                        i75 = ((m25665 ^ i84) * 7013) ^ 522662472;
                        i78 = -1428405248;
                        i76 = m25665 ^ i78;
                        str24 = str20;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    } else {
                        str24 = str20;
                        str15 = str22;
                        str12 = str25;
                        i44 = i95;
                        i20 = i89;
                        i45 = i93;
                        str6 = str26;
                        c12 = c20;
                        sb10 = sb15;
                        c13 = c19;
                        i25 = i96;
                        arrayList6 = arrayList8;
                        i46 = i88;
                        i47 = i90;
                        i43 = i82;
                        int m6981722 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m6981722 ^ 1286354698;
                        i86 = ((m6981722 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    }
                case -776381963:
                case 1621653627:
                    i20 = i89;
                    i21 = i93;
                    sb5 = sb16;
                    arrayList3 = arrayList8;
                    i22 = i82;
                    str6 = str26;
                    interfaceC14543 = interfaceC14548;
                    c5 = c20;
                    sb6 = sb15;
                    i23 = i88;
                    i24 = i97;
                    i25 = i96;
                    str7 = c22708.f73361;
                    c223722 = c22708.f73358;
                    spannableStringBuilder2 = new SpannableStringBuilder();
                    ViewOnClickListenerC8597.m22322(spannableStringBuilder2, str21);
                    String m2128 = C0483.m2128(f73355, 147, 4, i91);
                    StringBuilder sb21 = new StringBuilder(m2128);
                    C3245.m9923(sb21, c22708.f73364.m39547());
                    ViewOnClickListenerC8597.m22320(spannableStringBuilder2, C0050.m947(sb21));
                    ViewOnClickListenerC8597.m22322(spannableStringBuilder2, C1773.m5917(f73355, 151, 6, i91));
                    m3592 = C1047.m3592(spannableStringBuilder2);
                    String m19110 = C7106.m19110(f73355, 157, 1, i91);
                    StringBuilder sb22 = new StringBuilder(m19110);
                    C3245.m9923(sb22, str7);
                    C3537.m10742(spannableStringBuilder2, C0050.m947(sb22));
                    c6 = '@';
                    if (C1711.m5741(str7) > 0) {
                        int m69819 = C2105.m6981("֫۟") ^ i85;
                        i82 = i22;
                        str22 = m2128;
                        i88 = i23;
                        i96 = i25;
                        sb15 = sb6;
                        str23 = m19110;
                        i90 = m3592;
                        str26 = str6;
                        arrayList8 = arrayList3;
                        c20 = c5;
                        i97 = i24;
                        i89 = i20;
                        i93 = i21;
                        interfaceC14548 = interfaceC14543;
                        c19 = '@';
                        i95 = 1;
                        str25 = str7;
                        i87 = m69819 ^ (-1954826957);
                        i86 = ((m69819 ^ i84) * (-16619)) ^ 77259105;
                        sb16 = sb5;
                        i92 = 33;
                    } else {
                        str22 = m2128;
                        i92 = 33;
                        str23 = m19110;
                        i26 = 1;
                        int m256613 = (C0630.m2566("ۢܿ") + i84) * 35;
                        String str27 = str7;
                        i86 = ((m256613 ^ i85) * 11899) ^ 1579628672;
                        i88 = i23;
                        sb15 = sb6;
                        arrayList8 = arrayList3;
                        c20 = c5;
                        c19 = c6;
                        i96 = i25;
                        i93 = i21;
                        i95 = i26;
                        str26 = str6;
                        i97 = i24;
                        i89 = i20;
                        interfaceC14548 = interfaceC14543;
                        i87 = m256613 ^ 1815059570;
                        str25 = str27;
                        sb16 = sb5;
                        i82 = i22;
                        i90 = m3592;
                    }
                case -753811580:
                case 1476793697:
                    C0630.m2576(spannableStringBuilder2, new ForegroundColorSpan(C7466.m20005(i97, C21943.f70284)), i96, C1047.m3592(spannableStringBuilder2), i92);
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    int m256612222 = (i84 - C0630.m2566("۠᩸")) * 49;
                    i75 = ((m256612222 ^ i85) * 7317) ^ 467190183;
                    i76 = m256612222 ^ (-181711316);
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -674973399:
                case 255803195:
                    i51 = i90;
                    sb11 = sb16;
                    i52 = i82;
                    interfaceC14544 = interfaceC14548;
                    str16 = str25;
                    i12 = i97;
                    i53 = i89;
                    str17 = str26;
                    i54 = i95;
                    i55 = i93;
                    i56 = i96;
                    c15 = c20;
                    sb12 = sb15;
                    c16 = c19;
                    arrayList8 = c223722.m50216().m30767(C9896.m24993(C0382.m1844(str16, i54)));
                    z = true;
                    m69813 = C2105.m6981("֡ܰ") ^ i85;
                    i57 = ((m69813 ^ i84) * 24935) ^ (-623793948);
                    i58 = 1513552870;
                    int i10322 = m69813 ^ i58;
                    i82 = i52;
                    i96 = i56;
                    sb16 = sb11;
                    i90 = i51;
                    str26 = str17;
                    i89 = i53;
                    str25 = str16;
                    interfaceC14545 = interfaceC14544;
                    i87 = i10322;
                    i86 = i57;
                    c19 = c16;
                    sb15 = sb12;
                    c20 = c15;
                    i93 = i55;
                    i95 = i54;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -652609928:
                case 152519819:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    i44 = i95;
                    i45 = i93;
                    if (z2) {
                        m25664 = C0630.m2566("᩶ۡ") ^ i84;
                        i70 = ((m25664 ^ i85) * (-22275)) ^ 1204500122;
                        i74 = -1129952686;
                        i71 = m25664 ^ i74;
                        i93 = i45;
                        sb16 = sb3;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i71;
                        i86 = i70;
                        i89 = i20;
                        str25 = str12;
                    }
                    str15 = str22;
                    str6 = str26;
                    c12 = c20;
                    sb10 = sb15;
                    c13 = c19;
                    i25 = i96;
                    arrayList6 = arrayList8;
                    i46 = i88;
                    i47 = i90;
                    i43 = i82;
                    int m69817222 = C2105.m6981("ۤܶ") ^ i85;
                    i82 = i43;
                    str22 = str15;
                    sb16 = sb3;
                    i90 = i47;
                    i88 = i46;
                    arrayList8 = arrayList6;
                    c19 = c13;
                    sb15 = sb10;
                    c20 = c12;
                    i93 = i45;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = m69817222 ^ 1286354698;
                    i86 = ((m69817222 ^ i84) * (-29663)) ^ 776241744;
                    i96 = i25;
                    str26 = str6;
                    i89 = i20;
                    str25 = str12;
                case -599025044:
                case 1368533015:
                    C1420.m4905(sb16, c223722.m50216().m30772(interfaceC14548.mo5006()));
                    ViewOnClickListenerC8597.m22323(spannableStringBuilder2, C0050.m947(sb16));
                    sb16.setLength(i94);
                    C0630.m2567(sb16, a.h);
                    interfaceC14547 = interfaceC14548;
                    i79 = i97;
                    m25666 = (C2105.m6981("᩹᩵") ^ i85) * (-69);
                    i75 = ((m25666 ^ i84) * (-11835)) ^ 1307980762;
                    i80 = 167838901;
                    i87 = m25666 ^ i80;
                    i97 = i79;
                    interfaceC14548 = interfaceC14547;
                    i86 = i75;
                case -582271611:
                case -469188984:
                    i97 = interfaceC14548.getValue();
                    C2105.m6985(spannableStringBuilder2, new BackgroundColorSpan(i97), i96, RunnableC1937.m6382(spannableStringBuilder2), i92);
                    if (((i97 >>> 24) & 255) > c19) {
                        m25667 = C0630.m2566("ۧ֨") ^ i85;
                        i75 = ((m25667 ^ i84) * 27291) ^ 2028375706;
                        i81 = 121324313;
                        i87 = m25667 ^ i81;
                        i86 = i75;
                    }
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    int m2566122222 = (i84 - C0630.m2566("۠᩸")) * 49;
                    i75 = ((m2566122222 ^ i85) * 7317) ^ 467190183;
                    i76 = m2566122222 ^ (-181711316);
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case -568144653:
                case -365175697:
                    i9 = i90;
                    sb3 = sb16;
                    i10 = i82;
                    str3 = str22;
                    interfaceC14542 = interfaceC14548;
                    str4 = str25;
                    i11 = i95;
                    i12 = i97;
                    c22372 = c223722;
                    i13 = i89;
                    i14 = i93;
                    str5 = str26;
                    c3 = c20;
                    sb4 = sb15;
                    spannableStringBuilder = spannableStringBuilder2;
                    i15 = i96;
                    c4 = c19;
                    arrayList2 = arrayList8;
                    i16 = i88;
                    c12392.mo25922(c22708.f73359, c22708.f73360);
                    if (C7106.m19121(c22708.f73362)) {
                        m6981 = C2105.m6981("᩷ۜ") ^ i84;
                        i17 = ((m6981 ^ i85) * 1699) ^ (-1382208635);
                        i18 = -1181796357;
                    } else {
                        m6981 = C0630.m2566("ܰܰ") ^ i84;
                        i17 = ((m6981 ^ i85) * 24189) ^ (-361784006);
                        i18 = 862710128;
                    }
                    i19 = m6981 ^ i18;
                    i88 = i16;
                    c223722 = c22372;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i82 = i10;
                    arrayList8 = arrayList2;
                    c19 = c4;
                    i96 = i15;
                    sb15 = sb4;
                    i90 = i9;
                    str26 = str5;
                    c20 = c3;
                    i89 = i13;
                    i93 = i14;
                    str25 = str4;
                    i95 = i11;
                    str22 = str3;
                    sb16 = sb3;
                    interfaceC14545 = interfaceC14542;
                    i87 = i19;
                    i86 = i17;
                    i97 = i12;
                    interfaceC14548 = interfaceC14545;
                case -303577427:
                case -265853336:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str6 = str26;
                    i44 = i95;
                    i45 = i93;
                    c12 = c20;
                    sb10 = sb15;
                    ViewOnClickListenerC8597.m22314(spannableStringBuilder2, str6);
                    StringBuilder sb23 = new StringBuilder(str23);
                    C0630.m2567(sb23, C1711.m5733(str12, i94));
                    i25 = i96;
                    Object[] objArr = new Object[i44];
                    objArr[i94] = C3245.m9931(i82);
                    c13 = c19;
                    int i108 = i90;
                    C3245.m9923(sb23, String.format(C1916.m6311(f73355, 167, 4, i91), objArr));
                    C3019.m9261(spannableStringBuilder2, C0050.m947(sb23));
                    arrayList6 = arrayList8;
                    i43 = i82;
                    str15 = str22;
                    i46 = i88;
                    i47 = i108;
                    int m698172222 = C2105.m6981("ۤܶ") ^ i85;
                    i82 = i43;
                    str22 = str15;
                    sb16 = sb3;
                    i90 = i47;
                    i88 = i46;
                    arrayList8 = arrayList6;
                    c19 = c13;
                    sb15 = sb10;
                    c20 = c12;
                    i93 = i45;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = m698172222 ^ 1286354698;
                    i86 = ((m698172222 ^ i84) * (-29663)) ^ 776241744;
                    i96 = i25;
                    str26 = str6;
                    i89 = i20;
                    str25 = str12;
                case -260633742:
                case 457826566:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    if (z) {
                        m69812 = (C2105.m6981("᩻ܿ") + i85) * (-33);
                        i49 = ((m69812 ^ i84) * (-1375)) ^ (-639026959);
                        i50 = 942938413;
                    } else {
                        m69812 = C2105.m6981("֡᩵") ^ i84;
                        i49 = ((m69812 ^ i85) * (-24909)) ^ 322173531;
                        i50 = 1166372964;
                    }
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case -217386887:
                case 1383134520:
                    i79 = i97;
                    interfaceC14547 = (InterfaceC1454) C2272.m7513(it2);
                    sb16 = new StringBuilder();
                    C2105.m6979(sb16, '\n');
                    if (interfaceC14547.mo5006() != i88) {
                        m25666 = (C0630.m2566("ܺܿ") + i84) * 19;
                        i75 = ((m25666 ^ i85) * (-10795)) ^ (-780328844);
                        i80 = -940947080;
                        i87 = m25666 ^ i80;
                        i97 = i79;
                        interfaceC14548 = interfaceC14547;
                        i86 = i75;
                    }
                    m25666 = (C2105.m6981("᩹᩵") ^ i85) * (-69);
                    i75 = ((m25666 ^ i84) * (-11835)) ^ 1307980762;
                    i80 = 167838901;
                    i87 = m25666 ^ i80;
                    i97 = i79;
                    interfaceC14548 = interfaceC14547;
                    i86 = i75;
                case -134403808:
                case 324727091:
                    sb3 = sb16;
                    str13 = str22;
                    interfaceC14542 = interfaceC14548;
                    sb9 = sb15;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    str14 = str26;
                    i36 = i95;
                    i37 = i88;
                    i38 = i90;
                    i39 = i93;
                    i40 = i96;
                    i41 = i82;
                    c11 = '/';
                    if (C2958.m9036(str12, 47) > 2) {
                        int m256614 = C0630.m2566("ᩳ᩹") ^ i84;
                        int i109 = ((m256614 ^ i85) * (-7101)) ^ 1565773474;
                        i42 = m256614 ^ (-2133011771);
                        i82 = i41;
                        str22 = str13;
                        i86 = i109;
                        i96 = i40;
                        sb16 = sb3;
                        i90 = i38;
                        str26 = str14;
                        i88 = i37;
                        i89 = i20;
                        str25 = str12;
                        arrayList8 = arrayList5;
                        c19 = c10;
                        sb15 = sb9;
                        c20 = '/';
                        int i1072 = i39;
                        i95 = i36;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i42;
                        i93 = i1072;
                    }
                    int m698182 = C2105.m6981("֡ۛ") ^ i84;
                    int i1062 = ((m698182 ^ i85) * 15099) ^ (-1674444993);
                    i42 = m698182 ^ 1858356644;
                    i82 = i41;
                    str22 = str13;
                    sb16 = sb3;
                    i90 = i38;
                    i88 = i37;
                    arrayList8 = arrayList5;
                    c19 = c10;
                    sb15 = sb9;
                    c20 = c11;
                    i86 = i1062;
                    i96 = i40;
                    str26 = str14;
                    i89 = i20;
                    str25 = str12;
                    int i10722 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i42;
                    i93 = i10722;
                case -74018408:
                case 1750752348:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    try {
                        C0630.m2576(spannableStringBuilder2, new ForegroundColorSpan(C7466.m20005(i89, C21943.f70284)), i90, i93, i92);
                        str15 = str22;
                        str12 = str25;
                        i44 = i95;
                        i20 = i89;
                        i45 = i93;
                        str6 = str26;
                        c12 = c20;
                        sb10 = sb15;
                        c13 = c19;
                        i25 = i96;
                        arrayList6 = arrayList8;
                        i46 = i88;
                        i47 = i90;
                        i43 = i82;
                        int m6981722222 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m6981722222 ^ 1286354698;
                        i86 = ((m6981722222 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    } catch (Exception e5) {
                        exc = e5;
                        i27 = i90;
                        i28 = i82;
                        str8 = str22;
                        str9 = str25;
                        i32 = i95;
                        i29 = i89;
                        i33 = i93;
                        str10 = str26;
                        c7 = c20;
                        sb7 = sb15;
                        i30 = i96;
                        c8 = c19;
                        arrayList4 = arrayList8;
                        i31 = i88;
                        m2566 = (i85 - C2105.m6981("ᩴ᩷")) * (-3);
                        i17 = ((m2566 ^ i84) * 11529) ^ (-821438708);
                        i34 = -187977969;
                        i19 = m2566 ^ i34;
                        i88 = i31;
                        i95 = i32;
                        sb15 = sb7;
                        arrayList8 = arrayList4;
                        c20 = c7;
                        str22 = str8;
                        c19 = c8;
                        i93 = i33;
                        i96 = i30;
                        sb16 = sb3;
                        str26 = str10;
                        i82 = i28;
                        i89 = i29;
                        i90 = i27;
                        str25 = str9;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    }
                case -57922832:
                case 1074842256:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    i44 = i95;
                    i45 = i93;
                    c12 = c20;
                    sb10 = sb15;
                    C3019.m9261(spannableStringBuilder2, C3537.m10748(f73355, 171, 6, i91));
                    if (z) {
                        c13 = c19;
                        arrayList6 = arrayList8;
                        str15 = str22;
                        str6 = str26;
                        i46 = i88;
                        i47 = i90;
                        i25 = i96;
                        i43 = i82;
                        int m69817222222 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m69817222222 ^ 1286354698;
                        i86 = ((m69817222222 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    } else {
                        int m256615 = C0630.m2566("᩷֫") ^ i84;
                        i70 = ((m256615 ^ i85) * (-13647)) ^ (-516457797);
                        i71 = m256615 ^ (-188644020);
                        sb15 = sb10;
                        sb16 = sb3;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = i71;
                        i86 = i70;
                        i89 = i20;
                        str25 = str12;
                    }
                case 170655202:
                case 856116393:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    i44 = i95;
                    if (interfaceC21211.mo29407().mo12858() != i44) {
                        int m256616 = C0630.m2566("֫֨") ^ i84;
                        i75 = ((m256616 ^ i85) * 28009) ^ (-1873258020);
                        i76 = m256616 ^ (-1852324637);
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        sb16 = sb3;
                        i87 = i76;
                        i86 = i75;
                    } else {
                        i45 = i93;
                        str15 = str22;
                        c12 = c20;
                        sb10 = sb15;
                        str12 = str25;
                        i20 = i89;
                        c13 = c19;
                        arrayList6 = arrayList8;
                        str6 = str26;
                        i46 = i88;
                        i47 = i90;
                        i25 = i96;
                        i43 = i82;
                        int m698172222222 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m698172222222 ^ 1286354698;
                        i86 = ((m698172222222 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    }
                case 434477624:
                case 1572118567:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    str20 = str24;
                    it = C1047.m3596(arrayList8);
                    m25665 = C2105.m6981("ܶ֡") ^ i84;
                    i75 = ((m25665 ^ i85) * (-11255)) ^ 245099582;
                    i78 = -928320317;
                    i76 = m25665 ^ i78;
                    str24 = str20;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    sb16 = sb3;
                    i87 = i76;
                    i86 = i75;
                case 675653698:
                case 1599153307:
                    sb5 = sb16;
                    str11 = str22;
                    interfaceC14543 = interfaceC14548;
                    str12 = str25;
                    i24 = i97;
                    i20 = i89;
                    str6 = str26;
                    i26 = i95;
                    i21 = i93;
                    i25 = i96;
                    c5 = c20;
                    sb6 = sb15;
                    char c22 = c19;
                    arrayList3 = arrayList8;
                    i23 = i88;
                    i35 = i90;
                    i22 = i82;
                    c9 = c22;
                    if (C0798.m3000(str12, 0) != c9) {
                        int m256617 = (C0630.m2566("ۨ۟") + i85) * 65;
                        i82 = i22;
                        str22 = str11;
                        sb15 = sb6;
                        sb16 = sb5;
                        i90 = i35;
                        c20 = c5;
                        i88 = i23;
                        i93 = i21;
                        i95 = i26;
                        arrayList8 = arrayList3;
                        c19 = c9;
                        i96 = i25;
                        i97 = i24;
                        interfaceC14548 = interfaceC14543;
                        i87 = m256617 ^ (-1746768578);
                        str26 = str6;
                        i86 = ((m256617 ^ i84) * (-21943)) ^ (-405888861);
                        i89 = i20;
                        i94 = 0;
                        str25 = str12;
                    } else {
                        i94 = 0;
                        int m256618 = C0630.m2566("۫ܶ") ^ i84;
                        i82 = i22;
                        str22 = str11;
                        sb15 = sb6;
                        sb16 = sb5;
                        i90 = i35;
                        c20 = c5;
                        i93 = i21;
                        i95 = i26;
                        i97 = i24;
                        interfaceC14548 = interfaceC14543;
                        i87 = m256618 ^ (-5383704);
                        i86 = ((m256618 ^ i85) * (-28317)) ^ (-953146042);
                        i88 = i23;
                        arrayList8 = arrayList3;
                        c19 = c9;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    }
                case 1075744538:
                case 1643361579:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str9 = str25;
                    i12 = i97;
                    int i110 = i89;
                    StringBuilder sb24 = sb15;
                    i72 = i95;
                    int i111 = i93;
                    char c23 = c20;
                    if (C4159.m12563(arrayList8) > i72) {
                        m69814 = (C0630.m2566("ۡۡ") ^ i85) * (-29);
                        i49 = ((m69814 ^ i84) * 14145) ^ 384461610;
                        i73 = -1243539526;
                    } else {
                        m69814 = C2105.m6981("ܿۜ") ^ i85;
                        i49 = ((m69814 ^ i84) * 1517) ^ (-2022507928);
                        i73 = 1217165105;
                    }
                    i61 = m69814 ^ i73;
                    sb15 = sb24;
                    c20 = c23;
                    i89 = i110;
                    i93 = i111;
                    i95 = i72;
                    str25 = str9;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case 1119918702:
                case 1903504608:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i44 = i95;
                    str24 = "";
                    i20 = i89;
                    i45 = i93;
                    m25664 = (C2105.m6981("᩻᩶") + i85) * (-75);
                    i70 = ((m25664 ^ i84) * (-8621)) ^ 943284546;
                    i74 = -595215327;
                    i71 = m25664 ^ i74;
                    i93 = i45;
                    sb16 = sb3;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i71;
                    i86 = i70;
                    i89 = i20;
                    str25 = str12;
                case 1142598965:
                case 1225686477:
                    sb5 = sb16;
                    str11 = str22;
                    interfaceC14543 = interfaceC14548;
                    str12 = str25;
                    i24 = i97;
                    i20 = i89;
                    str6 = str26;
                    i26 = i95;
                    i21 = i93;
                    i25 = i96;
                    c5 = c20;
                    sb6 = sb15;
                    char c24 = c19;
                    arrayList3 = arrayList8;
                    i23 = i88;
                    i35 = i90;
                    i22 = i82;
                    if (C0798.m3000(str12, i94) == '?') {
                        c9 = c24;
                        int m2566182 = C0630.m2566("۫ܶ") ^ i84;
                        i82 = i22;
                        str22 = str11;
                        sb15 = sb6;
                        sb16 = sb5;
                        i90 = i35;
                        c20 = c5;
                        i93 = i21;
                        i95 = i26;
                        i97 = i24;
                        interfaceC14548 = interfaceC14543;
                        i87 = m2566182 ^ (-5383704);
                        i86 = ((m2566182 ^ i85) * (-28317)) ^ (-953146042);
                        i88 = i23;
                        arrayList8 = arrayList3;
                        c19 = c9;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    } else {
                        str7 = str12;
                        str22 = str11;
                        c6 = c24;
                        m3592 = i35;
                        int m2566132 = (C0630.m2566("ۢܿ") + i84) * 35;
                        String str272 = str7;
                        i86 = ((m2566132 ^ i85) * 11899) ^ 1579628672;
                        i88 = i23;
                        sb15 = sb6;
                        arrayList8 = arrayList3;
                        c20 = c5;
                        c19 = c6;
                        i96 = i25;
                        i93 = i21;
                        i95 = i26;
                        str26 = str6;
                        i97 = i24;
                        i89 = i20;
                        interfaceC14548 = interfaceC14543;
                        i87 = m2566132 ^ 1815059570;
                        str25 = str272;
                        sb16 = sb5;
                        i82 = i22;
                        i90 = m3592;
                    }
                case 1410655413:
                case 1839898781:
                    i = i90;
                    sb = sb16;
                    interfaceC1454 = interfaceC14548;
                    str = str25;
                    i2 = i97;
                    i3 = i89;
                    str2 = str26;
                    i4 = i95;
                    i5 = i93;
                    i6 = i96;
                    c = c20;
                    sb2 = sb15;
                    c2 = c19;
                    ViewOnClickListenerC8597.m22314(spannableStringBuilder2, str2);
                    StringBuilder sb25 = new StringBuilder(str23);
                    C0630.m2567(sb25, C0798.m3000(str, i94));
                    C3245.m9923(sb25, interfaceC21211.mo47886());
                    C3537.m10742(spannableStringBuilder2, C0050.m947(sb25));
                    int m698110 = (C2105.m6981("ۢ᩸") + i85) * 55;
                    i7 = ((m698110 ^ i84) * (-7763)) ^ 338045607;
                    i8 = m698110 ^ (-189644299);
                    i96 = i6;
                    c19 = c2;
                    sb16 = sb;
                    str26 = str2;
                    sb15 = sb2;
                    i89 = i3;
                    str25 = str;
                    c20 = c;
                    i93 = i5;
                    i95 = i4;
                    i97 = i2;
                    interfaceC14548 = interfaceC1454;
                    i87 = i8;
                    i86 = i7;
                    i90 = i;
                case 1665836999:
                case 1735720161:
                    i48 = i90;
                    sb3 = sb16;
                    i41 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str14 = str26;
                    i36 = i95;
                    i39 = i93;
                    i40 = i96;
                    c14 = c20;
                    sb9 = sb15;
                    c10 = c19;
                    arrayList5 = arrayList8;
                    interfaceC21211 = (InterfaceC21211) C21923.m49339(arrayList5, i94);
                    if (z) {
                        m69812 = (i84 - C2105.m6981("۟ۤ")) * (-111);
                        i49 = ((m69812 ^ i85) * 6279) ^ (-1268399929);
                        i50 = -731706452;
                    } else {
                        m69812 = C2105.m6981("᩵ۘ") ^ i85;
                        i49 = ((m69812 ^ i84) * 18163) ^ (-690140203);
                        i50 = -2143422326;
                    }
                    i61 = m69812 ^ i50;
                    i82 = i41;
                    arrayList8 = arrayList5;
                    i96 = i40;
                    c19 = c10;
                    i90 = i48;
                    str26 = str14;
                    sb15 = sb9;
                    i89 = i20;
                    str25 = str12;
                    c20 = c14;
                    i93 = i39;
                    i95 = i36;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = i61;
                    i86 = i49;
                    sb16 = sb3;
                case 1974766363:
                case 2000739034:
                    int i112 = i90;
                    sb3 = sb16;
                    i43 = i82;
                    interfaceC14542 = interfaceC14548;
                    str12 = str25;
                    i12 = i97;
                    i20 = i89;
                    str6 = str26;
                    i44 = i95;
                    i45 = i93;
                    i25 = i96;
                    c12 = c20;
                    sb10 = sb15;
                    c13 = c19;
                    arrayList6 = arrayList8;
                    str15 = str22;
                    StringBuilder sb26 = new StringBuilder(str15);
                    C1420.m4905(sb26, C4616.m13559(exc));
                    C3019.m9261(spannableStringBuilder2, C0422.m1959(sb26));
                    i46 = i88;
                    i47 = i112;
                    C2105.m6985(spannableStringBuilder2, new ForegroundColorSpan(C21943.f70293), i47, C1047.m3592(spannableStringBuilder2), i92);
                    int m6981722222222 = C2105.m6981("ۤܶ") ^ i85;
                    i82 = i43;
                    str22 = str15;
                    sb16 = sb3;
                    i90 = i47;
                    i88 = i46;
                    arrayList8 = arrayList6;
                    c19 = c13;
                    sb15 = sb10;
                    c20 = c12;
                    i93 = i45;
                    i95 = i44;
                    i97 = i12;
                    interfaceC14548 = interfaceC14542;
                    i87 = m6981722222222 ^ 1286354698;
                    i86 = ((m6981722222222 ^ i84) * (-29663)) ^ 776241744;
                    i96 = i25;
                    str26 = str6;
                    i89 = i20;
                    str25 = str12;
                case 2055823339:
                case 2103477454:
                    sb3 = sb16;
                    interfaceC14542 = interfaceC14548;
                    i12 = i97;
                    if (C1294.m4369(C2958.m9030(interfaceC21211.getType()), C2167.m7159(f73355, 186, 2, i91))) {
                        str15 = str22;
                        str12 = str25;
                        i44 = i95;
                        i20 = i89;
                        i45 = i93;
                        str6 = str26;
                        c12 = c20;
                        sb10 = sb15;
                        c13 = c19;
                        i25 = i96;
                        arrayList6 = arrayList8;
                        i46 = i88;
                        i47 = i90;
                        i43 = i82;
                        int m69817222222222 = C2105.m6981("ۤܶ") ^ i85;
                        i82 = i43;
                        str22 = str15;
                        sb16 = sb3;
                        i90 = i47;
                        i88 = i46;
                        arrayList8 = arrayList6;
                        c19 = c13;
                        sb15 = sb10;
                        c20 = c12;
                        i93 = i45;
                        i95 = i44;
                        i97 = i12;
                        interfaceC14548 = interfaceC14542;
                        i87 = m69817222222222 ^ 1286354698;
                        i86 = ((m69817222222222 ^ i84) * (-29663)) ^ 776241744;
                        i96 = i25;
                        str26 = str6;
                        i89 = i20;
                        str25 = str12;
                    } else {
                        m69815 = C2105.m6981("۠ۜ") ^ i85;
                        i17 = ((m69815 ^ i84) * 10927) ^ 1726039375;
                        i77 = -842045704;
                        i19 = m69815 ^ i77;
                        sb16 = sb3;
                        interfaceC14545 = interfaceC14542;
                        i87 = i19;
                        i86 = i17;
                        i97 = i12;
                        interfaceC14548 = interfaceC14545;
                    }
                default:
                    sb = sb16;
                    interfaceC1454 = interfaceC14548;
                    str = str25;
                    i2 = i97;
                    i3 = i89;
                    StringBuilder sb27 = sb15;
                    i4 = i95;
                    i5 = i93;
                    C1420.m4905(sb27, C4117.m12353(interfaceC21211.getType()));
                    c = c20;
                    C0630.m2567(sb27, c);
                    C1420.m4905(sb27, interfaceC21211.mo29406());
                    C3537.m10742(spannableStringBuilder2, C0050.m947(sb27));
                    sb2 = sb27;
                    i = i90;
                    c2 = c19;
                    str2 = str26;
                    i6 = i96;
                    int m6981102 = (C2105.m6981("ۢ᩸") + i85) * 55;
                    i7 = ((m6981102 ^ i84) * (-7763)) ^ 338045607;
                    i8 = m6981102 ^ (-189644299);
                    i96 = i6;
                    c19 = c2;
                    sb16 = sb;
                    str26 = str2;
                    sb15 = sb2;
                    i89 = i3;
                    str25 = str;
                    c20 = c;
                    i93 = i5;
                    i95 = i4;
                    i97 = i2;
                    interfaceC14548 = interfaceC1454;
                    i87 = i8;
                    i86 = i7;
                    i90 = i;
            }
            C8960.m23096((ActivityC16315) RunnableC0588.m2429(c223722), spannableStringBuilder2);
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50730(InterfaceC7785 interfaceC7785, int i, boolean z) {
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = 0;
        int i4 = 55161977;
        int i5 = C5695.f17556;
        int i6 = C3911.f12484;
        int m2566 = C0630.m2566("ۚܺ") ^ i6;
        int i7 = ((m2566 ^ i5) * 29661) ^ (-1326063820);
        int i8 = -157010151;
        while (true) {
            i4 = ((((i4 ^ i5) * 4807) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -2100834292:
                case -698155171:
                    i2 = -1;
                    if (i3 == -1) {
                        m2566 = C2105.m6981("ܿۨ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-32251)) ^ 1174095441;
                        i8 = 1275886348;
                    } else {
                        m2566 = (C2105.m6981("ۘ᩵") ^ i5) * (-43);
                        i7 = ((m2566 ^ i6) * (-31893)) ^ 602376939;
                        i8 = -119008290;
                    }
                case -2072713469:
                case -1891988734:
                    if (C5695.f17556 >= 0) {
                        m2566 = (C2105.m6981("۠᩻") ^ i6) * 37;
                        i7 = ((m2566 ^ i5) * 8033) ^ 704212345;
                        i8 = -1438706916;
                    } else {
                        m2566 = C2105.m6981("ۨ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * 30299) ^ 1894073203;
                        i8 = 700754605;
                    }
                case -1866038156:
                case -1589920558:
                    return i2;
                case -1763126025:
                case 1590089993:
                    return i3;
                case -1745843697:
                case 1209260852:
                    C1294.m4372();
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("ۖۘ") ^ i5;
                        i7 = ((m2566 ^ i6) * 1991) ^ (-742372632);
                        i8 = 191475633;
                    } else {
                        m2566 = (i6 - C2105.m6981("ܿ᩸")) * 25;
                        i7 = ((m2566 ^ i5) * 531) ^ (-1462333066);
                        i8 = 866514528;
                    }
                case -1718121943:
                case 438724846:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C2105.m6981("ܳᩳ") ^ i5) * (-33);
                        i7 = ((m2566 ^ i6) * 19403) ^ (-1852723628);
                        i8 = 850806073;
                    } else {
                        m2566 = (C0630.m2566("֨֫") ^ i6) * (-49);
                        i7 = ((m2566 ^ i5) * (-13775)) ^ 1314251581;
                        i8 = 1896405441;
                    }
                case -1703674939:
                case 1654771748:
                    if (C0237.f1507 != 0) {
                        m2566 = (C2105.m6981("ܳᩳ") ^ i5) * (-33);
                        i7 = ((m2566 ^ i6) * 19403) ^ (-1852723628);
                        i8 = 850806073;
                    } else {
                        m2566 = (i5 - C2105.m6981("ܳܺ")) * 49;
                        i7 = ((m2566 ^ i6) * (-2417)) ^ 1586550596;
                        i8 = -930125050;
                    }
                case -1643930611:
                case -1127154670:
                    if (C0050.m940() <= 0) {
                        m2566 = (C2105.m6981("۠᩻") ^ i6) * 37;
                        i7 = ((m2566 ^ i5) * 8033) ^ 704212345;
                        i8 = -1438706916;
                    } else {
                        m2566 = (C0630.m2566("ۛ᩶") ^ i6) * 73;
                        i7 = ((m2566 ^ i5) * 25541) ^ (-1062578965);
                        i8 = -1084676019;
                    }
                case -1343324682:
                case -1330710695:
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۖۘ") ^ i5;
                        i7 = ((m2566 ^ i6) * 1991) ^ (-742372632);
                        i8 = 191475633;
                    } else {
                        m2566 = C2105.m6981("֨ܺ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-2135)) ^ 2011302223;
                        i8 = 1932790472;
                    }
                case -1082654453:
                case 1668848187:
                    if (C1128.m3851() <= 0) {
                        m2566 = (i6 - C2105.m6981("ܿ᩸")) * 25;
                        i7 = ((m2566 ^ i5) * 531) ^ (-1462333066);
                        i8 = 866514528;
                    } else {
                        m2566 = (C2105.m6981("ܰۜ") ^ i5) * 51;
                        i7 = ((m2566 ^ i6) * (-24805)) ^ (-320871690);
                        i8 = 72371446;
                    }
                case -1078737668:
                case 1627172507:
                    C4263.m12819();
                    m2566 = (C2105.m6981("ܳᩳ") ^ i5) * (-33);
                    i7 = ((m2566 ^ i6) * 19403) ^ (-1852723628);
                    i8 = 850806073;
                case -990676363:
                case -362806823:
                    if (C2958.f9394 >= 0) {
                        m2566 = C2105.m6981("֨ۛ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-1407)) ^ 636031946;
                        i8 = -1359983854;
                    } else {
                        m2566 = C0630.m2566("۠ܿ") ^ i5;
                        i7 = ((m2566 ^ i6) * 29549) ^ (-473135283);
                        i8 = -103110076;
                    }
                case -790954334:
                case 1269698259:
                    i3 = TextUtils.indexOf(interfaceC7785, c, i);
                    m2566 = (i6 - C2105.m6981("֨֨")) * 99;
                    i7 = ((m2566 ^ i5) * 11765) ^ (-2011468615);
                    i8 = -1611447230;
                case -548907060:
                case 484659402:
                    c2 = '\n';
                    if (z) {
                        m2566 = (i5 - C2105.m6981("ۜۖ")) * (-107);
                        i7 = ((m2566 ^ i6) * 27195) ^ 1483482512;
                        i8 = 1068143705;
                    } else {
                        m2566 = (C2105.m6981("ۗ᩵") + i6) * (-3);
                        i7 = ((m2566 ^ i5) * (-32321)) ^ 946792667;
                        i8 = 466126236;
                    }
                case -436493320:
                case 97065492:
                    if (TextUtils.indexOf(interfaceC7785, c2, i3, i) != i2) {
                        m2566 = C2105.m6981("ܿۨ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-32251)) ^ 1174095441;
                        i8 = 1275886348;
                    } else {
                        m2566 = (i6 - C2105.m6981("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m2566 ^ i5) * 30337) ^ (-1097734610);
                        i8 = -1143088498;
                    }
                case -430025436:
                case 836827212:
                    if (C1916.f6442) {
                        m2566 = (i6 - C2105.m6981("ܿ᩸")) * 25;
                        i7 = ((m2566 ^ i5) * 531) ^ (-1462333066);
                        i8 = 866514528;
                    } else {
                        m2566 = (C2105.m6981("ܳᩳ") ^ i5) * (-33);
                        i7 = ((m2566 ^ i6) * 19403) ^ (-1852723628);
                        i8 = 850806073;
                    }
                case -187485542:
                case 1981391058:
                    C3019.m9255();
                    if (C3432.f10845 >= 0) {
                        m2566 = (i6 - C2105.m6981("ܿ᩸")) * 25;
                        i7 = ((m2566 ^ i5) * 531) ^ (-1462333066);
                        i8 = 866514528;
                    } else {
                        m2566 = C2105.m6981("֨ۛ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-1407)) ^ 636031946;
                        i8 = -1359983854;
                    }
                case 209470493:
                case 1179401719:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (C2105.m6981("۠᩻") ^ i6) * 37;
                        i7 = ((m2566 ^ i5) * 8033) ^ 704212345;
                        i8 = -1438706916;
                    } else {
                        m2566 = (C2105.m6981("᩶ܶ") + i6) * 3;
                        i7 = ((m2566 ^ i5) * (-7405)) ^ 1223442137;
                        i8 = 784392058;
                    }
                case 273140396:
                case 1992427394:
                    if (C2105.f7037 != 0) {
                        m2566 = (C2105.m6981("ܳᩳ") ^ i5) * (-33);
                        i7 = ((m2566 ^ i6) * 19403) ^ (-1852723628);
                        i8 = 850806073;
                    } else {
                        m2566 = (C2105.m6981("ܺۖ") ^ i6) * (-25);
                        i7 = ((m2566 ^ i5) * 8453) ^ (-1172821975);
                        i8 = -50813091;
                    }
                case 351098444:
                case 1354380376:
                    if (C1294.f4556 >= 0) {
                        m2566 = (C2105.m6981("۠᩻") ^ i6) * 37;
                        i7 = ((m2566 ^ i5) * 8033) ^ 704212345;
                        i8 = -1438706916;
                    } else {
                        m2566 = (C0630.m2566("ܶ᩷") ^ i6) * (-23);
                        i7 = ((m2566 ^ i5) * 27203) ^ (-1632499922);
                        i8 = -669994979;
                    }
                case 653298709:
                case 1772970899:
                    c = '\"';
                    if (z) {
                        m2566 = C0630.m2566("ۘ᩶") ^ i6;
                        i7 = ((m2566 ^ i5) * (-14961)) ^ 1356367794;
                        i8 = -2087748552;
                    } else {
                        m2566 = (C2105.m6981("ۜ᩸") + i5) * (-99);
                        i7 = ((m2566 ^ i6) * 853) ^ (-1941604853);
                        i8 = 150734932;
                    }
                case 982631120:
                case 1501209104:
                    C2272.m7503();
                    return 0;
                case 1352353755:
                case 1911232240:
                    if (TextUtils.indexOf(interfaceC7785, c2, i, i3) != i2) {
                        m2566 = C2105.m6981("ܿۨ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-32251)) ^ 1174095441;
                        i8 = 1275886348;
                    } else {
                        m2566 = (i6 - C2105.m6981("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m2566 ^ i5) * 30337) ^ (-1097734610);
                        i8 = -1143088498;
                    }
                default:
                    i3 = TextUtils.lastIndexOf(interfaceC7785, c, i);
                    m2566 = (i6 - C2105.m6981("֨֨")) * 99;
                    i7 = ((m2566 ^ i5) * 11765) ^ (-2011468615);
                    i8 = -1611447230;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50731(C16809 c16809, String str) {
        C7073 c7073;
        int i;
        int i2;
        String str2;
        int i3;
        int m6981;
        int i4;
        int i5;
        String str3;
        int i6;
        C7073 c70732;
        int i7;
        int i8;
        C7073 c70733;
        int i9;
        String str4;
        int i10;
        int i11;
        int i12;
        C7073 c70734;
        int i13;
        int i14;
        int m69812;
        int i15;
        int i16;
        int m2566;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int m69813;
        int i22;
        int i23;
        int i24;
        int m69814;
        int i25;
        int i26;
        int m25662;
        int i27;
        int i28;
        int m25663;
        int i29;
        int i30;
        int i31;
        int m69815;
        int i32;
        int m25664;
        int i33;
        C7073 c70735;
        String str5;
        int i34;
        C14692 c14692;
        int i35;
        C7073 c70736;
        int m25665;
        int i36;
        int i37;
        int i38;
        String str6;
        C7073 c70737;
        int i39;
        int i40;
        int m69816;
        int i41;
        String str7;
        int m69817;
        int i42;
        C14692[] c14692Arr = null;
        int i43 = 0;
        int i44 = 0;
        boolean z = false;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i48 = 1206265829;
        int i49 = C3537.f11231;
        int i50 = C1128.f4106;
        int m25666 = C0630.m2566("ۡ֨") ^ i50;
        int i51 = ((m25666 ^ i49) * (-28319)) ^ 312807603;
        int i52 = m25666 ^ 480055311;
        C14692 c146922 = null;
        String str8 = null;
        String str9 = null;
        C7073 c70738 = null;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        boolean z7 = false;
        String[] strArr = null;
        String str10 = null;
        String str11 = null;
        int i60 = 0;
        int i61 = 0;
        while (true) {
            i48 = i52 ^ (i51 & (((i48 ^ i49) * (-21967)) >> 31));
            switch (i48) {
                case -2145624165:
                case -567866400:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if ((i43 & 8) != 0) {
                        m69813 = C2105.m6981("۫۟") ^ i50;
                        i22 = ((m69813 ^ i49) * 17659) ^ 948054348;
                        i23 = 1867137080;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    }
                    m69813 = (C0630.m2566("ۘ۠") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i22 = ((m69813 ^ i50) * (-2167)) ^ (-56543827);
                    i23 = 772242532;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -2137364751:
                case 991994438:
                    return C4117.m12351(C12534.m30763(i44), str9);
                case -2078453290:
                case 337235232:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    short s = f73355[0];
                    if (((s * s) + 387105625) - (39350 * s) >= 0) {
                        m25663 = C0630.m2566("᩹ۢ") ^ i50;
                        i51 = ((m25663 ^ i49) * (-2131)) ^ 1969376124;
                        i29 = -1885210110;
                    } else {
                        m25663 = C0630.m2566("ܰ᩻") ^ i49;
                        i51 = ((m25663 ^ i50) * 7321) ^ (-1793533487);
                        i29 = 63853851;
                    }
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -2027502013:
                case 1829935440:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    i54 = 6756;
                    m25663 = C0630.m2566("᩷֫") ^ i49;
                    i51 = ((m25663 ^ i50) * (-2721)) ^ (-933861101);
                    i29 = 600574273;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -2007346825:
                case -1474311747:
                    if ((i43 & 64) == 0) {
                        m69817 = (C2105.m6981("᩺᩹") + i49) * (-83);
                        i31 = ((m69817 ^ i50) * 31227) ^ 1438274183;
                        i42 = 449438413;
                        i52 = m69817 ^ i42;
                        i51 = i31;
                    } else {
                        i40 = i57;
                        str6 = str8;
                        m69816 = C2105.m6981("ۜܿ") ^ i50;
                        i31 = ((m69816 ^ i49) * (-21669)) ^ (-769653859);
                        i41 = 1993191704;
                        i52 = m69816 ^ i41;
                        str8 = str6;
                        i57 = i40;
                        i51 = i31;
                    }
                case -2004442676:
                case -1005894428:
                    str4 = str10;
                    i10 = i57;
                    i11 = i59;
                    i12 = i44;
                    c70734 = c70738;
                    i13 = i53;
                    C14692 c146923 = c14692Arr[i61];
                    if (ViewOnClickListenerC1958.m6437(c146923.f44875, str)) {
                        m2566 = (C0630.m2566("᩹۫") + i50) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i15 = ((m2566 ^ i49) * 18643) ^ (-181647911);
                        i17 = -336680736;
                    } else {
                        m2566 = C0630.m2566("۠᩷") ^ i49;
                        i15 = ((m2566 ^ i50) * (-10831)) ^ (-1345865795);
                        i17 = 1538978835;
                    }
                    i18 = m2566 ^ i17;
                    c146922 = c146923;
                    i53 = i13;
                    c70738 = c70734;
                    str10 = str4;
                    i24 = i10;
                    i52 = i18;
                    i51 = i15;
                    i44 = i12;
                    i59 = i11;
                    i57 = i24;
                case -1979508786:
                case -339768330:
                    C7073 c70739 = c70738;
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i2 = i53;
                    i61++;
                    c70732 = c70739;
                    i19 = i44;
                    m69815 = (C2105.m6981("ۚ᩷") ^ i50) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i51 = ((m69815 ^ i49) * (-1037)) ^ (-520357921);
                    i32 = -1214887409;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -1967712200:
                case 1597753397:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if (ViewOnClickListenerC1958.m6437(c14692Arr[i60].f44875, str11)) {
                        m69813 = C2105.m6981("ۜ֨") ^ i50;
                        i22 = ((m69813 ^ i49) * 21215) ^ (-1122490947);
                        i23 = -920740156;
                    } else {
                        m69813 = C2105.m6981("᩷᩷") ^ i50;
                        i22 = ((m69813 ^ i49) * 13999) ^ (-1642546095);
                        i23 = -434652824;
                    }
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1925307627:
                case -361079902:
                    i8 = i61;
                    str3 = str10;
                    i = i57;
                    i6 = i59;
                    c70732 = c70738;
                    i2 = i53;
                    z = true;
                    z = true;
                    if ((131072 & i43) != 0) {
                        int m25667 = (i49 - C0630.m2566("ۨܿ")) * 91;
                        i51 = ((m25667 ^ i50) * 11025) ^ 2096175334;
                        i30 = m25667 ^ (-2047917856);
                        i61 = i8;
                        i59 = i6;
                        i57 = i;
                        i44 = 17;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    } else {
                        i7 = 17;
                        int m25668 = (C0630.m2566("ۡۨ") + i50) * 127;
                        i51 = ((m25668 ^ i49) * 11099) ^ (-579837751);
                        i59 = i6;
                        i57 = i;
                        i52 = m25668 ^ 1366408491;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                        int i62 = i7;
                        i61 = i8;
                        i44 = i62;
                    }
                case -1917932385:
                case 147378089:
                    c7073 = c70738;
                    i = i57;
                    i2 = i53;
                    str2 = str8;
                    i3 = i59;
                    if (C9896.m24990(C3432.m10478(str, z ? 1 : 0))) {
                        m6981 = (C2105.m6981("᩶ܶ") + i49) * (-25);
                        i4 = ((m6981 ^ i50) * (-25879)) ^ 903309173;
                        i5 = -1585621000;
                        i21 = m6981 ^ i5;
                        i59 = i3;
                        i53 = i2;
                        c70738 = c7073;
                        i51 = i4;
                        i24 = i;
                        i52 = i21;
                        str8 = str2;
                        i57 = i24;
                    } else {
                        i19 = i44;
                        str3 = str10;
                        str8 = str2;
                        i20 = i3;
                        c70732 = c7073;
                        m69815 = (C2105.m6981("ܳۘ") ^ i50) * (-19);
                        i51 = ((m69815 ^ i49) * (-23351)) ^ (-605617517);
                        i32 = 1211913620;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case -1887945313:
                case -78251796:
                    if ((i43 & 2) != 0) {
                        i = i57;
                        i35 = i59;
                        C7073 c707310 = c70738;
                        i2 = i53;
                        c70736 = c707310;
                        m25665 = C0630.m2566("ۘۤ") ^ i49;
                        i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                        i37 = 1369802973;
                        int i63 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i63;
                        i51 = i36;
                        int i64 = i2;
                        c70738 = c70736;
                        i53 = i64;
                    } else {
                        m69817 = C0630.m2566("ۧᩴ") ^ i50;
                        i31 = ((m69817 ^ i49) * (-1415)) ^ 1872037897;
                        i42 = 1438781183;
                        i52 = m69817 ^ i42;
                        i51 = i31;
                    }
                case -1873852013:
                case -735075884:
                    i40 = i57;
                    str6 = str8;
                    if ((i43 & 32) == 0) {
                        m69816 = C2105.m6981("ܺۖ") ^ i50;
                        i31 = ((m69816 ^ i49) * (-20081)) ^ (-910691429);
                        i41 = -758842692;
                        i52 = m69816 ^ i41;
                        str8 = str6;
                        i57 = i40;
                        i51 = i31;
                    } else {
                        i39 = i40;
                        c70737 = c70738;
                        int i65 = i53;
                        int m25669 = C0630.m2566("ۨۧ") ^ i49;
                        int i66 = ((m25669 ^ i50) * 30455) ^ (-52179733);
                        i52 = m25669 ^ (-1839324665);
                        i53 = i65;
                        c70738 = c70737;
                        i51 = i66;
                        str7 = str6;
                        i57 = i39;
                        str8 = str7;
                    }
                case -1872718864:
                case -1774506712:
                    return C4117.m12351(C12534.m30763(i44), str9);
                case -1802225910:
                case 1829756467:
                    return C4117.m12351(C12534.m30763(c146922.f44877), str10);
                case -1760521243:
                case -730898891:
                    if ((i43 & 128) == 0) {
                        m69817 = (C2105.m6981("ۢ֡") + i50) * (-43);
                        i31 = ((m69817 ^ i49) * (-2865)) ^ (-1576592892);
                        i42 = 1794642047;
                        i52 = m69817 ^ i42;
                        i51 = i31;
                    } else {
                        i40 = i57;
                        str6 = str8;
                        m69816 = C0630.m2566("ᩴۘ") ^ i50;
                        i31 = ((m69816 ^ i49) * 18723) ^ (-2119548012);
                        i41 = -366035843;
                        i52 = m69816 ^ i41;
                        str8 = str6;
                        i57 = i40;
                        i51 = i31;
                    }
                case -1746873165:
                case 396169382:
                    return C12534.m30763(18);
                case -1727295151:
                case 249112998:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if ((i43 & 2) != 0) {
                        m69813 = C0630.m2566("ۖ᩵") ^ i50;
                        i22 = ((m69813 ^ i49) * (-3821)) ^ 1105410688;
                        i23 = -898354626;
                    } else {
                        m69813 = C0630.m2566("᩸ᩴ") ^ i49;
                        i22 = ((m69813 ^ i50) * 6977) ^ (-406464923);
                        i23 = -256090439;
                    }
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1700890049:
                case 923299859:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    c70732 = c70738;
                    i2 = i53;
                    int m5741 = C1711.m5741(str);
                    i19 = i44;
                    str8 = C0714.m2816(f73355, 11, 19, i54);
                    if (m5741 != z) {
                        m69815 = C0630.m2566("ܳ۫") ^ i49;
                        i51 = ((m69815 ^ i50) * 6969) ^ 1673479804;
                        i32 = 1545029325;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m69815 = (C2105.m6981("ܳۘ") ^ i50) * (-19);
                    i51 = ((m69815 ^ i49) * (-23351)) ^ (-605617517);
                    i32 = 1211913620;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -1682071275:
                case 371157085:
                    throw new Exception(str8);
                case -1630422283:
                case 635546302:
                    c7073 = c70738;
                    i = i57;
                    str2 = str8;
                    i53 = C1711.m5741(str);
                    if (i53 != i46) {
                        m69814 = (C2105.m6981("ۧۙ") + i50) * q.h;
                        i4 = ((m69814 ^ i49) * (-23909)) ^ (-1177366313);
                        i25 = -1890276129;
                    } else {
                        m69814 = (C2105.m6981("۟ᩴ") + i49) * 87;
                        i4 = ((m69814 ^ i50) * (-10763)) ^ (-571818837);
                        i25 = 1238554983;
                    }
                    i21 = m69814 ^ i25;
                    c70738 = c7073;
                    i51 = i4;
                    i24 = i;
                    i52 = i21;
                    str8 = str2;
                    i57 = i24;
                case -1555623427:
                case 929049216:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    if ((i43 & 32) == 0) {
                        m69815 = C2105.m6981("᩹᩶") ^ i50;
                        i51 = ((m69815 ^ i49) * 32283) ^ (-63614942);
                        i32 = 292684502;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m69815 = (C0630.m2566("ۧ۟") ^ i49) * (-69);
                    i51 = ((m69815 ^ i50) * 21953) ^ (-335622437);
                    i32 = -833962220;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -1538479775:
                case -1306664460:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    z6 = z5;
                    z4 = false;
                    m69813 = C0630.m2566("֨ᩴ") ^ i49;
                    i22 = ((m69813 ^ i50) * (-9903)) ^ 232554565;
                    i23 = 936182471;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1527072318:
                case 1139274418:
                    i40 = i57;
                    str6 = str8;
                    if (i40 == 6) {
                        m69816 = (C2105.m6981("ۖ᩻") + i49) * 79;
                        i31 = ((m69816 ^ i50) * 20327) ^ 635975951;
                        i41 = 1812660788;
                        i52 = m69816 ^ i41;
                        str8 = str6;
                        i57 = i40;
                        i51 = i31;
                    }
                    m69816 = C0630.m2566("ᩴۘ") ^ i50;
                    i31 = ((m69816 ^ i49) * 18723) ^ (-2119548012);
                    i41 = -366035843;
                    i52 = m69816 ^ i41;
                    str8 = str6;
                    i57 = i40;
                    i51 = i31;
                case -1481165843:
                case -1445668206:
                    i26 = i57;
                    str2 = str8;
                    if (i53 != i45) {
                        m25662 = (C2105.m6981("᩹ᩳ") + i50) * (-33);
                        i22 = ((m25662 ^ i49) * 9655) ^ (-596365736);
                        i27 = -231674315;
                    } else {
                        m25662 = (C0630.m2566("᩷᩵") ^ i50) * (-25);
                        i22 = ((m25662 ^ i49) * (-15117)) ^ 867405105;
                        i27 = 2045408273;
                    }
                    i24 = i26;
                    i52 = m25662 ^ i27;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1359474397:
                case -677595667:
                    i10 = i57;
                    str4 = str10;
                    str8 = str8;
                    z3 = z6;
                    i11 = i59;
                    z2 = true;
                    i12 = i44;
                    c70734 = c70738;
                    i13 = i53;
                    i14 = i56;
                    m69812 = (i49 - C0630.m2566("ܺ᩷")) * 21;
                    i15 = ((m69812 ^ i50) * 5635) ^ (-1402236995);
                    i16 = -425464751;
                    i18 = m69812 ^ i16;
                    i56 = i14;
                    i53 = i13;
                    c70738 = c70734;
                    str10 = str4;
                    i24 = i10;
                    i52 = i18;
                    i51 = i15;
                    i44 = i12;
                    i59 = i11;
                    i57 = i24;
                case -1276521399:
                case -58507069:
                    C7073 c707311 = c70738;
                    i = i57;
                    i2 = i53;
                    String str12 = str8;
                    if ((i43 & 128) != 0) {
                        str3 = str10;
                        str8 = str12;
                        i20 = i59;
                        c70732 = c707311;
                        i19 = i44;
                        m69815 = (C0630.m2566("ۧ۟") ^ i49) * (-69);
                        i51 = ((m69815 ^ i50) * 21953) ^ (-335622437);
                        i32 = -833962220;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    } else {
                        c70736 = c707311;
                        str8 = str12;
                        i35 = i59;
                        m25665 = C0630.m2566("ۘۤ") ^ i49;
                        i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                        i37 = 1369802973;
                        int i632 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i632;
                        i51 = i36;
                        int i642 = i2;
                        c70738 = c70736;
                        i53 = i642;
                    }
                case -1230997582:
                case -751346041:
                    i2 = i53;
                    i = i57;
                    i35 = i59;
                    c70736 = new C7073();
                    if (C9896.m24995(str, c70736)) {
                        m25665 = C0630.m2566("᩸ܰ") ^ i49;
                        i36 = ((m25665 ^ i50) * 7601) ^ 62900954;
                        i37 = 192394275;
                        int i6322 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i6322;
                        i51 = i36;
                        int i6422 = i2;
                        c70738 = c70736;
                        i53 = i6422;
                    }
                    m25665 = C0630.m2566("ۘۤ") ^ i49;
                    i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                    i37 = 1369802973;
                    int i63222 = m25665 ^ i37;
                    i59 = i35;
                    i57 = i;
                    i52 = i63222;
                    i51 = i36;
                    int i64222 = i2;
                    c70738 = c70736;
                    i53 = i64222;
                case -1227412907:
                case 797806080:
                    c7073 = c70738;
                    i = i57;
                    i2 = i53;
                    str2 = str8;
                    i3 = i59;
                    if (i60 < i3) {
                        m6981 = C2105.m6981("ܳۨ") ^ i49;
                        i4 = ((m6981 ^ i50) * (-13507)) ^ 605915638;
                        i5 = 1527706215;
                    } else {
                        m6981 = (C0630.m2566("ۨۗ") ^ i50) * 93;
                        i4 = ((m6981 ^ i49) * (-16287)) ^ (-171336364);
                        i5 = -1139854262;
                    }
                    i21 = m6981 ^ i5;
                    i59 = i3;
                    i53 = i2;
                    c70738 = c7073;
                    i51 = i4;
                    i24 = i;
                    i52 = i21;
                    str8 = str2;
                    i57 = i24;
                case -1202135126:
                case -428554431:
                    i26 = i57;
                    str2 = str8;
                    if (z4) {
                        m25662 = (C2105.m6981("᩵᩺") ^ i49) * (-9);
                        i22 = ((m25662 ^ i50) * (-7495)) ^ (-1711779276);
                        i27 = -1053534760;
                    } else {
                        m25662 = C0630.m2566("᩺۫") ^ i49;
                        i22 = ((m25662 ^ i50) * 625) ^ 431425613;
                        i27 = 103186966;
                    }
                    i24 = i26;
                    i52 = m25662 ^ i27;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1199282082:
                case -261784557:
                    i = i57;
                    str2 = str8;
                    if (C9896.m24992(c70738)) {
                        c70733 = c70738;
                        i9 = i53;
                        m69813 = (C0630.m2566("֫ܺ") ^ i50) * (-63);
                        i22 = ((m69813 ^ i49) * 12093) ^ 162492568;
                        i23 = -233372774;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    } else {
                        str8 = str2;
                        i35 = i59;
                        C7073 c7073102 = c70738;
                        i2 = i53;
                        c70736 = c7073102;
                        m25665 = C0630.m2566("ۘۤ") ^ i49;
                        i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                        i37 = 1369802973;
                        int i632222 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i632222;
                        i51 = i36;
                        int i642222 = i2;
                        c70738 = c70736;
                        i53 = i642222;
                    }
                case -1176893255:
                case -769145307:
                    throw new Exception(C4263.m12817(f73355, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 30, i54));
                case -1148362215:
                case 746508199:
                    c70735 = c70738;
                    i = i57;
                    i2 = i53;
                    int i67 = i59;
                    if (C9896.m24994(str)) {
                        int m256610 = (C0630.m2566("ܿۘ") + i50) * 119;
                        i38 = ((m256610 ^ i49) * 14725) ^ 558928805;
                        i59 = i67;
                        i57 = i;
                        i52 = m256610 ^ 909439183;
                        C7073 c707312 = c70735;
                        i51 = i38;
                        i53 = i2;
                        c70738 = c707312;
                    } else {
                        i20 = i67;
                        i19 = i44;
                        str3 = str10;
                        c70732 = c70735;
                        m69815 = (i49 - C0630.m2566("ܺܰ")) * 91;
                        i51 = ((m69815 ^ i50) * (-3085)) ^ 1710082881;
                        i32 = -1156250468;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case -1140612923:
                case 1466616360:
                    throw new Exception(C3663.m11162(f73355, 50, 26, i54));
                case -1137121108:
                case -1006647304:
                    return C12534.m30763(i44);
                case -1056860143:
                case 1469065175:
                    str4 = str10;
                    i10 = i57;
                    i11 = i59;
                    i12 = i44;
                    c70734 = c70738;
                    i13 = i53;
                    i14 = i56;
                    if (i47 < i14) {
                        m69812 = (i50 - C2105.m6981("ۙۜ")) * (-47);
                        i15 = ((m69812 ^ i49) * (-30407)) ^ (-624942889);
                        i16 = -1309837324;
                        i18 = m69812 ^ i16;
                        i56 = i14;
                        i53 = i13;
                        c70738 = c70734;
                        str10 = str4;
                        i24 = i10;
                        i52 = i18;
                        i51 = i15;
                        i44 = i12;
                        i59 = i11;
                        i57 = i24;
                    } else {
                        z3 = z5;
                        z2 = z7;
                        m69812 = (i49 - C0630.m2566("ܺ᩷")) * 21;
                        i15 = ((m69812 ^ i50) * 5635) ^ (-1402236995);
                        i16 = -425464751;
                        i18 = m69812 ^ i16;
                        i56 = i14;
                        i53 = i13;
                        c70738 = c70734;
                        str10 = str4;
                        i24 = i10;
                        i52 = i18;
                        i51 = i15;
                        i44 = i12;
                        i59 = i11;
                        i57 = i24;
                    }
                case -1046854848:
                case 1989138575:
                    i = i57;
                    str2 = str8;
                    c70733 = c70738;
                    z4 = true;
                    z6 = true;
                    i9 = i53;
                    m69813 = C0630.m2566("֨ᩴ") ^ i49;
                    i22 = ((m69813 ^ i50) * (-9903)) ^ 232554565;
                    i23 = 936182471;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -1024402519:
                case -63701682:
                    return C12534.m30763(3);
                case -1011382993:
                case -413591232:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    if (C9896.m25000(str)) {
                        m69815 = C0630.m2566("۫ܰ") ^ i50;
                        i51 = ((m69815 ^ i49) * 32025) ^ (-762625491);
                        i32 = 1466408349;
                    } else {
                        m69815 = (i49 - C0630.m2566("ۘۡ")) * 73;
                        i51 = ((m69815 ^ i50) * (-13825)) ^ 1536921601;
                        i32 = 1980459408;
                    }
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -931417428:
                case 806733408:
                    if (i53 == 9) {
                        m69817 = C0630.m2566("ܳۙ") ^ i49;
                        i31 = ((m69817 ^ i50) * 28083) ^ 859887642;
                        i42 = -304120442;
                    } else {
                        m69817 = C0630.m2566("ᩴ᩵") ^ i50;
                        i31 = ((m69817 ^ i49) * 5383) ^ (-766612527);
                        i42 = -486030288;
                    }
                    i52 = m69817 ^ i42;
                    i51 = i31;
                case -913044821:
                case 1779761412:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    if (C4616.m13554(str, C2958.m9031(f73355, 10, 1, i54))) {
                        m69815 = (i50 - C0630.m2566("᩷ܳ")) * (-41);
                        i51 = ((m69815 ^ i49) * (-16911)) ^ 1246180082;
                        i32 = 968963787;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    } else {
                        i28 = i61;
                        m25663 = (i50 - C2105.m6981("ܿ᩶")) * 109;
                        i51 = ((m25663 ^ i49) * (-20737)) ^ 931597135;
                        i29 = -738068656;
                        i30 = m25663 ^ i29;
                        i61 = i28;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case -875388250:
                case -227131617:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    z7 = false;
                    f73356 = false;
                    int i68 = c16809.f51608;
                    c14692Arr = c16809.f51607;
                    i43 = c16809.f51608;
                    i58 = 16;
                    if ((i68 & 65536) != 0) {
                        int m69818 = C2105.m6981("ۧ᩷") ^ i49;
                        i61 = i28;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = m69818 ^ (-2119502898);
                        i51 = ((m69818 ^ i50) * 26585) ^ 1985338967;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m25663 = (i50 - C2105.m6981("ܰۡ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i51 = ((m25663 ^ i49) * (-27981)) ^ (-1010172770);
                    i29 = 1038476524;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -763912166:
                case -604278806:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    i54 = 52930;
                    m25663 = C0630.m2566("᩷֫") ^ i49;
                    i51 = ((m25663 ^ i50) * (-2721)) ^ (-933861101);
                    i29 = 600574273;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -759522944:
                case 1131899510:
                    C7073 c707313 = c70738;
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i2 = i53;
                    c70732 = c707313;
                    str9 = C7811.m20837(f73355, 30, 8, i54);
                    if (!z2) {
                        m25664 = C2105.m6981("ܺۢ") ^ i50;
                        i51 = ((m25664 ^ i49) * (-31901)) ^ 666790744;
                        i33 = 459920564;
                        i30 = m25664 ^ i33;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m25664 = C0630.m2566("֫ܳ") ^ i49;
                    i51 = ((m25664 ^ i50) * (-211)) ^ (-149795331);
                    i33 = -1370202341;
                    i30 = m25664 ^ i33;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -725854737:
                case -292491200:
                    i34 = i57;
                    i60++;
                    c70735 = c70738;
                    str5 = str10;
                    i2 = i53;
                    c14692 = c146922;
                    int m69819 = C2105.m6981("֨ۧ") ^ i50;
                    c146922 = c14692;
                    i38 = ((m69819 ^ i49) * (-14891)) ^ 486468372;
                    i57 = i34;
                    i52 = m69819 ^ (-1101816926);
                    str10 = str5;
                    C7073 c7073122 = c70735;
                    i51 = i38;
                    i53 = i2;
                    c70738 = c7073122;
                case -633332824:
                case 782269873:
                    if ((i43 & 2) != 0) {
                        i = i57;
                        i35 = i59;
                        C7073 c70731022 = c70738;
                        i2 = i53;
                        c70736 = c70731022;
                        m25665 = C0630.m2566("ۘۤ") ^ i49;
                        i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                        i37 = 1369802973;
                        int i6322222 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i6322222;
                        i51 = i36;
                        int i6422222 = i2;
                        c70738 = c70736;
                        i53 = i6422222;
                    } else {
                        m69817 = (C2105.m6981("ۤ۠") + i49) * (-109);
                        i31 = ((m69817 ^ i50) * 4173) ^ 2112500319;
                        i42 = -457365094;
                        i52 = m69817 ^ i42;
                        i51 = i31;
                    }
                case -624065583:
                case -435707119:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if ((i43 & 2) != 0) {
                        m69813 = (i49 - C0630.m2566("ۘ֡")) * (-87);
                        i22 = ((m69813 ^ i50) * (-4623)) ^ (-653068900);
                        i23 = 48414327;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    }
                    m69813 = (C0630.m2566("֫ܺ") ^ i50) * (-63);
                    i22 = ((m69813 ^ i49) * 12093) ^ 162492568;
                    i23 = -233372774;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case -589973245:
                case 1602198705:
                    f73356 = z;
                    return C12534.m30763(29);
                case -569918911:
                case 1975464529:
                    c70735 = c70738;
                    str5 = str10;
                    i34 = i57;
                    i2 = i53;
                    c14692 = c146922;
                    str11 = C2126.m7038(strArr[i47]);
                    i59 = c14692Arr.length;
                    i60 = 0;
                    int m698192 = C2105.m6981("֨ۧ") ^ i50;
                    c146922 = c14692;
                    i38 = ((m698192 ^ i49) * (-14891)) ^ 486468372;
                    i57 = i34;
                    i52 = m698192 ^ (-1101816926);
                    str10 = str5;
                    C7073 c70731222 = c70735;
                    i51 = i38;
                    i53 = i2;
                    c70738 = c70731222;
                case -566099585:
                case 347939563:
                    i40 = i57;
                    str6 = str8;
                    if (i53 != 7) {
                        m69816 = (C2105.m6981("ۜۗ") ^ i49) * (-85);
                        i31 = ((m69816 ^ i50) * (-30095)) ^ (-834928881);
                        i41 = -1792000489;
                    } else {
                        m69816 = C0630.m2566("֫ۡ") ^ i50;
                        i31 = ((m69816 ^ i49) * (-5207)) ^ (-627766394);
                        i41 = 1476079087;
                    }
                    i52 = m69816 ^ i41;
                    str8 = str6;
                    i57 = i40;
                    i51 = i31;
                case -492207791:
                case 211096631:
                    i40 = i57;
                    if (i40 == i45) {
                        int m698110 = (C2105.m6981("ۘ۟") ^ i49) * 95;
                        i52 = m698110 ^ 1538045156;
                        str7 = str8;
                        i57 = i40;
                        i51 = ((m698110 ^ i50) * (-16327)) ^ 62406281;
                        str8 = str7;
                    } else {
                        str6 = str8;
                        m69816 = C2105.m6981("ۜܿ") ^ i50;
                        i31 = ((m69816 ^ i49) * (-21669)) ^ (-769653859);
                        i41 = 1993191704;
                        i52 = m69816 ^ i41;
                        str8 = str6;
                        i57 = i40;
                        i51 = i31;
                    }
                case -450383784:
                case 1728529904:
                    if ((i43 & 2) != 0) {
                        i = i57;
                        i35 = i59;
                        C7073 c707310222 = c70738;
                        i2 = i53;
                        c70736 = c707310222;
                        m25665 = C0630.m2566("ۘۤ") ^ i49;
                        i36 = ((m25665 ^ i50) * (-25245)) ^ 1165748369;
                        i37 = 1369802973;
                        int i63222222 = m25665 ^ i37;
                        i59 = i35;
                        i57 = i;
                        i52 = i63222222;
                        i51 = i36;
                        int i64222222 = i2;
                        c70738 = c70736;
                        i53 = i64222222;
                    } else {
                        m69817 = C0630.m2566("ᩴܳ") ^ i49;
                        i31 = ((m69817 ^ i50) * 18121) ^ (-119915271);
                        i42 = 1751138252;
                        i52 = m69817 ^ i42;
                        i51 = i31;
                    }
                case -437063406:
                case 1608730608:
                    return C12534.m30763(i58);
                case -343896711:
                case 898876605:
                    throw new Exception(str8);
                case -313430788:
                case 1632104513:
                    i47++;
                    i = i57;
                    str3 = str10;
                    z5 = z6;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    m25663 = C2105.m6981("ۤ֡") ^ i50;
                    i51 = ((m25663 ^ i49) * 30951) ^ (-1775150177);
                    i29 = -914012956;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -234637460:
                case 1558559309:
                    return C4117.m12351(C12534.m30763(i58), str10);
                case -229289166:
                case 334312852:
                    c7073 = c70738;
                    i = i57;
                    i2 = i53;
                    str2 = str8;
                    i3 = i59;
                    if (z3) {
                        m6981 = C0630.m2566("ܺ۟") ^ i50;
                        i4 = ((m6981 ^ i49) * 2291) ^ 594030109;
                        i5 = -1729858851;
                        i21 = m6981 ^ i5;
                        i59 = i3;
                        i53 = i2;
                        c70738 = c7073;
                        i51 = i4;
                        i24 = i;
                        i52 = i21;
                        str8 = str2;
                        i57 = i24;
                    } else {
                        str3 = str10;
                        str8 = str2;
                        i20 = i3;
                        c70732 = c7073;
                        m25664 = C0630.m2566("֫ܳ") ^ i49;
                        i51 = ((m25664 ^ i50) * (-211)) ^ (-149795331);
                        i33 = -1370202341;
                        i30 = m25664 ^ i33;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case -152906069:
                case 1271762957:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    if ((i43 & 4) != 0) {
                        m69815 = C2105.m6981("ۘۢ") ^ i49;
                        i51 = ((m69815 ^ i50) * (-28647)) ^ 253968679;
                        i32 = 920702464;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m69815 = (i49 - C0630.m2566("ܺܰ")) * 91;
                    i51 = ((m69815 ^ i50) * (-3085)) ^ 1710082881;
                    i32 = -1156250468;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case -15608946:
                case 1953451999:
                    int i69 = i57;
                    str2 = str8;
                    i = i69;
                    if (C1294.m4369(str, C1773.m5917(f73355, 45, 5, i54))) {
                        c70733 = c70738;
                        i9 = i53;
                        m69813 = C2105.m6981("᩶ۤ") ^ i49;
                        i22 = ((m69813 ^ i50) * 15471) ^ 1159900801;
                        i23 = -970512446;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    } else {
                        c70733 = c70738;
                        i9 = i53;
                        m69813 = (C0630.m2566("ۘ۠") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((m69813 ^ i50) * (-2167)) ^ (-56543827);
                        i23 = 772242532;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    }
                case 44946858:
                case 1755098810:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    i45 = 5;
                    i46 = 4;
                    if ((i43 & 16) != 0) {
                        m25663 = (C2105.m6981("᩶᩵") ^ i49) * (-31);
                        i51 = ((m25663 ^ i50) * (-1883)) ^ (-1428174946);
                        i29 = -261823151;
                        i30 = m25663 ^ i29;
                        i61 = i28;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m25663 = (i50 - C2105.m6981("ܿ᩶")) * 109;
                    i51 = ((m25663 ^ i49) * (-20737)) ^ 931597135;
                    i29 = -738068656;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case 146245796:
                case 1564932442:
                    throw new Exception(C2167.m7159(f73355, 76, 29, i54));
                case 160952449:
                case 851934558:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    i28 = i61;
                    c70732 = c70738;
                    i2 = i53;
                    String[] m4374 = C1294.m4374(str, C3911.m11919(f73355, 1, 2, i54));
                    i47 = 0;
                    strArr = m4374;
                    i56 = m4374.length;
                    z5 = false;
                    m25663 = C2105.m6981("ۤ֡") ^ i50;
                    i51 = ((m25663 ^ i49) * 30951) ^ (-1775150177);
                    i29 = -914012956;
                    i30 = m25663 ^ i29;
                    i61 = i28;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case 163805104:
                case 1412408960:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    if (!C9896.m25000(str)) {
                        m69815 = (C2105.m6981("ۗ᩺") + i49) * (-23);
                        i51 = ((m69815 ^ i50) * 24159) ^ (-1468680106);
                        i32 = 982544829;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                    m69815 = C0630.m2566("ܽ᩹") ^ i50;
                    i51 = ((m69815 ^ i49) * 13055) ^ (-751712893);
                    i32 = -91796872;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case 266753166:
                case 1976323760:
                    f73356 = z;
                    return C12534.m30763(31);
                case 316278312:
                case 1131570941:
                    C7073 c707314 = c70738;
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i2 = i53;
                    if (C9896.m24994(str)) {
                        c70732 = c707314;
                        i19 = i44;
                        m69815 = C0630.m2566("ܽ᩹") ^ i50;
                        i51 = ((m69815 ^ i49) * 13055) ^ (-751712893);
                        i32 = -91796872;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    } else {
                        c70732 = c707314;
                        i19 = i44;
                        i28 = i61;
                        m25663 = (i50 - C2105.m6981("ܰۡ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i51 = ((m25663 ^ i49) * (-27981)) ^ (-1010172770);
                        i29 = 1038476524;
                        i30 = m25663 ^ i29;
                        i61 = i28;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case 357524733:
                case 1787025628:
                    str6 = str8;
                    c70737 = c70738;
                    i39 = c70737.f21767;
                    if (i39 == i46) {
                        int m256611 = (C0630.m2566("۫ܶ") ^ i49) * 87;
                        i52 = m256611 ^ (-697754908);
                        i51 = ((m256611 ^ i50) * (-24435)) ^ 734127476;
                        i53 = i53;
                        c70738 = c70737;
                        i57 = i39;
                        str8 = str6;
                    } else {
                        int i652 = i53;
                        int m256692 = C0630.m2566("ۨۧ") ^ i49;
                        int i662 = ((m256692 ^ i50) * 30455) ^ (-52179733);
                        i52 = m256692 ^ (-1839324665);
                        i53 = i652;
                        c70738 = c70737;
                        i51 = i662;
                        str7 = str6;
                        i57 = i39;
                        str8 = str7;
                    }
                case 435505667:
                case 1788306660:
                    C7073 c707315 = c70738;
                    i = i57;
                    i20 = i59;
                    i2 = i53;
                    if ((i43 & 64) == 0) {
                        int m256612 = (C0630.m2566("ۛۛ") + i50) * (-55);
                        i31 = ((m256612 ^ i49) * 18197) ^ (-424144320);
                        i59 = i20;
                        i57 = i;
                        i52 = m256612 ^ (-672107861);
                        i53 = i2;
                        c70738 = c707315;
                        i51 = i31;
                    } else {
                        i19 = i44;
                        str3 = str10;
                        c70732 = c707315;
                        m69815 = (C0630.m2566("ۧ۟") ^ i49) * (-69);
                        i51 = ((m69815 ^ i50) * 21953) ^ (-335622437);
                        i32 = -833962220;
                        i30 = m69815 ^ i32;
                        i44 = i19;
                        i59 = i20;
                        i57 = i;
                        i52 = i30;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                    }
                case 513913813:
                case 2118741299:
                    return C12534.m30763(i57);
                case 554048527:
                case 2095064212:
                    throw new Exception(C0382.m1840(f73355, 42, 3, i54));
                case 739345103:
                case 1768452187:
                    i = i57;
                    str2 = str8;
                    if (C9896.m24994(str)) {
                        c70733 = c70738;
                        i9 = i53;
                        m69813 = (i50 - C2105.m6981("ܰ۠")) * (-117);
                        i22 = ((m69813 ^ i49) * 13841) ^ (-1773403179);
                        i23 = -1668608519;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    } else {
                        str3 = str10;
                        str8 = str2;
                        i6 = i59;
                        c70732 = c70738;
                        i2 = i53;
                        int i70 = i61;
                        i7 = i44;
                        i8 = i70;
                        int m256682 = (C0630.m2566("ۡۨ") + i50) * 127;
                        i51 = ((m256682 ^ i49) * 11099) ^ (-579837751);
                        i59 = i6;
                        i57 = i;
                        i52 = m256682 ^ 1366408491;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                        int i622 = i7;
                        i61 = i8;
                        i44 = i622;
                    }
                case 763622056:
                case 1966909514:
                    C7073 c707316 = c70738;
                    int i71 = i57;
                    int i72 = i59;
                    int i73 = i53;
                    int i74 = i44;
                    String m11225 = C3683.m11225(f73355, 3, 7, i54);
                    int i75 = i55;
                    int i76 = i61;
                    if (i76 < i75) {
                        int m698111 = (C2105.m6981("᩹ۤ") + i50) * 93;
                        i61 = i76;
                        i44 = i74;
                        i59 = i72;
                        i57 = i71;
                        i52 = m698111 ^ (-1851403029);
                        i51 = ((m698111 ^ i49) * (-3071)) ^ (-966477755);
                        i53 = i73;
                        c70738 = c707316;
                        str10 = m11225;
                        i55 = i75;
                    } else {
                        int m698112 = (i49 - C2105.m6981("ۘۘ")) * (-13);
                        i31 = ((m698112 ^ i50) * (-32185)) ^ 1532209418;
                        i61 = i76;
                        i44 = i74;
                        i59 = i72;
                        i57 = i71;
                        i52 = m698112 ^ 227203518;
                        i53 = i73;
                        c70738 = c707316;
                        str10 = m11225;
                        i55 = i75;
                        i51 = i31;
                    }
                case 867057537:
                case 1343426548:
                    str3 = str10;
                    i = i57;
                    i20 = i59;
                    i19 = i44;
                    c70732 = c70738;
                    i2 = i53;
                    i55 = c14692Arr.length;
                    i61 = 0;
                    m69815 = (C2105.m6981("ۚ᩷") ^ i50) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i51 = ((m69815 ^ i49) * (-1037)) ^ (-520357921);
                    i32 = -1214887409;
                    i30 = m69815 ^ i32;
                    i44 = i19;
                    i59 = i20;
                    i57 = i;
                    i52 = i30;
                    i53 = i2;
                    c70738 = c70732;
                    str10 = str3;
                case 872335418:
                case 1741593252:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if (!C1294.m4369(str, C7106.m19110(f73355, 38, 4, i54))) {
                        m69813 = (C0630.m2566("۠֡") ^ i50) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i22 = ((m69813 ^ i49) * 27207) ^ (-506448948);
                        i23 = -2123400385;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    }
                    m69813 = C2105.m6981("᩶ۤ") ^ i49;
                    i22 = ((m69813 ^ i50) * 15471) ^ 1159900801;
                    i23 = -970512446;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
                case 1013356490:
                case 1263011996:
                    f73356 = z;
                    return C12534.m30763(28);
                case 1394845899:
                case 1537482058:
                    f73356 = z;
                    return C12534.m30763(30);
                case 2061715942:
                case 2146297273:
                    c7073 = c70738;
                    i = i57;
                    i2 = i53;
                    str2 = str8;
                    i3 = i59;
                    if (z3) {
                        str3 = str10;
                        str8 = str2;
                        i6 = i3;
                        c70732 = c7073;
                        int i702 = i61;
                        i7 = i44;
                        i8 = i702;
                        int m2566822 = (C0630.m2566("ۡۨ") + i50) * 127;
                        i51 = ((m2566822 ^ i49) * 11099) ^ (-579837751);
                        i59 = i6;
                        i57 = i;
                        i52 = m2566822 ^ 1366408491;
                        i53 = i2;
                        c70738 = c70732;
                        str10 = str3;
                        int i6222 = i7;
                        i61 = i8;
                        i44 = i6222;
                    } else {
                        m6981 = (C2105.m6981("ۗ᩻") + i49) * (-43);
                        i4 = ((m6981 ^ i50) * (-7421)) ^ (-1767383839);
                        i5 = -1438631619;
                        i21 = m6981 ^ i5;
                        i59 = i3;
                        i53 = i2;
                        c70738 = c7073;
                        i51 = i4;
                        i24 = i;
                        i52 = i21;
                        str8 = str2;
                        i57 = i24;
                    }
                default:
                    c70733 = c70738;
                    i = i57;
                    i9 = i53;
                    str2 = str8;
                    if (!C9896.m25000(str)) {
                        m69813 = C0630.m2566("ۧܶ") ^ i49;
                        i22 = ((m69813 ^ i50) * (-19049)) ^ 1089274783;
                        i23 = -39300182;
                        i24 = i;
                        i52 = m69813 ^ i23;
                        i53 = i9;
                        c70738 = c70733;
                        i51 = i22;
                        str8 = str2;
                        i57 = i24;
                    }
                    m69813 = (i50 - C2105.m6981("ܰ۠")) * (-117);
                    i22 = ((m69813 ^ i49) * 13841) ^ (-1773403179);
                    i23 = -1668608519;
                    i24 = i;
                    i52 = m69813 ^ i23;
                    i53 = i9;
                    c70738 = c70733;
                    i51 = i22;
                    str8 = str2;
                    i57 = i24;
            }
        }
    }
}
