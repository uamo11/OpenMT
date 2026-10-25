package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* compiled from: G668 */
/* renamed from: l.᩹ۤܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22228 extends AbstractC15252 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f72123;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3178 f72124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22228(C3178 c3178, AbstractActivityC3346 abstractActivityC3346, byte[] bArr) {
        super(abstractActivityC3346);
        this.f72124 = c3178;
        this.f72123 = bArr;
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        AbstractActivityC3346 abstractActivityC3346;
        final AbstractActivityC3346 abstractActivityC33462;
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
            return false;
        }
        final String obj = m36254(0).getText().toString();
        final String obj2 = m36254(1).getText().toString();
        final String obj3 = m36254(2).getText().toString();
        if (obj.isEmpty()) {
            m36254(0).requestFocus();
            return false;
        }
        if (obj2.isEmpty()) {
            m36254(1).requestFocus();
            return false;
        }
        if (obj3.isEmpty()) {
            m36254(2).requestFocus();
            return false;
        }
        final byte[] bArr = this.f72123;
        if (bArr.length < 4) {
            C21374.m48463(R.string.MT_Protector_res_0x7f1204e2);
            return false;
        }
        C3178 c3178 = this.f72124;
        abstractActivityC3346 = c3178.f9989;
        C13136 c13136 = new C13136(abstractActivityC3346, R.string.MT_Protector_res_0x7f1207a7);
        c13136.m31864();
        abstractActivityC33462 = c3178.f9989;
        final C21523 c21523 = new C21523(this, c13136, obj, obj2, obj3);
        if (bArr.length > 102400 || TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2) || TextUtils.isEmpty(obj3)) {
            c21523.mo1430(new C23881(2));
            return false;
        }
        new Thread(new Runnable() { // from class: l.֡֨ۡ
            /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
            
                if (l.C0422.f1886 > 0) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
            
                if (l.C0630.f2410 <= 0) goto L45;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 614
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.RunnableC0080.run():void");
            }

            {
                int i = -1281131563;
                int i2 = AbstractC2021.f6743;
                int i3 = C1773.f6144;
                int m6981 = (i3 - C2105.m6981("᩶᩻")) * 115;
                int i4 = ((m6981 ^ i2) * 11923) ^ (-1015039097);
                int i5 = 1511666929;
                while (true) {
                    i = ((((i ^ i2) * 23815) >> 31) & i4) ^ (m6981 ^ i5);
                    switch (i) {
                        case -2082180086:
                        case 288195743:
                            C5695.m16023();
                            m6981 = C0630.m2566("۫֨") ^ i2;
                            i4 = ((m6981 ^ i3) * (-32263)) ^ (-1262797732);
                            i5 = 1566375609;
                        case -1959354681:
                        case 1363561431:
                            if (C3663.f11553) {
                                m6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                m6981 = (C2105.m6981("ۢ᩶") + i2) * 43;
                                i4 = ((m6981 ^ i3) * 27997) ^ 1593972805;
                                i5 = -1981600263;
                            }
                        case -1640295200:
                        case 998204056:
                            return;
                        case -1483953166:
                        case 2055694837:
                            if (RunnableC1937.f6483 >= 0) {
                                m6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                m6981 = (C2105.m6981("۫᩸") + i3) * (-23);
                                i4 = ((m6981 ^ i2) * (-25177)) ^ (-667102880);
                                i5 = 445320039;
                            }
                        case -1186211647:
                        case 697195760:
                            if (C0237.f1507 != 0) {
                                m6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((m6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            } else {
                                m6981 = (i2 - C2105.m6981("ۙ۬")) * (-101);
                                i4 = ((m6981 ^ i3) * 19617) ^ (-297784234);
                                i5 = 1144865463;
                            }
                        case -1127398672:
                        case -20295390:
                            if (C2126.f7087) {
                                m6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((m6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            } else {
                                m6981 = (i3 - C0630.m2566("ۗۖ")) * (-29);
                                i4 = ((m6981 ^ i2) * 15737) ^ (-1380021369);
                                i5 = -1658130795;
                            }
                        case -980326644:
                        case 950997163:
                            C1005.m3501();
                            if (C4159.m12565() >= 0) {
                                m6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                m6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((m6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            }
                        case -870243595:
                        case -561985436:
                            C1773.m5908();
                            if (RunnableC1937.f6483 < 0) {
                                m6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((m6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            } else {
                                m6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            }
                        case -697465092:
                        case 1284981300:
                            if (C0050.f910 >= 0) {
                                m6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((m6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                m6981 = C0630.m2566("۠֫") ^ i2;
                                i4 = ((m6981 ^ i3) * 22957) ^ 617189041;
                                i5 = 1889822027;
                            }
                        case -205259181:
                        case 200715559:
                            C3537.m10746();
                            C2167.m7155();
                            throw new RuntimeException();
                        case 120409700:
                        case 434125310:
                            if (C1005.f3721) {
                                m6981 = (C0630.m2566("᩷ᩴ") + i3) * 29;
                                i4 = ((m6981 ^ i2) * 16619) ^ (-30660138);
                                i5 = 1088890685;
                            } else {
                                m6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            }
                        case 161334033:
                        case 967986057:
                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                m6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                m6981 = (i3 - C2105.m6981("᩵ܿ")) * (-115);
                                i4 = ((m6981 ^ i2) * (-9661)) ^ (-1790273051);
                                i5 = -1671709700;
                            }
                        case 349087947:
                        case 2012077140:
                            ViewOnClickListenerC1958.m6429();
                            if (C2167.f7158 >= 0) {
                                m6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((m6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            } else {
                                m6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((m6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            }
                        case 614347886:
                        case 1449132372:
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                m6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((m6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                m6981 = C2105.m6981("ۤ֫") ^ i3;
                                i4 = ((m6981 ^ i2) * (-15459)) ^ 1552524920;
                                i5 = -797447277;
                            }
                        case 638464003:
                        case 1002638548:
                            if (RunnableC3474.m10630()) {
                                m6981 = (i2 - C0630.m2566("᩶ۗ")) * 15;
                                i4 = ((m6981 ^ i3) * 20857) ^ (-719007950);
                                i5 = 1169027306;
                            } else {
                                m6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((m6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            }
                        default:
                            if (C0237.f1507 != 0) {
                                m6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((m6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                m6981 = (C2105.m6981("ܿܽ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                i4 = ((m6981 ^ i3) * (-8639)) ^ (-997800031);
                                i5 = -1377138554;
                            }
                    }
                }
            }
        }).start();
        return false;
    }
}
