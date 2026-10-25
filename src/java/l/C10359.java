package l;

import java.util.function.IntConsumer;

/* compiled from: N673 */
/* renamed from: l.ۤܳ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10359 implements IntConsumer {
    public long count;
    public long sum;
    public int min = Integer.MAX_VALUE;
    public int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final void a(C10359 c10359) {
        this.count += c10359.count;
        this.sum += c10359.sum;
        this.min = Math.min(this.min, c10359.min);
        this.max = Math.max(this.max, c10359.max);
    }

    public final String toString() {
        String simpleName = C10359.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
