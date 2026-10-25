package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 97UL */
/* renamed from: l.ۡᩳܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9050 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20135 f27447 = new C20135();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19119 f27450 = C19119.m44064(new C9756[16]);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f27449 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f27448 = new HashMap();

    static {
        for (int i = 0; i < 128; i++) {
            if ((48 > i || i > 57) && ((65 > i || i > 90) && ((97 > i || i > 122) && i != 36 && i != 95 && i != 45))) {
                f27447.mo8955((char) i);
            }
        }
        for (int i2 = 0; i2 < 78; i2++) {
            f27447.mo8955("（）［］｛｝〈〉《》「」『』【】〔〕〖〗〘〙「」『』“”‘’。！？，、；：…—－·～｜＼／＊＃＆％＠＋－＝＜＞� \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029 \u205f\u3000\ufeff".charAt(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23380(CharSequence charSequence) {
        C19119 c19119 = this.f27450;
        c19119.clear();
        HashSet hashSet = this.f27449;
        hashSet.clear();
        HashMap hashMap = this.f27448;
        hashMap.clear();
        c19119.addAll(m23373(0, charSequence.length(), charSequence));
        InterfaceC10798 listIterator = c19119.listIterator(0);
        while (listIterator.hasNext()) {
            C9756 c9756 = (C9756) listIterator.next();
            ((C21045) C13843.computeIfAbsent(hashMap, c9756, new C6933())).f67905++;
            if (c9756.m24737()) {
                hashSet.add(c9756);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23379(int i, int i2, int i3, CharSequence charSequence) {
        int min;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int m23374 = m23374(i, charSequence);
        int m23371 = m23371(i + i3, charSequence);
        int i9 = i + i2;
        C19119 c19119 = this.f27450;
        C9756[] c9756Arr = (C9756[]) c19119.m44068();
        int size = c19119.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = size;
        while (i11 < i12) {
            int m19938 = C7416.m19938(i12, i11, 2, i11);
            i8 = c9756Arr[m19938].f29532;
            if (i8 < m23374) {
                i11 = m19938 + 1;
            } else {
                i12 = m19938;
            }
        }
        if (i11 < size) {
            i7 = c9756Arr[i11].f29532;
            if (i7 > i9) {
                i11 = -(i11 + 1);
            }
        } else {
            i11 = -(size + 1);
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = this.f27448;
        if (i11 >= 0) {
            C9756[] c9756Arr2 = (C9756[]) c19119.m44068();
            int size2 = c19119.size();
            int i13 = i11;
            while (i13 < size2) {
                C9756 c9756 = c9756Arr2[i13];
                C9756[] c9756Arr3 = c9756Arr2;
                i4 = c9756.f29532;
                if (i4 > i9) {
                    break;
                }
                int i14 = i10 + 1;
                if (c9756.m24737()) {
                    hashSet.add(c9756);
                }
                C21045 c21045 = (C21045) hashMap.get(c9756);
                if (c21045 != null) {
                    i5 = i9;
                    int i15 = c21045.f67905;
                    i6 = i14;
                    if (i15 <= 1) {
                        hashMap.remove(c9756);
                    } else {
                        c21045.f67905 = i15 - 1;
                    }
                } else {
                    i5 = i9;
                    i6 = i14;
                }
                i13++;
                c9756Arr2 = c9756Arr3;
                i9 = i5;
                i10 = i6;
            }
            if (i10 > 0) {
                c19119.mo5504(i11, i10 + i11);
            }
        }
        if (i11 < 0) {
            i11 = (-i11) - 1;
        }
        if (i2 != i3) {
            int i16 = i3 - i2;
            C9756[] c9756Arr4 = (C9756[]) c19119.m44068();
            int size3 = c19119.size();
            for (int i17 = i11; i17 < size3; i17++) {
                c9756Arr4[i17].m24736(i16);
            }
        }
        int length = charSequence.length();
        HashSet hashSet2 = this.f27449;
        if (m23374 < length && m23374 < (min = Math.min(m23371, charSequence.length()))) {
            ArrayList m23373 = m23373(m23374, min, charSequence);
            c19119.addAll(i11, m23373);
            Iterator it = m23373.iterator();
            while (it.hasNext()) {
                C9756 c97562 = (C9756) it.next();
                C21045 c210452 = (C21045) C13843.computeIfAbsent(hashMap, c97562, new C6933());
                int i18 = c210452.f67905 + 1;
                c210452.f67905 = i18;
                if (c97562.m24737() && i18 == 1 && !hashSet.remove(c97562)) {
                    hashSet2.add(c97562);
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C9756 c97563 = (C9756) it2.next();
            if (!hashMap.containsKey(c97563)) {
                hashSet2.remove(c97563);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23375(int i, CharSequence charSequence) {
        int m23374 = m23374(i, charSequence);
        return i - m23374 > 100 ? "" : charSequence.subSequence(m23374, i).toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m23376(int i, CharSequence charSequence) {
        int m23371 = m23371(i, charSequence);
        return m23371 - i > 100 ? "" : charSequence.subSequence(i, m23371).toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23372(InterfaceC7785 interfaceC7785, int i) {
        return m23371(i, interfaceC7785);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m23374(int i, CharSequence charSequence) {
        if (i <= 0) {
            return 0;
        }
        do {
            i--;
            if (i < 0) {
                return 0;
            }
        } while (!f27447.mo8956(charSequence.charAt(i)));
        return i + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23371(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return charSequence.length();
        }
        while (i < charSequence.length()) {
            if (f27447.mo8956(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23373(int i, int i2, CharSequence charSequence) {
        C20135 c20135;
        ArrayList arrayList = new ArrayList(Math.max(1, (i2 - i) / 5));
        if (charSequence != null && i < i2) {
            while (i < i2) {
                while (true) {
                    c20135 = f27447;
                    if (i >= i2 || !c20135.mo8956(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                if (i >= i2) {
                    break;
                }
                int i3 = i;
                while (i3 < i2 && !c20135.mo8956(charSequence.charAt(i3))) {
                    i3++;
                }
                arrayList.add(new C9756(charSequence.subSequence(i, i3).toString(), i, i3));
                i = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17664 m23378() {
        return C5378.parallelStream(this.f27449);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23377(C9756 c9756) {
        C21045 c21045 = (C21045) this.f27448.get(c9756);
        if (c21045 != null) {
            return c21045.f67905;
        }
        return 0;
    }
}
