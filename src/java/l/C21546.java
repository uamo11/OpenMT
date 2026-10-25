package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: 0C1E */
/* renamed from: l.᩸ۧᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21546 implements InterfaceC15900, InterfaceC12433 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20135 f69239;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69240;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21983 f69241;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69242;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69243;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69244 = -1;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo7691());
    }

    public C21546(C20135 c20135) {
        this.f69239 = c20135;
        this.f69240 = c20135.f65199;
        this.f69243 = c20135.f65198;
        this.f69242 = c20135.f65202;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69243 != 0;
    }

    @Override // l.InterfaceC15900
    /* renamed from: ֡ۧ */
    public final char mo7691() {
        int i;
        char c;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f69243--;
        C20135 c20135 = this.f69239;
        char[] cArr = c20135.f65201;
        if (this.f69242) {
            this.f69242 = false;
            int i2 = c20135.f65199;
            this.f69244 = i2;
            return cArr[i2];
        }
        do {
            i = this.f69240 - 1;
            this.f69240 = i;
            if (i < 0) {
                this.f69244 = Integer.MIN_VALUE;
                return this.f69241.getChar((-i) - 1);
            }
            c = cArr[i];
        } while (c == 0);
        this.f69244 = i;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        char c;
        int i = this.f69244;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C20135 c20135 = this.f69239;
        int i2 = c20135.f65199;
        if (i == i2) {
            c20135.f65202 = false;
            c20135.f65201[i2] = 0;
        } else {
            if (this.f69240 >= 0) {
                char[] cArr = c20135.f65201;
                loop0: while (true) {
                    int i3 = (i + 1) & c20135.f65197;
                    while (true) {
                        c = cArr[i3];
                        if (c == 0) {
                            break loop0;
                        }
                        int m32766 = C13630.m32766((int) c);
                        int i4 = c20135.f65197;
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
                        if (this.f69241 == null) {
                            this.f69241 = new C21983(2);
                        }
                        this.f69241.mo8955(cArr[i3]);
                    }
                    cArr[i] = c;
                    i = i3;
                }
                cArr[i] = 0;
            } else {
                c20135.mo2004(this.f69241.getChar((-r3) - 1));
                this.f69244 = -1;
                return;
            }
        }
        c20135.f65198--;
        this.f69244 = -1;
    }

    @Override // l.InterfaceC20881
    /* renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C20135 c20135 = this.f69239;
        char[] cArr = c20135.f65201;
        if (this.f69242) {
            this.f69242 = false;
            int i = c20135.f65199;
            this.f69244 = i;
            interfaceC23662.mo18328(cArr[i]);
            this.f69243--;
        }
        while (this.f69243 != 0) {
            int i2 = this.f69240 - 1;
            this.f69240 = i2;
            if (i2 < 0) {
                this.f69244 = Integer.MIN_VALUE;
                interfaceC23662.mo18328(this.f69241.getChar((-i2) - 1));
                this.f69243--;
            } else {
                char c = cArr[i2];
                if (c != 0) {
                    this.f69244 = i2;
                    interfaceC23662.mo18328(c);
                    this.f69243--;
                }
            }
        }
    }
}
