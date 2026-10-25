package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* compiled from: 56R4 */
/* renamed from: l.۬᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13346 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3469 m32320(C12951 c12951, InterfaceC7765 interfaceC7765) {
        if (c12951.m31500() == -131647720) {
            c12951.skipBytes(4);
            if (c12951.m31498()) {
                if (interfaceC7765 == null) {
                    interfaceC7765 = InterfaceC7765.f24007;
                }
                try {
                    C16168 m38102 = C16168.m38102(C6646.of(interfaceC7765.mo6269(c12951.m31504()).mo23554(), new String[0]), new C1143(1048576L));
                    try {
                        StringBuilder sb = new StringBuilder(m38102.length());
                        char[] cArr = new char[8192];
                        while (true) {
                            int read = m38102.read(cArr, 0, 8192);
                            if (read == -1) {
                                C3469 c3469 = new C3469(sb.toString(), m38102.m38106());
                                m38102.close();
                                return c3469;
                            }
                            sb.append(cArr, 0, read);
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        }
        String m31504 = c12951.m31504();
        C22519 c22519 = new C22519();
        int min = Math.min(8192, m31504.length());
        char[] cArr2 = new char[min];
        int i = 0;
        while (i < m31504.length()) {
            int min2 = Math.min(min, m31504.length() - i);
            int i2 = i + min2;
            m31504.getChars(i, i2, cArr2, 0);
            c22519.m50494(cArr2, min2);
            i = i2;
        }
        return new C3469(m31504, c22519.m50493(m31504.length()));
    }
}
