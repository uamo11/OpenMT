package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: S24 */
/* renamed from: l.ۡ᩵ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9094 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4155 f27560;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5566 f27563;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27562 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27561 = 0;

    public C9094(C4155 c4155) {
        this.f27560 = c4155;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27561 < this.f27560.f13561.f69812;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C21794 c21794 = this.f27560.f13561;
        int i = this.f27561;
        this.f27561 = i + 1;
        this.f27562 = i;
        C5566 c5566 = new C5566(c21794, i);
        this.f27563 = c5566;
        return c5566;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f27562 == -1) {
            throw new IllegalStateException();
        }
        this.f27562 = -1;
        C4155 c4155 = this.f27560;
        C21794 c21794 = c4155.f13561;
        int i = c21794.f69812;
        c21794.f69812 = i - 1;
        int i2 = this.f27561;
        int i3 = i2 - 1;
        this.f27561 = i3;
        int i4 = i - i2;
        Object[] objArr = c21794.f69816;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c4155.f13561.f69811;
        int i5 = this.f27561;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f27563.f17246 = -1;
        C21794 c217942 = c4155.f13561;
        Object[] objArr3 = c217942.f69816;
        int i6 = c217942.f69812;
        objArr3[i6] = null;
        c217942.f69811[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C4155 c4155 = this.f27560;
        int i = c4155.f13561.f69812;
        while (true) {
            int i2 = this.f27561;
            if (i2 >= i) {
                return;
            }
            C21794 c21794 = c4155.f13561;
            this.f27561 = i2 + 1;
            this.f27562 = i2;
            C5566 c5566 = new C5566(c21794, i2);
            this.f27563 = c5566;
            consumer.accept(c5566);
        }
    }
}
