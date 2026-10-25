package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: R9OP */
/* renamed from: l.۟᩵ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7669 extends LinkedHashMap {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C7669 f23674;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23675 = true;

    static {
        C7669 c7669 = new C7669();
        f23674 = c7669;
        c7669.f23675 = false;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7669 m20488() {
        return f23674;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20489(C7669 c7669) {
        m20486();
        if (c7669.isEmpty()) {
            return;
        }
        putAll(c7669);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m20486();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m20486();
        byte[] bArr = C13997.f41722;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m20486();
        for (Object obj : map.keySet()) {
            byte[] bArr = C13997.f41722;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m20486();
        return super.remove(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20485(Map map, Map map2) {
        boolean equals;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if ((value instanceof byte[]) && (obj instanceof byte[])) {
                equals = Arrays.equals((byte[]) value, (byte[]) obj);
            } else {
                equals = value.equals(obj);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && m20485(this, (Map) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20483(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = C13997.f41722;
            int i = length;
            for (byte b : bArr) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        }
        if (obj instanceof InterfaceC3415) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20484(Map map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            i += m20483(entry.getValue()) ^ m20483(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return m20484((Map) this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m20487(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7669 m20492() {
        if (isEmpty()) {
            return new C7669();
        }
        C7669 c7669 = new C7669(this);
        c7669.f23675 = true;
        return c7669;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20491() {
        this.f23675 = false;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m20486() {
        if (!this.f23675) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20490() {
        return this.f23675;
    }
}
