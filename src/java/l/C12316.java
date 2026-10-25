package l;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* compiled from: U7IN */
/* renamed from: l.۫ۢ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12316 {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        return false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m29873(java.nio.channels.ReadableByteChannel r8, java.nio.channels.ReadableByteChannel r9) {
        /*
            boolean r0 = l.C11003.equals(r8, r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L17:
            if (r3 != 0) goto L29
            int r4 = m29872(r8, r1)
            r1.clear()
            if (r4 != 0) goto L26
            r5 = 1
            r5 = r4
            r4 = 1
            goto L29
        L26:
            r5 = 0
            r5 = r4
            r4 = 0
        L29:
            if (r4 != 0) goto L3b
            int r3 = m29872(r9, r0)
            r0.clear()
            if (r3 != 0) goto L38
            r6 = 1
            r6 = r3
            r3 = 1
            goto L3b
        L38:
            r6 = 0
            r6 = r3
            r3 = 0
        L3b:
            r7 = -1
            if (r5 != r7) goto L45
            if (r6 != r7) goto L45
            boolean r8 = r1.equals(r0)
            return r8
        L45:
            if (r5 == 0) goto L54
            if (r6 != 0) goto L4a
            goto L54
        L4a:
            if (r5 == r6) goto L4d
            goto L53
        L4d:
            boolean r7 = r1.equals(r0)
            if (r7 != 0) goto L17
        L53:
            return r2
        L54:
            java.lang.Thread.yield()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12316.m29873(java.nio.channels.ReadableByteChannel, java.nio.channels.ReadableByteChannel):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29872(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int read;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        while (byteBuffer.hasRemaining() && (read = readableByteChannel.read(byteBuffer)) != -1) {
            if (read == 0) {
                Thread.yield();
            } else {
                i += read;
            }
        }
        if (i != 0) {
            return i;
        }
        return -1;
    }
}
