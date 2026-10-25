package l;

import java.util.function.IntConsumer;

/* compiled from: AAP5 */
/* renamed from: l.ᩳܺᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18161 extends AbstractC23141 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56469;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo42266();

    /* renamed from: ֫ */
    public abstract int mo3394(int i);

    /* renamed from: ֫ */
    public abstract InterfaceC16749 mo3395(int i, int i2);

    public AbstractC18161(int i) {
        this.f56469 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return mo42266() - this.f56469;
    }

    @Override // l.InterfaceC18764
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f56469 >= mo42266()) {
            return false;
        }
        int i = this.f56469;
        this.f56469 = i + 1;
        intConsumer.accept(mo3394(i));
        return true;
    }

    @Override // l.AbstractC23141, l.InterfaceC18764
    public void forEachRemaining(IntConsumer intConsumer) {
        int mo42266 = mo42266();
        while (true) {
            int i = this.f56469;
            if (i >= mo42266) {
                return;
            }
            intConsumer.accept(mo3394(i));
            this.f56469++;
        }
    }

    @Override // l.AbstractC23141, l.InterfaceC1124, l.InterfaceC15234
    public InterfaceC16749 trySplit() {
        int mo42266 = mo42266();
        int i = this.f56469;
        int mo422662 = mo42266();
        int i2 = this.f56469;
        int m19938 = C7416.m19938(mo422662, i2, 2, i);
        if (m19938 == i2 || m19938 == mo42266) {
            return null;
        }
        if (m19938 >= i2 && m19938 <= mo42266) {
            InterfaceC16749 mo3395 = mo3395(i2, m19938);
            this.f56469 = m19938;
            return mo3395;
        }
        StringBuilder m32308 = C13325.m32308(m19938, "splitPoint ", " outside of range of current position ");
        m32308.append(this.f56469);
        m32308.append(" and range end ");
        m32308.append(mo42266);
        throw new IndexOutOfBoundsException(m32308.toString());
    }
}
