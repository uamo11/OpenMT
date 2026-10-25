package l;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* compiled from: Y6MY */
/* renamed from: l.ۡܽܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9008 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f27366 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f27367 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27368;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23251(C7744 c7744, C20736 c20736, C4507 c4507, BooleanSupplier booleanSupplier) {
        int i;
        int i2;
        C9008 c9008 = new C9008();
        int i3 = 0;
        while (i3 < c20736.size()) {
            m23254(booleanSupplier);
            int m47365 = c20736.m47365(i3);
            int i4 = m47365 + 1;
            int m47355 = c20736.m47355(i3);
            int m47358 = c20736.m47358(m47365);
            if (c4507 == null || (i4 > c4507.m13254() && i3 < c4507.m13253())) {
                int i5 = m47355;
                int i6 = i5;
                while (true) {
                    m23254(booleanSupplier);
                    int m23250 = m23250(c7744, i6, m47358, booleanSupplier);
                    int i7 = i5;
                    i5 = i7;
                    c9008.m23253(i6, m23250, i3, i4, i6 == i7, m23250 == m47358, false);
                    if (m23250 >= m47358) {
                        break;
                    }
                    i6 = m23250;
                }
            } else {
                int i8 = i3;
                while (i8 < i4) {
                    m23254(booleanSupplier);
                    int i9 = i8 + 1;
                    int m473552 = c20736.m47355(i8);
                    int m473582 = c20736.m47358(i8);
                    if (m473582 - m473552 > 100000) {
                        while (true) {
                            m23254(booleanSupplier);
                            int m232502 = m23250(c7744, m473552, m473582, booleanSupplier);
                            boolean z = i8 == i3 && m473552 == m47355;
                            boolean z2 = i9 == i4 && m232502 == m47358;
                            int i10 = i9;
                            int i11 = m473582;
                            boolean z3 = z;
                            i2 = i9;
                            boolean z4 = z2;
                            i = m47355;
                            int i12 = i8;
                            c9008.m23253(m473552, m232502, i8, i10, z3, z4, true);
                            m473552 = m232502;
                            if (m473552 >= i11) {
                                break;
                            }
                            m473582 = i11;
                            i8 = i12;
                            i9 = i2;
                            m47355 = i;
                        }
                        i8 = i2;
                    } else {
                        i = m47355;
                        int i13 = i8;
                        int i14 = i9;
                        while (i14 < i4 && i14 - i13 < 500 && c20736.m47358(i14) - m473552 <= 100000) {
                            i14++;
                        }
                        c9008.m23253(m473552, c20736.m47358(i14 - 1), i13, i14, i13 == i3, i14 == i4, true);
                        i8 = i14;
                    }
                    m47355 = i;
                }
            }
            i3 = i4;
        }
        c9008.m23252();
        return c9008.f27366;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if ((r16 - r2) > 100000) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m23253(int r15, int r16, int r17, int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r14 = this;
            r0 = r14
            r9 = r16
            r4 = r17
            r5 = r18
            r8 = r21
            r1 = 1
            if (r8 == 0) goto L10
            int r2 = r5 - r4
            r10 = r2
            goto L12
        L10:
            r2 = 1
            r10 = 1
        L12:
            java.util.ArrayList r2 = r0.f27367
            boolean r2 = r2.isEmpty()
            r11 = 100000(0x186a0, float:1.4013E-40)
            if (r2 != 0) goto L38
            int r2 = r0.f27368
            int r2 = r2 + r10
            r3 = 500(0x1f4, float:7.0E-43)
            if (r2 > r3) goto L35
            java.util.ArrayList r2 = r0.f27367
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            l.ۢܽܿ r2 = (l.C9714) r2
            int r2 = l.C9714.m24695(r2)
            int r2 = r9 - r2
            if (r2 <= r11) goto L38
        L35:
            r14.m23252()
        L38:
            java.util.ArrayList r2 = r0.f27367
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42
            r1 = 0
            goto L4a
        L42:
            java.util.ArrayList r2 = r0.f27367
            java.lang.Object r1 = l.C18566.m43105(r2, r1)
            l.ۢܽܿ r1 = (l.C9714) r1
        L4a:
            if (r1 == 0) goto L6c
            boolean r2 = l.C9714.m24692(r1)
            if (r2 != r8) goto L6c
            int r2 = l.C9714.m24693(r1)
            if (r2 != r4) goto L6c
            boolean r2 = l.C9714.m24694(r1)
            if (r2 == 0) goto L6c
            if (r19 == 0) goto L6c
            l.C9714.m24689(r1, r9)
            l.C9714.m24691(r1, r5)
            r7 = r20
            l.C9714.m24690(r1, r7)
            goto L86
        L6c:
            r7 = r20
            java.util.ArrayList r12 = r0.f27367
            l.ۢܽܿ r13 = new l.ۢܽܿ
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r13)
        L86:
            int r1 = r0.f27368
            int r1 = r1 + r10
            r0.f27368 = r1
            int r1 = r9 - r15
            if (r1 < r11) goto L92
            r14.m23252()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9008.m23253(int, int, int, int, boolean, boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23252() {
        if (this.f27367.isEmpty()) {
            return;
        }
        this.f27366.add(new C21003(this.f27367, this.f27368));
        this.f27367 = new ArrayList();
        this.f27368 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23250(CharSequence charSequence, int i, int i2, BooleanSupplier booleanSupplier) {
        if (i2 - i <= 100000) {
            return i2;
        }
        int i3 = 100000 + i;
        int i4 = i3;
        while (i4 > i && charSequence.charAt(i4) > 127) {
            if ((i4 & 1023) == 0) {
                m23254(booleanSupplier);
            }
            i4--;
        }
        while (true) {
            if (i4 >= i3) {
                break;
            }
            m23254(booleanSupplier);
            int m50336 = C22412.m50336(i4, i2, charSequence);
            while (m50336 < i2) {
                int codePointAt = Character.codePointAt(charSequence, m50336);
                int type = Character.getType(codePointAt);
                if (type != 6 && type != 8 && type != 7) {
                    break;
                }
                m23254(booleanSupplier);
                m50336 += Character.charCount(codePointAt);
            }
            if (m50336 <= i3) {
                i4 = m50336;
            } else if (i4 == i) {
                return m50336;
            }
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23254(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Wrap planning canceled");
        }
    }
}
