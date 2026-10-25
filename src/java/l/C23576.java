package l;

import java.util.ArrayList;

/* compiled from: 06VH */
/* renamed from: l.᩻۠ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23576 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f76464;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f76465;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f76466;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f76467;

    public C23576(int i, int i2, boolean z, Object obj) {
        this.f76465 = i;
        this.f76464 = i2;
        this.f76466 = z;
        this.f76467 = obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23576 m52039(int[] iArr, ArrayList arrayList, int i) {
        int i2 = iArr[i];
        if (i2 == 16) {
            return new C23576(i2, iArr[i + 2], iArr[i + 3] != 0, null);
        }
        if (i2 == 1 || i2 == 42) {
            return new C23576(i2, 0, false, arrayList.get(iArr[i + 2]));
        }
        return null;
    }
}
