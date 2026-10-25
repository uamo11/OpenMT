package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: N673 */
/* renamed from: l.ܶ۫ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public interface InterfaceC15234 {
    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer consumer);

    InterfaceC15234 trySplit();
}
