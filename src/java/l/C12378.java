package l;

import java.util.AbstractList;

/* compiled from: T65P */
/* renamed from: l.۫ۨ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12378 extends AbstractList {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22961 f37108;

    public C12378(C22961 c22961) {
        this.f37108 = c22961;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i >= 0) {
            C22961 c22961 = this.f37108;
            i2 = c22961.f73948;
            if (i < i2) {
                z = c22961.f73951.f41106;
                if (z) {
                    i5 = c22961.f73950;
                    i6 = c22961.f73949;
                    return new C6028(c22961, (i * i6) + i5);
                }
                i3 = c22961.f73950;
                i4 = c22961.f73949;
                return new C10262(c22961, (i * i4) + i3);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f37108.f73948;
        return i;
    }
}
