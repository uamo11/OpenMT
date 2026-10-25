package l;

/* compiled from: OAQ5 */
/* renamed from: l.᩻ܿᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC23847 extends AbstractC18203 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77169;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f77170;

    /* renamed from: ۧ */
    public abstract int mo21906();

    @Override // l.AbstractC22415, l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        InterfaceC16791 interfaceC16791;
        int mo42418 = mo42418();
        int i = this.f56589;
        int mo424182 = mo42418();
        int i2 = this.f56589;
        int m19938 = C7416.m19938(mo424182, i2, 2, i);
        if (m19938 == i2 || m19938 == mo42418) {
            interfaceC16791 = null;
        } else {
            if (m19938 < i2 || m19938 > mo42418) {
                StringBuilder m32308 = C13325.m32308(m19938, "splitPoint ", " outside of range of current position ");
                m32308.append(this.f56589);
                m32308.append(" and range end ");
                m32308.append(mo42418);
                throw new IndexOutOfBoundsException(m32308.toString());
            }
            interfaceC16791 = mo21905(i2, m19938);
            this.f56589 = m19938;
        }
        if (!this.f77169 && interfaceC16791 != null) {
            this.f77170 = mo21906();
            this.f77169 = true;
        }
        return interfaceC16791;
    }

    public AbstractC23847(int i) {
        super(i);
        this.f77170 = -1;
        this.f77169 = false;
    }

    public AbstractC23847(int i, int i2) {
        super(i);
        this.f77170 = i2;
        this.f77169 = true;
    }

    @Override // l.AbstractC18203
    /* renamed from: ֫ */
    public final int mo42418() {
        return this.f77169 ? this.f77170 : mo21906();
    }
}
