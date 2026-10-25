package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: N673 */
/* renamed from: l.ᩴۤᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18703 extends C15173 implements InterfaceC15234 {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18703(C0357[] c0357Arr, int i, int i2, int i3, long j, int i4) {
        super(c0357Arr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return o.a.f77939l;
            default:
                return o.a.k;
        }
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        switch (this.i) {
        }
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
        }
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C0357[] c0357Arr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new C18703(c0357Arr, this.h, i3, i2, j, 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                C0357[] c0357Arr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new C18703(c0357Arr2, this.h, i6, i5, j2, 1);
        }
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C0357 a = a();
                    if (a == null) {
                        break;
                    } else {
                        consumer.accept(a.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    C0357 a2 = a();
                    if (a2 == null) {
                        break;
                    } else {
                        consumer.accept(a2.c);
                    }
                }
        }
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                C0357 a = a();
                if (a != null) {
                    consumer.accept(a.b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                C0357 a2 = a();
                if (a2 != null) {
                    consumer.accept(a2.c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.j;
    }
}
