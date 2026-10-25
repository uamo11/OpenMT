package l;

/* compiled from: S5QZ */
/* renamed from: l.ۘ᩹ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4226 {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        throw new java.io.UTFDataFormatException("bad second or third byte");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m12728(java.nio.ByteBuffer r5, java.lang.StringBuilder r6) {
        /*
        L0:
            byte r0 = r5.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            if (r0 != 0) goto Le
            java.lang.String r5 = r6.toString()
            return r5
        Le:
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L16
            r6.append(r0)
            goto L0
        L16:
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r3 = 192(0xc0, float:2.69E-43)
            if (r2 != r3) goto L38
            byte r2 = r5.get()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 != r1) goto L30
            r0 = r0 & 31
            int r0 = r0 << 6
            r1 = r2 & 63
            r0 = r0 | r1
            char r0 = (char) r0
            r6.append(r0)
            goto L0
        L30:
            java.io.UTFDataFormatException r5 = new java.io.UTFDataFormatException
            java.lang.String r6 = "bad second byte"
            r5.<init>(r6)
            throw r5
        L38:
            r2 = r0 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r2 != r3) goto L67
            byte r2 = r5.get()
            byte r3 = r5.get()
            r4 = r2 & 192(0xc0, float:2.69E-43)
            if (r4 != r1) goto L5f
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r1) goto L5f
            r0 = r0 & 15
            int r0 = r0 << 12
            r1 = r2 & 63
            int r1 = r1 << 6
            r0 = r0 | r1
            r1 = r3 & 63
            r0 = r0 | r1
            char r0 = (char) r0
            r6.append(r0)
            goto L0
        L5f:
            java.io.UTFDataFormatException r5 = new java.io.UTFDataFormatException
            java.lang.String r6 = "bad second or third byte"
            r5.<init>(r6)
            throw r5
        L67:
            java.io.UTFDataFormatException r5 = new java.io.UTFDataFormatException
            java.lang.String r6 = "bad byte"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4226.m12728(java.nio.ByteBuffer, java.lang.StringBuilder):java.lang.String");
    }
}
