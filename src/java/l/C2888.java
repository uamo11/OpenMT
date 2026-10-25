package l;

import java.util.ArrayList;

/* compiled from: Z6QT */
/* renamed from: l.ۗ֡ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2888 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f9219 = new char[8];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9220;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2888 m8830(C5855 c5855) {
        int i;
        if (!(c5855 instanceof C11355)) {
            return null;
        }
        C2888 c2888 = new C2888();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5855);
        while (!arrayList.isEmpty()) {
            C5855 c58552 = (C5855) C4248.m12790(arrayList, 1);
            if (c58552 instanceof C11355) {
                C11355 c11355 = (C11355) c58552;
                for (int i2 = c11355.f33990 - 1; i2 >= 0; i2--) {
                    C5855 c58553 = c11355.f33989[i2];
                    if (c58553 == null) {
                        return null;
                    }
                    arrayList.add(c58553);
                }
            } else {
                Class<?> cls = c58552.getClass();
                int i3 = 0;
                char[] cArr = c2888.f9219;
                if (cls == C9259.class) {
                    int[] iArr = ((C9259) c58552).f7231;
                    if (iArr.length == 0 || (i = iArr[0]) > 65535) {
                        return null;
                    }
                    char c = (char) i;
                    while (true) {
                        int i4 = c2888.f9220;
                        if (i3 < i4) {
                            if (cArr[i3] == c) {
                                break;
                            }
                            i3++;
                        } else {
                            if (i4 == cArr.length) {
                                return null;
                            }
                            c2888.f9220 = i4 + 1;
                            cArr[i4] = c;
                        }
                    }
                } else if (c58552 instanceof C19822) {
                    int m39976 = C17019.m39976((C19822) c58552);
                    if (m39976 < 0) {
                        return null;
                    }
                    char c2 = (char) m39976;
                    while (true) {
                        int i5 = c2888.f9220;
                        if (i3 < i5) {
                            if (cArr[i3] == c2) {
                                break;
                            }
                            i3++;
                        } else {
                            if (i5 == cArr.length) {
                                return null;
                            }
                            c2888.f9220 = i5 + 1;
                            cArr[i5] = c2;
                        }
                    }
                } else {
                    if (!(c58552 instanceof C20673)) {
                        return null;
                    }
                    C20673 c20673 = (C20673) c58552;
                    C5855 c58554 = c20673.f66615;
                    if (c20673.f66618 <= 0) {
                        return null;
                    }
                    if (c58554.getClass() != C9259.class && !(c58554 instanceof C19822)) {
                        return null;
                    }
                    arrayList.add(c58554);
                }
            }
        }
        if (c2888.f9220 > 1) {
            return c2888;
        }
        return null;
    }
}
