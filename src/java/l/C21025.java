package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: OB8U */
/* renamed from: l.᩷ܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21025 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f67865;

    public C21025(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new NullPointerException("buf == null");
        }
        this.f67865 = byteBuffer;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17496 m47861() {
        int i;
        int i2;
        int i3;
        ByteBuffer byteBuffer = this.f67865;
        int position = byteBuffer.position();
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        byte b = byteBuffer.get();
        int i4 = b & bo.j;
        if (i4 == 31) {
            i4 = 0;
            while (byteBuffer.hasRemaining()) {
                byte b2 = byteBuffer.get();
                if (i4 > 16777215) {
                    throw new C14673("Tag number too large");
                }
                i4 = (i4 << 7) | (b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                if ((b2 & GCMSIVBlockCipher.MASK) == 0) {
                }
            }
            throw new C14673("Truncated tag number");
        }
        boolean z = (b & UTF8.S_CS3) != 0;
        if (!byteBuffer.hasRemaining()) {
            throw new C14673("Missing length");
        }
        byte b3 = byteBuffer.get();
        int i5 = b3 & 255;
        if ((b3 & GCMSIVBlockCipher.MASK) == 0) {
            i3 = b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            i2 = byteBuffer.position() - position;
            m47860(i3);
        } else if (i5 != 128) {
            int i6 = b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            if (i6 > 4) {
                throw new C14673(C18307.m42645(i6, "Length too large: ", " bytes"));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                if (!byteBuffer.hasRemaining()) {
                    throw new C14673("Truncated length");
                }
                byte b4 = byteBuffer.get();
                if (i7 > 8388607) {
                    throw new C14673("Length too large");
                }
                i7 = (i7 << 8) | (b4 & 255);
            }
            int position2 = byteBuffer.position() - position;
            m47860(i7);
            i2 = position2;
            i3 = i7;
        } else {
            int position3 = byteBuffer.position() - position;
            if (z) {
                int position4 = byteBuffer.position();
                while (byteBuffer.hasRemaining()) {
                    if (byteBuffer.remaining() <= 1 || byteBuffer.getShort(byteBuffer.position()) != 0) {
                        m47861();
                    } else {
                        i = byteBuffer.position() - position4;
                        byteBuffer.position(byteBuffer.position() + 2);
                    }
                }
                throw new C14673("Truncated indefinite-length contents: " + (byteBuffer.position() - position4) + " bytes read");
            }
            int i9 = 0;
            boolean z2 = false;
            while (byteBuffer.hasRemaining()) {
                byte b5 = byteBuffer.get();
                int i10 = i9 + 1;
                if (i10 < 0) {
                    throw new C14673("Indefinite-length contents too long");
                }
                if (b5 != 0) {
                    z2 = false;
                } else if (z2) {
                    i = i9 - 1;
                } else {
                    z2 = true;
                }
                i9 = i10;
            }
            throw new C14673(C18307.m42645(i9, "Truncated indefinite-length contents: ", " bytes read"));
            int i11 = i;
            i2 = position3;
            i3 = i11;
        }
        int position5 = byteBuffer.position();
        byteBuffer.position(position);
        int limit = byteBuffer.limit();
        byteBuffer.limit(position5);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(limit);
        slice.position(i2);
        slice.limit(i2 + i3);
        ByteBuffer slice2 = slice.slice();
        slice.clear();
        return new C17496(slice, slice2, (b & 255) >> 6, i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47860(int i) {
        ByteBuffer byteBuffer = this.f67865;
        if (byteBuffer.remaining() >= i) {
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            StringBuilder m32308 = C13325.m32308(i, "Truncated contents. Need: ", " bytes, available: ");
            m32308.append(byteBuffer.remaining());
            throw new C14673(m32308.toString());
        }
    }
}
