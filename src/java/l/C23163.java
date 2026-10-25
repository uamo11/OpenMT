package l;

import java.util.function.LongConsumer;

/* compiled from: N673 */
/* renamed from: l.᩺ᩳ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23163 extends AbstractC21027 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C23163((InterfaceC0418) interfaceC15234, this);
    }

    @Override // l.InterfaceC0418
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean z;
        if (this.c && a() && ((InterfaceC0418) this.a).tryAdvance((LongConsumer) this)) {
            z = this.e.test(this.f);
            if (z) {
                longConsumer.accept(this.f);
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
    public final InterfaceC0418 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC0418) super.trySplit();
    }
}
