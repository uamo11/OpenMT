package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: N673 */
/* renamed from: l.֫ۛᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public interface InterfaceC1645 extends InterfaceC20881 {
    @Override // java.util.Iterator
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}
