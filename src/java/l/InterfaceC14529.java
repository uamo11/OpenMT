package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: N673 */
/* renamed from: l.ܳ۫ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public interface InterfaceC14529 extends InterfaceC20881 {
    @Override // java.util.Iterator, l.InterfaceC12433
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
