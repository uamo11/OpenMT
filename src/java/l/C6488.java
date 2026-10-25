package l;

import android.util.Pair;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;

/* compiled from: O8RI */
/* renamed from: l.ۜۗ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6488 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f20022;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f20023;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17071 f20024;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17071 f20025;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f20027;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17071 f20029;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f20030;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f20031;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20033;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18524 f20034;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17071 f20035;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17071 f20036;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f20037;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f20039;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2751 f20028 = C2751.f8557;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22485 f20038 = new C22485();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20369 f20026 = new C20369();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f20032 = new ArrayList();

    public C6488(InterfaceC19477 interfaceC19477, InterfaceC19251 interfaceC19251, C18524 c18524) {
        this.f20023 = interfaceC19477;
        this.f20030 = interfaceC19251;
        this.f20034 = c18524;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17894(AbstractC4846 abstractC4846, int i) {
        this.f20037 = i;
        return m17883(abstractC4846);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17896(AbstractC4846 abstractC4846, boolean z) {
        this.f20022 = z;
        return m17883(abstractC4846);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17905(AbstractC4846 abstractC4846, C2751 c2751) {
        this.f20028 = c2751;
        this.f20028.getClass();
        m17907();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17910(InterfaceC9546 interfaceC9546) {
        C17071 c17071 = this.f20035;
        return c17071 != null && c17071.f52337 == interfaceC9546;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17914(InterfaceC9546 interfaceC9546) {
        C17071 c17071 = this.f20024;
        return c17071 != null && c17071.f52337 == interfaceC9546;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17904(long j) {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            c17071.m40062(j);
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m17912() {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            return !c17071.f52336.f42932 && c17071.m40077() && this.f20035.f52336.f42925 != -9223372036854775807L && this.f20033 < 100;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14248 m17898(long j, C12838 c12838) {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            return m17888(c12838.f38560, c17071, j);
        }
        return m17887(c12838.f38560, c12838.f38574, c12838.f38564, c12838.f38563);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17903(C14248 c14248) {
        C17071 c17071;
        C17071 c170712 = this.f20035;
        long m40071 = c170712 == null ? BasicLabelFormatter.TRILLION : (c170712.m40071() + this.f20035.f52336.f42925) - c14248.f42927;
        int i = 0;
        while (true) {
            if (i >= this.f20032.size()) {
                c17071 = null;
                break;
            }
            C14248 c142482 = ((C17071) this.f20032.get(i)).f52336;
            long j = c142482.f42925;
            long j2 = c14248.f42925;
            if ((j == -9223372036854775807L || j == j2) && c142482.f42927 == c14248.f42927 && c142482.f42930.equals(c14248.f42930)) {
                c17071 = (C17071) this.f20032.remove(i);
                break;
            }
            i++;
        }
        if (c17071 == null) {
            c17071 = C19936.m45927(this.f20034.f57399, c14248, m40071);
        } else {
            c17071.f52336 = c14248;
            c17071.m40069(m40071);
        }
        C17071 c170713 = this.f20035;
        if (c170713 != null) {
            c170713.m40064(c17071);
        } else {
            this.f20029 = c17071;
            this.f20036 = c17071;
            this.f20025 = c17071;
        }
        this.f20039 = null;
        this.f20035 = c17071;
        this.f20033++;
        m17893();
        return c17071;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m17907() {
        if (this.f20032.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f20032.size(); i++) {
            ((C17071) this.f20032.get(i)).m40076();
        }
        this.f20032 = arrayList;
        this.f20024 = null;
        m17908();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17071 m17915() {
        return this.f20035;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17071 m17918() {
        return this.f20024;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17071 m17911() {
        return this.f20029;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17071 m17917() {
        return this.f20036;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17071 m17906() {
        return this.f20025;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17071 m17913() {
        C17071 c17071 = this.f20025;
        C17071 c170712 = this.f20036;
        if (c17071 == c170712) {
            C22632.m50632(c170712);
            this.f20025 = c170712.m40068();
        }
        C17071 c170713 = this.f20036;
        C22632.m50632(c170713);
        this.f20036 = c170713.m40068();
        m17893();
        C17071 c170714 = this.f20036;
        C22632.m50632(c170714);
        return c170714;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17909() {
        C17071 c17071 = this.f20025;
        C22632.m50632(c17071);
        this.f20025 = c17071.m40068();
        m17893();
        C22632.m50632(this.f20025);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17901() {
        C17071 c17071 = this.f20029;
        if (c17071 == null) {
            return null;
        }
        if (c17071 == this.f20036) {
            this.f20036 = c17071.m40068();
        }
        C17071 c170712 = this.f20029;
        if (c170712 == this.f20025) {
            this.f20025 = c170712.m40068();
        }
        this.f20029.m40076();
        int i = this.f20033 - 1;
        this.f20033 = i;
        if (i == 0) {
            this.f20035 = null;
            C17071 c170713 = this.f20029;
            this.f20039 = c170713.f52340;
            this.f20027 = c170713.f52336.f42930.f49111;
        }
        this.f20029 = this.f20029.m40068();
        m17893();
        return this.f20029;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17897(C17071 c17071) {
        C22632.m50632(c17071);
        int i = 0;
        if (c17071.equals(this.f20035)) {
            return 0;
        }
        this.f20035 = c17071;
        while (c17071.m40068() != null) {
            c17071 = c17071.m40068();
            c17071.getClass();
            if (c17071 == this.f20036) {
                C17071 c170712 = this.f20029;
                this.f20036 = c170712;
                this.f20025 = c170712;
                i = 3;
            }
            if (c17071 == this.f20025) {
                this.f20025 = this.f20036;
                i |= 2;
            }
            c17071.m40076();
            this.f20033--;
        }
        C17071 c170713 = this.f20035;
        c170713.getClass();
        c170713.m40064((C17071) null);
        m17893();
        return i;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m17908() {
        C17071 c17071 = this.f20024;
        if (c17071 == null || c17071.m40065()) {
            this.f20024 = null;
            for (int i = 0; i < this.f20032.size(); i++) {
                C17071 c170712 = (C17071) this.f20032.get(i);
                if (!c170712.m40065()) {
                    this.f20024 = c170712;
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17902(InterfaceC9546 interfaceC9546) {
        for (int i = 0; i < this.f20032.size(); i++) {
            C17071 c17071 = (C17071) this.f20032.get(i);
            if (c17071.f52337 == interfaceC9546) {
                return c17071;
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17916() {
        if (this.f20033 == 0) {
            return;
        }
        C17071 c17071 = this.f20029;
        C22632.m50632(c17071);
        this.f20039 = c17071.f52340;
        this.f20027 = c17071.f52336.f42930.f49111;
        while (c17071 != null) {
            c17071.m40076();
            c17071 = c17071.m40068();
        }
        this.f20029 = null;
        this.f20035 = null;
        this.f20036 = null;
        this.f20025 = null;
        this.f20033 = 0;
        m17893();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        return m17897(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m17895(l.AbstractC4846 r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            l.ܿۗ֫ r2 = r0.f20029
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            l.ܳۗ֫ r5 = r2.f52336
            if (r3 != 0) goto L15
            l.ܳۗ֫ r3 = r0.m17899(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            l.ܳۗ֫ r8 = r0.m17888(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.f42927
            long r11 = r8.f42927
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto Lb0
            l.ܺۧۧ r9 = r5.f42930
            l.ܺۧۧ r10 = r8.f42930
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.f42925
            long r10 = r5.f42933
            long r12 = r5.f42925
            l.ܳۗ֫ r10 = r3.m33892(r10)
            r2.f52336 = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.m40066()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L56
        L52:
            long r8 = r2.m40075(r8)
        L56:
            l.ܿۗ֫ r1 = r0.f20036
            r10 = -9223372036854775808
            if (r2 != r1) goto L6c
            l.ܳۗ֫ r1 = r2.f52336
            boolean r1 = r1.f42931
            if (r1 != 0) goto L6c
            int r1 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = 1
            goto L6d
        L6c:
            r1 = 0
        L6d:
            l.ܿۗ֫ r14 = r0.f20025
            if (r2 != r14) goto L7b
            int r14 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r14 == 0) goto L79
            int r14 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r14 < 0) goto L7b
        L79:
            r8 = 1
            goto L7c
        L7b:
            r8 = 0
        L7c:
            int r2 = r0.m17897(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L99
            long r12 = r5.f42928
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 != 0) goto L99
            long r12 = r3.f42928
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 == 0) goto L99
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 == 0) goto L99
            r3 = 1
            goto L9a
        L99:
            r3 = 0
        L9a:
            if (r1 == 0) goto La1
            if (r2 != 0) goto La0
            if (r3 == 0) goto La1
        La0:
            r4 = 1
        La1:
            if (r8 == 0) goto La6
            r1 = r4 | 2
            return r1
        La6:
            return r4
        La7:
            l.ܿۗ֫ r3 = r2.m40068()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        Lb0:
            int r1 = r0.m17897(r3)
            return r1
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6488.m17895(l.ۙ᩵֫, long, long, long):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14248 m17899(AbstractC4846 abstractC4846, C14248 c14248) {
        long j;
        long j2;
        C15894 c15894 = c14248.f42930;
        boolean m37669 = c15894.m37669();
        int i = c15894.f49110;
        boolean z = !m37669 && i == -1;
        int i2 = c15894.f49108;
        boolean m17891 = m17891(abstractC4846, c15894);
        boolean m17892 = m17892(abstractC4846, c15894, z);
        Object obj = c15894.f49112;
        C22485 c22485 = this.f20038;
        abstractC4846.mo14105(obj, c22485);
        if (c15894.m37669() || i == -1) {
            j = -9223372036854775807L;
        } else {
            c22485.m50433(i);
            j = 0;
        }
        if (c15894.m37669()) {
            j2 = c22485.m50434(i2, c15894.f49109);
        } else {
            j2 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c22485.f72801 : j;
        }
        if (c15894.m37669()) {
            c22485.m50439(i2);
        } else if (i != -1) {
            c22485.m50439(i);
        }
        return new C14248(c15894, c14248.f42927, c14248.f42933, j, j2, c14248.f42926, false, z, m17891, m17892);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15894 m17889(AbstractC4846 abstractC4846, Object obj, long j, long j2, C20369 c20369, C22485 c22485) {
        abstractC4846.mo14105(obj, c22485);
        abstractC4846.m14106(c22485.f72806, c20369);
        abstractC4846.mo14098(obj);
        int i = c22485.f72800.f22070;
        if (i != 0) {
            if (i == 1) {
                c22485.m50438(0);
            }
            c22485.f72800.getClass();
            c22485.m50439(0);
        }
        abstractC4846.mo14105(obj, c22485);
        int m50437 = c22485.m50437(j);
        if (m50437 == -1) {
            return new C15894(c22485.m50432(j), j2, obj);
        }
        return new C15894(obj, m50437, c22485.m50436(m50437), j2);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17893() {
        int i = AbstractC14545.f44556;
        final C1846 c1846 = new C1846();
        for (C17071 c17071 = this.f20029; c17071 != null; c17071 = c17071.m40068()) {
            c1846.m16264(c17071.f52336.f42930);
        }
        C17071 c170712 = this.f20036;
        final C15894 c15894 = c170712 == null ? null : c170712.f52336.f42930;
        this.f20030.mo17760(new Runnable() { // from class: l.᩻ۗ֫
            @Override // java.lang.Runnable
            public final void run() {
                C6488.this.f20023.mo44878(c1846.m6131(), c15894);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 m17900(AbstractC4846 abstractC4846, Object obj, long j) {
        long m17884;
        int mo14098;
        Object obj2 = obj;
        C22485 c22485 = this.f20038;
        int i = abstractC4846.mo14105(obj2, c22485).f72806;
        Object obj3 = this.f20039;
        if (obj3 != null && (mo14098 = abstractC4846.mo14098(obj3)) != -1 && abstractC4846.mo14104(mo14098, c22485, false).f72806 == i) {
            m17884 = this.f20027;
        } else {
            C17071 c17071 = this.f20029;
            while (true) {
                if (c17071 != null) {
                    if (c17071.f52340.equals(obj2)) {
                        m17884 = c17071.f52336.f42930.f49111;
                        break;
                    }
                    c17071 = c17071.m40068();
                } else {
                    C17071 c170712 = this.f20029;
                    while (true) {
                        if (c170712 != null) {
                            int mo140982 = abstractC4846.mo14098(c170712.f52340);
                            if (mo140982 != -1 && abstractC4846.mo14104(mo140982, c22485, false).f72806 == i) {
                                m17884 = c170712.f52336.f42930.f49111;
                                break;
                            }
                            c170712 = c170712.m40068();
                        } else {
                            m17884 = m17884(obj2);
                            if (m17884 == -1) {
                                m17884 = this.f20031;
                                this.f20031 = 1 + m17884;
                                if (this.f20029 == null) {
                                    this.f20039 = obj2;
                                    this.f20027 = m17884;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j2 = m17884;
        abstractC4846.mo14105(obj2, c22485);
        int i2 = c22485.f72806;
        C20369 c20369 = this.f20026;
        abstractC4846.m14106(i2, c20369);
        boolean z = false;
        for (int mo140983 = abstractC4846.mo14098(obj); mo140983 >= c20369.f65760; mo140983--) {
            abstractC4846.mo14104(mo140983, c22485, true);
            boolean z2 = c22485.f72800.f22070 > 0;
            z |= z2;
            if (c22485.m50437(c22485.f72801) != -1) {
                obj2 = c22485.f72802;
                obj2.getClass();
            }
            if (z && (!z2 || c22485.f72801 != 0)) {
                break;
            }
        }
        return m17889(abstractC4846, obj2, j, j2, this.f20026, this.f20038);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m17884(Object obj) {
        for (int i = 0; i < this.f20032.size(); i++) {
            C17071 c17071 = (C17071) this.f20032.get(i);
            if (c17071.f52340.equals(obj)) {
                return c17071.f52336.f42930.f49111;
            }
        }
        return -1L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17883(AbstractC4846 abstractC4846) {
        C17071 c17071 = this.f20029;
        if (c17071 == null) {
            return 0;
        }
        int mo14098 = abstractC4846.mo14098(c17071.f52340);
        while (true) {
            mo14098 = abstractC4846.m14097(mo14098, this.f20038, this.f20026, this.f20037, this.f20022);
            while (true) {
                c17071.getClass();
                if (c17071.m40068() == null || c17071.f52336.f42929) {
                    break;
                }
                c17071 = c17071.m40068();
            }
            C17071 m40068 = c17071.m40068();
            if (mo14098 == -1 || m40068 == null || abstractC4846.mo14098(m40068.f52340) != mo14098) {
                break;
            }
            c17071 = m40068;
        }
        int m17897 = m17897(c17071);
        c17071.f52336 = m17899(abstractC4846, c17071.f52336);
        return m17897;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17888(AbstractC4846 abstractC4846, C17071 c17071, long j) {
        C14248 c14248;
        long j2;
        long j3;
        long j4;
        long j5;
        C14248 c142482 = c17071.f52336;
        long m40071 = (c17071.m40071() + c142482.f42925) - j;
        if (c142482.f42929) {
            C14248 c142483 = c17071.f52336;
            C15894 c15894 = c142483.f42930;
            long j6 = c142483.f42933;
            int m14097 = abstractC4846.m14097(abstractC4846.mo14098(c15894.f49112), this.f20038, this.f20026, this.f20037, this.f20022);
            if (m14097 != -1) {
                C22485 c22485 = this.f20038;
                int i = abstractC4846.mo14104(m14097, c22485, true).f72806;
                Object obj = c22485.f72802;
                obj.getClass();
                long j7 = c15894.f49111;
                if (abstractC4846.mo14103(i, this.f20026, 0L).f65760 == m14097) {
                    Pair m14101 = abstractC4846.m14101(this.f20026, this.f20038, i, -9223372036854775807L, Math.max(0L, m40071));
                    if (m14101 != null) {
                        obj = m14101.first;
                        long longValue = ((Long) m14101.second).longValue();
                        C17071 m40068 = c17071.m40068();
                        if (m40068 != null && m40068.f52340.equals(obj)) {
                            j5 = m40068.f52336.f42930.f49111;
                        } else {
                            j5 = m17884(obj);
                            if (j5 == -1) {
                                j5 = this.f20031;
                                this.f20031 = 1 + j5;
                            }
                        }
                        j4 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                    j4 = 0;
                    j5 = j7;
                }
                C15894 m17889 = m17889(abstractC4846, obj, j4, j5, this.f20026, this.f20038);
                if (j3 != -9223372036854775807L && j6 != -9223372036854775807L) {
                    int i2 = abstractC4846.mo14105(c15894.f49112, c22485).f72800.f22070;
                    c22485.f72800.getClass();
                    if (i2 > 0) {
                        c22485.m50439(0);
                    }
                }
                return m17887(abstractC4846, m17889, j3, j4);
            }
            return null;
        }
        C14248 c142484 = c17071.f52336;
        C15894 c158942 = c142484.f42930;
        Object obj2 = c158942.f49112;
        int i3 = c158942.f49110;
        C22485 c224852 = this.f20038;
        abstractC4846.mo14105(obj2, c224852);
        boolean z = c142484.f42931;
        if (c158942.m37669()) {
            int i4 = c158942.f49108;
            int i5 = c224852.f72800.m19298(i4).f40471;
            if (i5 == -1) {
                return null;
            }
            int m32606 = c224852.f72800.m19298(i4).m32606(c158942.f49109);
            if (m32606 < i5) {
                return m17885(abstractC4846, c158942.f49112, i4, m32606, c142484.f42933, c158942.f49111, z);
            }
            long j8 = c142484.f42933;
            if (j8 == -9223372036854775807L) {
                c14248 = c142484;
                j2 = 0;
                Pair m141012 = abstractC4846.m14101(this.f20026, c224852, c224852.f72806, -9223372036854775807L, Math.max(0L, m40071));
                if (m141012 == null) {
                    return null;
                }
                j8 = ((Long) m141012.second).longValue();
            } else {
                c14248 = c142484;
                j2 = 0;
            }
            int i6 = c158942.f49108;
            abstractC4846.mo14105(obj2, c224852);
            c224852.m50433(i6);
            c224852.f72800.m19298(i6).getClass();
            return m17886(abstractC4846, c158942.f49112, Math.max(j2, j8), c14248.f42933, c158942.f49111, z);
        }
        if (i3 != -1) {
            c224852.m50438(i3);
        }
        int m50436 = c224852.m50436(i3);
        c224852.m50439(i3);
        if (m50436 != c224852.f72800.m19298(i3).f40471) {
            return m17885(abstractC4846, c158942.f49112, c158942.f49110, m50436, c142484.f42925, c158942.f49111, z);
        }
        abstractC4846.mo14105(obj2, c224852);
        c224852.m50433(i3);
        c224852.f72800.m19298(i3).getClass();
        return m17886(abstractC4846, c158942.f49112, 0L, c142484.f42925, c158942.f49111, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17887(AbstractC4846 abstractC4846, C15894 c15894, long j, long j2) {
        abstractC4846.mo14105(c15894.f49112, this.f20038);
        if (c15894.m37669()) {
            return m17885(abstractC4846, c15894.f49112, c15894.f49108, c15894.f49109, j, c15894.f49111, false);
        }
        return m17886(abstractC4846, c15894.f49112, j2, j, c15894.f49111, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17885(AbstractC4846 abstractC4846, Object obj, int i, int i2, long j, long j2, boolean z) {
        C15894 c15894 = new C15894(obj, i, i2, j2);
        C22485 c22485 = this.f20038;
        long m50434 = abstractC4846.mo14105(obj, c22485).m50434(i, i2);
        if (i2 == c22485.m50436(i)) {
            c22485.f72800.getClass();
        }
        c22485.m50439(i);
        long j3 = 0;
        if (m50434 != -9223372036854775807L && 0 >= m50434) {
            j3 = Math.max(0L, m50434 - 1);
        }
        return new C14248(c15894, j3, j, -9223372036854775807L, m50434, z, false, false, false, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17886(AbstractC4846 abstractC4846, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        C22485 c22485 = this.f20038;
        abstractC4846.mo14105(obj, c22485);
        int m50432 = c22485.m50432(j);
        boolean z2 = false;
        if (m50432 == -1) {
            if (c22485.f72800.f22070 > 0) {
                c22485.m50439(0);
            }
        } else {
            c22485.m50439(m50432);
        }
        C15894 c15894 = new C15894(m50432, j3, obj);
        if (!c15894.m37669() && m50432 == -1) {
            z2 = true;
        }
        boolean m17891 = m17891(abstractC4846, c15894);
        boolean m17892 = m17892(abstractC4846, c15894, z2);
        if (m50432 != -1) {
            c22485.m50439(m50432);
        }
        if (m50432 != -1) {
            c22485.m50438(m50432);
        }
        if (m50432 != -1) {
            c22485.m50433(m50432);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c22485.f72801 : j4;
        return new C14248(c15894, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, z, false, z2, m17891, m17892);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17891(AbstractC4846 abstractC4846, C15894 c15894) {
        boolean z = !c15894.m37669() && c15894.f49110 == -1;
        Object obj = c15894.f49112;
        if (z) {
            if (abstractC4846.mo14103(abstractC4846.mo14105(obj, this.f20038).f72806, this.f20026, 0L).f65752 == abstractC4846.mo14098(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17892(AbstractC4846 abstractC4846, C15894 c15894, boolean z) {
        int mo14098 = abstractC4846.mo14098(c15894.f49112);
        if (!abstractC4846.mo14103(abstractC4846.mo14104(mo14098, this.f20038, false).f72806, this.f20026, 0L).f65759) {
            if (abstractC4846.m14097(mo14098, this.f20038, this.f20026, this.f20037, this.f20022) == -1 && z) {
                return true;
            }
        }
        return false;
    }
}
