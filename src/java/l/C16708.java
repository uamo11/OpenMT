package l;

import java.util.function.IntConsumer;

/* compiled from: N673 */
/* renamed from: l.ܽܳ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16708 extends AbstractC22603 implements InterfaceC10422 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    @Override // l.AbstractC18910, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.b += ((AbstractC22603) interfaceC18204).b;
    }

    @Override // l.AbstractC22603, l.InterfaceC0585
    public final void accept(int i) {
        this.b++;
    }
}
