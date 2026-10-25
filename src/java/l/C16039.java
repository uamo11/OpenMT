package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: KBBH */
/* renamed from: l.ܺܺܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16039 extends AbstractC0517 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C16039 f49461 = new C16039(Float.floatToIntBits(0.0f));

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16039 f49460 = new C16039(Float.floatToIntBits(1.0f));

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16039 f49459 = new C16039(Float.floatToIntBits(2.0f));

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.FLOAT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16039 m37916(int i) {
        return new C16039(i);
    }

    public final String toString() {
        int mo2231 = mo2231();
        return "float{0x" + C14712.m35008(mo2231) + " / " + Float.intBitsToFloat(mo2231) + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23420;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Float.toString(Float.intBitsToFloat(mo2231()));
    }
}
