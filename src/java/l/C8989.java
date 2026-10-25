package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: AAP5 */
/* renamed from: l.ۡܺᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8989 implements InterfaceC16749 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f27313;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6667 f27315;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27316;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27314 = 1024;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16749 f27317 = null;

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC16749 mo23230(int i, int[] iArr) {
        C9876.m24968(iArr.length, 0, i);
        return new C17455(0, i, this.f27316, iArr);
    }

    public C8989(InterfaceC6667 interfaceC6667, long j, int i) {
        this.f27315 = interfaceC6667;
        this.f27313 = j;
        if ((i & 4096) != 0) {
            this.f27316 = i | 256;
        } else {
            this.f27316 = i | 16704;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            boolean tryAdvance = interfaceC16749.tryAdvance(intConsumer);
            if (!tryAdvance) {
                this.f27317 = null;
            }
            return tryAdvance;
        }
        InterfaceC6667 interfaceC6667 = this.f27315;
        if (!interfaceC6667.hasNext()) {
            return false;
        }
        this.f27313--;
        intConsumer.accept(interfaceC6667.nextInt());
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            interfaceC16749.forEachRemaining(intConsumer);
            this.f27317 = null;
        }
        this.f27315.forEachRemaining(intConsumer);
        this.f27313 = 0L;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            return interfaceC16749.estimateSize();
        }
        if (!this.f27315.hasNext()) {
            return 0L;
        }
        long j = this.f27313;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f27316;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        InterfaceC6667 interfaceC6667 = this.f27315;
        if (!interfaceC6667.hasNext()) {
            return null;
        }
        long j = this.f27313;
        int min = j > 0 ? (int) Math.min(this.f27314, j) : this.f27314;
        int[] iArr = new int[min];
        int i = 0;
        while (i < min && interfaceC6667.hasNext()) {
            iArr[i] = interfaceC6667.nextInt();
            this.f27313--;
            i++;
        }
        if (min < this.f27314 && interfaceC6667.hasNext()) {
            iArr = Arrays.copyOf(iArr, this.f27314);
            while (interfaceC6667.hasNext() && i < this.f27314) {
                iArr[i] = interfaceC6667.nextInt();
                this.f27313--;
                i++;
            }
        }
        this.f27314 = Math.min(33554432, this.f27314 + 1024);
        InterfaceC16749 mo23230 = mo23230(i, iArr);
        if (interfaceC6667.hasNext()) {
            return mo23230;
        }
        this.f27317 = mo23230;
        return ((C17455) mo23230).trySplit();
    }
}
