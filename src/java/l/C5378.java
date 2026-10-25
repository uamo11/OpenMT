package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: N673 */
/* renamed from: l.ۚ۬ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5378 {
    public static /* synthetic */ InterfaceC17664 parallelStream(Collection collection) {
        InterfaceC17664 stream;
        if (collection instanceof InterfaceC1144) {
            return ((InterfaceC1144) collection).mo42463parallelStream();
        }
        stream = C14841.stream(b(collection), true);
        return stream;
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC1144 ? ((InterfaceC1144) collection).removeIf(predicate) : C0438.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ InterfaceC17664 stream(Collection collection) {
        InterfaceC17664 stream;
        if (collection instanceof InterfaceC1144) {
            return ((InterfaceC1144) collection).mo42464stream();
        }
        stream = C14841.stream(b(collection), false);
        return stream;
    }

    public static /* synthetic */ Object[] toArray(Collection collection, IntFunction intFunction) {
        Object[] array;
        if (collection instanceof InterfaceC1144) {
            return ((InterfaceC1144) collection).toArray(intFunction);
        }
        array = collection.toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public static InterfaceC15234 b(Collection collection) {
        InterfaceC15234 spliterator;
        InterfaceC15234 spliterator2;
        if (collection instanceof InterfaceC1144) {
            return ((InterfaceC1144) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return C22291.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C3927(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            spliterator2 = C22291.spliterator((Set) collection, 1);
            return spliterator2;
        }
        if (collection instanceof List) {
            return C10317.$default$spliterator((List) collection);
        }
        spliterator = C22291.spliterator(collection, 0);
        return spliterator;
    }

    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC1144) {
            ((InterfaceC1144) collection).forEach(consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
