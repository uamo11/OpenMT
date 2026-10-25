package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* compiled from: YB6A */
/* renamed from: l.ۖ᩺᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2849 extends C16253 implements ICryptoGetTextPassword {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f9099;

    public C2849(ISequentialOutStream iSequentialOutStream, String str) {
        super(iSequentialOutStream);
        this.f9099 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f9099;
    }
}
