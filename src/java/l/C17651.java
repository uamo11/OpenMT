package l;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: 07NF */
/* renamed from: l.ܿ᩺֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17651 implements InterfaceC18113, InterfaceC6824, InterfaceC0536, InterfaceC21830, InterfaceC2654 {

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final Set f53965 = C20195.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f53966;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f53967;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f53968;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public boolean f53969;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Map f53970;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15036 f53971;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int[] f53972;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f53973;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8353 f53974;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public HashSet f53975;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f53976;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f53977;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public boolean f53978;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f53979;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f53980;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final int f53981;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final List f53982;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC13790 f53983;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C0385 f53984;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f53985;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean[] f53986;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C8941 f53987 = new C8941("Loader:HlsSampleStreamWrapper");

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final String f53988;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Handler f53989;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public C20142 f53990;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 f53991;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f53992;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19643 f53993;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public C18357[] f53994;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53995;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public C6181 f53996;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f53997;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f53998;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public Set f53999;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7592 f54000;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C8353 f54001;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC22963 f54002;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f54003;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f54004;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f54005;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15201 f54006;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean[] f54007;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C8353 f54008;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21725 f54009;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public long f54010;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC11302 f54011;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public SparseIntArray f54012;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f54013;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int[] f54014;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C8134 f54015;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m41356(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
    }

    @Override // l.InterfaceC18113
    /* renamed from: ֫ */
    public final C17407 mo12777(InterfaceC23757 interfaceC23757, long j, long j2, IOException iOException, int i) {
        C17407 m23058;
        int i2;
        AbstractC7592 abstractC7592 = (AbstractC7592) interfaceC23757;
        boolean z = abstractC7592 instanceof C20142;
        if (z && !((C20142) abstractC7592).m46397() && (iOException instanceof C23770) && ((i2 = ((C23770) iOException).f76941) == 410 || i2 == 404)) {
            return C8941.f27180;
        }
        long m20343 = abstractC7592.m20343();
        abstractC7592.m20344();
        C10957 c10957 = new C10957(j2, abstractC7592.m20345());
        C3603.m11037(abstractC7592.f23470);
        C3603.m11037(abstractC7592.f23469);
        C1885 c1885 = new C1885(iOException, i);
        C15201 c15201 = this.f54006;
        C13962 m45050 = C19609.m45050(c15201.m35943());
        InterfaceC11058 interfaceC11058 = this.f53968;
        C7613 mo27442 = interfaceC11058.mo27442(m45050, c1885);
        boolean m35940 = (mo27442 == null || mo27442.f23556 != 2) ? false : c15201.m35940(abstractC7592, mo27442.f23555);
        if (m35940) {
            if (z && m20343 == 0) {
                ArrayList arrayList = this.f53997;
                C22632.m50634(((C20142) C4248.m12790(arrayList, 1)) == abstractC7592);
                if (arrayList.isEmpty()) {
                    this.f53973 = this.f53980;
                } else {
                    ((C20142) C8882.m22955(arrayList)).m46395();
                }
            }
            m23058 = C8941.f27182;
        } else {
            long mo27441 = interfaceC11058.mo27441(c1885);
            m23058 = mo27441 != -9223372036854775807L ? C8941.m23058(mo27441, false) : C8941.f27181;
        }
        C17407 c17407 = m23058;
        boolean m40761 = c17407.m40761();
        this.f54015.m21593(c10957, abstractC7592.f23472, this.f53981, abstractC7592.f23468, abstractC7592.f23466, abstractC7592.f23473, abstractC7592.f23470, abstractC7592.f23469, iOException, !m40761);
        if (!m40761) {
            this.f54000 = null;
        }
        if (m35940) {
            if (!this.f54005) {
                C5824 c5824 = new C5824();
                c5824.m16330(this.f53980);
                mo2265(c5824.m16327());
                return c17407;
            }
            ((C13085) this.f54011).mo11119(this);
        }
        return c17407;
    }

    @Override // l.InterfaceC18113
    /* renamed from: ֫ */
    public final void mo12778(InterfaceC23757 interfaceC23757, long j, long j2) {
        AbstractC7592 abstractC7592 = (AbstractC7592) interfaceC23757;
        this.f54000 = null;
        this.f54006.m35933(abstractC7592);
        long j3 = abstractC7592.f23471;
        abstractC7592.m20344();
        Map m20345 = abstractC7592.m20345();
        abstractC7592.m20343();
        C10957 c10957 = new C10957(j2, m20345);
        this.f53968.getClass();
        this.f54015.m21596(c10957, abstractC7592.f23472, this.f53981, abstractC7592.f23468, abstractC7592.f23466, abstractC7592.f23473, abstractC7592.f23470, abstractC7592.f23469);
        if (!this.f54005) {
            C5824 c5824 = new C5824();
            c5824.m16330(this.f53980);
            mo2265(c5824.m16327());
            return;
        }
        ((C13085) this.f54011).mo11119(this);
    }

    @Override // l.InterfaceC18113
    /* renamed from: ֫ */
    public final void mo12779(InterfaceC23757 interfaceC23757, long j, long j2, int i) {
        C10957 c10957;
        AbstractC7592 abstractC7592 = (AbstractC7592) interfaceC23757;
        if (i == 0) {
            long j3 = abstractC7592.f23471;
            c10957 = new C10957(abstractC7592.f23467);
        } else {
            long j4 = abstractC7592.f23471;
            abstractC7592.m20344();
            Map m20345 = abstractC7592.m20345();
            abstractC7592.m20343();
            c10957 = new C10957(j2, m20345);
        }
        this.f54015.m21592(c10957, abstractC7592.f23472, this.f53981, abstractC7592.f23468, abstractC7592.f23466, abstractC7592.f23473, abstractC7592.f23470, abstractC7592.f23469, i);
    }

    @Override // l.InterfaceC18113
    /* renamed from: ֫ */
    public final void mo12780(InterfaceC23757 interfaceC23757, long j, long j2, boolean z) {
        AbstractC7592 abstractC7592 = (AbstractC7592) interfaceC23757;
        this.f54000 = null;
        long j3 = abstractC7592.f23471;
        abstractC7592.m20344();
        Map m20345 = abstractC7592.m20345();
        abstractC7592.m20343();
        C10957 c10957 = new C10957(j2, m20345);
        this.f53968.getClass();
        this.f54015.m21591(c10957, abstractC7592.f23472, this.f53981, abstractC7592.f23468, abstractC7592.f23466, abstractC7592.f23473, abstractC7592.f23470, abstractC7592.f23469);
        if (z) {
            return;
        }
        if (m41349() || this.f53977 == 0) {
            m41350();
        }
        if (this.f53977 > 0) {
            ((C13085) this.f54011).mo11119(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [l.᩺ۨ֫] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.ܰۨ֫] */
    public C17651(String str, int i, InterfaceC11302 interfaceC11302, C15201 c15201, Map map, InterfaceC21725 interfaceC21725, long j, C8353 c8353, InterfaceC4454 interfaceC4454, C15036 c15036, InterfaceC11058 interfaceC11058, C8134 c8134, int i2) {
        this.f53988 = str;
        this.f53981 = i;
        this.f54011 = interfaceC11302;
        this.f54006 = c15201;
        this.f53970 = map;
        this.f54009 = interfaceC21725;
        this.f54008 = c8353;
        this.f53991 = interfaceC4454;
        this.f53971 = c15036;
        this.f53968 = interfaceC11058;
        this.f54015 = c8134;
        this.f53979 = i2;
        C0385 c0385 = new C0385();
        c0385.f1818 = null;
        c0385.f1819 = false;
        c0385.f1820 = null;
        this.f53984 = c0385;
        this.f53972 = new int[0];
        Set set = f53965;
        this.f53975 = new HashSet(set.size());
        this.f54012 = new SparseIntArray(set.size());
        this.f53994 = new C18357[0];
        this.f54007 = new boolean[0];
        this.f53986 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f53997 = arrayList;
        this.f53982 = C20195.unmodifiableList(arrayList);
        this.f53995 = new ArrayList();
        this.f54002 = new Runnable() { // from class: l.᩺ۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                C17651.this.m41344();
            }
        };
        this.f53983 = new Runnable() { // from class: l.ܰۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                C17651.m41352(C17651.this);
            }
        };
        this.f53989 = C3603.m11019((Handler.Callback) null);
        this.f53980 = j;
        this.f53973 = j;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m41370() {
        if (this.f54005) {
            return;
        }
        C5824 c5824 = new C5824();
        c5824.m16330(this.f53980);
        mo2265(c5824.m16327());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41364(C13312[] c13312Arr, int... iArr) {
        this.f53996 = m41345(c13312Arr);
        this.f53999 = new HashSet();
        for (int i : iArr) {
            this.f53999.add(this.f53996.m17102(i));
        }
        this.f53967 = 0;
        final InterfaceC11302 interfaceC11302 = this.f54011;
        this.f53989.post(new Runnable() { // from class: l.۟ۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                ((C13085) InterfaceC11302.this).m31721();
            }
        });
        this.f54005 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41376() {
        m41373();
        if (this.f54003 && !this.f54005) {
            throw C9080.m23440("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6181 m41379() {
        m41355();
        return this.f53996;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41357(int i) {
        m41355();
        this.f54014.getClass();
        int i2 = this.f54014[i];
        if (i2 == -1) {
            return this.f53999.contains(this.f53996.m17102(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f53986;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41377(int i) {
        m41355();
        this.f54014.getClass();
        int i2 = this.f54014[i];
        C22632.m50634(this.f53986[i2]);
        this.f53986[i2] = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        if (r10.mo2390() != r11.m35932().m32294(r1.f23468)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m41366(l.InterfaceC9731[] r21, boolean[] r22, l.InterfaceC18882[] r23, boolean[] r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17651.m41366(l.ۢܿۧ[], boolean[], l.ᩴܽۧ[], boolean[], long, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41361(long j, boolean z) {
        if (!this.f53992 || m41349()) {
            return;
        }
        int length = this.f53994.length;
        for (int i = 0; i < length; i++) {
            this.f53994[i].m12198(j, z, this.f53986[i]);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41372(long j, boolean z) {
        C20142 c20142;
        boolean z2;
        boolean m12211;
        this.f53980 = j;
        if (m41349()) {
            this.f53973 = j;
            return true;
        }
        boolean m35944 = this.f54006.m35944();
        ArrayList arrayList = this.f53997;
        if (m35944) {
            for (int i = 0; i < arrayList.size(); i++) {
                c20142 = (C20142) arrayList.get(i);
                if (c20142.f23470 == j) {
                    break;
                }
            }
        }
        c20142 = null;
        if (this.f53992 && !z && !arrayList.isEmpty()) {
            int length = this.f53994.length;
            for (int i2 = 0; i2 < length; i2++) {
                C18357 c18357 = this.f53994[i2];
                if (c20142 != null) {
                    m12211 = c18357.m12210(c20142.m46392(i2));
                } else {
                    long mo2267 = mo2267();
                    m12211 = c18357.m12211(j, mo2267 == Long.MIN_VALUE || j < mo2267);
                }
                if (!m12211 && (this.f54007[i2] || !this.f54013)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.f53973 = j;
        this.f54003 = false;
        arrayList.clear();
        C8941 c8941 = this.f53987;
        if (c8941.m23068()) {
            if (this.f53992) {
                for (C18357 c183572 : this.f53994) {
                    c183572.m12196();
                }
            }
            c8941.m23062();
            return true;
        }
        c8941.m23066();
        m41350();
        return true;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m41368() {
        ArrayList arrayList = this.f53997;
        if (arrayList.isEmpty()) {
            return;
        }
        final C20142 c20142 = (C20142) C8882.m22955(arrayList);
        C15201 c15201 = this.f54006;
        int m35930 = c15201.m35930(c20142);
        if (m35930 == 1) {
            if (c20142.m46397()) {
                return;
            }
            c20142.m46393(c15201.m35942(c20142));
        } else if (m35930 == 0) {
            this.f53989.post(new Runnable() { // from class: l.֫᩺֫
                @Override // java.lang.Runnable
                public final void run() {
                    C17651.m41348(C17651.this, c20142);
                }
            });
        } else {
            if (m35930 != 2 || this.f54003) {
                return;
            }
            C8941 c8941 = this.f53987;
            if (c8941.m23068()) {
                c8941.m23062();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41348(C17651 c17651, C20142 c20142) {
        InterfaceC17379 interfaceC17379;
        InterfaceC11302 interfaceC11302 = c17651.f54011;
        Uri uri = c20142.f65228;
        interfaceC17379 = ((C13085) interfaceC11302).f39181.f37131;
        interfaceC17379.mo9182(uri);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41378() {
        if (this.f54005) {
            for (C18357 c18357 : this.f53994) {
                c18357.m12201();
            }
        }
        this.f54006.m35945();
        this.f53987.m23064(this);
        this.f53989.removeCallbacksAndMessages(null);
        this.f53998 = true;
        this.f53995.clear();
    }

    @Override // l.InterfaceC6824
    /* renamed from: ᩳ */
    public final void mo18512() {
        for (C18357 c18357 : this.f53994) {
            c18357.m12202();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41363(boolean z) {
        this.f54006.m35936(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41365(Uri uri, C1885 c1885, boolean z) {
        long j;
        C15201 c15201 = this.f54006;
        if (!c15201.m35938(uri)) {
            return true;
        }
        if (!z) {
            C7613 mo27442 = this.f53968.mo27442(C19609.m45050(c15201.m35943()), c1885);
            if (mo27442 != null && mo27442.f23556 == 2) {
                j = mo27442.f23555;
                return c15201.m35939(uri, j);
            }
        }
        j = -9223372036854775807L;
        return c15201.m35939(uri, j);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m41369() {
        return this.f53976 == 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m41360(long j, C9599 c9599) {
        return this.f54006.m35931(j, c9599);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41371(int i) {
        return !m41349() && this.f53994[i].m12200(this.f54003);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41374(int i) {
        m41373();
        this.f53994[i].m12204();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m41373() {
        this.f53987.m23063(Integer.MIN_VALUE);
        this.f54006.m35946();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41359(int i, C3002 c3002, C21843 c21843, int i2) {
        int i3;
        C8353 c8353;
        C8353 c83532;
        if (m41349()) {
            return -3;
        }
        ArrayList arrayList = this.f53997;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            loop0: while (i4 < arrayList.size() - 1) {
                int i5 = ((C20142) arrayList.get(i4)).f65235;
                int length = this.f53994.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (this.f53986[i6] && this.f53994[i6].m12213() == i5) {
                        break loop0;
                    }
                }
                i4++;
            }
            String str = C3603.f11424;
            if (i4 > arrayList.size() || i4 < 0) {
                throw new IllegalArgumentException();
            }
            if (i4 != 0) {
                arrayList.subList(0, i4).clear();
            }
            C20142 c20142 = (C20142) arrayList.get(0);
            C8353 c83533 = c20142.f23468;
            if (c83533.equals(this.f53974)) {
                c83532 = c83533;
            } else {
                c83532 = c83533;
                C6723 c6723 = new C6723(1, this.f53981, c83533, c20142.f23466, c20142.f23473, C3603.m11037(c20142.f23470), -9223372036854775807L);
                C8134 c8134 = this.f54015;
                c8134.m21595(new C12761(c8134, c6723));
            }
            this.f53974 = c83532;
        }
        if (arrayList.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 0;
            if (!((C20142) arrayList.get(0)).m46397()) {
                return -3;
            }
        }
        int m12195 = this.f53994[i].m12195(c3002, c21843, i2, this.f54003);
        if (m12195 == -5) {
            C8353 c83534 = c3002.f9455;
            c83534.getClass();
            if (i == this.f53966) {
                int m32446 = C13426.m32446(this.f53994[i].m12213());
                while (i3 < arrayList.size() && ((C20142) arrayList.get(i3)).f65235 != m32446) {
                    i3++;
                }
                if (i3 < arrayList.size()) {
                    c8353 = ((C20142) arrayList.get(i3)).f23468;
                } else {
                    c8353 = this.f54001;
                    c8353.getClass();
                }
                c83534 = c83534.m21951(c8353);
            }
            c3002.f9455 = c83534;
        }
        return m12195;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41358(int i, long j) {
        Object next;
        Object obj;
        if (m41349()) {
            return 0;
        }
        C18357 c18357 = this.f53994[i];
        int m12194 = c18357.m12194(j, this.f54003);
        ArrayList arrayList = this.f53997;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = C18566.m43105(arrayList, 1);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        C20142 c20142 = (C20142) obj;
        if (c20142 != null && !c20142.m46397()) {
            m12194 = Math.min(m12194, c20142.m46392(i) - c18357.m12212());
        }
        c18357.m12215(m12194);
        return m12194;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۜ */
    public final long mo2266() {
        if (this.f54003) {
            return Long.MIN_VALUE;
        }
        if (m41349()) {
            return this.f53973;
        }
        long j = this.f53980;
        C20142 m41343 = m41343();
        if (!m41343.m46399()) {
            ArrayList arrayList = this.f53997;
            m41343 = arrayList.size() > 1 ? (C20142) C18566.m43105(arrayList, 2) : null;
        }
        if (m41343 != null) {
            j = Math.max(j, m41343.f23469);
        }
        if (this.f53992) {
            for (C18357 c18357 : this.f53994) {
                j = Math.max(j, c18357.m12218());
            }
        }
        return j;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final long mo2267() {
        if (m41349()) {
            return this.f53973;
        }
        if (this.f54003) {
            return Long.MIN_VALUE;
        }
        return m41343().f23469;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        long max;
        long j;
        long j2;
        List list;
        InterfaceC17379 interfaceC17379;
        if (!this.f54003) {
            C8941 c8941 = this.f53987;
            if (!c8941.m23068() && !c8941.m23067()) {
                if (m41349()) {
                    List list2 = Collections.EMPTY_LIST;
                    long j3 = this.f53973;
                    for (C18357 c18357 : this.f53994) {
                        c18357.m12216(this.f53973);
                    }
                    list = list2;
                    j = j3;
                    j2 = j;
                } else {
                    C20142 m41343 = m41343();
                    if (!m41343.m46399() || !m41343.m46397()) {
                        max = Math.max(this.f53980, m41343.f23470);
                    } else {
                        max = m41343.m46400();
                    }
                    long j4 = max;
                    long j5 = this.f53980;
                    boolean z = this.f53992;
                    List list3 = this.f53982;
                    if (z) {
                        for (C18357 c183572 : this.f53994) {
                            j5 = Math.max(j5, c183572.m12217());
                        }
                    }
                    j = j4;
                    j2 = j5;
                    list = list3;
                }
                C0385 c0385 = this.f53984;
                c0385.f1818 = null;
                c0385.f1819 = false;
                c0385.f1820 = null;
                this.f54006.m35935(c11469, j, j2, list, this.f54005 || !list.isEmpty(), this.f53984);
                boolean z2 = c0385.f1819;
                AbstractC7592 abstractC7592 = c0385.f1818;
                Uri uri = c0385.f1820;
                if (z2) {
                    this.f53973 = -9223372036854775807L;
                    this.f54003 = true;
                    return true;
                }
                if (abstractC7592 != null) {
                    if (abstractC7592 instanceof C20142) {
                        C20142 c20142 = (C20142) abstractC7592;
                        ArrayList arrayList = this.f53997;
                        if (!arrayList.isEmpty()) {
                            if (!m41343().m46397()) {
                                m41353(arrayList.size() - 1);
                            }
                            if (c20142.f65239 && c20142.m46396()) {
                                int size = arrayList.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        break;
                                    }
                                    long j6 = ((C20142) arrayList.get(size)).f23470;
                                    long j7 = c20142.f23470;
                                    if (j6 < j7) {
                                        break;
                                    }
                                    if (j6 == j7 && m41354(size)) {
                                        m41353(size);
                                        c20142.m46398();
                                        break;
                                    }
                                    size--;
                                }
                            }
                        }
                        this.f53990 = c20142;
                        this.f54001 = c20142.f23468;
                        this.f53973 = -9223372036854775807L;
                        arrayList.add(c20142);
                        int i = AbstractC14545.f44556;
                        C1846 c1846 = new C1846();
                        for (C18357 c183573 : this.f53994) {
                            c1846.m16264(Integer.valueOf(c183573.m12203()));
                        }
                        c20142.m46394(this, c1846.m6131());
                        for (C18357 c183574 : this.f53994) {
                            c183574.getClass();
                            c183574.m12219(c20142.f65235);
                            if (c20142.m46396()) {
                                c183574.m12220();
                            }
                        }
                    }
                    this.f54000 = abstractC7592;
                    c8941.m23065(abstractC7592, this, this.f53968.mo27440(abstractC7592.f23472));
                    return true;
                }
                if (uri != null) {
                    interfaceC17379 = ((C13085) this.f54011).f39181.f37131;
                    interfaceC17379.mo9182(uri);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2264() {
        return this.f53987.m23068();
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final void mo2268(long j) {
        C8941 c8941 = this.f53987;
        if (c8941.m23067() || m41349()) {
            return;
        }
        boolean m23068 = c8941.m23068();
        C15201 c15201 = this.f54006;
        List list = this.f53982;
        if (m23068) {
            this.f54000.getClass();
            if (c15201.m35937(j, this.f54000, list)) {
                c8941.m23062();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c15201.m35930((C20142) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m41353(size);
        }
        int m35929 = c15201.m35929(j, list);
        if (m35929 < this.f53997.size()) {
            m41353(m35929);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m41353(int i) {
        ArrayList arrayList;
        C22632.m50634(!this.f53987.m23068());
        while (true) {
            arrayList = this.f53997;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (m41354(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m41343().f23469;
        C20142 c20142 = (C20142) arrayList.get(i);
        int size = arrayList.size();
        String str = C3603.f11424;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        for (int i2 = 0; i2 < this.f53994.length; i2++) {
            this.f53994[i2].m12197(c20142.m46392(i2));
        }
        if (arrayList.isEmpty()) {
            this.f53973 = this.f53980;
        } else {
            ((C20142) C8882.m22955(arrayList)).m46395();
        }
        this.f54003 = false;
        C6723 c6723 = new C6723(1, this.f53976, null, 3, null, C3603.m11037(c20142.f23470), C3603.m11037(j));
        C8134 c8134 = this.f54015;
        C15894 c15894 = c8134.f25106;
        c15894.getClass();
        c8134.m21595(new C23489(c8134, c15894, c6723));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ᩳ᩺֫[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ᩳ᩺֫[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.᩵ۢۧ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.ۘܽۧ, l.ᩳ᩺֫] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩵᩷ۧ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = f53965;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f53975;
        SparseIntArray sparseIntArray = this.f54012;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            C22632.m50631(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.f53972[i3] = i;
                }
                if (this.f53972[i3] == i) {
                    r5 = this.f53994[i3];
                } else {
                    r5 = m41351(i, i2);
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.f53994;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.f53972[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.f53969) {
                return m41351(i, i2);
            }
            int length = this.f53994.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new C18357(this.f54009, this.f53991, this.f53971, this.f53970);
            r5.m12216(this.f53980);
            if (z) {
                r5.m42784(this.f53993);
            }
            r5.m12208(this.f54010);
            if (this.f53990 != null) {
                r5.m12219(r6.f65235);
            }
            r5.m12199(this);
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f53972, i5);
            this.f53972 = copyOf;
            copyOf[length] = i;
            C18357[] c18357Arr = this.f53994;
            String str = C3603.f11424;
            ?? copyOf2 = Arrays.copyOf(c18357Arr, c18357Arr.length + 1);
            copyOf2[c18357Arr.length] = r5;
            this.f53994 = (C18357[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f54007, i5);
            this.f54007 = copyOf3;
            copyOf3[length] = z;
            this.f54013 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (m41356(i2) > m41356(this.f53976)) {
                this.f53966 = length;
                this.f53976 = i2;
            }
            this.f53986 = Arrays.copyOf(this.f53986, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        if (this.f53985 == null) {
            this.f53985 = new C16945(r5, this.f53979);
        }
        return this.f53985;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ܳ */
    public final void mo3431() {
        this.f53969 = true;
        this.f53989.post(this.f53983);
    }

    @Override // l.InterfaceC2654
    /* renamed from: ᩷ */
    public final void mo8321() {
        this.f53989.post(this.f54002);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41367() {
        this.f53975.clear();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41375(long j) {
        if (this.f54010 != j) {
            this.f54010 = j;
            for (C18357 c18357 : this.f53994) {
                c18357.m12208(j);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41362(C19643 c19643) {
        if (C11003.equals(this.f53993, c19643)) {
            return;
        }
        this.f53993 = c19643;
        int i = 0;
        while (true) {
            C18357[] c18357Arr = this.f53994;
            if (i >= c18357Arr.length) {
                return;
            }
            if (this.f54007[i]) {
                c18357Arr[i].m42784(c19643);
            }
            i++;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m41354(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.f53997;
            if (i2 < arrayList.size()) {
                if (((C20142) arrayList.get(i2)).m46396()) {
                    return false;
                }
                i2++;
            } else {
                C20142 c20142 = (C20142) arrayList.get(i);
                for (int i3 = 0; i3 < this.f53994.length; i3++) {
                    if (this.f53994[i3].m12212() > c20142.m46392(i3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m41350() {
        for (C18357 c18357 : this.f53994) {
            c18357.m12209(this.f54004);
        }
        this.f54004 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41352(C17651 c17651) {
        c17651.f53992 = true;
        c17651.m41344();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m41344() {
        if (!this.f53998 && this.f54014 == null && this.f53992) {
            for (C18357 c18357 : this.f53994) {
                if (c18357.m12222() == null) {
                    return;
                }
            }
            C6181 c6181 = this.f53996;
            if (c6181 != null) {
                int i = c6181.f18978;
                int[] iArr = new int[i];
                this.f54014 = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        C18357[] c18357Arr = this.f53994;
                        if (i3 < c18357Arr.length) {
                            C8353 m12222 = c18357Arr[i3].m12222();
                            C22632.m50632(m12222);
                            C8353 m32295 = this.f53996.m17102(i2).m32295(0);
                            String str = m12222.f25614;
                            String str2 = m32295.f25614;
                            int m24807 = C9786.m24807(str);
                            if (m24807 == 3) {
                                if (C11003.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || m12222.f25598 == m32295.f25598) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i3++;
                            } else if (m24807 == C9786.m24807(str2)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    this.f54014[i2] = i3;
                }
                Iterator it = this.f53995.iterator();
                while (it.hasNext()) {
                    ((C11675) it.next()).m28560();
                }
                return;
            }
            int length = this.f53994.length;
            int i4 = 0;
            int i5 = -2;
            int i6 = -1;
            while (true) {
                int i7 = 1;
                if (i4 >= length) {
                    break;
                }
                C8353 m122222 = this.f53994[i4].m12222();
                C22632.m50632(m122222);
                String str3 = m122222.f25614;
                if (C9786.m24801(str3)) {
                    i7 = 2;
                } else if (!C9786.m24810(str3)) {
                    i7 = C9786.m24809(str3) ? 3 : -2;
                }
                if (m41356(i7) > m41356(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            C13312 m35932 = this.f54006.m35932();
            int i8 = m35932.f39854;
            this.f53967 = -1;
            this.f54014 = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.f54014[i9] = i9;
            }
            C13312[] c13312Arr = new C13312[length];
            int i10 = 0;
            while (i10 < length) {
                C8353 m122223 = this.f53994[i10].m12222();
                C22632.m50632(m122223);
                String str4 = this.f53988;
                C8353 c8353 = this.f54008;
                if (i10 == i6) {
                    C8353[] c8353Arr = new C8353[i8];
                    for (int i11 = 0; i11 < i8; i11++) {
                        C8353 m322952 = m35932.m32295(i11);
                        if (i5 == 1 && c8353 != null) {
                            m322952 = m322952.m21951(c8353);
                        }
                        c8353Arr[i11] = i8 == 1 ? m122223.m21951(m322952) : m41346(m322952, m122223, true);
                    }
                    c13312Arr[i10] = new C13312(str4, c8353Arr);
                    this.f53967 = i10;
                } else {
                    if (i5 != 2 || !C9786.m24810(m122223.f25614)) {
                        c8353 = null;
                    }
                    StringBuilder m19190 = C7166.m19190(str4, ":muxed:");
                    m19190.append(i10 < i6 ? i10 : i10 - 1);
                    c13312Arr[i10] = new C13312(m19190.toString(), m41346(c8353, m122223, false));
                }
                i10++;
            }
            this.f53996 = m41345(c13312Arr);
            C22632.m50634(this.f53999 == null);
            this.f53999 = Collections.EMPTY_SET;
            this.f54005 = true;
            ((C13085) this.f54011).m31721();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6181 m41345(C13312[] c13312Arr) {
        for (int i = 0; i < c13312Arr.length; i++) {
            C13312 c13312 = c13312Arr[i];
            C8353[] c8353Arr = new C8353[c13312.f39854];
            for (int i2 = 0; i2 < c13312.f39854; i2++) {
                C8353 m32295 = c13312.m32295(i2);
                c8353Arr[i2] = m32295.m21949(this.f53991.mo7624(m32295));
            }
            c13312Arr[i] = new C13312(c13312.f39852, c8353Arr);
        }
        return new C6181(c13312Arr);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C20142 m41343() {
        return (C20142) C18566.m43105(this.f53997, 1);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m41349() {
        return this.f53973 != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m41355() {
        C22632.m50634(this.f54005);
        this.f53996.getClass();
        this.f53999.getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m41346(C8353 c8353, C8353 c83532, boolean z) {
        String m24803;
        if (c8353 == null) {
            return c83532;
        }
        String str = c8353.f25619;
        String str2 = c83532.f25614;
        int m24807 = C9786.m24807(str2);
        if (C3603.m11002(m24807, str) == 1) {
            m24803 = C3603.m11041(m24807, str);
            str2 = C9786.m24802(m24803);
        } else {
            m24803 = C9786.m24803(str, str2);
        }
        C1297 m21948 = c83532.m21948();
        m21948.m4469(c8353.f25621);
        m21948.m4473(c8353.f25635);
        m21948.m4463(c8353.f25631);
        m21948.m4471(c8353.f25603);
        m21948.m4466(c8353.f25628);
        m21948.m4454(c8353.f25608);
        m21948.m4468(z ? c8353.f25623 : -1);
        m21948.m4438(z ? c8353.f25615 : -1);
        m21948.m4445(m24803);
        if (m24807 == 2) {
            m21948.m4453(c8353.f25633);
            m21948.m4457(c8353.f25609);
            m21948.m4441(c8353.f25596);
        }
        if (str2 != null) {
            m21948.m4465(str2);
        }
        int i = c8353.f25625;
        if (i != -1 && m24807 == 1) {
            m21948.m4472(i);
        }
        C23896 c23896 = c8353.f25612;
        if (c23896 != null) {
            C23896 c238962 = c83532.f25612;
            if (c238962 != null) {
                c23896 = c238962.m52642(c23896);
            }
            m21948.m4449(c23896);
        }
        return m21948.m4440();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19714 m41351(int i, int i2) {
        C19956.m46037("Unmapped track with id " + i + " of type " + i2);
        return new C19714();
    }
}
