package l;

/* compiled from: N673 */
/* renamed from: l.ۘܰᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC3987 {
    public final long a;
    public final long b;
    public InterfaceC15234 c;
    public long d;
    public long e;

    public abstract InterfaceC15234 a(InterfaceC15234 interfaceC15234, long j, long j2, long j3, long j4);

    public AbstractC3987(InterfaceC15234 interfaceC15234, long j, long j2, long j3, long j4) {
        this.c = interfaceC15234;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC15234 m12030trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            InterfaceC15234 trySplit = this.c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.d;
            long min = Math.min(estimateSize, this.b);
            long j2 = this.a;
            if (j2 >= min) {
                this.d = min;
            } else {
                long j3 = this.b;
                if (min >= j3) {
                    this.c = trySplit;
                    this.e = min;
                } else {
                    long j4 = this.d;
                    if (j4 >= j2 && estimateSize <= j3) {
                        this.d = min;
                        return trySplit;
                    }
                    this.d = min;
                    return a(trySplit, j2, j3, j4, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC1124 m12028trySplit() {
        return (InterfaceC1124) m12030trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m12031trySplit() {
        return (InterfaceC18764) m12030trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return (InterfaceC0418) m12030trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8160 m12029trySplit() {
        return (InterfaceC8160) m12030trySplit();
    }
}
