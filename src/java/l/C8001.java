package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: M1SL */
/* renamed from: l.۠ۜ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8001 extends AbstractC5179 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f24708;

    public C8001() {
        this.f16209 = 32;
        this.f16208 = XMSSKeyParameters.SHA_256;
        this.f24708 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.AbstractC5179
    /* renamed from: ֫ */
    public final void mo1497(byte[] bArr, int i, int i2) {
        this.f24708.update(bArr, i, i2);
    }

    @Override // l.AbstractC5179
    /* renamed from: ֫ */
    public final byte[] mo1498() {
        MessageDigest messageDigest = this.f24708;
        byte[] digest = messageDigest.digest();
        messageDigest.reset();
        return digest;
    }
}
