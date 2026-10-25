package l;

import java.util.Comparator;
import java.util.Map;

/* compiled from: L5VZ */
/* renamed from: l.᩵ۜۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19295 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getValue()).compareTo(((Map.Entry) obj2).getValue());
    }
}
