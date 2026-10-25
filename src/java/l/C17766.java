package l;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: 2BGD */
/* renamed from: l.ᩳۖܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17766 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f54341;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public C17766(HashMap hashMap) {
        this.f54341 = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC13717 abstractC13717 = (AbstractC13717) obj;
        AbstractC13717 abstractC137172 = (AbstractC13717) obj2;
        HashMap hashMap = this.f54341;
        int intValue = ((Integer) hashMap.get(abstractC137172)).intValue() - ((Integer) hashMap.get(abstractC13717)).intValue();
        return intValue == 0 ? abstractC13717.compareTo(abstractC137172) : intValue;
    }
}
