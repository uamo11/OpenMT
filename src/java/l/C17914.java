package l;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: N673 */
/* renamed from: l.ᩳ۟ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C17914 implements InterfaceC12393 {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ C17914(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC12393 b(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C18620 ? ((C18620) baseStream).a : baseStream instanceof DoubleStream ? C10609.b((DoubleStream) baseStream) : baseStream instanceof IntStream ? C7454.convert((IntStream) baseStream) : baseStream instanceof LongStream ? C12811.b((LongStream) baseStream) : baseStream instanceof Stream ? C1686.b((Stream) baseStream) : new C17914(baseStream);
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C17914) {
            obj = ((C17914) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 onClose(Runnable runnable) {
        return b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 unordered() {
        return b(this.a.unordered());
    }
}
