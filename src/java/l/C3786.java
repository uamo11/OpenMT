package l;

import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* compiled from: 5AHS */
/* renamed from: l.ۘۜ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3786 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15779 f11961;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11962;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f11960 = new ConcurrentMapC10942();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f11963 = new ConcurrentMapC10942();

    public C3786(InterfaceC15779 interfaceC15779, boolean z) {
        this.f11961 = interfaceC15779;
        this.f11962 = z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Object m11439(String str) {
        long currentTimeMillis = System.currentTimeMillis() % 100;
        ConcurrentMapC10942 concurrentMapC10942 = this.f11963;
        if (currentTimeMillis == 0) {
            C5378.removeIf(concurrentMapC10942.entrySet(), new C8725());
        }
        return ((C2375) C17997.compute(concurrentMapC10942, str, new C9431())).f7584;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m11446(String str) {
        boolean z = this.f11962;
        String m39731 = AbstractC16891.m39731(str);
        String lowerCase = z ? m39731.toLowerCase() : m39731;
        synchronized (m11439(lowerCase)) {
            Map map = (Map) this.f11960.get(lowerCase);
            if (map != null) {
                return map;
            }
            List mo3326 = this.f11961.mo3326(m39731);
            boolean z2 = this.f11962;
            if (z2 != z) {
                if (z2) {
                    m39731 = m39731.toLowerCase();
                }
                lowerCase = m39731;
                z = z2;
            }
            return m11438(lowerCase, mo3326, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m11438(String str, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String mo3328 = this.f11961.mo3328(obj);
            if (z) {
                mo3328 = mo3328.toLowerCase();
            }
            if (!mo3328.equals(".") && !mo3328.equals("..")) {
                linkedHashMap.put(mo3328, obj);
            }
        }
        this.f11960.put(str, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11445(String str) {
        Object m11440 = m11440(C9523.m24406(str), C9523.m24404(str));
        return m11440 != null && this.f11961.mo3327(m11440);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11440(String str, String str2) {
        if (this.f11962) {
            str2 = str2.toLowerCase();
        }
        return m11446(str).get(str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11442(String str) {
        String m39731 = AbstractC16891.m39731(str);
        if (this.f11962) {
            m39731 = m39731.toLowerCase();
        }
        synchronized (m11439(m39731)) {
            this.f11960.remove(m39731);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11441() {
        synchronized (this) {
            this.f11960.clear();
            this.f11963.clear();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11443(boolean z) {
        if (this.f11962 != z) {
            this.f11962 = z;
            m11441();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m11444(String str) {
        String substring;
        String str2;
        String m24406 = C9523.m24406(str);
        String m24404 = C9523.m24404(str);
        if (m24406 == null) {
            return str;
        }
        m11442(m24406);
        if (m11440(m24406, m24404) != null) {
            int lastIndexOf = m24404.lastIndexOf(46);
            int i = 0;
            if (lastIndexOf == -1) {
                substring = "";
            } else {
                String substring2 = m24404.substring(0, lastIndexOf);
                substring = m24404.substring(lastIndexOf);
                m24404 = substring2;
            }
            Matcher matcher = AbstractC15440.f47293.matcher(m24404);
            if (matcher.matches()) {
                try {
                    i = Integer.parseInt(matcher.group(2));
                    m24404 = matcher.group(1);
                } catch (Exception unused) {
                }
            }
            String m37867 = C16014.m37867(m24404, " (");
            String m46315 = C20094.m46315(MotionUtils.EASING_TYPE_FORMAT_END, substring);
            do {
                i++;
                str2 = m37867 + i + m46315;
            } while (m11440(m24406, str2) != null);
            m24404 = str2;
        }
        return C16014.m37867(m24406, m24404);
    }
}
