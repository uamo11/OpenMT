package l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: N9H1 */
/* renamed from: l.᩺֫ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22676 implements InterfaceC12798 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f73185;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f73186 = C11321.m27961(C22676.class);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f73187;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73188;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f73189;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11388 f73190;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2215 f73191;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f73192;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f73193 = new AtomicInteger(0);

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f73185 = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        f73187 = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C22676(C11388 c11388) {
        this.f73190 = c11388;
    }

    @Override // l.InterfaceC12798
    /* renamed from: ֫ */
    public final C23415 mo28153(C2921 c2921, byte[] bArr, C6717 c6717) {
        byte[] bArr2;
        C23415 mo28153 = this.f73190.mo28153(c2921, bArr, c6717);
        if (mo28153 == null) {
            return null;
        }
        byte[] m51873 = mo28153.m51873();
        Set m51868 = mo28153.m51868();
        InterfaceC2148 interfaceC2148 = f73186;
        if (m51873 != null) {
            interfaceC2148.mo7088("Calculating signing and sealing keys for NTLM Extended Session Security");
            EnumC20909 enumC20909 = EnumC20909.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
            this.f73192 = m51868.contains(enumC20909) ? C16674.m39202(this.f73191, m51873, f73185) : null;
            C19498 m51867 = mo28153.m51867();
            if (m51868.contains(enumC20909)) {
                if (!m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_128)) {
                    if (m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_56)) {
                        m51873 = Arrays.copyOf(m51873, 7);
                    } else {
                        m51873 = Arrays.copyOf(m51873, 5);
                    }
                }
                bArr2 = C16674.m39202(this.f73191, m51873, f73187);
            } else if (m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_LM_KEY) || (m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_DATAGRAM) && m51867.m44908().getValue() >= EnumC2564.NTLMSSP_REVISION_W2K3.getValue())) {
                bArr2 = new byte[8];
                if (m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_56)) {
                    System.arraycopy(m51873, 0, bArr2, 0, 7);
                    bArr2[7] = -96;
                } else {
                    System.arraycopy(m51873, 0, bArr2, 0, 5);
                    bArr2[5] = -27;
                    bArr2[6] = 56;
                    bArr2[7] = -80;
                }
            } else {
                bArr2 = Arrays.copyOf(m51873, m51873.length);
            }
            this.f73189 = bArr2;
        }
        if (mo28153.m51862() instanceof C15388) {
            this.f73188 = ((C15388) mo28153.m51862()).m36426();
        }
        if (this.f73192 == null || !(mo28153.m51862() instanceof C21740)) {
            return mo28153;
        }
        C21740 c21740 = (C21740) mo28153.m51862();
        interfaceC2148.mo7088("Signing with NTLM Extended Session Security");
        int andIncrement = this.f73193.getAndIncrement();
        byte[] bArr3 = this.f73192;
        byte[] bArr4 = {(byte) (andIncrement & 255), (byte) ((andIncrement >> 8) & 255), (byte) ((andIncrement >> 16) & 255), (byte) ((andIncrement >> 24) & 255)};
        C1818 c1818 = new C1818(new ArrayList(this.f73188));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(new C8377(), byteArrayOutputStream);
        try {
            c15948.m37722(c1818);
            c15948.close();
            byte[] bArr5 = new byte[8];
            System.arraycopy(C16674.m39201(this.f73191, bArr3, bArr4, byteArrayOutputStream.toByteArray()), 0, bArr5, 0, 8);
            if (m51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                bArr5 = C16674.m39200(this.f73191, this.f73189, bArr5);
            }
            C0097 c0097 = new C0097();
            c0097.m26088(1L);
            c0097.m26077(8, bArr5);
            c0097.m26088(andIncrement);
            c21740.m49068(c0097.m26098());
            return mo28153;
        } finally {
        }
    }

    @Override // l.InterfaceC12798
    /* renamed from: ֫ */
    public final void mo28154(C4332 c4332) {
        this.f73190.mo28154(c4332);
        this.f73191 = c4332.m13038();
    }

    @Override // l.InterfaceC12798
    /* renamed from: ֫ */
    public final boolean mo28155(C2921 c2921) {
        return this.f73190.mo28155(c2921);
    }
}
