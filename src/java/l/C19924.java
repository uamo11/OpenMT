package l;

import java.lang.ref.WeakReference;

/* compiled from: 97EU */
/* renamed from: l.᩶ۘܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19924 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22040 m45867(C16828 c16828) {
        synchronized (c16828) {
            String m39588 = c16828.m39588();
            String m39596 = c16828.m39596();
            int m39593 = c16828.m39593();
            if (m39588.equals(m39596)) {
                return new C22040(m39588, m39593, false);
            }
            int i = m39593 + 1;
            c16828.m39576(i);
            c16828.m39577(m39588);
            return new C22040(m39588, i, true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45869(C16828 c16828, C22040 c22040, C10402 c10402) {
        synchronized (c16828) {
            if (m45871(c16828, c22040)) {
                c16828.m39578(new WeakReference(c10402));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45870(C16828 c16828, C22040 c22040) {
        boolean m45871;
        synchronized (c16828) {
            m45871 = m45871(c16828, c22040);
        }
        return m45871;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10402 m45866(C16828 c16828, C22040 c22040, C19883 c19883, C11813 c11813) {
        synchronized (c16828) {
            if (!m45871(c16828, c22040)) {
                return null;
            }
            WeakReference m39595 = c16828.m39595();
            c16828.m39585(c19883, c11813);
            return m39595 != null ? (C10402) m39595.get() : null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45868(C16828 c16828, C22040 c22040) {
        synchronized (c16828) {
            if (m45871(c16828, c22040)) {
                c16828.m39577((String) null);
                c16828.m39578((WeakReference) null);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m45871(C16828 c16828, C22040 c22040) {
        return c16828.m39593() == c22040.m49586() && c22040.m49585().equals(c16828.m39588()) && c22040.m49585().equals(c16828.m39596());
    }
}
