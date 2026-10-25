package l;

import java.io.IOException;
import java.util.HashMap;

/* compiled from: 99YC */
/* renamed from: l.۠֡᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7830 extends AbstractC5008 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f24230;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f24231;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f24232;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f24233;

    public C7830(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != AbstractC5008.f15779[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC5008.m14495(8, bArr) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int m14495 = AbstractC5008.m14495(20, bArr);
        m14499(m14495);
        byte[] m14494 = AbstractC5008.m14494(12, bArr);
        int m144952 = AbstractC5008.m14495(16, bArr);
        if (m14494.length != 0) {
            this.f24230 = new String(m14494, (m14495 & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        int i2 = 24;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            if (bArr[i2] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                this.f24232 = bArr2;
                break;
            }
            i2++;
        }
        if (m144952 < 40 || bArr.length < 40) {
            return;
        }
        int i3 = 32;
        while (true) {
            if (i3 >= 40) {
                break;
            }
            if (bArr[i3] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f24231 = bArr3;
                break;
            }
            i3++;
        }
        if (m144952 < 48 || bArr.length < 48) {
            return;
        }
        byte[] m144942 = AbstractC5008.m14494(40, bArr);
        if (m144942.length != 0) {
            this.f24233 = m144942;
        }
    }

    static {
        C11321.m27961(C7830.class);
        new HashMap();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m20928() {
        return this.f24232;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m20929() {
        return this.f24233;
    }

    public final String toString() {
        String m9831;
        String m98312;
        StringBuilder m9834 = C3200.m9834("Type2Message[target=", this.f24230, ",challenge=");
        String str = "null";
        byte[] bArr = this.f24232;
        if (bArr == null) {
            m9831 = "null";
        } else {
            m9831 = C3200.m9831(bArr.length, " bytes>", new StringBuilder("<"));
        }
        m9834.append(m9831);
        m9834.append(",context=");
        byte[] bArr2 = this.f24231;
        if (bArr2 == null) {
            m98312 = "null";
        } else {
            m98312 = C3200.m9831(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        m9834.append(m98312);
        m9834.append(",targetInformation=");
        byte[] bArr3 = this.f24233;
        if (bArr3 != null) {
            str = C3200.m9831(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        m9834.append(str);
        m9834.append(",flags=0x");
        m9834.append(C12085.m29467(m14496(), 8));
        m9834.append("]");
        return m9834.toString();
    }
}
