package l;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: N673 */
/* renamed from: l.ܽۤᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C16585 {
    public static void $default$forEach(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        C11003.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void $default$replaceAll(ConcurrentMap concurrentMap, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        C17997.forEach(concurrentMap, new C10379(1, concurrentMap, biFunction));
    }

    public static Object $default$computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        Object apply;
        C11003.requireNonNull(function);
        Object obj2 = concurrentMap.get(obj);
        if (obj2 != null || (apply = function.apply(obj)) == null) {
            return obj2;
        }
        Object putIfAbsent = concurrentMap.putIfAbsent(obj, apply);
        return putIfAbsent == null ? apply : putIfAbsent;
    }

    public static Object $default$computeIfPresent(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        Object apply;
        C11003.requireNonNull(biFunction);
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return null;
            }
            apply = biFunction.apply(obj, obj2);
            if (apply == null) {
                if (concurrentMap.remove(obj, obj2)) {
                    break;
                }
            } else if (concurrentMap.replace(obj, obj2, apply)) {
                break;
            }
        }
        return apply;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object $default$compute(java.util.concurrent.ConcurrentMap r2, java.lang.Object r3, java.util.function.BiFunction r4) {
        /*
        L0:
            java.lang.Object r0 = r2.get(r3)
        L4:
            java.lang.Object r1 = r4.apply(r3, r0)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L13
            boolean r0 = r2.replace(r3, r0, r1)
            if (r0 == 0) goto L0
            goto L19
        L13:
            java.lang.Object r0 = r2.putIfAbsent(r3, r1)
            if (r0 != 0) goto L4
        L19:
            return r1
        L1a:
            if (r0 == 0) goto L22
            boolean r0 = r2.remove(r3, r0)
            if (r0 == 0) goto L0
        L22:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16585.$default$compute(java.util.concurrent.ConcurrentMap, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public static Object $default$merge(ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        C11003.requireNonNull(obj2);
        while (true) {
            Object obj3 = concurrentMap.get(obj);
            while (obj3 == null) {
                obj3 = concurrentMap.putIfAbsent(obj, obj2);
                if (obj3 == null) {
                    return obj2;
                }
            }
            Object apply = biFunction.apply(obj3, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj3, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }
}
