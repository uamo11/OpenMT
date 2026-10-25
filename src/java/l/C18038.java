package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: N673 */
/* renamed from: l.ᩳۨᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18038 implements Map, Serializable, InterfaceC1830 {
    public static final long serialVersionUID = 1978198479659022715L;
    public final Map a;
    public final C18038 b = this;
    public transient C9572 c;
    public transient C9572 d;
    public transient C22811 e;

    public C18038(Map map) {
        this.a = (Map) C11003.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = this.a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.b) {
            containsValue = this.a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.b) {
            put = this.a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.b) {
            remove = this.a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9572 c9572;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new C9572(this.a.keySet(), this.b);
            }
            c9572 = this.c;
        }
        return c9572;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C9572 c9572;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = new C9572(this.a.entrySet(), this.b);
            }
            c9572 = this.d;
        }
        return c9572;
    }

    @Override // java.util.Map
    public final Collection values() {
        C22811 c22811;
        synchronized (this.b) {
            if (this.e == null) {
                this.e = new C22811(this.a.values(), this.b);
            }
            c22811 = this.e;
        }
        return c22811;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            equals = this.a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.b) {
            orDefault = C13843.getOrDefault(this.a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            C13843.forEach(this.a, biConsumer);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            C13843.replaceAll(this.a, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.b) {
            putIfAbsent = C13843.putIfAbsent(this.a, obj, obj2);
        }
        return putIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.b) {
            remove = C13843.remove(this.a, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.b) {
            replace = C13843.replace(this.a, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.b) {
            replace = C13843.replace(this.a, obj, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.b) {
            computeIfAbsent = C13843.computeIfAbsent(this.a, obj, function);
        }
        return computeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object computeIfPresent;
        synchronized (this.b) {
            computeIfPresent = C13843.computeIfPresent(this.a, obj, biFunction);
        }
        return computeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        Object compute;
        synchronized (this.b) {
            compute = C13843.compute(this.a, obj, biFunction);
        }
        return compute;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object merge;
        synchronized (this.b) {
            merge = C13843.merge(this.a, obj, obj2, biFunction);
        }
        return merge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
