package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: J55M */
/* renamed from: l.ۙܺܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4752 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f15067;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f15068;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10397[] f15069;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6163 f15070;

    public C4752(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f15067 = wrap;
        byte[] bArr2 = new byte[16];
        wrap.get(bArr2);
        if (bArr2[0] != Byte.MAX_VALUE || bArr2[1] != 69 || bArr2[2] != 76 || bArr2[3] != 70) {
            throw new C22391("Invalid ELF signature");
        }
        byte b = bArr2[4];
        if (b == 1) {
            this.f15068 = false;
        } else {
            if (b != 2) {
                throw new C22391("Invalid ELF class");
            }
            this.f15068 = true;
        }
        byte b2 = bArr2[5];
        if (b2 == 1) {
            wrap.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            if (b2 != 2) {
                throw new C22391("Invalid ELF endian");
            }
            wrap.order(ByteOrder.BIG_ENDIAN);
        }
        if (bArr2[6] != 1) {
            throw new C22391("Invalid ELF version");
        }
        wrap.getShort(16);
        wrap.getShort(18);
        wrap.getInt(20);
        if (this.f15068) {
            wrap.getLong(24);
            wrap.getInt(48);
            C10397[] m13899 = m13899(wrap.getInt(40), wrap.getShort(58) & HPKE.aead_EXPORT_ONLY, wrap.getShort(60) & HPKE.aead_EXPORT_ONLY);
            this.f15069 = m13899;
            this.f15070 = (C6163) m13899[wrap.getShort(62) & HPKE.aead_EXPORT_ONLY];
            return;
        }
        wrap.getInt(24);
        wrap.getInt(36);
        C10397[] m138992 = m13899(wrap.getInt(32), wrap.getShort(46) & HPKE.aead_EXPORT_ONLY, wrap.getShort(48) & HPKE.aead_EXPORT_ONLY);
        this.f15069 = m138992;
        this.f15070 = (C6163) m138992[wrap.getShort(50) & HPKE.aead_EXPORT_ONLY];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10397[] m13899(int i, int i2, int i3) {
        C10397 c10397;
        C10397[] c10397Arr = new C10397[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * i2) + i;
            int i6 = this.f15067.getInt(i5 + 4);
            if (i6 != 0) {
                if (i6 != 9) {
                    if (i6 == 11 || i6 == 2) {
                        c10397 = new C13923(this, i5);
                    } else if (i6 == 3) {
                        c10397 = new C6163(this, i5);
                    } else if (i6 != 4) {
                        c10397 = new C10397(this, i5);
                    }
                }
                c10397 = new C12513(this, i5);
            } else {
                c10397 = null;
            }
            c10397Arr[i4] = c10397;
        }
        return c10397Arr;
    }
}
