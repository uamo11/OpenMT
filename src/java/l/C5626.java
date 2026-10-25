package l;

import java.util.Comparator;

/* compiled from: D77D */
/* renamed from: l.ۚ᩸ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5626 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17398;

    public /* synthetic */ C5626(int i) {
        this.f17398 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.f17398) {
            case 0:
                compare = C12681.f38196.compare(((C23075) obj).f74218, ((C23075) obj2).f74218);
                return compare;
            default:
                return ((AbstractC15440) obj).getName().compareToIgnoreCase(((AbstractC15440) obj2).getName());
        }
    }
}
