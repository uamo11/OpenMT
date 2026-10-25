package l;

import java.util.Arrays;
import java.util.EnumSet;

/* compiled from: 041R */
/* renamed from: l.ۙᩴ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4824 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22463 f15249;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumSet f15250;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumSet f15251;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f15248 = new C4314();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f15247 = new ConcurrentMapC10942(20);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4824 m14050(C2903 c2903) {
        C4824 c4824 = (C4824) c2903.m8838(f15248);
        return c4824 == null ? new C4824(c2903) : c4824;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m14053(AbstractC5698 abstractC5698) {
        C4824 m50393 = this.f15249.m50393(this, abstractC5698.m16082());
        if (abstractC5698.mo956()) {
            if (m50393 == this) {
                m50393 = new C4824(this);
            }
            EnumSet enumSet = m50393.f15251;
            EnumC20347 enumC20347 = EnumC20347.DEPRECATION;
            enumSet.remove(enumC20347);
            m50393.f15250.add(enumC20347);
        }
        return m50393;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m14054(EnumC20347... enumC20347Arr) {
        C4824 c4824 = new C4824(this);
        c4824.f15251.removeAll(Arrays.asList(enumC20347Arr));
        c4824.f15250.addAll(Arrays.asList(enumC20347Arr));
        return c4824;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4824(l.C2903 r10) {
        /*
            r9 = this;
            r9.<init>()
            l.ۨܶ۠ r0 = l.C11781.m28823(r10)
            l.֡ۖ۠ r1 = l.EnumC0121.f1188
            boolean r1 = r0.m28832(r1)
            java.lang.Class<l.᩶ᩴ֨> r2 = l.EnumC20347.class
            if (r1 != 0) goto L76
            l.֡ۖ۠ r1 = l.EnumC0121.f1177
            java.lang.String r3 = "all"
            boolean r3 = r0.m28829(r1, r3)
            if (r3 == 0) goto L1c
            goto L76
        L1c:
            java.lang.String r3 = "none"
            boolean r1 = r0.m28829(r1, r3)
            if (r1 == 0) goto L2b
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r2)
            r9.f15251 = r1
            goto L7c
        L2b:
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r2)
            r9.f15251 = r1
            l.ܽ֡֨ r3 = l.EnumC16280.m38301(r10)
            l.ܽ֡֨ r4 = l.EnumC16280.JDK9
            int r4 = r3.compareTo(r4)
            if (r4 < 0) goto L42
            l.᩶ᩴ֨ r4 = l.EnumC20347.DEP_ANN
            r1.add(r4)
        L42:
            l.ۧ֡֨ r4 = l.EnumC10637.f31975
            boolean r3 = r4.m26686(r3)
            if (r3 == 0) goto L4f
            l.᩶ᩴ֨ r3 = l.EnumC20347.STRICTFP
            r1.add(r3)
        L4f:
            l.᩶ᩴ֨ r3 = l.EnumC20347.REQUIRES_TRANSITIVE_AUTOMATIC
            r1.add(r3)
            l.᩶ᩴ֨ r3 = l.EnumC20347.OPENS
            r1.add(r3)
            l.᩶ᩴ֨ r3 = l.EnumC20347.MODULE
            r1.add(r3)
            l.᩶ᩴ֨ r3 = l.EnumC20347.REMOVAL
            r1.add(r3)
            l.֡ۖ۠ r3 = l.EnumC0121.f1210
            boolean r3 = r0.m28832(r3)
            if (r3 != 0) goto L70
            l.᩶ᩴ֨ r3 = l.EnumC20347.PREVIEW
            r1.add(r3)
        L70:
            l.᩶ᩴ֨ r3 = l.EnumC20347.SYNCHRONIZATION
            r1.add(r3)
            goto L7c
        L76:
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r2)
            r9.f15251 = r1
        L7c:
            l.᩶ᩴ֨[] r1 = l.EnumC20347.values()
            int r3 = r1.length
            r4 = 0
        L82:
            if (r4 >= r3) goto Lb4
            r5 = r1[r4]
            l.֡ۖ۠ r6 = l.EnumC0121.f1177
            java.lang.String r7 = r5.f65711
            boolean r7 = r0.m28829(r6, r7)
            if (r7 == 0) goto L96
            java.util.EnumSet r6 = r9.f15251
            r6.add(r5)
            goto Lb1
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "-"
            r7.<init>(r8)
            java.lang.String r8 = r5.f65711
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r6 = r0.m28829(r6, r7)
            if (r6 == 0) goto Lb1
            java.util.EnumSet r6 = r9.f15251
            r6.remove(r5)
        Lb1:
            int r4 = r4 + 1
            goto L82
        Lb4:
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r2)
            r9.f15250 = r0
            l.ۙ֨۠ r0 = l.C4824.f15248
            r10.m8841(r0, r9)
            l.᩹ᩴ֨ r0 = new l.᩹ᩴ֨
            r0.<init>(r10)
            r9.f15249 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4824.<init>(l.ۗ֨۠):void");
    }

    public C4824(C4824 c4824) {
        this.f15249 = c4824.f15249;
        this.f15251 = c4824.f15251.clone();
        this.f15250 = c4824.f15250.clone();
    }

    public final String toString() {
        return "Lint:[values" + this.f15251 + " suppressedValues" + this.f15250 + "]";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14055(EnumC20347 enumC20347) {
        return this.f15251.contains(enumC20347);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14056(EnumC20347 enumC20347) {
        return this.f15250.contains(enumC20347);
    }
}
