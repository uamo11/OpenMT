package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: L19N */
/* renamed from: l.ᩳᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18223 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        char[] cArr = C14460.f44310;
        try {
            return MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
