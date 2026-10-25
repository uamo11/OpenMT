package l;

/* compiled from: 34PY */
/* renamed from: l.ۢܳ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9638 extends AbstractC8932 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 f29209;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC20927 f29210;

    public C9638(EnumC20927 enumC20927, AbstractC8932 abstractC8932) {
        this.f29210 = enumC20927;
        this.f29209 = abstractC8932;
    }

    public final String toString() {
        int ordinal = this.f29210.ordinal();
        if (ordinal == 0) {
            return "?";
        }
        AbstractC8932 abstractC8932 = this.f29209;
        if (ordinal == 1) {
            return "? extends " + abstractC8932;
        }
        if (ordinal == 2) {
            return "? super " + abstractC8932;
        }
        throw new AssertionError();
    }
}
