package l;

import java.util.concurrent.CountedCompleter;

/* compiled from: N673 */
/* renamed from: l.ۖܳ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2598 extends CountedCompleter {
    public final InterfaceC5214 a;
    public final int b;

    public abstract void a();

    public abstract AbstractC2598 b(int i, int i2);

    public AbstractC2598(InterfaceC5214 interfaceC5214) {
        this.a = interfaceC5214;
        this.b = 0;
    }

    public AbstractC2598(AbstractC2598 abstractC2598, InterfaceC5214 interfaceC5214, int i) {
        super(abstractC2598);
        this.a = interfaceC5214;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC2598 abstractC2598 = this;
        while (abstractC2598.a.o() != 0) {
            abstractC2598.setPendingCount(abstractC2598.a.o() - 1);
            int i = 0;
            int i2 = 0;
            while (i < abstractC2598.a.o() - 1) {
                AbstractC2598 b = abstractC2598.b(i, abstractC2598.b + i2);
                i2 = (int) (b.a.count() + i2);
                b.fork();
                i++;
            }
            abstractC2598 = abstractC2598.b(i, abstractC2598.b + i2);
        }
        abstractC2598.a();
        abstractC2598.propagateCompletion();
    }
}
