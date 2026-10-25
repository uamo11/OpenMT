package l;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* compiled from: 3AN5 */
/* renamed from: l.ܳۤܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14463 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44330 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7124 f44332 = new C7124(new C17992());

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Handler f44331 = new HandlerC17286(Looper.getMainLooper());

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m34557(String str) {
        if (str.startsWith("/system/") || str.startsWith("/data/")) {
            return false;
        }
        return C16999.m39887(str) || C19739.m45449(str) != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34553(String str) {
        if (str == null) {
            return;
        }
        synchronized (C14463.class) {
            C7124 c7124 = f44332;
            c7124.remove(str);
            c7124.add(str);
            Handler handler = f44331;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34558(String str) {
        String m39731 = AbstractC16891.m39731(str);
        while (m39731.length() > 1 && m39731.endsWith("/")) {
            m39731 = C15472.m36561(1, 0, m39731);
        }
        return m39731;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34554(String str, boolean z) {
        String m34558 = m34558(str);
        if ((z && !m34556(m34558)) || !m34557(m34558)) {
            m34558 = null;
        }
        m34553(m34558);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34551(String str, EnumC16580 enumC16580, boolean z) {
        String m34558 = m34558(str);
        if (enumC16580 != EnumC16580.NONE && ((enumC16580 != EnumC16580.EXACT || !z || m34556(m34558)) && m34557(m34558))) {
            if (enumC16580 != EnumC16580.TREE) {
                return m34558;
            }
            if (!m34558(m34558).equalsIgnoreCase(m34558("/sdcard"))) {
                if (!m34558(m34558).equalsIgnoreCase(m34558(m34558(C16293.f50120.mo23554())))) {
                    C4216 m45449 = C19739.m45449(m34558);
                    if (m45449 == null) {
                        return m34558;
                    }
                    if (!m34558(m34558).equalsIgnoreCase(m34558(m34558(m45449.f13687.getPath())))) {
                        return m34558;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m34556(String str) {
        if (str.toLowerCase(Locale.ROOT).contains("download")) {
            return true;
        }
        String m7304 = C2204.m7304(str);
        if (m7304 != null) {
            return m7304.startsWith("image") || m7304.startsWith("video") || m7304.startsWith("audio");
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34555(AbstractC15440 abstractC15440) {
        m34554(abstractC15440.mo23554(), true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34560(String str) {
        m34553(m34551(str, EnumC16580.EXACT, true));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34559(String str) {
        m34553(m34551(str, EnumC16580.TREE, false));
    }
}
