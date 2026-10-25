package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: S4Y9 */
/* renamed from: l.ۧۜۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10828 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f32571;

    public C10828(ArrayList arrayList) {
        this.f32571 = new int[arrayList.size()];
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f32571[i2] = i;
            i += ((InterfaceC22677) arrayList.get(i2)).mo3974();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27073(int i, boolean z) {
        int binarySearch = Arrays.binarySearch(this.f32571, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        if (z) {
            throw new C1655(null, "No instruction at offset %d", Integer.valueOf(i));
        }
        return (~binarySearch) - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27072(int i) {
        if (i >= 0) {
            int[] iArr = this.f32571;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new C7796(null, "Instruction index out of bounds: %d", Integer.valueOf(i));
    }
}
