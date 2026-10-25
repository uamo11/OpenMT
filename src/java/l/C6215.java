package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* compiled from: JB0Y */
/* renamed from: l.ۛᩳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6215 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6900 m17128(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        C12565 c12565 = new C12565(duplicate);
        c12565.m30799(4);
        int m30802 = c12565.m30802();
        if (m30802 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        c12565.m30799(6);
        int i = 0;
        while (true) {
            if (i >= m30802) {
                j = -1;
                break;
            }
            int m30800 = c12565.m30800();
            c12565.m30799(4);
            j = c12565.m30801();
            c12565.m30799(4);
            if (1835365473 == m30800) {
                break;
            }
            i++;
        }
        if (j != -1) {
            c12565.m30799((int) (j - c12565.m30798()));
            c12565.m30799(12);
            long m30801 = c12565.m30801();
            for (int i2 = 0; i2 < m30801; i2++) {
                int m308002 = c12565.m30800();
                long m308012 = c12565.m30801();
                c12565.m30801();
                if (1164798569 == m308002 || 1701669481 == m308002) {
                    duplicate.position((int) new C10449(m308012 + j).m26305());
                    return C6900.m18681(duplicate);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
