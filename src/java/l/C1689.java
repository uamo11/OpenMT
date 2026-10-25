package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: P77N */
/* renamed from: l.֫۟᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1689 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f5856;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5857;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f5858;

    public C1689(ArrayList arrayList, HashMap hashMap, HashSet hashSet) {
        this.f5857 = arrayList;
        this.f5858 = hashMap;
        this.f5856 = hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m5688() {
        return this.f5857;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5690(C17667 c17667) {
        return this.f5856.contains(c17667.f54033);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m5689(String str) {
        return (AbstractC15440) this.f5858.get(str);
    }
}
