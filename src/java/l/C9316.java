package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: 51V0 */
/* renamed from: l.ۢۗۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9316 extends C14851 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22016 f28265;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f28266;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3671 f28267;

    public C9316(C3671 c3671, C22016 c22016) {
        this.f28267 = c3671;
        this.f28265 = c22016;
    }

    @Override // l.C14851
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23994(C16696 c16696) {
        return new C5829(this, c16696);
    }

    @Override // l.C14851
    /* renamed from: ۧ */
    public final InterfaceC18380 mo1229() {
        return new InterfaceC18380() { // from class: l.۬ۙۡ
            @Override // l.InterfaceC18380
            /* renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23970(C9316.this, (String) obj);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23970(C9316 c9316, String str) {
        return c9316.f28267.m11180(str, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23988(C9316 c9316, String str) {
        return c9316.f28267.m11180(str, str);
    }

    @Override // l.C14851
    /* renamed from: ᩷ */
    public final InterfaceC18380 mo17109(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۙۙۡ
            @Override // l.InterfaceC18380
            /* renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23973(C9316.this, c16696, (InterfaceC5471) obj);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C7199 m23973(C9316 c9316, C16696 c16696, InterfaceC5471 interfaceC5471) {
        InterfaceC5471 c7199;
        C2260 m11184 = c9316.f28267.m11184(interfaceC5471.mo3566());
        if (m11184 == null || (c7199 = m11184.m7465(c16696, interfaceC5471, c9316.f28265)) == null) {
            c7199 = new C7199(c16696, interfaceC5471);
        }
        return (C7199) c7199;
    }

    @Override // l.C14851
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23995(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۗۙۡ
            @Override // l.InterfaceC18380
            /* renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23975(C9316.this, c16696, (InterfaceC18877) obj);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C22721 m23975(C9316 c9316, C16696 c16696, InterfaceC18877 interfaceC18877) {
        InterfaceC18877 c22721;
        C2260 m11184 = c9316.f28267.m11184(interfaceC18877.mo8192());
        if (m11184 == null || (c22721 = m11184.m7466(c16696, interfaceC18877, c9316.f28265)) == null) {
            c22721 = new C22721(c16696, interfaceC18877);
        }
        return (C22721) c22721;
    }

    @Override // l.C14851
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15368 mo23991(C16696 c16696) {
        return new C15368(c16696);
    }

    @Override // l.C14851
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23993(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۤۙۡ
            @Override // l.InterfaceC18380
            /* renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23974(C9316.this, c16696, (InterfaceC20561) obj);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11433 m23974(C9316 c9316, C16696 c16696, InterfaceC20561 interfaceC20561) {
        if (interfaceC20561.getVisibility() == 2) {
            String type = interfaceC20561.getType();
            type.getClass();
            if (type.equals("Ldalvik/annotation/InnerClass;")) {
                return new C14253(c9316, c16696, interfaceC20561);
            }
            if (type.equals("Ldalvik/annotation/Signature;")) {
                return new C20605(c9316, c16696, interfaceC20561);
            }
        } else if (c9316.f28267.m11182(interfaceC20561.getType())) {
            return new C17782(c9316, c16696, interfaceC20561);
        }
        return new C11433(c16696, interfaceC20561);
    }

    @Override // l.C14851
    /* renamed from: ᩳ */
    public final InterfaceC18380 mo1230(C16696 c16696) {
        return new C11474(this, c16696);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m23972(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return new C22762(arrayList);
    }

    @Override // l.C14851
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23992(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.۫ۙۡ
            @Override // l.InterfaceC18380
            /* renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return new C13589(C9316.this, c16696, (InterfaceC19150) obj);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r2 >= (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r5 >= (-1)) goto L47;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m23978(l.C9316 r7, java.util.List r8, java.util.HashMap r9, l.C2260 r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9316.m23978(l.ۢۗۡ, java.util.List, java.util.HashMap, l.ۖۗۡ, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23977(C9316 c9316, List list, HashMap hashMap, C2260 c2260, int i, int i2) {
        String m23982;
        String m7464;
        int m23989 = m23989(i, i2, list);
        if (m23989 == -1 || (m23982 = m23982((InterfaceC22677) list.get(m23989))) == null || hashMap.containsKey(Integer.valueOf(m23989)) || (m7464 = c2260.m7464(m23982)) == null || m7464.equals(m23982)) {
            return;
        }
        hashMap.put(Integer.valueOf(m23989), new C11015(i2, m7464));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23976(C9316 c9316, List list, HashMap hashMap, int i, int i2) {
        String m23982;
        if (i == -1 || hashMap.containsKey(Integer.valueOf(i)) || (m23982 = m23982((InterfaceC22677) list.get(i))) == null || m23982.isEmpty()) {
            return;
        }
        String m23987 = m23987(m23982);
        if (C7416.m19937(1, m23987) != ';') {
            return;
        }
        String m11180 = c9316.f28267.m11180(m23987, m23987);
        if (m23987.equals(m11180)) {
            return;
        }
        hashMap.put(Integer.valueOf(i), new C11015(i2, m23990(m11180)));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23987(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '[') {
            if (C7416.m19937(1, str) == ';') {
                return str.replace('.', '/');
            }
        } else if (str.indexOf(47) == -1) {
            return "L" + str.replace('.', '/') + l.b;
        }
        return str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m23990(String str) {
        if (str == null) {
            return null;
        }
        return ((str.length() <= 1 || str.charAt(0) != 'L') && C7416.m19937(1, str) != ';') ? str.replace('/', '.') : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23986(int i, int i2, List list) {
        int m23989 = m23989(i, i2, list);
        if (m23989 != -1) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) list.get(m23989);
            if (interfaceC22677.mo3975() == EnumC0841.f3309) {
                return ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType();
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3075) {
                int i3 = m23989 - 1;
                while (true) {
                    if (i3 < 0) {
                        i3 = -1;
                        break;
                    }
                    if ((((InterfaceC22677) list.get(i3)).mo3975().f3319 & 8) != 0) {
                        break;
                    }
                    i3--;
                }
                if (i3 != -1) {
                    InterfaceC22677 interfaceC226772 = (InterfaceC22677) list.get(i3);
                    if (interfaceC226772.mo3975() == EnumC0841.f3052) {
                        InterfaceC11116 interfaceC11116 = (InterfaceC11116) interfaceC226772;
                        if (m23985((InterfaceC5471) interfaceC11116.getReference())) {
                            int m239892 = m23989(i3, interfaceC11116.mo3614(), list);
                            return m23987(m239892 != -1 ? m23982((InterfaceC22677) list.get(m239892)) : null);
                        }
                    }
                }
            } else if (interfaceC22677.mo3975() == EnumC0841.f3045) {
                InterfaceC18877 interfaceC18877 = (InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference();
                if (interfaceC18877.getName().equals("TYPE") && interfaceC18877.getType().equals("Ljava/lang/Class;")) {
                    String mo8192 = interfaceC18877.mo8192();
                    mo8192.getClass();
                    switch (mo8192) {
                        case "Ljava/lang/Integer;":
                            return "I";
                        case "Ljava/lang/Boolean;":
                        case "Ljava/lang/Byte;":
                            return "B";
                        case "Ljava/lang/Double;":
                            return "D";
                        case "Ljava/lang/Character;":
                            return "C";
                        case "Ljava/lang/Float;":
                            return "F";
                        case "Ljava/lang/Long;":
                            return "J";
                        case "Ljava/lang/Void;":
                            return "V";
                        case "Ljava/lang/Short;":
                            return "S";
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m23982(InterfaceC22677 interfaceC22677) {
        if (interfaceC22677.mo3975().f3318 == 0) {
            return ((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString();
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m23989(int i, int i2, List list) {
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) list.get(i);
            if ((interfaceC22677.mo3975().f3319 & 16) != 0 && (interfaceC22677 instanceof InterfaceC1779) && ((InterfaceC1779) interfaceC22677).mo1790() == i2) {
                return i;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m23985(InterfaceC5471 interfaceC5471) {
        return interfaceC5471.mo3566().equals("Ljava/lang/Class;") && interfaceC5471.getName().equals("forName") && interfaceC5471.mo3568().equals("Ljava/lang/Class;");
    }
}
