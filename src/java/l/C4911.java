package l;

import java.io.ByteArrayInputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

/* compiled from: 51RR */
/* renamed from: l.ۙ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4911 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Properties f15502;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f15503;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14281(byte[] bArr) {
        C14809 c14809;
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[2];
        wrap.get(bArr2);
        c14809 = C3500.f11098;
        if (!c14809.equals(new C14809(bArr2))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
        }
        if (bArr.length - 2 <= 2) {
            return;
        }
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        int m35213 = new C14809(bArr3).m35213();
        if (bArr.length - 4 < m35213) {
            return;
        }
        byte[] bArr4 = new byte[m35213];
        wrap.get(bArr4);
        this.f15502.load(new ByteArrayInputStream(bArr4));
        int length = ((bArr.length - 2) - m35213) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f15503 = bArr5;
            wrap.get(bArr5);
        }
    }

    public final String toString() {
        return "ApkExternalInfo [p=" + this.f15502 + ", otherData=" + Arrays.toString(this.f15503) + "]";
    }
}
