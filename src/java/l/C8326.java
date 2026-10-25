package l;

import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: N673 */
/* renamed from: l.۠ܿ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8326 extends AbstractC11854 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8326(InterfaceC15234 interfaceC15234, Predicate predicate, int i) {
        super(interfaceC15234);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8326(InterfaceC15234 interfaceC15234, C8326 c8326, int i) {
        super(interfaceC15234, c8326);
        this.g = i;
        this.e = c8326.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r2;
     */
    @Override // l.InterfaceC15234
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.Consumer r7) {
        /*
            r6 = this;
            int r0 = r6.g
            switch(r0) {
                case 0: goto L28;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r6.a()
            if (r0 == 0) goto L5e
            l.ܶ۫ᩴ r0 = r6.a
            boolean r0 = r0.tryAdvance(r6)
            if (r0 == 0) goto L5e
            java.util.function.Predicate r0 = r6.e
            java.lang.Object r2 = r6.f
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L6a
        L28:
            boolean r0 = r6.c
            l.ܶ۫ᩴ r1 = r6.a
            if (r0 == 0) goto L59
            r0 = 0
            r6.c = r0
        L31:
            boolean r2 = r1.tryAdvance(r6)
            r3 = 1
            if (r2 == 0) goto L4a
            boolean r4 = r6.a()
            if (r4 == 0) goto L4a
            java.util.function.Predicate r4 = r6.e
            java.lang.Object r5 = r6.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L4a
            r0 = 1
            goto L31
        L4a:
            if (r2 == 0) goto L5d
            if (r0 == 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r3)
        L53:
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L5d
        L59:
            boolean r2 = r1.tryAdvance(r7)
        L5d:
            return r2
        L5e:
            r0 = 1
        L5f:
            r7 = 0
            r6.c = r7
            if (r0 != 0) goto L69
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.b
            r7.set(r1)
        L69:
            r1 = 0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8326.tryAdvance(java.util.function.Consumer):boolean");
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public InterfaceC15234 trySplit() {
        switch (this.g) {
            case 1:
                if (!this.b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        switch (this.g) {
            case 0:
                return new C8326(interfaceC15234, this, 0);
            default:
                return new C8326(interfaceC15234, this, 1);
        }
    }
}
