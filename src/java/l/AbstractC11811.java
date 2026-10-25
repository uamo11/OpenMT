package l;

import java.util.Set;
import java.util.Spliterator;

/* compiled from: FBSP */
/* renamed from: l.ۨܺᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC11811 extends AbstractC22394 implements Cloneable, InterfaceC18517, InterfaceC8886 {
    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        InterfaceC15234 spliterator;
        spliterator = C22291.spliterator(this, 1);
        return spliterator;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo28873(long j);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        if (set instanceof InterfaceC18517) {
            return mo50259((InterfaceC18517) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int size = size();
        InterfaceC23455 it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long nextLong = it.nextLong();
            i += (int) (nextLong ^ (nextLong >>> 32));
            size = i2;
        }
    }

    @Override // l.InterfaceC11421
    @Deprecated
    /* renamed from: ᩷ */
    public final boolean mo13088(long j) {
        return mo28873(j);
    }
}
