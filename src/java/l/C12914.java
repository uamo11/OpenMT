package l;

import com.umeng.analytics.pro.o;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* compiled from: 69ZM */
/* renamed from: l.۬ۚ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C12914 extends URLConnection implements InterfaceC10196 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f38750 = C11321.m27961(C12914.class);

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38751 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38752;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38753;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2207 f38754;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f38755;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3618 f38756;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f38757;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f38758;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17729 f38759;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f38760;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38761;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f38756 != null) {
            this.f38756 = null;
            this.f38755.mo27540().getClass();
        }
    }

    /* renamed from: ֫ */
    public void mo28326(C6523 c6523, C20635 c20635) {
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m31375() {
        C3618 c3618 = this.f38756;
        if (c3618 != null && c3618.m11095()) {
            C3618 c36182 = this.f38756;
            c36182.m11088();
            return c36182;
        }
        if (this.f38756 != null) {
            this.f38755.mo27540().getClass();
        }
        C3618 m7335 = this.f38754.m7335(this.f38759);
        this.f38756 = m7335;
        m7335.m11097();
        this.f38755.mo27540().getClass();
        return this.f38756;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12914(l.C12914 r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = m31360(r5)
            if (r0 == 0) goto L1c
            java.net.URL r0 = new java.net.URL
            m31359(r6)
            java.lang.String r1 = "smb://"
            java.lang.String r1 = r1.concat(r6)
            l.ᩴۡ᩵ r2 = r5.f38755
            l.ۜۚ᩵ r2 = r2.mo27537()
            r3 = 0
            r0.<init>(r3, r1, r2)
            goto L30
        L1c:
            java.net.URL r0 = new java.net.URL
            l.ᩳ֨᩵ r1 = r5.f38759
            java.net.URL r1 = r1.m41522()
            m31359(r6)
            l.ᩴۡ᩵ r2 = r5.f38755
            l.ۜۚ᩵ r2 = r2.mo27537()
            r0.<init>(r1, r6, r2)
        L30:
            l.ᩴۡ᩵ r1 = r5.f38755
            r4.<init>(r0, r1)
            r4.m31358(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12914.<init>(l.۬ۚ᩵, java.lang.String):void");
    }

    public C12914(String str, InterfaceC18663 interfaceC18663) {
        this(new URL((URL) null, str, interfaceC18663.mo27537()), interfaceC18663);
    }

    public C12914(URL url, InterfaceC18663 interfaceC18663) {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: " + url);
        }
        this.f38755 = interfaceC18663;
        this.f38759 = new C17729(url, interfaceC18663);
        int i = C2207.f7246;
        interfaceC18663.mo27540().getClass();
        this.f38754 = new C2207(interfaceC18663);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12914(l.InterfaceC10196 r7, java.lang.String r8, boolean r9, int r10, int r11, long r12, long r14) {
        /*
            r6 = this;
            boolean r0 = m31360(r7)
            java.lang.String r1 = ""
            java.lang.String r2 = "/"
            if (r0 == 0) goto L27
            java.net.URL r0 = new java.net.URL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "smb://"
            r3.<init>(r4)
            m31359(r8)
            java.lang.String r3 = l.C9045.m23341(r3, r8, r2)
            l.ᩴۡ᩵ r4 = r7.getContext()
            l.ۜۚ᩵ r4 = r4.mo27537()
            r5 = 0
            r0.<init>(r5, r3, r4)
            goto L44
        L27:
            java.net.URL r0 = new java.net.URL
            l.ۛۡ᩵ r3 = r7.mo25594()
            l.ᩳ֨᩵ r3 = (l.C17729) r3
            java.net.URL r3 = r3.m41522()
            m31359(r8)
            r4 = r11 & 16
            if (r4 <= 0) goto L3c
            r4 = r2
            goto L3d
        L3c:
            r4 = r1
        L3d:
            java.lang.String r4 = r8.concat(r4)
            r0.<init>(r3, r4)
        L44:
            l.ᩴۡ᩵ r3 = r7.getContext()
            r6.<init>(r0, r3)
            boolean r0 = m31360(r7)
            if (r0 != 0) goto L64
            java.lang.StringBuilder r8 = l.C5368.m15339(r8)
            r0 = r11 & 16
            if (r0 <= 0) goto L5a
            r1 = r2
        L5a:
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r6.m31358(r7, r8)
        L64:
            l.ᩳ֨᩵ r7 = r6.f38759
            r7.m41516(r10)
            r6.f38761 = r11
            r6.f38752 = r12
            r6.f38758 = r14
            r7 = 1
            r6.f38753 = r7
            if (r9 == 0) goto L89
            long r7 = java.lang.System.currentTimeMillis()
            l.ᩴۡ᩵ r9 = r6.f38755
            l.֨ۡ᩵ r9 = r9.mo27540()
            l.ܰۡ᩵ r9 = (l.C13722) r9
            long r9 = r9.m32974()
            long r9 = r9 + r7
            r6.f38757 = r9
            r6.f38760 = r9
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12914.<init>(l.ۤۡ᩵, java.lang.String, boolean, int, int, long, long):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31360(InterfaceC10196 interfaceC10196) {
        try {
            return ((C17729) interfaceC10196.mo25594()).m41519();
        } catch (C19369 e) {
            f38750.mo7081("Failed to check for workgroup", (Exception) e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        C3618 m31375 = m31375();
        if (m31375 != null) {
            m31375.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31358(InterfaceC10196 interfaceC10196, String str) {
        this.f38759.m41517(interfaceC10196.mo25594(), str);
        if (((C17729) interfaceC10196.mo25594()).m41523() != null && (interfaceC10196 instanceof C12914)) {
            this.f38754 = C2207.m7324(((C12914) interfaceC10196).f38754);
            return;
        }
        InterfaceC18663 context = interfaceC10196.getContext();
        int i = C2207.f7246;
        context.mo27540().getClass();
        this.f38754 = new C2207(context);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31359(String str) {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31370() {
        this.f38754.getClass();
    }

    @Override // l.InterfaceC10196
    public final InterfaceC18663 getContext() {
        return this.f38755;
    }

    @Override // l.InterfaceC10196
    /* renamed from: ۚۧ */
    public final InterfaceC5962 mo25594() {
        return this.f38759;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:13:0x007a, B:15:0x01af, B:17:0x01be, B:19:0x01c4, B:20:0x01d4, B:26:0x0061, B:27:0x0065, B:29:0x006b, B:30:0x006f, B:32:0x0073, B:33:0x0077, B:34:0x00b1, B:37:0x00bf, B:38:0x0113, B:40:0x0150, B:42:0x015b, B:44:0x0163, B:45:0x017f, B:47:0x018c, B:50:0x0186), top: B:2:0x000a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:13:0x007a, B:15:0x01af, B:17:0x01be, B:19:0x01c4, B:20:0x01d4, B:26:0x0061, B:27:0x0065, B:29:0x006b, B:30:0x006f, B:32:0x0073, B:33:0x0077, B:34:0x00b1, B:37:0x00bf, B:38:0x0113, B:40:0x0150, B:42:0x015b, B:44:0x0163, B:45:0x017f, B:47:0x018c, B:50:0x0186), top: B:2:0x000a, inners: #1 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12209 m31363(java.lang.String r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12914.m31363(java.lang.String, int, int, int, int, int):l.۫ۚ᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12209 m31362(int i, int i2, int i3, int i4, int i5) {
        return m31363(this.f38759.m41529(), i, i2, i3, i4, i5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31368(C3618 c3618, String str, int i) {
        InterfaceC2148 interfaceC2148 = f38750;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("queryPath: " + str);
        }
        if (c3618.m11100()) {
            return;
        }
        if (c3618.m11089(16)) {
            C21774 c21774 = (C21774) c3618.m11087(new C15422(c3618.m11094(), str, i), new C21774(c3618.m11094(), i), new EnumC0214[0]);
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Path information " + c21774);
            }
            InterfaceC0131 interfaceC0131 = (InterfaceC0131) c21774.m49103();
            this.f38753 = true;
            if (interfaceC0131 instanceof C5071) {
                C5071 c5071 = (C5071) interfaceC0131;
                this.f38761 = c5071.getAttributes() & EnumC5983.f18409;
                this.f38752 = c5071.mo7549();
                this.f38760 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
                return;
            }
            if (interfaceC0131 instanceof C2955) {
                this.f38758 = ((C2955) interfaceC0131).getSize();
                this.f38757 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
                return;
            }
            return;
        }
        C18518 c18518 = (C18518) c3618.m11087(new C3701(str, c3618.m11094()), new C18518(c3618.m11094(), c3618.m11092()), new EnumC0214[0]);
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Legacy path information " + c18518);
        }
        this.f38753 = true;
        this.f38761 = c18518.getAttributes() & EnumC5983.f18409;
        this.f38752 = c18518.mo7549();
        this.f38760 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
        this.f38758 = c18518.getSize();
        this.f38757 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31373() {
        InterfaceC18663 interfaceC18663 = this.f38755;
        C17729 c17729 = this.f38759;
        long j = this.f38760;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC2148 interfaceC2148 = f38750;
        if (j > currentTimeMillis) {
            interfaceC2148.mo7101("Using cached attributes");
            return this.f38753;
        }
        this.f38761 = 17;
        this.f38752 = 0L;
        this.f38753 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (c17729.m41523() == null) {
                    if (c17729.m41520() == 2) {
                        C0068 c0068 = ((RunnableC9242) interfaceC18663.mo27539()).m23703(((URLConnection) this).url.getHost(), true)[0];
                    } else {
                        ((RunnableC9242) interfaceC18663.mo27539()).m23703(((URLConnection) this).url.getHost(), false)[0].mo1015();
                    }
                } else {
                    C3618 m31375 = m31375();
                    try {
                        if (c17729.m41520() == 8) {
                            C3618 m313752 = m31375();
                            if (m313752 != null) {
                                m313752.close();
                            }
                        } else {
                            m31368(m31375, c17729.m41529(), 4);
                        }
                        if (m31375 != null) {
                            m31375.close();
                        }
                    } catch (Throwable th) {
                        if (m31375 != null) {
                            try {
                                m31375.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f38753 = true;
        } catch (UnknownHostException e) {
            interfaceC2148.mo7081("Unknown host", (Exception) e);
        } catch (C3037 e2) {
            interfaceC2148.mo7097("exists:", e2);
            switch (e2.m9291()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e2;
            }
        } catch (C19369 e3) {
            throw C3037.m9289(e3);
        }
        this.f38760 = ((C13722) interfaceC18663.mo27540()).m32974() + System.currentTimeMillis();
        return this.f38753;
    }

    /* renamed from: ᩻ */
    public int mo28329() {
        C17729 c17729 = this.f38759;
        try {
            int m41520 = c17729.m41520();
            if (m41520 != 8) {
                return m41520;
            }
            C3618 m31375 = m31375();
            try {
                c17729.m41516(m31375.m11086());
                m31375.close();
                return m41520;
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    @Override // l.InterfaceC10196
    public final String getName() {
        return this.f38759.getName();
    }

    @Override // l.InterfaceC10196
    public final boolean isDirectory() {
        if (this.f38759.m41518()) {
            return true;
        }
        return m31373() && (this.f38761 & 16) == 16;
    }

    @Override // l.InterfaceC10196
    /* renamed from: ֨ */
    public final boolean mo25592() {
        C17729 c17729 = this.f38759;
        if (c17729.m41523() == null) {
            return false;
        }
        if (c17729.m41518()) {
            return c17729.m41523().endsWith("$");
        }
        m31373();
        return (this.f38761 & 2) == 2;
    }

    @Override // l.InterfaceC10196
    /* renamed from: ۚ */
    public final long mo25593() {
        if (this.f38759.m41518()) {
            return 0L;
        }
        m31373();
        return this.f38752;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5257 m31361() {
        return C4448.m13195(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31369(InterfaceC10196 interfaceC10196) {
        C17729 c17729 = this.f38759;
        if (!(interfaceC10196 instanceof C12914)) {
            throw new C3037("Invalid target resource");
        }
        C12914 c12914 = (C12914) interfaceC10196;
        C17729 c177292 = c12914.f38759;
        try {
            C3618 m31375 = m31375();
            try {
                InterfaceC18435 m313752 = c12914.m31375();
                try {
                    if (!m31373()) {
                        throw new C3037(-1073741772);
                    }
                    c12914.m31373();
                    if (c17729.m41518() || c177292.m41518()) {
                        throw new C3037("Invalid operation for workgroups, servers, or shares");
                    }
                    if (!m31375.m11090(m313752)) {
                        m31373();
                        c12914.m31373();
                        if (!C11003.equals(c17729.m41526(), c177292.m41526()) || !C11003.equals(c17729.m41523(), c177292.m41523())) {
                            throw new C3037("Cannot rename between different trees");
                        }
                    }
                    InterfaceC2148 interfaceC2148 = f38750;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("renameTo: " + c17729.m41529() + " -> " + c177292.m41529());
                    }
                    c12914.f38757 = 0L;
                    c12914.f38760 = 0L;
                    if (m31375.m11100()) {
                        C23911 c23911 = new C23911(m31375.m11094());
                        c23911.m52666(new C4366(c177292.m41529().substring(1)));
                        m31364(m31375, 65792, c23911, new AbstractC13306[0]);
                    } else {
                        m31375.m11087(new C5112(m31375.m11094(), c17729.m41529(), c177292.m41529()), new C7188(m31375.m11094()), new EnumC0214[0]);
                    }
                    this.f38757 = 0L;
                    this.f38760 = 0L;
                    if (m313752 != null) {
                        m313752.close();
                    }
                    m31375.close();
                } finally {
                }
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31374() {
        this.f38760 = 0L;
        this.f38757 = 0L;
    }

    @Override // l.InterfaceC10196
    public final void delete() {
        try {
            m31367(this.f38759.m41529());
            close();
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31367(String str) {
        InterfaceC2148 interfaceC2148 = f38750;
        if (this.f38759.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        C3618 m31375 = m31375();
        try {
            if (!m31373()) {
                throw new C3037(-1073741772);
            }
            if ((this.f38761 & 1) != 0) {
                m31371();
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("delete: " + str);
            }
            if ((this.f38761 & 16) != 0) {
                try {
                    InterfaceC5257 m13195 = C4448.m13195(this);
                    while (m13195.hasNext()) {
                        try {
                            InterfaceC10196 interfaceC10196 = (InterfaceC10196) m13195.next();
                            try {
                                try {
                                    interfaceC10196.delete();
                                    interfaceC10196.close();
                                } catch (C19369 e) {
                                    throw C3037.m9289(e);
                                }
                            } catch (Throwable th) {
                                if (interfaceC10196 != null) {
                                    try {
                                        interfaceC10196.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                m13195.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    m13195.close();
                } catch (C3037 e2) {
                    interfaceC2148.mo7081("delete", (Exception) e2);
                    if (e2.m9291() != -1073741809) {
                        throw e2;
                    }
                }
                if (m31375.m11100()) {
                    C2039 c2039 = new C2039(str, m31375.m11094());
                    c2039.m6633(65536);
                    c2039.m6632(o.a.a);
                    c2039.m6636(1);
                    c2039.mo10438(new C14011(str, m31375.m11094()));
                    m31375.m11087(c2039, null, new EnumC0214[0]);
                } else {
                    m31375.m11087(new C17812(str, m31375.m11094()), new C7188(m31375.m11094()), new EnumC0214[0]);
                }
            } else if (m31375.m11100()) {
                C2039 c20392 = new C2039(str.substring(1), m31375.m11094());
                c20392.m6633(65536);
                c20392.m6632(4096);
                c20392.mo10438(new C14011(str, m31375.m11094()));
                m31375.m11087(c20392, null, new EnumC0214[0]);
            } else {
                m31375.m11087(new C16400(str, m31375.m11094()), new C7188(m31375.m11094()), new EnumC0214[0]);
            }
            this.f38757 = 0L;
            this.f38760 = 0L;
            if (m31375 != null) {
                m31375.close();
            }
        } catch (Throwable th5) {
            if (m31375 != null) {
                try {
                    m31375.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // l.InterfaceC10196
    public final long length() {
        boolean z;
        InterfaceC23100 interfaceC23100;
        C17729 c17729 = this.f38759;
        if (this.f38757 > System.currentTimeMillis()) {
            return this.f38758;
        }
        try {
            C3618 m31375 = m31375();
            try {
                int mo28329 = mo28329();
                if (mo28329 != 8) {
                    if (c17729.m41523() == null) {
                        z = true;
                        if (c17729.m41529().length() <= 1) {
                            if (z && mo28329 != 16) {
                                m31368(m31375, c17729.m41529(), 5);
                            } else {
                                this.f38758 = 0L;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    this.f38758 = 0L;
                } else {
                    try {
                        interfaceC23100 = (InterfaceC23100) m31357(m31375, (byte) 3);
                    } catch (C3037 e) {
                        f38750.mo7081("getDiskFreeSpace", (Exception) e);
                        int m9291 = e.m9291();
                        if ((m9291 == -1073741823 || m9291 == -1073741821) && !m31375.m11100()) {
                            interfaceC23100 = (InterfaceC23100) m31357(m31375, (byte) -1);
                        } else {
                            throw e;
                        }
                    }
                    this.f38758 = interfaceC23100.mo29550();
                }
                this.f38757 = System.currentTimeMillis() + ((C13722) this.f38755.mo27540()).m32974();
                long j = this.f38758;
                if (m31375 != null) {
                    m31375.close();
                }
                return j;
            } finally {
            }
        } catch (C19369 e2) {
            throw C3037.m9289(e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12832 m31357(C3618 c3618, byte b) {
        if (c3618.m11100()) {
            C17561 c17561 = new C17561(c3618.m11094());
            c17561.m41053(b);
            return (InterfaceC12832) ((C14738) m31364(c3618, 128, c17561, new AbstractC13306[0])).m35042();
        }
        C8368 c8368 = new C8368(c3618.m11094(), b);
        c3618.m11087(new C1312(c3618.m11094(), b), c8368, new EnumC0214[0]);
        return c8368.m21970();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m31372() {
        C17729 c17729 = this.f38759;
        if (c17729.m41529().length() == 1) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            C3618 m31375 = m31375();
            try {
                m31373();
                String m41529 = c17729.m41529();
                InterfaceC2148 interfaceC2148 = f38750;
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("mkdir: " + m41529);
                }
                if (m31375.m11100()) {
                    C2039 c2039 = new C2039(m41529, m31375.m11094());
                    c2039.m6636(2);
                    c2039.m6632(1);
                    c2039.mo10438(new C14011(m41529, m31375.m11094()));
                    m31375.m11087(c2039, null, new EnumC0214[0]);
                } else {
                    m31375.m11087(new C10757(m41529, m31375.m11094()), new C7188(m31375.m11094()), new EnumC0214[0]);
                }
                this.f38757 = 0L;
                this.f38760 = 0L;
                m31375.close();
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12601 m31364(C3618 c3618, int i, AbstractC13306 abstractC13306, AbstractC13306... abstractC13306Arr) {
        InterfaceC1023 m11094 = c3618.m11094();
        C17729 c17729 = this.f38759;
        C2039 c2039 = new C2039(c17729.m41529(), m11094);
        try {
            c2039.m6636(1);
            c2039.m6632(0);
            c2039.m6640(128);
            c2039.m6633(i);
            c2039.m6642(3);
            if (abstractC13306 != null) {
                c2039.mo10438(abstractC13306);
                int length = abstractC13306Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC13306 abstractC133062 = abstractC13306Arr[i2];
                    abstractC13306.mo10438(abstractC133062);
                    i2++;
                    abstractC13306 = abstractC133062;
                }
            } else {
                abstractC13306 = c2039;
            }
            C14011 c14011 = new C14011(c17729.m41529(), c3618.m11094());
            c14011.m33605();
            abstractC13306.mo10438(c14011);
            C11212 c11212 = (C11212) c3618.m11087(c2039, null, new EnumC0214[0]);
            C7662 c7662 = (C7662) c14011.mo5429();
            C11212 c112122 = (c7662.m20461() & 1) != 0 ? c7662 : c11212;
            this.f38753 = true;
            c112122.getClass();
            this.f38752 = c112122.mo7549();
            this.f38761 = c112122.getAttributes() & EnumC5983.f18409;
            this.f38760 = System.currentTimeMillis() + ((C13722) c3618.m11094()).m32974();
            this.f38758 = c112122.getSize();
            this.f38757 = System.currentTimeMillis() + ((C13722) c3618.m11094()).m32974();
            return (AbstractC12601) c11212.m10466();
        } catch (RuntimeException | C19369 e) {
            try {
                C11212 c112123 = (C11212) c2039.mo5429();
                if (c112123.mo28213() && c112123.m10446() == 0) {
                    c3618.m11087(new C14011(c3618.m11094(), c112123.m27780()), null, EnumC0214.NO_RETRY);
                }
            } catch (Exception e2) {
                f38750.mo7081("Failed to close after failure", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31365(int i, long j, long j2, long j3) {
        C3618 m31375 = m31375();
        try {
            if (!m31373()) {
                throw new C3037(-1073741772);
            }
            int i2 = this.f38761 & 16;
            if (m31375.m11100()) {
                C23911 c23911 = new C23911(m31375.m11094());
                c23911.m52666(new C5071(i | i2, j, j3, j2));
                m31364(m31375, 256, c23911, new AbstractC13306[0]);
            } else if (m31375.m11089(16)) {
                C12209 m31362 = m31362(1, 256, 3, i2, i2 != 0 ? 1 : 64);
                try {
                    m31375.m11087(new C22479(m31375.m11094(), m31362.m29692(), i | i2, j, j2, j3), new C20363(m31375.m11094()), EnumC0214.NO_RETRY);
                    m31362.m29688();
                } finally {
                }
            } else {
                if (j != 0 || j3 != 0) {
                    throw new C0089("Cannot set creation or access time without CAP_NT_SMBS");
                }
                m31375.m11087(new C22046(m31375.m11094(), this.f38759.m41529(), i, j2 - m31375.m11092()), new C19930(m31375.m11094()), new EnumC0214[0]);
            }
            this.f38760 = 0L;
            m31375.close();
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31366(long j, long j2, long j3) {
        if (this.f38759.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31365(0, j, j2, j3);
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m31371() {
        int i;
        C17729 c17729 = this.f38759;
        if (c17729.m41518()) {
            i = 0;
        } else {
            m31373();
            i = this.f38761 & EnumC5983.f18409;
        }
        if (c17729.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31365(i & 12454, 0L, 0L, 0L);
        } catch (C3037 e) {
            if (e.m9291() != -1073741637) {
                throw e;
            }
            throw new C0089("Attribute not supported by server");
        } catch (C19369 e2) {
            throw C3037.m9289(e2);
        }
    }

    public final int hashCode() {
        return this.f38759.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12914)) {
            return false;
        }
        InterfaceC10196 interfaceC10196 = (InterfaceC10196) obj;
        if (this == interfaceC10196) {
            return true;
        }
        return this.f38759.equals(interfaceC10196.mo25594());
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return ((URLConnection) this).url.toString();
    }

    @Override // java.net.URLConnection
    @Deprecated
    public final int getContentLength() {
        try {
            return (int) (length() & 4294967295L);
        } catch (C3037 e) {
            f38750.mo7081("getContentLength", (Exception) e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        try {
            return length();
        } catch (C3037 e) {
            f38750.mo7081("getContentLength", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        try {
            return mo25593();
        } catch (C3037 e) {
            f38750.mo7081("getDate", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        try {
            return mo25593();
        } catch (C3037 e) {
            f38750.mo7081("getLastModified", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new C10093(this);
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return new C5859(this);
    }
}
