package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: 39IB */
/* renamed from: l.᩶۫ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20163 extends AbstractC3955 {
    @Override // l.AbstractC3955
    /* renamed from: ֫ */
    public final C3229 mo1923(AbstractC11716 abstractC11716, byte[] bArr) {
        if (abstractC11716.m28613()) {
            try {
                C8894 c8894 = new C8894(this.f12580, bArr);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte b = 0;
                    while (c8894.available() > 0) {
                        AbstractC11716 m22971 = c8894.m22971();
                        Object[] objArr = {m22971};
                        if (!(m22971.m28612() == abstractC11716.m28612())) {
                            throw new IllegalStateException(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                        }
                        byte[] m22969 = c8894.m22969(c8894.m22970());
                        byteArrayOutputStream.write(m22969, 1, m22969.length - 1);
                        if (c8894.available() <= 0) {
                            b = m22969[0];
                        }
                    }
                    C3229 c3229 = new C3229(abstractC11716, byteArrayOutputStream.toByteArray(), b);
                    c8894.close();
                    return c3229;
                } finally {
                }
            } catch (IOException e) {
                throw new C2544(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
            }
        }
        return new C3229(abstractC11716, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
    }
}
