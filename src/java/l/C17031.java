package l;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;

/* compiled from: L9KD */
/* renamed from: l.ܿ֫ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17031 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new HMac(new MD5Digest());
    }
}
