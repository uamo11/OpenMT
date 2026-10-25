package l;

/* compiled from: M1C7 */
/* renamed from: l.۠ܶ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC8245 implements InterfaceC11068 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2601 f25375;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15094 f25376;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC8040 f25377;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25380;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14594 f25374 = new C14594(this);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f25378 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25383 = false;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17417 f25382 = new C17417(this);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17417 f25379 = new C17417(this);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC1189 f25381 = EnumC1189.NONE;

    /* renamed from: ֫ */
    public abstract void mo6240();

    @Override // l.InterfaceC11068
    /* renamed from: ֫ */
    public void mo6241(InterfaceC11068 interfaceC11068) {
    }

    /* renamed from: ۧ */
    public abstract void mo6242();

    /* renamed from: ܳ */
    public abstract boolean mo6243();

    /* renamed from: ܽ */
    public abstract void mo6244();

    public AbstractC8245(C15094 c15094) {
        this.f25376 = c15094;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17417 m21826(C5218 c5218) {
        C5218 c52182 = c5218.f16339;
        if (c52182 == null) {
            return null;
        }
        C15094 c15094 = c52182.f16341;
        int i = C5423.f16914[c52182.f16345.ordinal()];
        if (i == 1) {
            return c15094.f46156.f25382;
        }
        if (i == 2) {
            return c15094.f46156.f25379;
        }
        if (i == 3) {
            return c15094.f46140.f25382;
        }
        if (i == 4) {
            return c15094.f46140.f59402;
        }
        if (i != 5) {
            return null;
        }
        return c15094.f46140.f25379;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f25380 == 3) goto L51;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21830(l.C5218 r13, l.C5218 r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC8245.m21830(l.ۚ۠, l.ۚ۠, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21829(int i, int i2) {
        if (i2 == 0) {
            C15094 c15094 = this.f25376;
            int i3 = c15094.f46113;
            int max = Math.max(c15094.f46153, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C15094 c150942 = this.f25376;
            int i4 = c150942.f46128;
            int max2 = Math.max(c150942.f46138, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17417 m21827(C5218 c5218, int i) {
        C5218 c52182 = c5218.f16339;
        if (c52182 == null) {
            return null;
        }
        C15094 c15094 = c52182.f16341;
        AbstractC8245 abstractC8245 = i == 0 ? c15094.f46156 : c15094.f46140;
        int i2 = C5423.f16914[c52182.f16345.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC8245.f25379;
        }
        return abstractC8245.f25382;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21828(C17417 c17417, C17417 c174172, int i) {
        c17417.f53275.add(c174172);
        c17417.f53272 = i;
        c174172.f53269.add(c17417);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21831(C17417 c17417, C17417 c174172, int i, C14594 c14594) {
        c17417.f53275.add(c174172);
        c17417.f53275.add(this.f25374);
        c17417.f53273 = i;
        c17417.f53274 = c14594;
        c174172.f53269.add(c17417);
        c14594.f53269.add(c17417);
    }

    /* renamed from: ᩳ */
    public long mo6245() {
        if (this.f25374.f53276) {
            return r0.f53271;
        }
        return 0L;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m21832() {
        return this.f25383;
    }
}
