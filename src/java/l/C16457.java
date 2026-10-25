package l;

/* compiled from: G552 */
/* renamed from: l.ܽۛܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16457 extends AbstractC14545 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f50591 = new C16457(0, new Object[0]);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f50592;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f50593;

    @Override // l.AbstractC22725
    /* renamed from: ܳ */
    public final boolean mo19283() {
        return false;
    }

    @Override // l.AbstractC22725
    /* renamed from: ܿ */
    public final int mo24243() {
        return 0;
    }

    public C16457(int i, Object[] objArr) {
        this.f50593 = objArr;
        this.f50592 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50592;
    }

    @Override // l.AbstractC22725
    /* renamed from: ܽ */
    public final Object[] mo24242() {
        return this.f50593;
    }

    @Override // l.AbstractC22725
    /* renamed from: ᩳ */
    public final int mo24244() {
        return this.f50592;
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    /* renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        Object[] objArr2 = this.f50593;
        int i2 = this.f50592;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4025.m12103(i, this.f50592);
        Object obj = this.f50593[i];
        C11003.requireNonNull(obj);
        return obj;
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
