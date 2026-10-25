package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: HAT6 */
/* renamed from: l.ۘۜ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3767 extends AbstractC18584 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5178[] f11880;

    public C3767(AbstractC5178 abstractC5178, AbstractC5178 abstractC51782) {
        HashSet hashSet = new HashSet();
        if (abstractC5178 instanceof C3767) {
            hashSet.addAll(Arrays.asList(((C3767) abstractC5178).f11880));
        } else {
            hashSet.add(abstractC5178);
        }
        if (abstractC51782 instanceof C3767) {
            hashSet.addAll(Arrays.asList(((C3767) abstractC51782).f11880));
        } else {
            hashSet.add(abstractC51782);
        }
        List m14832 = AbstractC5178.m14832(hashSet);
        if (!m14832.isEmpty()) {
            hashSet.add((C19290) Collections.max(m14832));
        }
        this.f11880 = (AbstractC5178[]) hashSet.toArray(new AbstractC5178[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3767) {
            return Arrays.equals(this.f11880, ((C3767) obj).f11880);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = C3767.class.hashCode();
        AbstractC5178[] abstractC5178Arr = this.f11880;
        for (AbstractC5178 abstractC5178 : abstractC5178Arr) {
            hashCode = C2093.m6874(hashCode, abstractC5178);
        }
        return C2093.m6873(hashCode, abstractC5178Arr.length);
    }

    @Override // l.AbstractC5178
    /* renamed from: ֫ */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        for (AbstractC5178 abstractC5178 : this.f11880) {
            if (abstractC5178.mo1496(abstractC18809, c19515)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC5178
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        ArrayList arrayList = new ArrayList();
        AbstractC5178[] abstractC5178Arr = this.f11880;
        int length = abstractC5178Arr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                AbstractC5178 abstractC5178 = (AbstractC5178) arrayList.get(0);
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    AbstractC5178 abstractC51782 = (AbstractC5178) arrayList.get(i2);
                    if (abstractC5178 == null) {
                        abstractC5178 = abstractC51782;
                    } else if (abstractC51782 != null) {
                        C2356 c2356 = C2356.f7548;
                        C2356 c23562 = c2356;
                        c23562 = c2356;
                        if (abstractC5178 != c2356 && abstractC51782 != c2356) {
                            C3767 c3767 = new C3767(abstractC5178, abstractC51782);
                            AbstractC5178[] abstractC5178Arr2 = c3767.f11880;
                            c23562 = c3767;
                            if (abstractC5178Arr2.length == 1) {
                                abstractC5178 = abstractC5178Arr2[0];
                            }
                        }
                        abstractC5178 = c23562;
                    }
                }
                return abstractC5178;
            }
            AbstractC5178 abstractC51783 = abstractC5178Arr[i];
            AbstractC5178 mo11420 = abstractC51783.mo11420(abstractC18809, c19515);
            z |= mo11420 != abstractC51783;
            C2356 c23563 = C2356.f7548;
            if (mo11420 == c23563) {
                return c23563;
            }
            if (mo11420 != null) {
                arrayList.add(mo11420);
            }
            i++;
        }
    }

    public final String toString() {
        return C4303.m12894(Arrays.asList(this.f11880).iterator(), "||");
    }
}
