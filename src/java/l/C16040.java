package l;

/* compiled from: G53U */
/* renamed from: l.ܺܺܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16040 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] f49462 = new Object[40];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f49463 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m37917() {
        return this.f49462[this.f49463];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m37919() {
        Object[] objArr = this.f49462;
        int i = this.f49463;
        Object obj = objArr[i];
        this.f49463 = i - 1;
        objArr[i] = null;
        return obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37918(C11955 c11955) {
        int i = this.f49463 + 1;
        this.f49463 = i;
        Object[] objArr = this.f49462;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            this.f49462 = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        this.f49462[this.f49463] = c11955;
    }
}
