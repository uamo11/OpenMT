package l;

import java.util.function.Consumer;

/* compiled from: AAQM */
/* renamed from: l.ܶۚᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC15029 extends AbstractC23889 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45806;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16464;
    }

    /* renamed from: ֫ */
    public abstract int mo9286();

    /* renamed from: ֫ */
    public abstract Object mo5286(int i);

    /* renamed from: ֫ */
    public abstract InterfaceC7975 mo5287(int i, int i2);

    public AbstractC15029(int i) {
        this.f45806 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return mo9286() - this.f45806;
    }

    @Override // l.InterfaceC15234
    public boolean tryAdvance(Consumer consumer) {
        if (this.f45806 >= mo9286()) {
            return false;
        }
        int i = this.f45806;
        this.f45806 = i + 1;
        consumer.accept(mo5286(i));
        return true;
    }

    @Override // l.AbstractC23889, l.InterfaceC15234
    public void forEachRemaining(Consumer consumer) {
        int mo9286 = mo9286();
        while (true) {
            int i = this.f45806;
            if (i >= mo9286) {
                return;
            }
            consumer.accept(mo5286(i));
            this.f45806++;
        }
    }

    @Override // l.InterfaceC15234
    public InterfaceC7975 trySplit() {
        int mo9286 = mo9286();
        int i = this.f45806;
        int mo92862 = mo9286();
        int i2 = this.f45806;
        int m19938 = C7416.m19938(mo92862, i2, 2, i);
        if (m19938 == i2 || m19938 == mo9286) {
            return null;
        }
        if (m19938 >= i2 && m19938 <= mo9286) {
            InterfaceC7975 mo5287 = mo5287(i2, m19938);
            this.f45806 = m19938;
            return mo5287;
        }
        StringBuilder m32308 = C13325.m32308(m19938, "splitPoint ", " outside of range of current position ");
        m32308.append(this.f45806);
        m32308.append(" and range end ");
        m32308.append(mo9286);
        throw new IndexOutOfBoundsException(m32308.toString());
    }
}
