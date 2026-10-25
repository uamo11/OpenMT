package l;

import java.util.Iterator;

/* compiled from: Z5U8 */
/* renamed from: l.ᩳۜ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class RunnableC17885 extends C14356 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 f54617;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f54618;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f54619;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2609 f54620;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC17885(l.C20002 r4, l.AbstractC5698 r5, l.C2609 r6) {
        /*
            r3 = this;
            r3.f54618 = r4
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
            l.֨ᩴ֨ r0 = r5.f17559
            l.֨ᩴ֨ r1 = l.EnumC1296.f4582
            if (r0 != r1) goto L25
            l.ۛ֡֨ r0 = r5.f17561
            l.֨ᩴ֨ r1 = r0.f17559
            l.֨ᩴ֨ r2 = l.EnumC1296.f4568
            if (r1 != r2) goto L25
            r3.f54619 = r0
            goto L27
        L25:
            r3.f54619 = r5
        L27:
            r3.f54620 = r6
            l.ᩳ᩶۠ r4 = r4.f64755
            r3.f54617 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC17885.<init>(l.᩶ۜ۠, l.ۛ֡֨, l.ۖܶ۠):void");
    }

    public void run() {
        AbstractC5698 abstractC5698;
        C20002 c20002 = this.f54618;
        InterfaceC18278 interfaceC18278 = c20002.f64755;
        C20661 c20661 = c20002.f64770;
        try {
            c20002.f64755 = this.f54617;
            C18837 c18837 = new C18837();
            for (C2609 c2609 = this.f54620; c2609.m8249(); c2609 = c2609.f8241) {
                c18837.m43511(m34258((C2363) c2609.f8240));
            }
            C2609 m43517 = c18837.m43517();
            Iterator it = m43517.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                abstractC5698 = this.f54619;
                if (!hasNext) {
                    break;
                }
                C16384 c16384 = (C16384) it.next();
                if (c16384.f26338.f13890 == c20661.f66448.f13890) {
                    abstractC5698.f17563 |= 18014398509613056L;
                    AbstractC8624 m38580 = c16384.m38580(c20002.f64785.f18832);
                    if (m38580 instanceof C17796) {
                        C17796 c17796 = (C17796) m38580;
                        if (c17796.f26338 == c20661.f66469 && ((Integer) c17796.f54417).intValue() != 0) {
                            abstractC5698.f17563 |= 36028797018963968L;
                        }
                    }
                }
            }
            if (abstractC5698.m16088()) {
                abstractC5698.m16086(m43517);
            } else {
                abstractC5698.m16066(m43517);
            }
        } finally {
            c20002.f64755 = interfaceC18278;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader annotate ");
        AbstractC5698 abstractC5698 = this.f54619;
        sb.append(abstractC5698.f17561);
        sb.append(".");
        sb.append(abstractC5698);
        sb.append(" with ");
        sb.append(this.f54620);
        return sb.toString();
    }
}
