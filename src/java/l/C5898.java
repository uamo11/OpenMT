package l;

import java.util.ArrayList;

/* compiled from: K79T */
/* renamed from: l.ۛۜᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5898 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16538(C12164 c12164, C11418 c11418, int i, int i2, ArrayList arrayList) {
        arrayList.clear();
        if (i2 <= 0) {
            return;
        }
        int min = Math.min(i, c11418.length());
        boolean z = false;
        int max = Math.max(0, min);
        if (max <= 0) {
            z = m16539(c12164);
        } else if (c12164.find(max)) {
            z = c12164.start() != c12164.end() ? true : m16539(c12164);
        }
        while (z && arrayList.size() < i2) {
            arrayList.add(new C10132(c12164.start(), c12164.end()));
            if (arrayList.size() >= i2) {
                return;
            } else {
                z = m16539(c12164);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16539(C12164 c12164) {
        while (c12164.find()) {
            if (c12164.start() != c12164.end()) {
                return true;
            }
        }
        return false;
    }
}
