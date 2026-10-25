package l;

/* compiled from: 29QF */
/* renamed from: l.᩹ᩳܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC22454 implements InterfaceC19800 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72730;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72731;

    public AbstractC22454(int i, int i2) {
        this.f72731 = i;
        this.f72730 = i2;
    }

    @Override // l.InterfaceC19800
    /* renamed from: ᩴ֫ */
    public final int mo45543() {
        return this.f72731;
    }

    @Override // l.InterfaceC19800
    /* renamed from: ᩳۧ */
    public final int mo45542() {
        return this.f72730;
    }

    @Override // l.InterfaceC8510
    /* renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC19800 interfaceC19800 = (InterfaceC19800) interfaceC8510;
        if (this.f72731 != interfaceC19800.mo45543()) {
            throw new RuntimeException();
        }
        if (this.f72730 != interfaceC19800.mo45542()) {
            throw new RuntimeException();
        }
    }
}
