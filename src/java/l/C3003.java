package l;

import java.util.Comparator;

/* compiled from: C5XL */
/* renamed from: l.ۗۙۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3003 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C12880 c12880 = (C12880) obj;
        C12880 c128802 = (C12880) obj2;
        int size = c128802.f38657.size() - c12880.f38657.size();
        return size == 0 ? c128802.f38656.size() - c12880.f38656.size() : size;
    }
}
