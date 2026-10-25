package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: HAT6 */
/* renamed from: l.ܺۜ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15760 extends AbstractC18584 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5178[] f48597;

    public C15760(AbstractC5178 abstractC5178, AbstractC5178 abstractC51782) {
        HashSet hashSet = new HashSet();
        if (abstractC5178 instanceof C15760) {
            hashSet.addAll(Arrays.asList(((C15760) abstractC5178).f48597));
        } else {
            hashSet.add(abstractC5178);
        }
        if (abstractC51782 instanceof C15760) {
            hashSet.addAll(Arrays.asList(((C15760) abstractC51782).f48597));
        } else {
            hashSet.add(abstractC51782);
        }
        List m14832 = AbstractC5178.m14832(hashSet);
        if (!m14832.isEmpty()) {
            hashSet.add((C19290) Collections.min(m14832));
        }
        this.f48597 = (AbstractC5178[]) hashSet.toArray(new AbstractC5178[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15760) {
            return Arrays.equals(this.f48597, ((C15760) obj).f48597);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = C15760.class.hashCode();
        AbstractC5178[] abstractC5178Arr = this.f48597;
        for (AbstractC5178 abstractC5178 : abstractC5178Arr) {
            hashCode = C2093.m6874(hashCode, abstractC5178);
        }
        return C2093.m6873(hashCode, abstractC5178Arr.length);
    }

    @Override // l.AbstractC5178
    /* renamed from: ֫ */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        for (AbstractC5178 abstractC5178 : this.f48597) {
            if (!abstractC5178.mo1496(abstractC18809, c19515)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC5178
    /* renamed from: ۧ */
    public final AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        ArrayList arrayList = new ArrayList();
        AbstractC5178[] abstractC5178Arr = this.f48597;
        int length = abstractC5178Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return C2356.f7548;
                }
                AbstractC5178 abstractC5178 = (AbstractC5178) arrayList.get(0);
                while (r6 < arrayList.size()) {
                    abstractC5178 = AbstractC5178.m14833(abstractC5178, (AbstractC5178) arrayList.get(r6));
                    r6++;
                }
                return abstractC5178;
            }
            AbstractC5178 abstractC51782 = abstractC5178Arr[i];
            AbstractC5178 mo11420 = abstractC51782.mo11420(abstractC18809, c19515);
            i2 |= mo11420 == abstractC51782 ? 0 : 1;
            if (mo11420 == null) {
                return null;
            }
            if (mo11420 != C2356.f7548) {
                arrayList.add(mo11420);
            }
            i++;
        }
    }

    public final String toString() {
        return C4303.m12894(Arrays.asList(this.f48597).iterator(), "&&");
    }
}
