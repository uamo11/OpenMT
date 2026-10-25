package l;

/* compiled from: 1BCD */
/* renamed from: l.ܿۡܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17246 extends C16123 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52865;

    public C17246(int i) {
        super(i);
        this.f52865 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40531(int i, C16540 c16540) {
        m38025(i, (InterfaceC9069) c16540);
        this.f52865 = -1;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m40536() {
        if (this.f52865 == -1) {
            C17952 c17952 = new C17952();
            m40532(c17952);
            this.f52865 = c17952.m41950();
        }
        return this.f52865;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m40533() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C16540 c16540 = (C16540) m40990(i2);
            if (c16540 != null) {
                i = c16540.m38916().size() + i;
            }
        }
        return i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16540 m40535(int i) {
        int m38027 = m38027(i);
        if (m38027 >= 0) {
            return (C16540) m40978(m38027);
        }
        throw new IllegalArgumentException("no such label: ".concat(C14712.m35006(i)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40532(InterfaceC8780 interfaceC8780) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((C16540) m40978(i)).m38916().m7866(interfaceC8780);
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17246 m40534() {
        C17246 c17246 = new C17246(this);
        c17246.f52865 = this.f52865;
        return c17246;
    }
}
