package l;

/* compiled from: N673 */
/* renamed from: l.ܶᩳ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15401 extends AbstractC21027 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C15401((InterfaceC0418) interfaceC15234, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r7.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r8.accept(r7.f);
     */
    @Override // l.InterfaceC0418
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.LongConsumer r8) {
        /*
            r7 = this;
            boolean r0 = r7.c
            l.ܶ۫ᩴ r1 = r7.a
            if (r0 == 0) goto L34
            r0 = 0
            r7.c = r0
        L9:
            r2 = r1
            l.֡۫ᩴ r2 = (l.InterfaceC0418) r2
            boolean r2 = r2.tryAdvance(r7)
            r3 = 1
            if (r2 == 0) goto L25
            boolean r4 = r7.a()
            if (r4 == 0) goto L25
            java.util.function.LongPredicate r4 = r7.e
            long r5 = r7.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L25
            r0 = 1
            goto L9
        L25:
            if (r2 == 0) goto L33
            if (r0 == 0) goto L2e
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.b
            r0.set(r3)
        L2e:
            long r0 = r7.f
            r8.accept(r0)
        L33:
            return r2
        L34:
            l.֡۫ᩴ r1 = (l.InterfaceC0418) r1
            boolean r8 = r1.tryAdvance(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15401.tryAdvance(java.util.function.LongConsumer):boolean");
    }
}
