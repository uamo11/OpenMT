package l;

import bin.mt.json.JSON;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.Entry;

/* compiled from: 17A1 */
/* renamed from: l.ۗۧۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3191 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m9810(AbstractC15440 abstractC15440, C19626 c19626, ArrayList arrayList, ArrayList arrayList2) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13874) it.next()).f41355);
        }
        if (hashSet.isEmpty()) {
            return new HashMap();
        }
        if (c19626 == null) {
            try {
                return m9809(abstractC15440, hashSet);
            } catch (IOException unused) {
                return new HashMap();
            }
        }
        if (!abstractC15440.m36526("entry_resources.jsonl").mo23119()) {
            m9811(abstractC15440, c19626, arrayList);
        }
        try {
            return m9809(abstractC15440, hashSet);
        } catch (C20125 unused2) {
            m9811(abstractC15440, c19626, arrayList);
            try {
                return m9809(abstractC15440, hashSet);
            } catch (C20125 unused3) {
                return new HashMap();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        throw new l.C20125("Invalid entry resource cache record");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap m9809(l.AbstractC15440 r7, java.util.HashSet r8) {
        /*
            java.lang.String r0 = "Invalid entry resource cache record"
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lb:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto Lb
        L1b:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L27
            return r8
        L27:
            java.lang.String r2 = "entry_resources.jsonl"
            l.ܶ᩵ܿ r7 = r7.m36526(r2)
            java.io.BufferedReader r7 = r7.m36521()
        L31:
            java.lang.String r2 = r7.readLine()     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L97
            bin.mt.json.JSONObject r3 = new bin.mt.json.JSONObject     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> L9b
            r3.<init>(r2)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> L9b
            java.lang.String r2 = "entry"
            r4 = 0
            java.lang.String r2 = r3.getString(r2, r4)     // Catch: java.lang.RuntimeException -> L89 java.lang.Throwable -> L9b
            java.lang.String r5 = "resourceId"
            java.lang.String r5 = r3.getString(r5, r4)     // Catch: java.lang.RuntimeException -> L82 java.lang.Throwable -> L9b
            java.lang.String r6 = "resourceName"
            java.lang.String r3 = r3.getString(r6, r4)     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L9b
            if (r2 == 0) goto L75
            if (r5 == 0) goto L75
            if (r3 == 0) goto L75
            boolean r4 = r1.contains(r2)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L31
            boolean r4 = r8.containsKey(r2)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L62
            goto L31
        L62:
            l.ۙۧۜ r4 = new l.ۙۧۜ     // Catch: java.lang.Throwable -> L9b
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L9b
            r8.put(r2, r4)     // Catch: java.lang.Throwable -> L9b
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L9b
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L9b
            if (r2 != r3) goto L31
            goto L97
        L75:
            l.᩶ۧۜ r8 = new l.᩶ۧۜ     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            throw r8     // Catch: java.lang.Throwable -> L9b
        L7b:
            r8 = move-exception
            l.᩶ۧۜ r1 = new l.᩶ۧۜ     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L82:
            r8 = move-exception
            l.᩶ۧۜ r1 = new l.᩶ۧۜ     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L89:
            r8 = move-exception
            l.᩶ۧۜ r1 = new l.᩶ۧۜ     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L90:
            r8 = move-exception
            l.᩶ۧۜ r1 = new l.᩶ۧۜ     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L97:
            r7.close()
            return r8
        L9b:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r7 = move-exception
            r8.addSuppressed(r7)
        La4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3191.m9809(l.ܶ᩵ܿ, java.util.HashSet):java.util.HashMap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9812(AbstractC15440 abstractC15440, C23326 c23326, HashSet hashSet) {
        abstractC15440.m36508();
        AbstractC15440 m36526 = abstractC15440.m36526(".entry_resources.jsonl.tmp");
        m36526.mo23552();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(m36526.mo23555(false), StandardCharsets.UTF_8));
            try {
                m9813(c23326, hashSet, bufferedWriter);
                bufferedWriter.close();
                AbstractC15440 m365262 = abstractC15440.m36526("entry_resources.jsonl");
                m365262.mo23552();
                if (!m36526.mo23551(m365262)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15972.m37753();
            } finally {
            }
        } catch (Throwable th) {
            m36526.mo23552();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9813(C23326 c23326, HashSet hashSet, BufferedWriter bufferedWriter) {
        InterfaceC1454 value;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (InterfaceC4277 interfaceC4277 : c23326.mo21936()) {
            if (hashSet3.add(Integer.valueOf(interfaceC4277.mo12858()))) {
                HashSet hashSet4 = new HashSet();
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (hashSet4.add(Integer.valueOf(interfaceC0748.mo2870()))) {
                        String typeName = interfaceC0748.getTypeName();
                        if (!"string".equals(typeName) && !"array".equals(typeName) && !"plurals".equals(typeName) && !"style".equals(typeName) && !"attr".equals(typeName) && !"id".equals(typeName)) {
                            Iterator it = interfaceC0748.mo2872().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC21211 interfaceC21211 : ((InterfaceC7099) it.next()).mo18746()) {
                                    if (!interfaceC21211.mo29412() && (value = interfaceC21211.getValue()) != null && value.mo5004() == 3 && value.mo5008() != null) {
                                        String value2 = value.mo5008().getValue();
                                        if (!value2.endsWith("/") && hashSet.contains(value2) && hashSet2.add(value2)) {
                                            bufferedWriter.write(JSON.object().add(Entry.DEFAULT_NAME, value2).add("resourceId", C9042.m23294(interfaceC21211.mo47884())).add("resourceName", interfaceC0748.getTypeName() + "/" + interfaceC21211.mo29406()).toString());
                                            bufferedWriter.newLine();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9811(AbstractC15440 abstractC15440, C19626 c19626, Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C13874 c13874 = (C13874) it.next();
            if (!c13874.f41355.endsWith("/")) {
                hashSet.add(c13874.f41355);
            }
        }
        try {
            m9812(abstractC15440, c19626.m45090(), hashSet);
        } catch (RuntimeException | C3059 unused) {
            abstractC15440.m36508();
            AbstractC15440 m36526 = abstractC15440.m36526(".entry_resources.jsonl.tmp");
            m36526.mo23552();
            try {
                new BufferedWriter(new OutputStreamWriter(m36526.mo23555(false), StandardCharsets.UTF_8)).close();
                AbstractC15440 m365262 = abstractC15440.m36526("entry_resources.jsonl");
                m365262.mo23552();
                if (!m36526.mo23551(m365262)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15972.m37753();
            } catch (Throwable th) {
                m36526.mo23552();
                throw th;
            }
        }
    }
}
