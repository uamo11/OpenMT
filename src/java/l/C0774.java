package l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* compiled from: WA0T */
/* renamed from: l.֨֡᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0774 extends AbstractC5008 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f2873;

    public C0774(InterfaceC18663 interfaceC18663, int i, String str) {
        m14499((((C13722) interfaceC18663.mo27540()).m32988() ? 1 : 2) | 33554944 | i);
        this.f2873 = str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m2957() {
        int i;
        try {
            int m14496 = m14496();
            int i2 = m14496 & 33554432;
            int i3 = 32;
            int i4 = (i2 != 0 ? 8 : 0) + 32;
            byte[] bArr = new byte[0];
            String str = this.f2873;
            if (i2 != 0 || str == null || str.length() == 0) {
                i = m14496 & (-4097);
            } else {
                i = m14496 | 4096;
                bArr = str.toUpperCase().getBytes("Cp850");
                i4 += bArr.length;
            }
            byte[] bArr2 = new byte[0];
            byte[] bArr3 = new byte[i4];
            System.arraycopy(AbstractC5008.f15779, 0, bArr3, 0, 8);
            AbstractC5008.m14493(8, 1, bArr3);
            AbstractC5008.m14493(12, i & (-8193), bArr3);
            int m14492 = AbstractC5008.m14492(16, bArr3, bArr);
            int m144922 = AbstractC5008.m14492(24, bArr3, bArr2);
            if ((i & 33554432) != 0) {
                System.arraycopy(AbstractC5008.f15780, 0, bArr3, 32, 8);
                i3 = 40;
            }
            AbstractC5008.m14491(i3 + AbstractC5008.m14491(i3, m14492, bArr3, bArr), m144922, bArr3, bArr2);
            return bArr3;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        String str = this.f2873;
        if (str == null) {
            str = "null";
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, ",suppliedWorkstation=", "null", ",flags=0x");
        sb.append(C12085.m29467(m14496(), 8));
        sb.append("]");
        return sb.toString();
    }
}
