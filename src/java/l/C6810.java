package l;

import java.util.Comparator;

/* compiled from: R4DT */
/* renamed from: l.ۜܰ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6810 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int min = Math.min(str.length(), str2.length());
        for (int i = 4; i < min; i++) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
