package l;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;

/* compiled from: S9JY */
/* renamed from: l.۠۫ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8168 extends AbstractC3955 {
    @Override // l.AbstractC3955
    /* renamed from: ֫ */
    public final AbstractC5366 mo1923(AbstractC11716 abstractC11716, byte[] bArr) {
        int read;
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("An ASN.1 OBJECT IDENTIFIER should have at least a one byte value");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        StringBuilder sb = new StringBuilder();
        int read2 = byteArrayInputStream.read();
        sb.append(read2 / 40);
        sb.append('.');
        sb.append(read2 % 40);
        while (byteArrayInputStream.available() > 0) {
            int read3 = byteArrayInputStream.read();
            if (read3 < 127) {
                sb.append('.');
                sb.append(read3);
            } else {
                BigInteger valueOf = BigInteger.valueOf(read3 & 127);
                do {
                    read = byteArrayInputStream.read();
                    valueOf = valueOf.shiftLeft(7).add(BigInteger.valueOf(read & 127));
                } while (read > 127);
                sb.append('.');
                sb.append(valueOf);
            }
        }
        return new C21574(bArr, sb.toString());
    }
}
