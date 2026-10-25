package l;

import java.util.Iterator;

/* compiled from: F6N1 */
/* renamed from: l.ۗۚ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3038 {

    /* renamed from: ܺۤ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f9574 = {154, 22538, 22577, 22590, 22589, 22579, 22586, 22655, 22571, 22576, 22655, 22587, 22586, 22579, 22586, 22571, 22586, 22655, 22579, 22586, 22584, 22590, 22588, 22566, 22655, 22587, 22590, 22571, 22590, 22629, 22655, 9584, -18398, -18381, -18373, -18394, -18373, -18379, -18394, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18374, -18369, -18395, -18398, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18373, -18375, -18400, -18381, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18324, -18314};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m9293(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        short s = f9574[31];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = (i2 * i2) - i >= 0 ? 47190 : 13665;
        synchronized (C3038.class) {
            m9292(C1504.m5171(abstractC15440, RunnableC0588.m2436(f9574, 32, 4, i3)));
            m9292(C1504.m5171(abstractC15440, C0714.m2816(f9574, 36, 3, i3)));
            try {
                AbstractC15440 m5171 = C1504.m5171(abstractC154402, C5695.m16034(f9574, 39, 8, i3));
                Iterator m3596 = C1047.m3596(C1504.m5171(abstractC15440, C1294.m4373(f9574, 47, 8, i3)).mo23549(true));
                while (C1773.m5910(m3596)) {
                    AbstractC15440 abstractC154403 = (AbstractC15440) RunnableC1108.m3791(m3596);
                    try {
                        if (ServiceConnectionC3453.m10569(abstractC154403)) {
                            if (!ServiceConnectionC3453.m10569(m5171) && !m5171.mo23546()) {
                                return;
                            }
                            AbstractC15440 m51712 = C1504.m5171(m5171, C11340.m28023(abstractC154403));
                            if (!C3245.m9926(m51712)) {
                                abstractC154403.mo23551(m51712);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        C1420.m4905(sb, C1916.m6311(f9574, 85, 31, i3));
                        C1420.m4905(sb, C2958.m9025(abstractC154403));
                        C4117.m12358(C0422.m1959(sb), e);
                    }
                }
            } catch (Exception e2) {
                C4117.m12358(C3683.m11225(f9574, 55, 30, i3), e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (l.C2958.f9394 >= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (l.C3245.m9925() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (l.C2958.m9034() <= 0) goto L23;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m9292(l.AbstractC15440 r21) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3038.m9292(l.ܶ᩵ܿ):void");
    }
}
