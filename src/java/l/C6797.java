package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;

/* compiled from: 89HI */
/* renamed from: l.ۜܰۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6797 extends C23730 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f21087;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f21088;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f21089;

    public C6797(AbstractSet abstractSet, String str, String str2, C19498 c19498, boolean z) {
        super(abstractSet, c19498);
        byte[] bArr;
        byte[] bArr2 = C15968.f49277;
        if (str != null) {
            Charset charset = C16674.f51186;
            bArr = str.getBytes(Charset.forName("Cp850"));
        } else {
            bArr = bArr2;
        }
        this.f21089 = bArr;
        if (str2 != null) {
            Charset charset2 = C16674.f51186;
            bArr2 = str2.getBytes(Charset.forName("Cp850"));
        }
        this.f21087 = bArr2;
        this.f21088 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18440(C12441 c12441) {
        c12441.m26089("NTLMSSP\u0000", C8208.f25224);
        c12441.m26088(1L);
        c12441.m26088(C15262.m36277(this.f76838));
        boolean z = this.f21088;
        int i = !z ? 40 : 32;
        boolean contains = this.f76838.contains(EnumC20909.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
        byte[] bArr = this.f21089;
        if (contains) {
            i = C15968.m37737(c12441, bArr, i);
        } else {
            c12441.m26086(0);
            c12441.m26086(0);
            c12441.m26088(0L);
        }
        boolean contains2 = this.f76838.contains(EnumC20909.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED);
        byte[] bArr2 = this.f21087;
        if (contains2) {
            C15968.m37737(c12441, bArr2, i);
        } else {
            c12441.m26086(0);
            c12441.m26086(0);
            c12441.m26088(0L);
        }
        if (!z && this.f76838.contains(EnumC20909.NTLMSSP_NEGOTIATE_VERSION)) {
            this.f76839.m44910(c12441);
        } else if (!z) {
            c12441.m26093(0L);
        }
        c12441.m26077(bArr.length, bArr);
        c12441.m26077(bArr2.length, bArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NtlmNegotiate{\n  domain='");
        Charset charset = C16674.f51186;
        byte[] bArr = this.f21089;
        sb.append(bArr != null ? new String(bArr, Charset.forName("Cp850")) : "");
        sb.append("'',\n  workstation='");
        byte[] bArr2 = this.f21087;
        sb.append(bArr2 != null ? new String(bArr2, Charset.forName("Cp850")) : "");
        sb.append("',\n  negotiateFlags=");
        sb.append(this.f76838);
        sb.append(",\n  version=");
        sb.append(this.f76839);
        sb.append("\n}");
        return sb.toString();
    }
}
