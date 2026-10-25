package l;

/* compiled from: R4HY */
/* renamed from: l.᩸۠֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC21447 extends AbstractC8246 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f69060;

    public AbstractC21447(int i, int i2) {
        super(i);
        this.f69060 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC21447 m48582(C15300 c15300, InterfaceC7860 interfaceC7860) {
        int mo14974 = interfaceC7860.mo14974();
        switch (interfaceC7860.mo8424()) {
            case 3:
                return new C10158(mo14974, c15300, (InterfaceC2922) interfaceC7860);
            case 4:
            default:
                throw new C15431(null, "Invalid debug item type: %d", Integer.valueOf(interfaceC7860.mo8424()));
            case 5:
                return new C22152(mo14974, c15300, (InterfaceC14915) interfaceC7860);
            case 6:
                return new C12979(mo14974, c15300, (InterfaceC19856) interfaceC7860);
            case 7:
                return new C20036(mo14974, -4);
            case 8:
                return new C15095(mo14974, -4);
            case 9:
                return new C12274(mo14974, (InterfaceC4333) interfaceC7860);
            case 10:
                return C4513.m13277(mo14974, (InterfaceC21267) interfaceC7860);
        }
    }

    @Override // l.AbstractC8246
    /* renamed from: ۧ */
    public final double mo1619() {
        return this.f69060;
    }
}
