package l;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: R9JP */
/* renamed from: l.֫֡᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1482 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5314 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C18698 f5315 = new C18698(new C12624(), new C6127());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4332 m5130(boolean z, EnumC7685 enumC7685, EnumC11919 enumC11919) {
        EnumC7685 enumC76852 = EnumC7685.DEFAULT_SIGNED;
        if (enumC7685 != enumC76852 && enumC11919 != EnumC11919.SMB2_ONLY) {
            throw new IllegalArgumentException("Unsigned SMB mode requires SMB2 dialects");
        }
        C19855 m13008 = C4332.m13008();
        m13008.m45685();
        if (enumC11919 == EnumC11919.SMB2_ONLY) {
            m13008.m45676(false);
            m13008.m45677(EnumC22094.SMB_2_1, EnumC22094.SMB_2_0_2);
        } else {
            m13008.m45676(true);
            if (enumC11919 == EnumC11919.SMB3_ONLY) {
                m13008.m45677(EnumC22094.SMB_3_1_1, EnumC22094.SMB_3_0_2, EnumC22094.SMB_3_0);
            }
        }
        if (enumC7685 != enumC76852) {
            m13008.m45683(false);
            m13008.m45681();
            if (enumC7685 == EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT) {
                m13008.m45684();
            }
        }
        if (z) {
            m13008.m45680(true);
        }
        return m13008.m45668();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5142(C12066 c12066) {
        for (EnumC11919 enumC11919 : EnumC11919.values()) {
            for (EnumC7685 enumC7685 : EnumC7685.values()) {
                if (enumC7685 == EnumC7685.DEFAULT_SIGNED || enumC11919 == EnumC11919.SMB2_ONLY) {
                    f5315.m43318(new C6274(c12066, enumC7685, enumC11919));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10508 m5133(C12066 c12066, EnumC11919 enumC11919, boolean z, boolean z2) {
        IOException e;
        C18698 c18698 = f5315;
        if (!z2 || enumC11919 == EnumC11919.SMB3_ONLY) {
            e = null;
        } else {
            try {
                return m5132(new C6274(c12066, EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT, EnumC11919.SMB2_ONLY));
            } catch (IOException e2) {
                e = e2;
                c18698.m43318(new C6274(c12066, EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT, EnumC11919.SMB2_ONLY));
            }
        }
        if (z && enumC11919 != EnumC11919.SMB3_ONLY) {
            try {
                return m5132(new C6274(c12066, EnumC7685.SMB2_UNSIGNED, EnumC11919.SMB2_ONLY));
            } catch (IOException unused) {
                c18698.m43318(new C6274(c12066, EnumC7685.SMB2_UNSIGNED, EnumC11919.SMB2_ONLY));
            }
        }
        try {
            return m5132(new C6274(c12066, EnumC7685.DEFAULT_SIGNED, enumC11919));
        } catch (IOException e3) {
            if (enumC11919 == EnumC11919.SMB3_ONLY || !m5140(c12066, e3)) {
                throw e3;
            }
            try {
                return m5132(new C6274(c12066, EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT, EnumC11919.SMB2_ONLY));
            } catch (IOException e4) {
                m5135(e4, e3);
                if (e != null) {
                    m5135(e4, e);
                }
                throw e4;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10508 m5132(C6274 c6274) {
        try {
            return (C10508) f5315.m43316(c6274);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5138(C12066 c12066, C2921 c2921, EnumC11919 enumC11919, C23786 c23786) {
        try {
            m5137(c12066, c2921, EnumC7685.DEFAULT_SIGNED, enumC11919, c23786);
        } catch (Exception e) {
            if (enumC11919 == EnumC11919.SMB3_ONLY || !m5140(c12066, e)) {
                throw e;
            }
            try {
                m5137(c12066, c2921, EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT, EnumC11919.SMB2_ONLY, c23786);
            } catch (Exception e2) {
                m5135(e2, e);
                throw e2;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5137(C12066 c12066, C2921 c2921, EnumC7685 enumC7685, EnumC11919 enumC11919, C23786 c23786) {
        C21971 c21971 = new C21971(m5130(false, enumC7685, enumC11919));
        C23650 c23650 = null;
        try {
            C23650 m49459 = c21971.m49459(c12066.f36086, c12066.f36083);
            if ((enumC7685 == EnumC7685.SMB2_UNSIGNED) && m49459.m52167().m18283()) {
                throw new IOException("SMB server requires signing");
            }
            new C3024(EnumC2194.f7203.m7248(m49459.m52154(c2921))).m9272(((C12066) c23786.f76995).f36083);
            try {
                m49459.m52158(true);
            } catch (IOException unused) {
            }
            C0349.m1793(c21971);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    c23650.m52158(true);
                } catch (IOException unused2) {
                }
            }
            C0349.m1793(c21971);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6421 m5131(C12066 c12066, EnumC11919 enumC11919, boolean z, EnumC15592 enumC15592) {
        C14034 m5134;
        C20177 c20177 = new C20177();
        C4332 m5130 = m5130(z, EnumC7685.DEFAULT_SIGNED, enumC11919);
        try {
            C2921 m5143 = m5143(c12066);
            try {
                m5134 = m5134(c12066, m5130, m5143, c20177);
            } catch (Exception e) {
                if (enumC11919 == EnumC11919.SMB3_ONLY || !m5140(c12066, e)) {
                    throw e;
                }
                try {
                    m5134 = m5134(c12066, m5130(false, EnumC7685.SMB2_GUEST_UNSIGNED_COMPAT, EnumC11919.SMB2_ONLY), m5143, c20177);
                } catch (Exception e2) {
                    m5135(e2, e);
                    throw e2;
                }
            }
            EnumC15592 enumC155922 = EnumC15592.SMB3_ONLY;
            if (enumC15592 == enumC155922) {
                return new C6421(enumC155922, null, false);
            }
            return new C6421(EnumC15592.SMB2_ONLY, null, m5134.m33647());
        } catch (Exception e3) {
            return C20533.m47016(e3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14034 m5134(C12066 c12066, C4332 c4332, C2921 c2921, C20177 c20177) {
        C21971 c21971 = new C21971(c4332);
        try {
            C23650 m49459 = c21971.m49459(c12066.f36086, c12066.f36083);
            try {
                m49459.m52154(c2921);
                C14034 c14034 = new C14034((m49459.m52161().m47645().m49681() || m49459.m52167().m18283()) ? false : true);
                try {
                    m49459.m52158(true);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    C0349.m1793(c21971);
                    throw th;
                }
                C0349.m1793(c21971);
                return c14034;
            } catch (Throwable th2) {
                try {
                    try {
                        m49459.m52158(true);
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    C0349.m1793(c21971);
                    throw th4;
                }
                C0349.m1793(c21971);
                throw th2;
            }
        } catch (Exception e) {
            C0349.m1793(c21971);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5141(C10508 c10508) {
        C6274 c6274;
        try {
            C18698 c18698 = f5315;
            c6274 = c10508.f31520;
            c18698.m43319(c6274, c10508);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5136(C10508 c10508) {
        C6274 c6274;
        try {
            C18698 c18698 = f5315;
            c6274 = c10508.f31520;
            c18698.m43317(c6274, c10508);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5140(C12066 c12066, Exception exc) {
        String str = c12066.f36087;
        String str2 = c12066.f36084;
        if (TextUtils.isEmpty(str)) {
            return (TextUtils.isEmpty(str2) || str2.equals("guest")) && m5139(exc, Collections.newSetFromMap(new IdentityHashMap()));
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5139(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C1236) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m5139(th2, set)) {
                return true;
            }
        }
        return m5139(th.getCause(), set);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5135(Throwable th, Throwable th2) {
        if (th != th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2921 m5143(C12066 c12066) {
        String str = c12066.f36084;
        String str2 = c12066.f36087;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return new C2921("", new char[0], null);
        }
        if (str.equals("guest") && TextUtils.isEmpty(str2)) {
            return new C2921("Guest", new char[0], null);
        }
        return new C2921(str, str2.toCharArray(), c12066.f36082);
    }
}
