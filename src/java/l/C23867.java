package l;

import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: L19N */
/* renamed from: l.᩻ᩳᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23867 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52579(AbstractC15440 abstractC15440) {
        C18090 c18090 = new C18090(abstractC15440);
        try {
            Iterator it = c18090.m42210().iterator();
            while (it.hasNext()) {
                C3545 c3545 = (C3545) it.next();
                String name = c3545.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    if (c18090.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF") != null) {
                        try {
                            byte[] encoded = new C18118(c18090.m42193(c3545, (C19277) null)).m42246()[0].getEncoded();
                            c18090.close();
                            return encoded;
                        } catch (Exception unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            c18090.close();
            return null;
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52577(AbstractC15440 abstractC15440, C22250 c22250, InterfaceC17066 interfaceC17066) {
        C15193 c15193 = c22250.f72209;
        C15193 c151932 = c22250.f72208;
        C15193 c151933 = c22250.f72206;
        C18090 c18090 = new C18090(abstractC15440);
        try {
            boolean z = false;
            byte[] bArr = null;
            for (C3545 c3545 : c18090.m42210()) {
                String name = c3545.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    C3545 entry = c18090.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF");
                    if (entry != null) {
                        try {
                            C18118 c18118 = new C18118(c18090.m42193(c3545, (C19277) null));
                            bArr = c18090.m42193(entry, (C19277) null);
                            z = c18118.m42245(bArr);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C3545 entry2 = c18090.getEntry("META-INF/MANIFEST.MF");
            byte[] m42193 = entry2 != null ? c18090.m42193(entry2, (C19277) null) : null;
            if (z && m42193 != null) {
                C14694 c14694 = new C14694(m42193);
                C14694 c146942 = new C14694(bArr);
                String m27606 = c146942.f44887.m27606("X-Android-APK-Signed");
                if (m27606 != null) {
                    for (String str : m27606.split(",")) {
                        String trim = str.trim();
                        switch (trim.hashCode()) {
                            case 50:
                                if (trim.equals("2") && c15193.f46410.m48708()) {
                                    c15193.f46410 = EnumC21545.MISSING;
                                    break;
                                }
                                break;
                            case 51:
                                if (trim.equals("3") && c151932.f46410.m48708()) {
                                    c151932.f46410 = EnumC21545.MISSING;
                                    break;
                                }
                                break;
                            case 52:
                                if (trim.equals("4") && c151933.f46410.m48708()) {
                                    c151933.f46410 = EnumC21545.MISSING;
                                    break;
                                }
                                break;
                        }
                    }
                }
                if (!interfaceC17066.mo1526()) {
                    if (m52576(c146942, c14694, m42193)) {
                        try {
                            boolean m52578 = m52578(c18090, c14694, interfaceC17066);
                            c18090.close();
                            return m52578;
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    c18090.close();
                    return false;
                }
            }
            c18090.close();
            return false;
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52576(C14694 c14694, C14694 c146942, byte[] bArr) {
        C17517 c17517 = new C17517(new C23119());
        C17517 c175172 = new C17517(new C13946());
        C17517 c175173 = new C17517(new C2354(1));
        C17517 c175174 = new C17517(new C3765(1));
        C11126 c11126 = c14694.f44887;
        String m27606 = c11126.m27606("SHA-256-Digest-Manifest");
        if (m27606 != null) {
            if (Base64.encodeToString(((MessageDigest) c175172.m40934()).digest(bArr), 2).equals(m27606)) {
                return true;
            }
        } else {
            String m276062 = c11126.m27606("SHA1-Digest-Manifest");
            if (m276062 != null) {
                if (Base64.encodeToString(((MessageDigest) c17517.m40934()).digest(bArr), 2).equals(m276062)) {
                    return true;
                }
            } else {
                String m276063 = c11126.m27606("SHA-512-Digest-Manifest");
                if (m276063 != null) {
                    if (Base64.encodeToString(((MessageDigest) c175174.m40934()).digest(bArr), 2).equals(m276063)) {
                        return true;
                    }
                } else {
                    String m276064 = c11126.m27606("SHA-384-Digest-Manifest");
                    if (m276064 != null && Base64.encodeToString(((MessageDigest) c175173.m40934()).digest(bArr), 2).equals(m276064)) {
                        return true;
                    }
                }
            }
        }
        for (C11126 c111262 : c14694.f44888.values()) {
            C11126 c111263 = (C11126) c146942.f44888.get(c111262.m27608());
            if (c111263 == null) {
                return false;
            }
            String m276065 = c111262.m27606("SHA256-Digest");
            if (m276065 != null) {
                ((MessageDigest) c175172.m40934()).update(bArr, c111263.m27610(), c111263.m27609());
                if (!Base64.encodeToString(((MessageDigest) c175172.m40934()).digest(), 2).equals(m276065)) {
                    return false;
                }
            } else {
                String m276066 = c111262.m27606("SHA1-Digest");
                if (m276066 != null) {
                    ((MessageDigest) c17517.m40934()).update(bArr, c111263.m27610(), c111263.m27609());
                    if (!Base64.encodeToString(((MessageDigest) c17517.m40934()).digest(), 2).equals(m276066)) {
                        return false;
                    }
                } else {
                    String m276067 = c111262.m27606("SHA512-Digest");
                    if (m276067 != null) {
                        ((MessageDigest) c175174.m40934()).update(bArr, c111263.m27610(), c111263.m27609());
                        if (!Base64.encodeToString(((MessageDigest) c175174.m40934()).digest(), 2).equals(m276067)) {
                            return false;
                        }
                    } else {
                        String m276068 = c111262.m27606("SHA384-Digest");
                        if (m276068 == null) {
                            return false;
                        }
                        ((MessageDigest) c175173.m40934()).update(bArr, c111263.m27610(), c111263.m27609());
                        if (!Base64.encodeToString(((MessageDigest) c175173.m40934()).digest(), 2).equals(m276068)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52578(C18090 c18090, C14694 c14694, InterfaceC17066 interfaceC17066) {
        long m10793;
        ThreadLocal threadLocal;
        final HashMap hashMap = new HashMap(c18090.m42207());
        C5378.stream(c18090.m42210()).filter(new C13241()).forEach(new Consumer() { // from class: l.۫ܽᩳ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                C3545 c3545 = (C3545) obj;
                hashMap.put(c3545.m10813(), c3545);
            }
        });
        ThreadLocal c7597 = new C7597();
        ThreadLocal c11168 = new C11168();
        ThreadLocal c16811 = new C16811();
        ThreadLocal c18223 = new C18223();
        C14561 m42196 = c18090.m42196();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (C11126 c11126 : c14694.f44888.values()) {
            String m27608 = c11126.m27608();
            C3545 c3545 = (C3545) hashMap.remove(m27608);
            if (c3545 == null) {
                if (C3364.m10286(m27608)) {
                    return false;
                }
            } else {
                String m27606 = c11126.m27606("SHA-256-Digest");
                if (m27606 != null) {
                    threadLocal = c11168;
                } else {
                    m27606 = c11126.m27606("SHA1-Digest");
                    if (m27606 != null) {
                        threadLocal = c7597;
                    } else {
                        m27606 = c11126.m27606("SHA-512-Digest");
                        if (m27606 != null) {
                            threadLocal = c18223;
                        } else {
                            m27606 = c11126.m27606("SHA-384-Digest");
                            if (m27606 == null) {
                                C11003.toString((List) C5378.stream(c11126.m27607()).map(new C10420(0)).collect(C22976.toList()));
                                return false;
                            }
                            threadLocal = c16811;
                        }
                    }
                }
                long m107932 = c3545.m10793() + j2;
                ThreadLocal threadLocal2 = c7597;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RunnableC1995(c3545, threadLocal, m27606, interfaceC17066, atomicBoolean, m42196, atomicReference));
                arrayList2 = arrayList3;
                j2 = m107932;
                c7597 = threadLocal2;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList;
        Iterator it = hashMap.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((String) it.next()).startsWith("META-INF/")) {
                i++;
            }
        }
        if (i != 0) {
            return false;
        }
        Collections.sort(arrayList4, C8200.comparingLong(new C6186()));
        ArrayList arrayList6 = new ArrayList();
        long j3 = j2 / ((int) ((C17615.f53826 + 1) * 1.5f));
        int i2 = 0;
        ArrayList arrayList7 = arrayList5;
        while (i2 < arrayList4.size()) {
            RunnableC1995 runnableC1995 = (RunnableC1995) arrayList4.get(i2);
            if (arrayList7 == null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(runnableC1995);
                m10793 = runnableC1995.f6680.m10793();
                arrayList6.add(arrayList8);
                arrayList7 = arrayList8;
            } else {
                m10793 = runnableC1995.f6680.m10793() + j;
                if (m10793 > j3) {
                    i2--;
                    arrayList7 = arrayList5;
                    i2++;
                } else {
                    arrayList7.add(runnableC1995);
                }
            }
            j = m10793;
            i2++;
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(arrayList6.size());
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            final List list = (List) it2.next();
            newFixedThreadPool.submit(new Runnable() { // from class: l.ۨܽᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((RunnableC1995) it3.next()).run();
                    }
                }
            });
        }
        C1802.m5992(newFixedThreadPool);
        c18090.m42191();
        if (interfaceC17066.mo1526()) {
            return false;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new IOException(th);
        }
        return !atomicBoolean.get();
    }
}
