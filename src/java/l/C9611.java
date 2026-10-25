package l;

import java.util.Iterator;

/* compiled from: 46TC */
/* renamed from: l.ۢ۬ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9611 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29153;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f29154;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15713 f29155;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15713 f29156;

    public C9611() {
        this(new C15713(), new C15713(), 1L, false);
    }

    public C9611(C15713 c15713, C15713 c157132, long j, boolean z) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid next history identity");
        }
        this.f29156 = c15713;
        this.f29155 = c157132;
        this.f29154 = j;
        this.f29153 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24543() {
        return !this.f29156.isEmpty();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8905 m24544() {
        if (m24543()) {
            return (C8905) this.f29156.last();
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m24542(C23224 c23224, long j) {
        if (!this.f29153 && m24543()) {
            C15713 c15713 = this.f29156;
            C8905 c8905 = (C8905) c15713.last();
            EnumC14051 enumC14051 = EnumC14051.USER;
            C15713 c157132 = c8905.f27081;
            if (c8905.f27084 == enumC14051) {
                long j2 = c8905.f27083;
                long j3 = j >= j2 ? j - j2 : j2 - j;
                if (j3 >= 0 && j3 < 250 && (c157132.m37046() <= 1 || !((C23224) c157132.last()).m51531())) {
                    C8905 c89052 = (C8905) c15713.last();
                    C15713 c157133 = c89052.f27081;
                    C23224 c232242 = (C23224) c157133.last();
                    long j4 = c232242.f74637;
                    C11999 c11999 = c232242.f74636;
                    long m29347 = j4 + c11999.m29347();
                    boolean m51531 = c23224.m51531();
                    C5089 c5089 = c23224.f74643;
                    C23224 c232243 = (!m51531 && c232242.f74638 == c23224.f74640 && ((long) c23224.f74637) == m29347 && ((long) c5089.m14642()) == m29347 && ((long) c5089.m14640()) == m29347 && c23224.f74639.m29347() == 0) ? new C23224(c232242.f74637, c232242.f74640, c23224.f74638, c232242.f74643, c232242.f74639, c11999.m29346(c23224.f74636)) : null;
                    return new C9611(c15713.m37047(new C8905(c89052.f27082, j, c89052.f27084, c232243 == null ? c157133.m37044(c23224) : c157133.m37047(c232243))), new C15713(), this.f29154, false);
                }
            }
        }
        return m24539(new C15713().m37044(c23224), j, EnumC14051.USER);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m24541(C15713 c15713, long j) {
        return m24539(c15713, j, EnumC14051.BATCH);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9611 m24539(C15713 c15713, long j, EnumC14051 enumC14051) {
        if (c15713.isEmpty()) {
            return this;
        }
        long j2 = this.f29154;
        if (j2 == C13132.FOREVER_NS) {
            throw new IllegalStateException("History identity exhausted");
        }
        return new C9611(this.f29156.m37044(new C8905(j2, j, enumC14051, c15713)), new C15713(), this.f29154 + 1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r10 != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        return r15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C9611 m24540(l.C14302 r16, long r17, boolean r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 < 0) goto La9
            l.ܺۙᩳ r5 = r0.f29156
            l.ܺۙᩳ r6 = r0.f29155
            r1.m34129(r5, r6)
            if (r19 == 0) goto L16
            if (r4 <= 0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            if (r4 == 0) goto L2a
            long r8 = r16.m34128()
            int r10 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r10 <= 0) goto L2a
            long r2 = m24538(r5)
            long r8 = m24538(r6)
            long r2 = r2 + r8
        L2a:
            r9 = r5
            r10 = r6
        L2c:
            long r11 = r16.m34128()
            int r8 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r8 <= 0) goto L99
            r11 = 1
            if (r4 == 0) goto L4c
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r8 == 0) goto L99
            int r8 = r9.m37046()
            long r13 = (long) r8
            int r8 = r10.m37046()
            long r7 = (long) r8
            long r13 = r13 + r7
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L4c
            goto L99
        L4c:
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L5e
            r7 = 0
            java.lang.Object r8 = r9.get(r7)
            l.ۡ۬ᩳ r8 = (l.C8905) r8
            l.ܺۙᩳ r9 = r9.removeFirst()
            goto L6f
        L5e:
            r7 = 0
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L91
            java.lang.Object r8 = r10.get(r7)
            l.ۡ۬ᩳ r8 = (l.C8905) r8
            l.ܺۙᩳ r10 = r10.removeFirst()
        L6f:
            if (r4 == 0) goto L8d
            l.ܺۙᩳ r8 = r8.f27081
            java.util.Iterator r8 = r8.iterator()
        L77:
            r13 = r8
            l.᩷ۙᩳ r13 = (l.C20654) r13
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L8d
            java.lang.Object r13 = r13.next()
            l.᩺᩶ᩳ r13 = (l.C23224) r13
            boolean r13 = r13.m51531()
            if (r13 != 0) goto L77
            long r2 = r2 - r11
        L8d:
            r1.m34129(r9, r10)
            goto L2c
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Nonempty budget without history roots"
            r1.<init>(r2)
            throw r1
        L99:
            if (r9 != r5) goto L9e
            if (r10 != r6) goto L9e
            return r0
        L9e:
            l.ۢ۬ᩳ r1 = new l.ۢ۬ᩳ
            long r11 = r0.f29154
            boolean r13 = r0.f29153
            r8 = r1
            r8.<init>(r9, r10, r11, r13)
            return r1
        La9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid history budget"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9611.m24540(l.ܳۙᩳ, long, boolean):l.ۢ۬ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24538(C15713 c15713) {
        Iterator it = c15713.iterator();
        long j = 0;
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return j;
            }
            Iterator it2 = ((C8905) c20654.next()).f27081.iterator();
            while (true) {
                C20654 c206542 = (C20654) it2;
                if (!c206542.hasNext()) {
                    break;
                }
                if (!((C23224) c206542.next()).m51531()) {
                    j++;
                    break;
                }
            }
        }
    }
}
