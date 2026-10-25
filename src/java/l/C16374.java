package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.math.raw.Mod;

/* compiled from: O2OZ */
/* renamed from: l.ܽۗܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16374 extends AbstractMap implements Serializable {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f50370 = new Object();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f50371;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Object[] f50372;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient Collection f50373;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient Object[] f50374;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient Object f50375;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f50376;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f50377;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient int[] f50378;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Set f50379;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38552(C16374 c16374) {
        c16374.f50376--;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C16374 m38561() {
        C16374 c16374 = new C16374();
        c16374.m38566(3);
        return c16374;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C16374 m38556(int i) {
        C16374 c16374 = new C16374();
        c16374.m38566(i);
        return c16374;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38566(int i) {
        C4025.m12109("Expected size must be >= 0", i >= 0);
        this.f50371 = Math.min(Math.max(i, 1), Mod.M30);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38567() {
        return this.f50375 == null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m38562() {
        Object obj = this.f50375;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m38559() {
        return (1 << (this.f50371 & 31)) - 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38565() {
        this.f50371 += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        int i = 1;
        if (m38567()) {
            C4025.m12115("Arrays already allocated", m38567());
            int i2 = this.f50371;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f50375 = C17786.m41667(max2);
            this.f50371 = C17786.m41664(this.f50371, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.f50378 = new int[i2];
            this.f50372 = new Object[i2];
            this.f50374 = new Object[i2];
        }
        Map m38562 = m38562();
        if (m38562 != null) {
            return m38562.put(obj, obj2);
        }
        int[] m38547 = m38547();
        Object[] m38553 = m38553();
        Object[] m38546 = m38546();
        int i3 = this.f50376;
        int i4 = i3 + 1;
        int m9080 = C2970.m9080(obj);
        int m38559 = m38559();
        int i5 = m9080 & m38559;
        Object obj3 = this.f50375;
        C11003.requireNonNull(obj3);
        int m41665 = C17786.m41665(i5, obj3);
        if (m41665 != 0) {
            int i6 = ~m38559;
            int i7 = m9080 & i6;
            int i8 = 0;
            while (true) {
                int i9 = m41665 - i;
                int i10 = m38547[i9];
                if ((i10 & i6) == i7 && C11003.equals(obj, m38553[i9])) {
                    Object obj4 = m38546[i9];
                    m38546[i9] = obj2;
                    return obj4;
                }
                int i11 = i10 & m38559;
                i8++;
                if (i11 != 0) {
                    i = 1;
                    m41665 = i11;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m38559() + 1, 1.0f);
                        int i12 = isEmpty() ? -1 : 0;
                        while (i12 >= 0) {
                            linkedHashMap.put(m38553()[i12], m38546()[i12]);
                            i12 = m38564(i12);
                        }
                        this.f50375 = linkedHashMap;
                        this.f50378 = null;
                        this.f50372 = null;
                        this.f50374 = null;
                        m38565();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > m38559) {
                        m38559 = m38540(m38559, (m38559 + 1) * (m38559 < 32 ? 4 : 2), m9080, i3);
                    } else {
                        m38547[i9] = C17786.m41664(i10, i4, m38559);
                    }
                }
            }
        } else if (i4 > m38559) {
            m38559 = m38540(m38559, (m38559 + 1) * (m38559 < 32 ? 4 : 2), m9080, i3);
        } else {
            Object obj5 = this.f50375;
            C11003.requireNonNull(obj5);
            C17786.m41668(i5, i4, obj5);
        }
        int length = m38547().length;
        if (i4 > length && (min = Math.min(Mod.M30, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f50378 = Arrays.copyOf(m38547(), min);
            this.f50372 = Arrays.copyOf(m38553(), min);
            this.f50374 = Arrays.copyOf(m38546(), min);
        }
        m38547()[i3] = C17786.m41664(m9080, 0, m38559);
        m38553()[i3] = obj;
        m38546()[i3] = obj2;
        this.f50376 = i4;
        m38565();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m38540(int i, int i2, int i3, int i4) {
        Object m41667 = C17786.m41667(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C17786.m41668(i3 & i5, i4 + 1, m41667);
        }
        Object obj = this.f50375;
        C11003.requireNonNull(obj);
        int[] m38547 = m38547();
        for (int i6 = 0; i6 <= i; i6++) {
            int m41665 = C17786.m41665(i6, obj);
            while (m41665 != 0) {
                int i7 = m41665 - 1;
                int i8 = m38547[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m416652 = C17786.m41665(i10, m41667);
                C17786.m41668(i10, m41665, m41667);
                m38547[i7] = C17786.m41664(i9, m416652, i5);
                m41665 = i8 & i;
            }
        }
        this.f50375 = m41667;
        this.f50371 = C17786.m41664(this.f50371, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m38541(Object obj) {
        if (m38567()) {
            return -1;
        }
        int m9080 = C2970.m9080(obj);
        int m38559 = m38559();
        Object obj2 = this.f50375;
        C11003.requireNonNull(obj2);
        int m41665 = C17786.m41665(m9080 & m38559, obj2);
        if (m41665 == 0) {
            return -1;
        }
        int i = ~m38559;
        int i2 = m9080 & i;
        do {
            int i3 = m41665 - 1;
            int i4 = m38547()[i3];
            if ((i4 & i) == i2 && C11003.equals(obj, m38553()[i3])) {
                return i3;
            }
            m41665 = i4 & m38559;
        } while (m41665 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m38562 = m38562();
        if (m38562 != null) {
            return m38562.containsKey(obj);
        }
        return m38541(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m38562 = m38562();
        if (m38562 != null) {
            return m38562.get(obj);
        }
        int m38541 = m38541(obj);
        if (m38541 == -1) {
            return null;
        }
        return m38546()[m38541];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m38562 = m38562();
        if (m38562 != null) {
            return m38562.remove(obj);
        }
        Object m38549 = m38549(obj);
        if (m38549 == f50370) {
            return null;
        }
        return m38549;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m38549(Object obj) {
        boolean m38567 = m38567();
        Object obj2 = f50370;
        if (m38567) {
            return obj2;
        }
        int m38559 = m38559();
        Object obj3 = this.f50375;
        C11003.requireNonNull(obj3);
        int m41666 = C17786.m41666(obj, null, m38559, obj3, m38547(), m38553(), null);
        if (m41666 == -1) {
            return obj2;
        }
        Object obj4 = m38546()[m41666];
        m38563(m41666, m38559);
        this.f50376--;
        m38565();
        return obj4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38564(int i) {
        int i2 = i + 1;
        if (i2 < this.f50376) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f50377;
        if (set != null) {
            return set;
        }
        C7244 c7244 = new C7244(this);
        this.f50377 = c7244;
        return c7244;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f50379;
        if (set != null) {
            return set;
        }
        C22766 c22766 = new C22766(this);
        this.f50379 = c22766;
        return c22766;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m38562 = m38562();
        return m38562 != null ? m38562.size() : this.f50376;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m38562 = m38562();
        if (m38562 != null) {
            return m38562.containsValue(obj);
        }
        for (int i = 0; i < this.f50376; i++) {
            if (C11003.equals(obj, m38546()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f50373;
        if (collection != null) {
            return collection;
        }
        C10731 c10731 = new C10731(this);
        this.f50373 = c10731;
        return c10731;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m38567()) {
            return;
        }
        m38565();
        Map m38562 = m38562();
        if (m38562 != null) {
            this.f50371 = Math.min(Math.max(size(), 3), Mod.M30);
            m38562.clear();
            this.f50375 = null;
            this.f50376 = 0;
            return;
        }
        Arrays.fill(m38553(), 0, this.f50376, (Object) null);
        Arrays.fill(m38546(), 0, this.f50376, (Object) null);
        Object obj = this.f50375;
        C11003.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m38547(), 0, this.f50376, 0);
        this.f50376 = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Iterator c5833;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map m38562 = m38562();
        if (m38562 != null) {
            c5833 = m38562.entrySet().iterator();
        } else {
            c5833 = new C5833(this);
        }
        while (c5833.hasNext()) {
            Map.Entry entry = (Map.Entry) c5833.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(C19370.m44628(readInt, "Invalid size: "));
        }
        m38566(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m38550(C16374 c16374) {
        Object obj = c16374.f50375;
        C11003.requireNonNull(obj);
        return obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38563(int i, int i2) {
        Object obj = this.f50375;
        C11003.requireNonNull(obj);
        int[] m38547 = m38547();
        Object[] m38553 = m38553();
        Object[] m38546 = m38546();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = m38553[i3];
            m38553[i] = obj2;
            m38546[i] = m38546[i3];
            m38553[i3] = null;
            m38546[i3] = null;
            m38547[i] = m38547[i3];
            m38547[i3] = 0;
            int m9080 = C2970.m9080(obj2) & i2;
            int m41665 = C17786.m41665(m9080, obj);
            if (m41665 == size) {
                C17786.m41668(m9080, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = m41665 - 1;
                int i5 = m38547[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    m38547[i4] = C17786.m41664(i5, i + 1, i2);
                    return;
                }
                m41665 = i6;
            }
        } else {
            m38553[i] = null;
            m38546[i] = null;
            m38547[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] m38547() {
        int[] iArr = this.f50378;
        C11003.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] m38553() {
        Object[] objArr = this.f50372;
        C11003.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] m38546() {
        Object[] objArr = this.f50374;
        C11003.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m38543(C16374 c16374, int i) {
        return c16374.m38553()[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m38551(C16374 c16374, int i) {
        return c16374.m38546()[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38545(C16374 c16374, int i, Object obj) {
        c16374.m38546()[i] = obj;
    }
}
