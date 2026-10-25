package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;

/* compiled from: 18UV */
/* renamed from: l.ۜܿۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6908 extends AbstractC4086 implements InterfaceC16653 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21317 = 0;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10232 f21318 = AbstractC10232.m25862(new C5518());

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Thread f21319;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4107 f21320;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f21321;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18231 f21322;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f21323;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f21324;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1969 f21325;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23156 f21326;

    @Override // l.AbstractC5497
    /* renamed from: ܽ */
    public final InterfaceC16653 mo15627() {
        return this;
    }

    public C6908(ContextWrapper contextWrapper) {
        C4107 c4107 = new C4107();
        C23156 c23156 = C23156.f74419;
        this.f21321 = new Object();
        this.f21324 = contextWrapper.getApplicationContext();
        this.f21320 = c4107;
        if (c23156 != null) {
            this.f21326 = c23156;
        } else {
            c23156.getClass();
            C11868 c11868 = new C11868(c23156);
            c11868.m28994(c23156);
            this.f21326 = new C23156(c11868, 0);
        }
        this.f21322 = C18231.f56651;
        boolean z = this.f21326.f74423;
    }

    @Override // l.AbstractC5497
    /* renamed from: ܿ */
    public final void mo15628() {
        C1969 c1969;
        synchronized (this.f21321) {
            Thread thread = this.f21319;
            if (thread != null) {
                C22632.m50633("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c1969 = this.f21325) != null) {
            c1969.m6481();
            this.f21325 = null;
        }
        super.mo15628();
    }

    @Override // l.AbstractC5497
    /* renamed from: ۧ */
    public final C11902 mo15626() {
        C23156 c23156;
        synchronized (this.f21321) {
            c23156 = this.f21326;
        }
        return c23156;
    }

    @Override // l.AbstractC5497
    /* renamed from: ֫ */
    public final void mo15624(C11902 c11902) {
        C23156 c23156;
        if (c11902 instanceof C23156) {
            m18696((C23156) c11902);
        }
        synchronized (this.f21321) {
            c23156 = this.f21326;
        }
        C11868 c11868 = new C11868(c23156);
        c11868.m28994(c11902);
        m18696(new C23156(c11868, 0));
    }

    @Override // l.AbstractC5497
    /* renamed from: ֫ */
    public final void mo15625(C18231 c18231) {
        if (this.f21322.equals(c18231)) {
            return;
        }
        this.f21322 = c18231;
        m18699();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18696(C23156 c23156) {
        boolean equals;
        synchronized (this.f21321) {
            equals = this.f21326.equals(c23156);
            this.f21326 = c23156;
        }
        if (equals) {
            return;
        }
        if (c23156.f74423 && this.f21324 == null) {
            C19956.m46037("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m15629();
    }

    @Override // l.AbstractC4086
    /* renamed from: ֫ */
    public final Pair mo12283(C2675 c2675, int[][][] iArr, final int[] iArr2, C15894 c15894, AbstractC4846 abstractC4846) {
        final C23156 c23156;
        int i;
        int i2;
        final boolean z;
        final String str;
        final String str2;
        boolean z2;
        C21020[] c21020Arr;
        InterfaceC9731[] interfaceC9731Arr;
        int i3;
        InterfaceC9731 c18924;
        int i4;
        int[][] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        synchronized (this.f21321) {
            this.f21319 = Thread.currentThread();
            c23156 = this.f21326;
        }
        if (this.f21323 == null && (context = this.f21324) != null) {
            this.f21323 = Boolean.valueOf(C3603.m11050(context));
        }
        if (c23156.f74423 && Build.VERSION.SDK_INT >= 32 && this.f21325 == null) {
            this.f21325 = new C1969(this.f21324, this, this.f21323);
        }
        int m8370 = c2675.m8370();
        Context context2 = this.f21324;
        int m83702 = c2675.m8370();
        C21020[] c21020Arr2 = new C21020[m83702];
        int i5 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i5 >= c2675.m8370()) {
                z = false;
                break;
            }
            if (2 == c2675.m8371(i5) && c2675.m8375(i5).f18978 > 0) {
                z = true;
                break;
            }
            i5++;
        }
        Pair m18692 = m18692(1, c2675, iArr, new InterfaceC16785() { // from class: l.᩹ᩳۧ
            @Override // l.InterfaceC16785
            /* renamed from: ֫ */
            public final List mo4346(int i6, C13312 c13312, int[] iArr4) {
                C22451 c22451 = this;
                C6908 c6908 = C6908.this;
                C23156 c231562 = c23156;
                C13278 c13278 = new C13278(c6908, c231562);
                int i7 = iArr2[i6];
                int i8 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                int i9 = 0;
                while (i9 < c13312.f39854) {
                    c1846.m16264(new C12573(i6, c13312, i9, c231562, iArr4[i9], z, c13278, i7));
                    i9++;
                    c22451 = this;
                }
                return c1846.m6131();
            }
        }, new C20335());
        if (m18692 != null) {
            c21020Arr2[((Integer) m18692.second).intValue()] = (C21020) m18692.first;
        }
        if (m18692 == null) {
            str = null;
        } else {
            C21020 c21020 = (C21020) m18692.first;
            str = c21020.f67856.m32295(c21020.f67857[0]).f25603;
        }
        c23156.f35547.getClass();
        final Point m11018 = (!c23156.f35575 || context2 == null) ? null : C3603.m11018(context2);
        Pair m186922 = m18692(2, c2675, iArr, new InterfaceC16785() { // from class: l.ܶᩳۧ
            /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
            @Override // l.InterfaceC16785
            /* renamed from: ֫ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List mo4346(int r17, l.C13312 r18, int[] r19) {
                /*
                    Method dump skipped, instructions count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C15394.mo4346(int, l.۬᩵֫, int[]):java.util.List");
            }
        }, new C21746());
        int i6 = 4;
        Pair m186923 = (c23156.f35563 || m186922 == null) ? m18692(4, c2675, iArr, new InterfaceC16785() { // from class: l.֨ᩳۧ
            @Override // l.InterfaceC16785
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final List mo4346(int i7, C13312 c13312, int[] iArr4) {
                int i8 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                for (int i9 = 0; i9 < c13312.f39854; i9++) {
                    int i10 = i9;
                    c1846.m16264(new C10457(i7, c13312, i10, C23156.this, iArr4[i9]));
                }
                return c1846.m6131();
            }
        }, new C8340()) : null;
        if (m186923 != null) {
            c21020Arr2[((Integer) m186923.second).intValue()] = (C21020) m186923.first;
        } else if (m186922 != null) {
            c21020Arr2[((Integer) m186922.second).intValue()] = (C21020) m186922.first;
        }
        if (!c23156.f35561 || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            String str3 = C3603.f11424;
            str2 = locale.toLanguageTag();
        }
        int i7 = 3;
        Pair m186924 = m18692(3, c2675, iArr, new InterfaceC16785() { // from class: l.ۙᩳۧ
            @Override // l.InterfaceC16785
            /* renamed from: ֫ */
            public final List mo4346(int i8, C13312 c13312, int[] iArr4) {
                int i9 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                for (int i10 = 0; i10 < c13312.f39854; i10++) {
                    int i11 = i10;
                    c1846.m16264(new C11142(i8, c13312, i11, C23156.this, iArr4[i10], str, str2));
                }
                return c1846.m6131();
            }
        }, new C3401());
        if (m186924 != null) {
            c21020Arr2[((Integer) m186924.second).intValue()] = (C21020) m186924.first;
        }
        int i8 = 0;
        while (i8 < m83702) {
            int m8371 = c2675.m8371(i8);
            if (m8371 == i || m8371 == i2 || m8371 == i7 || m8371 == i6) {
                i4 = m83702;
            } else {
                C6181 m8375 = c2675.m8375(i8);
                int[][] iArr4 = iArr[i8];
                int i9 = 0;
                int i10 = 0;
                C13312 c13312 = null;
                C6223 c6223 = null;
                while (i9 < m8375.f18978) {
                    C13312 m17102 = m8375.m17102(i9);
                    int[] iArr5 = iArr4[i9];
                    C6181 c6181 = m8375;
                    int i11 = 0;
                    while (i11 < m17102.f39854) {
                        int i12 = m83702;
                        if (C11010.m27352(iArr5[i11], c23156.f74426)) {
                            iArr3 = iArr4;
                            C6223 c62232 = new C6223(m17102.m32295(i11), iArr5[i11]);
                            if (c6223 == null || c62232.compareTo(c6223) > 0) {
                                c6223 = c62232;
                                i10 = i11;
                                c13312 = m17102;
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i11++;
                        m83702 = i12;
                        iArr4 = iArr3;
                    }
                    i9++;
                    m8375 = c6181;
                }
                i4 = m83702;
                c21020Arr2[i8] = c13312 == null ? null : new C21020(0, c13312, new int[]{i10});
            }
            i8++;
            i7 = 3;
            i = 2;
            i2 = 1;
            i6 = 4;
            m83702 = i4;
        }
        int m83703 = c2675.m8370();
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < m83703; i13++) {
            m18694(c2675.m8375(i13), c23156, hashMap);
        }
        m18694(c2675.m8374(), c23156, hashMap);
        for (int i14 = 0; i14 < m83703; i14++) {
            C12607 c12607 = (C12607) hashMap.get(Integer.valueOf(c2675.m8371(i14)));
            if (c12607 != null) {
                C13312 c133122 = c12607.f38012;
                AbstractC14545 abstractC14545 = c12607.f38013;
                c21020Arr2[i14] = (abstractC14545.isEmpty() || c2675.m8375(i14).m17101(c133122) == -1) ? null : new C21020(0, c133122, C13426.m32449(abstractC14545));
            }
        }
        int m83704 = c2675.m8370();
        for (int i15 = 0; i15 < m83704; i15++) {
            C6181 m83752 = c2675.m8375(i15);
            if (c23156.m51338(i15, m83752)) {
                if (c23156.m51336(i15, m83752) != null) {
                    throw null;
                }
                c21020Arr2[i15] = null;
            }
        }
        for (int i16 = 0; i16 < m8370; i16++) {
            int m83712 = c2675.m8371(i16);
            if (c23156.m51337(i16) || c23156.f35559.contains(Integer.valueOf(m83712))) {
                c21020Arr2[i16] = null;
            }
        }
        C4107 c4107 = this.f21320;
        InterfaceC13257 m15621 = m15621();
        c4107.getClass();
        AbstractC14545 m43666 = C18924.m43666(c21020Arr2);
        InterfaceC9731[] interfaceC9731Arr2 = new InterfaceC9731[c21020Arr2.length];
        int i17 = 0;
        while (i17 < c21020Arr2.length) {
            C21020 c210202 = c21020Arr2[i17];
            if (c210202 != null) {
                int[] iArr6 = c210202.f67857;
                if (iArr6.length != 0) {
                    if (iArr6.length == 1) {
                        c18924 = new C9025(c210202.f67856, new int[]{iArr6[0]});
                        c21020Arr = c21020Arr2;
                        interfaceC9731Arr = interfaceC9731Arr2;
                        i3 = i17;
                    } else {
                        c21020Arr = c21020Arr2;
                        long j = 25000;
                        interfaceC9731Arr = interfaceC9731Arr2;
                        i3 = i17;
                        c18924 = new C18924(c210202.f67856, iArr6, m15621, 10000, j, j, (AbstractC14545) m43666.get(i17));
                    }
                    interfaceC9731Arr[i3] = c18924;
                    i17 = i3 + 1;
                    c21020Arr2 = c21020Arr;
                    interfaceC9731Arr2 = interfaceC9731Arr;
                }
            }
            c21020Arr = c21020Arr2;
            interfaceC9731Arr = interfaceC9731Arr2;
            i3 = i17;
            i17 = i3 + 1;
            c21020Arr2 = c21020Arr;
            interfaceC9731Arr2 = interfaceC9731Arr;
        }
        InterfaceC9731[] interfaceC9731Arr3 = interfaceC9731Arr2;
        C17359[] c17359Arr = new C17359[m8370];
        for (int i18 = 0; i18 < m8370; i18++) {
            c17359Arr[i18] = (c23156.m51337(i18) || c23156.f35559.contains(Integer.valueOf(c2675.m8371(i18))) || (c2675.m8371(i18) != -2 && interfaceC9731Arr3[i18] == null)) ? null : C17359.f53166;
        }
        if (c23156.f74422) {
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < c2675.m8370(); i21++) {
                int m83713 = c2675.m8371(i21);
                InterfaceC9731 interfaceC9731 = interfaceC9731Arr3[i21];
                if ((m83713 == 1 || m83713 == 2) && interfaceC9731 != null) {
                    int[][] iArr7 = iArr[i21];
                    int m17101 = c2675.m8375(i21).m17101(interfaceC9731.mo2388());
                    int i22 = 0;
                    while (true) {
                        if (i22 < interfaceC9731.length()) {
                            if ((iArr7[m17101][interfaceC9731.mo2384(i22)] & 32) != 32) {
                                break;
                            }
                            i22++;
                        } else if (m83713 == 1) {
                            if (i20 != -1) {
                                z2 = false;
                                break;
                            }
                            i20 = i21;
                        } else {
                            if (i19 != -1) {
                                z2 = false;
                                break;
                            }
                            i19 = i21;
                        }
                    }
                }
            }
            z2 = true;
            if (z2 & ((i20 == -1 || i19 == -1) ? false : true)) {
                C17359 c17359 = new C17359(0, true);
                c17359Arr[i20] = c17359;
                c17359Arr[i19] = c17359;
            }
        }
        c23156.f35547.getClass();
        return Pair.create(c17359Arr, interfaceC9731Arr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r6.m6480() != false) goto L42;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18697(l.C6908 r5, l.C23156 r6, l.C8353 r7) {
        /*
            boolean r6 = r6.f74423
            r0 = 1
            if (r6 == 0) goto L8e
            java.lang.Boolean r6 = r5.f21323
            if (r6 == 0) goto Lf
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L8e
        Lf:
            int r6 = r7.f25625
            r1 = -1
            if (r6 == r1) goto L8e
            r2 = 2
            if (r6 <= r2) goto L8e
            java.lang.String r6 = r7.f25614
            r2 = 0
            r3 = 32
            if (r6 != 0) goto L1f
            goto L64
        L1f:
            int r4 = r6.hashCode()
            switch(r4) {
                case -2123537834: goto L48;
                case 187078296: goto L3d;
                case 187078297: goto L32;
                case 1504578661: goto L27;
                default: goto L26;
            }
        L26:
            goto L52
        L27:
            java.lang.String r4 = "audio/eac3"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L30
            goto L52
        L30:
            r1 = 3
            goto L52
        L32:
            java.lang.String r4 = "audio/ac4"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L3b
            goto L52
        L3b:
            r1 = 2
            goto L52
        L3d:
            java.lang.String r4 = "audio/ac3"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L46
            goto L52
        L46:
            r1 = 1
            goto L52
        L48:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L51
            goto L52
        L51:
            r1 = 0
        L52:
            switch(r1) {
                case 0: goto L56;
                case 1: goto L56;
                case 2: goto L56;
                case 3: goto L56;
                default: goto L55;
            }
        L55:
            goto L64
        L56:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L8e
            l.֫ܿۧ r6 = r5.f21325
            if (r6 == 0) goto L8e
            boolean r6 = r6.m6480()
            if (r6 == 0) goto L8e
        L64:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L8d
            l.֫ܿۧ r6 = r5.f21325
            if (r6 == 0) goto L8d
            boolean r6 = r6.m6480()
            if (r6 == 0) goto L8d
            l.֫ܿۧ r6 = r5.f21325
            boolean r6 = r6.m6477()
            if (r6 == 0) goto L8d
            l.֫ܿۧ r6 = r5.f21325
            boolean r6 = r6.m6479()
            if (r6 == 0) goto L8d
            l.֫ܿۧ r6 = r5.f21325
            l.ᩳᩴ֫ r5 = r5.f21322
            boolean r5 = r6.m6478(r5, r7)
            if (r5 == 0) goto L8d
            goto L8e
        L8d:
            return r2
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6908.m18697(l.ۜܿۧ, l.᩺ᩳۧ, l.۠ᩴ֫):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m18692(int i, C2675 c2675, int[][][] iArr, InterfaceC16785 interfaceC16785, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        C2675 c26752 = c2675;
        ArrayList arrayList = new ArrayList();
        int m8370 = c2675.m8370();
        int i3 = 0;
        while (i3 < m8370) {
            if (i == c26752.m8371(i3)) {
                C6181 m8375 = c26752.m8375(i3);
                for (int i4 = 0; i4 < m8375.f18978; i4++) {
                    C13312 m17102 = m8375.m17102(i4);
                    List mo4346 = interfaceC16785.mo4346(i3, m17102, iArr[i3][i4]);
                    int i5 = m17102.f39854;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        AbstractC18197 abstractC18197 = (AbstractC18197) mo4346.get(i6);
                        int mo26319 = abstractC18197.mo26319();
                        if (zArr[i6] || mo26319 == 0) {
                            i2 = m8370;
                        } else {
                            if (mo26319 == 1) {
                                randomAccess = AbstractC14545.of((Object) abstractC18197);
                                i2 = m8370;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC18197);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    AbstractC18197 abstractC181972 = (AbstractC18197) mo4346.get(i7);
                                    int i8 = m8370;
                                    if (abstractC181972.mo26319() == 2 && abstractC18197.mo26321(abstractC181972)) {
                                        arrayList2.add(abstractC181972);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    m8370 = i8;
                                }
                                i2 = m8370;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        m8370 = i2;
                    }
                }
            }
            i3++;
            c26752 = c2675;
            m8370 = m8370;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC18197) list.get(i9)).f56578;
        }
        AbstractC18197 abstractC181973 = (AbstractC18197) list.get(0);
        return Pair.create(new C21020(0, abstractC181973.f56579, iArr2), Integer.valueOf(abstractC181973.f56581));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m18699() {
        boolean z;
        C1969 c1969;
        synchronized (this.f21321) {
            z = this.f21326.f74423 && Build.VERSION.SDK_INT >= 32 && (c1969 = this.f21325) != null && c1969.m6480();
        }
        if (z) {
            m15629();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18700(AbstractC4930 abstractC4930) {
        boolean z;
        synchronized (this.f21321) {
            z = this.f21326.f74431;
        }
        if (z) {
            m15623(abstractC4930);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18694(C6181 c6181, C11902 c11902, HashMap hashMap) {
        for (int i = 0; i < c6181.f18978; i++) {
            C12607 c12607 = (C12607) c11902.f35552.get(c6181.m17102(i));
            if (c12607 != null) {
                C13312 c13312 = c12607.f38012;
                C12607 c126072 = (C12607) hashMap.get(Integer.valueOf(c13312.f39853));
                if (c126072 == null || (c126072.f38013.isEmpty() && !c12607.f38013.isEmpty())) {
                    hashMap.put(Integer.valueOf(c13312.f39853), c12607);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18693(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18691(C8353 c8353, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c8353.f25603)) {
            return 4;
        }
        String m18693 = m18693(str);
        String m186932 = m18693(c8353.f25603);
        if (m186932 == null || m18693 == null) {
            return (z && m186932 == null) ? 1 : 0;
        }
        if (m186932.startsWith(m18693) || m18693.startsWith(m186932)) {
            return 3;
        }
        String str2 = C3603.f11424;
        return m186932.split("-", 2)[0].equals(m18693.split("-", 2)[0]) ? 2 : 0;
    }
}
