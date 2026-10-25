package l;

/* compiled from: Z5U8 */
/* renamed from: l.ܿۜ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class RunnableC17179 extends C14356 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 f52652;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 f52653;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f52654;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3581 f52655;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC17179(l.C20002 r4, l.C3581 r5, l.AbstractC8624 r6) {
        /*
            r3 = this;
            r3.f52654 = r4
            l.ۛ֡֨ r0 = r4.f64760
            l.֨ᩴ֨ r1 = r0.f17559
            l.֨ᩴ֨ r2 = l.EnumC1296.f4571
            if (r1 != r2) goto Lf
            l.ܳ֡֨ r0 = r0.m16071()
            goto L11
        Lf:
            l.ܳ֡֨ r0 = (l.C14163) r0
        L11:
            r3.<init>(r4, r0)
            l.ᩳ᩶۠ r4 = r4.f64755
            r3.f52652 = r4
            r3.f52655 = r5
            r3.f52653 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC17179.<init>(l.᩶ۜ۠, l.ۘ֡֨, l.ۡۘ֨):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20002 c20002 = this.f52654;
        InterfaceC18278 interfaceC18278 = c20002.f64755;
        try {
            C3581 c3581 = this.f52655;
            c3581.f11370 = null;
            c20002.f64755 = this.f52652;
            c3581.f11370 = m34257(c3581.f17560.mo12923(), this.f52653);
        } finally {
            c20002.f64755 = interfaceC18278;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader store default for ");
        C3581 c3581 = this.f52655;
        sb.append(c3581.f17561);
        sb.append(".");
        sb.append(c3581);
        sb.append(" is ");
        sb.append(this.f52653);
        return sb.toString();
    }
}
