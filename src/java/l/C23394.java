package l;

import java.util.Deque;
import java.util.function.Consumer;

/* compiled from: N673 */
/* renamed from: l.᩻֫᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23394 extends AbstractC5050 {
    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC5214 a;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.c == null && (a = AbstractC5050.a(this.e)) != null) {
                InterfaceC15234 spliterator = a.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC15234 interfaceC15234 = this.c;
            if (interfaceC15234 == null) {
                Deque b = b();
                while (true) {
                    InterfaceC5214 a = AbstractC5050.a(b);
                    if (a != null) {
                        a.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                interfaceC15234.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
