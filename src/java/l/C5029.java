package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: I9YH */
/* renamed from: l.ۚ֨᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5029 implements InterfaceC15030 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f15826 = C11321.m27961(C5029.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f15827;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f15828;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier f15829;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15736 f15830;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f15831;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier[] f15832;

    static {
        try {
            new ASN1ObjectIdentifier("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f15826.mo7091("Failed to initialize OID", (Throwable) e);
        }
    }

    public C5029(InterfaceC1023 interfaceC1023, C15736 c15736) {
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {C15736.f48543};
        this.f15828 = true;
        this.f15830 = c15736;
        this.f15832 = aSN1ObjectIdentifierArr;
        C13722 c13722 = (C13722) interfaceC1023;
        c13722.getClass();
        this.f15831 = c13722.m33017();
    }

    @Override // l.InterfaceC15030
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo14526() {
        return this.f15830.mo14526();
    }

    @Override // l.InterfaceC15030
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo14525(int i, byte[] bArr) {
        Object c14906;
        byte[] m49450;
        byte[] bArr2;
        AbstractC21963 c149062;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (this.f15827) {
            throw new C19369("Already complete");
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
        C15736 c15736 = this.f15830;
        if (i == 0) {
            c149062 = new C7851(aSN1ObjectIdentifierArr, 0, c15736.mo14525(0, new byte[0]));
        } else {
            byte[] bArr3 = new byte[i];
            if (bArr.length != i) {
                System.arraycopy(bArr, 0, bArr3, 0, i);
                bArr = bArr3;
            }
            try {
                byte b = bArr[0];
                if (b == -95) {
                    c14906 = new C14906(bArr);
                } else if (b == 96) {
                    c14906 = new C7851(bArr);
                } else {
                    throw new C21258("Invalid token type");
                }
                if (c14906 instanceof C7851) {
                    C7851 c7851 = (C7851) c14906;
                    ASN1ObjectIdentifier[] m21034 = c7851.m21034();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = m21034[0];
                    c15736.getClass();
                    if (C15736.f48543.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        m49450 = c7851.m49450();
                    } else {
                        int length = m21034.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aSN1ObjectIdentifier = null;
                                break;
                            }
                            aSN1ObjectIdentifier = m21034[i2];
                            if (C15736.f48543.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                                break;
                            }
                            i2++;
                        }
                        if (aSN1ObjectIdentifier == null) {
                            throw new C3037("Server does advertise any supported mechanism");
                        }
                        m49450 = null;
                    }
                } else if (c14906 instanceof C14906) {
                    C14906 c149063 = (C14906) c14906;
                    if (this.f15828) {
                        ASN1ObjectIdentifier m35366 = c149063.m35366();
                        c15736.getClass();
                        if (!C15736.f48543.equals((ASN1Primitive) m35366)) {
                            throw new C3037("Server chose an unsupported mechanism " + c149063.m35366());
                        }
                        this.f15829 = c149063.m35366();
                        if (c149063.m35365() == 3) {
                            this.f15831 = true;
                        }
                        this.f15828 = false;
                    } else if (c149063.m35366() != null && !c149063.m35366().equals((ASN1Primitive) this.f15829)) {
                        throw new C3037("Server switched mechanism");
                    }
                    m49450 = c149063.m49450();
                } else {
                    throw new C3037("Invalid token");
                }
                boolean z = c14906 instanceof C14906;
                if (z && c15736.mo14524()) {
                    C14906 c149064 = (C14906) c14906;
                    if (c149064.m35365() == 1 && c149064.m49450() == null && c149064.m49448() != null) {
                        m14521(c149064.m49448());
                        c149062 = new C14906(null, m14523());
                    } else {
                        if (c149064.m35365() != 0) {
                            throw new C3037("SPNEGO negotiation did not complete");
                        }
                        m14521(c149064.m49448());
                        this.f15827 = true;
                        c149062 = null;
                    }
                } else if (m49450 != null) {
                    byte[] mo14525 = c15736.mo14525(m49450.length, m49450);
                    if (z) {
                        C14906 c149065 = (C14906) c14906;
                        if (c149065.m35365() == 0 && c15736.mo14524()) {
                            m14521(c149065.m49448());
                            bArr2 = m14523();
                            this.f15827 = true;
                        } else if (c15736.m37143()) {
                            bArr2 = m14523();
                        } else if (c149065.m35365() == 2) {
                            throw new C3037("SPNEGO mechanism was rejected");
                        }
                        c149062 = new C14906(mo14525, bArr2);
                    }
                    bArr2 = null;
                    c149062 = new C14906(mo14525, bArr2);
                } else {
                    c149062 = new C7851(aSN1ObjectIdentifierArr, 0, c15736.mo14525(0, new byte[0]));
                }
            } catch (IOException unused) {
                throw new C21258("Invalid token");
            }
        }
        if (c149062 == null) {
            return null;
        }
        return c149062.mo21033();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m14523() {
        C15736 c15736 = this.f15830;
        if (!c15736.m37143()) {
            return null;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
        byte[] m14522 = m14522(aSN1ObjectIdentifierArr);
        byte[] m37141 = c15736.m37141(m14522);
        InterfaceC2148 interfaceC2148 = f15826;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Out Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
            interfaceC2148.mo7088("Out Mech list encoded ".concat(C12085.m29468(m14522, 0, m14522.length)));
            interfaceC2148.mo7088("Out Mech list MIC ".concat(C12085.m29468(m37141, 0, 16)));
        }
        return m37141;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14521(byte[] bArr) {
        C15736 c15736 = this.f15830;
        if (bArr != null) {
            c15736.getClass();
        } else if (this.f15831 && !c15736.m37140(this.f15829)) {
            throw new C19369("SPNEGO integrity is required but not available");
        }
        if (!c15736.m37143() || bArr == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
            byte[] m14522 = m14522(aSN1ObjectIdentifierArr);
            InterfaceC2148 interfaceC2148 = f15826;
            if (interfaceC2148.mo7094()) {
                interfaceC2148.mo7088("In Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
                interfaceC2148.mo7088("In Mech list encoded ".concat(C12085.m29468(m14522, 0, m14522.length)));
                interfaceC2148.mo7088("In Mech list MIC ".concat(C12085.m29468(bArr, 0, bArr.length)));
            }
            c15736.m37139(m14522, bArr);
        } catch (C19369 e) {
            throw new C19369("Failed to verify mechanismListMIC", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m14522(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream create = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            create.writeObject((ASN1Primitive) new DERSequence(aSN1ObjectIdentifierArr));
            create.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C19369("Failed to encode mechList", e);
        }
    }

    @Override // l.InterfaceC15030
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14524() {
        return this.f15827 && this.f15830.mo14524();
    }

    public final String toString() {
        return "SPNEGO[" + this.f15830 + "]";
    }
}
