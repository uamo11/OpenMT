package l;

import android.util.StateSet;

/* compiled from: T9OD */
/* renamed from: l.֨᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1440 extends AbstractC19080 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[][] f5145;

    @Override // l.AbstractC19080
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo4949() {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4948(int[] iArr) {
        int[][] iArr2 = this.f5145;
        int i = this.f60105;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}
