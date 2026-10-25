package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Iterator;

/* compiled from: N7AJ */
/* renamed from: l.۠᩷ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8420 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25794 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final char[] f25795 = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f25796 = new SecureRandom();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f25797 = C16293.f50118.m36526("mcp");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m22058() {
        return this.f25797;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22055(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 m36526 = this.f25797.m36526(str);
        return !m36526.mo23120() && abstractC15440.mo23551(m36526);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m22059(String str) {
        return this.f25797.m36526(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC15440 m22054() {
        /*
            r9 = this;
            l.ܶ᩵ܿ r0 = r9.f25797
            boolean r1 = r0.mo23120()
            r2 = 1
            r3 = 0
            r4 = 0
            r0.m36508()     // Catch: java.lang.RuntimeException -> L74 java.io.IOException -> L76
            if (r1 != 0) goto L16
            boolean r5 = r0.mo23120()     // Catch: java.lang.RuntimeException -> L74 java.io.IOException -> L76
            if (r5 == 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            r6 = 100
            if (r4 >= r6) goto L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            r6.<init>()     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            java.lang.String r7 = ".tmp-"
            r6.append(r7)     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            r6.append(r7)     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            l.ܶ᩵ܿ r6 = r0.m36526(r6)     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            boolean r7 = r6.mo23120()     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L60
            if (r7 != 0) goto L5b
            r6.m36508()     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L60
            java.lang.String r3 = "entries"
            l.ܶ᩵ܿ r3 = r6.m36526(r3)     // Catch: java.lang.RuntimeException -> L56 java.io.IOException -> L58
            r3.m36508()     // Catch: java.lang.RuntimeException -> L56 java.io.IOException -> L58
            java.lang.String r3 = "cache"
            l.ܶ᩵ܿ r3 = r6.m36526(r3)     // Catch: java.lang.RuntimeException -> L56 java.io.IOException -> L58
            java.lang.String r4 = "dex"
            l.ܶ᩵ܿ r3 = r3.m36526(r4)     // Catch: java.lang.RuntimeException -> L56 java.io.IOException -> L58
            r3.m36508()     // Catch: java.lang.RuntimeException -> L56 java.io.IOException -> L58
            return r6
        L56:
            r3 = move-exception
            goto L59
        L58:
            r3 = move-exception
        L59:
            r4 = 1
            goto L62
        L5b:
            int r4 = r4 + 1
            goto L17
        L5e:
            r3 = move-exception
            goto L61
        L60:
            r3 = move-exception
        L61:
            r4 = r5
        L62:
            r5 = r3
            r3 = r6
            goto L77
        L65:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            java.lang.String r6 = "Unable to create temporary workspace"
            r4.<init>(r6)     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
            throw r4     // Catch: java.lang.RuntimeException -> L6d java.io.IOException -> L6f
        L6d:
            r4 = move-exception
            goto L70
        L6f:
            r4 = move-exception
        L70:
            r8 = r5
            r5 = r4
            r4 = r8
            goto L77
        L74:
            r5 = move-exception
            goto L77
        L76:
            r5 = move-exception
        L77:
            if (r3 == 0) goto L83
            boolean r6 = r3.mo23120()
            if (r6 == 0) goto L83
            m22045(r3)
            r4 = 1
        L83:
            if (r1 != 0) goto L8c
            boolean r0 = r0.mo23120()
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r4
        L8d:
            if (r2 == 0) goto L92
            l.C15972.m37753()
        L92:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8420.m22054():l.ܶ᩵ܿ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m22056() {
        for (int i = 0; i < 100; i++) {
            char[] cArr = new char[8];
            for (int i2 = 0; i2 < 8; i2++) {
                SecureRandom secureRandom = f25796;
                char[] cArr2 = f25795;
                cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
            }
            String str = new String(cArr);
            if (!this.f25797.m36526(str).mo23120()) {
                return str;
            }
        }
        throw new IOException("Unable to allocate workspace id");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22048(AbstractC15440 abstractC15440) {
        m22050(abstractC15440);
        if (abstractC15440.mo23120()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m22050(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m22050((AbstractC15440) it.next());
                }
            }
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22045(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m22045((AbstractC15440) it.next());
                }
            }
            abstractC15440.mo23552();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22039(C18090 c18090, AbstractC15440 abstractC15440) {
        try {
            MessageDigest m34534 = C14460.m34534();
            InterfaceC7889 m42214 = c18090.m42214();
            m42214.seek(0L);
            long length = m42214.length();
            byte[] bArr = new byte[8192];
            OutputStream mo23555 = abstractC15440.mo23555(false);
            while (length > 0) {
                try {
                    int read = m42214.read(bArr, 0, (int) Math.min(8192, length));
                    if (read < 0) {
                        throw new IOException("Unexpected EOF while copying archive");
                    }
                    m34534.update(bArr, 0, read);
                    mo23555.write(bArr, 0, read);
                    length -= read;
                } finally {
                }
            }
            if (mo23555 != null) {
                mo23555.close();
            }
            return C14460.m34531(m34534.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C0658 m22053(l.AbstractC15440 r17) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8420.m22053(l.ܶ᩵ܿ):l.֡᩷ۜ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0658 m22057(String str) {
        if (!m22051(str)) {
            throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        }
        try {
            C0658 m22047 = m22047(this.f25797.m36526(str), str);
            m22040(m22047);
            return m22047;
        } catch (C1364 unused) {
            throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        } catch (C3059 e) {
            throw e;
        } catch (C5598 e2) {
            throw C18081.m42149(e2.f17311, e2.f17312);
        } catch (Exception unused2) {
            throw C3059.m9367(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0658 m22052(String str) {
        if (m22051(str)) {
            AbstractC15440 m36526 = this.f25797.m36526(str);
            try {
                JSONObject m22049 = m22049(m36526);
                if (m22049.getInt("schemaVersion", -1) != 1) {
                    throw new C1364();
                }
                if (!str.equals(m22049.getString("workspaceId", null))) {
                    throw new C1364();
                }
                C0658 c0658 = new C0658(m36526, str);
                c0658.f2540 = m22049.getBoolean("temporary", false);
                return c0658;
            } catch (C1364 unused) {
                throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
            }
        }
        throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22041(AbstractC15440 abstractC15440, long j) {
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC15440.m36526("metadata.json").m36506(), StandardCharsets.UTF_8));
            while (jSONObject.contains("lastAccessedAt")) {
                jSONObject.remove("lastAccessedAt");
            }
            jSONObject.put("lastAccessedAt", j);
            m22042(abstractC15440, jSONObject);
        } catch (Exception e) {
            throw new IOException("Unable to read metadata", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22042(AbstractC15440 abstractC15440, JSONObject jSONObject) {
        AbstractC15440 m36526 = abstractC15440.m36526("metadata.json");
        m36526.mo35195();
        AbstractC15440 m36520 = m36526.m36520(".metadata");
        try {
            m36520.m36502(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            m36520.mo23558().mo10993(m36526);
        } finally {
            m36520.mo23552();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static JSONObject m22049(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("metadata.json");
        if (!m36526.mo23119()) {
            throw new C1364();
        }
        try {
            return new JSONObject(new String(m36526.m36506(), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            throw new C1364();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22044(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526("cache").m36526("dex").m36526(str + ".type_index");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m22051(String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        if (r13.f2552 >= 0) goto L56;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C0658 m22047(l.AbstractC15440 r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8420.m22047(l.ܶ᩵ܿ, java.lang.String):l.֡᩷ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22040(C0658 c0658) {
        String str = c0658.f2543;
        AbstractC15440 abstractC15440 = c0658.f2547;
        if (!"absent".equals(str) && !"available".equals(str) && !"extract_error".equals(str) && !"parse_error".equals(str)) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
        if (!abstractC15440.m36526("original.apk").mo23119()) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
        Iterator it = c0658.f2544.iterator();
        while (it.hasNext()) {
            C19710 c19710 = (C19710) it.next();
            String str2 = c19710.f63672;
            String str3 = c19710.f63669;
            if (!"available".equals(str2) && !d.O.equals(str2) && !"skipped".equals(str2)) {
                throw C18081.m42149(c0658.f2546, c0658.f2540);
            }
            if ("available".equals(c19710.f63672) && (str3 == null || !abstractC15440.m36526("entries").m36526(str3).mo23119() || !m22044(abstractC15440, str3).mo23119())) {
                throw C18081.m42149(c0658.f2546, c0658.f2540);
            }
        }
        if (("available".equals(c0658.f2543) || "parse_error".equals(c0658.f2543)) && !abstractC15440.m36526("entries").m36526("resources.arsc").mo23119()) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22043(AbstractC15440 abstractC15440, C0658 c0658) {
        String str;
        JSONArray array = JSON.array();
        Iterator it = c0658.f2544.iterator();
        while (it.hasNext()) {
            C19710 c19710 = (C19710) it.next();
            array.add(JSON.object().add("entryName", c19710.f63669).add(c.a, c19710.f63672).add(d.O, c19710.f63670).add("indexCachePath", c19710.f63671));
        }
        JSONObject add = JSON.object().add("schemaVersion", 1).add("workspaceId", c0658.f2550).add("temporary", c0658.f2540).add("sourcePath", c0658.f2546).add("sourceSize", c0658.f2539).add("sourceLastModified", c0658.f2542).add("originalSha256", c0658.f2548).add("createdAt", c0658.f2538).add("lastAccessedAt", c0658.f2549).add("dexFiles", array).add("resourceStatus", c0658.f2543).add("resourceError", c0658.f2545);
        if ("available".equals(c0658.f2543) && (str = c0658.f2551) != null && c0658.f2552 >= 0) {
            add.add("resourceSha256", str);
            add.add("resourceLength", c0658.f2552);
        }
        m22042(abstractC15440, add);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m22046(AbstractC15440 abstractC15440) {
        try {
            MessageDigest m34534 = C14460.m34534();
            C14460.m34527(m34534, abstractC15440.mo27926());
            return C14460.m34531(m34534.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
