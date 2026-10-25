package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: Z6ZC */
/* renamed from: l.۟ۢܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7391 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13035 f22742;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f22743;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f22746;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22747;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f22752 = 1.0f;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f22744 = -1;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f22745 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17768 f22750 = new C17768();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13740 f22753 = new InterfaceC23694() { // from class: l.ܰۢܿ
        @Override // l.InterfaceC23694
        /* renamed from: ֫ */
        public final boolean mo27305(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Runnable runnable) {
            return C7391.m19892(C7391.this, canvas, f, f2, f3, f4, runnable);
        }
    };

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19886 f22748 = new C19886();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19886 f22751 = new C19886();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23619 f22749 = new C23619();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19901(C13035 c13035, int i, int i2, int i3) {
        this.f22742 = c13035;
        this.f22744 = i;
        this.f22745 = i2;
        this.f22747 = i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19902() {
        return this.f22746;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19898(float f, int i) {
        this.f22743 = i;
        this.f22752 = f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19903(C9302 c9302, int i, int i2, int i3) {
        boolean z = false;
        if (c9302 == null || i2 < 0 || i2 >= i3 || i3 > c9302.m23880()) {
            return false;
        }
        synchronized (this.f22751) {
            C19886 c19886 = this.f22751;
            c19886.m45726(c9302);
            try {
                if (c19886.m45727(i2) && c19886.m45725() >= i3) {
                    if (c19886.m45730().m49205() == i) {
                        z = true;
                    }
                }
            } finally {
                c19886.m45733();
            }
        }
        return z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19906(int i, int i2, C9302 c9302) {
        C19886 c19886 = this.f22751;
        synchronized (c19886) {
            m19891(c19886, c9302);
            try {
                if (!m19893(c19886, i, i)) {
                    return i2;
                }
                return c19886.m45730().m49205();
            } finally {
                c19886.m45733();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        r19.m45733();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19900(l.C9302 r22, android.graphics.Canvas r23, java.lang.CharSequence r24, int r25, int r26, float r27, int r28, int r29, android.graphics.Paint r30, l.C22686 r31) {
        /*
            r21 = this;
            r15 = r21
            r0 = r26
            r1 = 0
            r15.f22746 = r1
            l.᩶ۖܿ r14 = r15.f22748
            r1 = r22
            m19891(r14, r1)
            r1 = r25
            boolean r2 = r14.m45727(r1)     // Catch: java.lang.Throwable -> L96
            if (r2 != 0) goto L1a
            r14.m45733()
            return
        L1a:
            r2 = 0
            r3 = 0
            r5 = r1
            r16 = 0
            r17 = 0
        L21:
            l.᩸᩷ܿ r1 = r14.m45730()     // Catch: java.lang.Throwable -> L96
            int r2 = r14.m45725()     // Catch: java.lang.Throwable -> L96
            int r13 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L96
            if (r13 >= r0) goto L33
            r2 = 1
            r18 = 1
            goto L36
        L33:
            r2 = 0
            r18 = 0
        L36:
            int r2 = r1.m49205()     // Catch: java.lang.Throwable -> L96
            float r3 = r15.f22752     // Catch: java.lang.Throwable -> L96
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L43
            goto L49
        L43:
            int r4 = r15.f22743     // Catch: java.lang.Throwable -> L96
            int r2 = l.C7191.m19267(r4, r2, r3)     // Catch: java.lang.Throwable -> L96
        L49:
            r12 = r30
            r12.setColor(r2)     // Catch: java.lang.Throwable -> L96
            int r19 = r1.m49213()     // Catch: java.lang.Throwable -> L96
            r1 = r21
            r2 = r31
            r3 = r23
            r4 = r24
            r6 = r13
            r7 = r16
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r17
            r12 = r30
            r20 = r13
            r13 = r19
            r19 = r14
            r14 = r18
            float r1 = r1.m19889(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L94
            if (r18 != 0) goto L79
            r19.m45733()
            return
        L79:
            float r16 = r16 + r1
            float r17 = r17 + r1
            r1 = r29
            float r2 = (float) r1
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 > 0) goto L90
            boolean r2 = r19.m45731()     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L8b
            goto L90
        L8b:
            r14 = r19
            r5 = r20
            goto L21
        L90:
            r19.m45733()
            return
        L94:
            r0 = move-exception
            goto L99
        L96:
            r0 = move-exception
            r19 = r14
        L99:
            r19.m45733()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7391.m19900(l.ۢۖܿ, android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, android.graphics.Paint, l.᩺֫ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19889(C22686 c22686, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
        C17768 c17768;
        int i6;
        Paint paint2;
        int m49205;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        float m24472;
        boolean z4;
        C7391 c7391 = this;
        Paint paint3 = paint;
        C13035 c13035 = c7391.f22742;
        if (c13035 != null) {
            int i13 = c13035.f39035;
            int i14 = c13035.f39036;
            if (i14 < i2 && i13 > i && (c7391.f22744 > i || i2 > c7391.f22745)) {
                int color = paint.getColor();
                C9302 c9302 = c13035.f39034;
                C17768 c177682 = c7391.f22750;
                c177682.m41620(c9302);
                int i15 = i;
                float f4 = 0.0f;
                while (i15 < i2) {
                    float f5 = f + f4;
                    if (f5 > i4) {
                        break;
                    }
                    if (i15 < i14) {
                        z2 = false;
                        m49205 = color;
                        i7 = i14;
                    } else if (i15 < i13) {
                        try {
                            if (c7391.f22744 <= i15 && i15 < (i8 = c7391.f22745)) {
                                i7 = Math.min(i2, i8);
                                m49205 = color;
                                z2 = false;
                            } else {
                                c177682.m41621(i15 - i14);
                                int min = Math.min(i2, c177682.m41619() + i14);
                                int i16 = c7391.f22744;
                                if (i15 < i16) {
                                    min = Math.min(min, i16);
                                }
                                m49205 = c177682.m41624().m49205();
                                i7 = min;
                                z2 = (m49205 == color || m49205 == c7391.f22747) ? false : true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c17768 = c177682;
                            i6 = color;
                            paint2 = paint3;
                            paint2.setColor(i6);
                            c17768.m41620(C9302.m23878());
                            throw th;
                        }
                    } else {
                        z2 = false;
                        i7 = i2;
                        m49205 = color;
                    }
                    try {
                        paint3.setColor(m49205);
                        if (!z2 || c7391.f22746) {
                            i10 = i7;
                            c17768 = c177682;
                            i9 = color;
                            i11 = i14;
                            i12 = i13;
                            float f6 = f3 + f4;
                            if (!z && i10 >= i2) {
                                z3 = false;
                                m24472 = c22686.m24472(canvas, charSequence, i15, i10, f5, f2, i3, i4, f6, paint, i5, z3);
                            }
                            z3 = true;
                            m24472 = c22686.m24472(canvas, charSequence, i15, i10, f5, f2, i3, i4, f6, paint, i5, z3);
                        } else {
                            float f7 = f3 + f4;
                            try {
                                if (!z && i7 >= i2) {
                                    z4 = false;
                                    C13740 c13740 = c7391.f22753;
                                    i10 = i7;
                                    c17768 = c177682;
                                    i9 = color;
                                    i11 = i14;
                                    i12 = i13;
                                    m24472 = c22686.m24473(canvas, charSequence, i15, i7, f5, f2, i3, i4, f7, paint, i5, z4, c13740);
                                }
                                m24472 = c22686.m24473(canvas, charSequence, i15, i7, f5, f2, i3, i4, f7, paint, i5, z4, c13740);
                            } catch (Throwable th2) {
                                th = th2;
                                paint2 = paint;
                                i6 = i9;
                                paint2.setColor(i6);
                                c17768.m41620(C9302.m23878());
                                throw th;
                            }
                            z4 = true;
                            C13740 c137402 = c7391.f22753;
                            i10 = i7;
                            c17768 = c177682;
                            i9 = color;
                            i11 = i14;
                            i12 = i13;
                        }
                        f4 += m24472;
                        paint3 = paint;
                        i15 = i10;
                        c177682 = c17768;
                        color = i9;
                        i14 = i11;
                        i13 = i12;
                        c7391 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c17768 = c177682;
                        i9 = color;
                    }
                }
                paint3.setColor(color);
                c177682.m41620(C9302.m23878());
                return f4;
            }
        }
        return c22686.m24472(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19892(C7391 c7391, Canvas canvas, float f, float f2, float f3, float f4, Runnable runnable) {
        runnable.run();
        int save = canvas.save();
        try {
            if (canvas.clipRect((float) Math.floor(f), (float) Math.floor(f2), (float) Math.ceil(f3), (float) Math.ceil(f4))) {
                c7391.f22746 = true;
            }
            canvas.restoreToCount(save);
            return c7391.f22746;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m19896(C6686 c6686, CharSequence charSequence, int i, int i2) {
        C21834 mo18558;
        C21834 m19890;
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C21834 c21834 = null;
        if (charSequence.length() != c6686.m18230() || i < 0 || i > i2 || i2 > charSequence.length() || !c6686.m18232(i, i2)) {
            return null;
        }
        if (i != i2) {
            C23619 c23619 = this.f22749;
            c23619.m52105(c6686, i, i2);
            C9302 m18228 = c6686.m18228();
            C19886 c19886 = this.f22748;
            m19891(c19886, m18228);
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            C21834 c218342 = null;
            do {
                try {
                    int m52107 = c23619.m52107();
                    int m52104 = c23619.m52104();
                    int m52106 = c23619.m52106();
                    int m18231 = c6686.m18231(m52106);
                    C15068 m18234 = c6686.m18234(m52106);
                    if (m18234 != null) {
                        Iterator it = m18234.m35655().iterator();
                        while (it.hasNext()) {
                            mo18558 = ((InterfaceC21129) it.next()).mo18558(m52107, m52104, charSequence);
                            if (mo18558 != null) {
                                break;
                            }
                        }
                    }
                    mo18558 = null;
                    if (mo18558 == null && m18228.m23884(m52107, m52104) && c19886.m45727(m52107)) {
                        do {
                            mo18558 = m19890(c19886.m45730());
                            if (mo18558 != null || c19886.m45725() >= m52104) {
                                break;
                            }
                        } while (c19886.m45731());
                    }
                    if (mo18558 != null && (m18231 > i3 || (m18231 == i3 && m52107 < i4))) {
                        i4 = m52107;
                        i3 = m18231;
                        c218342 = mo18558;
                    }
                } finally {
                    c23619.m52108();
                    c19886.m45733();
                }
            } while (c23619.m52109());
            if (i2 < charSequence.length()) {
                int i5 = i2 + 1;
                if (c6686.m18232(i2, i5) && m18228.m23884(i2, i5) && c19886.m45727(i2) && c19886.m45728() == i2 && (m19890 = m19890(c19886.m45730())) != null) {
                    int m182312 = c6686.m18231(c6686.m18226(i2));
                    if (m182312 > i3 || (m182312 == i3 && i2 < i4)) {
                        c218342 = m19890;
                    }
                }
            }
            return c218342;
        }
        C15068 m182342 = c6686.m18234(c6686.m18227(i, i));
        if (m182342 != null) {
            Iterator it2 = m182342.m35655().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C21834 mo185582 = ((InterfaceC21129) it2.next()).mo18558(i, i, charSequence);
                if (mo185582 != null) {
                    c21834 = mo185582;
                    break;
                }
            }
        }
        if (c21834 != null || charSequence.length() == 0) {
            return c21834;
        }
        if (i >= charSequence.length()) {
            i--;
        }
        return m19890(c6686.m18228().m23883(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m19897(C9302 c9302, CharSequence charSequence, int i, int i2) {
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        if (c9302 != null && c9302.m23880() == charSequence.length() && i >= 0 && i <= i2 && i2 <= charSequence.length()) {
            if (i != i2) {
                if (c9302.m23884(i, i2 < charSequence.length() ? i2 + 1 : i2)) {
                    C19886 c19886 = this.f22748;
                    c19886.m45726(c9302);
                    try {
                        if (!c19886.m45727(i)) {
                            return null;
                        }
                        while (c19886.m45728() <= i2) {
                            C21834 m19890 = m19890(c19886.m45730());
                            if (m19890 != null) {
                                return m19890;
                            }
                            if (!c19886.m45731()) {
                                break;
                            }
                        }
                        return null;
                    } finally {
                        c19886.m45733();
                    }
                }
            } else if (charSequence.length() != 0) {
                if (i >= charSequence.length()) {
                    i--;
                }
                return m19890(c9302.m23883(i));
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m19890(C21834 c21834) {
        if ((c21834.m49207() & (-16777216)) != 100663296) {
            return null;
        }
        return C21834.m49198(null, c21834.m49209() | (-16777216), 1447446, c21834.m49211() | (-16777216), 1447446, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m19894(C9302 c9302, CharSequence charSequence, int i, int i2, float f, C9584 c9584) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (c19886.m45727(i) && c19886.m45725() < i2) {
                float m24487 = c9584.m24487(charSequence, i, c19886.m45725(), f);
                while (c19886.m45731()) {
                    if (c19886.m45725() < i2) {
                        m24487 += c9584.m24487(charSequence, c19886.m45728(), c19886.m45725(), f + m24487);
                    } else {
                        return m24487 + c9584.m24487(charSequence, c19886.m45728(), i2, f + m24487);
                    }
                }
                return m24487;
            }
            return c9584.m24487(charSequence, i, i2, f);
        } finally {
            c19886.m45733();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m19895(int i, int i2, C9302 c9302) {
        long j;
        long j2;
        long j3;
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (m19893(c19886, i, i)) {
                int m45728 = c19886.m45728();
                int m45725 = c19886.m45725();
                int m20005 = C7466.m20005(c19886.m45730().m49207(), i2);
                if (i == m45728) {
                    if (c19886.m45729()) {
                        int m200052 = C7466.m20005(c19886.m45730().m49207(), i2);
                        if (m200052 != m20005) {
                            j3 = m200052;
                            j = (j3 & 4294967295L) | ((4294967295L & m20005) << 32);
                            return j;
                        }
                        j2 = m20005;
                    } else {
                        if (m20005 != i2) {
                            j3 = i2;
                            j = (j3 & 4294967295L) | ((4294967295L & m20005) << 32);
                            return j;
                        }
                        j2 = m20005;
                    }
                } else {
                    if (m20005 != i2 && i == m45725 && !c19886.m45731()) {
                        j = ((i2 & 4294967295L) << 32) | (m20005 & 4294967295L);
                        return j;
                    }
                    j2 = m20005;
                }
            } else {
                j2 = i2;
            }
            j = j2 & 4294967295L;
            return j;
        } finally {
            c19886.m45733();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19899(C9302 c9302, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, Paint paint, C22686 c22686, int[] iArr) {
        float f3;
        float m24475;
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        int i4 = i;
        try {
            if (c19886.m45727(i4)) {
                if (c19886.m45725() < i2 || (c19886.m45730().m49207() >>> 24) != 0) {
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i4 < i2) {
                        float f6 = i3;
                        if (f5 > f6) {
                            break;
                        }
                        int min = Math.min(i2, c19886.m45725());
                        int m49207 = c19886.m45730().m49207();
                        if ((m49207 >>> 24) != 0) {
                            f3 = f6;
                            m24475 = m19888(m49207, canvas, charSequence, i4, min, f5, f, f2, f4, i3, paint, c22686, iArr);
                            min = min;
                        } else {
                            f3 = f6;
                            m24475 = c22686.m24475(charSequence, i4, min, f4, Math.max(0.0f, f3 - f5));
                        }
                        f5 += m24475;
                        f4 += m24475;
                        if (f5 >= f3 || min == i2 || !c19886.m45731()) {
                            return;
                        } else {
                            i4 = min;
                        }
                    }
                }
            }
        } finally {
            c19886.m45733();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m19904(int i, C9302 c9302) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (c19886.m45727(i) && c19886.m45730().m49206()) {
                int m45728 = c19886.m45728();
                int m45725 = c19886.m45725();
                while (c19886.m45729() && c19886.m45730().m49206()) {
                    m45728 = c19886.m45728();
                }
                if (!c19886.m45727(i)) {
                    return null;
                }
                while (c19886.m45731() && c19886.m45730().m49206()) {
                    m45725 = c19886.m45725();
                }
                return new int[]{m45728, m45725};
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            c19886.m45733();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14630 m19905(int i, int i2, C9302 c9302) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (m19893(c19886, i, i2)) {
                int m45728 = c19886.m45728();
                int m45725 = c19886.m45725();
                C21834 m45730 = c19886.m45730();
                c19886.m45732();
                return new C14630(m45728, m45725, m45730);
            }
            c19886.m45733();
            return null;
        } finally {
            c19886.m45733();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19891(C19886 c19886, C9302 c9302) {
        if (c9302 == null) {
            c9302 = C9302.m23878();
        }
        c19886.m45726(c9302);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19893(C19886 c19886, int i, int i2) {
        try {
            if (!c19886.m45727(i)) {
                return false;
            }
            if (i >= c19886.m45725() && !c19886.m45731()) {
                return false;
            }
            if (i != i2) {
                return c19886.m45725() >= i2;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m19888(int i, Canvas canvas, CharSequence charSequence, int i2, int i3, float f, float f2, float f3, float f4, int i4, Paint paint, C22686 c22686, int[] iArr) {
        float f5;
        int i5;
        int i6;
        int i7;
        C6761 c6761;
        paint.setColor(i);
        float max = Math.max(0.0f, i4 - f);
        float m24475 = c22686.m24475(charSequence, i2, i3, f4, max);
        float f6 = (int) f2;
        float f7 = (int) f3;
        canvas.drawRect(f, f6, f + m24475, f7, paint);
        C6761 c67612 = null;
        int i8 = 1;
        while (i8 < iArr.length) {
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 1];
            if (i9 == i10 || i10 <= i2 || i9 >= i3) {
                f5 = f7;
                i5 = i8;
            } else {
                if (c67612 == null) {
                    i5 = i8;
                    i6 = i10;
                    f5 = f7;
                    i7 = i9;
                    c67612 = c22686.m24476(charSequence, i2, i3, f4, (C18159) null);
                } else {
                    f5 = f7;
                    i5 = i8;
                    i6 = i10;
                    i7 = i9;
                }
                C6761 c67613 = c67612;
                float m18410 = c67613.m18410(max, Math.max(i2, i7));
                if (m18410 >= m24475) {
                    c6761 = c67613;
                } else {
                    float m184102 = c67613.m18410(max, Math.min(i3, i6));
                    paint.setColor(C7191.m19267(i, iArr[0], 0.7f));
                    c6761 = c67613;
                    canvas.drawRect(f + m18410, f6, f + m184102, f5, paint);
                }
                c67612 = c6761;
            }
            i8 = i5 + 2;
            f7 = f5;
        }
        return m24475;
    }
}
