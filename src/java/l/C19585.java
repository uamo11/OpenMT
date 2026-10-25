package l;

import java.util.Map;

/* compiled from: A451 */
/* renamed from: l.᩵ܽ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19585 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC18879 f63277;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f63278;

    public C19585(AbstractC5698 abstractC5698, EnumC18879 enumC18879) {
        this.f63277 = enumC18879;
        this.f63278 = abstractC5698;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19585(l.AbstractC5698 r3, final l.C12364 r4) {
        /*
            r2 = this;
            int[] r0 = l.C15622.f48100
            l.֨ᩴ֨ r1 = r3.f17559
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 4
            if (r0 == r1) goto L13
            r1 = 5
            if (r0 == r1) goto L13
            l.ᩴܽ۠ r4 = l.EnumC18879.UNDEFINED
            goto L3e
        L13:
            l.ۖܶ۠ r0 = l.C12364.m29993(r4)
            l.ܿ᩺ᩴ r0 = l.C5378.stream(r0)
            l.ܺܽ۠ r1 = new l.ܺܽ۠
            r1.<init>()
            l.ܿ᩺ᩴ r4 = r0.filter(r1)
            l.ۖܽ۠ r0 = new l.ۖܽ۠
            r0.<init>()
            l.ܿ᩺ᩴ r4 = r4.map(r0)
            l.ۘܽ۠ r0 = new l.ۘܽ۠
            r0.<init>()
            l.ܽ۫ᩴ r4 = r4.reduce(r0)
            l.ᩴܽ۠ r0 = l.EnumC18879.UNDEFINED
            java.lang.Object r4 = r4.orElse(r0)
            l.ᩴܽ۠ r4 = (l.EnumC18879) r4
        L3e:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19585.<init>(l.ۛ֡֨, l.۫ۧ۠):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45024() {
        return this.f63277 != EnumC18879.UNDEFINED;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45023(EnumC18879 enumC18879) {
        return this.f63277 == enumC18879;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45022() {
        Map m22831;
        int[] iArr = C15622.f48100;
        AbstractC5698 abstractC5698 = this.f63278;
        int i = iArr[abstractC5698.f17559.ordinal()];
        if (i != 1) {
            if (i == 3) {
                C6720 c6720 = (C6720) abstractC5698.mo7048();
                String m48696 = EnumC21537.ARITY_MISMATCH.m48696();
                C7425[] c7425Arr = new C7425[0];
                C16719 c16719 = (C16719) c6720.mo1315().f74208;
                Object[] m39354 = c16719.m39354();
                if (c16719.mo29298().matches(m48696) && c16719.m39354().length == 0) {
                    for (int i2 = 0; i2 < m39354.length; i2++) {
                        if (c7425Arr[i2].mo19958(m39354[i2])) {
                        }
                    }
                }
            } else if (i == 6) {
                m22831 = ((C8837) abstractC5698.mo7048()).m22831();
                return C8837.m22829(m22831).isEmpty();
            }
            return false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19585 m45021(AbstractC5698 abstractC5698) {
        return new C19585(abstractC5698, EnumC18879.UNDEFINED);
    }
}
