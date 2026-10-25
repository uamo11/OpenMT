package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* compiled from: O7VX */
/* renamed from: l.֡᩻ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0739 extends AbstractC19791 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C16261 f2783;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16261 f2785;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16261 f2786 = null;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8087 f2784 = null;

    public C0739() {
        this.f2785 = null;
        this.f2783 = null;
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
        byte[] bArr = C19356.f62660;
        this.f63912 = C19356.m44592("auth-agent@openssh.com", StandardCharsets.UTF_8);
        C16261 c16261 = new C16261();
        this.f2785 = c16261;
        c16261.m38242();
        this.f2783 = new C16261();
        this.f63919 = true;
    }

    @Override // l.AbstractC19791
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo2847() {
        try {
            m45487();
        } catch (Exception unused) {
            this.f63909 = true;
            m45490();
        }
    }

    @Override // l.AbstractC19791
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2846(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        InterfaceC0656 interfaceC0656;
        String mo4548;
        if (this.f2784 == null) {
            C16261 c16261 = new C16261(this.f63911);
            this.f2786 = c16261;
            this.f2784 = new C8087(c16261);
        }
        this.f2785.m38242();
        C16261 c162612 = this.f2785;
        byte[] bArr3 = c162612.f50016;
        if (bArr3.length < c162612.f50017 + i2) {
            byte[] bArr4 = new byte[c162612.f50018 + i2];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.f2785.f50016 = bArr4;
        }
        this.f2785.m38246(i, i2, bArr);
        if (this.f2785.m38250() > this.f2785.m38255()) {
            C16261 c162613 = this.f2785;
            c162613.f50018 -= 4;
            return;
        }
        int m38233 = this.f2785.m38233();
        try {
            C7381 m45497 = m45497();
            InterfaceC1362 m46775 = m45497.f22696.m46775();
            InterfaceC18650 m19878 = m45497.m19878();
            this.f2783.m38242();
            if (m38233 == 11) {
                this.f2783.m38234((byte) 12);
                Vector mo1739 = m46775.mo1739();
                synchronized (mo1739) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < mo1739.size(); i4++) {
                        if (((InterfaceC0656) mo1739.elementAt(i4)).mo2690() != null) {
                            i3++;
                        }
                    }
                    this.f2783.m38245(i3);
                    for (int i5 = 0; i5 < mo1739.size(); i5++) {
                        byte[] mo2690 = ((InterfaceC0656) mo1739.elementAt(i5)).mo2690();
                        if (mo2690 != null) {
                            C16261 c162614 = this.f2783;
                            c162614.getClass();
                            c162614.m38252(0, mo2690.length, mo2690);
                            this.f2783.m38256(C19356.f62660);
                        }
                    }
                }
            } else if (m38233 == 1) {
                this.f2783.m38234((byte) 2);
                this.f2783.m38245(0);
            } else if (m38233 == 13) {
                byte[] m38257 = this.f2785.m38257();
                byte[] m382572 = this.f2785.m38257();
                int m38250 = this.f2785.m38250();
                Vector mo17392 = m46775.mo1739();
                synchronized (mo17392) {
                    int i6 = 0;
                    while (true) {
                        bArr2 = null;
                        if (i6 >= mo17392.size()) {
                            interfaceC0656 = null;
                            break;
                        }
                        interfaceC0656 = (InterfaceC0656) mo17392.elementAt(i6);
                        if (interfaceC0656.mo2690() != null && C19356.m44591(m38257, interfaceC0656.mo2690())) {
                            if (interfaceC0656.mo2692()) {
                                if (m19878 != null) {
                                    while (interfaceC0656.mo2692() && m19878.mo4551() && (mo4548 = m19878.mo4548()) != null) {
                                        try {
                                            if (interfaceC0656.mo2688(mo4548.getBytes(StandardCharsets.UTF_8))) {
                                                break;
                                            }
                                        } catch (C12651 unused) {
                                        }
                                    }
                                }
                            }
                            if (!interfaceC0656.mo2692()) {
                                break;
                            }
                        }
                        i6++;
                    }
                }
                if (interfaceC0656 != null) {
                    byte[] m382573 = new C16261(m38257).m38257();
                    if (!new String(m382573, 0, m382573.length, StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.RSA)) {
                        bArr2 = interfaceC0656.mo2691(m382572);
                    } else if ((m38250 & 2) != 0) {
                        bArr2 = interfaceC0656.mo2689("rsa-sha2-256", m382572);
                    } else if ((m38250 & 4) != 0) {
                        bArr2 = interfaceC0656.mo2689("rsa-sha2-512", m382572);
                    } else {
                        bArr2 = interfaceC0656.mo2689(OpenSSHPublicKeyUtil.RSA, m382572);
                    }
                }
                if (bArr2 == null) {
                    this.f2783.m38234((byte) 30);
                } else {
                    this.f2783.m38234(cb.f77931l);
                    C16261 c162615 = this.f2783;
                    c162615.getClass();
                    c162615.m38252(0, bArr2.length, bArr2);
                }
            } else if (m38233 == 18) {
                m46775.mo1743(this.f2785.m38257());
                this.f2783.m38234((byte) 6);
            } else if (m38233 == 9) {
                this.f2783.m38234((byte) 6);
            } else if (m38233 == 19) {
                m46775.mo1742();
                this.f2783.m38234((byte) 6);
            } else if (m38233 == 17) {
                int m38255 = this.f2785.m38255();
                byte[] bArr5 = new byte[m38255];
                C16261 c162616 = this.f2785;
                c162616.getClass();
                c162616.m38236(0, m38255, bArr5);
                this.f2783.m38234(m46775.mo1741(bArr5) ? (byte) 6 : (byte) 5);
            } else {
                C16261 c162617 = this.f2785;
                c162617.m38251(c162617.m38255() - 1);
                this.f2783.m38234((byte) 5);
            }
            int m382552 = this.f2783.m38255();
            byte[] bArr6 = new byte[m382552];
            C16261 c162618 = this.f2783;
            c162618.getClass();
            c162618.m38236(0, m382552, bArr6);
            this.f2784.m21457();
            this.f2786.m38234((byte) 94);
            this.f2786.m38245(this.f63918);
            int i7 = m382552 + 4;
            this.f2786.m38245(i7);
            C16261 c162619 = this.f2786;
            c162619.getClass();
            c162619.m38252(0, m382552, bArr6);
            try {
                m45497().m19862(this.f2784, this, i7);
            } catch (Exception unused2) {
            }
        } catch (C12651 e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // l.AbstractC19791
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo2848() {
        super.mo2848();
        m45495();
    }
}
