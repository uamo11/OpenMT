package l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 93Z4 */
/* renamed from: l.᩹ܶ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22364 extends AbstractC2197 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f72451;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashSet f72452;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14602 f72453;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f72454;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f72455;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC14106 f72456;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashSet f72457;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f72458;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f72459;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f72460;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f72461;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f72462;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f72463;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72464;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72465;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f72466;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC1197 f72467;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumMap f72468;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC12816 f72469;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4314 f72449 = new C4314();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4314 f72448 = new C4314();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f72450 = new C4314();

    public C22364() {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22364 m50099(C2903 c2903) {
        C22364 c22364 = (C22364) c2903.m8838(f72449);
        return c22364 == null ? new C22364(c2903) : c22364;
    }

    public C22364(C2903 c2903) {
        EnumMap m50097;
        PrintWriter printWriter = (PrintWriter) c2903.m8838(f72448);
        PrintWriter printWriter2 = (PrintWriter) c2903.m8838(f72450);
        if (printWriter == null && printWriter2 == null) {
            m50097 = m50097(new PrintWriter((OutputStream) System.out, true), new PrintWriter((OutputStream) System.err, true));
        } else if (printWriter == null || printWriter2 == null) {
            printWriter = printWriter == null ? printWriter2 : printWriter;
            m50097 = m50097(printWriter, printWriter);
        } else {
            m50097 = m50097(printWriter, printWriter2);
        }
        this.f7221 = C5931.m16615(c2903);
        this.f7223 = new HashMap();
        this.f72454 = 0;
        this.f72451 = 0;
        this.f72465 = 0;
        this.f72466 = 0;
        this.f72452 = new HashSet();
        this.f72457 = new HashSet();
        c2903.m8841(f72449, this);
        this.f72468 = m50097;
        this.f72456 = (InterfaceC14106) c2903.m8837(InterfaceC14106.class);
        this.f72467 = new C0491(this);
        C14602 m34851 = C14602.m34851(c2903);
        this.f72453 = m34851;
        m34851.m34858("com.sun.tools.javac.resources.javac");
        C11781 m28823 = C11781.m28823(c2903);
        m50101(m28823);
        m28823.m28827(new RunnableC19473(5, this, m28823));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumMap m50097(PrintWriter printWriter, PrintWriter printWriter2) {
        EnumMap enumMap = new EnumMap(EnumC21659.class);
        enumMap.put((EnumMap) EnumC21659.ERROR, (EnumC21659) printWriter2);
        enumMap.put((EnumMap) EnumC21659.WARNING, (EnumC21659) printWriter2);
        enumMap.put((EnumMap) EnumC21659.NOTICE, (EnumC21659) printWriter2);
        enumMap.put((EnumMap) EnumC21659.STDOUT, (EnumC21659) printWriter);
        enumMap.put((EnumMap) EnumC21659.STDERR, (EnumC21659) printWriter2);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m50101(l.C11781 r3) {
        /*
            r2 = this;
            l.֡ۖ۠ r0 = l.EnumC0121.f1195
            boolean r0 = r3.m28832(r0)
            r2.f72459 = r0
            l.֡ۖ۠ r0 = l.EnumC0121.f1138
            boolean r0 = r3.m28832(r0)
            r2.f72455 = r0
            l.֡ۖ۠ r0 = l.EnumC0121.f1177
            java.lang.String r1 = "none"
            boolean r0 = r3.m28833(r0, r1)
            r2.f72458 = r0
            java.lang.String r0 = "suppressNotes"
            boolean r0 = r3.m28831(r0)
            r2.f72461 = r0
            l.֡ۖ۠ r0 = l.EnumC0121.f1211
            java.lang.String r0 = r3.m28825(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L37
            if (r0 > 0) goto L39
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L39
        L37:
            r0 = 100
        L39:
            r2.f72464 = r0
            l.֡ۖ۠ r0 = l.EnumC0121.f1148
            java.lang.String r0 = r3.m28825(r0)
            if (r0 == 0) goto L4c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L4c
            if (r0 > 0) goto L4a
            goto L4e
        L4a:
            r1 = r0
            goto L4e
        L4c:
            r1 = 100
        L4e:
            r2.f72463 = r1
            java.lang.String r0 = "rawDiagnostics"
            boolean r0 = r3.m28831(r0)
            if (r0 == 0) goto L5e
            l.ܿ᩸۠ r0 = new l.ܿ᩸۠
            r0.<init>(r3)
            goto L65
        L5e:
            l.ۚ֨۠ r0 = new l.ۚ֨۠
            l.ܳܶ۠ r1 = r2.f72453
            r0.<init>(r3, r1)
        L65:
            r2.f72469 = r0
            java.lang.String r0 = "expectKeys"
            java.lang.String r3 = r3.m28824(r0)
            if (r3 == 0) goto L80
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = ", *"
            java.lang.String[] r3 = r3.split(r1)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            r2.f72462 = r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22364.m50101(l.ۨܶ۠):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50124() {
        return this.f72456 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50114(InterfaceC18278 interfaceC18278, InterfaceC2029 interfaceC2029) {
        C12171.m29637(interfaceC18278);
        C14397 m7267 = m7267(interfaceC18278);
        InterfaceC2029 interfaceC20292 = m7267.f43369;
        if (interfaceC20292 != null && interfaceC20292 != interfaceC2029) {
            throw new IllegalStateException("endPosTable already set");
        }
        m7267.f43369 = interfaceC2029;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m50117() {
        C14397 c14397 = this.f7222;
        if (c14397 == null) {
            return null;
        }
        return c14397.f43371;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12816 m50125() {
        return this.f72469;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50113(C2798 c2798) {
        this.f72469 = c2798;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PrintWriter m50107(EnumC21659 enumC21659) {
        return (PrintWriter) this.f72468.get(enumC21659);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50110(PrintWriter printWriter) {
        for (EnumC21659 enumC21659 : EnumC21659.values()) {
            this.f72468.put((EnumMap) enumC21659, (EnumC21659) printWriter);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50112(AbstractC1197 abstractC1197) {
        C12171.m29642(this.f72467 == abstractC1197);
        this.f72467 = abstractC1197.f4332;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50122() {
        Iterator it = this.f72468.values().iterator();
        while (it.hasNext()) {
            ((PrintWriter) it.next()).flush();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50105(C22364 c22364, C16719 c16719) {
        HashSet hashSet = c22364.f72457;
        InterfaceC18278 m39350 = c16719.m39350();
        if (m39350 == null) {
            return true;
        }
        int m39358 = c16719.m39358();
        HashSet hashSet2 = c22364.f72452;
        C23069 c23069 = new C23069(m39350, Integer.valueOf(m39358));
        boolean contains = hashSet2.contains(c23069);
        if (!contains) {
            hashSet2.add(c23069);
        }
        if (contains) {
            return false;
        }
        if (!c16719.m39346(EnumC20043.SOURCE_LEVEL)) {
            return true;
        }
        C18837 c18837 = new C18837();
        m50102(c18837, c16719);
        C23069 c230692 = new C23069(m39350, c18837.m43517());
        boolean contains2 = hashSet.contains(c230692);
        boolean z = !contains2;
        if (!contains2) {
            hashSet.add(c230692);
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50102(C18837 c18837, C16719 c16719) {
        c18837.m43511(c16719.mo29298());
        for (Object obj : c16719.m39354()) {
            if (obj instanceof C16719) {
                m50102(c18837, (C16719) obj);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50116(AbstractC5144 abstractC5144) {
        C14397 c14397 = this.f7222;
        InterfaceC18278 interfaceC18278 = c14397 != null ? c14397.f43371 : null;
        if (interfaceC18278 != null) {
            return this.f72452.contains(new C23069(interfaceC18278, Integer.valueOf(abstractC5144.f16085)));
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50118(String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(EnumC15307.COMPILER_MISC, str, objArr));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50119(AbstractC4520 abstractC4520) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), this.f72453.m34855(abstractC4520));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50120(EnumC15307 enumC15307, String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(enumC15307, str, objArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50111(String str) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50115(EnumC21659 enumC21659, String str) {
        m50100(m50107(enumC21659), str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50100(PrintWriter printWriter, String str) {
        while (true) {
            int indexOf = str.indexOf(10);
            if (indexOf == -1) {
                break;
            }
            printWriter.println(str.substring(0, indexOf));
            str = str.substring(indexOf + 1);
        }
        if (str.length() != 0) {
            printWriter.println(str);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50123(String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(EnumC15307.COMPILER_MISC, "verbose.".concat(str), objArr));
    }

    @Override // l.AbstractC2197
    /* renamed from: ֫ */
    public final void mo7283(Object... objArr) {
        PrintWriter printWriter = (PrintWriter) this.f72468.get(EnumC21659.ERROR);
        m50100(printWriter, m50109(EnumC15307.COMPILER_MISC, "source.unavailable", objArr));
        printWriter.flush();
    }

    @Override // l.AbstractC2197
    /* renamed from: ֫ */
    public final void mo7277(C16719 c16719) {
        this.f72467.mo2165(c16719);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50121(C16719 c16719) {
        PrintWriter printWriter;
        int i;
        int read;
        InterfaceC14106 interfaceC14106 = this.f72456;
        if (interfaceC14106 != null) {
            interfaceC14106.mo33719(c16719);
            return;
        }
        EnumC12986 m39353 = c16719.m39353();
        int[] iArr = C19543.f63196;
        int i2 = iArr[m39353.ordinal()];
        if (i2 != 1) {
            EnumMap enumMap = this.f72468;
            if (i2 == 2) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.NOTICE);
            } else if (i2 == 3) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.WARNING);
            } else if (i2 == 4) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.ERROR);
            } else {
                throw new Error();
            }
            m50100(printWriter, this.f72469.mo8643(c16719, this.f72453.m34856()));
            if (this.f72455 && (((i = iArr[c16719.m39353().ordinal()]) == 3 || i == 4) && this.f72455)) {
                System.err.println(m50109(EnumC15307.COMPILER_MISC, "resume.abort", new Object[0]));
                do {
                    try {
                        read = System.in.read();
                        if (read != 65) {
                            if (read != 82) {
                                if (read == 88) {
                                    break;
                                } else if (read != 97) {
                                    if (read != 114) {
                                    }
                                }
                            }
                        }
                        System.exit(-1);
                    } catch (IOException unused) {
                    }
                } while (read != 120);
                throw new AssertionError("user abort");
            }
            if (this.f72459) {
                new RuntimeException().printStackTrace(printWriter);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m50106(String str, Object... objArr) {
        return C14602.m34852(EnumC15307.COMPILER_MISC.m36326(str), objArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50108(AbstractC4520 abstractC4520) {
        return this.f72453.m34855(abstractC4520);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50109(EnumC15307 enumC15307, String str, Object... objArr) {
        return this.f72453.m34853(enumC15307.m36326(str), objArr);
    }
}
