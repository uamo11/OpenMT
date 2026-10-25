package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: VFO */
/* renamed from: l.ܳۚᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14324 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6564 f43206;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43207;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19119 f43208;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43209;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f43210;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f43211 = -1;

    public C14324(C6564 c6564) {
        this.f43206 = c6564;
        this.f43207 = c6564.f20253;
        this.f43210 = c6564.f20252;
        this.f43209 = c6564.f20256;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43210 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f43210--;
        C6564 c6564 = this.f43206;
        Object[] objArr = c6564.f20255;
        if (this.f43209) {
            this.f43209 = false;
            int i2 = c6564.f20253;
            this.f43211 = i2;
            return objArr[i2];
        }
        do {
            i = this.f43207 - 1;
            this.f43207 = i;
            if (i < 0) {
                this.f43211 = Integer.MIN_VALUE;
                return this.f43208.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f43211 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f43211;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C6564 c6564 = this.f43206;
        int i2 = c6564.f20253;
        if (i == i2) {
            c6564.f20256 = false;
            c6564.f20255[i2] = null;
        } else {
            if (this.f43207 >= 0) {
                Object[] objArr = c6564.f20255;
                loop0: while (true) {
                    int i3 = (i + 1) & c6564.f20250;
                    while (true) {
                        obj = objArr[i3];
                        if (obj == null) {
                            break loop0;
                        }
                        int m32766 = C13630.m32766(c6564.f20251.mo8733(obj));
                        int i4 = c6564.f20250;
                        int i5 = m32766 & i4;
                        if (i > i3) {
                            if (i >= i5 && i5 > i3) {
                                break;
                            }
                            i3 = (i3 + 1) & i4;
                        } else if (i >= i5 || i5 > i3) {
                            break;
                        } else {
                            i3 = (i3 + 1) & i4;
                        }
                    }
                    if (i3 < i) {
                        if (this.f43208 == null) {
                            this.f43208 = new C19119(2);
                        }
                        this.f43208.add(objArr[i3]);
                    }
                    objArr[i] = obj;
                    i = i3;
                }
                objArr[i] = null;
            } else {
                c6564.remove(this.f43208.set((-r3) - 1, null));
                this.f43211 = -1;
                return;
            }
        }
        c6564.f20252--;
        this.f43211 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C6564 c6564 = this.f43206;
        Object[] objArr = c6564.f20255;
        if (this.f43209) {
            this.f43209 = false;
            int i = c6564.f20253;
            this.f43211 = i;
            consumer.accept(objArr[i]);
            this.f43210--;
        }
        while (this.f43210 != 0) {
            int i2 = this.f43207 - 1;
            this.f43207 = i2;
            if (i2 < 0) {
                this.f43211 = Integer.MIN_VALUE;
                consumer.accept(this.f43208.get((-i2) - 1));
                this.f43210--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f43211 = i2;
                    consumer.accept(obj);
                    this.f43210--;
                }
            }
        }
    }
}
