package l;

/* compiled from: AAP5 */
/* renamed from: l.᩷ܺᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC20984 extends AbstractC18161 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67770;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67771;

    /* renamed from: ۧ */
    public abstract int mo24371();

    public AbstractC20984(int i) {
        super(i);
        this.f67771 = -1;
        this.f67770 = false;
    }

    public AbstractC20984(int i, int i2) {
        super(i);
        this.f67771 = i2;
        this.f67770 = true;
    }

    @Override // l.AbstractC18161
    /* renamed from: ֫ */
    public final int mo42266() {
        return this.f67770 ? this.f67771 : mo24371();
    }

    @Override // l.AbstractC18161, l.AbstractC23141, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        InterfaceC16749 trySplit = super.trySplit();
        if (!this.f67770 && trySplit != null) {
            this.f67771 = mo24371();
            this.f67770 = true;
        }
        return trySplit;
    }
}
