package l;

/* compiled from: X4YZ */
/* renamed from: l.᩵ۡ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC19354 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0302 f62648;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1008 f62649;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f62650;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f62651 = -1;

    /* renamed from: ֫ */
    public void mo43238() {
    }

    /* renamed from: ۧ */
    public abstract boolean mo11587();

    /* renamed from: ᩻ */
    public boolean mo43239(InterfaceC23586 interfaceC23586) {
        return false;
    }

    public AbstractC19354(AbstractC0302 abstractC0302, InterfaceC1008 interfaceC1008) {
        this.f62648 = abstractC0302;
        this.f62649 = interfaceC1008;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44575(boolean z) {
        if (z == this.f62650) {
            return;
        }
        this.f62650 = z;
        int i = z ? 1 : -1;
        AbstractC0302 abstractC0302 = this.f62648;
        abstractC0302.m1663(i);
        if (this.f62650) {
            abstractC0302.m1666(this);
        }
    }
}
