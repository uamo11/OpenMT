package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: W8OQ */
/* renamed from: l.᩹ۡۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22183 extends AbstractC15126 {
    @Override // l.AbstractC15126
    /* renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C16302 c16302 = new C16302(byteBuffer.array(), byteBuffer.limit());
            c16302.m38351(12);
            int m38348 = (c16302.m38348() + c16302.m38343(12)) - 4;
            c16302.m38351(44);
            c16302.m38347(c16302.m38343(12));
            c16302.m38351(16);
            ArrayList arrayList = new ArrayList();
            while (c16302.m38348() < m38348) {
                c16302.m38351(48);
                int m38343 = c16302.m38343(8);
                c16302.m38351(4);
                int m383482 = c16302.m38348() + c16302.m38343(12);
                String str = null;
                String str2 = null;
                while (c16302.m38348() < m383482) {
                    int m383432 = c16302.m38343(8);
                    int m383433 = c16302.m38343(8);
                    int m383483 = c16302.m38348() + m383433;
                    if (m383432 == 2) {
                        int m383434 = c16302.m38343(16);
                        c16302.m38351(8);
                        if (m383434 == 3) {
                            while (c16302.m38348() < m383483) {
                                int m383435 = c16302.m38343(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[m383435];
                                c16302.m38345(m383435, bArr);
                                str = new String(bArr, charset);
                                int m383436 = c16302.m38343(8);
                                for (int i = 0; i < m383436; i++) {
                                    c16302.m38347(c16302.m38343(8));
                                }
                            }
                        }
                    } else if (m383432 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[m383433];
                        c16302.m38345(m383433, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c16302.m38354(m383483 * 8);
                }
                c16302.m38354(m383482 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C21478(m38343, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C23896(arrayList);
            }
        }
        return null;
    }
}
