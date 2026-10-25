package l;

/* compiled from: Z6QT */
/* renamed from: l.ܿ֨ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17019 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char f52190;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52191;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52192;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f52193;

    public C17019(char c, int i) {
        this.f52192 = i;
        this.f52191 = true;
        this.f52190 = c;
        this.f52193 = null;
    }

    public C17019(int i, InterfaceC10795 interfaceC10795) {
        this.f52192 = i;
        this.f52191 = false;
        this.f52190 = (char) 0;
        this.f52193 = interfaceC10795;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        return null;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17019 m39979(l.C5855 r5, l.InterfaceC10795 r6, int r7) {
        /*
        L0:
            r0 = 0
            if (r5 == 0) goto L75
            boolean r1 = r5 instanceof l.C9259
            r2 = 0
            if (r1 == 0) goto L2d
            l.ۢ֨ܽ r5 = (l.C9259) r5
            int[] r1 = r5.f7231
        Lc:
            int r3 = r1.length
            if (r2 >= r3) goto L28
            r3 = r1[r2]
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 <= r4) goto L17
            return r0
        L17:
            boolean r4 = r6.mo2465(r3)
            if (r4 != 0) goto L25
            l.ܿ֨ܽ r5 = new l.ܿ֨ܽ
            int r7 = r7 + r2
            char r6 = (char) r3
            r5.<init>(r6, r7)
            return r5
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            int r0 = r1.length
            int r7 = r7 + r0
            l.ۛۚܽ r5 = r5.f17958
            goto L0
        L2d:
            boolean r1 = r5 instanceof l.C19822
            if (r1 == 0) goto L75
            l.᩶֡ܽ r5 = (l.C19822) r5
            l.ۧۚܽ r1 = r5.f75432
            int r3 = m39980(r1)
            if (r3 < 0) goto L48
            boolean r4 = r6.mo2465(r3)
            if (r4 != 0) goto L48
            l.ܿ֨ܽ r5 = new l.ܿ֨ܽ
            char r6 = (char) r3
            r5.<init>(r6, r7)
            return r5
        L48:
            r3 = 0
        L49:
            r4 = 128(0x80, float:1.8E-43)
            if (r2 >= r4) goto L65
            boolean r4 = r1.mo2465(r2)
            if (r4 != 0) goto L54
            goto L62
        L54:
            boolean r4 = r6.mo2465(r2)
            if (r4 == 0) goto L5b
            goto L6d
        L5b:
            int r3 = r3 + 1
            r4 = 16
            if (r3 <= r4) goto L62
            goto L6d
        L62:
            int r2 = r2 + 1
            goto L49
        L65:
            if (r3 != 0) goto L68
            goto L6d
        L68:
            l.ܿ֨ܽ r0 = new l.ܿ֨ܽ
            r0.<init>(r7, r1)
        L6d:
            if (r0 == 0) goto L70
            return r0
        L70:
            int r7 = r7 + 1
            l.ۛۚܽ r5 = r5.f17958
            goto L0
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17019.m39979(l.ۛۚܽ, l.ۧۚܽ, int):l.ܿ֨ܽ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17019 m39981(C5855 c5855) {
        C20673 c20673;
        int i;
        C17019 c17019 = null;
        int i2 = 0;
        while (c5855 != null) {
            if (c5855.getClass() == C9259.class) {
                C9259 c9259 = (C9259) c5855;
                int[] iArr = c9259.f7231;
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    int i4 = iArr[i3];
                    if (i4 > 65535) {
                        return c17019;
                    }
                    c17019 = new C17019((char) i4, i2 + i3);
                }
                i2 += iArr.length;
                c5855 = c9259.f17958;
            } else if (!(c5855 instanceof C19822)) {
                if (!(c5855 instanceof C20673) || (i = (c20673 = (C20673) c5855).f66618) <= 0 || i != c20673.f66616) {
                    break;
                }
                C5855 c58552 = c20673.f66615;
                if (!(c58552 instanceof C19822)) {
                    break;
                }
                int m39980 = m39980(((C19822) c58552).f75432);
                if (m39980 >= 0) {
                    c17019 = new C17019((char) m39980, (i2 + i) - 1);
                }
                i2 += i;
                c5855 = c20673.f17958;
            } else {
                C19822 c19822 = (C19822) c5855;
                int m399802 = m39980(c19822.f75432);
                if (m399802 >= 0) {
                    c17019 = new C17019((char) m399802, i2);
                }
                i2++;
                c5855 = c19822.f17958;
            }
        }
        return c17019;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (m39977(0, r9.f75432) == null) goto L53;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17019 m39978(l.C5855 r15) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17019.m39978(l.ۛۚܽ):l.ܿ֨ܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17019 m39977(int i, InterfaceC10795 interfaceC10795) {
        int m39980 = m39980(interfaceC10795);
        if (m39980 >= 0) {
            return new C17019((char) m39980, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            if (interfaceC10795.mo2465(i3) && (i2 = i2 + 1) > 16) {
                return null;
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new C17019(i, interfaceC10795);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39976(C19822 c19822) {
        return m39980(c19822.f75432);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m39980(InterfaceC10795 interfaceC10795) {
        int i;
        if (!(interfaceC10795 instanceof C20548)) {
            return -1;
        }
        i = ((C20548) interfaceC10795).f66198;
        return i;
    }
}
