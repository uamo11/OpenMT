package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: 66ND */
/* renamed from: l.ۨۛۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11516 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f34383;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34384;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f34385;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34386;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f34387;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CharSequence f34388;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4460 f34389;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f34390;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34391;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34392;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f34393;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f34394;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f34395;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f34396;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean[] f34397;

    public C11516(CharSequence charSequence, List list, C8694 c8694, C3463 c3463, String str, C4460 c4460) {
        String str2;
        int i;
        C8931 c8931;
        C4460 c44602;
        List list2;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        this.f34388 = charSequence;
        this.f34385 = list;
        this.f34389 = c4460;
        this.f34394 = new int[list.size()];
        this.f34393 = new int[list.size()];
        this.f34383 = new boolean[list.size()];
        this.f34384 = new boolean[list.size()];
        this.f34391 = new boolean[list.size()];
        this.f34397 = new boolean[list.size()];
        this.f34396 = new boolean[list.size()];
        this.f34386 = new boolean[list.size()];
        this.f34392 = new boolean[list.size()];
        int max = Math.max(1, Math.min(16, c3463.m10601()));
        this.f34387 = max;
        if (c3463.m10602()) {
            str2 = "\t";
        } else {
            if (max < 0) {
                throw new IllegalArgumentException(C19370.m44628(max, "count is negative: "));
            }
            if (max == 0) {
                str2 = "";
            } else if (max == 1) {
                str2 = " ";
            } else {
                if (1 > Integer.MAX_VALUE / max) {
                    throw new OutOfMemoryError(C18307.m42645(max, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(max);
                for (int i6 = 0; i6 < max; i6++) {
                    sb.append(" ");
                }
                str2 = sb.toString();
            }
        }
        this.f34395 = str2;
        this.f34390 = str;
        boolean[] zArr = this.f34396;
        boolean[] zArr2 = this.f34391;
        int[] iArr = this.f34394;
        boolean[] zArr3 = this.f34383;
        C4460 c44603 = this.f34389;
        boolean[] zArr4 = this.f34384;
        List list3 = this.f34385;
        int[] iArr2 = new int[list3.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C5871(c8694, 0, false));
        while (!arrayDeque.isEmpty()) {
            c44603.m13206();
            C5871 c5871 = (C5871) arrayDeque.pop();
            c8931 = c5871.f18014;
            int mo1085 = c8931.mo1085();
            if (mo1085 == 18) {
                this.f34393[c8931.f27156.mo2052()] = c8931.f27155.mo2053() + 1;
            }
            if ((mo1085 == 3 || mo1085 == 6) && c8931.f27156.getType() != 1) {
                zArr3[c8931.f27156.mo2052()] = true;
            }
            if (mo1085 == 5 && c8931.getChildCount() > 0) {
                String text = c8931.mo23040(1).getText();
                if (!text.equals("const") && !text.equals("close")) {
                    throw new C0350(EnumC19402.SYNTAX, c8931.f27156.getLine(), c8931.f27156.mo2049(), "Unknown local attribute: ".concat(text));
                }
            }
            int childCount = c8931.getChildCount() - 1;
            while (childCount >= 0) {
                InterfaceC16174 mo23040 = c8931.mo23040(childCount);
                if (mo23040 instanceof C8931) {
                    C8931 c89312 = (C8931) mo23040;
                    i5 = c5871.f18016;
                    c44602 = c44603;
                    list2 = list3;
                    if (c89312.mo1085() == 2 && mo1085 != 1) {
                        i5++;
                        int mo2052 = ((InterfaceC4181) c8931.mo23040(childCount - 1)).mo12628().mo2052() + 1;
                        int mo20522 = ((InterfaceC4181) c8931.mo23040(childCount + 1)).mo12628().mo2052();
                        iArr2[mo2052] = iArr2[mo2052] + 1;
                        iArr2[mo20522] = iArr2[mo20522] - 1;
                    }
                    int mo10852 = c89312.mo1085();
                    if (mo10852 != 2) {
                        z4 = c5871.f18015;
                        if (z4 || mo10852 == 12 || mo10852 == 14 || mo10852 == 11 || mo10852 == 20 || mo10852 == 10 || mo10852 == 4 || mo10852 == 9) {
                            z3 = true;
                            arrayDeque.push(new C5871(c89312, i5, z3));
                        }
                    }
                    z3 = false;
                    arrayDeque.push(new C5871(c89312, i5, z3));
                } else {
                    c44602 = c44603;
                    list2 = list3;
                    if (mo23040 instanceof InterfaceC4181) {
                        InterfaceC0463 mo12628 = ((InterfaceC4181) mo23040).mo12628();
                        int mo20523 = mo12628.mo2052();
                        int type = mo12628.getType();
                        i2 = c5871.f18016;
                        iArr[mo20523] = i2;
                        boolean[] zArr5 = this.f34392;
                        z = c5871.f18015;
                        zArr5[mo20523] = z;
                        if (type == 6 || type == 13 || type == 12 || type == 9) {
                            zArr3[mo20523] = true;
                        }
                        if (type == 30 && (mo1085 == 17 || mo1085 == 19)) {
                            z2 = true;
                            zArr4[mo20523] = true;
                        } else {
                            z2 = true;
                        }
                        if (type == 47 && mo1085 != 23) {
                            zArr4[mo20523] = z2;
                        }
                        if (mo1085 == 5) {
                            if (type == 19) {
                                zArr2[mo20523] = z2;
                            }
                            if (type == 20) {
                                zArr4[mo20523] = z2;
                            }
                        }
                        if (mo1085 == 12 && childCount == 0) {
                            if (type == 28 || type == 27 || type == 29) {
                                zArr2[mo20523] = true;
                            } else {
                                i4 = 12;
                                i3 = 1;
                                if (mo1085 == i4 && childCount == i3 && (c8931.mo23040(0) instanceof C5995)) {
                                    zArr[mo20523] = true;
                                }
                                if (mo1085 == 15 && (type == 26 || type == 38)) {
                                    zArr[mo20523] = true;
                                }
                                if (type != 15 || mo1085 == 24 || type == 2 || type == 21) {
                                    this.f34386[mo20523] = true;
                                }
                            }
                        }
                        i3 = 1;
                        i4 = 12;
                        if (mo1085 == i4) {
                            zArr[mo20523] = true;
                        }
                        if (mo1085 == 15) {
                            zArr[mo20523] = true;
                        }
                        if (type != 15) {
                        }
                        this.f34386[mo20523] = true;
                    }
                }
                childCount--;
                c44603 = c44602;
                list3 = list2;
            }
        }
        C4460 c44604 = c44603;
        List list4 = list3;
        int i7 = 0;
        int i8 = 0;
        while (i8 < list4.size()) {
            if ((i8 & 1023) == 0) {
                c44604.m13206();
            }
            i7 += iArr2[i8];
            List list5 = list4;
            if (m28345((InterfaceC0463) list5.get(i8))) {
                iArr[i8] = i7;
            }
            i8++;
            list4 = list5;
        }
        int i9 = 0;
        C12345 c12345 = (C12345) ((C10229) c8694.m23039(C10229.class, 0)).m23039(C12345.class, 0);
        List list6 = this.f34385;
        ArrayList arrayList = new ArrayList(c12345.m23037(C15748.class));
        if (((C9400) c12345.m23039(C9400.class, 0)) != null) {
            arrayList.add((C9400) c12345.m23039(C9400.class, 0));
        }
        int i10 = 0;
        while (i9 < arrayList.size()) {
            this.f34389.m13206();
            C8931 c89313 = (C8931) arrayList.get(i9);
            i9++;
            int mo20524 = i9 < arrayList.size() ? ((C8931) arrayList.get(i9)).f27156.mo2052() : list6.size();
            while (true) {
                if (i10 >= mo20524) {
                    i = 1;
                    break;
                } else {
                    if (m28345((InterfaceC0463) list6.get(i10))) {
                        i = 1;
                        Arrays.fill(this.f34397, c89313.f27156.mo2052(), c89313.f27155.mo2052() + 1, true);
                        break;
                    }
                    i10++;
                }
            }
            i10 = c89313.f27155.mo2052() + i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28343(CharSequence charSequence, C4460 c4460) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                c4460.m13206();
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '\r' || charAt == '\n') {
                int i2 = i + 1;
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) == (charAt != '\r' ? '\r' : '\n')) {
                        return charAt == '\r' ? "\r\n" : "\n\r";
                    }
                }
                return String.valueOf(charAt);
            }
        }
        return "\n";
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        if (r23.f34391[r3.mo2052()] == false) goto L96;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28346(l.C19012 r24) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11516.m28346(l.ᩴ᩷ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28345(InterfaceC0463 interfaceC0463) {
        return interfaceC0463.getType() == 64 || interfaceC0463.getType() == 66;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28344(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '\r' || charAt == '\n') {
                return true;
            }
            i++;
        }
        return false;
    }
}
