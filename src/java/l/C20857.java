package l;

import java.util.ArrayDeque;
import java.util.function.Consumer;

/* compiled from: TUG */
/* renamed from: l.᩷ۨܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20857 {
    @SafeVarargs
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m47676(InterfaceC17664... interfaceC17664Arr) {
        C1846 c1846 = new C1846(interfaceC17664Arr.length);
        long j = 0;
        int i = 336;
        boolean z = false;
        for (InterfaceC17664 interfaceC17664 : interfaceC17664Arr) {
            z |= interfaceC17664.isParallel();
            InterfaceC15234 spliterator = interfaceC17664.spliterator();
            c1846.m16262((Object) spliterator);
            i &= spliterator.characteristics();
            long estimateSize = spliterator.estimateSize();
            long j2 = j + estimateSize;
            j = (((estimateSize ^ j) > 0L ? 1 : ((estimateSize ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + C13132.FOREVER_NS;
        }
        AbstractC14545 m6131 = c1846.m6131();
        m6131.getClass();
        InterfaceC15234 spliterator2 = C22291.spliterator(m6131, 1296);
        C7033 c7033 = new C7033(4);
        spliterator2.getClass();
        return (InterfaceC17664) C14841.stream(new C12888(null, spliterator2, c7033, i, j), z).onClose(new RunnableC16622(0, interfaceC17664Arr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16646 m47674(InterfaceC17664 interfaceC17664) {
        final C17328 c17328 = new C17328();
        c17328.f53076 = false;
        c17328.f53077 = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(interfaceC17664.spliterator());
        while (!arrayDeque.isEmpty()) {
            InterfaceC15234 interfaceC15234 = (InterfaceC15234) arrayDeque.removeLast();
            if (interfaceC15234.getExactSizeIfKnown() != 0) {
                if (interfaceC15234.hasCharacteristics(16384)) {
                    while (true) {
                        InterfaceC15234 trySplit = interfaceC15234.trySplit();
                        if (trySplit == null || trySplit.getExactSizeIfKnown() == 0) {
                            break;
                        }
                        if (interfaceC15234.getExactSizeIfKnown() == 0) {
                            interfaceC15234 = trySplit;
                            break;
                        }
                    }
                    interfaceC15234.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void n(Object obj) {
                            C17328 c173282 = C17328.this;
                            c173282.f53076 = true;
                            c173282.f53077 = obj;
                        }
                    });
                    Object obj = c17328.f53077;
                    C11003.requireNonNull(obj);
                    return C16646.of(obj);
                }
                InterfaceC15234 trySplit2 = interfaceC15234.trySplit();
                if (trySplit2 == null || trySplit2.getExactSizeIfKnown() == 0) {
                    interfaceC15234.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void n(Object obj2) {
                            C17328 c173282 = C17328.this;
                            c173282.f53076 = true;
                            c173282.f53077 = obj2;
                        }
                    });
                    if (c17328.f53076) {
                        Object obj2 = c17328.f53077;
                        C11003.requireNonNull(obj2);
                        return C16646.of(obj2);
                    }
                } else {
                    arrayDeque.addLast(trySplit2);
                    arrayDeque.addLast(interfaceC15234);
                }
            }
        }
        return C16646.empty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m47675(InterfaceC17664 interfaceC17664, C2144 c2144) {
        interfaceC17664.getClass();
        boolean isParallel = interfaceC17664.isParallel();
        InterfaceC15234 spliterator = interfaceC17664.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            return (InterfaceC17664) C14841.stream(new C23678(spliterator.estimateSize(), spliterator.characteristics() & 80, C22291.iterator(spliterator), c2144), isParallel).onClose(new RunnableC5622(3, interfaceC17664));
        }
        return (InterfaceC17664) C14841.stream(new C14505(spliterator, 0L, c2144), isParallel).onClose(new RunnableC5622(3, interfaceC17664));
    }
}
