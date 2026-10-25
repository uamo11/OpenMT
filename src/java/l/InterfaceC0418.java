package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: N673 */
/* renamed from: l.֡۫ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public interface InterfaceC0418 extends InterfaceC1124 {
    @Override // l.InterfaceC15234
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // l.InterfaceC15234
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // l.InterfaceC1124, l.InterfaceC15234
    InterfaceC0418 trySplit();
}
