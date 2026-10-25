package l;

/* compiled from: DAOW */
/* renamed from: l.᩶ۘᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19929 extends AbstractC7933 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f64524;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64525;

    /* renamed from: ۧ */
    public abstract int mo13906();

    public AbstractC19929(int i) {
        super(i);
        this.f64525 = -1;
        this.f64524 = false;
    }

    public AbstractC19929(int i, int i2) {
        super(i);
        this.f64525 = i2;
        this.f64524 = true;
    }

    @Override // l.AbstractC7933
    /* renamed from: ֫ */
    public final int mo21240() {
        return this.f64524 ? this.f64525 : mo13906();
    }

    @Override // l.AbstractC7933, l.AbstractC23099, l.InterfaceC15234
    public final InterfaceC0877 trySplit() {
        InterfaceC0877 trySplit = super.trySplit();
        if (!this.f64524 && trySplit != null) {
            this.f64525 = mo13906();
            this.f64524 = true;
        }
        return trySplit;
    }
}
