package l;

/* compiled from: 54VR */
/* renamed from: l.᩻ۗ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23419 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f75211 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f75212;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75213 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object[] f75214;

    public C23419(int i) {
        this.f75212 = new int[i];
        this.f75214 = new Object[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m51887(int i) {
        Object obj;
        int m51884 = m51884(this.f75213, i, this.f75212);
        if (m51884 < 0 || (obj = this.f75214[m51884]) == f75211) {
            return null;
        }
        return obj;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51888(int i, Object obj) {
        int m51884 = m51884(this.f75213, i, this.f75212);
        if (m51884 >= 0) {
            this.f75214[m51884] = obj;
            return;
        }
        int i2 = ~m51884;
        int i3 = this.f75213;
        if (i2 < i3) {
            Object[] objArr = this.f75214;
            if (objArr[i2] == f75211) {
                this.f75212[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        int[] iArr = this.f75212;
        if (i3 >= iArr.length) {
            int max = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[max];
            Object[] objArr2 = new Object[max];
            int[] iArr3 = this.f75212;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f75214;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f75212 = iArr2;
            this.f75214 = objArr2;
        }
        int i4 = this.f75213 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f75212;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f75214;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f75213 - i2);
        }
        this.f75212[i2] = i;
        this.f75214[i2] = obj;
        this.f75213++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51886(int i, Object obj) {
        int i2 = this.f75213;
        if (i2 != 0 && i <= this.f75212[i2 - 1]) {
            m51888(i, obj);
            return;
        }
        int[] iArr = this.f75212;
        if (i2 >= iArr.length) {
            int max = Math.max(i2 + 1, iArr.length * 2);
            int[] iArr2 = new int[max];
            Object[] objArr = new Object[max];
            int[] iArr3 = this.f75212;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr2 = this.f75214;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f75212 = iArr2;
            this.f75214 = objArr;
        }
        this.f75212[i2] = i;
        this.f75214[i2] = obj;
        this.f75213 = i2 + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51885(int i) {
        int[] iArr = this.f75212;
        if (iArr.length < i) {
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.f75214;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f75212 = iArr2;
            this.f75214 = objArr;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51884(int i, int i2, int[] iArr) {
        int i3 = -1;
        int i4 = i;
        while (i4 - i3 > 1) {
            int i5 = (i4 + i3) / 2;
            if (iArr[i5] < i2) {
                i3 = i5;
            } else {
                i4 = i5;
            }
        }
        return i4 == i ? ~i : iArr[i4] == i2 ? i4 : ~i4;
    }
}
