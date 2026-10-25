package l;

import android.net.Uri;

/* compiled from: K74T */
/* renamed from: l.ᩳ۠ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17925 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16513 f54748;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f54749;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Uri f54750;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f54751;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23713 f54752;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16431 f54753;

    public C17925(Uri uri, C16431 c16431, InterfaceC15097 interfaceC15097, C16513 c16513, C23713 c23713, boolean z) {
        this.f54750 = uri;
        this.f54753 = c16431;
        this.f54749 = interfaceC15097;
        this.f54748 = c16513;
        this.f54752 = c23713;
        this.f54751 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17925 m41935(l.InterfaceC17889 r18, l.AbstractC13921 r19) {
        /*
            r0 = r19
            boolean r7 = r0 instanceof l.AbstractC3163
            if (r7 != 0) goto L13
            boolean r1 = r0 instanceof l.C2499
            if (r1 == 0) goto Lb
            goto L13
        Lb:
            l.᩷۠ۜ r0 = new l.᩷۠ۜ
            java.lang.String r1 = "HLS thumbnails require a local or network visitor"
            r0.<init>(r1)
            throw r0
        L13:
            r8 = 0
            if (r7 == 0) goto L20
            android.app.Application r1 = l.C4925.m14335()
            l.᩻۬ۜ r1 = l.C20892.m47730(r1)
            r15 = r1
            goto L21
        L20:
            r15 = r8
        L21:
            l.ᩳۚۜ r9 = new l.ᩳۚۜ     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r3 = 0
            r2[r3] = r18     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r4.<init>(r1)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r1 = r2[r3]     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            l.C11003.requireNonNull(r1)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r4.add(r1)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            java.util.List r1 = l.C20195.unmodifiableList(r4)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r9.<init>(r3, r1)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            l.ܽۚۜ r14 = new l.ܽۚۜ     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            l.ۧۚۜ r5 = l.EnumC10788.HLS_DIRECT     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            r2 = 0
            r1 = r14
            r3 = r19
            r4 = r9
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Error -> La2 java.lang.RuntimeException -> La4
            l.ۧ᩵֫ r1 = r9.mo16333()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            l.ۨᩴ֫ r1 = r1.f33612     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            android.net.Uri r1 = r1.f35426     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            if (r15 != 0) goto L5d
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            goto L61
        L5d:
            java.lang.String r2 = r15.m52286()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
        L61:
            if (r7 == 0) goto L87
            l.ۛ᩸ۜ r12 = new l.ۛ᩸ۜ     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            r12.<init>(r14, r15)     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            l.ۨۚۜ r13 = l.C20892.m47732()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            l.᩻֨ۜ r3 = new l.᩻֨ۜ     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            l.ܽ֨ۜ r4 = l.EnumC16306.f50166     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            l.ۢ᩻ۜ r5 = new l.ۢ᩻ۜ     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            r5.<init>()     // Catch: java.lang.Error -> L9b java.lang.RuntimeException -> La0
            r16 = 0
            r9 = r3
            r10 = r15
            r11 = r14
            r8 = r14
            r14 = r4
            r17 = r15
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Error -> L83 java.lang.RuntimeException -> L85
            goto L8b
        L83:
            r0 = move-exception
            goto La6
        L85:
            r0 = move-exception
            goto La6
        L87:
            r8 = r14
            r17 = r15
            r3 = r8
        L8b:
            l.ܽ۠ۜ r4 = new l.ܽ۠ۜ     // Catch: java.lang.Error -> L83 java.lang.RuntimeException -> L85
            r4.<init>(r8, r0, r2)     // Catch: java.lang.Error -> L83 java.lang.RuntimeException -> L85
            l.ᩳ۠ۜ r9 = new l.ᩳ۠ۜ     // Catch: java.lang.Error -> L83 java.lang.RuntimeException -> L85
            r0 = r9
            r2 = r8
            r5 = r17
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Error -> L83 java.lang.RuntimeException -> L85
            return r9
        L9b:
            r0 = move-exception
        L9c:
            r8 = r14
        L9d:
            r17 = r15
            goto La6
        La0:
            r0 = move-exception
            goto L9c
        La2:
            r0 = move-exception
            goto L9d
        La4:
            r0 = move-exception
            goto L9d
        La6:
            if (r8 == 0) goto Lae
            r8.m38742()
            r8.m38740()
        Lae:
            if (r17 == 0) goto Lb3
            r17.close()
        Lb3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17925.m41935(l.ᩳۜܳ, l.ܰܺܳ):l.ᩳ۠ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 m41936() {
        C23713 c23713;
        boolean z = this.f54751;
        C16431 c16431 = this.f54753;
        return (!z || (c23713 = this.f54752) == null || c23713.m52288() == null) ? c16431 : new C9315(c23713, new C14601(c16431), c16431, new C19462());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23713 c23713 = this.f54752;
        try {
            C16431 c16431 = this.f54753;
            c16431.m38742();
            c16431.m38740();
        } finally {
            if (c23713 != null) {
                c23713.close();
            }
        }
    }
}
