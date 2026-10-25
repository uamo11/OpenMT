package l;

import java.util.concurrent.CountedCompleter;

/* compiled from: N673 */
/* renamed from: l.ܺᩳ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16107 extends CountedCompleter {
    public InterfaceC15234 a;
    public final InterfaceC0585 b;
    public final AbstractC9198 c;
    public long d;

    public C16107(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        super(null);
        this.b = interfaceC0585;
        this.c = abstractC9198;
        this.a = interfaceC15234;
        this.d = 0L;
    }

    public C16107(C16107 c16107, InterfaceC15234 interfaceC15234) {
        super(c16107);
        this.a = interfaceC15234;
        this.b = c16107.b;
        this.d = c16107.d;
        this.c = c16107.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC15234 trySplit;
        InterfaceC15234 interfaceC15234 = this.a;
        long estimateSize = interfaceC15234.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC13158.e(estimateSize);
            this.d = j;
        }
        boolean s = EnumC7330.SHORT_CIRCUIT.s(((AbstractC12725) this.c).m);
        InterfaceC0585 interfaceC0585 = this.b;
        boolean z = false;
        C16107 c16107 = this;
        while (true) {
            if (s && interfaceC0585.f()) {
                break;
            }
            if (estimateSize <= j || (trySplit = interfaceC15234.trySplit()) == null) {
                break;
            }
            C16107 c161072 = new C16107(c16107, trySplit);
            c16107.addToPendingCount(1);
            if (z) {
                interfaceC15234 = trySplit;
            } else {
                C16107 c161073 = c16107;
                c16107 = c161072;
                c161072 = c161073;
            }
            z = !z;
            c16107.fork();
            c16107 = c161072;
            estimateSize = interfaceC15234.estimateSize();
        }
        c16107.c.M(interfaceC15234, interfaceC0585);
        c16107.a = null;
        c16107.propagateCompletion();
    }
}
