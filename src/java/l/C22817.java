package l;

import java.io.DataInputStream;

/* compiled from: G1SX */
/* renamed from: l.᩺ۜ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22817 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f73666;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f73668;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73667 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f73673 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73670 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73672 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f73669 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73671 = 0;

    public C22817(int i, C4265 c4265) {
        this.f73668 = i;
        byte[] mo4956 = c4265.mo4956(i);
        this.f73666 = mo4956;
        mo4956[i - 1] = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50921(C4265 c4265) {
        c4265.mo4954(this.f73666);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50925() {
        this.f73667 = 0;
        this.f73673 = 0;
        this.f73670 = 0;
        this.f73672 = 0;
        this.f73666[this.f73668 - 1] = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50922(int i) {
        int i2 = this.f73673;
        int i3 = this.f73668;
        if (i3 - i2 <= i) {
            this.f73672 = i3;
        } else {
            this.f73672 = i2 + i;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50924() {
        return this.f73673 < this.f73672;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m50923() {
        return this.f73669 > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50915() {
        return this.f73673;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50916(int i) {
        int i2 = this.f73673;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f73668;
        }
        return this.f73666[i3] & 255;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50918(byte b) {
        int i = this.f73673;
        int i2 = i + 1;
        this.f73673 = i2;
        this.f73666[i] = b;
        if (this.f73670 < i2) {
            this.f73670 = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50919(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.f73670) {
            throw new C22609();
        }
        int min = Math.min(this.f73672 - this.f73673, i2);
        this.f73669 = i2 - min;
        this.f73671 = i;
        int i4 = (this.f73673 - i) - 1;
        byte[] bArr = this.f73666;
        if (i4 < 0) {
            int i5 = this.f73668;
            int i6 = i4 + i5;
            int min2 = Math.min(i5 - i6, min);
            System.arraycopy(bArr, i6, bArr, this.f73673, min2);
            this.f73673 += min2;
            min -= min2;
            if (min == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int min3 = Math.min(min, this.f73673 - i4);
            System.arraycopy(bArr, i4, bArr, this.f73673, min3);
            i3 = this.f73673 + min3;
            this.f73673 = i3;
            min -= min3;
        } while (min > 0);
        if (this.f73670 < i3) {
            this.f73670 = i3;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50926() {
        int i = this.f73669;
        if (i > 0) {
            m50919(this.f73671, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50920(int i, DataInputStream dataInputStream) {
        int min = Math.min(this.f73668 - this.f73673, i);
        dataInputStream.readFully(this.f73666, this.f73673, min);
        int i2 = this.f73673 + min;
        this.f73673 = i2;
        if (this.f73670 < i2) {
            this.f73670 = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50917(int i, byte[] bArr) {
        int i2 = this.f73673;
        int i3 = this.f73667;
        int i4 = i2 - i3;
        if (i2 == this.f73668) {
            this.f73673 = 0;
        }
        System.arraycopy(this.f73666, i3, bArr, i, i4);
        this.f73667 = this.f73673;
        return i4;
    }
}
