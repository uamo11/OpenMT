package l;

/* compiled from: O8L1 */
/* renamed from: l.ۗ۬֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3248 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15894 f10204;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f10205;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10206;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10207;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13125 f10208;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f10209;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f10210;

    public C3248(C13125 c13125, String str, int i, C15894 c15894) {
        this.f10208 = c13125;
        this.f10209 = str;
        this.f10206 = i;
        this.f10210 = c15894 == null ? -1L : c15894.f49111;
        if (c15894 == null || !c15894.m37669()) {
            return;
        }
        this.f10204 = c15894;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r7.mo14107()) goto L15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9945(l.AbstractC4846 r6, l.AbstractC4846 r7) {
        /*
            r5 = this;
            int r0 = r5.f10206
            int r1 = r6.mo14107()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r6 = r7.mo14107()
            if (r0 >= r6) goto L40
            goto L41
        L11:
            l.۬۬֫ r1 = r5.f10208
            l.᩶᩵֫ r4 = l.C13125.m31788(r1)
            r6.m14106(r0, r4)
            l.᩶᩵֫ r0 = l.C13125.m31788(r1)
            int r0 = r0.f65760
        L20:
            l.᩶᩵֫ r4 = l.C13125.m31788(r1)
            int r4 = r4.f65752
            if (r0 > r4) goto L40
            java.lang.Object r4 = r6.mo14102(r0)
            int r4 = r7.mo14098(r4)
            if (r4 == r3) goto L3d
            l.᩹᩵֫ r6 = l.C13125.m31785(r1)
            l.᩹᩵֫ r6 = r7.mo14104(r4, r6, r2)
            int r0 = r6.f72806
            goto L41
        L3d:
            int r0 = r0 + 1
            goto L20
        L40:
            r0 = -1
        L41:
            r5.f10206 = r0
            if (r0 != r3) goto L46
            goto L55
        L46:
            l.ܺۧۧ r6 = r5.f10204
            if (r6 != 0) goto L4b
            goto L53
        L4b:
            java.lang.Object r6 = r6.f49112
            int r6 = r7.mo14098(r6)
            if (r6 == r3) goto L55
        L53:
            r6 = 1
            return r6
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3248.m9945(l.ۙ᩵֫, l.ۙ᩵֫):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9943(int i, C15894 c15894) {
        if (c15894 == null) {
            return i == this.f10206;
        }
        long j = c15894.f49111;
        C15894 c158942 = this.f10204;
        return c158942 == null ? !c15894.m37669() && j == this.f10210 : j == c158942.f49111 && c15894.f49108 == c158942.f49108 && c15894.f49109 == c158942.f49109;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9946(int i, C15894 c15894) {
        if (this.f10210 == -1 && i == this.f10206 && c15894 != null) {
            long j = c15894.f49111;
            if (j >= this.f10208.m31789()) {
                this.f10210 = j;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9944(C0425 c0425) {
        C15894 c15894 = c0425.f1895;
        AbstractC4846 abstractC4846 = c0425.f1892;
        if (c15894 == null) {
            return this.f10206 != c0425.f1893;
        }
        long j = this.f10210;
        if (j == -1) {
            return false;
        }
        if (c15894.f49111 > j) {
            return true;
        }
        C15894 c158942 = this.f10204;
        if (c158942 == null) {
            return false;
        }
        int i = c158942.f49108;
        int mo14098 = abstractC4846.mo14098(c15894.f49112);
        int mo140982 = abstractC4846.mo14098(c158942.f49112);
        if (c15894.f49111 < c158942.f49111 || mo14098 < mo140982) {
            return false;
        }
        if (mo14098 > mo140982) {
            return true;
        }
        if (c15894.m37669()) {
            int i2 = c15894.f49108;
            int i3 = c15894.f49109;
            if (i2 <= i) {
                return i2 == i && i3 > c158942.f49109;
            }
            return true;
        }
        int i4 = c15894.f49110;
        return i4 == -1 || i4 > i;
    }
}
