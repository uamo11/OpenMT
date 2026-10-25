package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: A6XK */
/* renamed from: l.᩸ۛ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21404 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68902 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C10206 f68903 = new C10206(new C0236());

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String f68904;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7383 f68905;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f68906;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C14471 f68907;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f68908;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48482(int i) {
        return (i == 0 || i == 16777216) ? i : i | (-16777216);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m48486(String str, String str2) {
        synchronized (C21404.class) {
            if (str.equals("/") || str2.equals("/")) {
                throw new IllegalArgumentException("Root rule cannot be reordered");
            }
            ArrayList arrayList = new ArrayList(f68907.f44345);
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((C13732) arrayList.get(i3)).f41009.equals(str)) {
                    i = i3;
                }
                if (((C13732) arrayList.get(i3)).f41009.equals(str2)) {
                    i2 = i3;
                }
            }
            if (i < 0 || i2 < 0) {
                throw new IllegalArgumentException("File access rule no longer exists");
            }
            if (i == i2) {
                return;
            }
            arrayList.add(i2, (C13732) arrayList.remove(i));
            m48489(new C14471(arrayList, false));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m48487(String str, EnumC5972 enumC5972) {
        synchronized (C21404.class) {
            ArrayList arrayList = new ArrayList(f68907.f44345);
            for (int i = 0; i < arrayList.size(); i++) {
                C13732 c13732 = (C13732) arrayList.get(i);
                if (c13732.f41009.equals(str)) {
                    EnumC6862 enumC6862 = c13732.f41010;
                    C11003.requireNonNull(enumC5972);
                    arrayList.set(i, new C13732(str, enumC6862, enumC5972, false));
                    m48489(new C14471(arrayList, false));
                }
            }
            throw new IllegalArgumentException("File access rule no longer exists");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m48488(C13732 c13732, EnumC5972 enumC5972) {
        synchronized (C21404.class) {
            m48500(c13732.f41009);
            ArrayList arrayList = new ArrayList(f68907.f44345);
            String str = c13732.f41009;
            EnumC6862 enumC6862 = c13732.f41010;
            C11003.requireNonNull(enumC5972);
            arrayList.add(0, new C13732(str, enumC6862, enumC5972, false));
            m48489(new C14471(arrayList, false));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized C7383 m48491() {
        C7383 c7383;
        synchronized (C21404.class) {
            List m25616 = f68903.m25616();
            C7383 c73832 = f68905;
            if (c73832 == null || !c73832.f22726.equals(f68904) || !f68905.f22727.equals(m25616)) {
                f68905 = f68907.m34567(f68904, m25616);
            }
            c7383 = f68905;
        }
        return c7383;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m48493(String str) {
        synchronized (C21404.class) {
            Integer m48346 = C21311.m48346(str);
            if (m48346 == null) {
                throw new IllegalArgumentException("Invalid MCP port");
            }
            f68908 = m48346.intValue();
            ApplicationC20075.f65008.edit().mo25853(m48346.intValue(), "amp").apply();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized AbstractC15440 m48495() {
        AbstractC15440 m39866;
        synchronized (C21404.class) {
            m39866 = C16999.m39866(f68904, new String[0]);
        }
        return m39866;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized void m48496(String str) {
        synchronized (C21404.class) {
            if (str.equals("/")) {
                throw new IllegalArgumentException("Root rule cannot be removed");
            }
            ArrayList arrayList = new ArrayList(f68907.f44345);
            C5378.removeIf(arrayList, new C5176(0, str));
            m48489(new C14471(arrayList, false));
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m48498() {
        boolean z;
        synchronized (C21404.class) {
            z = f68907.f44344;
        }
        return z;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static synchronized void m48502() {
        String m48484;
        synchronized (C21404.class) {
            int i = ApplicationC20075.f65008.getInt("amp", 8787);
            f68908 = C21311.m48347(i) ? i : 8787;
            String string = ApplicationC20075.f65008.getString("amop", null);
            try {
                if (TextUtils.isEmpty(string)) {
                    m48484 = m48484();
                } else {
                    try {
                        m48484 = C12301.m29847(string, "homePath");
                    } catch (C3059 unused) {
                        throw new C15052(EnumC7998.PRIMARY_STORAGE);
                    }
                }
                if (m48501(m48484) != null) {
                    m48484 = m48484();
                }
            } catch (C15052 unused2) {
                m48484 = m48484();
            }
            f68904 = m48484;
            String string2 = ApplicationC20075.f65008.getString("amfa", null);
            C14471 m34562 = C14471.m34562(string2);
            f68907 = m34562;
            f68905 = null;
            if (string2 != null && !m34562.f44344 && !string2.equals(m34562.m34566())) {
                ApplicationC20075.f65008.edit().putString("amfa", f68907.m34566()).apply();
            }
            if (string != null && !m48484.equals(string)) {
                ApplicationC20075.f65008.edit().putString("amop", m48484).apply();
            }
            f68906 = ApplicationC20075.f65008.getBoolean("amfw", false);
        }
    }

    static {
        m48502();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m48499() {
        return f68908;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13732 m48492(String str) {
        EnumC6862 enumC6862;
        String m29847 = C12301.m29847(str, MotionUtils.EASING_TYPE_PATH);
        synchronized (C21404.class) {
            m48500(m29847);
        }
        int i = C0942.f3570[C16999.m39866(m29847, new String[0]).mo23558().mo8672().m30885().ordinal()];
        if (i == 1) {
            enumC6862 = EnumC6862.FILE;
        } else if (i == 2) {
            enumC6862 = EnumC6862.DIRECTORY;
        } else {
            throw new IllegalArgumentException("Rule target must be an existing file or directory");
        }
        return new C13732(m29847, enumC6862, EnumC5972.DENY, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m48500(String str) {
        if (C14471.m34564(str, f68904, f68903.m25616())) {
            throw new IllegalArgumentException("File access rule is shadowed by Home or managed paths");
        }
        Iterator it = f68907.f44345.iterator();
        while (it.hasNext()) {
            if (((C13732) it.next()).f41009.equals(str)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48489(C14471 c14471) {
        ApplicationC20075.f65008.edit().putString("amfa", c14471.m34566()).apply();
        f68907 = c14471;
        f68905 = null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m48494() {
        return f68906;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48483(Context context, int i) {
        int m48482 = m48482(i);
        if (m48482 != 0 && m48482 != 16777216) {
            return m48482;
        }
        return C21238.m48210(new ContextThemeWrapper(context, C18080.m42142()).getTheme(), m48482 == 16777216 ? R.attr.MT_Protector_res_0x7f04011a : R.attr.MT_Protector_res_0x7f0400f3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48490(boolean z, boolean z2) {
        f68906 = z;
        ApplicationC20075.f65008.edit().putBoolean("amfw", z).putBoolean("floating_button_stick_to_edge", z2).apply();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m48497(String str) {
        String m48485 = m48485(str);
        AbstractC15440 m39866 = C16999.m39866(m48485, new String[0]);
        if (!m39866.mo23120()) {
            try {
                m39866.m36508();
                C15972.m37753();
            } catch (Exception unused) {
                throw new C15052(EnumC7998.CREATE_FAILED);
            }
        }
        if (m39866.mo23113()) {
            synchronized (C21404.class) {
                f68904 = m48485;
                ApplicationC20075.f65008.edit().putString("amop", m48485).apply();
            }
            return;
        }
        throw new C15052(EnumC7998.CREATE_FAILED);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48485(String str) {
        String m29847;
        if (TextUtils.isEmpty(str)) {
            m29847 = m48484();
        } else {
            try {
                m29847 = C12301.m29847(str, "homePath");
            } catch (C3059 unused) {
                throw new C15052(EnumC7998.PRIMARY_STORAGE);
            }
        }
        EnumC7998 m48501 = m48501(m29847);
        if (m48501 == null) {
            return m29847;
        }
        throw new C15052(m48501);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static EnumC7998 m48501(String str) {
        Iterator it = f68903.m25616().iterator();
        while (it.hasNext()) {
            if (C12301.m29846(str, (String) it.next())) {
                return EnumC7998.MANAGED_PATH;
            }
        }
        if (C12301.m29845(str)) {
            return EnumC7998.ANDROID_DATA;
        }
        if (!C16999.m39887(str)) {
            return EnumC7998.PRIMARY_STORAGE;
        }
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        if (!m39866.mo23120() || m39866.mo23113()) {
            return null;
        }
        return EnumC7998.FILE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48484() {
        return C16999.m39885(C16293.f50120.m36526("MT2").m36526("mcp").mo23554());
    }
}
