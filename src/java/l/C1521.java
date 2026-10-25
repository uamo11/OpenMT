package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: XSY */
/* renamed from: l.֫֫ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1521 extends C10142 implements InterfaceC13668, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C4497 f5390;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C13783 f5391;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f5392;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C0213 f5393;

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object compute;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            compute = C13843.compute(this.f5390, ch, biFunction);
        }
        return compute;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            computeIfAbsent = C13843.computeIfAbsent(this.f5390, ch, function);
        }
        return computeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object computeIfPresent;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            computeIfPresent = C13843.computeIfPresent(this.f5390, ch, biFunction);
        }
        return computeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object merge;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            merge = C13843.merge(this.f5390, ch, obj2, biFunction);
        }
        return merge;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            putIfAbsent = C13843.putIfAbsent(this.f5390, ch, obj2);
        }
        return putIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            replace = C13843.replace(this.f5390, ch, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            replace = C13843.replace(this.f5390, ch, obj2, obj3);
        }
        return replace;
    }

    public C1521(C4497 c4497) {
        super(c4497);
        this.f5390 = c4497;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f30520) {
            containsValue = this.f5390.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f30520) {
            this.f5390.putAll(map);
        }
    }

    @Override // l.InterfaceC13668
    /* renamed from: ܳ */
    public final InterfaceC18559 mo1097() {
        C0213 c0213;
        synchronized (this.f30520) {
            if (this.f5393 == null) {
                this.f5393 = C5153.m14711(this.f5390.mo1097(), this.f30520);
            }
            c0213 = this.f5393;
        }
        return c0213;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo1097();
    }

    @Override // l.InterfaceC13668, java.util.Map
    @Deprecated
    public final InterfaceC18559 entrySet() {
        return mo1097();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C13783 c13783;
        synchronized (this.f30520) {
            if (this.f5391 == null) {
                InterfaceC1954 keySet = this.f5390.keySet();
                C10142 c10142 = this.f30520;
                C22956 c22956 = C7434.f22851;
                this.f5391 = new C13783(keySet, c10142);
            }
            c13783 = this.f5391;
        }
        return c13783;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC19825 interfaceC19825;
        synchronized (this.f30520) {
            if (this.f5392 == null) {
                this.f5392 = C12768.m31065(this.f5390.values(), this.f30520);
            }
            interfaceC19825 = this.f5392;
        }
        return interfaceC19825;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f30520) {
            isEmpty = this.f5390.isEmpty();
        }
        return isEmpty;
    }

    @Override // l.C10142, java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f30520) {
            hashCode = this.f5390.hashCode();
        }
        return hashCode;
    }

    @Override // l.C10142, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f30520) {
            equals = this.f5390.equals(obj);
        }
        return equals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f30520) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f30520) {
            C13843.replaceAll(this.f5390, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object $default$getOrDefault;
        synchronized (this.f30520) {
            C4497 c4497 = this.f5390;
            c4497.getClass();
            $default$getOrDefault = C23016.$default$getOrDefault(c4497, obj, obj2);
        }
        return $default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f30520) {
            remove = C13843.remove(this.f5390, obj, obj2);
        }
        return remove;
    }
}
