package l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;

/* compiled from: A9ZK */
/* renamed from: l.ۙۚ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4448 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f14198 = C11321.m27961(C4448.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16044 m13196(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846, String str) {
        C17729 c17729 = (C17729) interfaceC5962;
        String m41527 = c17729.m41527();
        int m41525 = c17729.m41525();
        if (m41525 != 445) {
            m41527 = m41527 + ":" + m41525;
        }
        String m23341 = C9045.m23341(C3435.m10501("ncacn_np:", m41527, "[endpoint=", str, ",address="), interfaceC3846.mo1012(), "]");
        int i = C16044.f49486;
        if (m23341.startsWith("ncacn_np:")) {
            return new C16044(m23341, interfaceC18663);
        }
        throw new C9696("DCERPC transport not supported: ".concat(m23341));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14325[] m13197(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846) {
        C16044 m13196 = m13196(interfaceC18663, interfaceC5962, interfaceC3846, "\\PIPE\\netdfs");
        try {
            C4051 c4051 = new C4051(((C17729) interfaceC5962).m41527());
            m13196.m37957(c4051);
            if (c4051.f12873 == 0) {
                C5462 c5462 = (C5462) c4051.f12869.f4396;
                C16834[] c16834Arr = new C16834[c5462.f16991];
                for (int i = 0; i < c5462.f16991; i++) {
                    c16834Arr[i] = new C16834(c5462.f16992[i].f47004);
                }
                m13196.close();
                return c16834Arr;
            }
            throw new C3037(c4051.f12873, true);
        } catch (Throwable th) {
            try {
                m13196.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14325[] m13198(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846) {
        C16044 m13196 = m13196(interfaceC18663, interfaceC5962, interfaceC3846, "\\PIPE\\srvsvc");
        try {
            C19574 c19574 = new C19574(((C17729) interfaceC5962).m41527());
            m13196.m37957(c19574);
            if (c19574.f69572 != 0) {
                throw new C3037(c19574.f69572, true);
            }
            InterfaceC14325[] m45020 = c19574.m45020();
            m13196.close();
            return m45020;
        } catch (Throwable th) {
            try {
                m13196.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5257 m13195(C12914 c12914) {
        C3618 m31375;
        InterfaceC14325[] m41007;
        C17729 c17729 = c12914.f38759;
        boolean isEmpty = c17729.m41522().getHost().isEmpty();
        InterfaceC2148 interfaceC2148 = f14198;
        if (isEmpty) {
            try {
                String mo1012 = c17729.m41515().mo1012();
                if (mo1012 != null) {
                    try {
                        if (mo1012.length() != 0) {
                            C12914 c129142 = new C12914(c12914, mo1012);
                            try {
                                C3618 m313752 = c129142.m31375();
                                try {
                                    if (!m313752.m11100()) {
                                        C9388 c9388 = new C9388(c12914, new C20677(c12914, m313752));
                                        m313752.close();
                                        c129142.close();
                                        return c9388;
                                    }
                                    throw new C0089();
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    c129142.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (MalformedURLException | UnknownHostException e) {
                        throw new C3037("Failed to resolve child element", e);
                    }
                }
                throw new C3037("Name must not be empty");
            } catch (C19369 e2) {
                if (e2.getCause() instanceof UnknownHostException) {
                    interfaceC2148.mo7081("Failed to find master browser", (Exception) e2);
                    throw new C0089();
                }
                throw e2;
            }
        }
        if (c17729.m41520() == 2) {
            m31375 = c12914.m31375();
            try {
                if (!m31375.m11100()) {
                    C9388 c93882 = new C9388(c12914, new C20677(c12914, m31375));
                    m31375.close();
                    return c93882;
                }
                throw new C0089();
            } finally {
            }
        }
        if (c17729.m41523() == null && c17729.m41529().length() <= 1) {
            C17729 clone = c17729.clone();
            InterfaceC18663 context = c12914.getContext();
            URL m41522 = clone.m41522();
            if (m41522.getPath().lastIndexOf(47) != m41522.getPath().length() - 1) {
                throw new C3037(m41522.toString() + " directory must end with '/'");
            }
            if (clone.m41520() != 4) {
                throw new C3037("The requested list operations is invalid: " + m41522.toString());
            }
            HashSet hashSet = new HashSet();
            if (((C13474) context.mo27541()).m32497(clone.m41527(), context)) {
                try {
                    for (InterfaceC14325 interfaceC14325 : m13197(context, clone, clone.m41515())) {
                        if (!hashSet.contains(interfaceC14325)) {
                            hashSet.add(interfaceC14325);
                        }
                    }
                } catch (IOException e3) {
                    interfaceC2148.mo7081("DS enumeration failed", (Exception) e3);
                }
            }
            int i = C2207.f7246;
            context.mo27540().getClass();
            try {
                C3618 m7329 = new C2207(context).m7329(clone, clone.m41526());
                try {
                    C23373 m11098 = m7329.m11098();
                    try {
                        C20552 m51804 = m11098.m51804();
                        try {
                            try {
                                m41007 = m13198(context, clone, m51804.m47109());
                            } catch (IOException e4) {
                                if (m7329.m11100()) {
                                    throw e4;
                                }
                                interfaceC2148.mo7081("doMsrpcShareEnum failed", (Exception) e4);
                                C2018 c2018 = new C2018(m7329.m11094());
                                C11191 c11191 = new C11191(m7329.m11094());
                                m7329.m11087(c2018, c11191, new EnumC0214[0]);
                                if (c11191.m41008() != 0) {
                                    throw new C3037(c11191.m41008(), true);
                                }
                                m41007 = c11191.m41007();
                            }
                            for (InterfaceC14325 interfaceC143252 : m41007) {
                                if (!hashSet.contains(interfaceC143252)) {
                                    hashSet.add(interfaceC143252);
                                }
                            }
                            m51804.m19171();
                            m11098.m51813();
                            m7329.close();
                            return new C21382(c12914, hashSet.iterator());
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    try {
                        m7329.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (C3037 e5) {
                throw e5;
            } catch (IOException e6) {
                interfaceC2148.mo7081("doNetShareEnum failed", (Exception) e6);
                throw new C3037(m41522.toString(), e6);
            }
        }
        m31375 = c12914.m31375();
        try {
            if (m31375.m11100()) {
                C1626 c1626 = new C1626(c12914, new C16442(c12914, m31375));
                m31375.close();
                return c1626;
            }
            C1626 c16262 = new C1626(c12914, new C10799(c12914, m31375));
            m31375.close();
            return c16262;
        } finally {
        }
    }
}
