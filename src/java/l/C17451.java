package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: BBB6 */
/* renamed from: l.ܿܺܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17451 extends AbstractC0517 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C17451 f53311 = new C17451(0);

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.BYTE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17451 m40823(int i) {
        byte b = (byte) i;
        if (b == i) {
            return new C17451(b);
        }
        throw new IllegalArgumentException(C19370.m44628(i, "bogus byte value: "));
    }

    public final String toString() {
        int mo2231 = mo2231();
        return "byte{0x" + C14712.m35005(mo2231) + " / " + mo2231 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23423;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Integer.toString(mo2231());
    }
}
