package l;

import bin.mt.json.JSONObject;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: I75V */
/* renamed from: l.ܰ۟᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13682 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f40835 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m32921(C14852 c14852, C15799 c15799, String str, String str2, InterfaceC22855 interfaceC22855) {
        C7333 m32923;
        try {
            try {
                if (!str.isEmpty()) {
                    C3284 m37434 = c15799.m37434(c14852, str, str2);
                    if (m37434 != null) {
                        AbstractC15440 abstractC15440 = m37434.f10327;
                        if (!abstractC15440.mo23119() || !m32928(abstractC15440)) {
                            throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                        }
                        m32923 = new C7333(abstractC15440, abstractC15440.mo23127(), 0L, false, false);
                    } else {
                        C4695 m37431 = c15799.m37431(c14852, str, str2);
                        if (m37431 != null) {
                            byte[] bArr = m37431.f14917;
                            if (!m32927(bArr)) {
                                throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                            }
                            AbstractC15440 m36526 = C16293.f50110.m36526("apk_mcp_native");
                            try {
                                m32925(m36526);
                                m36526.m36508();
                                AbstractC15440 m365262 = m36526.m36526("apk-native-" + UUID.randomUUID() + ".bin");
                                m365262.m36502(bArr);
                                m32923 = new C7333(m365262, bArr.length, 0L, true, false);
                            } catch (IOException | RuntimeException unused) {
                                throw C3059.m9368("NATIVE_CACHE_UNAVAILABLE", "Failed to prepare native entry cache.");
                            }
                        } else if ("resources.arsc".equals(str2)) {
                            throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                        }
                    }
                    Object mo14558 = interfaceC22855.mo14558(m32923);
                    m32923.close();
                    return mo14558;
                }
                Object mo145582 = interfaceC22855.mo14558(m32923);
                m32923.close();
                return mo145582;
            } catch (Throwable th) {
                try {
                    m32923.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            if (!m32923.f22531 && m32923.f22529) {
                String str3 = e.f9610;
                if ("NATIVE_ANALYZER_FAILED".equals(str3) || "NATIVE_ENTRY_NOT_ELF".equals(str3) || "ENTRY_READ_FAILED".equals(str3) || "PATCH_EXPECTED_MISMATCH".equals(str3)) {
                    m32923.close();
                    C7333 m329232 = m32923(c14852, str2, true);
                    try {
                        Object mo145583 = interfaceC22855.mo14558(m329232);
                        m329232.close();
                        return mo145583;
                    } catch (Throwable th3) {
                        try {
                            m329232.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            throw e;
        }
        m32923 = m32923(c14852, str2, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7333 m32923(C14852 c14852, String str, boolean z) {
        int i;
        try {
            try {
                C18090 c18090 = new C18090(c14852.m35253());
                try {
                    C3545 m32922 = m32922(c18090, str);
                    long size = m32922.getSize();
                    long m10791 = m32922.m10791();
                    C8420 c8420 = c14852.f45294;
                    AbstractC15440 abstractC15440 = c14852.f45298;
                    c8420.getClass();
                    AbstractC15440 m36526 = abstractC15440.m36526("cache").m36526(UMConfigure.WRAPER_TYPE_NATIVE);
                    String m34531 = C14460.m34531(C14460.m34534().digest(str.getBytes(StandardCharsets.UTF_8)));
                    AbstractC15440 m365262 = m36526.m36526(m34531.concat(".bin"));
                    AbstractC15440 m365263 = m36526.m36526(m34531.concat(".json"));
                    if (z) {
                        i = 2;
                    } else {
                        i = 2;
                        if (m32926(m365263, m365262, str, size, m10791)) {
                            if (m32928(m365262)) {
                                C7333 c7333 = new C7333(m365262, size, m10791, false, true);
                                c18090.close();
                                return c7333;
                            }
                            AbstractC15440[] abstractC15440Arr = {m365263, m365262};
                            for (int i2 = 0; i2 < 2; i2++) {
                                abstractC15440Arr[i2].mo23552();
                            }
                        }
                    }
                    AbstractC15440[] abstractC15440Arr2 = new AbstractC15440[i];
                    abstractC15440Arr2[0] = m365263;
                    abstractC15440Arr2[1] = m365262;
                    for (int i3 = 0; i3 < i; i3++) {
                        abstractC15440Arr2[i3].mo23552();
                    }
                    C7333 m32924 = m32924(c18090, m32922, str, size, m10791, m36526, m365262, m365263);
                    c18090.close();
                    return m32924;
                } finally {
                }
            } catch (C3059 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read ZIP entry.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32926(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, String str, long j, long j2) {
        if (!abstractC15440.mo23119() || !abstractC154402.mo23119() || abstractC154402.mo23127() != j) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC15440.m36506(), StandardCharsets.UTF_8));
            if (jSONObject.getInt("version", -1) == 1 && str.equals(jSONObject.getString("entryName", null)) && jSONObject.getLong("size", -1L) == j) {
                return jSONObject.getLong("unsignedCrc", -1L) == j2;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m32922(C18090 c18090, String str) {
        C3545 entry = c18090.getEntry(str);
        if (entry == null) {
            throw C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
        }
        if (entry.isDirectory()) {
            throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
        }
        if (entry.getSize() >= 0) {
            return entry;
        }
        throw C3059.m9368("ENTRY_READ_FAILED", "ZIP entry size is unavailable.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32927(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[0];
            byte[] bArr2 = f40835;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x001e, code lost:
    
        r2 = m32927(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0022, code lost:
    
        r1.close();
        r1 = r2;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7333 m32924(l.C18090 r14, l.C3545 r15, java.lang.String r16, long r17, long r19, l.AbstractC15440 r21, l.AbstractC15440 r22, l.AbstractC15440 r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13682.m32924(l.ᩳܰۡ, l.ۗ᩺ۡ, java.lang.String, long, long, l.ܶ᩵ܿ, l.ܶ᩵ܿ, l.ܶ᩵ܿ):l.۟۟᩻");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32928(AbstractC15440 abstractC15440) {
        try {
            InputStream mo27926 = abstractC15440.mo27926();
            try {
                byte[] bArr = f40835;
                for (int i = 0; i < 4; i++) {
                    if (mo27926.read() != (bArr[i] & 255)) {
                        mo27926.close();
                        return false;
                    }
                }
                if (mo27926 != null) {
                    mo27926.close();
                }
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32925(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23113()) {
            long currentTimeMillis = System.currentTimeMillis() - 86400000;
            for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
                if (abstractC154402.getName().startsWith("apk-native-") && abstractC154402.mo23117() < currentTimeMillis) {
                    abstractC154402.mo23552();
                }
            }
        }
    }
}
