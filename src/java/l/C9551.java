package l;

import java.util.LinkedHashSet;

/* compiled from: T5CS */
/* renamed from: l.ۢۧᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9551 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m24426(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            int i = 0;
            while (i < length) {
                int indexOf = str.indexOf(37, i);
                if (str.charAt(i) != '%') {
                    i = indexOf == -1 ? length : indexOf;
                } else {
                    C20840 c20840 = new C20840(str, i + 1);
                    linkedHashSet.add(c20840.m47658());
                    i = c20840.m47657();
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return null;
        }
    }
}
