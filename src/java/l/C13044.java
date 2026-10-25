package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: Y8J8 */
/* renamed from: l.۬ۤ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13044 extends AbstractC0759 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f39053;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f39057;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f39058;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f39059;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39063;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39064;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f39055 = 0;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39061 = 0;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f39054 = 0;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f39051 = 100000;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f39052 = 0.2f;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f39060 = 2000000;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f39062 = 10;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final short f39056 = 1024;

    public C13044() {
        byte[] bArr = C3603.f11423;
        this.f39053 = bArr;
        this.f39058 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31621(boolean z) {
        this.f39057 = z;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m31622() {
        return this.f39059;
    }

    @Override // l.AbstractC0759
    /* renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) {
        if (c18399.f57133 == 2) {
            return c18399.f57134 == -1 ? C18399.f57130 : c18399;
        }
        throw new C19105(c18399);
    }

    @Override // l.AbstractC0759, l.InterfaceC0053
    /* renamed from: ܽ */
    public final boolean mo964() {
        return super.mo964() && this.f39057;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !m2901()) {
            int i = this.f39064;
            short s = this.f39056;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f39053.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.f39063;
                        position = ((limit3 / i2) * i2) + i2;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f39064 = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    m2900(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                C22632.m50634(this.f39061 < this.f39053.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.f39063;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.f39061;
                int i5 = this.f39054;
                int i6 = i4 + i5;
                byte[] bArr = this.f39053;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f39053, i6, min);
                int i8 = this.f39054 + min;
                this.f39054 = i8;
                C22632.m50634(i8 <= this.f39053.length);
                boolean z2 = z && position3 < i7;
                m31620(z2);
                if (z2) {
                    this.f39064 = 0;
                    this.f39055 = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // l.AbstractC0759
    /* renamed from: ᩻ */
    public final void mo2905() {
        if (this.f39054 > 0) {
            m31620(true);
            this.f39055 = 0;
        }
    }

    @Override // l.AbstractC0759
    /* renamed from: ܳ */
    public final void mo2904() {
        if (mo964()) {
            int i = this.f2818.f57132 * 2;
            this.f39063 = i;
            int i2 = ((((int) ((this.f39051 * r0.f57134) / 1000000)) / 2) / i) * i * 2;
            if (this.f39053.length != i2) {
                this.f39053 = new byte[i2];
                this.f39058 = new byte[i2];
            }
        }
        this.f39064 = 0;
        this.f39059 = 0L;
        this.f39055 = 0;
        this.f39061 = 0;
        this.f39054 = 0;
    }

    @Override // l.AbstractC0759
    /* renamed from: ۜ */
    public final void mo2902() {
        this.f39057 = false;
        byte[] bArr = C3603.f11423;
        this.f39053 = bArr;
        this.f39058 = bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31620(boolean z) {
        int length;
        int m31619;
        int i = this.f39054;
        byte[] bArr = this.f39053;
        if (i == bArr.length || z) {
            if (this.f39055 == 0) {
                if (z) {
                    m31618(i, 3);
                    length = i;
                } else {
                    C22632.m50634(i >= bArr.length / 2);
                    length = this.f39053.length / 2;
                    m31618(length, 0);
                }
                m31619 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m316192 = m31619(length2) + (this.f39053.length / 2);
                m31618(m316192, 2);
                m31619 = m316192;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                m31619 = m31619(length);
                m31618(m31619, 1);
            }
            C22632.m50633("bytesConsumed is not aligned to frame size: %s" + length, length % this.f39063 == 0);
            C22632.m50634(i >= m31619);
            this.f39054 -= length;
            int i2 = this.f39061 + length;
            this.f39061 = i2;
            this.f39061 = i2 % this.f39053.length;
            this.f39055 = (m31619 / this.f39063) + this.f39055;
            this.f39059 += (length - m31619) / r2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31618(int i, int i2) {
        if (i == 0) {
            return;
        }
        C22632.m50631(this.f39054 >= i);
        if (i2 == 2) {
            int i3 = this.f39061;
            int i4 = this.f39054;
            int i5 = i3 + i4;
            byte[] bArr = this.f39053;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f39058, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f39058, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f39058, 0, i6);
                    System.arraycopy(this.f39053, 0, this.f39058, i6, length);
                }
            }
        } else {
            int i7 = this.f39061;
            int i8 = i7 + i;
            byte[] bArr2 = this.f39053;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f39058, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f39058, 0, length2);
                System.arraycopy(this.f39053, 0, this.f39058, length2, i - length2);
            }
        }
        C22632.m50630("sizeToOutput is not aligned to frame size: " + i, i % this.f39063 == 0);
        C22632.m50634(this.f39061 < this.f39053.length);
        byte[] bArr3 = this.f39058;
        C22632.m50630("byteOutput size is not aligned to frame size " + i, i % this.f39063 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f39062;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = GCMSIVBlockCipher.MASK;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        m2900(i).put(bArr3, 0, i).flip();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m31619(int i) {
        int length = ((((int) ((this.f39060 * this.f2818.f57134) / 1000000)) - this.f39055) * this.f39063) - (this.f39053.length / 2);
        C22632.m50634(length >= 0);
        int min = (int) Math.min((i * this.f39052) + 0.5f, length);
        int i2 = this.f39063;
        return (min / i2) * i2;
    }
}
