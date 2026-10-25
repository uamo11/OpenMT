package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: X770 */
/* renamed from: l.ۘۧۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3897 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f12468 = {"imports", "symbols", "entries", "relocations"};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11870(long j) {
        if (j < 0 || j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m11871(String str) {
        return C16014.m37867(str, "\nstrings");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m11872(long j) {
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9542 m11864(C3897 c3897, C2486 c2486, String str, int i, int i2, int i3, int i4, int i5, C8836 c8836, C7333 c7333) {
        c3897.getClass();
        c2486.m7976(str);
        C21536 c21536 = new C21536(C16036.m37907(c7333.f22530, false));
        try {
            C9542 m11862 = m11862(c2486, (InterfaceC2395) c21536, i, i2, i3, i4, i5 - c8836.f26912.size());
            c21536.close();
            return m11862;
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9542 m11865(C3897 c3897, C2486 c2486, String str, boolean[] zArr, int i, int i2, int i3, int i4, C8836 c8836, C7333 c7333) {
        long j;
        c3897.getClass();
        c2486.m7976(str);
        C18193 c18193 = c2486.f7932.f75539;
        try {
            if (zArr[0]) {
                int i5 = c18193.f56575;
                int i6 = c18193.f56571;
                if (i5 == i) {
                    if (c18193.f56572 == i2) {
                        if (c18193.f56574 == i3 && i6 >= 0) {
                            c2486.f7933.put(m11871(str), Integer.valueOf(i6));
                            j = c18193.f56573;
                            long j2 = j;
                            zArr[0] = false;
                            C21536 c21536 = new C21536(C16036.m37907(c7333.f22530, true));
                            C9542 m11863 = m11863(c2486, c21536, i, i2, i3, j2, i4 - c8836.f26912.size());
                            c21536.close();
                            return m11863;
                        }
                        j = -1;
                        long j22 = j;
                        zArr[0] = false;
                        C21536 c215362 = new C21536(C16036.m37907(c7333.f22530, true));
                        C9542 m118632 = m11863(c2486, c215362, i, i2, i3, j22, i4 - c8836.f26912.size());
                        c215362.close();
                        return m118632;
                    }
                    j = -1;
                    long j222 = j;
                    zArr[0] = false;
                    C21536 c2153622 = new C21536(C16036.m37907(c7333.f22530, true));
                    C9542 m1186322 = m11863(c2486, c2153622, i, i2, i3, j222, i4 - c8836.f26912.size());
                    c2153622.close();
                    return m1186322;
                }
            }
            C9542 m11863222 = m11863(c2486, c2153622, i, i2, i3, j222, i4 - c8836.f26912.size());
            c2153622.close();
            return m11863222;
        } finally {
        }
        j = -1;
        long j2222 = j;
        zArr[0] = false;
        C21536 c21536222 = new C21536(C16036.m37907(c7333.f22530, true));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8836 m11874(C14852 c14852, C15799 c15799, C23528 c23528, final int i, int i2, int i3, int i4, final int i5) {
        int i6;
        C2486 c2486;
        ArrayList arrayList;
        C18193 c18193;
        int i7 = i2;
        C2486 c24862 = new C2486(this, c14852, c15799, c23528);
        ArrayList arrayList2 = c24862.f7929;
        final C8836 c8836 = new C8836(arrayList2.size());
        int i8 = 0;
        int max = Math.max(0, i7);
        while (max < arrayList2.size()) {
            final String str = (String) arrayList2.get(max);
            final int max2 = max == i7 ? Math.max(i8, i3) : 0;
            try {
                final C2486 c24863 = c24862;
                c2486 = c24862;
                arrayList = arrayList2;
                final int i9 = max;
                final int max3 = max == i7 ? Math.max(i8, i4) : 0;
                i6 = max;
                try {
                    C9542 c9542 = (C9542) C13682.m32921(c24862.f7931, c24862.f7930, c24862.f7932.f75543, str, new InterfaceC22855() { // from class: l.᩷ۧۜ
                        @Override // l.InterfaceC22855
                        /* renamed from: ֫ */
                        public final Object mo14558(C7333 c7333) {
                            return C3897.m11864(C3897.this, c24863, str, i, i9, max2, max3, i5, c8836, c7333);
                        }
                    });
                    c8836.f26912.addAll(c9542.f28943);
                    if (c9542.f28942) {
                        c8836.f26909++;
                    }
                    c18193 = c9542.f28944;
                    c8836.f26914 = c18193;
                } catch (RuntimeException unused) {
                    c8836.f26913 = true;
                    max = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c24862 = c2486;
                } catch (C3059 e) {
                    e = e;
                    if (C16781.m39516(e)) {
                        throw e;
                    }
                    c8836.f26913 = true;
                    max = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c24862 = c2486;
                }
            } catch (RuntimeException unused2) {
                i6 = max;
                c2486 = c24862;
                arrayList = arrayList2;
            } catch (C3059 e2) {
                e = e2;
                i6 = max;
                c2486 = c24862;
                arrayList = arrayList2;
            }
            if (c18193 != null) {
                break;
            }
            max = i6 + 1;
            i8 = 0;
            arrayList2 = arrayList;
            i7 = i2;
            c24862 = c2486;
        }
        return c8836;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8836 m11873(C14852 c14852, C15799 c15799, C23528 c23528, final int i, int i2, int i3, final int i4) {
        int i5;
        C2486 c2486;
        ArrayList arrayList;
        C18193 c18193;
        int i6 = i2;
        C2486 c24862 = new C2486(this, c14852, c15799, c23528);
        ArrayList arrayList2 = c24862.f7929;
        final C8836 c8836 = new C8836(arrayList2.size());
        int i7 = 0;
        int max = Math.max(0, i6);
        while (max < arrayList2.size()) {
            final String str = (String) arrayList2.get(max);
            int max2 = max == i6 ? Math.max(i7, i3) : 0;
            final boolean[] zArr = new boolean[1];
            zArr[i7] = true;
            try {
                final C2486 c24863 = c24862;
                c2486 = c24862;
                final int i8 = max;
                final int i9 = max2;
                arrayList = arrayList2;
                i5 = max;
                try {
                    C9542 c9542 = (C9542) C13682.m32921(c24862.f7931, c24862.f7930, c24862.f7932.f75543, str, new InterfaceC22855() { // from class: l.ۜۧۜ
                        @Override // l.InterfaceC22855
                        /* renamed from: ֫ */
                        public final Object mo14558(C7333 c7333) {
                            return C3897.m11865(C3897.this, c24863, str, zArr, i, i8, i9, i4, c8836, c7333);
                        }
                    });
                    c8836.f26912.addAll(c9542.f28943);
                    if (c9542.f28942) {
                        c8836.f26909++;
                    }
                    c18193 = c9542.f28944;
                    c8836.f26914 = c18193;
                } catch (RuntimeException unused) {
                    c8836.f26913 = true;
                    max = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c24862 = c2486;
                } catch (C3059 e) {
                    e = e;
                    if (C16781.m39516(e)) {
                        throw e;
                    }
                    c8836.f26913 = true;
                    max = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c24862 = c2486;
                }
            } catch (RuntimeException unused2) {
                i5 = max;
                c2486 = c24862;
                arrayList = arrayList2;
            } catch (C3059 e2) {
                e = e2;
                i5 = max;
                c2486 = c24862;
                arrayList = arrayList2;
            }
            if (c18193 != null) {
                break;
            }
            max = i5 + 1;
            i7 = 0;
            i6 = i2;
            arrayList2 = arrayList;
            c24862 = c2486;
        }
        return c8836;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ, still in use, count: 3, list:
          (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ) from 0x01d5: MOVE (r3v13 l.￡ﾩﾻ￡ﾩﾷￛﾜ) = (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ)
          (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ) from 0x01a9: MOVE (r3v22 l.￡ﾩﾻ￡ﾩﾷￛﾜ) = (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ)
          (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ) from 0x021c: MOVE (r3v29 l.￡ﾩﾻ￡ﾩﾷￛﾜ) = (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C9542 m11862(l.C2486 r35, l.InterfaceC2395 r36, int r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3897.m11862(l.ۖۧۜ, l.ۖ۟᩻, int, int, int, int, int):l.ۢۧۜ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01ea, code lost:
    
        throw m11861();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ef, code lost:
    
        throw m11861();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9542 m11863(l.C2486 r37, l.InterfaceC2395 r38, int r39, int r40, int r41, long r42, int r44) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3897.m11863(l.ۖۧۜ, l.ۖ۟᩻, int, int, int, long, int):l.ۢۧۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11866(C21682 c21682, String str, int i, int i2) {
        String str2 = c21682.f69552;
        int i3 = c21682.f69555;
        int i4 = c21682.f69556;
        List list = c21682.f69553;
        if (!str.equals(str2) || i4 != i || c21682.f69554 != 1024 || i3 < 0 || list.size() > 1024) {
            throw m11861();
        }
        int size = list.size();
        if (i4 <= i3 && ((i2 < 0 || i2 == i3) && i4 + size <= i3)) {
            if ("entries".equals(str)) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String m11860 = m11860((InterfaceC8276) it.next());
                if (m11860 != null && m11860.length() > 4096) {
                    throw m11861();
                }
            }
            return;
        }
        throw m11861();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11869(InterfaceC8276 interfaceC8276) {
        if (interfaceC8276 instanceof C5454) {
            return ((C5454) interfaceC8276).f16982;
        }
        if (interfaceC8276 instanceof C11804) {
            return ((C11804) interfaceC8276).f35216;
        }
        if (interfaceC8276 instanceof C20271) {
            return ((C20271) interfaceC8276).f65509;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11860(InterfaceC8276 interfaceC8276) {
        if (interfaceC8276 instanceof C5454) {
            return ((C5454) interfaceC8276).f16978;
        }
        if (interfaceC8276 instanceof C11804) {
            return ((C11804) interfaceC8276).f35214;
        }
        if (interfaceC8276 instanceof C20271) {
            return ((C20271) interfaceC8276).f65510;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11859(String str) {
        return (str == null || str.isEmpty()) ? "" : C9045.m23341(new StringBuilder(" demangled=\""), m11868(str), "\"");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11858(long j) {
        if (j < 0) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11867(long j) {
        if (j < 0 || j > 2147483647L) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11868(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\t') {
                sb.append("\\t");
            } else if (Character.isISOControl(charAt)) {
                sb.append('?');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m11861() {
        return C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
    }
}
