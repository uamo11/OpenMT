package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;

/* compiled from: P77N */
/* renamed from: l.ܺ۟᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C15799 {

    /* renamed from: ۜۡܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f48730;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final RuntimeException f48731;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11691 f48732;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f48733;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m37407(C14852 c14852, String str, String str2, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28580(c14852, str2, false, c15923).f47942;
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        C10340 c10340 = (C10340) m37275(m37375, c15923).get(str2);
        if (c10340 != null) {
            return m37398(m37357(m37375, c10340));
        }
        if (m37356(m37375, str2) != null) {
            throw C18081.m42146(c14852.f45300, str);
        }
        return this.f48732.m28580(c14852, str2, false, c15923).f47942;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37409(C14852 c14852, String str, boolean z, C15923 c15923) {
        if (m37396(str)) {
            return c14852.f45314;
        }
        if (!z) {
            m37383(c14852, str, c15923);
        }
        C7517 m37291 = m37291(c14852, str, m37375(c14852, str), c15923);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = c14852.f45314.iterator();
        while (it.hasNext()) {
            C17667 c17667 = (C17667) it.next();
            if (!m37291.f23129.contains(c17667.f54033) && !m37291.f23133.containsKey(c17667.f54033)) {
                arrayList.add(c17667);
                hashSet.add(c17667.f54033);
            }
        }
        for (C10340 c10340 : m37291.f23131.values()) {
            if (!m37291.f23129.contains(c10340.f31138) && hashSet.add(c10340.f31138)) {
                arrayList.add(new C17667(c10340.f31140, -1, -1, c10340.f31138));
            }
        }
        C6083.sort(arrayList, C8200.comparing(new C19694(3)));
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C5184 m37411(C14852 c14852, C20498 c20498, C15923 c15923) {
        AbstractC15440 m37375 = m37375(c14852, c20498.f66068);
        if ("smali_class".equals(c20498.f66070)) {
            return m37354(c14852, m37375, c20498);
        }
        if ("smali_method".equals(c20498.f66070)) {
            return m37289(c14852, m37375, c20498, c15923);
        }
        if (!"axml".equals(c20498.f66070) && !"zip_entry".equals(c20498.f66070)) {
            throw m37378(c20498.f66070);
        }
        return m37288(c14852, m37375, c20498);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C5889 m37412(C14852 c14852, C15557 c15557) {
        C22946 m19953;
        try {
            AbstractC15440 m37375 = m37375(c14852, c15557.f47956);
            m19953 = C7424.m19953(this.f48733.m25979(c14852, this, c15557.f47956), c15557);
            ArrayList arrayList = new ArrayList();
            Iterator it = m19953.f73926.iterator();
            while (it.hasNext()) {
                C4103 c4103 = (C4103) it.next();
                arrayList.add(new C13866(C14460.m34531(c4103.f13046), c4103));
            }
            this.f48733.m25978(c14852.f45300, c15557.f47956);
            try {
                m37315(m37375, arrayList);
                C1944.m6404(m37375);
            } catch (IOException e) {
                throw m37279(e);
            }
        } catch (C3059 e2) {
            e2.f9609.put("workspaceId", c14852.f45300).put("editSessionId", c15557.f47956);
            throw e2;
        }
        return new C5889(c14852.f45300, c15557.f47956, m19953.f73927);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C9126 m37415(C14852 c14852, C6595 c6595, OutputStream outputStream) {
        long m37262;
        String str = c6595.f20312;
        m37401(str);
        m37404(c14852, c6595.f20311, str);
        C2579 m37387 = m37387(c14852, c6595.f20311, str);
        String str2 = c6595.f20311;
        if (m37387.f8163) {
            throw m37284(c14852, str2, str, "directory");
        }
        if (m37387.f8162) {
            throw m37284(c14852, str2, str, "axml_entry");
        }
        if (m37396(str2)) {
            if (m37387.f8164) {
                long m372622 = m37262(c14852, c6595.f20311, str, outputStream);
                return new C9126(c14852.f45300, c6595.f20311, str, m372622, null);
            }
            String str3 = c6595.f20311;
            C3059 m9363 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m37307(m9363, c14852, str3, str);
            throw m9363;
        }
        AbstractC15440 m37375 = m37375(c14852, c6595.f20311);
        if (m37374(m37375).contains(str)) {
            String str4 = c6595.f20311;
            C3059 m93632 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m37307(m93632, c14852, str4, str);
            throw m93632;
        }
        C12456 c12456 = (C12456) m37386(m37375).get(str);
        int i = m37397(m37375).f69437;
        if (c12456 != null) {
            String str5 = c6595.f20311;
            AbstractC15440 m36526 = m37369(m37375).m36526(C18747.m43415(str)).m36526("data.bin");
            if ("axml".equals(c12456.f37462) || m37328(m36526, m37257(m36526))) {
                throw m37284(c14852, str5, str, "axml_entry");
            }
            String str6 = c6595.f20311;
            AbstractC15440 m365262 = m37369(m37375).m36526(C18747.m43415(str)).m36526("data.bin");
            m37257(m365262);
            try {
                try {
                    m37262 = m37261(c14852, str6, str, m365262.mo27926(), outputStream);
                } catch (RuntimeException e) {
                    if (m37367(e)) {
                        throw m37283(c14852, str6, str, e);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                throw m37283(c14852, str6, str, e2);
            }
        } else {
            if (!m37387.f8164) {
                String str7 = c6595.f20311;
                C3059 m93633 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                m37307(m93633, c14852, str7, str);
                throw m93633;
            }
            m37262 = m37262(c14852, c6595.f20311, str, outputStream);
        }
        String str8 = c6595.f20311;
        Integer valueOf = Integer.valueOf(i);
        return new C9126(c14852.f45300, str8, str, m37262, valueOf);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12239 m37417(C14852 c14852, C7797 c7797) {
        AbstractC15440 m37375 = m37375(c14852, c7797.f24092);
        if (m37374(m37375).contains(c7797.f24093)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(m37375).get(c7797.f24093);
        ArrayList arrayList = new ArrayList(c7797.f24094);
        C6083.sort(arrayList, C8200.comparingInt(new C6378()));
        m37360(arrayList);
        m37310(c14852, m37375, c12456, c7797.f24093);
        if (c12456 == null || !"zip_entry".equals(c12456.f37462)) {
            return m37294(c14852, m37375, c7797, arrayList);
        }
        return m37295(m37375, c7797, arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C17675 m37418(C14852 c14852, String str, String str2) {
        C11418 c11418;
        c11418 = new C11418();
        m37422(c14852, str, str2, c11418);
        return new C17675(c11418.toString(), "full_source", false, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C18590 m37419(C14852 c14852, String str) {
        AbstractC15440 m37375;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList m37274;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList m37374;
        String str2;
        m37375 = m37375(c14852, str);
        m37259(c14852, m37375, (C15923) null);
        C21412 m37339 = m37339(c14852, str);
        if (m37339.f68960 > 0) {
            throw m37285(c14852, str, m37339);
        }
        ArrayList arrayList6 = new ArrayList(m37348(m37375).values());
        C6083.sort(arrayList6, C15254.thenComparing(C8200.comparing(new C7789()), new C1873()));
        arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            C10340 c10340 = (C10340) it.next();
            String m43415 = C18747.m43415(m37398(m37357(m37375, c10340)));
            C18807 m37358 = m37358(m37375, c10340, m43415);
            if (m37358 == null) {
                throw m37285(c14852, str, m37339(c14852, str));
            }
            arrayList.add(new C2362(c10340.f31139, c10340.f31140, m37358.f59353, m43415));
            hashSet.add(c10340.f31140);
        }
        arrayList2 = new ArrayList();
        Iterator it2 = m37344(m37375).iterator();
        while (it2.hasNext()) {
            C15277 c15277 = (C15277) it2.next();
            String str3 = c15277.f46871;
            if (str3 == null || (str2 = c15277.f46872) == null) {
                throw m37277();
            }
            arrayList2.add(new C8712(str3, str2));
            hashSet.add(c15277.f46872);
        }
        C6083.sort(arrayList2, C15254.thenComparing(C8200.comparing(new C4563(3)), new C7680(3)));
        arrayList3 = new ArrayList(hashSet);
        C6083.sort(arrayList3, C18373.m42805());
        m37274 = m37274(c14852, m37375);
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        Iterator it3 = m37274.iterator();
        while (it3.hasNext()) {
            C15766 c15766 = (C15766) it3.next();
            if (c15766.f48604) {
                arrayList5.add(c15766.f48603);
            } else {
                arrayList4.add(c15766.f48603);
            }
        }
        m37374 = m37374(m37375);
        C6083.sort(arrayList4, new C14970());
        C6083.sort(arrayList5, new C14970());
        C6083.sort(m37374, new C14970());
        return new C18590(str, m37397(m37375).f69437, m37375.m36526("cache").m36526("dex_build"), arrayList, arrayList2, arrayList3, m37274, arrayList4, arrayList5, m37374);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native synchronized C21412 m37420(C14852 c14852);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C21412 m37421(C14852 c14852, C6386 c6386, C15923 c15923) {
        AbstractC15440 m37375 = m37375(c14852, c6386.f19750);
        if ("smali_class".equals(c6386.f19755)) {
            return m37303(c14852, m37375, c6386, c15923);
        }
        if ("smali_method".equals(c6386.f19755)) {
            return m37359(c14852, m37375, c6386, c15923);
        }
        if (!"axml".equals(c6386.f19755) && !"zip_entry".equals(c6386.f19755)) {
            throw m37378(c6386.f19755);
        }
        return m37302(c14852, m37375, c6386);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m37422(C14852 c14852, String str, String str2, C11418 c11418) {
        c11418.m28185(0);
        if (!m37396(str)) {
            AbstractC15440 m37375 = m37375(c14852, str);
            C13161 m37355 = m37355(c14852, m37375, str2);
            if (m37355.f39350 || "missing".equals(m37355.f39351)) {
                throw m37351();
            }
            if (!"axml".equals(m37355.f39351)) {
                throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if (((C12456) m37386(m37375).get(str2)) != null) {
                m37320(m37369(m37375).m36526(C18747.m43415(str2)).m36526("text.xml"), c11418);
                return;
            }
        }
        m37361(c14852, str, str2, c11418);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m37424(C14852 c14852, String str) {
        if (m37396(str)) {
            return 0;
        }
        return m37397(m37375(c14852, str)).f69437;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C1689 m37425(C14852 c14852, String str, C15923 c15923) {
        if (m37396(str)) {
            return new C1689(new ArrayList(c14852.f45308), new HashMap(), new HashSet());
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        C7517 m37291 = m37291(c14852, str, m37375, c15923);
        ArrayList m37273 = m37273(c14852, m37291);
        HashMap hashMap = new HashMap();
        for (C10340 c10340 : m37291.f23133.values()) {
            hashMap.put(c10340.f31138, m37357(m37375, c10340));
        }
        return new C1689(m37273, hashMap, new HashSet(m37291.f23129));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37426(C14852 c14852, String str, C17667 c17667, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28579(c14852, c17667, c15923);
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        C7517 m37291 = m37291(c14852, str, m37375, c15923);
        C10340 c10340 = (C10340) m37291.f23133.get(c17667.f54033);
        if (c10340 == null) {
            if (m37291.f23129.contains(c17667.f54033)) {
                throw C18081.m42146(c14852.f45300, str);
            }
            return this.f48732.m28579(c14852, c17667, c15923);
        }
        String m37398 = m37398(m37357(m37375, c10340));
        String m43415 = C18747.m43415(m37398);
        C18807 m37358 = m37358(m37375, c10340, m43415);
        if (m37358 != null) {
            return m37358.f59353;
        }
        m37258(c14852, m37375, c10340, m37398);
        C18807 m373582 = m37358(m37375, c10340, m43415);
        if (m373582 == null) {
            throw m37285(c14852, str, m37339(c14852, str));
        }
        return m373582.f59353;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C15549 m37427(C14852 c14852, String str, String str2, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28580(c14852, str2, true, c15923);
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        C10340 c10340 = (C10340) m37275(m37375, c15923).get(str2);
        if (c10340 == null) {
            if (m37356(m37375, str2) != null) {
                throw C18081.m42146(c14852.f45300, str);
            }
            return this.f48732.m28580(c14852, str2, true, c15923);
        }
        String m37398 = m37398(m37357(m37375, c10340));
        C7980 m37414 = m37414(c14852, str, new C17667(c10340.f31140, -1, -1, c10340.f31138), c15923);
        return new C15549(m37398, C8751.m22648(m37414), C8751.m22639(m37414));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C17675 m37428(C14852 c14852, String str, String str2) {
        if (!m37396(str)) {
            AbstractC15440 m37375 = m37375(c14852, str);
            if (m37374(m37375).contains(str2)) {
                throw m37351();
            }
            C12456 c12456 = (C12456) m37386(m37375).get(str2);
            if (c12456 != null) {
                if ("axml".equals(c12456.f37462)) {
                    throw C18081.m42156(c14852.f45300, str, str2);
                }
                try {
                    InputStream mo27926 = m37369(m37375).m36526(C18747.m43415(str2)).m36526("data.bin").mo27926();
                    try {
                        byte[] m37332 = m37332(mo27926, 10485776);
                        C17675 m37298 = m37298(c14852, str, str2, m37332, m37332.length > 10485760);
                        if (mo27926 != null) {
                            mo27926.close();
                        }
                        return m37298;
                    } catch (Throwable th) {
                        if (mo27926 != null) {
                            try {
                                mo27926.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m37279(e);
                }
            }
        }
        return m37370(c14852, str, str2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37429(C14852 c14852, String str) {
        if (m37396(str)) {
            return new ArrayList();
        }
        return m37350(c14852, m37375(c14852, str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37430(C14852 c14852, String str) {
        if (m37396(str)) {
            return c14852.f45312;
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        HashSet hashSet = new HashSet(m37374(m37375));
        HashMap m37386 = m37386(m37375);
        boolean isEmpty = m37350(c14852, m37375).isEmpty();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        Iterator it = c14852.f45312.iterator();
        while (it.hasNext()) {
            C13874 c13874 = (C13874) it.next();
            hashSet2.add(c13874.f41355);
            if (!hashSet.contains(c13874.f41355)) {
                C12456 c12456 = (C12456) m37386.get(c13874.f41355);
                if (c12456 != null) {
                    arrayList.add(C13874.m33235(c13874.f41355, m37266(m37375, c12456)));
                } else if (isEmpty || !"resources.arsc".equals(c13874.f41355)) {
                    arrayList.add(c13874);
                } else {
                    arrayList.add(C13874.m33235(c13874.f41355, null));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C12456 c124562 : m37386.values()) {
            if (!hashSet2.contains(c124562.f37460) && !hashSet.contains(c124562.f37460)) {
                arrayList2.add(c124562);
            }
        }
        C6083.sort(arrayList2, C8200.comparing(new C18101()));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C12456 c124563 = (C12456) it2.next();
            arrayList.add(C13874.m33235(c124563.f37460, m37266(m37375, c124563)));
        }
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C4695 m37431(C14852 c14852, String str, String str2) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        if (m37396(str)) {
            return null;
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        if (m37374(m37375).contains(str2)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(m37375).get(str2);
        if (c12456 == null) {
            return null;
        }
        if ("zip_entry".equals(c12456.f37462)) {
            try {
                return new C4695(m37369(m37375).m36526(C18747.m43415(str2)).m36526("data.bin").m36506());
            } catch (IOException e) {
                throw m37279(e);
            }
        }
        String m37398 = m37398(m37369(m37375).m36526(C18747.m43415(str2)).m36526("text.xml"));
        String m43415 = C18747.m43415(m37398);
        C3990 m37379 = m37379(m37375, str2, m43415);
        if (m37379 != null) {
            return new C4695(m37379.f12653);
        }
        C0461 m37276 = m37276(c14852, m37375.getName(), str2, m37398, m43415);
        C0244 c0244 = m37276.f2026;
        if (c0244 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c0244);
            throw m37286(c14852, str, true, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed for saved edit session overlay.", m37264(arrayList), (String) null, (String) null);
        }
        try {
            m37314(m37375, str2, m37276.f2025);
            return new C4695(m37276.f2025.f65408);
        } catch (IOException e2) {
            throw m37279(e2);
        }
        throw th;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C4695 m37432(C14852 c14852, String str) {
        if (m37396(str)) {
            return null;
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        ArrayList m37350 = m37350(c14852, m37375);
        if (m37350.isEmpty()) {
            return null;
        }
        return new C4695(m37335(c14852, m37375, m37350));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized HashMap m37433(C14852 c14852, String str) {
        HashMap hashMap = new HashMap();
        if (m37396(str)) {
            return hashMap;
        }
        for (C12456 c12456 : m37386(m37375(c14852, str)).values()) {
            hashMap.put(c12456.f37460, c12456.f37462);
        }
        return hashMap;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3284 m37434(C14852 c14852, String str, String str2) {
        if (m37396(str)) {
            return null;
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        if (m37374(m37375).contains(str2)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(m37375).get(str2);
        if (c12456 != null && "zip_entry".equals(c12456.f37462)) {
            AbstractC15440 m36526 = m37369(m37375).m36526(C18747.m43415(str2)).m36526("data.bin");
            if (!m36526.mo23119()) {
                throw m37279(new IOException("ZIP entry overlay data is missing"));
            }
            return new C3284(m36526);
        }
        return null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37423(C14852 c14852, String str) {
        if (m37396(str)) {
            return;
        }
        try {
            AbstractC15440 m37375 = m37375(c14852, str);
            C21629 m37397 = m37397(m37375);
            int i = m37397.f69437;
            m37366(m37375.m36526("state.json"), JSON.object().add("revision", i).add("createdAt", m37397.f69436).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        } catch (IOException | RuntimeException | C3059 e) {
            C19926.m45879("MT MCP edit session build touch failed, workspaceId=" + c14852.f45300 + ", editSessionId=" + str, e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C2070 m37410(C14852 c14852, C12736 c12736) {
        C16096 c16096;
        C16096 c160962;
        C4103 m12327;
        try {
            AbstractC15440 m37375 = m37375(c14852, c12736.f38302);
            C15390 m33437 = C13979.m33437(this.f48733.m25979(c14852, this, c12736.f38302), m37272(c12736));
            C16096 c160963 = m33437.f47124;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                Iterator it = m37429(c14852, c12736.f38302).iterator();
                while (it.hasNext()) {
                    C4103 c4103 = (C4103) it.next();
                    hashMap.put(c4103.f13038, c4103);
                }
                Iterator it2 = m33437.f47125.iterator();
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    C3397 c3397 = (C3397) it2.next();
                    boolean equals = c3397.f10758.equals(c3397.f10757);
                    Iterator it3 = it2;
                    c160962 = c160963;
                    try {
                        arrayList.add(new C7300(c3397.f10756, c3397.f10755, c3397.f10759, c3397.f10758, !equals));
                        if (equals) {
                            i2++;
                        } else {
                            i++;
                            int parseLong = (int) Long.parseLong(c3397.f10755.substring(2), 16);
                            if (c3397.f10758.equals(c3397.f10753)) {
                                arrayList2.add(new C13866(C14460.m34531(C4103.m12323(parseLong, c3397.f10759)), null));
                            } else {
                                C4103 c41032 = (C4103) hashMap.get(C14460.m34531(C4103.m12323(parseLong, c3397.f10759)));
                                if (c41032 == null) {
                                    m12327 = C4103.m12325(parseLong, c3397.f10759, c3397.f10757, c3397.f10758, c3397.f10754);
                                } else {
                                    m12327 = c41032.m12327(c3397.f10757, c3397.f10754, c3397.f10758);
                                }
                                arrayList2.add(new C13866(C14460.m34531(m12327.f13046), m12327));
                            }
                        }
                        it2 = it3;
                        c160963 = c160962;
                    } catch (C3059 e) {
                        e = e;
                        c16096 = c160962;
                        m37306(e, c14852.f45300, c12736, c16096);
                        throw e;
                    }
                }
                if (i == 0) {
                    return new C2070(c14852.f45300, c12736.f38302, false, 0, i2, arrayList);
                }
                try {
                    this.f48733.m25978(c14852.f45300, c12736.f38302);
                    m37315(m37375, arrayList2);
                    C1944.m6404(m37375);
                    return new C2070(c14852.f45300, c12736.f38302, true, i, i2, arrayList);
                } catch (IOException e2) {
                    throw m37279(e2);
                }
            } catch (C3059 e3) {
                e = e3;
                c160962 = c160963;
            }
        } catch (C3059 e4) {
            e = e4;
            c16096 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:50:0x0136, B:52:0x013a, B:53:0x01ea, B:78:0x0190, B:80:0x0196, B:82:0x019f, B:85:0x01a6, B:86:0x01b8, B:88:0x01be, B:89:0x01c4, B:90:0x01c5, B:91:0x01c9, B:92:0x01ca, B:60:0x01d2, B:63:0x01d9, B:64:0x01fe, B:66:0x0204, B:68:0x0208, B:73:0x021a, B:72:0x0216, B:74:0x021b, B:75:0x0221, B:101:0x0225, B:103:0x022b, B:104:0x0231, B:105:0x0232, B:106:0x0234, B:142:0x024a, B:96:0x014a, B:97:0x0151, B:98:0x0152, B:99:0x015c, B:136:0x0235, B:137:0x023d, B:138:0x023e, B:139:0x0246), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:50:0x0136, B:52:0x013a, B:53:0x01ea, B:78:0x0190, B:80:0x0196, B:82:0x019f, B:85:0x01a6, B:86:0x01b8, B:88:0x01be, B:89:0x01c4, B:90:0x01c5, B:91:0x01c9, B:92:0x01ca, B:60:0x01d2, B:63:0x01d9, B:64:0x01fe, B:66:0x0204, B:68:0x0208, B:73:0x021a, B:72:0x0216, B:74:0x021b, B:75:0x0221, B:101:0x0225, B:103:0x022b, B:104:0x0231, B:105:0x0232, B:106:0x0234, B:142:0x024a, B:96:0x014a, B:97:0x0151, B:98:0x0152, B:99:0x015c, B:136:0x0235, B:137:0x023d, B:138:0x023e, B:139:0x0246), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021b A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:50:0x0136, B:52:0x013a, B:53:0x01ea, B:78:0x0190, B:80:0x0196, B:82:0x019f, B:85:0x01a6, B:86:0x01b8, B:88:0x01be, B:89:0x01c4, B:90:0x01c5, B:91:0x01c9, B:92:0x01ca, B:60:0x01d2, B:63:0x01d9, B:64:0x01fe, B:66:0x0204, B:68:0x0208, B:73:0x021a, B:72:0x0216, B:74:0x021b, B:75:0x0221, B:101:0x0225, B:103:0x022b, B:104:0x0231, B:105:0x0232, B:106:0x0234, B:142:0x024a, B:96:0x014a, B:97:0x0151, B:98:0x0152, B:99:0x015c, B:136:0x0235, B:137:0x023d, B:138:0x023e, B:139:0x0246), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:50:0x0136, B:52:0x013a, B:53:0x01ea, B:78:0x0190, B:80:0x0196, B:82:0x019f, B:85:0x01a6, B:86:0x01b8, B:88:0x01be, B:89:0x01c4, B:90:0x01c5, B:91:0x01c9, B:92:0x01ca, B:60:0x01d2, B:63:0x01d9, B:64:0x01fe, B:66:0x0204, B:68:0x0208, B:73:0x021a, B:72:0x0216, B:74:0x021b, B:75:0x0221, B:101:0x0225, B:103:0x022b, B:104:0x0231, B:105:0x0232, B:106:0x0234, B:142:0x024a, B:96:0x014a, B:97:0x0151, B:98:0x0152, B:99:0x015c, B:136:0x0235, B:137:0x023d, B:138:0x023e, B:139:0x0246), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:50:0x0136, B:52:0x013a, B:53:0x01ea, B:78:0x0190, B:80:0x0196, B:82:0x019f, B:85:0x01a6, B:86:0x01b8, B:88:0x01be, B:89:0x01c4, B:90:0x01c5, B:91:0x01c9, B:92:0x01ca, B:60:0x01d2, B:63:0x01d9, B:64:0x01fe, B:66:0x0204, B:68:0x0208, B:73:0x021a, B:72:0x0216, B:74:0x021b, B:75:0x0221, B:101:0x0225, B:103:0x022b, B:104:0x0231, B:105:0x0232, B:106:0x0234, B:142:0x024a, B:96:0x014a, B:97:0x0151, B:98:0x0152, B:99:0x015c, B:136:0x0235, B:137:0x023d, B:138:0x023e, B:139:0x0246), top: B:3:0x000d }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C9126 m37416(l.C14852 r19, l.C20707 r20, l.InterfaceC19087 r21) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15799.m37416(l.ܳ᩻ۜ, l.᩷ۜۜ, l.ᩴ᩻ۜ):l.ۡ᩷ۜ");
    }

    static {
        ApplicationC12518.m30701(119);
        f48730 = new short[]{1355, -3613, -3608, -3679, -3606, -3601, -3590, -3601, -3679, -3605, -3606, -3609, -3590, -3631, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3587, -3637, -3638, -3641, -3622, -3631, -3619, -3637, -3619, -3619, -3641, -3647, -3648, -3631, -3635, -3620, -3637, -3633, -3622, -3637, -3631, -3640, -3633, -3641, -3646, -3637, -3638, -3621, -3616, -3601, -3604, -3614, -3605, -3666, -3590, -3615, -3666, -3601, -3614, -3614, -3615, -3603, -3601, -3590, -3605, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3609, -3606, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661};
        f48731 = new RuntimeException();
    }

    public C15799(C11691 c11691, C10247 c10247, C9915 c9915) {
        this.f48732 = c11691;
        this.f48733 = c10247;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m37396(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m37402(AbstractC15440 abstractC15440) {
        long currentTimeMillis = System.currentTimeMillis();
        abstractC15440.m36508();
        abstractC15440.m36526("overlay").m36526("dex").m36508();
        m37369(abstractC15440).m36508();
        abstractC15440.m36526("overlay").m36526("resource_value").m36508();
        abstractC15440.m36526("cache").m36526("dex").m36508();
        abstractC15440.m36526("cache").m36526(Entry.DEFAULT_NAME).m36508();
        abstractC15440.m36526("cache").m36526("dex_build").m36508();
        abstractC15440.m36526("deleted").m36508();
        abstractC15440.m36526("failures").m36508();
        m37385(abstractC15440, new ArrayList());
        m37394(abstractC15440, new ArrayList());
        m37372(abstractC15440, new ArrayList());
        m37389(abstractC15440, new ArrayList());
        m37366(abstractC15440.m36526("state.json"), JSON.object().add("revision", 0).add("createdAt", currentTimeMillis).add("lastAccessedAt", currentTimeMillis).toString().getBytes(StandardCharsets.UTF_8), ".state");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37391(AbstractC15440 abstractC15440) {
        ArrayList arrayList = new ArrayList();
        if (abstractC15440.mo23113()) {
            for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
                if (abstractC154402.mo23113() && !abstractC154402.m36533() && m37406(abstractC154402.getName())) {
                    arrayList.add(new C22334(m37340(abstractC154402), abstractC154402, abstractC154402.getName()));
                }
            }
        }
        C6083.sort(arrayList, C15254.thenComparing(C8200.comparingLong(new C23745()), new C6812()));
        int size = arrayList.size() - 9;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C22334) arrayList.get(i)).f72389);
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37309(C14852 c14852, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            this.f48733.m25978(c14852.f45300, abstractC15440.getName());
            if (abstractC15440.mo23120()) {
                m37384(abstractC15440);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37384(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m37384((AbstractC15440) it.next());
                }
            }
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m37272(C12736 c12736) {
        ArrayList arrayList = c12736.f38303;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C13441 c13441 = (C13441) arrayList.get(i);
            arrayList2.add(new C4808(i, c13441.f40161, c13441.f40164, c13441.f40162, c13441.f40163));
        }
        return arrayList2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37360(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        C14146 c14146 = null;
        while (it.hasNext()) {
            C14146 c141462 = (C14146) it.next();
            if (c14146 != null && c14146.m33757() > c141462.f42694) {
                long j = c14146.f42694;
                throw C3059.m9365("PATCH_OVERLAP", "Patch ranges must not overlap.", "warning", JSON.array(), JSON.object().add("firstRange", JSON.object().add("byteOffset", j).add("endByteOffset", c14146.m33757())).add("secondRange", JSON.object().add("byteOffset", c141462.f42694).add("endByteOffset", c141462.m33757())));
            }
            c14146 = c141462;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37310(C14852 c14852, AbstractC15440 abstractC15440, C12456 c12456, String str) {
        if ("resources.arsc".equals(str)) {
            throw m37280(str, "resources_arsc");
        }
        if (c14852.f45307.contains(str) || str.toLowerCase(Locale.ROOT).endsWith(".dex")) {
            throw m37280(str, "dex_entry");
        }
        if (c12456 != null && "axml".equals(c12456.f37462)) {
            throw m37280(str, "axml_entry");
        }
        if (c12456 != null && !"zip_entry".equals(c12456.f37462)) {
            throw m37280(str, "not_raw_zip_entry");
        }
        if (c12456 != null && !m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin").mo23119()) {
            throw m37280(str, "not_raw_zip_entry");
        }
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                if (entry == null) {
                    if (c12456 == null) {
                        throw m37351();
                    }
                } else {
                    if (entry.isDirectory()) {
                        throw m37280(str, "directory");
                    }
                    if (m37327(c14852, c18090, entry, str)) {
                        throw m37280(str, "axml_entry");
                    }
                }
                c18090.close();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m37279(new IOException("Failed to inspect ZIP entry for patch.", e2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12239 m37295(AbstractC15440 abstractC15440, C7797 c7797, ArrayList arrayList) {
        String str = c7797.f24093;
        AbstractC15440 m36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin");
        long mo23127 = m36526.mo23127();
        m37304(arrayList, mo23127);
        ArrayList arrayList2 = new ArrayList();
        try {
            C23411 m36513 = m36526.m36513("rw");
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C14146 c14146 = (C14146) it.next();
                    byte[] bArr = c14146.f42695;
                    int i = c14146.f42694;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    m36513.seek(i);
                    m36513.m51858(bArr2, 0, length);
                    if (!Arrays.equals(bArr2, c14146.f42695)) {
                        throw m37282(c7797, c14146, bArr2);
                    }
                    arrayList2.add(new C11751(i, bArr2, c14146.f42696));
                }
                m36513.close();
                try {
                    m37405(m36526, arrayList2);
                    AbstractC15440 m37381 = m37381(abstractC15440, str);
                    if (m37381.mo23120()) {
                        m37381.mo23552();
                    }
                    m37371(abstractC15440, str);
                    ArrayList m37374 = m37374(abstractC15440);
                    m37374.remove(str);
                    m37394(abstractC15440, m37374);
                    m37260(abstractC15440, m37397(abstractC15440));
                    return m37293(c7797, mo23127, arrayList2, m37397(abstractC15440).f69437);
                } catch (Exception e) {
                    IOException iOException = new IOException("Failed to patch ZIP entry overlay.", e);
                    try {
                        m37364(m36526, arrayList2);
                    } catch (IOException e2) {
                        iOException.addSuppressed(e2);
                    }
                    throw m37279(iOException);
                }
            } finally {
            }
        } catch (C3059 e3) {
            throw e3;
        } catch (Exception e4) {
            throw m37279(new IOException("Failed to read ZIP entry overlay for patch.", e4));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12239 m37294(C14852 c14852, AbstractC15440 abstractC15440, C7797 c7797, ArrayList arrayList) {
        C8745 c8745;
        String str = c7797.f24093;
        try {
            c8745 = m37380(c14852, abstractC15440, str);
        } catch (C3059 e) {
            String str2 = e.f9610;
            if (!"NOT_TEXT_ENTRY".equals(str2) && !"ENTRY_TEXT_TOO_LARGE".equals(str2)) {
                throw e;
            }
            c8745 = new C8745(C14776.f45134, "lf");
        }
        AbstractC15440 m36535 = abstractC15440.m36535(".patch_bytes");
        try {
            try {
                try {
                    C18090 c18090 = new C18090(c14852.m35253());
                    try {
                        C3545 entry = c18090.getEntry(str);
                        if (entry == null) {
                            throw m37351();
                        }
                        long size = entry.getSize();
                        if (size >= 0) {
                            m37304(arrayList, size);
                        }
                        m36535.mo35195();
                        InputStream m42189 = c18090.m42189(entry);
                        try {
                            OutputStream mo23555 = m36535.mo23555(false);
                            try {
                                C6106 m37290 = m37290(m42189, mo23555, c7797, arrayList);
                                ArrayList arrayList2 = m37290.f18724;
                                long j = m37290.f18723;
                                if (mo23555 != null) {
                                    mo23555.close();
                                }
                                m42189.close();
                                if (size < 0) {
                                    m37304(arrayList, j);
                                }
                                m37313(abstractC15440, str, m36535, c8745);
                                c18090.close();
                                m37363(m36535);
                                return m37293(c7797, j, arrayList2, m37397(abstractC15440).f69437);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            c18090.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    m37363(m36535);
                    throw th3;
                }
            } catch (C3059 e2) {
                m37363(m36535);
                throw e2;
            }
        } catch (Exception e3) {
            m37363(m36535);
            throw m37279(new IOException("Failed to patch ZIP entry.", e3));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37304(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14146 c14146 = (C14146) it.next();
            long m33757 = c14146.m33757();
            long j2 = c14146.f42694;
            if (m33757 < j2 || m33757 > j) {
                throw m37278(j2, m33757, j);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m37405(AbstractC15440 abstractC15440, ArrayList arrayList) {
        C23411 m36513 = abstractC15440.m36513("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11751 c11751 = (C11751) it.next();
                m36513.seek(c11751.f35079);
                m36513.write(c11751.f35077);
            }
            m36513.m51860();
            m36513.close();
        } catch (Throwable th) {
            try {
                m36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37364(AbstractC15440 abstractC15440, ArrayList arrayList) {
        C23411 m36513 = abstractC15440.m36513("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11751 c11751 = (C11751) it.next();
                m36513.seek(c11751.f35079);
                byte[] bArr = c11751.f35078;
                m36513.write(bArr, 0, bArr.length);
            }
            m36513.m51860();
            m36513.close();
        } catch (Throwable th) {
            try {
                m36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6106 m37290(InputStream inputStream, OutputStream outputStream, C7797 c7797, ArrayList arrayList) {
        int i = 8192;
        byte[] bArr = new byte[8192];
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C14146 c14146 = (C14146) it.next();
            int i2 = c14146.f42694;
            byte[] bArr2 = c14146.f42696;
            byte[] bArr3 = c14146.f42695;
            long j2 = i2;
            long j3 = j;
            while (j3 < j2) {
                long j4 = i;
                int i3 = i2;
                int read = inputStream.read(bArr, 0, (int) Math.min(j4, j2 - j3));
                if (read < 0) {
                    throw m37278(i3, c14146.m33757(), j3);
                }
                outputStream.write(bArr, 0, read);
                j3 += read;
                i2 = i3;
                i = 8192;
            }
            int i4 = i2;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            int i5 = 0;
            while (i5 < length) {
                int read2 = inputStream.read(bArr4, i5, length - i5);
                if (read2 < 0) {
                    throw m37278(i4, c14146.m33757(), j3 + i5);
                }
                i5 += read2;
            }
            long j5 = j3 + length;
            if (!Arrays.equals(bArr4, bArr3)) {
                throw m37282(c7797, c14146, bArr4);
            }
            outputStream.write(bArr2);
            arrayList2.add(new C11751(i4, bArr4, bArr2));
            i = 8192;
            j = j5;
        }
        while (true) {
            int read3 = inputStream.read(bArr);
            if (read3 < 0) {
                return new C6106(arrayList2, j);
            }
            outputStream.write(bArr, 0, read3);
            j += read3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12239 m37293(C7797 c7797, long j, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C11751 c11751 = (C11751) it.next();
            byte[] bArr = c11751.f35077;
            i2 += bArr.length;
            arrayList2.add(new C12944(c11751.f35079, c11751.f35078, bArr));
        }
        return new C12239(c7797.f24095, c7797.f24092, c7797.f24093, j, i2, i, arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37280(String str, String str2) {
        return C3059.m9365("PATCH_UNSUPPORTED_ENTRY", "ZIP entry cannot be patched as raw bytes.", "fatal", JSON.array(), C7416.m19939("entryName", str, "reason", str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37278(long j, long j2, long j3) {
        return C3059.m9365("PATCH_RANGE_OUT_OF_ENTRY", "Patch range is outside the ZIP entry.", "warning", JSON.array(), JSON.object().add("byteOffset", j).add("endByteOffset", j2).add("entrySize", j3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37282(C7797 c7797, C14146 c14146, byte[] bArr) {
        JSONArray array = JSON.array();
        JSONObject add = JSON.object().add("workspaceId", c7797.f24095).add("editSessionId", c7797.f24092).add("locator", C13169.m31925("zip_entry", c7797.f24093, (String) null, (String) null, (String) null, (String) null));
        int i = c14146.f42694;
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", array.add(C10115.m25398(add.add("byteOffset", i).add("maxBytes", bArr.length), "mt_apk_read_bytes", "retry", "Read actual bytes at the mismatched patch window before retrying mt_apk_patch_bytes.")), JSON.object().add("byteOffset", i).add("expectedHex", m37271(c14146.f42695)).add("actualHex", m37271(bArr)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37271(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37335(C14852 c14852, AbstractC15440 abstractC15440, ArrayList arrayList) {
        if (!c14852.f45301) {
            throw C3059.m9368("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
        }
        C19626 c19626 = c14852.f45291;
        if (c19626 == null) {
            String str = c14852.f45295;
            if (str == null) {
                str = "Failed to parse resources.arsc";
            }
            throw C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", str);
        }
        byte[] m12324 = C4103.m12324(arrayList, c19626.m45089());
        try {
            byte[] m6406 = C1944.m6406(abstractC15440, m12324);
            if (m6406 != null) {
                return m6406;
            }
            C9028 m23276 = C9028.m23276(c19626.m45090(), EnumC9734.CREATE);
            Iterator it = C4103.m12318(arrayList).iterator();
            while (it.hasNext()) {
                C23816.m52502(m23276, (C4103) it.next());
            }
            m23276.m23285();
            C10130 c10130 = new C10130((int) Math.min(2147483647L, c19626.m45091() + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
            m23276.m23283(c10130, (C19277) null);
            byte[] m25444 = c10130.m25444();
            try {
                C1944.m6405(abstractC15440, m12324, m25444);
            } catch (IOException unused) {
            }
            return m25444;
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("RESOURCE_COMPILE_FAILED", e2.getMessage() == null ? "Failed to materialize resources.arsc" : e2.getMessage());
        } catch (OutOfMemoryError unused2) {
            throw C18081.m42152();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37366(AbstractC15440 abstractC15440, byte[] bArr, String str) {
        abstractC15440.mo35195();
        AbstractC15440 m36520 = abstractC15440.m36520(str);
        try {
            m36520.m36502(bArr);
            m36520.m36501(abstractC15440, false, true, null);
        } finally {
            m37363(m36520);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37334(C8223 c8223, String str) {
        JSONObject add = JSON.object().add("schemaVersion", 1).add("phase", str).add("targetKind", c8223.f25340).add("target", c8223.f25336);
        String str2 = c8223.f25335;
        return add.add("dexEntryName", str2 == null ? JSON.NULL : JSON.value(str2)).add("overlayExisted", c8223.f25339).add("deletedExisted", c8223.f25334).add("failuresExisted", c8223.f25337).add("stateExisted", c8223.f25338).toString().getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37323(AbstractC15440 abstractC15440, byte[] bArr, String str) {
        abstractC15440.mo35195();
        AbstractC15440 m36520 = abstractC15440.m36520(str);
        try {
            m36520.mo23558().mo8675();
            m36520.m36502(bArr);
            m36520.mo23558().mo8670(abstractC15440);
        } finally {
            m37363(m36520);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37321(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, AbstractC15440 abstractC154403) {
        for (C12619 c12619 : abstractC15440.mo23558().mo8674()) {
            String name = c12619.m30882().getName();
            if (!"transaction.json".equals(name) && !"committed".equals(name)) {
                m37384(c12619.m30882());
            }
        }
        m37384(abstractC154402);
        m37384(abstractC154403);
        if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
            throw new IOException("Unable to delete committed transaction directory");
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8223 m37388(AbstractC15440 abstractC15440, String str) {
        JSONObject asObject = JSON.parse(m37398(abstractC15440)).asObject();
        if (asObject.getInt("schemaVersion", -1) != 1) {
            throw new IOException("Unsupported delete transaction schema");
        }
        String string = asObject.getString("phase", null);
        String string2 = asObject.getString("targetKind", null);
        String string3 = asObject.getString("target", null);
        String string4 = asObject.getString("dexEntryName", null);
        if (!str.equals(string) || ((!"dex".equals(string2) && !Entry.DEFAULT_NAME.equals(string2)) || string3 == null || string3.isEmpty() || ("dex".equals(string2) && (string4 == null || string4.isEmpty())))) {
            throw new IOException("Invalid delete transaction journal");
        }
        C8223 c8223 = new C8223(string2, string3, string4, m37324(asObject, "overlayExisted"));
        c8223.f25334 = m37324(asObject, "deletedExisted");
        c8223.f25337 = m37324(asObject, "failuresExisted");
        c8223.f25338 = m37324(asObject, "stateExisted");
        return c8223;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37324(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw new IOException("Invalid delete transaction boolean field: ".concat(str));
        }
        return jSONValue.asBoolean();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37395(AbstractC15440 abstractC15440, C8223 c8223) {
        AbstractC15440 m37382 = m37382(abstractC15440, c8223);
        AbstractC15440 m36526 = abstractC15440.m36526(".delete_transaction").m36526("overlay.backup");
        if (c8223.f25339) {
            if (!m36526.mo23120()) {
                if (!m37382.mo23120()) {
                    throw new IOException("Delete transaction overlay backup is missing");
                }
                return;
            }
            if (m37382.mo23120()) {
                m37384(m37382);
            }
            m37382.mo35195();
            if (!m36526.mo23551(m37382)) {
                throw new IOException("Unable to restore delete transaction overlay");
            }
            return;
        }
        if (m37382.mo23120()) {
            m37384(m37382);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37322(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, boolean z) {
        if (z) {
            if (!abstractC154402.mo23119()) {
                throw new IOException("Delete transaction backup is missing");
            }
            m37366(abstractC15440, abstractC154402.m36506(), ".delete_restore");
        } else if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
            throw new IOException("Unable to remove delete transaction file");
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m37256(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526(".delete_transaction");
        if (m36526.mo23120()) {
            AbstractC15440 m365262 = abstractC15440.m36526(".delete_transaction").m36526("transaction.json");
            AbstractC15440 m365263 = abstractC15440.m36526(".delete_transaction").m36526("committed");
            if (!m365263.mo23120()) {
                if (!m365262.mo23119()) {
                    try {
                        m37384(m36526);
                        return;
                    } catch (IOException e) {
                        C19926.m45879("MT MCP stale delete transaction directory cleanup failed, editSessionId=" + abstractC15440.getName(), e);
                        return;
                    }
                }
                try {
                    C8223 m37388 = m37388(m365262, "prepared");
                    String str = m37388.f25340;
                    m37395(abstractC15440, m37388);
                    m37322(abstractC15440.m36526("deleted").m36526("dex".equals(str) ? "dex.json" : "entry.json"), m36526.m36526("deleted.backup"), m37388.f25334);
                    m37322(abstractC15440.m36526("failures").m36526("dex".equals(str) ? "dex.json" : "entry.json"), m36526.m36526("failures.backup"), m37388.f25337);
                    m37322(abstractC15440.m36526("state.json"), m36526.m36526("state.backup"), m37388.f25338);
                    m37316(abstractC15440, m37388);
                    m37384(m365262);
                    m37384(m36526);
                    return;
                } catch (C3059 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m37279(e3);
                }
            }
            C8223 c8223 = null;
            try {
                try {
                    if (m365263.mo23119()) {
                        c8223 = m37388(m365263, "committed");
                    }
                } catch (Exception e4) {
                    C19926.m45879("MT MCP committed delete marker is unreadable, editSessionId=" + abstractC15440.getName(), e4);
                }
                if (c8223 == null && m365262.mo23119()) {
                    try {
                        c8223 = m37388(m365262, "prepared");
                    } catch (Exception e5) {
                        C19926.m45879("MT MCP prepared delete journal is unreadable after commit, editSessionId=" + abstractC15440.getName(), e5);
                    }
                }
                if (c8223 == null) {
                    m37384(abstractC15440.m36526("cache"));
                } else {
                    m37316(abstractC15440, c8223);
                }
                m37321(m36526, m365262, m365263);
            } catch (Exception e6) {
                C19926.m45879("MT MCP committed delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e6);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37296(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526(".delete_transaction");
        if (m36526.mo23120()) {
            m37256(abstractC15440);
            if (m36526.mo23120()) {
                throw new IOException("Previous delete transaction cleanup is incomplete");
            }
        }
        m36526.m36508();
        return m36526;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37330(AbstractC15440 abstractC15440, C8223 c8223, Exception exc) {
        AbstractC15440 m36526 = abstractC15440.m36526(".delete_transaction").m36526("committed");
        if (!m36526.mo23120()) {
            return false;
        }
        try {
            C8223 m37388 = m37388(m36526, "committed");
            String str = m37388.f25335;
            if (c8223.f25340.equals(m37388.f25340) && c8223.f25336.equals(m37388.f25336)) {
                String str2 = c8223.f25335;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
            exc.addSuppressed(new IOException("Committed delete marker target mismatch"));
            return true;
        } catch (Exception e) {
            exc.addSuppressed(e);
            return true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37365(AbstractC15440 abstractC15440, C8223 c8223) {
        m37323(abstractC15440.m36526(".delete_transaction").m36526("committed"), m37334(c8223, "committed"), ".delete_commit");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37382(AbstractC15440 abstractC15440, C8223 c8223) {
        String str = c8223.f25340;
        String str2 = c8223.f25336;
        if ("dex".equals(str)) {
            String str3 = c8223.f25335;
            C14844.m35244(str2);
            return abstractC15440.m36526("overlay").m36526("dex").m36526(str3).m36526(C18747.m43415(str2).concat(".smali"));
        }
        return m37369(abstractC15440).m36526(C18747.m43415(str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37316(AbstractC15440 abstractC15440, C8223 c8223) {
        String str = c8223.f25340;
        String str2 = c8223.f25336;
        if ("dex".equals(str)) {
            String str3 = c8223.f25335;
            C14844.m35244(str2);
            m37384(abstractC15440.m36526("cache").m36526("dex").m36526(str3).m36526(C18747.m43415(str2).concat(".bin")));
            return;
        }
        m37384(m37381(abstractC15440, str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37329(AbstractC15440 abstractC15440, Exception exc) {
        try {
            m37256(abstractC15440);
            return true;
        } catch (C3059 e) {
            exc.addSuppressed(e);
            return false;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m37343(AbstractC15440 abstractC15440) {
        try {
            m37256(abstractC15440);
        } catch (IOException e) {
            e = e;
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e2);
        } catch (C3059 e3) {
            e = e3;
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37306(C3059 c3059, String str, C12736 c12736, C16096 c16096) {
        String str2;
        JSONValue value;
        String str3 = c12736.f38302;
        ArrayList arrayList = c12736.f38303;
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray = c3059.f9604;
        int i = jSONObject.getInt("failedEditIndex", -1);
        boolean z = jSONObject.getBoolean("_suppressResourceRetry", false);
        jSONObject.remove("_suppressResourceRetry");
        C13441 c13441 = (i < 0 || i >= arrayList.size()) ? null : (C13441) arrayList.get(i);
        String string = jSONObject.getString("resourceId", c13441 == null ? null : c13441.f40161);
        String string2 = jSONObject.getString("variant", c13441 != null ? c13441.f40164 : null);
        JSONObject put = jSONObject.put("workspaceId", str).put("editSessionId", str3).put("failedEditIndex", i >= 0 ? JSON.value(i) : JSON.NULL);
        if (string == null) {
            value = JSON.NULL;
            str2 = "editSessionId";
        } else {
            str2 = "editSessionId";
            value = JSON.value(C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, string));
        }
        put.put("locator", value).put("variant", string2 == null ? JSON.NULL : JSON.value(string2));
        if (jSONObject.get("resourceNamePolicy") == null || jSONObject.get("resourceNamePolicy").isNull()) {
            jSONObject.put("resourceNamePolicy", c16096 == null ? JSON.NULL : c16096.m37986());
        }
        if (z || jSONArray.size() != 0) {
            return;
        }
        String str4 = c3059.f9610;
        if ((!"STALE_TARGET_VERSION".equals(str4) && !"INVALID_VALUE_XML".equals(str4) && !"UNSUPPORTED_VALUE_XML".equals(str4) && !"UNSUPPORTED_STYLED_TEXT_XML".equals(str4) && !"APP_NAME_REFERENCES_NOT_ACCEPTED".equals(str4) && !"RESOURCE_VARIANT_NOT_FOUND".equals(str4)) || string == null || string2 == null) {
            return;
        }
        jSONArray.add(C10115.m25398(JSON.object().add("workspaceId", str).add(str2, str3).add("reads", JSON.array().add(JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, string)).add("variant", string2))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 2000).add("resolveDepth", 0), "mt_apk_resource_read", "retry", "Re-read the resource value for the latest valueXml/targetVersion or available variants"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37303(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386, C15923 c15923) {
        String m37269;
        ArrayList arrayList = c6386.f19751;
        String str = c6386.f19750;
        String str2 = c6386.f19755;
        if (!"smali_class".equals(str2)) {
            throw C3059.m9364("Invalid targetType", "targetType", JSON.value(str2), JSON.array("smali_class"), JSON.object().add("targetType", "smali_class"));
        }
        String m37341 = m37341(c6386.f19753);
        m37362(c14852, c6386, str, c6386.f19755, m37341, (m37356(abstractC15440, m37341) == null && !(((C10340) m37275(abstractC15440, c15923).get(m37341)) == null && m37346(c14852, m37341) == 0)) ? m37347(C8163.m21638(m37407(c14852, abstractC15440.getName(), m37341, c15923))) : "missing");
        C10620 c10620 = (C10620) arrayList.get(0);
        String str3 = c10620.f31899;
        if ("write_target".equals(str3)) {
            m37269 = C8163.m21638(c10620.f31900);
        } else {
            if (!m37390(str3)) {
                throw C3059.m9364("Invalid mode", "edits[0].mode", JSON.value(str3), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m37356(abstractC15440, m37341) != null) {
                throw C18081.m42146(c14852.f45300, abstractC15440.getName());
            }
            m37269 = m37269(c14852, c6386, abstractC15440.getName(), c6386.f19755, m37341, C8163.m21638(m37407(c14852, abstractC15440.getName(), m37341, c15923)));
        }
        String str4 = m37269;
        String m37347 = m37347(str4);
        String str5 = c6386.f19755;
        arrayList.size();
        return m37301(c14852, abstractC15440, m37341, str4, str, str5, m37341, m37347);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21412 m37359(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386, C15923 c15923) {
        String m37269;
        String str = c14852.f45300;
        String str2 = c6386.f19753;
        ArrayList arrayList = c6386.f19751;
        String str3 = c6386.f19750;
        String m31946 = C13169.m31946(str2);
        String m31992 = C13169.m31992(str2);
        if (m37356(abstractC15440, m31946) != null) {
            throw C18081.m42146(str, str3);
        }
        String m21638 = C8163.m21638(m37407(c14852, str3, m31946, c15923));
        C20490 m10823 = C3556.m10822(m31946, m21638).m10823(m31992);
        if (m10823 == null) {
            throw C18081.m42154(str, str3, m31946);
        }
        int i = m10823.f66056;
        String m21637 = C8163.m21637(i, m10823.f66059, m21638);
        m37362(c14852, c6386, str3, c6386.f19755, c6386.f19753, m37347(m21637));
        C10620 c10620 = (C10620) arrayList.get(0);
        if ("write_target".equals(c10620.f31899)) {
            String m216382 = C8163.m21638(c10620.f31900);
            if (m216382.endsWith("\n")) {
                m216382 = C15472.m36561(1, 0, m216382);
            }
            if (m216382.isEmpty() || m216382.endsWith("\n")) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            String[] split = m216382.split("\n", -1);
            String trim = C3556.m10821(split[0]).trim();
            String trim2 = C3556.m10821(split[split.length - 1]).trim();
            if (!m37373(trim) || !".end method".equals(trim2)) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            int length = split.length;
            String str4 = m216382;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                String[] strArr = split;
                String trim3 = C3556.m10821(split[i2]).trim();
                if (m37373(trim3)) {
                    i3++;
                } else if (".end method".equals(trim3)) {
                    i4++;
                }
                i2++;
                split = strArr;
            }
            if (i3 != 1 || i4 != 1) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            String str5 = C20490.m46950(1, trim).f66062;
            if (str5.indexOf(40) < 0 || !m31992.equals(str5)) {
                throw m37287(c14852, c6386, "Smali .method signature does not match locator target.");
            }
            m37269 = str4;
        } else {
            m37269 = m37269(c14852, c6386, str3, c6386.f19755, c6386.f19753, m21637);
        }
        String m37268 = m37268(m21638, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), m10823.f66059), m37269);
        String m37347 = m37269.isEmpty() ? "missing" : m37347(m37269);
        String str6 = c6386.f19755;
        String str7 = c6386.f19753;
        arrayList.size();
        return m37301(c14852, abstractC15440, m31946, m37268, str3, str6, str7, m37347);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37302(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386) {
        String str;
        String m37269;
        String replace;
        String str2;
        C15923 c15923;
        C14852 c148522;
        String str3;
        String str4;
        String str5;
        String str6;
        C20218 c20218;
        String str7 = c14852.f45300;
        String str8 = c6386.f19753;
        String str9 = c6386.f19750;
        ArrayList arrayList = c6386.f19751;
        String str10 = c6386.f19755;
        if (str8 == null || str8.isEmpty() || str8.indexOf(0) >= 0 || str8.endsWith("/")) {
            throw C3059.m9364("Invalid target", "target", str8 != null ? JSON.value(str8) : null, JSON.array(), JSON.object().add("target", "res/layout/activity_main.xml"));
        }
        if ("resources.arsc".equals(str8)) {
            throw C3059.m9363("RESOURCE_TABLE_TEXT_EDIT_UNSUPPORTED", "resources.arsc must be edited with mt_apk_resource_edit.");
        }
        C13161 m37355 = m37355(c14852, abstractC15440, str8);
        boolean z = m37355.f39350;
        String str11 = m37355.f39351;
        if (!((z || "missing".equals(str11)) ? true : str10.equals(str11))) {
            if (!"zip_entry".equals(str10)) {
                throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if ("axml".equals(str11)) {
                throw C18081.m42156(str7, str9, str8);
            }
            if ("too_large".equals(str11)) {
                throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
            }
            throw C18081.m42155(str7, str9, str8);
        }
        if (z || "missing".equals(str11)) {
            str = "missing";
        } else {
            str = m37347(C8163.m21638(("axml".equals(str10) ? m37418(c14852, abstractC15440.getName(), str8) : m37428(c14852, abstractC15440.getName(), str8)).f54073));
        }
        m37362(c14852, c6386, str9, c6386.f19755, str8, str);
        String str12 = c6386.f19755;
        C10620 c10620 = (C10620) arrayList.get(0);
        String str13 = c10620.f31899;
        if ("write_target".equals(str13)) {
            m37269 = C8163.m21638(c10620.f31900);
        } else {
            if (!m37390(str13)) {
                throw C3059.m9364("Invalid mode", "edits[0].mode", JSON.value(str13), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m37374(abstractC15440).contains(str8)) {
                throw m37351();
            }
            m37269 = m37269(c14852, c6386, abstractC15440.getName(), str12, str8, C8163.m21638("axml".equals(str12) ? m37418(c14852, abstractC15440.getName(), str8).f54073 : m37428(c14852, abstractC15440.getName(), str8).f54073));
        }
        String str14 = m37269;
        String m37347 = m37347(str14);
        if ("axml".equals(str10)) {
            Charset charset = StandardCharsets.UTF_8;
            if (str14.getBytes(charset).length > 2097152) {
                throw C3059.m9363("AXML_SOURCE_TOO_LARGE", "AXML source is too large to edit.");
            }
            String m43415 = C18747.m43415(str14);
            C3990 m37379 = m37379(abstractC15440, str8, m43415);
            if (m37379 != null) {
                c20218 = new C20218(m43415, m37379.f12653);
                str6 = str14;
            } else {
                str6 = str14;
                C0461 m37276 = m37276(c14852, str9, str8, str14, m43415);
                C0244 c0244 = m37276.f2026;
                if (c0244 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0244);
                    throw m37286(c14852, str9, false, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed; edit_text candidate was not saved.", m37264(arrayList2), (String) null, (String) null);
                }
                c20218 = m37276.f2025;
            }
            C20218 c202182 = c20218;
            m37318(abstractC15440, new C8223(Entry.DEFAULT_NAME, str8, null, m37369(abstractC15440).m36526(C18747.m43415(str8)).mo23120()), str6.getBytes(charset), c6386.f19755, new C8745(C14776.f45134, "lf"));
            try {
                m37314(abstractC15440, str8, c202182);
            } catch (Exception e) {
                C19926.m45879("MT MCP AXML edit cache publish failed, editSessionId=".concat(str9), e);
            }
            str2 = c6386.f19755;
            arrayList.size();
            c15923 = null;
            c148522 = c14852;
            str3 = str9;
            str4 = str8;
            str5 = m37347;
        } else {
            C8745 m37380 = m37380(c14852, abstractC15440, str8);
            int i = m37380.f26649;
            try {
                C0521 c0521 = new C0521();
                m37305(c0521, i);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c0521, C14776.m35151(i));
                try {
                    String str15 = m37380.f26650;
                    if ("lf".equals(str15)) {
                        replace = str14;
                    } else {
                        replace = str14.replace("\n", "crlf".equals(str15) ? "\r\n" : "\r");
                    }
                    outputStreamWriter.write(replace);
                    outputStreamWriter.close();
                    byte[] bArr = c0521.f2176;
                    int length = bArr.length;
                    int i2 = c0521.f2177;
                    if (length != i2) {
                        bArr = Arrays.copyOf(bArr, i2);
                    }
                    byte[] bArr2 = bArr;
                    if (bArr2.length > 10485760) {
                        throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    String m373472 = m37347(m37298(c14852, str9, str8, bArr2, false).f54073);
                    m37318(abstractC15440, new C8223(Entry.DEFAULT_NAME, str8, null, m37369(abstractC15440).m36526(C18747.m43415(str8)).mo23120()), bArr2, c6386.f19755, m37380);
                    str2 = c6386.f19755;
                    arrayList.size();
                    c15923 = null;
                    c148522 = c14852;
                    str3 = str9;
                    str4 = str8;
                    str5 = m373472;
                } finally {
                }
            } catch (IOException e2) {
                throw m37279(e2);
            }
        }
        return m37300(c148522, str3, str2, str4, str5, c15923);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C21412 m37435(C14852 c14852, String str) {
        m37375(c14852, str);
        return m37339(c14852, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37383(C14852 c14852, String str, C15923 c15923) {
        if (m37396(str)) {
            return;
        }
        m37259(c14852, m37375(c14852, str), c15923);
        C21412 m37300 = m37300(c14852, str, (String) null, (String) null, (String) null, c15923);
        if (m37300.f68960 > 0) {
            throw m37285(c14852, str, m37300);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37408(C14852 c14852, String str, C15923 c15923) {
        if (m37396(str)) {
            return c14852.f45308;
        }
        m37383(c14852, str, c15923);
        return m37273(c14852, m37291(c14852, str, m37375(c14852, str), c15923));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37326(C1689 c1689, C17667 c17667, C22706 c22706, char[] cArr) {
        AbstractC15440 m5689 = c1689.m5689(c17667.f54033);
        if (m5689 == null) {
            return false;
        }
        c22706.m50718();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(m5689.mo27926(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        c22706.write(cArr, 0, read);
                    } else {
                        inputStreamReader.close();
                        return true;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m37273(C14852 c14852, C7517 c7517) {
        HashSet hashSet = new HashSet(c14852.f45307);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = c7517.f23131;
        HashSet hashSet2 = c7517.f23129;
        int i = 0;
        int i2 = 0;
        for (C10340 c10340 : hashMap2.values()) {
            String str = c10340.f31140;
            String str2 = c10340.f31138;
            if (!hashSet.contains(str)) {
                throw m37277();
            }
            if (!hashSet2.contains(str2) && !c14852.f45302.containsKey(str2)) {
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(c10340);
                i2++;
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C6083.sort((ArrayList) it.next(), C8200.comparing(new C20924()));
        }
        ArrayList arrayList2 = new ArrayList(c14852.f45308.size() + i2);
        Iterator it2 = c14852.f45307.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            while (i < c14852.f45308.size() && str3.equals(((C17667) c14852.f45308.get(i)).f54034)) {
                int i3 = i + 1;
                C17667 c17667 = (C17667) c14852.f45308.get(i);
                if (!hashSet2.contains(c17667.f54033)) {
                    C10340 c103402 = (C10340) c7517.f23133.get(c17667.f54033);
                    if (c103402 != null) {
                        arrayList2.add(new C17667(c103402.f31140, -1, -1, c103402.f31138));
                    } else {
                        arrayList2.add(c17667);
                    }
                }
                i = i3;
            }
            ArrayList arrayList3 = (ArrayList) hashMap.get(str3);
            if (arrayList3 != null) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C10340 c103403 = (C10340) it3.next();
                    arrayList2.add(new C17667(c103403.f31140, -1, -1, c103403.f31138));
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37413(C14852 c14852, String str, C17667 c17667) {
        return m37414(c14852, str, c17667, (C15923) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37414(C14852 c14852, String str, C17667 c17667, C15923 c15923) {
        if (m37396(str)) {
            return C11691.m28576(c14852, c17667);
        }
        AbstractC15440 m37375 = m37375(c14852, str);
        C7517 m37291 = m37291(c14852, str, m37375, c15923);
        C10340 c10340 = (C10340) m37291.f23133.get(c17667.f54033);
        if (c10340 != null) {
            String m37398 = m37398(m37357(m37375, c10340));
            String m43415 = C18747.m43415(m37398);
            C18807 m37358 = m37358(m37375, c10340, m43415);
            if (m37358 != null) {
                return m37358.f59353;
            }
            m37258(c14852, m37375, c10340, m37398);
            C18807 m373582 = m37358(m37375, c10340, m43415);
            if (m373582 == null) {
                throw m37285(c14852, str, m37339(c14852, str));
            }
            return m373582.f59353;
        }
        if (m37291.f23129.contains(c17667.f54033)) {
            throw C18081.m42146(c14852.f45300, str);
        }
        return C11691.m28576(c14852, c17667);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C21412 m37339(C14852 c14852, String str) {
        return m37300(c14852, str, (String) null, (String) null, (String) null, (C15923) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21412 m37300(C14852 c14852, String str, String str2, String str3, String str4, C15923 c15923) {
        AbstractC15440 m37375 = m37375(c14852, str);
        HashMap m37275 = m37275(m37375, c15923);
        ArrayList arrayList = new ArrayList();
        Iterator it = m37338(m37375).iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            C10340 c10340 = (C10340) m37275.get(c0244.f1521);
            if (c10340 != null && c10340.f31140.equals(c0244.f1525)) {
                if (c0244.f1528.equals(C18747.m43415(m37398(m37357(m37375, c10340))))) {
                    arrayList.add(c0244);
                }
            }
        }
        HashMap m37386 = m37386(m37375);
        Iterator it2 = m37336(m37375).iterator();
        while (it2.hasNext()) {
            C0244 c02442 = (C0244) it2.next();
            C12456 c12456 = (C12456) m37386.get(c02442.f1529);
            if (c12456 != null && "axml".equals(c12456.f37462)) {
                String m37398 = m37398(m37369(m37375).m36526(C18747.m43415(c12456.f37460)).m36526("text.xml"));
                String str5 = c02442.f1528;
                if (str5 != null && str5.equals(C18747.m43415(m37398))) {
                    arrayList.add(c02442);
                }
            }
        }
        int i = 0;
        for (C10340 c103402 : m37275(m37375, c15923).values()) {
            String m43415 = C18747.m43415(m37398(m37357(m37375, c103402)));
            if (m37358(m37375, c103402, m43415) == null && !m37331(m37375, c103402, m43415)) {
                i++;
            }
        }
        int i2 = i;
        for (C12456 c124562 : m37386(m37375).values()) {
            String str6 = c124562.f37462;
            String str7 = c124562.f37460;
            if ("axml".equals(str6)) {
                String m434152 = C18747.m43415(m37398(m37369(m37375).m36526(C18747.m43415(str7)).m36526("text.xml")));
                if (m37379(m37375, str7, m434152) == null && !m37368(m37375, str7, m434152)) {
                    i2++;
                }
            }
        }
        return new C21412(c14852.f45300, str, str2, str3, str4, i2, arrayList.size(), arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37259(C14852 c14852, AbstractC15440 abstractC15440, C15923 c15923) {
        int i;
        int i2 = 0;
        for (C10340 c10340 : m37275(abstractC15440, c15923).values()) {
            String m37398 = m37398(m37357(abstractC15440, c10340));
            String m43415 = C18747.m43415(m37398);
            if (m37358(abstractC15440, c10340, m43415) == null && !m37331(abstractC15440, c10340, m43415)) {
                i2 += m37258(c14852, abstractC15440, c10340, m37398);
            }
        }
        for (C12456 c12456 : m37386(abstractC15440).values()) {
            String str = c12456.f37462;
            final String str2 = c12456.f37460;
            if ("axml".equals(str)) {
                String m373982 = m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml"));
                String m434152 = C18747.m43415(m373982);
                if (m37379(abstractC15440, str2, m434152) == null && !m37368(abstractC15440, str2, m434152)) {
                    final String m434153 = C18747.m43415(m373982);
                    if (m37379(abstractC15440, str2, m434153) == null && !m37368(abstractC15440, str2, m434153)) {
                        C0461 m37276 = m37276(c14852, abstractC15440.getName(), str2, m373982, m434153);
                        final C0244 c0244 = m37276.f2026;
                        if (c0244 == null) {
                            try {
                                m37314(abstractC15440, str2, m37276.f2025);
                                try {
                                    ArrayList m37336 = m37336(abstractC15440);
                                    C5378.removeIf(m37336, new Predicate() { // from class: l.ۢܰ᩻
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C19285.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public /* synthetic */ Predicate mo4928negate() {
                                            return C19285.$default$negate(this);
                                        }

                                        public /* synthetic */ Predicate or(Predicate predicate) {
                                            return C19285.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C0244 c02442 = (C0244) obj;
                                            if (str2.equals(c02442.f1529)) {
                                                return m434153.equals(c02442.f1528);
                                            }
                                            return false;
                                        }
                                    });
                                    m37389(abstractC15440, m37336);
                                    i = 1;
                                    i2 += i;
                                } catch (IOException e) {
                                    throw m37279(e);
                                }
                            } catch (IOException e2) {
                                throw m37279(e2);
                            }
                        } else {
                            try {
                                ArrayList m373362 = m37336(abstractC15440);
                                C5378.removeIf(m373362, new Predicate() { // from class: l.ܽܰ᩻
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C19285.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* renamed from: negate */
                                    public /* synthetic */ Predicate mo4928negate() {
                                        return C19285.$default$negate(this);
                                    }

                                    public /* synthetic */ Predicate or(Predicate predicate) {
                                        return C19285.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        String str3;
                                        C0244 c02442 = (C0244) obj;
                                        C0244 c02443 = C0244.this;
                                        String str4 = c02443.f1529;
                                        return str4 != null && str4.equals(c02442.f1529) && (str3 = c02443.f1528) != null && str3.equals(c02442.f1528);
                                    }
                                });
                                m373362.add(c0244);
                                m37389(abstractC15440, m373362);
                            } catch (IOException e3) {
                                throw m37279(e3);
                            }
                        }
                    }
                    i = 0;
                    i2 += i;
                }
            }
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19513 m37299(C14852 c14852, C10340 c10340, String str, String str2) {
        try {
            C19562 m37337 = m37337(c14852, c10340.f31140);
            C19357 m44986 = m37337.m44986();
            try {
                C0657 m24627 = C9684.m24627(str, m44986, m37337);
                if (m24627 == null || !c10340.f31139.equals(m24627.getType())) {
                    String str3 = c10340.f31139;
                    return new C19513(null, new C0244("smali_class", str3, str3, c10340.f31140, str2, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile did not produce target class.", null, null));
                }
                try {
                    C21473 c21473 = new C21473();
                    m44986.m48534(c21473);
                    return new C19513(new C1167(str2, c21473.m48624()), null);
                } catch (IOException e) {
                    throw m37279(e);
                }
            } catch (C14658 e2) {
                String message = e2.getMessage() == null ? "Smali compile failed." : e2.getMessage();
                int i = e2.f44794;
                Integer valueOf = i > 0 ? Integer.valueOf(i - 1) : null;
                int i2 = e2.f44798;
                Integer valueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                String str4 = c10340.f31139;
                return new C19513(null, new C0244("smali_class", str4, str4, c10340.f31140, str2, "SMALI_COMPILE_FAILED_IN_SESSION", message, valueOf, valueOf2));
            }
        } catch (OutOfMemoryError unused) {
            throw C18081.m42152();
        }
        throw C18081.m42152();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18807 m37358(AbstractC15440 abstractC15440, C10340 c10340, String str) {
        AbstractC15440 m37297 = m37297(abstractC15440, c10340);
        if (!m37297.mo23119()) {
            return null;
        }
        try {
            C12951 c12951 = new C12951(m37297.m36506());
            if (c12951.readInt() == 1296388931 && c12951.readInt() == 1 && str.equals(c12951.m31504())) {
                byte[] m31496 = c12951.m31496();
                if (c12951.available() == 0) {
                    Iterator it = ((AbstractC18605) C12918.m31380((InputStream) new ByteArrayInputStream(m31496)).mo27438()).iterator();
                    while (it.hasNext()) {
                        C7980 c7980 = (C7980) it.next();
                        if (c10340.f31139.equals(c7980.getType())) {
                            return new C18807(c7980, m31496);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        AbstractC15440 m372972 = m37297(abstractC15440, c10340);
        if (!m372972.mo23120()) {
            return null;
        }
        m372972.mo23552();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37319(AbstractC15440 abstractC15440, C10340 c10340, C1167 c1167) {
        C10130 c10130 = new C10130(c1167.f4213.length + 96);
        c10130.writeInt(1296388931);
        c10130.writeInt(1);
        c10130.m25423((CharSequence) c1167.f4214);
        c10130.m25434(c1167.f4213);
        AbstractC15440 m37297 = m37297(abstractC15440, c10340);
        m37297.mo35195();
        m37297.m36496(c10130);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37362(C14852 c14852, C6386 c6386, String str, String str2, String str3, String str4) {
        JSONArray m37349;
        String str5 = c14852.f45300;
        if (str4.equals(c6386.f19754)) {
            return;
        }
        JSONObject add = m37265(str5, str, str2, str3).add("currentTargetVersion", str4);
        if ("missing".equals(str4)) {
            m37349 = JSON.array();
        } else {
            m37349 = m37349(str5, str, str2, str3);
        }
        throw C3059.m9365("TARGET_VERSION_MISMATCH", "targetVersion does not match current target text. Re-read the target and retry with data.targetVersion.", "warning", m37349, add);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String m37347(String str) {
        return C14460.m34531(C14460.m34532().digest(str.getBytes(StandardCharsets.UTF_8))).substring(0, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C5184 m37354(l.C14852 r9, l.AbstractC15440 r10, l.C20498 r11) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f45300
            java.lang.String r1 = r11.f66069
            java.lang.String r2 = r11.f66068
            java.lang.String r3 = m37341(r1)
            l.ܶܰ᩻ r4 = m37356(r10, r3)
            if (r4 != 0) goto Lc8
            java.util.HashMap r4 = m37348(r10)
            java.lang.Object r4 = r4.get(r3)
            l.ۤܰ᩻ r4 = (l.C10340) r4
            int r5 = m37346(r9, r3)
            r6 = 1
            if (r4 != 0) goto L2d
            if (r5 > r6) goto L24
            goto L2d
        L24:
            java.lang.String r9 = "AMBIGUOUS_CLASS_IN_DEX"
            java.lang.String r10 = "Class exists in multiple dex files."
            l.ۗۛ᩻ r9 = l.C3059.m9363(r9, r10)
            throw r9
        L2d:
            if (r5 <= 0) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            if (r4 != 0) goto L3c
            if (r5 == 0) goto L37
            goto L3c
        L37:
            l.ۗۛ᩻ r9 = l.C18081.m42146(r0, r2)
            throw r9
        L3c:
            if (r4 == 0) goto L40
            r0 = r4
            goto L4b
        L40:
            l.ۤܰ᩻ r0 = new l.ۤܰ᩻
            l.ܿ᩺᩻ r9 = m37400(r9, r3)
            java.lang.String r9 = r9.f54034
            r0.<init>(r9, r3)
        L4b:
            java.lang.String r9 = r0.f31140
            if (r4 == 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            l.۠ܰ᩻ r4 = new l.۠ܰ᩻
            java.lang.String r7 = "dex"
            r4.<init>(r7, r3, r9, r0)
            m37397(r10)
            l.ܶ᩵ܿ r0 = m37296(r10)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            m37317(r10, r4, r0)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            if (r5 == 0) goto L69
            m37393(r10, r3, r9)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            goto L78
        L69:
            java.util.ArrayList r9 = m37344(r10)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            l.ۨ᩺᩻ r0 = new l.ۨ᩺᩻     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            r0.<init>(r3)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            l.C5378.removeIf(r9, r0)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            m37385(r10, r9)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
        L78:
            java.util.ArrayList r9 = m37338(r10)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            l.۬ۧۜ r0 = new l.۬ۧۜ     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            r5 = 1
            r0.<init>(r5, r3)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            l.C5378.removeIf(r9, r0)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            m37372(r10, r9)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            l.᩸ܰ᩻ r9 = m37397(r10)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            r8.m37260(r10, r9)     // Catch: l.C3059 -> L97 java.io.IOException -> L99
            m37365(r10, r4)     // Catch: l.C3059 -> L93 java.io.IOException -> L95
            goto Lac
        L93:
            r9 = move-exception
            goto L9b
        L95:
            r9 = move-exception
            goto L9b
        L97:
            r9 = move-exception
            goto L9a
        L99:
            r9 = move-exception
        L9a:
            r6 = 0
        L9b:
            if (r6 == 0) goto Lb9
            boolean r0 = m37330(r10, r4, r9)
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "MT MCP delete commit completed after storage error, editSessionId="
            java.lang.String r0 = r0.concat(r2)
            l.C19926.m45879(r0, r9)
        Lac:
            m37343(r10)
            l.ۚۜۜ r9 = new l.ۚۜۜ
            java.lang.String r10 = r11.f66071
            java.lang.String r11 = r11.f66070
            r9.<init>(r10, r2, r11, r1)
            return r9
        Lb9:
            m37329(r10, r9)
            boolean r10 = r9 instanceof l.C3059
            if (r10 == 0) goto Lc3
            l.ۗۛ᩻ r9 = (l.C3059) r9
            goto Lc7
        Lc3:
            l.ۗۛ᩻ r9 = m37279(r9)
        Lc7:
            throw r9
        Lc8:
            l.ۗۛ᩻ r9 = l.C18081.m42146(r0, r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15799.m37354(l.ܳ᩻ۜ, l.ܶ᩵ܿ, l.᩶᩻ۜ):l.ۚۜۜ");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C5184 m37289(l.C14852 r11, l.AbstractC15440 r12, l.C20498 r13, l.C15923 r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15799.m37289(l.ܳ᩻ۜ, l.ܶ᩵ܿ, l.᩶᩻ۜ, l.ܺۨ᩻):l.ۚۜۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37269(C14852 c14852, C6386 c6386, String str, String str2, String str3, String str4) {
        ArrayList arrayList = c6386.f19751;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C10620 c10620 = (C10620) arrayList.get(i);
            String str5 = c10620.f31899;
            if (!m37390(str5)) {
                throw C3059.m9364("Invalid mode", C18307.m42645(i, "edits[", "].mode"), JSON.value(str5), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            arrayList2.add(new C22699(str5, c10620.f31898, c10620.f31900));
        }
        try {
            return C8163.m21638(C16389.m38586(str4, arrayList2));
        } catch (C13526 e) {
            int i2 = e.f40344;
            String m42645 = C18307.m42645(i2, "edits[", "]");
            int i3 = C8929.f27150[e.f40342.ordinal()];
            if (i3 == 1) {
                throw m37281("TEXT_MATCH_NOT_FOUND", C16014.m37867(m42645, ".matchText was not found in current text. Re-read the target and retry with current text."), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 2) {
                throw m37281("TEXT_MATCH_AMBIGUOUS", C16014.m37867(m42645, ".matchText appears multiple times in current text; provide a longer matchText with surrounding context that appears only once."), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 3) {
                throw m37281("TEXT_MATCH_OVERLAP", C3200.m9831(e.f40343, "]; match ranges must not overlap.", C7166.m19190(m42645, " overlaps edits[")), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 4) {
                throw C3059.m9364("Invalid mode", C16014.m37867(m42645, ".mode"), JSON.value(((C10620) arrayList.get(i2)).f31899), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            throw new IncompatibleClassChangeError();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37281(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return C3059.m9365(str, str2, "warning", m37349(str3, str4, str5, str6), m37265(str3, str4, str5, str6).add("failedEditIndex", i));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m37390(String str) {
        return "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m37265(String str, String str2, String str3, String str4) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("targetType", str3).add("target", str4).add("locator", C13169.m31924(str3, str4)).add("failures", JSON.array());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m37349(String str, String str2, String str3, String str4) {
        return JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", C13169.m31924(str3, str4)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read current target text and targetVersion"));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m37373(String str) {
        return str.startsWith(".method") && str.length() > 7 && Character.isWhitespace(str.charAt(7));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37267(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        String trim = str.trim();
        if (!trim.startsWith(".class")) {
            return null;
        }
        if (trim.length() > 6 && !Character.isWhitespace(trim.charAt(6))) {
            return null;
        }
        String[] split = trim.split("\\s+");
        if (split.length < 2) {
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali .class directive is invalid.");
        }
        return m37341(split[split.length - 1]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37287(C14852 c14852, C6386 c6386, String str) {
        return C3059.m9365("DEX_METHOD_MISMATCH", str, "fatal", JSON.array(), JSON.object().add("workspaceId", c14852.f45300).add("editSessionId", c6386.f19750).add("locator", C13169.m31924(c6386.f19755, c6386.f19753)).add("failures", JSON.array()));
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C19562 m37337(C14852 c14852, String str) {
        int i;
        C12918 c12918;
        C19562 c19562 = new C19562();
        synchronized (c14852.f45303) {
            Reference reference = (Reference) c14852.f45303.get(str);
            if (reference == null || (c12918 = (C12918) reference.get()) == null) {
                try {
                    BufferedInputStream m36518 = c14852.m35250(str).m36518();
                    try {
                        C7897 m21186 = C7897.m21186(C10619.m26650(m36518));
                        m36518.close();
                        i = m21186.f24463;
                    } finally {
                    }
                } catch (Exception unused) {
                    throw C18081.m42149(c14852.f45311, c14852.f45296);
                }
            } else {
                i = c12918.mo27437().f24463;
            }
        }
        c19562.f63232 = i;
        return c19562;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17667 m37400(C14852 c14852, String str) {
        Iterator it = c14852.f45314.iterator();
        C17667 c17667 = null;
        while (it.hasNext()) {
            C17667 c176672 = (C17667) it.next();
            if (str.equals(C14844.m35246(c176672.f54033))) {
                c17667 = c176672;
            }
        }
        if (c17667 != null) {
            return c17667;
        }
        throw C18081.m42146(c14852.f45300, "");
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int m37346(C14852 c14852, String str) {
        return ((Integer) C13843.getOrDefault(c14852.f45306, C14844.m35244(str), 0)).intValue();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37375(C14852 c14852, String str) {
        if (m37396(str)) {
            throw C3059.m9363("EDIT_SESSION_REQUIRED", "editSessionId is required for edit session tools.");
        }
        if (m37406(str)) {
            AbstractC15440 m36526 = c14852.f45298.m36526("edit_sessions").m36526(str);
            if (!m36526.mo23113()) {
                throw C3059.m9363("EDIT_SESSION_NOT_FOUND", "Edit session was not found.");
            }
            m37256(m36526);
            return m36526;
        }
        throw C3059.m9364("Invalid editSessionId", "editSessionId", JSON.value(str), JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37315(AbstractC15440 abstractC15440, ArrayList arrayList) {
        byte[] bArr;
        AbstractC15440 m36526 = abstractC15440.m36526("overlay").m36526("resource_value");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = ((C13866) it.next()).f41345;
            AbstractC15440 m12320 = C4103.m12320(m36526, str);
            boolean mo23119 = m12320.mo23119();
            if (m12320.mo23119()) {
                bArr = m12320.m36506();
            }
            arrayList2.add(new C23039(str, mo23119, bArr));
        }
        AbstractC15440 m365262 = abstractC15440.m36526("state.json");
        boolean mo231192 = m365262.mo23119();
        bArr = m365262.mo23119() ? m365262.m36506() : null;
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C13866 c13866 = (C13866) it2.next();
                C4103 c4103 = c13866.f41344;
                if (c4103 != null) {
                    c4103.m12328(m36526);
                } else {
                    AbstractC15440 m123202 = C4103.m12320(m36526, c13866.f41345);
                    if (m123202.mo23120() && !m123202.mo23552()) {
                        throw new IOException("Unable to delete resource patch");
                    }
                }
            }
            m37260(abstractC15440, m37397(abstractC15440));
        } catch (IOException | C3059 e) {
            try {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C23039 c23039 = (C23039) it3.next();
                    AbstractC15440 m123203 = C4103.m12320(m36526, c23039.f74143);
                    if (c23039.f74142) {
                        m37366(m123203, c23039.f74141, ".resource_patch_restore");
                    } else {
                        AbstractC15440 m123204 = C4103.m12320(m36526, c23039.f74143);
                        if (m123204.mo23120() && !m123204.mo23552()) {
                            throw new IOException("Unable to delete resource patch");
                        }
                    }
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            try {
                if (mo231192) {
                    m37366(m365262, bArr, ".state_restore");
                    throw e;
                }
                if (!m365262.mo23120()) {
                    throw e;
                }
                if (m365262.mo23552()) {
                    throw e;
                }
                throw new IOException("Unable to restore edit session state");
            } catch (IOException e3) {
                e.addSuppressed(e3);
                throw e;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37357(AbstractC15440 abstractC15440, C10340 c10340) {
        return abstractC15440.m36526("overlay").m36526("dex").m36526(c10340.f31140).m36526(C18747.m43415(c10340.f31139).concat(".smali"));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37369(AbstractC15440 abstractC15440) {
        return abstractC15440.m36526("overlay").m36526(Entry.DEFAULT_NAME);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37297(AbstractC15440 abstractC15440, C10340 c10340) {
        return abstractC15440.m36526("cache").m36526("dex").m36526(c10340.f31140).m36526(C18747.m43415(c10340.f31139).concat(".bin"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37381(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526("cache").m36526(Entry.DEFAULT_NAME).m36526(C18747.m43415(str).concat(".bin"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37317(AbstractC15440 abstractC15440, C8223 c8223, AbstractC15440 abstractC154402) {
        boolean z;
        boolean z2;
        AbstractC15440 m36526 = abstractC15440.m36526("deleted");
        String str = c8223.f25340;
        AbstractC15440 m365262 = m36526.m36526("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC15440 m365263 = abstractC154402.m36526("deleted.backup");
        boolean z3 = true;
        if (m365262.mo23119()) {
            m365263.m36502(m365262.m36506());
            z = true;
        } else {
            z = false;
        }
        c8223.f25334 = z;
        AbstractC15440 m365264 = abstractC15440.m36526("failures").m36526("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC15440 m365265 = abstractC154402.m36526("failures.backup");
        if (m365264.mo23119()) {
            m365265.m36502(m365264.m36506());
            z2 = true;
        } else {
            z2 = false;
        }
        c8223.f25337 = z2;
        AbstractC15440 m365266 = abstractC15440.m36526("state.json");
        AbstractC15440 m365267 = abstractC154402.m36526("state.backup");
        if (m365266.mo23119()) {
            m365267.m36502(m365266.m36506());
        } else {
            z3 = false;
        }
        c8223.f25338 = z3;
        m37323(abstractC15440.m36526(".delete_transaction").m36526("transaction.json"), m37334(c8223, "prepared"), ".delete_txn");
        if (c8223.f25339) {
            AbstractC15440 m37382 = m37382(abstractC15440, c8223);
            AbstractC15440 m365268 = abstractC154402.m36526("overlay.backup");
            if (!m37382.mo23120() || m365268.mo23120() || !m37382.mo23551(m365268)) {
                throw new IOException("Unable to stage delete transaction overlay");
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37344(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("deleted").m36526("dex.json");
        ArrayList arrayList = new ArrayList();
        if (m36526.mo23119()) {
            try {
                JSONValue parse = JSON.parse(m37398(m36526));
                if (parse.isArray()) {
                    Iterator it = parse.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject asObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C15277(asObject.getString("className", null), asObject.getString("dexEntryName", null)));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37374(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("deleted").m36526("entry.json");
        ArrayList arrayList = new ArrayList();
        if (m36526.mo23119()) {
            try {
                JSONValue parse = JSON.parse(m37398(m36526));
                if (parse.isArray()) {
                    Iterator it = parse.asArray().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JSONValue) it.next()).asObject().getString("entryName", null));
                    }
                    C5378.removeIf(arrayList, new C0065(3));
                    return arrayList;
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37336(AbstractC15440 abstractC15440) {
        Integer num;
        Integer num2;
        AbstractC15440 m36526 = abstractC15440.m36526("failures").m36526("entry.json");
        ArrayList arrayList = new ArrayList();
        if (m36526.mo23119()) {
            try {
                JSONValue parse = JSON.parse(m37398(m36526));
                if (parse.isArray()) {
                    Iterator it = parse.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject asObject = ((JSONValue) it.next()).asObject();
                        if (asObject.get("line") != null && !asObject.get("line").isNull()) {
                            num = Integer.valueOf(asObject.getInt("line", -1));
                            if (asObject.get("column") != null && !asObject.get("column").isNull()) {
                                num2 = Integer.valueOf(asObject.getInt("column", -1));
                                arrayList.add(new C0244(asObject.getString("targetType", null), asObject.getString("target", null), null, null, asObject.getString("textHash", null), asObject.getString("errorCode", null), asObject.getString("message", null), num, num2));
                            }
                            num2 = null;
                            arrayList.add(new C0244(asObject.getString("targetType", null), asObject.getString("target", null), null, null, asObject.getString("textHash", null), asObject.getString("errorCode", null), asObject.getString("message", null), num, num2));
                        }
                        num = null;
                        if (asObject.get("column") != null) {
                            num2 = Integer.valueOf(asObject.getInt("column", -1));
                            arrayList.add(new C0244(asObject.getString("targetType", null), asObject.getString("target", null), null, null, asObject.getString("textHash", null), asObject.getString("errorCode", null), asObject.getString("message", null), num, num2));
                        }
                        num2 = null;
                        arrayList.add(new C0244(asObject.getString("targetType", null), asObject.getString("target", null), null, null, asObject.getString("textHash", null), asObject.getString("errorCode", null), asObject.getString("message", null), num, num2));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37338(AbstractC15440 abstractC15440) {
        Integer num;
        Integer num2;
        AbstractC15440 m36526 = abstractC15440.m36526("failures").m36526("dex.json");
        ArrayList arrayList = new ArrayList();
        if (m36526.mo23119()) {
            try {
                JSONValue parse = JSON.parse(m37398(m36526));
                if (parse.isArray()) {
                    Iterator it = parse.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject asObject = ((JSONValue) it.next()).asObject();
                        if (asObject.get("line") != null && !asObject.get("line").isNull()) {
                            num = Integer.valueOf(asObject.getInt("line", -1));
                            if (asObject.get("column") != null && !asObject.get("column").isNull()) {
                                num2 = Integer.valueOf(asObject.getInt("column", -1));
                                arrayList.add(new C0244(asObject.getString("targetType", "smali_class"), asObject.getString("target", asObject.getString("className", null)), asObject.getString("className", null), asObject.getString("dexEntryName", null), asObject.getString("textHash", null), asObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), asObject.getString("message", "Smali compile failed."), num, num2));
                            }
                            num2 = null;
                            arrayList.add(new C0244(asObject.getString("targetType", "smali_class"), asObject.getString("target", asObject.getString("className", null)), asObject.getString("className", null), asObject.getString("dexEntryName", null), asObject.getString("textHash", null), asObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), asObject.getString("message", "Smali compile failed."), num, num2));
                        }
                        num = null;
                        if (asObject.get("column") != null) {
                            num2 = Integer.valueOf(asObject.getInt("column", -1));
                            arrayList.add(new C0244(asObject.getString("targetType", "smali_class"), asObject.getString("target", asObject.getString("className", null)), asObject.getString("className", null), asObject.getString("dexEntryName", null), asObject.getString("textHash", null), asObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), asObject.getString("message", "Smali compile failed."), num, num2));
                        }
                        num2 = null;
                        arrayList.add(new C0244(asObject.getString("targetType", "smali_class"), asObject.getString("target", asObject.getString("className", null)), asObject.getString("className", null), asObject.getString("dexEntryName", null), asObject.getString("textHash", null), asObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), asObject.getString("message", "Smali compile failed."), num, num2));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m37340(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("state.json");
        if (m36526.mo23119()) {
            try {
                long j = JSON.parse(m37398(m36526)).asObject().getLong("lastAccessedAt", -1L);
                if (j >= 0) {
                    return j;
                }
            } catch (Exception unused) {
            }
            return m36526.mo23117();
        }
        return abstractC15440.mo23117();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C21629 m37397(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("state.json");
        if (!m36526.mo23119()) {
            throw m37279(new IOException("Edit session state is missing."));
        }
        try {
            JSONObject asObject = JSON.parse(m37398(m36526)).asObject();
            int i = asObject.getInt("revision", -1);
            if (i < 0) {
                throw new NumberFormatException("negative revision");
            }
            long j = asObject.getLong("createdAt", -1L);
            if (j < 0) {
                j = abstractC15440.mo23117();
            }
            long j2 = asObject.getLong("lastAccessedAt", -1L);
            if (j2 < 0) {
                j2 = m37340(abstractC15440);
            }
            return new C21629(j, i, j2);
        } catch (Exception e) {
            throw m37279(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m37350(C14852 c14852, AbstractC15440 abstractC15440) {
        int i = m37397(abstractC15440).f69437;
        String str = c14852.f45300;
        String name = abstractC15440.getName();
        C10247 c10247 = this.f48733;
        ArrayList m25974 = c10247.m25974(i, str, name);
        if (m25974 != null) {
            return m25974;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC15440 m36526 = abstractC15440.m36526("overlay").m36526("resource_value");
        if (m36526.mo23113()) {
            for (AbstractC15440 abstractC154402 : m36526.mo23549(true)) {
                if (abstractC154402.mo23119() && C4103.m12322(abstractC154402.getName())) {
                    arrayList.add(C4103.m12326(abstractC154402));
                }
            }
        }
        return c10247.m25975(i, c14852.f45300, abstractC15440.getName(), C4103.m12318(arrayList));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37260(AbstractC15440 abstractC15440, C21629 c21629) {
        int i = c21629.f69437;
        if (i == Integer.MAX_VALUE) {
            throw m37279(new IOException("Edit session revision overflow."));
        }
        int i2 = i + 1;
        long j = c21629.f69436;
        m37366(abstractC15440.m36526("state.json"), JSON.object().add("revision", i2).add("createdAt", j).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7517 m37291(C14852 c14852, String str, AbstractC15440 abstractC15440, C15923 c15923) {
        if (c15923 == null) {
            return m37292(abstractC15440, c14852.f45300, str);
        }
        Object m37692 = c15923.m37692("apk.edit.sessionClassView");
        if (m37692 instanceof C7517) {
            C7517 c7517 = (C7517) m37692;
            if (c7517.f23132.equals(c14852.f45300) && c7517.f23130.equals(str)) {
                return c7517;
            }
        }
        C7517 m37292 = m37292(abstractC15440, c14852.f45300, str);
        c15923.m37695(m37292, "apk.edit.sessionClassView");
        return m37292;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7517 m37292(AbstractC15440 abstractC15440, String str, String str2) {
        HashMap m37348 = m37348(abstractC15440);
        HashMap hashMap = new HashMap();
        for (C10340 c10340 : m37348.values()) {
            hashMap.put(c10340.f31138, c10340);
        }
        HashSet hashSet = new HashSet();
        Iterator it = m37344(abstractC15440).iterator();
        while (it.hasNext()) {
            hashSet.add(C14844.m35244(((C15277) it.next()).f46871));
        }
        return new C7517(str, str2, m37348, hashMap, hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37270(C14852 c14852, AbstractC15440 abstractC15440, String str) {
        C10340 c10340 = (C10340) m37348(abstractC15440).get(str);
        if (c10340 != null) {
            return c10340.f31140;
        }
        C15277 m37356 = m37356(abstractC15440, str);
        if (m37356 != null) {
            return m37356.f46872;
        }
        int m37346 = m37346(c14852, str);
        ArrayList arrayList = c14852.f45307;
        if (m37346 > 1) {
            throw C3059.m9363("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        if (m37346 == 1) {
            return m37400(c14852, str).f54034;
        }
        if (arrayList.isEmpty()) {
            throw C3059.m9363("NO_DEX_IN_WORKSPACE", "Workspace has no dex file for new Smali.");
        }
        return (String) C5378.stream(arrayList).max(C18373.m42805()).orElse((String) C18566.m43105(arrayList, 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m37275(AbstractC15440 abstractC15440, C15923 c15923) {
        if (c15923 == null) {
            return m37348(abstractC15440);
        }
        String m12552 = C4153.m12552(abstractC15440, new StringBuilder("apk.edit.overlayRefs:"));
        Object m37692 = c15923.m37692(m12552);
        if (m37692 != null) {
            return (HashMap) m37692;
        }
        HashMap m37348 = m37348(abstractC15440);
        c15923.m37695(m37348, m12552);
        return m37348;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m37348(AbstractC15440 abstractC15440) {
        HashMap hashMap = new HashMap();
        AbstractC15440 m36526 = abstractC15440.m36526("overlay").m36526("dex");
        if (m36526.mo23113()) {
            for (AbstractC15440 abstractC154402 : m36526.mo23549(true)) {
                if (abstractC154402.mo23113()) {
                    String name = abstractC154402.getName();
                    for (AbstractC15440 abstractC154403 : abstractC154402.mo23549(true)) {
                        if (!abstractC154403.mo23113() && abstractC154403.getName().endsWith(".smali")) {
                            try {
                                String m37403 = m37403(abstractC154403);
                                if (!abstractC154403.getName().equals(C18747.m43415(m37403).concat(".smali"))) {
                                    throw m37277();
                                }
                                hashMap.put(m37403, new C10340(name, m37403));
                            } catch (IOException | C3059 unused) {
                                throw m37277();
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m37403(AbstractC15440 abstractC15440) {
        String m37267;
        BufferedReader m36521 = abstractC15440.m36521();
        do {
            try {
                String readLine = m36521.readLine();
                if (readLine != null) {
                    m37267 = m37267(readLine);
                } else {
                    m36521.close();
                    throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
                }
            } catch (Throwable th) {
                try {
                    m36521.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (m37267 == null);
        m36521.close();
        return m37267;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37385(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15277 c15277 = (C15277) it.next();
            array.add(JSON.object().add("className", c15277.f46871).add("dexEntryName", c15277.f46872));
        }
        abstractC15440.m36526("deleted").m36526("dex.json").m36502(array.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15277 m37356(AbstractC15440 abstractC15440, String str) {
        Iterator it = m37344(abstractC15440).iterator();
        while (it.hasNext()) {
            C15277 c15277 = (C15277) it.next();
            if (str.equals(c15277.f46871)) {
                return c15277;
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37393(AbstractC15440 abstractC15440, final String str, String str2) {
        ArrayList m37344 = m37344(abstractC15440);
        C5378.removeIf(m37344, new Predicate() { // from class: l.᩺᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C15277) obj).f46871);
            }
        });
        m37344.add(new C15277(str, str2));
        m37385(abstractC15440, m37344);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m37372(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject add = JSON.object().add("targetType", c0244.f1522).add("target", c0244.f1529).add("className", c0244.f1521).add("dexEntryName", c0244.f1525).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject add2 = add.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            array.add(add2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC15440.m36526("failures").m36526("dex.json").m36502(array.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37331(AbstractC15440 abstractC15440, C10340 c10340, String str) {
        Iterator it = m37338(abstractC15440).iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            if (c10340.f31139.equals(c0244.f1521) && c10340.f31140.equals(c0244.f1525) && str.equals(c0244.f1528)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0461 m37276(C14852 c14852, String str, String str2, String str3, String str4) {
        Integer num;
        Integer num2;
        try {
            try {
                C10130 c10130 = new C10130();
                C2134 c2134 = new C2134(this.f48733.m25976(c14852, this, str));
                c2134.m7058(true);
                c2134.m7055(str3);
                c2134.m7057(c10130);
                int size = c10130.size();
                if (size > 2097152) {
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODED_TOO_LARGE", "Encoded AXML is too large.", null, null));
                }
                try {
                    return new C0461(new C20218(str4, Arrays.copyOf(c10130.m25438(), size)), null);
                } catch (C1580 e) {
                    e = e;
                    if (e.m5400() != null) {
                        int m38634 = e.m5400().m38634();
                        int m38625 = e.m5400().m38625();
                        Integer valueOf = m38634 > 0 ? Integer.valueOf(m38634 - 1) : null;
                        num2 = m38625 > 0 ? Integer.valueOf(m38625 - 1) : null;
                        num = valueOf;
                    } else {
                        num = null;
                        num2 = null;
                    }
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", num, num2));
                } catch (Exception e2) {
                    e = e2;
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", null, null));
                }
            } catch (OutOfMemoryError unused) {
                throw C18081.m42152();
            }
        } catch (C1580 e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3990 m37379(AbstractC15440 abstractC15440, String str, String str2) {
        AbstractC15440 m37381 = m37381(abstractC15440, str);
        if (!m37381.mo23119()) {
            return null;
        }
        try {
            C12951 c12951 = new C12951(m37381.m36506());
            if (c12951.readInt() == 1296384323 && c12951.readInt() == 1 && str.equals(c12951.m31504()) && str2.equals(c12951.m31504())) {
                byte[] m31496 = c12951.m31496();
                if (c12951.available() == 0) {
                    return new C3990(m31496);
                }
            }
        } catch (Exception unused) {
        }
        AbstractC15440 m373812 = m37381(abstractC15440, str);
        if (!m373812.mo23120()) {
            return null;
        }
        m373812.mo23552();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37314(AbstractC15440 abstractC15440, String str, C20218 c20218) {
        C10130 c10130 = new C10130(c20218.f65408.length + 128);
        c10130.writeInt(1296384323);
        c10130.writeInt(1);
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) c20218.f65409);
        c10130.m25434(c20218.f65408);
        AbstractC15440 m37381 = m37381(abstractC15440, str);
        m37381.mo35195();
        m37381.m36496(c10130);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37318(l.AbstractC15440 r8, l.C8223 r9, byte[] r10, java.lang.String r11, l.C8745 r12) {
        /*
            r7 = this;
            l.᩸ܰ᩻ r0 = m37397(r8)
            r1 = 0
            l.ܶ᩵ܿ r2 = m37296(r8)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r3 = "overlay.next"
            l.ܶ᩵ܿ r3 = r2.m36526(r3)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r4 = "dex"
            java.lang.String r5 = r9.f25340     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r6 = r9.f25336     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            boolean r4 = r4.equals(r5)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            if (r4 == 0) goto L1f
            r3.m36502(r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            goto L3f
        L1f:
            r3.m36508()     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r5 = "meta.json"
            l.ܶ᩵ܿ r5 = r3.m36526(r5)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            m37312(r5, r6, r11, r12)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r12 = "axml"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            if (r11 == 0) goto L36
            java.lang.String r11 = "text.xml"
            goto L38
        L36:
            java.lang.String r11 = "data.bin"
        L38:
            l.ܶ᩵ܿ r11 = r3.m36526(r11)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r11.m36502(r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
        L3f:
            m37317(r8, r9, r2)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            l.ܶ᩵ܿ r10 = m37382(r8, r9)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r10.mo35195()     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            boolean r11 = r10.mo23120()     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            if (r11 != 0) goto L8c
            boolean r10 = r3.mo23551(r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            if (r10 == 0) goto L8c
            if (r4 == 0) goto L77
            java.util.ArrayList r10 = m37344(r8)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            l.ۨ᩺᩻ r11 = new l.ۨ᩺᩻     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r11.<init>(r6)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            l.C5378.removeIf(r10, r11)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            m37385(r8, r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.util.ArrayList r10 = m37338(r8)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            l.۬ۧۜ r11 = new l.۬ۧۜ     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r12 = 1
            r11.<init>(r12, r6)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            l.C5378.removeIf(r10, r11)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            m37372(r8, r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            goto L84
        L77:
            java.util.ArrayList r10 = m37374(r8)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r10.remove(r6)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            m37394(r8, r10)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            m37371(r8, r6)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
        L84:
            r7.m37260(r8, r0)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            r1 = 1
            m37365(r8, r9)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            goto Le9
        L8c:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            java.lang.String r11 = "Unable to publish text overlay"
            r10.<init>(r11)     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
            throw r10     // Catch: java.lang.RuntimeException -> L94 l.C3059 -> Lc9 java.io.IOException -> Lcb
        L94:
            r10 = move-exception
            boolean r11 = m37367(r10)
            if (r11 == 0) goto Lc8
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Edit session storage backend failed"
            r11.<init>(r12, r10)
            if (r1 == 0) goto Lc0
            boolean r9 = m37330(r8, r9, r11)
            if (r9 == 0) goto Lc0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "MT MCP text edit commit completed after backend error, editSessionId="
            r9.<init>(r11)
            java.lang.String r11 = r8.getName()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            l.C19926.m45879(r9, r10)
            goto Le9
        Lc0:
            m37329(r8, r11)
            l.ۗۛ᩻ r8 = m37279(r11)
            throw r8
        Lc8:
            throw r10
        Lc9:
            r10 = move-exception
            goto Lcc
        Lcb:
            r10 = move-exception
        Lcc:
            if (r1 == 0) goto Led
            boolean r9 = m37330(r8, r9, r10)
            if (r9 == 0) goto Led
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "MT MCP text edit commit completed after storage error, editSessionId="
            r9.<init>(r11)
            java.lang.String r11 = r8.getName()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            l.C19926.m45879(r9, r10)
        Le9:
            m37343(r8)
            return
        Led:
            m37329(r8, r10)
            boolean r8 = r10 instanceof l.C3059
            if (r8 == 0) goto Lf7
            l.ۗۛ᩻ r10 = (l.C3059) r10
            goto Lfb
        Lf7:
            l.ۗۛ᩻ r10 = m37279(r10)
        Lfb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15799.m37318(l.ܶ᩵ܿ, l.۠ܰ᩻, byte[], java.lang.String, l.ۡ۟᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37312(AbstractC15440 abstractC15440, String str, String str2, C8745 c8745) {
        abstractC15440.m36502(C7416.m19939("targetType", str2, "entryName", str).add("encoding", c8745.f26649).add("lineEnding", c8745.f26650).toString().getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static HashMap m37386(AbstractC15440 abstractC15440) {
        HashMap hashMap = new HashMap();
        AbstractC15440 m37369 = m37369(abstractC15440);
        if (m37369.mo23113()) {
            for (AbstractC15440 abstractC154402 : m37369.mo23549(true)) {
                if (abstractC154402.mo23113()) {
                    try {
                        JSONObject asObject = JSON.parse(m37398(abstractC154402.m36526("meta.json"))).asObject();
                        String string = asObject.getString("targetType", null);
                        String string2 = asObject.getString("entryName", null);
                        int i = asObject.getInt("encoding", C14776.f45134);
                        String string3 = asObject.getString("lineEnding", "lf");
                        if (string2 == null || string == null) {
                            throw new IOException("Missing entry overlay metadata");
                        }
                        if (!"axml".equals(string) && !"zip_entry".equals(string)) {
                            throw new IOException("Invalid entry overlay target type");
                        }
                        if (!"lf".equals(string3) && !"crlf".equals(string3) && !"cr".equals(string3)) {
                            throw new IOException("Invalid entry overlay line ending");
                        }
                        C12456 c12456 = new C12456(string2, i, string, string3);
                        if (!C18747.m43415(string2).equals(abstractC154402.getName())) {
                            throw m37277();
                        }
                        hashMap.put(string2, c12456);
                    } catch (Exception unused) {
                        throw m37277();
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m37266(AbstractC15440 abstractC15440, C12456 c12456) {
        String str = c12456.f37462;
        String str2 = c12456.f37460;
        if ("zip_entry".equals(str)) {
            return Long.valueOf(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("data.bin").mo23127());
        }
        if (m37379(abstractC15440, str2, C18747.m43415(m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml")))) == null) {
            return null;
        }
        return Long.valueOf(r2.f12653.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m37274(C14852 c14852, AbstractC15440 abstractC15440) {
        ArrayList arrayList = new ArrayList(m37386(abstractC15440).values());
        C6083.sort(arrayList, C8200.comparing(new C11046()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12456 c12456 = (C12456) it.next();
            String str = c12456.f37462;
            String str2 = c12456.f37460;
            if ("zip_entry".equals(str)) {
                AbstractC15440 m36526 = m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("data.bin");
                arrayList2.add(new C15766(m37257(m36526), m36526, str2, m37345(c14852, str2)));
            } else {
                C3990 m37379 = m37379(abstractC15440, str2, C18747.m43415(m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml"))));
                if (m37379 == null) {
                    throw m37279(new IOException("Missing valid AXML cache for build."));
                }
                arrayList2.add(new C15766(str2, m37345(c14852, str2), m37379.f12653));
            }
        }
        ArrayList m37350 = m37350(c14852, abstractC15440);
        if (!m37350.isEmpty()) {
            arrayList2.add(new C15766("resources.arsc", m37345(c14852, "resources.arsc"), m37335(c14852, abstractC15440, m37350)));
        }
        return arrayList2;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static long m37257(AbstractC15440 abstractC15440) {
        try {
            if (!abstractC15440.mo23119()) {
                throw new IOException("ZIP entry overlay data is missing");
            }
            long mo23127 = abstractC15440.mo23127();
            if (mo23127 < 0 || mo23127 > 9007199254740991L) {
                throw new IOException("ZIP entry overlay size is unavailable or unsupported");
            }
            return mo23127;
        } catch (IOException e) {
            throw m37377(e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            throw m37377(e2);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17675 m37370(C14852 c14852, String str, String str2) {
        boolean z;
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry == null) {
                    throw m37351();
                }
                if (!entry.isDirectory()) {
                    if (m37327(c14852, c18090, entry, str2)) {
                        throw C18081.m42156(c14852.f45300, str, str2);
                    }
                    InputStream m42189 = c18090.m42189(entry);
                    try {
                        byte[] m37332 = m37332(m42189, 10485776);
                        m42189.close();
                        if (m37332.length <= 10485760 && (entry.getSize() < 0 || entry.getSize() <= 10485760)) {
                            z = false;
                            C17675 m37298 = m37298(c14852, str, str2, m37332, z);
                            c18090.close();
                            return m37298;
                        }
                        z = true;
                        C17675 m372982 = m37298(c14852, str, str2, m37332, z);
                        c18090.close();
                        return m372982;
                    } finally {
                    }
                }
                throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37361(C14852 c14852, String str, String str2, C11418 c11418) {
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry == null) {
                    throw m37351();
                }
                if (entry.isDirectory()) {
                    throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                }
                if (entry.getSize() > 2097152) {
                    throw C3059.m9368("AXML_TOO_LARGE", "AXML entry is too large to decode");
                }
                m37308(c14852, str, c18090, entry, str2, c11418);
                c18090.close();
            } finally {
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("AXML_DECODE_FAILED", e2.getMessage() == null ? "Failed to decode AXML" : e2.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37327(C14852 c14852, C18090 c18090, C3545 c3545, String str) {
        C22274 m35251 = c14852.m35251();
        int m50003 = m35251.m50003(str);
        if (m50003 == 2) {
            return true;
        }
        if (m50003 == 1) {
            return false;
        }
        try {
            InputStream m42189 = c18090.m42189(c3545);
            try {
                boolean m35976 = C15206.m35976(c3545.getSize(), m42189);
                m35251.m50005(str, m35976);
                m42189.close();
                return m35976;
            } finally {
            }
        } finally {
            m35251.m50004();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37308(C14852 c14852, String str, C18090 c18090, C3545 c3545, String str2, C11418 c11418) {
        C22274 m35251 = c14852.m35251();
        int m50003 = m35251.m50003(str2);
        if (m50003 == 1) {
            throw new IOException("Not a binary AXML file");
        }
        C10247 c10247 = this.f48733;
        if (m50003 == 2) {
            C12396.m30565(c18090, c3545, c10247.m25976(c14852, this, str), c11418);
            return;
        }
        C21569 m50006 = m35251.m50006();
        m50006.m48727(str2);
        try {
            if (C12396.m30562(c18090, c3545, c10247.m25976(c14852, this, str), c11418, m50006)) {
            } else {
                throw new IOException("Not a binary AXML file");
            }
        } finally {
            m35251.m50004();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37333(C3545 c3545, C18090 c18090) {
        if (c3545.getSize() >= 0 && c3545.getSize() > 10485760) {
            return new byte[10485761];
        }
        InputStream m42189 = c18090.m42189(c3545);
        try {
            byte[] m37332 = m37332(m42189, 10485761);
            m42189.close();
            return m37332;
        } catch (Throwable th) {
            try {
                m42189.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C8745 m37380(C14852 c14852, AbstractC15440 abstractC15440, String str) {
        C8745 c8745;
        C12456 c12456 = (C12456) m37386(abstractC15440).get(str);
        if (c12456 != null && "zip_entry".equals(c12456.f37462)) {
            return new C8745(c12456.f37459, c12456.f37461);
        }
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                String str2 = "lf";
                if (entry != null && !m37374(abstractC15440).contains(str)) {
                    byte[] m37333 = m37333(entry, c18090);
                    if (m37333.length > 10485760) {
                        throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    if (m37333.length == 0) {
                        c8745 = new C8745(C14776.f45134, "lf");
                        c18090.close();
                        return c8745;
                    }
                    int m35152 = C14776.m35152(m37333.length, m37333);
                    if (m35152 < 0) {
                        m35152 = C14776.f45134;
                    }
                    int i = 0;
                    String m32619 = C13573.m32619(m37333, false);
                    if (m32619 == null) {
                        throw C3059.m9363("NOT_TEXT_ENTRY", "ZIP entry is not text.");
                    }
                    int length = m32619.length();
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        char charAt = m32619.charAt(i);
                        if (charAt == '\r') {
                            int i2 = i + 1;
                            str2 = (i2 >= length || m32619.charAt(i2) != '\n') ? "cr" : "crlf";
                        } else {
                            if (charAt == '\n') {
                                break;
                            }
                            i++;
                        }
                    }
                    C8745 c87452 = new C8745(m35152, str2);
                    c18090.close();
                    return c87452;
                }
                c8745 = new C8745(C14776.f45134, "lf");
                c18090.close();
                return c8745;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37305(C0521 c0521, int i) {
        if (i == C14776.f45120) {
            c0521.write(new byte[]{-17, -69, -65}, 0, 3);
            return;
        }
        if (i == C14776.f45129) {
            c0521.write(new byte[]{-2, -1}, 0, 2);
            return;
        }
        if (i == C14776.f45122) {
            c0521.write(new byte[]{-1, -2}, 0, 2);
        } else if (i == C14776.f45123) {
            c0521.write(new byte[]{0, 0, -2, -1}, 0, 4);
        } else if (i == C14776.f45133) {
            c0521.write(new byte[]{-1, -2, 0, 0}, 0, 4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17675 m37298(C14852 c14852, String str, String str2, byte[] bArr, boolean z) {
        String m32619 = C13573.m32619(bArr, z);
        if (m32619 != null) {
            return new C17675(C8163.m21638(m32619), z ? "entry_prefix" : "full_source", z, z ? "entry_text_byte_cap" : null, null);
        }
        throw C18081.m42155(c14852.f45300, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C5184 m37288(l.C14852 r12, l.AbstractC15440 r13, l.C20498 r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15799.m37288(l.ܳ᩻ۜ, l.ܶ᩵ܿ, l.᩶᩻ۜ):l.ۚۜۜ");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37394(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            array.add(JSON.object().add("entryName", (String) it.next()));
        }
        abstractC15440.m36526("deleted").m36526("entry.json").m36502(array.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13161 m37355(C14852 c14852, AbstractC15440 abstractC15440, String str) {
        C13161 c13161;
        if (m37374(abstractC15440).contains(str)) {
            return new C13161("missing", true);
        }
        C12456 c12456 = (C12456) m37386(abstractC15440).get(str);
        if (c12456 != null) {
            String str2 = c12456.f37462;
            return (!"zip_entry".equals(str2) || m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin").mo23127() <= 10485760) ? new C13161(str2, false) : new C13161("too_large", false);
        }
        abstractC15440.getName();
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                if (entry == null) {
                    c13161 = new C13161("missing", false);
                } else if (entry.isDirectory()) {
                    c13161 = new C13161("directory", false);
                } else {
                    if (m37327(c14852, c18090, entry, str)) {
                        C13161 c131612 = new C13161("axml", false);
                        c18090.close();
                        return c131612;
                    }
                    byte[] m37333 = m37333(entry, c18090);
                    c13161 = m37333.length > 10485760 ? new C13161("too_large", false) : m37333.length == 0 ? new C13161("zip_entry", false) : C13573.m32619(m37333, false) == null ? new C13161("binary", false) : new C13161("zip_entry", false);
                }
                c18090.close();
                return c13161;
            } finally {
            }
        } catch (Exception e) {
            throw C3059.m9368("ENTRY_READ_FAILED", e.getMessage() == null ? "Failed to read entry" : e.getMessage());
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m37389(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject add = JSON.object().add("targetType", c0244.f1522).add("target", c0244.f1529).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject add2 = add.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            array.add(add2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC15440.m36526("failures").m36526("entry.json").m36502(array.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37368(AbstractC15440 abstractC15440, String str, String str2) {
        Iterator it = m37336(abstractC15440).iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            if (str.equals(c0244.f1529) && str2.equals(c0244.f1528)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m37371(AbstractC15440 abstractC15440, final String str) {
        ArrayList m37336 = m37336(abstractC15440);
        C5378.removeIf(m37336, new Predicate() { // from class: l.ܰ᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C0244) obj).f1529);
            }
        });
        m37389(abstractC15440, m37336);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37311(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 m36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("meta.json");
        AbstractC15440 m365262 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("text.xml");
        AbstractC15440 m365263 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin");
        if (m36526.mo23120() && !m36526.mo23552()) {
            throw new IOException("Unable to delete entry overlay metadata");
        }
        if (m365262.mo23120() && !m365262.mo23552()) {
            throw new IOException("Unable to delete AXML source overlay");
        }
        if (m365263.mo23120() && !m365263.mo23552()) {
            throw new IOException("Unable to delete ZIP entry data overlay");
        }
        AbstractC15440 m365264 = m37369(abstractC15440).m36526(C18747.m43415(str));
        if (m365264.mo23120() && !m365264.mo23552()) {
            throw new IOException("Unable to delete entry overlay directory");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37313(AbstractC15440 abstractC15440, String str, AbstractC15440 abstractC154402, C8745 c8745) {
        boolean z = false;
        try {
            m37369(abstractC15440).m36526(C18747.m43415(str)).m36508();
            abstractC154402.m36501(m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin"), false, true, null);
        } catch (Exception e) {
            e = e;
        }
        try {
            m37312(m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("meta.json"), str, "zip_entry", c8745);
            AbstractC15440 m36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("text.xml");
            if (m36526.mo23120() && !m36526.mo23552()) {
                throw new IOException("Unable to remove stale AXML source overlay");
            }
            AbstractC15440 m37381 = m37381(abstractC15440, str);
            if (m37381.mo23120()) {
                m37381.mo23552();
            }
            m37371(abstractC15440, str);
            ArrayList m37374 = m37374(abstractC15440);
            m37374.remove(str);
            m37394(abstractC15440, m37374);
            m37260(abstractC15440, m37397(abstractC15440));
        } catch (Exception e2) {
            e = e2;
            z = true;
            if (z) {
                try {
                    m37311(abstractC15440, str);
                } catch (IOException e3) {
                    e.addSuppressed(e3);
                }
            }
            throw m37279(new IOException("Failed to publish patched ZIP entry overlay.", e));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37392(AbstractC15440 abstractC15440, String str) {
        return m37369(abstractC15440).m36526(C18747.m43415(str));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37401(String str) {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0) {
            throw C3059.m9364("Invalid entryName", "entryName", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("entryName", "assets/data.bin"));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m37404(C14852 c14852, String str, String str2) {
        if (str2.endsWith("/")) {
            throw m37284(c14852, str, str2, "directory");
        }
        if ("resources.arsc".equals(str2)) {
            throw m37284(c14852, str, str2, "resources_arsc");
        }
        if (c14852.f45307.contains(str2) || C18373.m42804(str2) > 0) {
            throw m37284(c14852, str, str2, "dex_entry");
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C2579 m37387(C14852 c14852, String str, String str2) {
        C2579 c2579;
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry != null) {
                    if (!entry.isDirectory()) {
                        InputStream m42189 = c18090.m42189(entry);
                        try {
                            long size = entry.getSize();
                            if (size < 0) {
                                throw new IOException("Workspace entry size is unavailable");
                            }
                            C15983 c15983 = new C15983(m42189);
                            boolean m35976 = C15206.m35976(size, c15983);
                            C15983.m37786(c15983);
                            c2579 = new C2579(true, false, m35976);
                            m42189.close();
                        } finally {
                        }
                    } else {
                        c2579 = new C2579(true, true, false);
                    }
                } else {
                    c2579 = new C2579(false, false, false);
                }
                c18090.close();
                return c2579;
            } finally {
            }
        } catch (Exception e) {
            throw m37283(c14852, str, str2, e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37328(AbstractC15440 abstractC15440, long j) {
        try {
            InputStream mo27926 = abstractC15440.mo27926();
            try {
                if (j < 0) {
                    throw new IOException("Workspace entry size is unavailable");
                }
                C15983 c15983 = new C15983(mo27926);
                boolean m35976 = C15206.m35976(j, c15983);
                C15983.m37786(c15983);
                if (mo27926 != null) {
                    mo27926.close();
                }
                return m35976;
            } finally {
            }
        } catch (IOException e) {
            throw m37377(e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            throw m37377(e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37263(AbstractC15440 abstractC15440, InterfaceC19087 interfaceC19087, C14852 c14852, String str, String str2) {
        try {
            try {
                C5401 c5401 = new C5401(abstractC15440.mo23555(false));
                try {
                    try {
                        try {
                            long mo43979 = interfaceC19087.mo43979(c5401);
                            c5401.close();
                            long j = c5401.f16814;
                            if (mo43979 == j) {
                                if (m37257(abstractC15440) == j) {
                                    return j;
                                }
                                throw m37279(new IOException("ZIP entry candidate size does not match bytes written"));
                            }
                            C3059 m9368 = C3059.m9368("WORKSPACE_ENTRY_SOURCE_INVALID", "Source byte count does not match bytes written.");
                            m37307(m9368, c14852, str, str2);
                            throw m9368;
                        } catch (IOException e) {
                            throw new C6628(e);
                        }
                    } catch (C20740 e2) {
                        throw m37352(e2.f66768);
                    } catch (C23561 unused) {
                        throw m37399(c14852, str, str2);
                    }
                } catch (Throwable th) {
                    try {
                        c5401.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw m37352(e3);
            } catch (RuntimeException e4) {
                if (!m37367(e4)) {
                    throw e4;
                }
                throw m37352((Exception) e4);
            }
        } catch (C9451 e5) {
            throw m37352((Exception) e5.f28656);
        } catch (C20740 e6) {
            throw m37352(e6.f66768);
        } catch (C23561 unused2) {
            throw m37399(c14852, str, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37262(C14852 c14852, String str, String str2, OutputStream outputStream) {
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            Throwable th = null;
            try {
                try {
                    try {
                        C3545 entry = c18090.getEntry(str2);
                        if (entry == null) {
                            C3059 m9363 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                            m37307(m9363, c14852, str, str2);
                            throw m9363;
                        }
                        if (entry.getSize() > 9007199254740991L) {
                            throw m37399(c14852, str, str2);
                        }
                        try {
                            long m37261 = m37261(c14852, str, str2, c18090.m42189(entry), outputStream);
                            try {
                                c18090.close();
                                return m37261;
                            } catch (Exception e) {
                                throw m37283(c14852, str, str2, e);
                            }
                        } catch (IOException e2) {
                            throw m37283(c14852, str, str2, e2);
                        } catch (RuntimeException e3) {
                            if (!m37367(e3)) {
                                throw e3;
                            }
                            throw m37283(c14852, str, str2, e3);
                        }
                    } catch (Throwable th2) {
                        try {
                            c18090.close();
                        } catch (Exception e4) {
                            if (0 != 0) {
                                th.addSuppressed(e4);
                            } else {
                                throw m37283(c14852, str, str2, e4);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                    throw e;
                } catch (RuntimeException e6) {
                    e = e6;
                    throw e;
                }
            } catch (Error e7) {
                e = e7;
                throw e;
            } catch (C3059 e8) {
                e = e8;
                throw e;
            }
        } catch (Exception e9) {
            throw m37283(c14852, str, str2, e9);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37261(C14852 c14852, String str, String str2, InputStream inputStream, OutputStream outputStream) {
        try {
            C17917 c17917 = new C17917(inputStream);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int read = c17917.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    if (read == 0) {
                        int read2 = c17917.read();
                        if (read2 < 0) {
                            break;
                        }
                        if (j == 9007199254740991L) {
                            throw m37399(c14852, str, str2);
                        }
                        outputStream.write(read2);
                        j++;
                    } else {
                        long j2 = read;
                        if (j > 9007199254740991L - j2) {
                            throw m37399(c14852, str, str2);
                        }
                        outputStream.write(bArr, 0, read);
                        j += j2;
                    }
                }
                c17917.close();
                return j;
            } catch (Throwable th) {
                try {
                    c17917.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C14388 e) {
            throw m37283(c14852, str, str2, e.f43352);
        } catch (C17211 e2) {
            throw m37283(c14852, str, str2, e2.f52791);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37367(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m37377(Exception exc) {
        C3059 m9368 = C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session storage failed.");
        m9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return m9368;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37352(Exception exc) {
        C3059 m9368 = C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session storage backend failed");
        m9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return m9368;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37284(C14852 c14852, String str, String str2, String str3) {
        C3059 m9363 = C3059.m9363("WORKSPACE_ENTRY_UNSUPPORTED", "Workspace ZIP entry is not supported by this copy operation.");
        m37307(m9363, c14852, str, str2);
        m9363.f9609.put("backendReason", str3);
        return m9363;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3059 m37399(C14852 c14852, String str, String str2) {
        C3059 m9368 = C3059.m9368("WORKSPACE_ENTRY_TOO_LARGE", "Workspace ZIP entry exceeds the supported JSON integer range.");
        m37307(m9368, c14852, str, str2);
        return m9368;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m37342(C14852 c14852, String str, String str2) {
        C3059 m9363 = C3059.m9363("FILE_OPERATION_STATE_UNKNOWN", "The workspace entry copy may have changed the edit session, but its final state is unknown.");
        m37307(m9363, c14852, str, str2);
        m9363.f9609.put("backendReason", "rollback_failed").put("changed", true).put("operationMode", "atomic").put("stateKnown", false);
        return m9363;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37283(C14852 c14852, String str, String str2, Exception exc) {
        C3059 m9368 = C3059.m9368("WORKSPACE_ENTRY_READ_FAILED", "Failed to read workspace ZIP entry.");
        m37307(m9368, c14852, str, str2);
        m9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return m9368;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37307(C3059 c3059, C14852 c14852, String str, String str2) {
        c3059.f9609.put("workspaceId", c14852.f45300).put("editSessionId", str == null ? JSON.NULL : JSON.value(str)).put("entryName", str2);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m37345(C14852 c14852, String str) {
        Iterator it = c14852.f45312.iterator();
        while (it.hasNext()) {
            if (str.equals(((C13874) it.next()).f41355)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37332(InputStream inputStream, int i) {
        C0521 c0521 = new C0521(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int read = inputStream.read(bArr, 0, Math.min(8192, i));
            if (read == -1) {
                break;
            }
            c0521.write(bArr, 0, read);
            i -= read;
        }
        byte[] bArr2 = c0521.f2176;
        int length = bArr2.length;
        int i2 = c0521.f2177;
        return length == i2 ? bArr2 : Arrays.copyOf(bArr2, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37351() {
        return C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37285(C14852 c14852, String str, C21412 c21412) {
        boolean z;
        ArrayList arrayList = c21412.f68962;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if ("axml".equals(((C0244) it.next()).f1522)) {
                z = true;
                break;
            }
        }
        return m37286(c14852, str, true, z ? "EDIT_TEXT_PREPARE_FAILED_IN_SESSION" : "SMALI_COMPILE_FAILED_IN_SESSION", z ? "Saved edit session has AXML encode failures." : "Smali compile failed in saved edit session.", m37264(arrayList), (String) null, (String) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37286(C14852 c14852, String str, boolean z, String str2, String str3, JSONArray jSONArray, String str4, String str5) {
        JSONValue jSONValue;
        JSONObject object = JSON.object();
        if (c14852 != null) {
            object.add("workspaceId", c14852.f45300);
        }
        if (str != null) {
            object.add("editSessionId", str);
        }
        if (str4 != null && str5 != null) {
            object.add("locator", C13169.m31924(str4, str5));
        }
        if (jSONArray != null) {
            object.add("overlaySaved", z).add("failures", jSONArray);
            if (str4 == null && jSONArray.size() > 0 && (jSONValue = jSONArray.get(0).asObject().get("locator")) != null && !jSONValue.isNull()) {
                object.add("locator", jSONValue);
            }
        }
        return C3059.m9365(str2, str3, "fatal", JSON.array(), object);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m37264(ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject add = JSON.object().add("locator", C13169.m31959(c0244.f1522, c0244.f1529)).add("className", c0244.f1521).add("dexEntryName", c0244.f1525).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject add2 = add.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            array.add(add2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return array;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37258(C14852 c14852, AbstractC15440 abstractC15440, final C10340 c10340, String str) {
        final String m43415 = C18747.m43415(str);
        if (m37358(abstractC15440, c10340, m43415) != null || m37331(abstractC15440, c10340, m43415)) {
            return 0;
        }
        C19513 m37299 = m37299(c14852, c10340, str, m43415);
        C0244 c0244 = m37299.f63057;
        if (c0244 != null) {
            String str2 = c0244.f1524;
            Integer num = c0244.f1526;
            Integer num2 = c0244.f1523;
            try {
                ArrayList m37338 = m37338(abstractC15440);
                C5378.removeIf(m37338, new Predicate() { // from class: l.ܿܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C0244 c02442 = (C0244) obj;
                        C10340 c103402 = C10340.this;
                        if (c103402.f31139.equals(c02442.f1521) && c103402.f31140.equals(c02442.f1525)) {
                            return m43415.equals(c02442.f1528);
                        }
                        return false;
                    }
                });
                String str3 = c10340.f31139;
                m37338.add(new C0244("smali_class", str3, str3, c10340.f31140, m43415, "SMALI_COMPILE_FAILED_IN_SESSION", str2, num, num2));
                m37372(abstractC15440, m37338);
                return 0;
            } catch (IOException e) {
                throw m37279(e);
            }
        }
        try {
            m37319(abstractC15440, c10340, m37299.f63056);
            try {
                ArrayList m373382 = m37338(abstractC15440);
                C5378.removeIf(m373382, new Predicate() { // from class: l.ܳܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C0244 c02442 = (C0244) obj;
                        C10340 c103402 = C10340.this;
                        if (c103402.f31139.equals(c02442.f1521) && c103402.f31140.equals(c02442.f1525)) {
                            return m43415.equals(c02442.f1528);
                        }
                        return false;
                    }
                });
                m37372(abstractC15440, m373382);
                return 1;
            } catch (IOException e2) {
                throw m37279(e2);
            }
        } catch (IOException e3) {
            throw m37279(e3);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static String m37398(AbstractC15440 abstractC15440) {
        try {
            return new String(abstractC15440.m36506(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37320(AbstractC15440 abstractC15440, C11418 c11418) {
        C15217 c15217 = new C15217();
        c15217.m36012(c11418);
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC15440.mo27926(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        c15217.m36009();
                        inputStreamReader.close();
                        return;
                    } else {
                        for (int i = 0; i < read; i++) {
                            c15217.m36010(cArr[i]);
                        }
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37363(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            abstractC15440.mo23552();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37301(C14852 c14852, AbstractC15440 abstractC15440, String str, String str2, String str3, String str4, String str5, String str6) {
        C1167 c1167;
        ArrayList arrayList = new ArrayList();
        String[] split = str2.split("\\n", -1);
        int length = split.length;
        if (length > 0 && split[length - 1].isEmpty()) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String str7 = split[i];
            if (str7.endsWith("\r")) {
                str7 = C15472.m36561(1, 0, str7);
            }
            arrayList.add(str7);
        }
        Iterator it = arrayList.iterator();
        String str8 = null;
        while (it.hasNext()) {
            String m37267 = m37267((String) it.next());
            if (m37267 != null) {
                if (str8 != null) {
                    throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain only one .class directive.");
                }
                str8 = m37267;
            }
        }
        if (str8 == null) {
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
        }
        if (!str.equals(str8)) {
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali .class descriptor does not match target class.");
        }
        String m37270 = m37270(c14852, abstractC15440, str);
        C10340 c10340 = new C10340(m37270, str);
        String m43415 = C18747.m43415(str2);
        C18807 m37358 = m37358(abstractC15440, c10340, m43415);
        if (m37358 == null) {
            C19513 m37299 = m37299(c14852, c10340, str2, m43415);
            C0244 c0244 = m37299.f63057;
            if (c0244 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c0244);
                throw m37286(c14852, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; edit_text candidate was not saved.", m37264(arrayList2), str4, str5);
            }
            c1167 = m37299.f63056;
        } else {
            c1167 = new C1167(m43415, m37358.f59354);
        }
        m37318(abstractC15440, new C8223("dex", str, m37270, m37357(abstractC15440, c10340).mo23119()), str2.getBytes(StandardCharsets.UTF_8), (String) null, (C8745) null);
        try {
            m37319(abstractC15440, c10340, c1167);
        } catch (Exception e) {
            C19926.m45879("MT MCP text edit cache publish failed, editSessionId=".concat(str3), e);
        }
        return m37300(c14852, str3, str4, str5, str6, (C15923) null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m37341(String str) {
        if (str == null || str.isEmpty()) {
            throw m37353(str);
        }
        String m42807 = C18373.m42807(str);
        if (!m42807.startsWith("L") || !m42807.endsWith(l.b) || m42807.length() <= 3 || m42807.indexOf(92) >= 0 || m42807.indexOf("..") >= 0 || m42807.indexOf("//") >= 0 || m42807.indexOf(91) >= 0 || m42807.indexOf(40) >= 0 || m42807.indexOf(41) >= 0 || m42807.indexOf(59) != m42807.length() - 1) {
            throw m37353(str);
        }
        String m36561 = C15472.m36561(1, 1, m42807);
        if (m36561.startsWith("/") || m36561.endsWith("/")) {
            throw m37353(str);
        }
        return m42807;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37353(String str) {
        return C3059.m9365("INVALID_SMALI_CLASS_DESCRIPTOR", "Invalid Smali class descriptor.", "fatal", JSON.array(), JSON.object().add("badValue", str == null ? JSON.NULL : JSON.value(str)));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m37378(String str) {
        return C3059.m9364("Invalid targetType", "targetType", JSON.value(str), JSON.array("smali_class", "smali_method", "axml", "zip_entry"), JSON.object().add("targetType", "zip_entry"));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m37406(String str) {
        int i;
        if (str != null && str.length() == 8) {
            while (i < str.length()) {
                char charAt = str.charAt(i);
                i = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37277() {
        return C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session overlay is corrupt.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37279(Exception exc) {
        return C3059.m9368("EDIT_SESSION_STORAGE_FAILED", exc.getMessage() == null ? "Edit session storage failed." : exc.getMessage());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m37376() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toLowerCase(Locale.ROOT);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37268(String str, int i, int i2, String str2) {
        C16505 c16505;
        if (str.isEmpty()) {
            c16505 = new C16505(new C10862[]{new C10862(str, 0, 0)});
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    arrayList.add(new C10862(str, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 < str.length()) {
                arrayList.add(new C10862(str, i3, str.length()));
            }
            c16505 = new C16505((C10862[]) arrayList.toArray(new C10862[0]));
        }
        int m38872 = c16505.m38872();
        int max = Math.max(0, Math.min(i, m38872));
        int max2 = Math.max(max, Math.min(i2, m38872));
        if (max >= max2) {
            return C8163.m21638(str);
        }
        int length = max == m38872 ? str.length() : c16505.m38873(max).f32630;
        int i5 = c16505.m38873(max2 - 1).f32629;
        if (i5 < str.length() && str.charAt(i5) == '\n') {
            i5++;
        }
        String m21638 = C8163.m21638(str2);
        StringBuilder sb = new StringBuilder(m21638.length() + (str.length() - (i5 - length)) + 1);
        sb.append((CharSequence) str, 0, length);
        if (!m21638.isEmpty()) {
            sb.append(m21638);
            if (i5 < str.length() && !m21638.endsWith("\n")) {
                sb.append('\n');
            }
        }
        sb.append((CharSequence) str, i5, str.length());
        return C8163.m21638(sb.toString());
    }
}
