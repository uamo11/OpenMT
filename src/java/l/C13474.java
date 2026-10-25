package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: CA02 */
/* renamed from: l.ܰ֡᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13474 implements InterfaceC15133 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C8599 f40223 = new C8599();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f40222 = C11321.m27961(C13474.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11359 f40224 = null;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f40229 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f40225 = new HashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f40227 = new Object();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11359 f40228 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f40226 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if ((java.lang.System.currentTimeMillis() + 10000) > r2.f33997) goto L25;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m32496(l.InterfaceC18663 r13, java.lang.String r14, l.C8599 r15) {
        /*
            r12 = this;
            java.lang.String r1 = "Invalid UNC path "
            java.lang.String r2 = "Key is "
            java.lang.String r3 = "\\"
            java.lang.String r4 = "Adding key "
            java.lang.String r5 = "Inserting referral for "
            r0 = r12
            monitor-enter(r0)
            l.֨ۡ᩵ r6 = r13.mo27540()     // Catch: java.lang.Throwable -> Le7
            r6.getClass()     // Catch: java.lang.Throwable -> Le7
            l.֫᩻֨ r6 = l.C13474.f40222     // Catch: java.lang.Throwable -> Le7
            boolean r7 = r6.mo7086()     // Catch: java.lang.Throwable -> Le7
            if (r7 == 0) goto L2a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le7
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Le7
            r7.append(r14)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> Le7
            r6.mo7088(r5)     // Catch: java.lang.Throwable -> Le7
        L2a:
            r5 = 92
            r7 = 1
            int r8 = r14.indexOf(r5, r7)     // Catch: java.lang.Throwable -> Le7
            int r9 = r8 + 1
            int r10 = r14.indexOf(r5, r9)     // Catch: java.lang.Throwable -> Le7
            if (r8 < 0) goto Lde
            if (r10 >= 0) goto L3d
            goto Lde
        L3d:
            java.lang.String r1 = r14.substring(r7, r8)     // Catch: java.lang.Throwable -> Le7
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Le7
            java.lang.String r1 = r1.toLowerCase(r8)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r9 = r14.substring(r9, r10)     // Catch: java.lang.Throwable -> Le7
            int r10 = r15.mo22336()     // Catch: java.lang.Throwable -> Le7
            r11 = 0
            java.lang.String r14 = r14.substring(r11, r10)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r14 = r14.toLowerCase(r8)     // Catch: java.lang.Throwable -> Le7
            l.֨ۡ᩵ r8 = r13.mo27540()     // Catch: java.lang.Throwable -> Le7
            r8.getClass()     // Catch: java.lang.Throwable -> Le7
            boolean r8 = r6.mo7086()     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto L7c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le7
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le7
            r8.append(r14)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r4 = " to "
            r8.append(r4)     // Catch: java.lang.Throwable -> Le7
            r8.append(r15)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> Le7
            r6.mo7088(r4)     // Catch: java.lang.Throwable -> Le7
        L7c:
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Le7
            int r1 = r1 + 2
            int r4 = r9.length()     // Catch: java.lang.Throwable -> Le7
            int r1 = r1 + r4
            r15.mo22330(r1)     // Catch: java.lang.Throwable -> Le7
            int r1 = r14.length()     // Catch: java.lang.Throwable -> Le7
            int r1 = r1 - r7
            char r1 = r14.charAt(r1)     // Catch: java.lang.Throwable -> Le7
            if (r1 == r5) goto L99
            java.lang.String r14 = r14.concat(r3)     // Catch: java.lang.Throwable -> Le7
        L99:
            boolean r1 = r6.mo7086()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le7
            r1.append(r14)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le7
            r6.mo7088(r1)     // Catch: java.lang.Throwable -> Le7
        Lae:
            l.ۨ֡᩵ r2 = r12.f40228     // Catch: java.lang.Throwable -> Le7
            java.lang.Object r1 = r12.f40226     // Catch: java.lang.Throwable -> Le7
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Le7
            if (r2 == 0) goto Lc2
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldb
            r5 = 10000(0x2710, double:4.9407E-320)
            long r3 = r3 + r5
            long r5 = r2.f33997     // Catch: java.lang.Throwable -> Ldb
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Ld1
        Lc2:
            l.ۨ֡᩵ r2 = new l.ۨ֡᩵     // Catch: java.lang.Throwable -> Ldb
            l.֨ۡ᩵ r13 = r13.mo27540()     // Catch: java.lang.Throwable -> Ldb
            l.ܰۡ᩵ r13 = (l.C13722) r13     // Catch: java.lang.Throwable -> Ldb
            long r3 = r13.m32998()     // Catch: java.lang.Throwable -> Ldb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldb
        Ld1:
            r12.f40228 = r2     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldb
            l.ۧۤᩴ r13 = r2.f33998     // Catch: java.lang.Throwable -> Le7
            r13.put(r14, r15)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r0)
            return
        Ldb:
            r13 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldb
            throw r13     // Catch: java.lang.Throwable -> Le7
        Lde:
            java.lang.String r13 = r1.concat(r14)     // Catch: java.lang.Throwable -> Le7
            r6.mo7080(r13)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r0)
            return
        Le7:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le7
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13474.m32496(l.ᩴۡ᩵, java.lang.String, l.ۡۖ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ConcurrentMapC10942 m32487(InterfaceC18663 interfaceC18663) {
        C20552 c20552;
        InterfaceC2148 interfaceC2148 = f40222;
        interfaceC18663.mo27540().getClass();
        if (interfaceC18663.mo6355().mo16138() != null && !interfaceC18663.mo6355().mo16138().isEmpty()) {
            if (this.f40224 != null && System.currentTimeMillis() > this.f40224.f33997) {
                this.f40224 = null;
            }
            C11359 c11359 = this.f40224;
            if (c11359 != null) {
                return c11359.f33998;
            }
            try {
                String mo16138 = interfaceC18663.mo6355().mo16138();
                Object m32494 = m32494(mo16138, interfaceC18663);
                try {
                    C11359 c113592 = new C11359(((C13722) interfaceC18663.mo27540()).m32998() * 10);
                    if (m32494 != null) {
                        C20552 c205522 = (C20552) m32494;
                        c205522.m47101(InterfaceC9263.class);
                        c20552 = c205522;
                    } else {
                        c20552 = null;
                    }
                    C8599 m47100 = c20552 != null ? c20552.m47100(interfaceC18663.mo6358(), "", c20552.m47108(), mo16138, 0) : null;
                    if (m47100 != null) {
                        m47100.mo22338();
                        C8599 c8599 = m47100;
                        do {
                            String lowerCase = c8599.mo22329().toLowerCase();
                            c113592.f33998.put(lowerCase, new HashMap());
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7101("Inserting cache entry for domain " + lowerCase + ": " + c8599);
                            }
                            c8599 = c8599.mo22347();
                        } while (c8599 != m47100);
                        this.f40224 = c113592;
                        ConcurrentMapC10942 concurrentMapC10942 = c113592.f33998;
                        if (m32494 != null) {
                            ((AbstractRunnableC7146) m32494).m19171();
                        }
                        return concurrentMapC10942;
                    }
                    if (m32494 != null) {
                        ((AbstractRunnableC7146) m32494).m19171();
                        return null;
                    }
                } finally {
                }
            } catch (IOException e) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7081("getting trusted domains failed: " + interfaceC18663.mo6355().mo16138(), (Exception) e);
                }
                this.f40224 = new C11359(((C13722) interfaceC18663.mo27540()).m32998() * 10);
                interfaceC18663.mo27540().getClass();
                return this.f40224.f33998;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32497(String str, InterfaceC18663 interfaceC18663) {
        synchronized (this.f40229) {
            ConcurrentMapC10942 m32487 = m32487(interfaceC18663);
            if (m32487 == null) {
                return false;
            }
            return m32487.get(str.toLowerCase(Locale.ROOT)) != null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC9263 m32494(java.lang.String r17, l.InterfaceC18663 r18) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13474.m32494(java.lang.String, l.ᩴۡ᩵):l.ۢ֨᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20552 m32492(InterfaceC18663 interfaceC18663, InterfaceC15653 interfaceC15653) {
        if (interfaceC15653 != null) {
            InterfaceC15653 interfaceC156532 = interfaceC15653;
            do {
                try {
                    String mo22329 = interfaceC156532.mo22329();
                    InterfaceC2148 interfaceC2148 = f40222;
                    if (mo22329 != null && !interfaceC156532.mo22329().isEmpty()) {
                        try {
                            InterfaceC11607 mo27538 = interfaceC18663.mo27538();
                            String mo223292 = interfaceC156532.mo22329();
                            if (!interfaceC18663.mo6355().mo16137()) {
                                interfaceC18663.mo27540().getClass();
                            }
                            C20552 c20552 = (C20552) ((C15611) mo27538).m36794(interfaceC18663, mo223292, 0, false, false);
                            c20552.m47101(C20552.class);
                            c20552.m47114();
                            return c20552;
                        } catch (IOException e) {
                            interfaceC2148.mo7081("Connection failed " + interfaceC156532.mo22329(), (Exception) e);
                            interfaceC156532 = interfaceC156532.next();
                        }
                    } else {
                        interfaceC2148.mo7088("No server name in referral");
                    }
                } catch (IOException unused) {
                    interfaceC18663.mo27540().getClass();
                }
            } while (interfaceC156532 != interfaceC15653);
            throw e;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15653 m32491(InterfaceC18663 interfaceC18663, InterfaceC9263 interfaceC9263, String str, String str2, String str3, String str4, String str5) {
        InterfaceC2148 interfaceC2148 = f40222;
        interfaceC18663.mo27540().getClass();
        String str6 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            str6 = C16014.m37867(str6, str5);
        }
        try {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Fetching referral for " + str6);
            }
            C8599 m47100 = ((C20552) interfaceC9263).m47100(interfaceC18663, str6, str3, str2, 0);
            if (m47100 == null) {
                return null;
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Referral for " + str6 + ": " + m47100);
            }
            m47100.mo22338();
            return m47100;
        } catch (IOException e) {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7081("Getting referral for " + str6 + " failed", (Exception) e);
            }
            interfaceC18663.mo27540().getClass();
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15653 m32495(InterfaceC18663 interfaceC18663, String str, String str2, String str3) {
        return m32489(interfaceC18663, str, str2, str3, 5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC15653 m32489(InterfaceC18663 interfaceC18663, String str, String str2, String str3, int i) {
        String str4;
        C8599 c8599;
        C8599 mo22347;
        String str5;
        interfaceC18663.mo27540().getClass();
        C8599 c85992 = null;
        if (str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        InterfaceC2148 interfaceC2148 = f40222;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101(C20087.m46306("Resolving \\", lowerCase, "\\", str2, str3 != null ? str3 : ""));
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f40229) {
            ConcurrentMapC10942 m32487 = m32487(interfaceC18663);
            if (m32487 != null) {
                if (interfaceC2148.mo7099()) {
                    m32493(m32487);
                }
                String lowerCase2 = str2.toLowerCase();
                Map map = (Map) m32487.get(lowerCase);
                c8599 = map != null ? m32490(interfaceC18663, lowerCase, lowerCase2, str3, currentTimeMillis, map) : null;
                interfaceC18663.mo27540().getClass();
                str4 = lowerCase2;
            } else {
                str4 = str2;
                c8599 = null;
            }
        }
        if (c8599 == null && str3 != null) {
            c8599 = m32488(currentTimeMillis, lowerCase, str4, str3);
        }
        if (c8599 != null && c8599.mo22344()) {
            do {
                mo22347 = c8599.mo22347();
                if (c8599.getPath() != null) {
                    str5 = "\\" + c8599.getPath();
                } else {
                    str5 = "";
                }
                StringBuilder m15339 = C5368.m15339(str5);
                m15339.append(str3 != null ? str3.substring(mo22347.mo22336()) : "");
                String sb = m15339.toString();
                InterfaceC2148 interfaceC21482 = f40222;
                if (interfaceC21482.mo7086()) {
                    String mo22329 = mo22347.mo22329();
                    String mo22341 = mo22347.mo22341();
                    String path = mo22347.getPath();
                    StringBuilder m10501 = C3435.m10501("Intermediate referral, server ", mo22329, " share ", mo22341, " refPath ");
                    ASN1BMPString$$ExternalSyntheticOutline0.m(m10501, path, " origPath ", str3, " nextPath ");
                    m10501.append(sb);
                    interfaceC21482.mo7088(m10501.toString());
                }
                InterfaceC15653 m32489 = m32489(interfaceC18663, mo22347.mo22329(), mo22347.mo22341(), sb, i - 1);
                if (m32489 != null) {
                    if (interfaceC21482.mo7086()) {
                        interfaceC21482.mo7088("Next referral is " + m32489);
                    }
                    if (c85992 == null) {
                        c85992 = mo22347.m22339(m32489);
                    } else {
                        c85992.m22333(mo22347.m22339(m32489));
                    }
                }
            } while (mo22347 != c8599);
            if (c85992 != null) {
                return c85992;
            }
        }
        return c8599;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32493(ConcurrentMapC10942 concurrentMapC10942) {
        for (Map.Entry entry : concurrentMapC10942.entrySet()) {
            String str = "Domain " + ((String) entry.getKey());
            InterfaceC2148 interfaceC2148 = f40222;
            interfaceC2148.mo7101(str);
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                interfaceC2148.mo7101("  Root " + ((String) entry2.getKey()));
                if (((C11359) entry2.getValue()).f33998 != null) {
                    for (Map.Entry entry3 : ((C11359) entry2.getValue()).f33998.entrySet()) {
                        InterfaceC15653 interfaceC15653 = (InterfaceC15653) entry3.getValue();
                        InterfaceC15653 interfaceC156532 = interfaceC15653;
                        do {
                            interfaceC2148.mo7101(ASN1Dump.TAB + ((String) entry3.getKey()) + " => " + entry3.getValue());
                            interfaceC156532 = interfaceC156532.mo22347();
                        } while (interfaceC156532 != interfaceC15653);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.InterfaceC15653 m32490(l.InterfaceC18663 r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13474.m32490(l.ᩴۡ᩵, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map):l.ܺۖ᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC15653 m32488(long j, String str, String str2, String str3) {
        C11359 c11359;
        boolean z;
        InterfaceC2148 interfaceC2148 = f40222;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("No match for domain based root, checking standalone " + str);
        }
        synchronized (this.f40226) {
            c11359 = this.f40228;
            if (c11359 == null || j > c11359.f33997) {
                c11359 = new C11359(0L);
            }
            this.f40228 = c11359;
        }
        String m44858 = C19462.m44858("\\", str, "\\", str2);
        if (!str3.equals("\\")) {
            m44858 = C16014.m37867(m44858, str3);
        }
        String lowerCase = m44858.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str4 : c11359.f33998.keySet()) {
            int length2 = str4.length();
            if (length2 == length) {
                z = str4.equals(lowerCase);
            } else if (length2 < length) {
                z = lowerCase.startsWith(str4);
            } else {
                InterfaceC2148 interfaceC21482 = f40222;
                if (interfaceC21482.mo7099()) {
                    interfaceC21482.mo7101(lowerCase + " vs. " + str4);
                }
                z = false;
            }
            if (z) {
                InterfaceC2148 interfaceC21483 = f40222;
                if (interfaceC21483.mo7086()) {
                    interfaceC21483.mo7088("Matched ".concat(str4));
                }
                return (InterfaceC15653) c11359.f33998.get(str4);
            }
        }
        InterfaceC2148 interfaceC21484 = f40222;
        if (!interfaceC21484.mo7099()) {
            return null;
        }
        interfaceC21484.mo7101("No match for ".concat(lowerCase));
        return null;
    }
}
