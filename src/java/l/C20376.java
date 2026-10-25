package l;

import java.util.Comparator;

/* compiled from: I7BH */
/* renamed from: l.᩶᩵ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C20376 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z4;
        C7675 c7675 = (C7675) obj;
        C7675 c76752 = (C7675) obj2;
        z = c7675.f23706;
        z2 = c76752.f23706;
        if (z != z2) {
            z4 = c7675.f23706;
            return z4 ? 1 : -1;
        }
        z3 = c7675.f23706;
        if (z3) {
            str3 = c7675.f23711;
            boolean equals = "keep_both".equals(str3);
            str4 = c76752.f23711;
            if (equals != "keep_both".equals(str4)) {
                return equals ? 1 : -1;
            }
        }
        str = c7675.f23709;
        str2 = c76752.f23709;
        return str.compareTo(str2);
    }
}
