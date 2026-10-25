package l;

import java.util.concurrent.TimeoutException;

/* compiled from: Q9B5 */
/* renamed from: l.۬ۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12925 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31436(boolean z) {
        String m31435;
        StringBuilder sb;
        String string = C4925.f15523.getString("custom_su_command", null);
        if (string != null) {
            string = string.trim();
        }
        if (string != null && string.length() > 0) {
            if (string.equals("magisk su")) {
                try {
                    String m314352 = m31435("magisk su -h");
                    StringBuilder sb2 = new StringBuilder(string);
                    if (z && m314352.contains("--interactive")) {
                        sb2.append(" --interactive");
                    }
                    if (m314352.contains("--target")) {
                        sb2.append(" --target 1");
                        return sb2.toString();
                    }
                    if (m314352.contains("--mount-master")) {
                        sb2.append(" --mount-master");
                        return sb2.toString();
                    }
                } catch (Throwable unused) {
                }
            } else if (string.contains("-")) {
                return string;
            }
        }
        if (string == null || string.isEmpty()) {
            string = "su";
        }
        try {
            m31435 = m31435(string.concat(" -h"));
            sb = new StringBuilder(string);
            if (z && m31435.contains("--interactive")) {
                sb.append(" --interactive");
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null && message.contains("Permission denied")) {
                return null;
            }
        }
        if (m31435.contains("--target")) {
            sb.append(" --target 1");
            return sb.toString();
        }
        if (m31435.contains("--mount-master")) {
            sb.append(" --mount-master");
            return sb.toString();
        }
        return string;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31435(String str) {
        Process exec = Runtime.getRuntime().exec(str);
        long currentTimeMillis = System.currentTimeMillis() + 300;
        while (true) {
            try {
                exec.exitValue();
                return new String(C0349.m1795(exec.getInputStream(), 0)).trim();
            } catch (IllegalThreadStateException unused) {
                if (System.currentTimeMillis() > currentTimeMillis) {
                    exec.destroy();
                    throw new TimeoutException();
                }
                Thread.sleep(1L);
            }
        }
    }
}
