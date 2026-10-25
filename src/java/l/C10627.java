package l;

import java.io.IOException;

/* compiled from: L99C */
/* renamed from: l.ۤ᩻ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10627 extends AbstractC21023 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31919;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31920;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23411 f31921;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31922;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20714[] f31923;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31924;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f31925;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31926;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31927;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31928;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f31929;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31930;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f31931;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private synchronized int[] m26656(int i) {
        if (i >= 0) {
            try {
                if (i < this.f31919) {
                    this.f31921.seek(this.f31926 + this.f31920 + this.f31929[i]);
                    C15859 c15859 = new C15859();
                    while (true) {
                        try {
                            int readInt = this.f31921.readInt();
                            if (readInt == -1) {
                                return c15859.mo3586();
                            }
                            c15859.add(readInt);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            return null;
                        }
                    }
                }
            } catch (IOException e) {
                throw new C7595(e);
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized String m26657(int i) {
        int i2;
        if (i >= 0) {
            if (i < this.f31930) {
                int i3 = this.f31926 + this.f31922 + this.f31925[i];
                if (i3 >= this.f31927 && i3 < (i2 = this.f31928)) {
                    String m47856 = m47856(this.f31921, i3, this.f31931, i2);
                    if (m47856 == null) {
                        int m26655 = m26655(i);
                        if (m26655 != -1 && (m47856 = m47856(this.f31921, m26655, this.f31931, this.f31928)) != null) {
                            this.f31925[i] = (m26655 - this.f31926) - this.f31922;
                        }
                        if (m47856 == null) {
                            m47856 = "";
                        }
                    }
                    if (m47856.length() > 10000) {
                        m47856 = InterfaceC12743.f38313;
                    }
                    return m47856;
                }
                return InterfaceC12743.f38313;
            }
        }
        return C22412.m50343(i, this.f31930).toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized int m26655(int i) {
        C22412.m50341("getPreviousStringEndOffset " + i);
        if (i == 0) {
            return this.f31926 + this.f31922;
        }
        int i2 = i - 1;
        int m47850 = AbstractC21023.m47850(this.f31921, this.f31926 + this.f31922 + this.f31925[i2], this.f31931, this.f31928);
        C22412.m50341("new offset " + m47850);
        if (m47850 != -1) {
            return m47850;
        }
        int m26655 = m26655(i2);
        if (m26655 == -1) {
            return -1;
        }
        return AbstractC21023.m47850(this.f31921, m26655, this.f31931, this.f31928);
    }

    public C10627(C23411 c23411) {
        this.f31921 = c23411;
        long filePointer = c23411.getFilePointer();
        int i = (int) filePointer;
        if (filePointer != i) {
            throw new ArithmeticException();
        }
        this.f31926 = i;
        C1993 m6524 = C1993.m6524(c23411);
        if (m6524.f6676 == 0) {
            c23411.skipBytes(m6524.f6673 - 8);
            long filePointer2 = c23411.getFilePointer();
            int i2 = (int) filePointer2;
            if (filePointer2 != i2) {
                throw new ArithmeticException();
            }
            this.f31926 = i2;
            m6524 = C1993.m6524(c23411);
        }
        int i3 = m6524.f6673;
        int i4 = m6524.f6674;
        m6524.m6526(1);
        int readInt = c23411.readInt();
        int readInt2 = c23411.readInt();
        this.f31919 = readInt2;
        this.f31924 = c23411.readInt();
        int readInt3 = c23411.readInt();
        int readInt4 = c23411.readInt();
        this.f31920 = readInt4;
        if (i4 > 28) {
            c23411.skipBytes(i4 - 28);
        }
        readInt3 = readInt3 < i4 ? i4 : readInt3;
        if ((readInt2 == 0 || readInt4 == 0) && (readInt < 0 || (readInt * 4) + i4 > readInt3)) {
            this.f31919 = 0;
            this.f31920 = 0;
            readInt = (readInt3 - i4) / 4;
        }
        this.f31930 = readInt;
        this.f31922 = readInt3;
        int i5 = this.f31919;
        if (i5 == 0) {
            this.f31920 = 0;
        }
        if (readInt > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i5 > readInt) {
            this.f31919 = readInt;
        }
        int i6 = this.f31926;
        this.f31927 = i4 + i6;
        int i7 = this.f31920;
        long length = c23411.length();
        this.f31928 = AbstractC21023.m47842(i6, readInt3, i7, i3, length <= 0 ? 0 : length >= 2147483647L ? Integer.MAX_VALUE : (int) length);
        this.f31925 = new int[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f31925[i8] = c23411.readInt();
        }
        int i9 = this.f31919;
        if (i9 != 0) {
            this.f31929 = new int[i9];
            for (int i10 = 0; i10 < this.f31919; i10++) {
                this.f31929[i10] = c23411.readInt();
            }
        } else {
            this.f31929 = new int[0];
        }
        this.f31923 = new C20714[readInt];
        this.f31931 = (this.f31924 & 256) != 0;
        c23411.seek(this.f31926 + i3);
    }

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f31930;
    }

    @Override // l.InterfaceC12743
    public final C20714 getItem(int i) {
        C20714[] c20714Arr = this.f31923;
        if (c20714Arr != null && i >= 0 && i < this.f31930) {
            C20714 c20714 = c20714Arr[i];
            if (c20714 != null) {
                return c20714;
            }
            C20714 c207142 = new C20714(this, m26657(i), m26656(i));
            c20714Arr[i] = c207142;
            return c207142;
        }
        return new C20714(this, m26657(i), m26656(i));
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫ */
    public final InterfaceC3571 mo3389(int i) {
        int i2 = this.f31930;
        if (i < 0 || i >= i2) {
            throw C22412.m50343(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫ */
    public final boolean mo3391() {
        return this.f31931;
    }
}
