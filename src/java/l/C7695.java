package l;

import java.util.HashMap;

/* compiled from: 91US */
/* renamed from: l.۟᩶ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7695 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5961 f23765;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f23766;

    public C7695(C22016 c22016) {
        super(2);
        C5961 c5961 = new C5961();
        this.f23765 = c5961;
        this.f23766 = new HashMap();
        c22016.m49537(new C14044(this));
        c5961.mo16696(c22016.m49534());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r1.matches("[0-9]+") != false) goto L12;
     */
    @Override // l.AbstractC2821, l.InterfaceC8898
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1225(l.C2966 r6) {
        /*
            r5 = this;
            java.lang.String r0 = m20585(r6)
            if (r0 != 0) goto La4
            l.ۗۗۡ r0 = r6.m9077()
            r1 = -1
            l.ۛۡᩴ r2 = r5.f23765
            if (r0 == 0) goto L5a
            r5.mo1225(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r0 = r0.mo13101()
            r3.append(r0)
            java.lang.String r0 = "$"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = r6.m45794()
            r4 = 36
            int r4 = r3.lastIndexOf(r4)
            if (r4 == r1) goto L42
            int r4 = r4 + 1
            java.lang.String r1 = r3.substring(r4)
            java.lang.String r3 = "[0-9]+"
            boolean r3 = r1.matches(r3)
            if (r3 == 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            if (r1 == 0) goto L70
            java.lang.String r1 = l.C16014.m37867(r0, r1)
            int r3 = r1.hashCode()
            boolean r4 = r2.contains(r3)
            if (r4 != 0) goto L70
            r2.add(r3)
            r6.mo13103(r1)
            return
        L5a:
            java.lang.String r0 = r6.m45794()
            r3 = 47
            int r3 = r0.lastIndexOf(r3)
            if (r3 != r1) goto L69
            java.lang.String r0 = ""
            goto L70
        L69:
            r1 = 0
            int r3 = r3 + 1
            java.lang.String r0 = r0.substring(r1, r3)
        L70:
            java.util.HashMap r1 = r5.f23766
            java.lang.Object r3 = r1.get(r0)
            l.֨ۙۡ r3 = (l.AbstractC0890) r3
            if (r3 != 0) goto L81
            l.֨ۙۡ r3 = l.AbstractC0890.m3238()
            r1.put(r0, r3)
        L81:
            java.lang.StringBuilder r1 = l.C5368.m15339(r0)
            java.lang.String r4 = r3.mo3239()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            int r4 = r1.hashCode()
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L81
            int r0 = r1.hashCode()
            r2.add(r0)
            r6.mo13103(r1)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7695.mo1225(l.ۗۗۡ):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m20585(C2966 c2966) {
        Object mo13101 = c2966.mo13101();
        if (mo13101 instanceof String) {
            return (String) mo13101;
        }
        return null;
    }
}
