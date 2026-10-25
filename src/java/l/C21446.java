package l;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 91JR */
/* renamed from: l.᩸۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21446 extends C5923 {

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public int f69047;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f69048;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C7334 f69042 = new C7334(this);

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public C16711 f69049 = new C16711(this);

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13683 f69045 = null;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f69051 = false;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C17212 f69052 = new C17212();

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f69054 = 0;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public int f69044 = 0;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public C18624[] f69043 = new C18624[4];

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C18624[] f69055 = new C18624[4];

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f69058 = 257;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f69056 = false;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f69053 = false;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f69041 = null;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public WeakReference f69046 = null;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f69057 = null;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f69050 = null;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C22856 f69059 = new C22856();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48565(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f69048 = i6;
        this.f69047 = i7;
        this.f69042.m19692(this, i, i2, i3, i4, i5);
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void m48570() {
        this.f69042.m19691(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48567(InterfaceC13683 interfaceC13683) {
        this.f69045 = interfaceC13683;
        this.f69049.m39332(interfaceC13683);
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13683 m48571() {
        return this.f69045;
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m48581() {
        this.f69052.getClass();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m48572(int i) {
        this.f69058 = i;
        C17212.f52792 = m48564(512);
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int m48580() {
        return this.f69058;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m48564(int i) {
        return (this.f69058 & i) == i;
    }

    @Override // l.C5923, l.C15094
    /* renamed from: ᩺ */
    public final void mo16611() {
        this.f69052.m40505();
        this.f69048 = 0;
        this.f69047 = 0;
        super.mo16611();
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48569() {
        return this.f69056;
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48573() {
        return this.f69053;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48579(C5218 c5218) {
        WeakReference weakReference = this.f69041;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69041.get()).m15004()) {
            this.f69041 = new WeakReference(c5218);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48575(C5218 c5218) {
        WeakReference weakReference = this.f69057;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69057.get()).m15004()) {
            this.f69057 = new WeakReference(c5218);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48566(C5218 c5218) {
        WeakReference weakReference = this.f69050;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69050.get()).m15004()) {
            this.f69050 = new WeakReference(c5218);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48576(C17212 c17212) {
        boolean m48564 = m48564(64);
        mo7759(c17212, m48564);
        int size = this.f18169.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) this.f18169.get(i);
            c15094.m35711(0, false);
            c15094.m35711(1, false);
            if (c15094 instanceof C2396) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C15094 c150942 = (C15094) this.f18169.get(i2);
                if (c150942 instanceof C2396) {
                    ((C2396) c150942).m7761();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C15094 c150943 = (C15094) this.f18169.get(i3);
            c150943.getClass();
            if ((c150943 instanceof C10157) || (c150943 instanceof C3101)) {
                c150943.mo7759(c17212, m48564);
            }
        }
        if (C17212.f52792) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C15094 c150944 = (C15094) this.f18169.get(i4);
                c150944.getClass();
                if (!(c150944 instanceof C10157) && !(c150944 instanceof C3101)) {
                    hashSet.add(c150944);
                }
            }
            m35720(this, c17212, hashSet, this.f46124[0] == EnumC8040.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C15094 c150945 = (C15094) it.next();
                C12273.m29805(this, c17212, c150945);
                c150945.mo7759(c17212, m48564);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C15094 c150946 = (C15094) this.f18169.get(i5);
                if (c150946 instanceof C21446) {
                    EnumC8040[] enumC8040Arr = c150946.f46124;
                    EnumC8040 enumC8040 = enumC8040Arr[0];
                    EnumC8040 enumC80402 = enumC8040Arr[1];
                    EnumC8040 enumC80403 = EnumC8040.WRAP_CONTENT;
                    if (enumC8040 == enumC80403) {
                        c150946.m35717(EnumC8040.FIXED);
                    }
                    if (enumC80402 == enumC80403) {
                        c150946.m35746(EnumC8040.FIXED);
                    }
                    c150946.mo7759(c17212, m48564);
                    if (enumC8040 == enumC80403) {
                        c150946.m35717(enumC8040);
                    }
                    if (enumC80402 == enumC80403) {
                        c150946.m35746(enumC80402);
                    }
                } else {
                    C12273.m29805(this, c17212, c150946);
                    if (!(c150946 instanceof C10157) && !(c150946 instanceof C3101)) {
                        c150946.mo7759(c17212, m48564);
                    }
                }
            }
        }
        if (this.f69054 > 0) {
            C3807.m11489(this, c17212, null, 0);
        }
        if (this.f69044 > 0) {
            C3807.m11489(this, c17212, null, 1);
        }
    }

    @Override // l.C15094
    /* renamed from: ֫ */
    public final void mo35722(boolean z, boolean z2) {
        super.mo35722(z, z2);
        int size = this.f18169.size();
        for (int i = 0; i < size; i++) {
            ((C15094) this.f18169.get(i)).mo35722(z, z2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48577(boolean z) {
        this.f69051 = z;
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48578() {
        return this.f69051;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0215  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    @Override // l.C5923
    /* renamed from: ܳ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo16610() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21446.mo16610():void");
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C17212 m48574() {
        return this.f69052;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48568(C15094 c15094, int i) {
        if (i == 0) {
            int i2 = this.f69054 + 1;
            C18624[] c18624Arr = this.f69055;
            if (i2 >= c18624Arr.length) {
                this.f69055 = (C18624[]) Arrays.copyOf(c18624Arr, c18624Arr.length * 2);
            }
            C18624[] c18624Arr2 = this.f69055;
            int i3 = this.f69054;
            c18624Arr2[i3] = new C18624(c15094, 0, this.f69051);
            this.f69054 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f69044 + 1;
            C18624[] c18624Arr3 = this.f69043;
            if (i4 >= c18624Arr3.length) {
                this.f69043 = (C18624[]) Arrays.copyOf(c18624Arr3, c18624Arr3.length * 2);
            }
            C18624[] c18624Arr4 = this.f69043;
            int i5 = this.f69044;
            c18624Arr4[i5] = new C18624(c15094, 1, this.f69051);
            this.f69044 = i5 + 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48563(C15094 c15094, InterfaceC13683 interfaceC13683, C22856 c22856) {
        int i;
        int i2;
        if (interfaceC13683 == null) {
            return;
        }
        EnumC8040[] enumC8040Arr = c15094.f46124;
        int[] iArr = c15094.f46119;
        c22856.f73745 = enumC8040Arr[0];
        c22856.f73753 = enumC8040Arr[1];
        c22856.f73748 = c15094.m35753();
        c22856.f73747 = c15094.m35732();
        c22856.f73754 = false;
        c22856.f73750 = 0;
        EnumC8040 enumC8040 = c22856.f73745;
        EnumC8040 enumC80402 = EnumC8040.MATCH_CONSTRAINT;
        boolean z = enumC8040 == enumC80402;
        boolean z2 = c22856.f73753 == enumC80402;
        boolean z3 = z && c15094.f46108 > 0.0f;
        boolean z4 = z2 && c15094.f46108 > 0.0f;
        if (z && c15094.m35761(0) && c15094.f46145 == 0 && !z3) {
            c22856.f73745 = EnumC8040.WRAP_CONTENT;
            if (z2 && c15094.f46170 == 0) {
                c22856.f73745 = EnumC8040.FIXED;
            }
            z = false;
        }
        if (z2 && c15094.m35761(1) && c15094.f46170 == 0 && !z4) {
            c22856.f73753 = EnumC8040.WRAP_CONTENT;
            if (z && c15094.f46145 == 0) {
                c22856.f73753 = EnumC8040.FIXED;
            }
            z2 = false;
        }
        if (c15094.mo7762()) {
            c22856.f73745 = EnumC8040.FIXED;
            z = false;
        }
        if (c15094.mo7768()) {
            c22856.f73753 = EnumC8040.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c22856.f73745 = EnumC8040.FIXED;
            } else if (!z2) {
                EnumC8040 enumC80403 = c22856.f73753;
                EnumC8040 enumC80404 = EnumC8040.FIXED;
                if (enumC80403 == enumC80404) {
                    i2 = c22856.f73747;
                } else {
                    c22856.f73745 = EnumC8040.WRAP_CONTENT;
                    interfaceC13683.mo32930(c15094, c22856);
                    i2 = c22856.f73749;
                }
                c22856.f73745 = enumC80404;
                int i3 = c15094.f46122;
                if (i3 == 0 || i3 == -1) {
                    c22856.f73748 = (int) (c15094.f46108 * i2);
                } else {
                    c22856.f73748 = (int) (c15094.f46108 / i2);
                }
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c22856.f73753 = EnumC8040.FIXED;
            } else if (!z) {
                EnumC8040 enumC80405 = c22856.f73745;
                EnumC8040 enumC80406 = EnumC8040.FIXED;
                if (enumC80405 == enumC80406) {
                    i = c22856.f73748;
                } else {
                    c22856.f73753 = EnumC8040.WRAP_CONTENT;
                    interfaceC13683.mo32930(c15094, c22856);
                    i = c22856.f73746;
                }
                c22856.f73753 = enumC80406;
                int i4 = c15094.f46122;
                if (i4 == 0 || i4 == -1) {
                    c22856.f73747 = (int) (i / c15094.f46108);
                } else {
                    c22856.f73747 = (int) (i * c15094.f46108);
                }
            }
        }
        interfaceC13683.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
        c22856.f73750 = 0;
    }
}
