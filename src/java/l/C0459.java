package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: R3LO */
/* renamed from: l.֡ܰ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0459 implements InterfaceC2452 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m2046(String str, String str2) {
        Charset charset = StandardCharsets.UTF_8;
        return "Basic ".concat(C11816.m28901(str + ":" + str2).mo2326());
    }

    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        ((C11955) c16040.m37919()).toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2047(InterfaceC19150 interfaceC19150) {
        int mo3615;
        if (interfaceC19150 != null) {
            int mo3818 = interfaceC19150.mo3818();
            int i = 0;
            for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
                if (interfaceC22677.mo3975().f3318 == 3) {
                    InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference();
                    EnumC0841 mo3975 = interfaceC22677.mo3975();
                    if (mo3975 != EnumC0841.f3044 && mo3975 != EnumC0841.f3100) {
                        boolean z = mo3975 == EnumC0841.f3052 || mo3975 == EnumC0841.f3133;
                        InterfaceC18842 interfaceC18842 = C17177.f52643;
                        mo3615 = C17177.m40411(interfaceC5471.mo3565(), z);
                    } else {
                        mo3615 = ((InterfaceC6718) interfaceC22677).mo3615();
                    }
                    if (mo3615 > i) {
                        i = mo3615;
                    }
                }
            }
            if (i > 5 && i > mo3818) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m2045(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return ClassTransform.FLOAT;
        }
        int i = 1;
        if (charAt == 'L') {
            int lastIndexOf = str.lastIndexOf(47);
            return C15472.m36561(1, lastIndexOf < 0 ? 1 : lastIndexOf + 1, str);
        }
        if (charAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (charAt == 'V') {
            return ClassTransform.VOID;
        }
        if (charAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (charAt == 'J') {
            return ClassTransform.LONG;
        }
        if (charAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (charAt != '[') {
            switch (charAt) {
                case 'B':
                    return ClassTransform.BYTE;
                case 'C':
                    return ClassTransform.CHARACTER;
                case 'D':
                    return ClassTransform.DOUBLE;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        while (i < str.length() && str.charAt(i) == '[') {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m2045(str.substring(i)));
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
