package l;

import java.util.Arrays;

/* compiled from: B73K */
/* renamed from: l.ܶۙܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15003 implements InterfaceC7949 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f45758;

    public C15003(int[] iArr) {
        this.f45758 = iArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15003 m35540(String str) {
        int i;
        if (str.isEmpty()) {
            return new C15003(new int[]{-1});
        }
        int[] iArr = new int[str.codePointCount(0, str.length()) + 1];
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            i2 += Character.charCount(codePointAt);
            if (z) {
                iArr[i3] = codePointAt;
                i3++;
                z = false;
            } else if (codePointAt == 92) {
                z = true;
            } else {
                if (codePointAt == 42) {
                    if (i3 == 0 || iArr[i3 - 1] != -1) {
                        i = i3 + 1;
                        iArr[i3] = -1;
                    }
                    z2 = true;
                } else if (codePointAt == 63) {
                    i = i3 + 1;
                    iArr[i3] = -2;
                } else {
                    iArr[i3] = codePointAt;
                    i3++;
                }
                i3 = i;
                z2 = true;
            }
        }
        if (z) {
            iArr[i3] = 92;
            i3++;
        }
        if (!z2) {
            int[] iArr2 = new int[i3 + 2];
            iArr2[0] = -1;
            System.arraycopy(iArr, 0, iArr2, 1, i3);
            iArr2[i3 + 1] = -1;
            return new C15003(iArr2);
        }
        return new C15003(Arrays.copyOf(iArr, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return false;
     */
    @Override // l.InterfaceC7949
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1332(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
        L6:
            int r6 = r11.length()
            int[] r7 = r10.f45758
            if (r2 >= r6) goto L58
            int r6 = r7.length
            if (r3 >= r6) goto L42
            r6 = r7[r3]
            if (r6 != r1) goto L1c
            int r4 = r3 + 1
            r5 = r2
            r9 = r4
            r4 = r3
            r3 = r9
            goto L6
        L1c:
            int r7 = r11.codePointAt(r2)
            r8 = -2
            if (r6 == r8) goto L3a
            if (r6 != r7) goto L26
            goto L3a
        L26:
            int r6 = java.lang.Character.toUpperCase(r6)
            int r8 = java.lang.Character.toUpperCase(r7)
            if (r6 == r8) goto L3a
            int r6 = java.lang.Character.toLowerCase(r6)
            int r8 = java.lang.Character.toLowerCase(r8)
            if (r6 != r8) goto L42
        L3a:
            int r3 = r3 + 1
            int r6 = java.lang.Character.charCount(r7)
            int r2 = r2 + r6
            goto L6
        L42:
            if (r4 == r1) goto L67
            int r2 = r11.length()
            if (r5 < r2) goto L4b
            goto L67
        L4b:
            int r2 = r11.codePointAt(r5)
            int r2 = java.lang.Character.charCount(r2)
            int r5 = r5 + r2
            int r3 = r4 + 1
            r2 = r5
            goto L6
        L58:
            int r11 = r7.length
            if (r3 >= r11) goto L62
            r11 = r7[r3]
            if (r11 != r1) goto L62
            int r3 = r3 + 1
            goto L58
        L62:
            int r11 = r7.length
            if (r3 != r11) goto L67
            r11 = 1
            return r11
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15003.mo1332(java.lang.String):boolean");
    }
}
