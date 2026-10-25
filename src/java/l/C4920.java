package l;

import java.util.Comparator;

/* compiled from: D77D */
/* renamed from: l.ۙ᩸ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4920 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C13902 c13902 = (C13902) obj;
        C13902 c139022 = (C13902) obj2;
        int compare = Long.compare(c139022.f41429, c13902.f41429);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(c13902.f41430, c139022.f41430);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(c13902.f41432, c139022.f41432);
        return compare3 != 0 ? compare3 : Integer.compare(c13902.f41431, c139022.f41431);
    }
}
