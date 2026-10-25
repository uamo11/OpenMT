package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 6BDA */
/* renamed from: l.ۜܺܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6868 extends AbstractC0517 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6868 f21232 = new C6868(0);

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.CHARACTER;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6868 m18552(int i) {
        char c = (char) i;
        if (c == i) {
            return new C6868(c);
        }
        throw new IllegalArgumentException(C19370.m44628(i, "bogus char value: "));
    }

    public final String toString() {
        int mo2231 = mo2231();
        return "char{0x" + C14712.m35006(mo2231) + " / " + mo2231 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23389;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Integer.toString(mo2231());
    }
}
