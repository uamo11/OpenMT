package l;

/* compiled from: 4AQC */
/* renamed from: l.ᩳܽᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18182 extends AbstractC1153 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56561;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* renamed from: ֫ */
    public abstract char mo13736(int i);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo42413();

    /* renamed from: ֫ */
    public abstract InterfaceC16770 mo13737(int i, int i2);

    public AbstractC18182(int i) {
        this.f56561 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return mo42413() - this.f56561;
    }

    @Override // l.InterfaceC1124
    /* renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC23662 interfaceC23662) {
        if (this.f56561 >= mo42413()) {
            return false;
        }
        int i = this.f56561;
        this.f56561 = i + 1;
        interfaceC23662.mo18328(mo13736(i));
        return true;
    }

    @Override // l.AbstractC1153, l.InterfaceC1124
    /* renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC23662 interfaceC23662) {
        int mo42413 = mo42413();
        while (true) {
            int i = this.f56561;
            if (i >= mo42413) {
                return;
            }
            interfaceC23662.mo18328(mo13736(i));
            this.f56561++;
        }
    }

    @Override // l.AbstractC1153, l.InterfaceC15234
    public InterfaceC16770 trySplit() {
        int mo42413 = mo42413();
        int i = this.f56561;
        int mo424132 = mo42413();
        int i2 = this.f56561;
        int m19938 = C7416.m19938(mo424132, i2, 2, i);
        if (m19938 == i2 || m19938 == mo42413) {
            return null;
        }
        if (m19938 >= i2 && m19938 <= mo42413) {
            InterfaceC16770 mo13737 = mo13737(i2, m19938);
            this.f56561 = m19938;
            return mo13737;
        }
        StringBuilder m32308 = C13325.m32308(m19938, "splitPoint ", " outside of range of current position ");
        m32308.append(this.f56561);
        m32308.append(" and range end ");
        m32308.append(mo42413);
        throw new IndexOutOfBoundsException(m32308.toString());
    }
}
