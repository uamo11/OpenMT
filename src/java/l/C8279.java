package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: ABB0 */
/* renamed from: l.۠ܺܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8279 extends AbstractC5457 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C8279 f25451 = new C8279(0);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C8279 f25450 = new C8279(1);

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.LONG;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8279 m21878(long j) {
        return new C8279(j);
    }

    public final String toString() {
        long mo2227 = mo2227();
        return "long{0x" + C14712.m35004(mo2227) + " / " + mo2227 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23418;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Long.toString(mo2227());
    }
}
