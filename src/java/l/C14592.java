package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.falcon.FalconVrfy;

/* compiled from: O3YD */
/* renamed from: l.ܳܳ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14592 extends AbstractC19902 {

    /* renamed from: ۨܰ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f44680 = {2857, 19571, -30086, 22644, 18716, -22823, 24180};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18827 f44681;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x014d, code lost:
    
        r8 = l.C0630.m2566("ۤܽ") ^ r6;
        r9 = ((r8 ^ r7) * (-30115)) ^ (-759779089);
        r10 = 643986255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c1, code lost:
    
        r8 = (l.C0630.m2566("᩵᩶") + r7) * 123;
        r9 = ((r8 ^ r6) * 26897) ^ 1224473294;
        r10 = 1005997776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0224, code lost:
    
        r8 = l.C0630.m2566("ۨ᩵") ^ r7;
        r9 = ((r8 ^ r6) * (-21207)) ^ (-1699967363);
        r10 = 1712816530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f3, code lost:
    
        r8 = l.C2105.m6981("ܶ۫") ^ r6;
        r9 = ((r8 ^ r7) * (-8725)) ^ (-700667520);
        r10 = 1988098659;
     */
    @Override // l.AbstractC19902
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(l.AbstractC3255 r13, int r14) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14592.onBindViewHolder(l.ۗ۬ۧ, int):void");
    }

    public C14592(ActivityC18827 activityC18827) {
        this.f44681 = activityC18827;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        if (l.C0714.f2697 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007b, code lost:
    
        if (l.C0964.f3626 != 0) goto L13;
     */
    @Override // l.AbstractC19902
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC3255 onCreateViewHolder(android.view.ViewGroup r26, int r27) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14592.onCreateViewHolder(android.view.ViewGroup, int):l.ۗ۬ۧ");
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        ActivityC18827 activityC18827 = null;
        ArrayList arrayList = null;
        AbstractC7809 abstractC7809 = null;
        int i2 = 620314503;
        int i3 = C3245.f10203;
        int i4 = C3911.f12484;
        int m6981 = (C2105.m6981("᩵۟") + i4) * 47;
        int i5 = ((m6981 ^ i3) * (-20841)) ^ 173926752;
        int i6 = -290218901;
        while (true) {
            i2 = ((((i2 ^ i3) * (-2139)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -1963439910:
                case -1240059835:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        m6981 = (i4 - C2105.m6981("ۢۚ")) * (-87);
                        i5 = ((m6981 ^ i3) * 8063) ^ (-325264626);
                        i6 = -660363231;
                    }
                case -1655770014:
                case 1687807308:
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((m6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۘܳ")) * (-125);
                        i5 = ((m6981 ^ i4) * 7739) ^ (-896175333);
                        i6 = 1132294213;
                    }
                case -1498054645:
                case -813475291:
                    return 1;
                case -1489281055:
                case 1035459268:
                    return 0;
                case -1368344810:
                case 2103780836:
                    C1773.m5908();
                    if (C0483.f2088 >= 0) {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        m6981 = C0630.m2566("ۢ֨") ^ i3;
                        i5 = ((m6981 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    }
                case -1340281173:
                case 1895279995:
                    if (abstractC7809.mo5657() == EnumC14158.f42725) {
                        m6981 = C0630.m2566("֨ۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * FalconVrfy.R) ^ (-1136120748);
                        i6 = 1079382061;
                    } else {
                        m6981 = C0630.m2566("ܰ᩸") ^ i3;
                        i5 = ((m6981 ^ i4) * (-11857)) ^ (-1673316578);
                        i6 = 533625828;
                    }
                case -1089258651:
                case 1615979077:
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        m6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i5 = ((m6981 ^ i4) * 11319) ^ 2083432912;
                        i6 = 1876474139;
                    }
                case -940989922:
                case -934280426:
                    RunnableC0588.m2441();
                    m6981 = C0630.m2566("ۧۨ") ^ i4;
                    i5 = ((m6981 ^ i3) * (-20945)) ^ (-210528669);
                    i6 = -474597812;
                case -711497500:
                case 2068732938:
                    arrayList = activityC18827.f59394;
                    if (C1005.m3501()) {
                        m6981 = C2105.m6981("ۙ᩹") ^ i4;
                        i5 = ((m6981 ^ i3) * 24005) ^ (-76067585);
                        i6 = 286524133;
                    } else {
                        m6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((m6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    }
                case -134755792:
                case 2097581246:
                    abstractC7809 = (AbstractC7809) C3537.m10755(arrayList, i);
                    if (RunnableC3474.m10630()) {
                        m6981 = C2105.m6981("᩵ۗ") ^ i3;
                        i5 = ((m6981 ^ i4) * 19023) ^ 965241825;
                        i6 = -1838772799;
                    } else {
                        m6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    }
                case -50155194:
                case 1302403282:
                    if (C22628.f73083 <= 0) {
                        m6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((m6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        m6981 = C2105.m6981("۠᩷") ^ i4;
                        i5 = ((m6981 ^ i3) * 8115) ^ 1764080482;
                        i6 = -1636261825;
                    }
                case 89509048:
                case 1718335615:
                    AbstractC2021.m6574();
                    return 0;
                case 550820049:
                case 649172775:
                    if (C0483.f2088 < 0) {
                        m6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    } else {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    }
                case 666224946:
                case 911597527:
                    if (C3911.m11924() <= 0) {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        m6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    }
                case 1040289345:
                case 2023451069:
                    if (C4616.f14690 <= 0) {
                        m6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        m6981 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((m6981 ^ i4) * 12703) ^ 1154513819;
                        i6 = -1086908068;
                    }
                case 1307237167:
                case 1341658672:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    } else {
                        m6981 = (i4 - C2105.m6981("ۗ᩹")) * (-71);
                        i5 = ((m6981 ^ i3) * 23119) ^ 213844157;
                        i6 = -1760332674;
                    }
                case 1371229636:
                case 1716948281:
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("ۢ֨") ^ i3;
                        i5 = ((m6981 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    } else {
                        m6981 = C2105.m6981("ۘ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * (-24723)) ^ 523856298;
                        i6 = 1837208908;
                    }
                default:
                    activityC18827 = this.f44681;
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        m6981 = C0630.m2566("֡ۘ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-29485)) ^ 1230987120;
                        i6 = -1649553592;
                    }
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f44681.f59394;
        return C0382.m1847(arrayList);
    }
}
