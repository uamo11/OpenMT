package l;

import java.util.ArrayList;

/* compiled from: H6NE */
/* renamed from: l.ۛ᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6374 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f19715;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19716;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f19717;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13409 f19718;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f19719;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f19720;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f19721;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19722;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0017, B:10:0x001d, B:15:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x0044, B:23:0x004d, B:25:0x005d, B:26:0x0054, B:29:0x0064, B:30:0x0068, B:32:0x006e, B:36:0x008a, B:37:0x0083, B:40:0x00c3, B:46:0x0090, B:48:0x0099, B:50:0x009f, B:52:0x00a4, B:53:0x00a7, B:56:0x00ba, B:59:0x00bf, B:65:0x00b3), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0017, B:10:0x001d, B:15:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x0044, B:23:0x004d, B:25:0x005d, B:26:0x0054, B:29:0x0064, B:30:0x0068, B:32:0x006e, B:36:0x008a, B:37:0x0083, B:40:0x00c3, B:46:0x0090, B:48:0x0099, B:50:0x009f, B:52:0x00a4, B:53:0x00a7, B:56:0x00ba, B:59:0x00bf, B:65:0x00b3), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0017, B:10:0x001d, B:15:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x0044, B:23:0x004d, B:25:0x005d, B:26:0x0054, B:29:0x0064, B:30:0x0068, B:32:0x006e, B:36:0x008a, B:37:0x0083, B:40:0x00c3, B:46:0x0090, B:48:0x0099, B:50:0x009f, B:52:0x00a4, B:53:0x00a7, B:56:0x00ba, B:59:0x00bf, B:65:0x00b3), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0034  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C6374 m17676(l.C7744 r5, l.C12164 r6, java.lang.String r7, boolean r8, int r9, boolean r10, java.lang.Runnable r11, java.util.function.Supplier r12) {
        /*
            l.ۛ᩺ᩳ r0 = new l.ۛ᩺ᩳ
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f19717 = r1
            l.۬᩺ᩳ r1 = new l.۬᩺ᩳ     // Catch: l.C14501 -> Ld6 java.lang.Error -> Ld8 java.lang.RuntimeException -> Lda
            r1.<init>(r0, r5, r11, r12)     // Catch: l.C14501 -> Ld6 java.lang.Error -> Ld8 java.lang.RuntimeException -> Lda
            r12 = 1
            r2 = 0
            if (r8 == 0) goto L2a
            r8 = 36
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L27
            if (r8 >= 0) goto L25
            r8 = 92
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L27
            if (r8 < 0) goto L2a
        L25:
            r8 = 1
            goto L2b
        L27:
            r5 = move-exception
            goto Lcd
        L2a:
            r8 = 0
        L2b:
            r3 = 0
            if (r8 == 0) goto L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L27
            goto L35
        L34:
            r4 = r3
        L35:
            if (r10 == 0) goto L8e
            if (r9 <= 0) goto L8e
            java.util.ArrayDeque r10 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L27
            r10.<init>()     // Catch: java.lang.Throwable -> L27
        L3e:
            boolean r12 = l.C12268.m29803(r6)     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L64
            r11.run()     // Catch: java.lang.Throwable -> L27
            int r12 = r10.size()     // Catch: java.lang.Throwable -> L27
            if (r12 != r9) goto L54
            java.lang.Object r12 = r10.removeFirst()     // Catch: java.lang.Throwable -> L27
            l.۫᩺ᩳ r12 = (l.C12724) r12     // Catch: java.lang.Throwable -> L27
            goto L5d
        L54:
            l.۫᩺ᩳ r12 = new l.۫᩺ᩳ     // Catch: java.lang.Throwable -> L27
            l.ۨۘܽ r3 = r6.pattern()     // Catch: java.lang.Throwable -> L27
            r12.<init>(r5, r3, r11)     // Catch: java.lang.Throwable -> L27
        L5d:
            r12.m31013(r6, r8)     // Catch: java.lang.Throwable -> L27
            r10.addLast(r12)     // Catch: java.lang.Throwable -> L27
            goto L3e
        L64:
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> L27
        L68:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto Lc3
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L27
            l.۫᩺ᩳ r6 = (l.C12724) r6     // Catch: java.lang.Throwable -> L27
            r11.run()     // Catch: java.lang.Throwable -> L27
            int r8 = r6.start(r2)     // Catch: java.lang.Throwable -> L27
            int r9 = r6.end(r2)     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L83
            r6 = r7
            goto L8a
        L83:
            r4.setLength(r2)     // Catch: java.lang.Throwable -> L27
            l.C13574.m32630(r6, r4, r7)     // Catch: java.lang.Throwable -> L27
            r6 = r4
        L8a:
            r1.m32457(r8, r9, r6)     // Catch: java.lang.Throwable -> L27
            goto L68
        L8e:
            if (r8 == 0) goto L99
            l.۫᩺ᩳ r3 = new l.۫᩺ᩳ     // Catch: java.lang.Throwable -> L27
            l.ۨۘܽ r8 = r6.pattern()     // Catch: java.lang.Throwable -> L27
            r3.<init>(r5, r8, r11)     // Catch: java.lang.Throwable -> L27
        L99:
            boolean r5 = l.C12268.m29803(r6)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto Lc3
            r11.run()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto La7
            r3.m31013(r6, r12)     // Catch: java.lang.Throwable -> L27
        La7:
            int r5 = r6.start()     // Catch: java.lang.Throwable -> L27
            int r8 = r6.end()     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto Lb3
            r10 = r7
            goto Lba
        Lb3:
            r4.setLength(r2)     // Catch: java.lang.Throwable -> L27
            l.C13574.m32630(r3, r4, r7)     // Catch: java.lang.Throwable -> L27
            r10 = r4
        Lba:
            r1.m32457(r5, r8, r10)     // Catch: java.lang.Throwable -> L27
            if (r9 <= 0) goto L99
            int r5 = r0.f19722     // Catch: java.lang.Throwable -> L27
            if (r5 != r9) goto L99
        Lc3:
            r1.finish()     // Catch: java.lang.Throwable -> L27
            r11.run()     // Catch: java.lang.Throwable -> L27
            r1.close()     // Catch: l.C14501 -> Ld6 java.lang.Error -> Ld8 java.lang.RuntimeException -> Lda
            return r0
        Lcd:
            r1.close()     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld1:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: l.C14501 -> Ld6 java.lang.Error -> Ld8 java.lang.RuntimeException -> Lda
        Ld5:
            throw r5     // Catch: l.C14501 -> Ld6 java.lang.Error -> Ld8 java.lang.RuntimeException -> Lda
        Ld6:
            r5 = move-exception
            goto Ldb
        Ld8:
            r5 = move-exception
            goto Ldb
        Lda:
            r5 = move-exception
        Ldb:
            r0.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6374.m17676(l.۟᩸ᩳ, l.۫ۘܽ, java.lang.String, boolean, int, boolean, java.lang.Runnable, java.util.function.Supplier):l.ۛ᩺ᩳ");
    }

    public final int count() {
        return this.f19722;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17689(final C12392 c12392, final InterfaceC7785 interfaceC7785, final boolean z) {
        if (this.f19721) {
            throw new IllegalStateException("Replacement plan is consumed");
        }
        this.f19721 = true;
        if (this.f19722 == 0) {
            return;
        }
        if (c12392.m30436() != interfaceC7785) {
            throw new IllegalStateException("Replacement owner changed");
        }
        boolean[] zArr = {false};
        final RunnableC11381 runnableC11381 = new RunnableC11381(1, zArr, c12392);
        try {
            if (!interfaceC7785.mo1596(new Runnable() { // from class: l.ۙ᩺ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C6374.m17680(C6374.this, interfaceC7785, runnableC11381, c12392, z);
                }
            })) {
                throw new IllegalStateException("Replacement owner is unavailable");
            }
            c12392.requestFocus();
            c12392.m30430(false);
        } finally {
            if (zArr[0] && c12392.m30436() == interfaceC7785 && c12392.f37211) {
                c12392.m30397();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17680(C6374 c6374, InterfaceC7785 interfaceC7785, RunnableC11381 runnableC11381, C12392 c12392, boolean z) {
        int i;
        C21856 c3552 = c6374.f19719 ? null : new C3552(interfaceC7785, runnableC11381);
        int i2 = -1;
        for (int size = c6374.f19717.size() - 1; size >= 0; size--) {
            if (c12392.m30436() != interfaceC7785) {
                throw new IllegalStateException("Replacement owner changed");
            }
            C10608 c10608 = (C10608) c6374.f19717.get(size);
            if (c3552 != null) {
                if (i2 >= 0 && i2 - c10608.f31865 > 256) {
                    c3552.m49244();
                }
                int i3 = c10608.f31869;
                int i4 = c10608.f31865;
                String str = c10608.f31868;
                int length = str.length();
                c3552.delete(i3, i4);
                c3552.m49243(i3, 0, length, str);
            } else {
                runnableC11381.run();
                C13409 c13409 = c6374.f19718;
                if (c13409 == null) {
                    interfaceC7785.replace(c10608.f31869, c10608.f31865, c10608.f31868);
                } else {
                    int i5 = c10608.f31869;
                    int i6 = c10608.f31865;
                    int i7 = c10608.f31867;
                    interfaceC7785.replace(i5, i6, c13409, i7, c10608.f31866 + i7);
                }
            }
            i2 = c10608.f31869;
        }
        if (c3552 != null) {
            c3552.m49244();
        }
        if (c12392.m30436() != interfaceC7785) {
            throw new IllegalStateException("Replacement owner changed");
        }
        if (z) {
            i = c6374.f19716;
        } else {
            long j = c6374.f19715 + c6374.f19720;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        c12392.mo25919(i);
        c12392.m30501(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19721 = true;
        this.f19717.clear();
        C13409 c13409 = this.f19718;
        if (c13409 != null) {
            c13409.close();
            this.f19718 = null;
        }
    }
}
