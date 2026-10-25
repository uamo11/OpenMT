package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* compiled from: 96RH */
/* renamed from: l.ۛ֫ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5753 extends C0273 {

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f17707 = new ConcurrentMapC10942();

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f17708;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f17709;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f17710;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f17711;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f17712;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C0813 f17713;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f17714;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C22477 f17715;

    @Override // l.C0273, l.InterfaceC7785
    /* renamed from: ᩸֫ */
    public final boolean mo1607() {
        return true;
    }

    public C5753(C23721 c23721, AbstractC15440 abstractC15440, InterfaceC20758 interfaceC20758, C22477 c22477) {
        super(c23721);
        this.f17708 = new FutureC3575();
        this.f17714 = InterfaceC7765.f24007;
        this.f17715 = c22477;
        this.f17711 = c23721;
        this.f17710 = abstractC15440;
        this.f17709 = interfaceC20758;
        if (c23721.m52370() == 0) {
            c23721.m52363(16777216L);
        }
        this.f17713 = new C0813(this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m16201(AbstractC15440 abstractC15440) {
        return C6646.of(abstractC15440.mo23554() + ".editable2", new String[0]).toAbsolutePath().normalize();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16204(AbstractC15440 abstractC15440) {
        return this.f17709.equals(m16201(abstractC15440));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5753 m16202(l.AbstractC15440 r7) {
        /*
            l.᩷۠ᩴ r0 = m16201(r7)
            l.ۧۤᩴ r1 = l.C5753.f17707
            java.lang.Object r2 = r1.get(r0)
            l.ۛ֫ܿ r2 = (l.C5753) r2
            if (r2 == 0) goto L20
            boolean r3 = r2.f17712
            if (r3 == 0) goto L18
            l.ۗ᩻᩵ r2 = r2.f17708
            m16198(r2)
            goto L20
        L18:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Text storage is already in use"
            r7.<init>(r0)
            throw r7
        L20:
            l.᩹ᩴᩳ r2 = l.C22477.m50424(r0)
            r3 = 0
            l.ۗ᩻᩵ r4 = r2.m50427()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            m16198(r4)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.᩷۠ᩴ r4 = r0.getParent()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            r5 = 0
            l.᩹۠ᩴ[] r6 = new l.InterfaceC22168[r5]     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.C17229.createDirectories(r4, r6)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.ܳ۠ᩴ[] r4 = new l.EnumC14406[r5]     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            boolean r4 = l.C17229.exists(r0, r4)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            if (r4 == 0) goto L5c
            l.֨۬ᩳ r4 = l.C6417.m17744()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.ۙ۬ᩳ r5 = l.C6417.m17746()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.ܿ۬ᩳ r4 = l.C23721.m52316(r0, r4, r5)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.᩻۬ᩳ r5 = r4.m40712()     // Catch: java.lang.Throwable -> L52
            r4.close()     // Catch: java.lang.Error -> L71 java.lang.RuntimeException -> L73 java.io.IOException -> L75
            goto L68
        L52:
            r7 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
        L5b:
            throw r7     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
        L5c:
            l.֨۬ᩳ r4 = l.C6417.m17744()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.ۙ۬ᩳ r5 = l.C6417.m17746()     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
            l.᩻۬ᩳ r5 = l.C23721.m52300(r0, r4, r5)     // Catch: java.lang.Error -> L77 java.lang.RuntimeException -> L79 java.io.IOException -> L7b
        L68:
            l.ۛ֫ܿ r4 = new l.ۛ֫ܿ     // Catch: java.lang.Error -> L71 java.lang.RuntimeException -> L73 java.io.IOException -> L75
            r4.<init>(r5, r7, r0, r2)     // Catch: java.lang.Error -> L71 java.lang.RuntimeException -> L73 java.io.IOException -> L75
            r1.put(r0, r4)     // Catch: java.lang.Error -> L71 java.lang.RuntimeException -> L73 java.io.IOException -> L75
            return r4
        L71:
            r7 = move-exception
            goto L7d
        L73:
            r7 = move-exception
            goto L7d
        L75:
            r7 = move-exception
            goto L7d
        L77:
            r7 = move-exception
            goto L7c
        L79:
            r7 = move-exception
            goto L7c
        L7b:
            r7 = move-exception
        L7c:
            r5 = r3
        L7d:
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L85
            goto L8e
        L83:
            r7 = move-exception
            goto L8a
        L85:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L83
            goto L8e
        L8a:
            r2.m50428(r3)
            throw r7
        L8e:
            r2.m50428(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5753.m16202(l.ܶ᩵ܿ):l.ۛ֫ܿ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5753 m16197(C12951 c12951, InterfaceC7765 interfaceC7765) {
        if (c12951.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        if (interfaceC7765 == null) {
            interfaceC7765 = InterfaceC7765.f24007;
        }
        try {
            AbstractC15440 mo6269 = interfaceC7765.mo6269(c12951.m31504());
            if (!C17229.isDirectory(m16201(mo6269), new EnumC14406[0])) {
                throw new IOException("Text storage is missing");
            }
            C5753 m16202 = m16202(mo6269);
            m16202.f17714 = interfaceC7765;
            return m16202;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m16196(C12951 c12951, AbstractC15440 abstractC15440) {
        if (c12951.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        String m31504 = c12951.m31504();
        if (abstractC15440 == null) {
            abstractC15440 = InterfaceC7765.f24007.mo6269(m31504);
        }
        InterfaceC20758 m16201 = m16201(abstractC15440);
        C5753 c5753 = (C5753) f17707.get(m16201);
        if (c5753 != null && !c5753.f17712) {
            C12704 m26565 = c5753.m26565();
            try {
                String c13409 = m26565.toString();
                m26565.close();
                return c13409;
            } catch (Throwable th) {
                try {
                    m26565.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C22477 m50424 = C22477.m50424(m16201);
        try {
            try {
                m16198(m50424.m50427());
                C17371 m52316 = C23721.m52316(m16201, C6417.m17744(), C6417.m17746());
                try {
                    C12704 m40714 = m52316.m40714();
                    try {
                        String c134092 = m40714.toString();
                        m40714.close();
                        m52316.close();
                        return c134092;
                    } finally {
                    }
                } catch (Throwable th3) {
                    try {
                        m52316.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } finally {
                m50424.m50428((Throwable) null);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* renamed from: ֫ */
    public final void mo1593(InterfaceC7765 interfaceC7765) {
        if (interfaceC7765 == null) {
            interfaceC7765 = InterfaceC7765.f24007;
        }
        this.f17714 = interfaceC7765;
    }

    @Override // l.C0273, l.InterfaceC7785
    /* renamed from: ֫ */
    public final void mo1594(C10130 c10130) {
        m16203();
        c10130.writeInt(-500018348);
        c10130.m25423((CharSequence) this.f17714.mo6268(this.f17710));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m16203() {
        try {
            C23721 c23721 = this.f17711;
            m16198(c23721.m52354(c23721.m52371()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* renamed from: ܺۧ */
    public final void mo1602() {
        this.f17711.m52358();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m16205() {
        this.f17712 = true;
        this.f17713.close();
    }

    @Override // l.C0273, l.C10567, java.lang.AutoCloseable
    public final void close() {
        m16205();
        super.close();
    }

    @Override // l.C0273
    /* renamed from: ۘ */
    public final void mo1598() {
        super.mo1598();
        this.f17711.m52366().m10910(new InterfaceC8017() { // from class: l.۬֫ܿ
            @Override // l.InterfaceC8017
            /* renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C5753.m16199(C5753.this, th);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16199(C5753 c5753, Throwable th) {
        FutureC3575 futureC3575 = c5753.f17708;
        f17707.remove(c5753.f17709, c5753);
        c5753.f17715.m50428(th);
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    @Override // l.C10567, l.InterfaceC7785
    /* renamed from: ֫ */
    public final void mo13046(boolean z) {
        close();
        if (z) {
            try {
                m16198(this.f17708);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* renamed from: ᩹֫ */
    public final void mo1608() {
        close();
        m16198(this.f17708);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m16200(AbstractC15440 abstractC15440) {
        InterfaceC20758 m16201 = m16201(abstractC15440);
        final C22477 m50424 = C22477.m50424(m16201);
        return m50424.m50427().m10920(new RunnableC12103(0, m16201, abstractC15440), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ۤ֫ܿ
            @Override // l.InterfaceC8017
            /* renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C22477.this.m50428(th);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16198(FutureC3575 futureC3575) {
        try {
            futureC3575.m10930();
        } catch (C13452 e) {
            throw new IOException("Text storage persistence failed", e.getCause());
        }
    }
}
