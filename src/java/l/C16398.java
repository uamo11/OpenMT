package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: RAQH */
/* renamed from: l.ܽۘᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16398 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f50460 = new C1315(1000);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50461;

    static {
        AbstractC15440 m36526 = C16293.f50117.m36526("encoding");
        f50461 = m36526;
        if (m36526.mo23120()) {
            try {
                C12951 m31485 = C12951.m31485(m36526.m36506());
                int m31494 = m31485.m31494();
                for (int i = 0; i < m31494; i++) {
                    f50460.m4554(m31485.m31506(), m31485.m31506());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38654(String str, String str2) {
        C1315 c1315 = f50460;
        c1315.m4554(str, str2);
        C10130 c10130 = new C10130();
        LinkedHashMap m4555 = c1315.m4555();
        c10130.mo13231(m4555.size());
        for (Map.Entry entry : m4555.entrySet()) {
            c10130.m25439((String) entry.getKey());
            c10130.m25439((String) entry.getValue());
        }
        AbstractC15440 abstractC15440 = f50461;
        synchronized (abstractC15440) {
            try {
                abstractC15440.m36502(c10130.m25429());
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38652(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        MessageDigest m34526 = C14460.m34526();
        m34526.update(bArr, 0, i);
        return (String) f50460.m4553(C14460.m34531(m34526.digest()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38653(String str, int i, byte[] bArr) {
        if (i != 0) {
            MessageDigest m34526 = C14460.m34526();
            m34526.update(bArr, 0, i);
            m38654(C14460.m34531(m34526.digest()), str);
        }
    }
}
