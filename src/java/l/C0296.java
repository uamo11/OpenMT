package l;

import java.io.Serializable;

/* compiled from: VAXH */
/* renamed from: l.֡۠᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0296 implements InterfaceC17230, Serializable {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC2123 f1653;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile Object f1652 = C5236.f16416;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f1651 = this;

    public C0296(InterfaceC2123 interfaceC2123) {
        this.f1653 = interfaceC2123;
    }

    @Override // l.InterfaceC17230
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f1652;
        C5236 c5236 = C5236.f16416;
        if (obj2 != c5236) {
            return obj2;
        }
        synchronized (this.f1651) {
            obj = this.f1652;
            if (obj == c5236) {
                InterfaceC2123 interfaceC2123 = this.f1653;
                C11233.m27799(interfaceC2123);
                obj = interfaceC2123.mo4049();
                this.f1652 = obj;
                this.f1653 = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1652 != C5236.f16416 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C17936(getValue());
    }
}
