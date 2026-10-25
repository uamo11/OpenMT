package l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* compiled from: Z556 */
/* renamed from: l.ܽۨ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16611 extends AbstractC18769 implements InterfaceC18444 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C0225 f51032 = new C0225(C17615.f53826 * 2);

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51033 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f51034;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12918 f51035;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f51036;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51037;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51038 = -1;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51039;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f51040;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51041;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f51042;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7980 f51043;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f51044;

    public C16611(C12918 c12918, C18729 c18729, C7980 c7980, int i, InterfaceC13848 interfaceC13848, InterfaceC13848 interfaceC138482, int i2) {
        this.f51035 = c12918;
        this.f51043 = c7980;
        c18729.getClass();
        int m43363 = c18729.m43363() + i;
        this.f51037 = m43363;
        this.f51042 = c18729.m43368();
        this.f51041 = c18729.m43368();
        this.f51034 = i2;
        this.f51040 = interfaceC13848.seekTo(m43363);
        this.f51036 = interfaceC138482.seekTo(m43363);
    }

    @Override // l.InterfaceC5471
    /* renamed from: ܳ */
    public final String mo3566() {
        return this.f51043.getType();
    }

    @Override // l.InterfaceC18444
    /* renamed from: ܽ */
    public final int mo3567() {
        return this.f51042;
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        C12918 c12918 = this.f51035;
        return c12918.m31422(c12918.m31418().mo11935(m39122() + 4));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39131(Writer writer) {
        C12918 c12918 = this.f51035;
        c12918.m31385(c12918.m31418().mo11935(m39122() + 4), writer, false);
    }

    @Override // l.InterfaceC5471
    /* renamed from: ᩳ */
    public final String mo3568() {
        C12918 c12918 = this.f51035;
        return c12918.m31401(c12918.m31418().mo11935(m39127() + 4));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39135(Writer writer) {
        C12918 c12918 = this.f51035;
        c12918.m31386(writer, c12918.m31418().mo11935(m39127() + 4));
    }

    @Override // l.InterfaceC18444
    public final List getParameters() {
        if (m39126() > 0) {
            return new ArrayList(new C5863(this, mo3565()));
        }
        return AbstractC14545.of();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m39128() {
        return AbstractC10844.m27107(this.f51035, this.f51036);
    }

    @Override // l.InterfaceC5471
    /* renamed from: ۘ */
    public final List mo3565() {
        int m39126 = m39126();
        if (m39126 > 0) {
            return new C11508(this, m39126 + 4, this.f51035.m31418().mo11935(m39126));
        }
        return AbstractC14545.of();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39134(Writer writer) {
        int m39126 = m39126();
        if (m39126 > 0) {
            C12918 c12918 = this.f51035;
            int mo11935 = c12918.m31418().mo11935(m39126);
            int i = m39126 + 4;
            for (int i2 = 0; i2 < mo11935; i2++) {
                c12918.m31386(writer, c12918.m31418().m11936((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC18444
    public final Set getAnnotations() {
        return AbstractC10844.m27106(this.f51035, this.f51040);
    }

    @Override // l.InterfaceC18444
    /* renamed from: ᩵ */
    public final Set mo3569() {
        int i = this.f51034;
        if (i == 7) {
            return AbstractC6079.of();
        }
        return EnumSet.copyOf((Collection) EnumC18481.m42970(i));
    }

    @Override // l.InterfaceC18444
    /* renamed from: ᩷ۧ */
    public final C20846 mo3570() {
        int i = this.f51041;
        if (i > 0) {
            return new C20846(this.f51035, this, i);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39132(InterfaceC7274 interfaceC7274) {
        C12918 c12918 = this.f51035;
        if (c12918.m31420()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan");
        }
        int i = this.f51041;
        if (i <= 0) {
            return;
        }
        AbstractC3912 m31418 = c12918.m31418();
        int mo11935 = m31418.mo11935(i + 12);
        int i2 = i + 16;
        long j = (mo11935 * 2) + i2;
        if (j > 2147483647L) {
            throw new C15431(null, "Instruction list for method %s is out of range", this);
        }
        int i3 = (int) j;
        while (i2 < i3) {
            int m11942 = m31418.m11942(i2);
            if (m11942 == 0) {
                m11942 = m31418.m11936(i2);
            }
            EnumC0841 m21189 = c12918.mo27437().m21189(m11942);
            int m39123 = m39123(m31418, i2, m21189);
            if (m39123 <= 0) {
                throw new C15431(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i2));
            }
            long j2 = (m39123 * 2) + i2;
            if (j2 > i3) {
                throw new C15431(null, "The last instruction in method %s is truncated", this);
            }
            if (m21189 == EnumC0841.f3137) {
                interfaceC7274.mo19516(m31418.m11936(i2 + 2));
            } else if (m21189 == EnumC0841.f3220) {
                interfaceC7274.mo19516(m31418.mo11935(i2 + 2));
            }
            i2 = (int) j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m39129(int r19, l.InterfaceC1795 r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16611.m39129(int, l.֫ۨ֡):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39130(int i, InterfaceC10968 interfaceC10968) {
        int m11936;
        C12918 c12918 = this.f51035;
        if (c12918.m31420()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan");
        }
        int i2 = this.f51041;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC3912 m31418 = c12918.m31418();
        int mo11935 = m31418.mo11935(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (mo11935 * 2) + i3;
        if (j2 > 2147483647L) {
            throw new C15431(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int m11942 = m31418.m11942(i3);
            if (m11942 == 0) {
                m11942 = m31418.m11936(i3);
            }
            EnumC0841 m21189 = c12918.mo27437().m21189(m11942);
            int m39123 = m39123(m31418, i3, m21189);
            if (m39123 <= 0) {
                throw new C15431(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (m39123 * j) + i3;
            if (j3 > i4) {
                throw new C15431(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && m21189 != null && m21189.f3318 != 7) {
                switch (C13623.f40632[m21189.f3316.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        m11936 = m31418.m11936(i3 + 2);
                        break;
                    case 7:
                        m11936 = m31418.mo11935(i3 + 2);
                        break;
                    default:
                        m11936 = -1;
                        break;
                }
                if (m11936 >= 0) {
                    if (!interfaceC10968.mo27280(i5, m21189.f3318, m11936, m21189)) {
                        return i6;
                    }
                    i3 = (int) j3;
                    i5 = i6;
                    j = 2;
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39123(AbstractC3912 abstractC3912, int i, EnumC0841 enumC0841) {
        if (enumC0841 == null) {
            return 1;
        }
        int i2 = C13623.f40633[enumC0841.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (abstractC3912.m11936(i + 2) * 2) + 4;
            }
            if (i2 == 3) {
                return (abstractC3912.m11936(i + 2) * 4) + 2;
            }
            return enumC0841.f3316.f11595 / 2;
        }
        int m11936 = abstractC3912.m11936(i + 2);
        if (m11936 == 0) {
            return 4;
        }
        int mo11937 = abstractC3912.mo11937(i + 4);
        if (mo11937 < 0) {
            throw new C15431(null, "Invalid array-payload instruction: negative element count", new Object[0]);
        }
        long j = m11936 * mo11937;
        if (j > 2147483647L) {
            throw new C15431(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        return ((((int) j) + 1) / 2) + 4;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m39122() {
        if (this.f51039 == 0) {
            this.f51039 = this.f51035.m31415(this.f51037);
        }
        return this.f51039;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m39127() {
        if (this.f51044 == 0) {
            C12918 c12918 = this.f51035;
            this.f51044 = c12918.m31399(c12918.m31418().m11936(m39122() + 2));
        }
        return this.f51044;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m39126() {
        if (this.f51038 == -1) {
            this.f51038 = this.f51035.m31418().mo11935(m39127() + 8);
        }
        return this.f51038;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r8 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
    
        r0.m1477(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        if (r8 == null) goto L68;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m39133(l.C16611 r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16611.m39133(l.ܽۨ֡, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11418 m39124(C1190 c1190, boolean z) {
        C0225 c0225 = f51032;
        C11418 c11418 = (C11418) c0225.m1479();
        if (c11418 == null) {
            c11418 = new C11418();
        } else {
            c11418.m28185(0);
        }
        try {
            c1190.m4015(new C22796(new C22706(c11418), z));
            return c11418;
        } catch (IOException | RuntimeException e) {
            c0225.m1477(c11418);
            throw e;
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m39125() {
        f51032.m1478();
    }
}
