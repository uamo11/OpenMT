package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* compiled from: G9IQ */
/* renamed from: l.᩶۟ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20019 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new C22135(new GCMBlockCipher(new AESEngine()));
    }
}
