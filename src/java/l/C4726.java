package l;

import android.content.pm.PackageInfo;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* compiled from: E9SU */
/* renamed from: l.ۙܶۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4726 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f15005;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f15006;

    static {
        AbstractC15440 m36526 = C16293.f50117.m36526("osmd");
        f15005 = m36526;
        f15006 = new ConcurrentMapC10942();
        try {
            C12951 m36528 = m36526.m36528();
            byte[] bArr = m36528.f38849;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ (i * i));
            }
            while (m36528.available() > 0) {
                C22124.m49721(m36528, 41397);
                String m31499 = m36528.m31499();
                C20249 c20249 = new C20249(0);
                c20249.f65465 = m36528.m31499();
                c20249.f65466 = m36528.m31499();
                f15006.put(m31499, c20249);
            }
        } catch (Exception unused) {
            f15006.clear();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13842() {
        synchronized (C4726.class) {
            C10130 c10130 = new C10130();
            for (Map.Entry entry : f15006.entrySet()) {
                String str = (String) entry.getKey();
                C20249 c20249 = (C20249) entry.getValue();
                if (c20249.f65465 != null && str.length() + c20249.f65465.length() + c20249.f65466.length() < 1000) {
                    c10130.mo13231(41397);
                    c10130.m25442(str);
                    c10130.m25442(c20249.f65465);
                    c10130.m25442(c20249.f65466);
                }
            }
            byte[] m25438 = c10130.m25438();
            int size = c10130.size();
            for (int i = 0; i < size; i++) {
                m25438[i] = (byte) (m25438[i] ^ (i * i));
            }
            try {
                f15005.m36503(m25438, 0, size);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13841(PackageInfo packageInfo) {
        C20249 c20249 = (C20249) C17997.computeIfAbsent(f15006, packageInfo.packageName, new C21660());
        String str = Long.toHexString(packageInfo.lastUpdateTime) + ":" + Locale.getDefault().hashCode();
        if (str.equals(c20249.f65465)) {
            String str2 = c20249.f65466;
            C11003.requireNonNull(str2);
            return str2;
        }
        synchronized (c20249) {
            if (!str.equals(c20249.f65465)) {
                c20249.f65466 = String.valueOf(packageInfo.applicationInfo.loadLabel(C4925.m14320()));
                c20249.f65465 = str;
            }
        }
        C1802.m5991(new RunnableC22365(0), C4726.class, 1000L);
        return c20249.f65466;
    }
}
