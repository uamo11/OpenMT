package l;

import java.util.function.LongConsumer;

/* compiled from: DAOW */
/* renamed from: l.۠ۘᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC7933 extends AbstractC23099 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24556;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo21240();

    /* renamed from: ֫ */
    public abstract long mo13904(int i);

    /* renamed from: ֫ */
    public abstract InterfaceC0877 mo13905(int i, int i2);

    public AbstractC7933(int i) {
        this.f24556 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return mo21240() - this.f24556;
    }

    @Override // l.InterfaceC0418
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f24556 >= mo21240()) {
            return false;
        }
        int i = this.f24556;
        this.f24556 = i + 1;
        longConsumer.accept(mo13904(i));
        return true;
    }

    @Override // l.AbstractC23099, l.InterfaceC0418
    public void forEachRemaining(LongConsumer longConsumer) {
        int mo21240 = mo21240();
        while (true) {
            int i = this.f24556;
            if (i >= mo21240) {
                return;
            }
            longConsumer.accept(mo13904(i));
            this.f24556++;
        }
    }

    @Override // l.AbstractC23099, l.InterfaceC15234
    public InterfaceC0877 trySplit() {
        int mo21240 = mo21240();
        int i = this.f24556;
        int mo212402 = mo21240();
        int i2 = this.f24556;
        int m19938 = C7416.m19938(mo212402, i2, 2, i);
        if (m19938 == i2 || m19938 == mo21240) {
            return null;
        }
        if (m19938 >= i2 && m19938 <= mo21240) {
            InterfaceC0877 mo13905 = mo13905(i2, m19938);
            this.f24556 = m19938;
            return mo13905;
        }
        StringBuilder m32308 = C13325.m32308(m19938, "splitPoint ", " outside of range of current position ");
        m32308.append(this.f24556);
        m32308.append(" and range end ");
        m32308.append(mo21240);
        throw new IndexOutOfBoundsException(m32308.toString());
    }
}
