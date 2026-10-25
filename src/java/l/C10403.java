package l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashSet;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: AAGH */
/* renamed from: l.ۤܺ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10403 extends C13910 implements InterfaceC13224 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f31300;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C3347 f31301;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f31302;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f31303;

    public C10403(boolean z, C3347 c3347) {
        super(z);
        this.f31301 = c3347;
        m15542();
        m15540();
        m13883();
    }

    @Override // l.InterfaceC13224
    public final C3347 getKey() {
        return this.f31301;
    }

    @Override // l.C13910, l.C15321, l.InterfaceC13224
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo26243(String str, String str2) {
        try {
            return super.mo26243(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo13861();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo13861();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC13224
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IOException mo26245() {
        String m36351 = m36351();
        String valueOf = String.valueOf(m36355());
        throw new SocketException(m36351.contains(valueOf) ? "FTP reply: ".concat(m36351) : C19462.m44858("FTP reply ", valueOf, ": ", m36351));
    }

    @Override // l.InterfaceC13224
    public final String getPath() {
        return this.f31302;
    }

    @Override // l.InterfaceC13224
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo26244() {
        return this.f31300;
    }

    @Override // l.InterfaceC13224
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo26241(String str) {
        if (AbstractC16891.m39731(str).equals(this.f31302)) {
            return true;
        }
        if (!C11250.m27829(m36350(EnumC13205.CWD, str))) {
            return false;
        }
        mo26242();
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26240(boolean z) {
        this.f31303 = z;
    }

    @Override // l.C13910, l.C4739
    /* renamed from: ܿ */
    public final Socket mo13874(String str, String str2) {
        if (this.f31303) {
            Socket socket = this.f16949;
            if (socket instanceof SSLSocket ? ((SSLSocket) socket).getEnableSessionCreation() : false) {
                try {
                    m33317(false);
                    return super.mo13874(str, str2);
                } finally {
                    m33317(true);
                }
            }
        }
        return super.mo13874(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: Exception -> 0x0023, TRY_ENTER, TryCatch #1 {Exception -> 0x0023, blocks: (B:11:0x0019, B:15:0x002d, B:16:0x0032, B:20:0x0026, B:24:0x0036, B:25:0x0039), top: B:10:0x0019, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // l.C13910
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo26239(java.net.Socket r4) {
        /*
            r3 = this;
            boolean r0 = r3.f31303
            if (r0 != 0) goto L5
            goto L46
        L5:
            boolean r0 = r4 instanceof javax.net.ssl.SSLSocket
            if (r0 == 0) goto L46
            java.net.Socket r0 = r3.f16949
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            javax.net.ssl.SSLSession r0 = r0.getSession()
            boolean r1 = r0.isValid()
            java.lang.String r2 = "Invalid SSL Session"
            if (r1 == 0) goto L40
            boolean r1 = r3.m26237(r0, r4)     // Catch: java.lang.Exception -> L23 java.lang.ReflectiveOperationException -> L25
            if (r1 == 0) goto L21
            r4 = 1
            goto L2a
        L21:
            r1 = 0
            goto L26
        L23:
            r4 = move-exception
            goto L3a
        L25:
            r1 = move-exception
        L26:
            boolean r4 = r3.m26238(r0, r4)     // Catch: java.lang.Exception -> L23 java.lang.ReflectiveOperationException -> L33
        L2a:
            if (r4 == 0) goto L2d
            goto L46
        L2d:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L23
            r4.<init>(r2)     // Catch: java.lang.Exception -> L23
            throw r4     // Catch: java.lang.Exception -> L23
        L33:
            r4 = move-exception
            if (r1 == 0) goto L39
            r4.addSuppressed(r1)     // Catch: java.lang.Exception -> L23
        L39:
            throw r4     // Catch: java.lang.Exception -> L23
        L3a:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
        L40:
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r2)
            throw r4
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10403.mo26239(java.net.Socket):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a8, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m26237(javax.net.ssl.SSLSession r17, java.net.Socket r18) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10403.m26237(javax.net.ssl.SSLSession, java.net.Socket):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        r13 = r0.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        if (r13 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r1 = r6.getClass().getDeclaredConstructor(java.lang.String.class, java.lang.Integer.TYPE);
        r1.setAccessible(true);
        r0.put(r1.newInstance(r14.getInetAddress().getHostName(), java.lang.Integer.valueOf(r14.getPort())), r13);
        r0.put(r1.newInstance(r14.getInetAddress().getHostAddress(), java.lang.Integer.valueOf(r14.getPort())), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x003f, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m26238(javax.net.ssl.SSLSession r13, java.net.Socket r14) {
        /*
            r12 = this;
            javax.net.ssl.SSLSessionContext r0 = r13.getSessionContext()
            java.lang.Class r1 = r0.getClass()
        L8:
            java.lang.String r2 = "sessionsByHostAndPort"
            if (r1 == 0) goto Lf7
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Lf1
            r2 = 1
            r1.setAccessible(r2)
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L1f
            java.util.Map r0 = (java.util.Map) r0
            goto L24
        L1f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L24:
            boolean r1 = r0.isEmpty()
            r3 = 0
            if (r1 == 0) goto L2d
            goto L9f
        L2d:
            java.util.HashSet r1 = r12.m26236(r13)
            int r13 = r13.getPeerPort()
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = r5
        L3f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L96
            java.lang.Object r7 = r4.next()
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.NoSuchFieldException -> L6f
            java.lang.String r9 = "host"
        L4f:
            if (r8 == 0) goto L69
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L64
            r8.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L6f
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.NoSuchFieldException -> L6f
            if (r8 != 0) goto L5f
            goto L6f
        L5f:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.NoSuchFieldException -> L6f
            goto L70
        L64:
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.NoSuchFieldException -> L6f
            goto L4f
        L69:
            java.lang.NoSuchFieldException r8 = new java.lang.NoSuchFieldException     // Catch: java.lang.NoSuchFieldException -> L6f
            r8.<init>(r9)     // Catch: java.lang.NoSuchFieldException -> L6f
            throw r8     // Catch: java.lang.NoSuchFieldException -> L6f
        L6f:
            r8 = r5
        L70:
            int r9 = m26235(r7)
            if (r8 == 0) goto L3f
            if (r9 < 0) goto L3f
            java.util.Iterator r10 = r1.iterator()
        L7c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L3f
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r11.equalsIgnoreCase(r8)
            if (r11 == 0) goto L7c
            if (r13 != r9) goto L92
            r6 = r7
            goto L96
        L92:
            if (r6 != 0) goto L3f
            r6 = r7
            goto L3f
        L96:
            if (r6 != 0) goto L99
            goto L9f
        L99:
            java.lang.Object r13 = r0.get(r6)
            if (r13 != 0) goto La0
        L9f:
            return r3
        La0:
            java.lang.Class r1 = r6.getClass()
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r2] = r6
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r5)
            r1.setAccessible(r2)
            java.net.InetAddress r5 = r14.getInetAddress()
            java.lang.String r5 = r5.getHostName()
            int r6 = r14.getPort()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r5
            r7[r2] = r6
            java.lang.Object r5 = r1.newInstance(r7)
            r0.put(r5, r13)
            java.net.InetAddress r5 = r14.getInetAddress()
            java.lang.String r5 = r5.getHostAddress()
            int r14 = r14.getPort()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r5
            r4[r2] = r14
            java.lang.Object r14 = r1.newInstance(r4)
            r0.put(r14, r13)
            return r2
        Lf1:
            java.lang.Class r1 = r1.getSuperclass()
            goto L8
        Lf7:
            java.lang.NoSuchFieldException r13 = new java.lang.NoSuchFieldException
            r13.<init>(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10403.m26238(javax.net.ssl.SSLSession, java.net.Socket):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashSet m26236(SSLSession sSLSession) {
        HashSet hashSet = new HashSet();
        String peerHost = sSLSession.getPeerHost();
        if (peerHost != null && !peerHost.isEmpty()) {
            hashSet.add(peerHost);
        }
        Socket socket = this.f16949;
        if (socket != null && socket.getInetAddress() != null) {
            String hostName = this.f16949.getInetAddress().getHostName();
            if (hostName != null && !hostName.isEmpty()) {
                hashSet.add(hostName);
            }
            String hostAddress = this.f16949.getInetAddress().getHostAddress();
            if (hostAddress != null && !hostAddress.isEmpty()) {
                hashSet.add(hostAddress);
            }
        }
        return hashSet;
    }

    @Override // l.C4739, l.InterfaceC13224
    /* renamed from: ܽ */
    public final OutputStream mo13872(String str) {
        try {
            Field declaredField = C4739.class.getDeclaredField("ۗ");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this)).intValue() != 2) {
                throw new IOException("FTPS storeFileStream only supports binary file type");
            }
            Socket m13866 = m13866(EnumC13205.STOR, str);
            if (m13866 == null) {
                return null;
            }
            return new C11109(m13866, m13866.getOutputStream());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to read FTP file type reflectively", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26235(Object obj) {
        try {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField("port");
                    declaredField.setAccessible(true);
                    return ((Integer) declaredField.get(obj)).intValue();
                } catch (NoSuchFieldException unused) {
                }
            }
            throw new NoSuchFieldException("port");
        } catch (NoSuchFieldException unused2) {
            return -1;
        }
    }

    @Override // l.InterfaceC13224
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo26242() {
        String m30702 = m36350(EnumC13205.PWD, (String) null) != 257 ? null : C12519.m30702((String) C18566.m43105(this.f46975, 1));
        if (m30702 == null) {
            mo26245();
            throw null;
        }
        String m39731 = AbstractC16891.m39731(m30702);
        this.f31302 = m39731;
        if (this.f31300 == null) {
            this.f31300 = m39731;
        }
        return m30702;
    }
}
