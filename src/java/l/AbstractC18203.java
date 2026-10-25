package l;

/* compiled from: OAQ5 */
/* renamed from: l.ᩳܿᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18203 extends AbstractC22415 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56589;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16720;
    }

    /* renamed from: ֫ */
    public abstract float mo21904(int i);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo42418();

    /* renamed from: ֫ */
    public abstract InterfaceC16791 mo21905(int i, int i2);

    public AbstractC18203(int i) {
        this.f56589 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return mo42418() - this.f56589;
    }

    @Override // l.InterfaceC1124
    /* renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC4113 interfaceC4113) {
        if (this.f56589 >= mo42418()) {
            return false;
        }
        int i = this.f56589;
        this.f56589 = i + 1;
        interfaceC4113.mo12346(mo21904(i));
        return true;
    }

    @Override // l.AbstractC22415, l.InterfaceC1124
    /* renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC4113 interfaceC4113) {
        int mo42418 = mo42418();
        while (true) {
            int i = this.f56589;
            if (i >= mo42418) {
                return;
            }
            interfaceC4113.mo12346(mo21904(i));
            this.f56589++;
        }
    }
}
