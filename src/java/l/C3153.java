package l;

import java.util.ArrayList;

/* compiled from: T1PJ */
/* renamed from: l.ۗۢۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3153 implements Comparable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f9846;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9847;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f9848;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f9849;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (!this.f9848 ? 1 : 0) - (!((C3153) obj).f9848 ? 1 : 0);
    }

    public C3153(String str, boolean z) {
        if (str.startsWith("!") || str.startsWith("！")) {
            str = str.substring(1);
            this.f9848 = true;
        } else {
            this.f9848 = false;
        }
        if (str.endsWith("**")) {
            this.f9849 = 2;
            this.f9847 = C15472.m36561(2, 0, str);
        } else if (str.endsWith("*")) {
            this.f9849 = 1;
            this.f9847 = C15472.m36561(1, 0, str);
        } else {
            this.f9849 = 0;
            this.f9847 = str;
        }
        this.f9846 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9583(java.lang.String r7) {
        /*
            r6 = this;
            r0 = -1
            r1 = 46
            r2 = 1
            r3 = 0
            java.lang.String r4 = r6.f9847
            int r5 = r6.f9849
            if (r5 != 0) goto L32
            boolean r5 = r7.startsWith(r4)
            if (r5 == 0) goto L45
            int r4 = r4.length()
            java.lang.String r7 = r7.substring(r4)
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L44
            boolean r4 = r6.f9846
            if (r4 == 0) goto L45
            char r4 = r7.charAt(r3)
            r5 = 36
            if (r4 != r5) goto L45
            int r7 = r7.indexOf(r1)
            if (r7 != r0) goto L45
            goto L44
        L32:
            if (r5 != r2) goto L46
            boolean r5 = r7.startsWith(r4)
            if (r5 == 0) goto L45
            int r4 = r4.length()
            int r7 = r7.indexOf(r1, r4)
            if (r7 != r0) goto L45
        L44:
            return r2
        L45:
            return r3
        L46:
            boolean r7 = r7.startsWith(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3153.m9583(java.lang.String):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7397 m9582(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split("\n")) {
            if (!str2.isEmpty()) {
                C3153 c3153 = new C3153(str2, false);
                if (c3153.f9848) {
                    arrayList2.add(c3153);
                } else {
                    arrayList.add(c3153);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return new C20087(0);
        }
        return new C4564(arrayList2, arrayList);
    }
}
