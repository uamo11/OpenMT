package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* compiled from: H6NE */
/* renamed from: l.۬᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13429 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Runnable f40129;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f40130;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Supplier f40131;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f40132;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f40133;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3532 f40134;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f40135;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final char[] f40136 = new char[256];

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7744 f40137;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40138;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuilder f40139;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40140;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6374 f40141;

    public C13429(C6374 c6374, C7744 c7744, Runnable runnable, Supplier supplier) {
        this.f40141 = c6374;
        this.f40137 = c7744;
        this.f40129 = runnable;
        this.f40131 = supplier;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32457(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        long j;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5;
        ArrayList arrayList3;
        C6374 c6374 = this.f40141;
        i3 = c6374.f19722;
        if (i3 == 0) {
            c6374.f19716 = i;
        }
        i4 = c6374.f19722;
        c6374.f19722 = i4 + 1;
        c6374.f19715 = i2;
        j = c6374.f19720;
        c6374.f19720 = (charSequence.length() - (i2 - i)) + j;
        if (i == i2 && charSequence.length() == 0) {
            return;
        }
        this.f40133 = (i2 - i) + charSequence.length() + this.f40133;
        z = c6374.f19719;
        if (!z) {
            i5 = c6374.f19722;
            if (i5 <= 128 && this.f40133 <= 65536) {
                arrayList3 = c6374.f19717;
                arrayList3.add(new C10608(i, i2, charSequence.toString()));
                return;
            }
        }
        z2 = c6374.f19719;
        if (!z2) {
            c6374.f19719 = true;
            arrayList = c6374.f19717;
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2 = c6374.f19717;
            arrayList2.clear();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                C10608 c10608 = (C10608) it.next();
                m32459(c10608.f31869, c10608.f31865, c10608.f31868);
            }
        }
        m32459(i, i2, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if ((r16.f40135 + r12) <= ((r16.f40130 + r7) * 4)) goto L20;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32459(int r17, int r18, java.lang.CharSequence r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Runnable r3 = r0.f40129
            r3.run()
            java.lang.StringBuilder r3 = r0.f40139
            r4 = 0
            if (r3 != 0) goto L12
            r3 = 0
            goto L16
        L12:
            int r3 = r0.f40140
            int r3 = r1 - r3
        L16:
            long r5 = (long) r2
            long r7 = (long) r1
            long r7 = r5 - r7
            int r9 = r19.length()
            long r9 = (long) r9
            long r7 = r7 + r9
            java.lang.StringBuilder r9 = r0.f40139
            if (r9 == 0) goto L6a
            r10 = 256(0x100, float:3.59E-43)
            if (r3 > r10) goto L52
            int r10 = r0.f40138
            long r10 = (long) r10
            long r5 = r5 - r10
            r10 = 65536(0x10000, double:3.2379E-319)
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 > 0) goto L52
            int r5 = r9.length()
            long r5 = (long) r5
            long r12 = (long) r3
            long r5 = r5 + r12
            int r3 = r19.length()
            long r14 = (long) r3
            long r5 = r5 + r14
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto L52
            long r5 = r0.f40135
            long r5 = r5 + r12
            long r9 = r0.f40130
            long r9 = r9 + r7
            r11 = 4
            long r9 = r9 * r11
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L6a
        L52:
            java.lang.StringBuilder r3 = r0.f40139
            if (r3 != 0) goto L57
            goto L6a
        L57:
            l.ۤ᩺ᩳ r5 = new l.ۤ᩺ᩳ
            int r6 = r0.f40138
            int r9 = r0.f40140
            java.lang.String r3 = r3.toString()
            r5.<init>(r6, r9, r3)
            r0.m32458(r5)
            r3 = 0
            r0.f40139 = r3
        L6a:
            java.lang.StringBuilder r3 = r0.f40139
            if (r3 != 0) goto L9a
            int r3 = r2 - r1
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r3 > r5) goto L8d
            int r3 = r19.length()
            if (r3 <= r5) goto L7b
            goto L8d
        L7b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r0.f40139 = r3
            r0.f40138 = r1
            r0.f40140 = r1
            r5 = 0
            r0.f40130 = r5
            r0.f40135 = r5
            goto L9a
        L8d:
            l.ۤ᩺ᩳ r3 = new l.ۤ᩺ᩳ
            java.lang.String r4 = r19.toString()
            r3.<init>(r1, r2, r4)
            r0.m32458(r3)
            return
        L9a:
            int r3 = r0.f40140
            int r5 = r1 - r3
            if (r5 == 0) goto Lac
            l.۟᩸ᩳ r6 = r0.f40137
            char[] r9 = r0.f40136
            r6.getChars(r3, r1, r9, r4)
            java.lang.StringBuilder r1 = r0.f40139
            r1.append(r9, r4, r5)
        Lac:
            java.lang.StringBuilder r1 = r0.f40139
            r3 = r19
            r1.append(r3)
            long r3 = r0.f40135
            long r5 = (long) r5
            long r3 = r3 + r5
            r0.f40135 = r3
            long r3 = r0.f40130
            long r3 = r3 + r7
            r0.f40130 = r3
            r0.f40140 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13429.m32459(int, int, java.lang.CharSequence):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32458(C10608 c10608) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = this.f40132;
        int i = c10608.f31866;
        long j2 = j + i;
        this.f40132 = j2;
        C3532 c3532 = this.f40134;
        C6374 c6374 = this.f40141;
        if (c3532 == null && j2 > 524288) {
            this.f40134 = (C3532) this.f40131.get();
            arrayList2 = c6374.f19717;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C10608 c106082 = (C10608) it.next();
                c106082.f31867 = this.f40134.length();
                m32456(this.f40134, c106082.f31868, 0, c106082.f31866);
                c106082.f31868 = null;
            }
        }
        C3532 c35322 = this.f40134;
        if (c35322 != null) {
            c10608.f31867 = c35322.length();
            m32456(this.f40134, c10608.f31868, 0, i);
            c10608.f31868 = null;
        }
        arrayList = c6374.f19717;
        arrayList.add(c10608);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32456(C3532 c3532, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            this.f40129.run();
            int min = Math.min(8192, i2 - i) + i;
            c3532.append(charSequence, i, min);
            i = min;
        }
    }

    public final void finish() {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        C13409 c13409;
        int i;
        long j2;
        int i2;
        long j3;
        C13409 c134092;
        C10608 c10608;
        CharSequence charSequence;
        long j4;
        C7744 c7744 = this.f40137;
        long length = c7744.length();
        C6374 c6374 = this.f40141;
        j = c6374.f19720;
        long j5 = length + j;
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException("Replacement result is too large");
        }
        StringBuilder sb = this.f40139;
        if (sb != null) {
            m32458(new C10608(this.f40138, this.f40140, sb.toString()));
            this.f40139 = null;
        }
        C3532 c3532 = this.f40134;
        if (c3532 != null) {
            c6374.f19718 = c3532.finish();
        }
        arrayList = c6374.f19717;
        if (arrayList.size() <= 512) {
            return;
        }
        Runnable runnable = this.f40129;
        runnable.run();
        arrayList2 = c6374.f19717;
        int i3 = 0;
        long j6 = ((C10608) arrayList2.get(0)).f31869;
        long max = Math.max(65536L, (((((C10608) C18566.m43105(arrayList2, 1)).f31865 - j6) + this.f40132) + 511) / 512);
        ArrayList arrayList3 = new ArrayList(512);
        CharBuffer allocate = CharBuffer.allocate(8192);
        C3532 c35322 = (C3532) this.f40131.get();
        try {
            Iterator it = arrayList2.iterator();
            long j7 = -1;
            long j8 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                C10608 c106082 = (C10608) it.next();
                runnable.run();
                int i6 = c106082.f31869;
                Iterator it2 = it;
                int i7 = c106082.f31866;
                C6374 c63742 = c6374;
                long j9 = ((i6 - j6) + j8) / max;
                if (j9 != j7) {
                    j2 = 0;
                    if (j7 >= 0) {
                        j4 = j9;
                        long j10 = max;
                        int i8 = i4;
                        j3 = j10;
                        arrayList3.add(new C10608(i8, i5, i3, c35322.length() - i3));
                    } else {
                        j4 = j9;
                        j3 = max;
                    }
                    i3 = c35322.length();
                    i = i6;
                    i2 = i;
                    j7 = j4;
                } else {
                    i = i5;
                    j2 = 0;
                    long j11 = max;
                    i2 = i4;
                    j3 = j11;
                }
                while (i < i6) {
                    runnable.run();
                    int min = Math.min(allocate.capacity(), i6 - i) + i;
                    c7744.getChars(i, min, allocate.array(), 0);
                    c35322.append((CharSequence) allocate, 0, min - i);
                    i = min;
                    i6 = i6;
                }
                c134092 = c63742.f19718;
                if (c134092 == null) {
                    c10608 = c106082;
                    m32456(c35322, c10608.f31868, 0, i7);
                } else {
                    c10608 = c106082;
                    charSequence = c63742.f19718;
                    int i9 = c10608.f31867;
                    m32456(c35322, charSequence, i9, i9 + i7);
                }
                j8 += i7;
                it = it2;
                long j12 = j3;
                i5 = c10608.f31865;
                i4 = i2;
                max = j12;
                c6374 = c63742;
            }
            C6374 c63743 = c6374;
            arrayList3.add(new C10608(i4, i5, i3, c35322.length() - i3));
            runnable.run();
            c13409 = c63743.f19718;
            c63743.f19718 = c35322.finish();
            c63743.f19717 = arrayList3;
            if (c13409 != null) {
                c13409.close();
            }
            c35322.close();
        } finally {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C3532 c3532 = this.f40134;
        if (c3532 != null) {
            c3532.close();
        }
    }
}
