package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* compiled from: B6QO */
/* renamed from: l.ۨܶᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11789 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6144 f35177;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f35178;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0149 f35179;

    public C11789(C0149 c0149, C6144 c6144, int i) {
        this.f35179 = c0149;
        this.f35177 = c6144;
        this.f35178 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11789 m28842(C23721 c23721, InterfaceC20900 interfaceC20900, C1143 c1143, int i, InterfaceC17066 interfaceC17066) {
        C6144 c6144;
        C6144 c61442;
        int i2;
        C6144 c61443;
        int i3;
        C12494 m28843 = m28843(interfaceC20900, c1143, i, interfaceC17066);
        try {
            try {
                c61442 = m28843.f37533;
                i2 = m28843.f37532;
                C0149 m1233 = C0149.m1233(c23721, c61442, C14776.m35151(i2));
                try {
                    m28844(interfaceC17066);
                    c61443 = m28843.f37533;
                    i3 = m28843.f37532;
                    return new C11789(m1233, c61443, i3);
                } catch (Error e) {
                    e = e;
                    m1233.m1247();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m1233.m1247();
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    c6144 = m28843.f37533;
                    c6144.close();
                } catch (IOException e4) {
                    e.addSuppressed(e4);
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            c6144 = m28843.f37533;
            c6144.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c6144 = m28843.f37533;
            c6144.close();
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13199 m28845(InterfaceC20900 interfaceC20900, C1143 c1143, int i, InterfaceC17066 interfaceC17066) {
        C6144 c6144;
        C6144 c61442;
        int i2;
        int i3;
        C12494 m28843 = m28843(interfaceC20900, c1143, i, interfaceC17066);
        try {
            c61442 = m28843.f37533;
            InputStream mo14081 = c61442.mo14081();
            i2 = m28843.f37532;
            C7953 c7953 = new C7953(mo14081, C14776.m35151(i2), c1143);
            i3 = m28843.f37532;
            return new C13199(c7953, i3);
        } catch (IOException | Error | RuntimeException e) {
            try {
                c6144 = m28843.f37533;
                c6144.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۚ۬ᩳ] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12494 m28843(l.InterfaceC20900 r8, l.C1143 r9, int r10, l.InterfaceC17066 r11) {
        /*
            boolean r0 = r11 instanceof l.C2037
            if (r0 != 0) goto L5
            goto Lb
        L5:
            l.᩺ᩴᩳ r0 = new l.᩺ᩴᩳ
            r0.<init>(r8, r11)
            r8 = r0
        Lb:
            m28844(r11)
            l.ۜ۬ᩳ r0 = r8.identity()
            r1 = 33024(0x8100, double:1.6316E-319)
            l.ۚ۬ᩳ r9 = r9.m3921(r1)
            r1 = 0
            r2 = 32768(0x8000, float:4.5918E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L88 java.lang.Error -> L8a java.lang.RuntimeException -> L8c java.io.IOException -> L8e
            m28844(r11)     // Catch: java.lang.Throwable -> L88 java.lang.Error -> L8a java.lang.RuntimeException -> L8c java.io.IOException -> L8e
            java.io.InputStream r8 = r8.mo14081()     // Catch: java.lang.Throwable -> L88 java.lang.Error -> L8a java.lang.RuntimeException -> L8c java.io.IOException -> L8e
            r4 = 0
        L27:
            r5 = -1
            if (r4 >= r2) goto L4a
            m28844(r11)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            r6 = 1024(0x400, float:1.435E-42)
            int r7 = r2 - r4
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            int r7 = r8.read(r3, r4, r6)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            if (r7 != r5) goto L3c
            goto L4a
        L3c:
            if (r7 <= 0) goto L42
            if (r7 > r6) goto L42
            int r4 = r4 + r7
            goto L27
        L42:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            java.lang.String r11 = "Text input made invalid progress"
            r10.<init>(r11)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            throw r10     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
        L4a:
            m28844(r11)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            if (r4 != 0) goto L52
            int r10 = l.C14776.f45134     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            goto L67
        L52:
            if (r10 == r5) goto L55
            goto L67
        L55:
            java.lang.String r10 = l.C16398.m38652(r4, r3)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            if (r10 != 0) goto L5d
            r10 = -1
            goto L61
        L5d:
            int r10 = l.C14776.m35149(r10)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
        L61:
            if (r10 != r5) goto L67
            int r10 = l.C14776.m35152(r4, r3)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
        L67:
            l.ۛܶᩳ r11 = new l.ۛܶᩳ     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            l.ۤܶᩳ r2 = new l.ۤܶᩳ     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            r2.<init>(r8, r3, r4, r9)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            r11.<init>(r0, r2)     // Catch: java.lang.Error -> L80 java.lang.RuntimeException -> L82 java.io.IOException -> L84 java.lang.Throwable -> L88
            l.۫ܶᩳ r8 = new l.۫ܶᩳ     // Catch: java.lang.Throwable -> L77 java.lang.Error -> L79 java.lang.RuntimeException -> L7b java.io.IOException -> L7d
            r8.<init>(r11, r10)     // Catch: java.lang.Throwable -> L77 java.lang.Error -> L79 java.lang.RuntimeException -> L7b java.io.IOException -> L7d
            return r8
        L77:
            r8 = move-exception
            goto L9b
        L79:
            r8 = move-exception
            goto L7e
        L7b:
            r8 = move-exception
            goto L7e
        L7d:
            r8 = move-exception
        L7e:
            r9 = r1
            goto L8f
        L80:
            r10 = move-exception
            goto L85
        L82:
            r10 = move-exception
            goto L85
        L84:
            r10 = move-exception
        L85:
            r1 = r8
            r8 = r10
            goto L8f
        L88:
            r8 = move-exception
            goto L9a
        L8a:
            r8 = move-exception
            goto L8f
        L8c:
            r8 = move-exception
            goto L8f
        L8e:
            r8 = move-exception
        L8f:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L95
            goto L99
        L95:
            r10 = move-exception
            r8.addSuppressed(r10)     // Catch: java.lang.Throwable -> L88
        L99:
            throw r8     // Catch: java.lang.Throwable -> L88
        L9a:
            r1 = r9
        L9b:
            if (r1 == 0) goto La0
            r1.close()
        La0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11789.m28843(l.᩷۬ᩳ, l.֨۬ᩳ, int, l.ܿۖ᩷):l.۫ܶᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11789 m28841(C23721 c23721, InterfaceC20900 interfaceC20900, int i) {
        return new C11789(C0149.m1232(c23721, interfaceC20900), null, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28844(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Text loading is canceled");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23077 m28848() {
        return new C23077(0, this.f35178, false, 0, null, null, null);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5131 m28847() {
        return this.f35179.m1245();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m28846() {
        return this.f35179.m1248();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18495 m28849() {
        C0149 c0149 = this.f35179;
        return c0149.m1245().m14693() == 0 ? c0149.m1249() : c0149.m1242(65536);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35179.m1247();
        C6144 c6144 = this.f35177;
        if (c6144 != null) {
            c6144.close();
        }
    }
}
