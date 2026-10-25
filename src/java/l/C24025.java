package l;

import java.util.Comparator;

/* compiled from: H78K */
/* renamed from: l.᩻᩻ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C24025 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C17667 c17667 = (C17667) obj;
        C17667 c176672 = (C17667) obj2;
        int compareTo = c17667.f54033.compareTo(c176672.f54033);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = c17667.f54034.compareTo(c176672.f54034);
        return compareTo2 != 0 ? compareTo2 : Integer.compare(c17667.f54032, c176672.f54032);
    }
}
