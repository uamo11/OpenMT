package l;

import java.util.Arrays;

/* compiled from: Z6QT */
/* renamed from: l.ܳ۠ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14403 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f44163;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5855 f44164;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C15026 f44165;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m34428(int i) {
        if (i >= 65536) {
            return true;
        }
        char c = (char) i;
        int i2 = C2164.f7153;
        return c >= 55296 && c < 57344;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C6436 m34429(C5855 c5855) {
        C20673 c20673;
        C17019 c17019;
        InterfaceC10795 interfaceC10795;
        int i;
        C5855 c58552;
        C17019 c170192;
        C5855 c58553;
        C4299 c4299;
        InterfaceC10795 interfaceC107952;
        C5855 c58554;
        C2888 c2888;
        char[] cArr;
        C2888 c28882;
        int i2;
        C19822 c19822;
        C19822 c198222;
        InterfaceC10795 interfaceC107953;
        C9259 c9259;
        C9259 c92592;
        int[] iArr;
        if (!(c5855 instanceof C0085)) {
            return null;
        }
        C6436 c6436 = new C6436();
        c6436.f19911 = ((C0085) c5855).f1019;
        if (c5855.getClass() == C19843.class) {
            C19843 c19843 = (C19843) c5855;
            c6436.f19910 = 1;
            c9259 = c19843.f64106;
            c6436.f19909 = c9259;
            c92592 = c19843.f64106;
            c6436.f19907 = c92592.f17958;
            iArr = c19843.f64105;
            c6436.f19912 = (int[]) iArr.clone();
            return c6436;
        }
        if (c5855.getClass() == C5025.class) {
            C5025 c5025 = (C5025) c5855;
            c6436.f19910 = 2;
            c19822 = c5025.f15820;
            c6436.f19909 = c19822;
            c198222 = c5025.f15820;
            c6436.f19907 = c198222.f17958;
            interfaceC107953 = c5025.f15821;
            c6436.f19914 = interfaceC107953;
            return c6436;
        }
        if (c5855.getClass() == C7847.class) {
            C7847 c7847 = (C7847) c5855;
            c6436.f19910 = 3;
            c58554 = c7847.f24335;
            c6436.f19909 = c58554;
            c2888 = c7847.f24334;
            cArr = c2888.f9219;
            c28882 = c7847.f24334;
            i2 = c28882.f9220;
            c6436.f19908 = Arrays.copyOf(cArr, i2);
            return c6436;
        }
        if (c5855.getClass() == C0791.class) {
            C0791 c0791 = (C0791) c5855;
            c6436.f19910 = 4;
            c4299 = c0791.f2905;
            c6436.f19909 = c4299;
            interfaceC107952 = c0791.f2906;
            c6436.f19914 = interfaceC107952;
            return c6436;
        }
        if (c5855.getClass() == C21254.class) {
            C21254 c21254 = (C21254) c5855;
            c6436.f19910 = 5;
            c58552 = c21254.f68576;
            c6436.f19909 = c58552;
            c170192 = c21254.f68575;
            c6436.f19913 = new C23369(c170192);
            c58553 = c21254.f68574;
            c6436.f19905 = c58553;
            return c6436;
        }
        if (c5855.getClass() != C14902.class) {
            return null;
        }
        C14902 c14902 = (C14902) c5855;
        c6436.f19910 = 6;
        c20673 = c14902.f45463;
        c6436.f19909 = c20673;
        c17019 = c14902.f45460;
        c6436.f19913 = new C23369(c17019);
        interfaceC10795 = c14902.f45461;
        c6436.f19914 = interfaceC10795;
        i = c14902.f45462;
        c6436.f19906 = i;
        return c6436;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23369 m34424(C5855 c5855) {
        InterfaceC4444 interfaceC4444;
        C17019 c17019;
        if (c5855 instanceof C3033) {
            interfaceC4444 = ((C3033) c5855).f9564;
            if (C12354.m29972(interfaceC4444)) {
                c17019 = ((C14196) interfaceC4444).f42852;
                return new C23369(c17019);
            }
        }
        throw new IllegalArgumentException("Unknown looking-at check: ".concat(c5855.getClass().getName()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m34427(C5855 c5855) {
        if (c5855 instanceof C12205) {
            return ((C12205) c5855).f36419;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m34426(C11355 c11355) {
        int[] iArr;
        iArr = c11355.f33988;
        return iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m34422(InterfaceC10795 interfaceC10795, InterfaceC10795 interfaceC107952, InterfaceC10795 interfaceC107953, boolean z) {
        return C7679.m20567(C7679.m20567(interfaceC10795, interfaceC107952, z), interfaceC107953, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m34423(int i) {
        return new C20548(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34421(InterfaceC10795 interfaceC10795) {
        int m39980;
        long[] jArr;
        long[] jArr2;
        if (interfaceC10795 instanceof C14881) {
            jArr2 = ((C14881) interfaceC10795).f45421;
            return jArr2.length << 6;
        }
        if (interfaceC10795 instanceof C18410) {
            jArr = ((C18410) interfaceC10795).f57157;
            return jArr.length << 6;
        }
        m39980 = C17019.m39980(interfaceC10795);
        if (m39980 >= 0) {
            return m39980 + 1;
        }
        return 65536;
    }

    static {
        int[] iArr = new int[4096];
        int i = 0;
        for (int i2 = 0; i2 <= 65535; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArr.length) {
                    iArr = Arrays.copyOf(iArr, i * 2);
                }
                iArr[i] = i2;
                i++;
            }
        }
        f44163 = Arrays.copyOf(iArr, i);
        f44164 = new C5855();
        f44165 = new C15026();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7225 m34430(C5855 c5855) {
        return C17725.m41509(c5855);
    }
}
