package l;

import java.io.DataInputStream;

/* compiled from: F1TL */
/* renamed from: l.֨᩷֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1359 extends AbstractC5593 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f4951;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4952;

    public C1359(C4265 c4265) {
        byte[] mo4956 = c4265.mo4956(65531);
        this.f4951 = mo4956;
        this.f4952 = mo4956.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4774(C4265 c4265) {
        c4265.mo4954(this.f4951);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4773(int i, DataInputStream dataInputStream) {
        if (i < 5) {
            throw new C22609();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C22609();
        }
        this.f17306 = dataInputStream.readInt();
        this.f17307 = -1;
        int i2 = i - 5;
        byte[] bArr = this.f4951;
        int length = bArr.length - i2;
        this.f4952 = length;
        dataInputStream.readFully(bArr, length, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4775() {
        return this.f4952 == this.f4951.length && this.f17306 == 0;
    }

    @Override // l.AbstractC5593
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4772() {
        int i = this.f17307;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.f17306 << 8;
                byte[] bArr = this.f4951;
                int i3 = this.f4952;
                this.f4952 = i3 + 1;
                this.f17306 = i2 | (bArr[i3] & 255);
                this.f17307 = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C22609();
            }
        }
    }
}
