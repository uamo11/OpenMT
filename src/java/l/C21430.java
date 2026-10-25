package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CCMBlockCipher;

/* compiled from: G9IQ */
/* renamed from: l.᩸۟ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21430 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new C15078(new CCMBlockCipher(new AESEngine()));
    }
}
