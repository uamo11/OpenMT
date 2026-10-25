package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: W8RA */
/* renamed from: l.ۜۚ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6550 implements Iterable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f20198 = new Object();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f20200 = new HashMap();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f20201 = Collections.EMPTY_SET;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f20199 = Collections.EMPTY_LIST;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18055(C15036 c15036) {
        synchronized (this.f20198) {
            ArrayList arrayList = new ArrayList(this.f20199);
            arrayList.add(c15036);
            this.f20199 = C20195.unmodifiableList(arrayList);
            Integer num = (Integer) this.f20200.get(c15036);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f20201);
                hashSet.add(c15036);
                this.f20201 = C20195.unmodifiableSet(hashSet);
            }
            this.f20200.put(c15036, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18058(C15036 c15036) {
        synchronized (this.f20198) {
            Integer num = (Integer) this.f20200.get(c15036);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f20199);
            arrayList.remove(c15036);
            this.f20199 = C20195.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f20200.remove(c15036);
                HashSet hashSet = new HashSet(this.f20201);
                hashSet.remove(c15036);
                this.f20201 = C20195.unmodifiableSet(hashSet);
            } else {
                this.f20200.put(c15036, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final Set m18057() {
        Set set;
        synchronized (this.f20198) {
            set = this.f20201;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f20198) {
            it = this.f20199.iterator();
        }
        return it;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18056(C15036 c15036) {
        int intValue;
        synchronized (this.f20198) {
            intValue = this.f20200.containsKey(c15036) ? ((Integer) this.f20200.get(c15036)).intValue() : 0;
        }
        return intValue;
    }
}
