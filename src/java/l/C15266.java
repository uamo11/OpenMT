package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: 14GC */
/* renamed from: l.ܶܰۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15266 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f46848;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Mac f46849;

    public C15266() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f46849 = mac;
            this.f46848 = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36281(byte[] bArr) {
        try {
            this.f46849.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
