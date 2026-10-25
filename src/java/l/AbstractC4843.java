package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: G58P */
/* renamed from: l.ۙ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4843 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15425 f15300;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21777 f15301;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20366 f15302;

    /* renamed from: ֫ */
    public abstract int mo12411(Object obj);

    /* renamed from: ֫ */
    public abstract Object mo12412(int i, int i2);

    /* renamed from: ֫ */
    public abstract Object mo12413(int i, Object obj);

    /* renamed from: ֫ */
    public abstract void mo12414();

    /* renamed from: ֫ */
    public abstract void mo12415(int i);

    /* renamed from: ֫ */
    public abstract void mo12416(Object obj, Object obj2);

    /* renamed from: ۧ */
    public abstract int mo12417(Object obj);

    /* renamed from: ۧ */
    public abstract Map mo12418();

    /* renamed from: ܽ */
    public abstract int mo12419();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14086(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m14088(int i, Object[] objArr) {
        int mo12419 = mo12419();
        if (objArr.length < mo12419) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo12419);
        }
        for (int i2 = 0; i2 < mo12419; i2++) {
            objArr[i2] = mo12412(i2, i);
        }
        if (objArr.length > mo12419) {
            objArr[mo12419] = null;
        }
        return objArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14087(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
