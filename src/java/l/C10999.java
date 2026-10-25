package l;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: F4NW */
/* renamed from: l.ۧ۫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10999 extends C6785 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient Object[] f33075;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Object[] f33076;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Comparator f33077;

    @Override // l.C6785
    /* renamed from: ֫ */
    public final AbstractC9608 mo18429() {
        throw null;
    }

    public C10999(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f33077 = comparator;
        this.f33076 = new Object[4];
        this.f33075 = new Object[4];
    }

    @Override // l.C6785
    /* renamed from: ֫ */
    public final C6785 mo18428(Object obj, Object obj2) {
        int i = this.f21061 + 1;
        Object[] objArr = this.f33076;
        if (i > objArr.length) {
            int m28253 = AbstractC11437.m28253(objArr.length, i);
            this.f33076 = Arrays.copyOf(this.f33076, m28253);
            this.f33075 = Arrays.copyOf(this.f33075, m28253);
        }
        C22061.m49621(obj, obj2);
        Object[] objArr2 = this.f33076;
        int i2 = this.f21061;
        objArr2[i2] = obj;
        this.f33075[i2] = obj2;
        this.f21061 = i2 + 1;
        return this;
    }

    @Override // l.C6785
    /* renamed from: ۧ */
    public final AbstractC9608 mo18430() {
        int i = this.f21061;
        Comparator comparator = this.f33077;
        if (i == 0) {
            return C18054.m42113(comparator);
        }
        if (i == 1) {
            Object obj = this.f33076[0];
            C11003.requireNonNull(obj);
            Object obj2 = this.f33075[0];
            C11003.requireNonNull(obj2);
            AbstractC14545 of = AbstractC14545.of(obj);
            comparator.getClass();
            return new C18054(new C9403(of, comparator), AbstractC14545.of(obj2), null);
        }
        Object[] copyOf = Arrays.copyOf(this.f33076, i);
        Arrays.sort(copyOf, comparator);
        int i2 = this.f21061;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < this.f21061; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(copyOf[i4], copyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i4] + " and " + copyOf[i3]);
                }
            }
            Object obj3 = this.f33076[i3];
            C11003.requireNonNull(obj3);
            int binarySearch = Arrays.binarySearch(copyOf, obj3, comparator);
            Object obj4 = this.f33075[i3];
            C11003.requireNonNull(obj4);
            objArr[binarySearch] = obj4;
        }
        return new C18054(new C9403(AbstractC14545.m34735(copyOf.length, copyOf), comparator), AbstractC14545.m34735(i2, objArr), null);
    }
}
