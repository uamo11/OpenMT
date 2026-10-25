package l;

import java.util.function.IntConsumer;

/* compiled from: N673 */
/* renamed from: l.ܰܽ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13948 extends AbstractC9759 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C13948((InterfaceC18764) interfaceC15234, this);
    }

    @Override // l.InterfaceC18764
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z;
        if (this.c && a() && ((InterfaceC18764) this.a).tryAdvance((IntConsumer) this)) {
            z = this.e.test(this.f);
            if (z) {
                intConsumer.accept(this.f);
                return true;
            }
        } else {
            z = true;
        }
        this.c = false;
        if (!z) {
            this.b.set(true);
        }
        return false;
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public final InterfaceC18764 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC18764) super.trySplit();
    }
}
