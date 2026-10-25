package l;

/* compiled from: 570W */
/* renamed from: l.ۛۢܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5980 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12330 f18365;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16783() {
        C18474 c18474;
        C12330 c12330 = this.f18365;
        if (c12330 != null) {
            c18474 = c12330.f36922;
            c18474.m42961();
        }
        this.f18365 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C15650 m16784() {
        C18474 c18474;
        C15650 m42963;
        C12330 c12330 = this.f18365;
        if (c12330 == null) {
            m42963 = null;
        } else {
            c18474 = c12330.f36922;
            m42963 = c18474.m42963();
        }
        return m42963;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16785() {
        C18474 c18474;
        C12330 c12330 = this.f18365;
        if (c12330 != null) {
            c18474 = c12330.f36922;
            c18474.m42964();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10214 m16781(C23097 c23097, InterfaceC20445 interfaceC20445, C7744 c7744, long j, C0314 c0314) {
        C12330 m16779;
        C18474 c18474;
        C8596 m42960;
        C18474 c184742;
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, "textOwner");
        synchronized (this) {
            m16779 = m16779(c23097, interfaceC20445);
            c18474 = m16779.f36922;
            m42960 = c18474.m42960(c23097);
        }
        c184742 = m16779.f36922;
        return new C10214(this, m16779, c184742.m42958(m42960, c7744, j, (InterfaceC17066) c0314), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10214 m16782(C23097 c23097, InterfaceC20445 interfaceC20445, C7744 c7744, C15650 c15650, long j, C14986 c14986, C0314 c0314) {
        C18474 c18474;
        C18474 c184742;
        C18474 c184743;
        C8596 m42959;
        C14986 c149862;
        C18474 c184744;
        C3657 m42958;
        C18474 c184745;
        C18474 c184746;
        if (c15650 != null) {
            C11003.requireNonNull(c14986, "changes");
        }
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, "textOwner");
        synchronized (this) {
            try {
                try {
                    C12330 m16779 = m16779(c23097, interfaceC20445);
                    c18474 = m16779.f36922;
                    try {
                        synchronized (c18474) {
                            try {
                                c184742 = m16779.f36922;
                                C15650 m42963 = c184742.m42963();
                                boolean z = m42963 != null && m42963 == c15650;
                                if (!z) {
                                    c184746 = m16779.f36922;
                                    C8596 m42960 = c184746.m42960(c23097);
                                    c149862 = null;
                                    m42959 = m42960;
                                } else {
                                    int m23880 = m42963.m36849().m23880();
                                    long j2 = 0;
                                    long j3 = j2 + j2;
                                    if (j3 > m23880) {
                                        throw new IllegalArgumentException("Syntax edit does not match the current base");
                                    }
                                    C14986 m35494 = c14986 != null ? c14986 : C14986.m35494(m23880, new C7931(0, (int) j3, 0));
                                    c184743 = m16779.f36922;
                                    m42959 = c184743.m42959(m42963, m35494);
                                    c149862 = m35494;
                                }
                                if (z && c149862.m35509() != c7744.length()) {
                                    throw new IllegalArgumentException("Syntax edit does not match the current base");
                                }
                                if (z) {
                                    c184745 = m16779.f36922;
                                    m42958 = c184745.m42957(m42959, c7744, j, c0314);
                                } else {
                                    c184744 = m16779.f36922;
                                    m42958 = c184744.m42958(m42959, c7744, j, (InterfaceC17066) c0314);
                                }
                                return new C10214(this, m16779, m42958, z);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12330 m16779(C23097 c23097, Object obj) {
        C18474 c18474;
        C23097 c230972;
        Object obj2;
        C12330 c12330 = this.f18365;
        if (c12330 != null) {
            c230972 = c12330.f36921;
            if (c230972 == c23097) {
                obj2 = this.f18365.f36923;
                if (obj2 == obj) {
                    return this.f18365;
                }
            }
        }
        C12330 c123302 = this.f18365;
        if (c123302 != null) {
            c18474 = c123302.f36922;
            c18474.m42961();
        }
        C12330 c123303 = new C12330(c23097, obj);
        this.f18365 = c123303;
        return c123303;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16780(C5980 c5980, C10214 c10214) {
        C5980 c59802;
        C12330 c12330;
        C12330 c123302;
        C18474 c18474;
        C3657 c3657;
        C12330 c123303;
        boolean z;
        synchronized (c5980) {
            c59802 = c10214.f30681;
            if (c59802 == c5980) {
                C12330 c123304 = c5980.f18365;
                c12330 = c10214.f30680;
                if (c123304 == c12330) {
                    c123302 = c10214.f30680;
                    c18474 = c123302.f36922;
                    c3657 = c10214.f30683;
                    if (!c18474.m42962(c3657)) {
                        return false;
                    }
                    synchronized (c5980) {
                        C12330 c123305 = c5980.f18365;
                        c123303 = c10214.f30680;
                        z = c123305 == c123303;
                    }
                    return z;
                }
            }
            return false;
        }
    }
}
