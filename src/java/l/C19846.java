package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* compiled from: N673 */
/* renamed from: l.᩶֨ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C19846 {
    public static InterfaceC15234 spliterator(Iterable iterable) {
        InterfaceC15234 spliterator;
        InterfaceC15234 spliterator2;
        if (iterable instanceof InterfaceC4323) {
            return ((InterfaceC4323) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return C22291.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            return new C3927(sortedSet, sortedSet);
        }
        if (iterable instanceof Set) {
            spliterator2 = C22291.spliterator((Set) iterable, 1);
            return spliterator2;
        }
        if (iterable instanceof List) {
            return C10317.$default$spliterator((List) iterable);
        }
        if (!(iterable instanceof Collection)) {
            return C22291.b(iterable.iterator(), 0);
        }
        spliterator = C22291.spliterator((Collection) iterable, 0);
        return spliterator;
    }

    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC4323) {
            ((InterfaceC4323) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            C21962.$default$forEach(iterable, consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
