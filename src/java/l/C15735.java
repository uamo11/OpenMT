package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: 0C59 */
/* renamed from: l.ܺۚᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15735 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3742 f48537;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48538;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19119 f48539;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f48540;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48541;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48542 = -1;

    public C15735(C3742 c3742) {
        this.f48537 = c3742;
        this.f48538 = c3742.f11817;
        this.f48541 = c3742.f11816;
        this.f48540 = c3742.f11820;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48541 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48541--;
        C3742 c3742 = this.f48537;
        Object[] objArr = c3742.f11819;
        if (this.f48540) {
            this.f48540 = false;
            int i2 = c3742.f11817;
            this.f48542 = i2;
            return objArr[i2];
        }
        do {
            i = this.f48538 - 1;
            this.f48538 = i;
            if (i < 0) {
                this.f48542 = Integer.MIN_VALUE;
                return this.f48539.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f48542 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f48542;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C3742 c3742 = this.f48537;
        int i2 = c3742.f11817;
        if (i == i2) {
            c3742.f11820 = false;
            c3742.f11819[i2] = null;
        } else {
            if (this.f48538 >= 0) {
                Object[] objArr = c3742.f11819;
                loop0: while (true) {
                    int i3 = (i + 1) & c3742.f11815;
                    while (true) {
                        obj = objArr[i3];
                        if (obj == null) {
                            break loop0;
                        }
                        int m32766 = C13630.m32766(obj.hashCode());
                        int i4 = c3742.f11815;
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
                        if (this.f48539 == null) {
                            this.f48539 = new C19119(2);
                        }
                        this.f48539.add(objArr[i3]);
                    }
                    objArr[i] = obj;
                    i = i3;
                }
                objArr[i] = null;
            } else {
                c3742.remove(this.f48539.set((-r3) - 1, null));
                this.f48542 = -1;
                return;
            }
        }
        c3742.f11816--;
        this.f48542 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C3742 c3742 = this.f48537;
        Object[] objArr = c3742.f11819;
        if (this.f48540) {
            this.f48540 = false;
            int i = c3742.f11817;
            this.f48542 = i;
            consumer.n(objArr[i]);
            this.f48541--;
        }
        while (this.f48541 != 0) {
            int i2 = this.f48538 - 1;
            this.f48538 = i2;
            if (i2 < 0) {
                this.f48542 = Integer.MIN_VALUE;
                consumer.n(this.f48539.get((-i2) - 1));
                this.f48541--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f48542 = i2;
                    consumer.n(obj);
                    this.f48541--;
                }
            }
        }
    }
}
