package l;

import java.util.Comparator;
import java.util.Map;

/* compiled from: L5VZ */
/* renamed from: l.ۖۜۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2361 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Map.Entry) obj).getKey().toString().compareTo(((Map.Entry) obj2).getKey().toString());
    }
}
