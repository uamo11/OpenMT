package l;

/* compiled from: D3VQ */
/* renamed from: l.᩻᩺ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C24010 extends AbstractC21189 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3319 f77811 = C3319.m10158();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f77812;

    public C24010(CharSequence charSequence) {
        charSequence.getClass();
        this.f77812 = charSequence;
    }

    @Override // l.AbstractC21189
    /* renamed from: ֫ */
    public final String mo48138() {
        return this.f77812.toString();
    }

    @Override // l.AbstractC21189
    /* renamed from: ۧ */
    public final AbstractC14545 mo48139() {
        return AbstractC14545.m34732(new C14837(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2 <= 30) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CharSource.wrap("
            r0.<init>(r1)
            java.lang.CharSequence r1 = r5.f77812
            r1.getClass()
            int r2 = r1.length()
            r3 = 30
            if (r2 > r3) goto L1f
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            if (r2 > r3) goto L1f
            goto L33
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r3 = 0
            r4 = 27
            r2.append(r1, r3, r4)
            java.lang.String r1 = "..."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L33:
            java.lang.String r2 = ")"
            java.lang.String r0 = l.C9045.m23341(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24010.toString():java.lang.String");
    }
}
