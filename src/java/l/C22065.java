package l;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: N673 */
/* renamed from: l.᩹ۙᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22065 implements InterfaceC14303 {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final C8556 a;
    public final String b;

    public C0192 a(C3015 c3015) {
        Map.Entry entry;
        Set<String> set = C3967.d;
        int size = set.size();
        Map.Entry entry2 = c3015.b ? c : d;
        if (entry2 == null || ((Integer) entry2.getKey()).intValue() != size) {
            synchronized (this) {
                entry = c3015.b ? c : d;
                if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                    Integer valueOf = Integer.valueOf(size);
                    C0192 c0192 = c3015.b ? new C0192("", null, null) : new C19244("", null, null);
                    for (String str : set) {
                        c0192.a(str, str);
                    }
                    entry = new AbstractMap.SimpleImmutableEntry(valueOf, c0192);
                    if (c3015.b) {
                        c = entry;
                    } else {
                        d = entry;
                    }
                }
            }
            entry2 = entry;
        }
        return (C0192) entry2.getValue();
    }

    public C22065(C8556 c8556, String str) {
        this.a = c8556;
        this.b = str;
    }

    @Override // l.InterfaceC14303
    public boolean l(C10071 c10071, StringBuilder sb) {
        AbstractC5650 abstractC5650 = (AbstractC5650) c10071.b(this.a);
        if (abstractC5650 == null) {
            return false;
        }
        sb.append(abstractC5650.k());
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            return b(c3015, charSequence, i, i, C3721.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char charAt2 = charSequence.charAt(i + 1);
            if (c3015.a(charAt, 'U') && c3015.a(charAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && c3015.a(charSequence.charAt(i3), 'C')) {
                    return b(c3015, charSequence, i, i4, C3721.f);
                }
                return b(c3015, charSequence, i, i3, C3721.f);
            }
            if (c3015.a(charAt, 'G') && length >= (i2 = i + 3) && c3015.a(charAt2, 'M') && c3015.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && c3015.a(charSequence.charAt(i2), '0')) {
                    c3015.e(AbstractC5650.X("GMT0", true));
                    return i5;
                }
                return b(c3015, charSequence, i, i2, C3721.f);
            }
        }
        C0192 a = a(c3015);
        ParsePosition parsePosition = new ParsePosition(i);
        String c2 = a.c(charSequence, parsePosition);
        if (c2 == null) {
            if (!c3015.a(charAt, 'Z')) {
                return ~i;
            }
            c3015.e(C18078.f);
            return i + 1;
        }
        c3015.e(AbstractC5650.X(c2, true));
        return parsePosition.getIndex();
    }

    public static int b(C3015 c3015, CharSequence charSequence, int i, int i2, C3721 c3721) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c3015.e(AbstractC5650.X(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !c3015.a(charSequence.charAt(i2), 'Z')) {
            C3015 c30152 = new C3015(c3015.a);
            c30152.b = c3015.b;
            c30152.c = c3015.c;
            int m = c3721.m(c30152, charSequence, i2);
            try {
                if (m < 0) {
                    if (c3721 == C3721.e) {
                        return ~i;
                    }
                    c3015.e(AbstractC5650.X(upperCase, true));
                    return i2;
                }
                c3015.e(AbstractC5650.Y(upperCase, C18078.e0((int) c30152.d(EnumC18496.OFFSET_SECONDS).longValue())));
                return m;
            } catch (C16232 unused) {
                return ~i;
            }
        }
        c3015.e(AbstractC5650.X(upperCase, true));
        return i2;
    }

    public final String toString() {
        return this.b;
    }
}
