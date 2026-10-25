package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: X1VL */
/* renamed from: l.ۛܺᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6165 implements InterfaceC6667, InterfaceC12433 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18957;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23098 f18958;

    @Override // l.InterfaceC20881
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // l.InterfaceC14529
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    public C6165(C23098 c23098) {
        this.f18958 = c23098;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f18957;
        C23098 c23098 = this.f18958;
        i = c23098.f74325;
        if (i8 >= i) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = this.f18957;
        this.f18957 = i9 + 1;
        if (i9 == 0) {
            i2 = c23098.f74329;
            return i2;
        }
        if (i9 == 1) {
            i3 = c23098.f74327;
            return i3;
        }
        if (i9 == 2) {
            i4 = c23098.f74332;
            return i4;
        }
        if (i9 == 3) {
            i5 = c23098.f74324;
            return i5;
        }
        if (i9 == 4) {
            i6 = c23098.f74331;
            return i6;
        }
        i7 = c23098.f74331;
        return (this.f18957 - 4) + i7;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.f18957;
        i = this.f18958.f74325;
        return i2 < i;
    }
}
