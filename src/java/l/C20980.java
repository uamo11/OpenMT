package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: PB9W */
/* renamed from: l.᩷ܺܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20980 extends AbstractC5457 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C20980 f67768 = new C20980(Double.doubleToLongBits(0.0d));

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20980 f67767 = new C20980(Double.doubleToLongBits(1.0d));

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.DOUBLE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20980 m47790(long j) {
        return new C20980(j);
    }

    public final String toString() {
        long mo2227 = mo2227();
        return "double{0x" + C14712.m35004(mo2227) + " / " + Double.longBitsToDouble(mo2227) + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23411;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Double.toString(Double.longBitsToDouble(mo2227()));
    }
}
