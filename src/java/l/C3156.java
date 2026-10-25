package l;

/* compiled from: BBH0 */
/* renamed from: l.ۗۢܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3156 extends AbstractC4193 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f9856;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f9857;

    @Override // l.AbstractC4193
    /* renamed from: ᩴ */
    public final int mo2709() {
        return 0;
    }

    public C3156(EnumC8095 enumC8095, int i, int[] iArr, int[] iArr2) {
        super(enumC8095, i, 0, 0, 0L);
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("keys/targets length mismatch");
        }
        this.f9857 = iArr;
        this.f9856 = iArr2;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] m9586() {
        return this.f9857;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] m9585() {
        return this.f9856;
    }
}
