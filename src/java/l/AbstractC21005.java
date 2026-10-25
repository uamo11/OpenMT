package l;

/* compiled from: 4AQC */
/* renamed from: l.᩷ܽᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC21005 extends AbstractC18182 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67814;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67815;

    /* renamed from: ۧ */
    public abstract int mo35370();

    public AbstractC21005(int i) {
        super(i);
        this.f67815 = -1;
        this.f67814 = false;
    }

    public AbstractC21005(int i, int i2) {
        super(i);
        this.f67815 = i2;
        this.f67814 = true;
    }

    @Override // l.AbstractC18182
    /* renamed from: ֫ */
    public final int mo42413() {
        return this.f67814 ? this.f67815 : mo35370();
    }

    @Override // l.AbstractC18182, l.AbstractC1153, l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        InterfaceC16770 trySplit = super.trySplit();
        if (!this.f67814 && trySplit != null) {
            this.f67815 = mo35370();
            this.f67814 = true;
        }
        return trySplit;
    }
}
