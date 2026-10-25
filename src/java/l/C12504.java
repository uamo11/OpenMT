package l;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* compiled from: I7XJ */
/* renamed from: l.۫ܺۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12504 implements InterfaceC3771 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BigInteger f37559;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f37560;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public KeyPairGenerator f37561;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BigInteger f37562;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public KeyAgreement f37563;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BigInteger f37564;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public BigInteger f37565;

    @Override // l.InterfaceC3771
    public final void init() {
        this.f37561 = KeyPairGenerator.getInstance("DH");
        this.f37563 = KeyAgreement.getInstance("DH");
    }

    @Override // l.InterfaceC3771
    /* renamed from: ֫ */
    public final byte[] mo11426() {
        if (this.f37559 == null) {
            this.f37561.initialize(new DHParameterSpec(this.f37565, this.f37564));
            KeyPair generateKeyPair = this.f37561.generateKeyPair();
            this.f37563.init(generateKeyPair.getPrivate());
            BigInteger y = ((DHPublicKey) generateKeyPair.getPublic()).getY();
            this.f37559 = y;
            this.f37560 = y.toByteArray();
        }
        return this.f37560;
    }

    @Override // l.InterfaceC3771
    /* renamed from: ۧ */
    public final byte[] mo11428() {
        this.f37563.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f37562, this.f37565, this.f37564)), true);
        return this.f37563.generateSecret();
    }

    @Override // l.InterfaceC3771
    /* renamed from: ܽ */
    public final void mo11429(byte[] bArr) {
        this.f37565 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC3771
    /* renamed from: ֫ */
    public final void mo11425(byte[] bArr) {
        this.f37564 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC3771
    /* renamed from: ۧ */
    public final void mo11427(byte[] bArr) {
        this.f37562 = new BigInteger(1, bArr);
    }
}
