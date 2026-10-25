package l;

import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: JBFX */
/* renamed from: l.ۖܺܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2635 extends AbstractC0517 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C2635[] f8318 = new C2635[SecP521R1Field.P16];

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C2635 f8319 = m8291(-1);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C2635 f8323 = m8291(0);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2635 f8322 = m8291(1);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2635 f8317 = m8291(2);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C2635 f8316 = m8291(3);

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C2635 f8321 = m8291(4);

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C2635 f8320 = m8291(5);

    @Override // l.AbstractC13717
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String mo8292() {
        return ClassTransform.INTEGER;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2635 m8291(int i) {
        C2635[] c2635Arr = f8318;
        int length = (Integer.MAX_VALUE & i) % c2635Arr.length;
        C2635 c2635 = c2635Arr[length];
        if (c2635 != null && c2635.mo2231() == i) {
            return c2635;
        }
        C2635 c26352 = new C2635(i);
        c2635Arr[length] = c26352;
        return c26352;
    }

    public final String toString() {
        int mo2231 = mo2231();
        return "int{0x" + C14712.m35008(mo2231) + " / " + mo2231 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23413;
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return Integer.toString(mo2231());
    }
}
