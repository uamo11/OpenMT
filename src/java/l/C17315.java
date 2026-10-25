package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: H8A7 */
/* renamed from: l.ܿۧ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17315 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set f53025;

    static {
        m40632();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m40632() {
        String string = ApplicationC20075.f65008.getString("mhf", null);
        if (!C9679.m24615((CharSequence) string)) {
            f53025 = m40630(string);
        } else {
            f53025 = Collections.EMPTY_SET;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40629() {
        return ApplicationC20075.f65008.getBoolean("smhf", false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40625(boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "smhf", z);
        m40633();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m40631() {
        return ApplicationC20075.f65008.getBoolean("sshf", true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40628(boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "sshf", z);
        m40633();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40626(String str) {
        return f53025.contains(m40627(str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m40627(String str) {
        if (str.startsWith("/sdcard/")) {
            str = C16293.f50120 + str.substring(7);
        }
        while (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40624(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (m40629()) {
            C22870.m50970(ApplicationC20075.f65008, "smhf", false);
        }
        HashSet hashSet = new HashSet(f53025);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(m40627((String) it.next()));
        }
        m40623(hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40621() {
        return m40622(f53025);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40634(String str) {
        m40623(m40630(str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashSet m40630(String str) {
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            if (str2.startsWith("/")) {
                hashSet.add(m40627(str2));
            }
        }
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40623(HashSet hashSet) {
        String m40622 = m40622((Set) hashSet);
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        if (m40622.endsWith("\n")) {
            m40622 = C15472.m36561(1, 0, m40622);
        }
        edit.putString("mhf", m40622).apply();
        f53025 = hashSet;
        m40633();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40633() {
        if (C10975.m27285()) {
            C15528.m36596();
        } else {
            C4925.m14315(new RunnableC15608(0));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40622(Set set) {
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
