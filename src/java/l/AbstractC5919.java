package l;

import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: N673 */
/* renamed from: l.ۛ۟ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5919 extends AbstractC5050 implements InterfaceC1124 {
    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23558 interfaceC23558;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((InterfaceC1124) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (interfaceC23558 = (InterfaceC23558) AbstractC5050.a(this.e)) != null) {
                InterfaceC1124 spliterator = interfaceC23558.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC15234 interfaceC15234 = this.c;
            if (interfaceC15234 == null) {
                Deque b = b();
                while (true) {
                    InterfaceC23558 interfaceC23558 = (InterfaceC23558) AbstractC5050.a(b);
                    if (interfaceC23558 != null) {
                        interfaceC23558.g(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC1124) interfaceC15234).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
