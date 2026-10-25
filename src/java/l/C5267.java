package l;

import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: D6W4 */
/* renamed from: l.ۚۢۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5267 implements InterfaceC6005 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C5267 f16473;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f16475;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ScheduledExecutorService f16476;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C19379 f16477;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f16478;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f16479;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f16480;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1033 f16481;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f16474 = new byte[64];

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f16472 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15849());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3856 m15184(String str) {
        String encodeToString;
        Map map;
        String str2;
        m15183(str);
        C19379 c19379 = this.f16477;
        if (c19379.f62726.size() >= 32) {
            throw new IllegalStateException("MCP credential limit reached");
        }
        do {
            byte[] bArr = new byte[12];
            this.f16479.nextBytes(bArr);
            encodeToString = Base64.encodeToString(bArr, 11);
            map = c19379.f62725;
        } while (map.containsKey(encodeToString));
        byte[] bArr2 = new byte[32];
        this.f16479.nextBytes(bArr2);
        String encodeToString2 = Base64.encodeToString(bArr2, 11);
        str2 = "mtmcp_" + encodeToString + "_" + encodeToString2;
        C18673 c18673 = new C18673(encodeToString, str, C14460.m34531(C14460.m34534().digest(Base64.decode(encodeToString2, 11))), str2, System.currentTimeMillis(), 0L, "");
        ArrayList arrayList = new ArrayList(c19379.f62726);
        arrayList.add(c18673);
        m15179(arrayList);
        return new C3856(str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15187(String str, String str2) {
        Map map;
        String str3;
        String str4;
        m15183(str2);
        ArrayList arrayList = new ArrayList(this.f16477.f62726);
        map = this.f16477.f62725;
        C18673 c18673 = (C18673) map.get(str);
        if (c18673 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        int indexOf = arrayList.indexOf(c18673);
        str3 = c18673.f59013;
        str4 = c18673.f59014;
        arrayList.set(indexOf, new C18673(str, str2, str3, str4, c18673.f59009, c18673.f59010, c18673.f59012));
        m15179(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15188(boolean z) {
        C19379 c19379 = this.f16477;
        if (z && (!c19379.f62724 || c19379.f62726.isEmpty())) {
            throw new IllegalStateException("MCP authentication requires a credential");
        }
        this.f16480.edit().putBoolean("amae", z).apply();
        this.f16477 = new C19379(z, c19379.f62724, 1 + c19379.f62727, c19379.f62726);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C18673 m15189(String str) {
        Map map;
        String str2;
        String str3;
        map = this.f16477.f62725;
        C18673 c18673 = (C18673) map.get(str);
        if (c18673 == null) {
            return null;
        }
        C0327 c0327 = (C0327) this.f16478.get(str);
        if (c0327 != null) {
            String str4 = c18673.f59008;
            str2 = c18673.f59013;
            str3 = c18673.f59014;
            c18673 = new C18673(str, str4, str2, str3, c18673.f59009, c0327.f1718, c0327.f1719);
        }
        return c18673;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized String m15191(String str) {
        Map map;
        String str2;
        String str3;
        map = this.f16477.f62725;
        C18673 c18673 = (C18673) map.get(str);
        if (c18673 != null) {
            str3 = c18673.f59014;
            if (!str3.isEmpty()) {
                str2 = c18673.f59014;
            }
        }
        str2 = null;
        return str2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m15192(String str) {
        Map map;
        ArrayList arrayList = new ArrayList(this.f16477.f62726);
        map = this.f16477.f62725;
        C18673 c18673 = (C18673) map.get(str);
        if (c18673 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.remove(c18673);
        m15179(arrayList);
        this.f16478.remove(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized C5267 m15182() {
        C5267 c5267;
        synchronized (C5267.class) {
            if (f16473 == null) {
                f16473 = new C5267(C4925.f15527, new File(C4925.m14335().getNoBackupFilesDir(), "apk-mcp-credentials.json"));
            }
            c5267 = f16473;
        }
        return c5267;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15186() {
        ScheduledExecutorService scheduledExecutorService;
        RunnableC2445 runnableC2445;
        Map map;
        String str;
        String str2;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C18673 c18673 : this.f16477.f62726) {
                C0327 c0327 = (C0327) this.f16478.remove(c18673.f59011);
                if (c0327 != null) {
                    String str3 = c18673.f59011;
                    String str4 = c18673.f59008;
                    str = c18673.f59013;
                    str2 = c18673.f59014;
                    c18673 = new C18673(str3, str4, str, str2, c18673.f59009, c0327.f1718, c0327.f1719);
                }
                arrayList.add(c18673);
                z |= c0327 != null;
            }
            Set keySet = this.f16478.keySet();
            map = this.f16477.f62725;
            keySet.retainAll(map.keySet());
            if (z && this.f16477.f62724) {
                m15179(arrayList);
            }
            this.f16475.set(false);
        } catch (IOException unused) {
            this.f16475.set(false);
            if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
                scheduledExecutorService = this.f16476;
                runnableC2445 = new RunnableC2445(this);
            }
        } catch (Throwable th) {
            this.f16475.set(false);
            if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
                this.f16476.schedule(new RunnableC2445(this), 30L, TimeUnit.SECONDS);
            }
            throw th;
        }
        if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
            scheduledExecutorService = this.f16476;
            runnableC2445 = new RunnableC2445(this);
            scheduledExecutorService.schedule(runnableC2445, 30L, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    public C5267(InterfaceC12344 interfaceC12344, File file) {
        ArrayList arrayList;
        boolean z;
        ScheduledExecutorService scheduledExecutorService = f16472;
        this.f16479 = new SecureRandom();
        this.f16478 = new ConcurrentMapC10942();
        this.f16475 = new AtomicBoolean();
        this.f16480 = interfaceC12344;
        this.f16476 = scheduledExecutorService;
        C1033 c1033 = new C1033(file);
        this.f16481 = c1033;
        boolean z2 = interfaceC12344.getBoolean("amae", false);
        try {
            arrayList = c1033.m3572();
            z = true;
        } catch (IOException unused) {
            arrayList = Collections.EMPTY_LIST;
            z = false;
        }
        this.f16477 = new C19379(z2, z, 0L, arrayList);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19379 m15190() {
        return this.f16477;
    }

    @Override // l.InterfaceC6005
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12355 mo15185(C15996 c15996) {
        String str;
        Map map;
        String str2;
        byte[] bytes;
        C19379 c19379 = this.f16477;
        if (!c19379.f62728) {
            return C12355.m29974();
        }
        List m37806 = c15996.m37806();
        C18673 c18673 = null;
        if (m37806.size() == 1 && c19379.f62724 && (str = (String) m37806.get(0)) != null && str.length() <= 512) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    }
                    i++;
                } else {
                    String trim = str.trim();
                    int indexOf = trim.indexOf(32);
                    if (indexOf == 6 && trim.regionMatches(true, 0, "Bearer", 0, 6)) {
                        String trim2 = trim.substring(indexOf + 1).trim();
                        if (trim2.length() == 66 && trim2.startsWith("mtmcp_") && trim2.charAt(22) == '_') {
                            String substring = trim2.substring(6, 22);
                            String substring2 = trim2.substring(23);
                            if (m15180(16, substring) && m15180(43, substring2)) {
                                byte[] decode = Base64.decode(substring2, 11);
                                if (decode.length == 32 && Base64.encodeToString(decode, 11).equals(substring2)) {
                                    map = c19379.f62725;
                                    C18673 c186732 = (C18673) map.get(substring);
                                    if (c186732 == null) {
                                        bytes = f16474;
                                    } else {
                                        str2 = c186732.f59013;
                                        bytes = str2.getBytes(StandardCharsets.US_ASCII);
                                    }
                                    if (MessageDigest.isEqual(bytes, C14460.m34531(C14460.m34534().digest(decode)).getBytes(StandardCharsets.US_ASCII))) {
                                        c18673 = c186732;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c18673 == null) {
            C8236 m13784 = AbstractC4708.m13784(EnumC1180.UNAUTHORIZED, "text/plain", "Unauthorized");
            m13784.m21805("WWW-Authenticate", "Bearer realm=\"MT MCP\"");
            return C12355.m29975(m13784);
        }
        String m37805 = c15996.m37805();
        ConcurrentMapC10942 concurrentMapC10942 = this.f16478;
        String str3 = c18673.f59011;
        long currentTimeMillis = System.currentTimeMillis();
        if (m37805 == null || m37805.length() > 128) {
            m37805 = "";
        }
        concurrentMapC10942.put(str3, new C0327(currentTimeMillis, m37805));
        if (this.f16475.compareAndSet(false, true)) {
            this.f16476.schedule(new RunnableC2445(this), 30L, TimeUnit.SECONDS);
        }
        return C12355.m29974();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15179(ArrayList arrayList) {
        C19379 c19379 = this.f16477;
        try {
            this.f16481.m3573(arrayList);
            this.f16477 = new C19379(c19379.f62728, true, c19379.f62727 + 1, arrayList);
        } catch (IOException unused) {
            this.f16477 = new C19379(c19379.f62728, false, c19379.f62727 + 1, Collections.EMPTY_LIST);
            throw new IOException("Cannot save MCP credentials");
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m15183(String str) {
        if (str != null && !str.trim().isEmpty()) {
            int i = 0;
            if (str.codePointCount(0, str.length()) <= 64) {
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (Character.isHighSurrogate(charAt)) {
                        i++;
                        if (i >= str.length() || !Character.isLowSurrogate(str.charAt(i))) {
                            throw new IllegalArgumentException("Invalid MCP client name");
                        }
                    } else if (Character.isLowSurrogate(charAt) || Character.isISOControl(charAt)) {
                        throw new IllegalArgumentException("Invalid MCP client name");
                    }
                    i++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid MCP client name");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15181(String str, String str2, String str3) {
        if (str.length() != 66) {
            return false;
        }
        if (!str.startsWith("mtmcp_" + str2 + "_")) {
            return false;
        }
        String substring = str.substring(23);
        if (!m15180(43, substring)) {
            return false;
        }
        byte[] decode = Base64.decode(substring, 11);
        return decode.length == 32 && Base64.encodeToString(decode, 11).equals(substring) && C14460.m34531(C14460.m34534().digest(decode)).equals(str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15180(int i, String str) {
        if (str.length() == i) {
            for (int i2 = 0; i2 < i; i2++) {
                char charAt = str.charAt(i2);
                if ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }
}
