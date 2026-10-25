package l;

import com.alipay.sdk.m.y.l;

/* compiled from: X8H6 */
/* renamed from: l.ۢۛۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9398 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f28533;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f28534;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f28535;

    public C9398(String str, byte[] bArr, String str2) {
        this.f28535 = str;
        this.f28533 = str2;
        this.f28534 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9398)) {
            return false;
        }
        C9398 c9398 = (C9398) obj;
        return C11003.equals(this.f28535, c9398.f28535) && C11003.equals(this.f28533, c9398.f28533) && C11003.equals(this.f28534, c9398.f28534);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f28534) + C20361.m46680(C11003.hashCode(this.f28535) * 31, 31, this.f28533);
    }

    public final String toString() {
        Object[] objArr = {this.f28535, this.f28533, this.f28534};
        String[] split = "title;author;image".length() == 0 ? new String[0] : "title;author;image".split(l.b);
        StringBuilder sb = new StringBuilder("WavID3Info[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24231() {
        return this.f28533;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m24232() {
        return this.f28534;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m24233() {
        return this.f28535;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r11.readInt() & 16777215) == 3359817) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r11.skipBytes(2);
        r11 = r11.m51861(r11.m51856(), ((((r11.readByte() & com.google.android.material.color.ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21) | ((r11.readByte() & com.google.android.material.color.ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14)) | ((r11.readByte() & com.google.android.material.color.ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7)) | (r11.readByte() & com.google.android.material.color.ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
        r1 = null;
        r3 = null;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r11.available() <= 10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        r5 = r11.readInt();
        r6 = java.lang.Integer.reverseBytes(r11.readInt());
        r11.skipBytes(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r5 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r5 != 1128878145) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r5 != 844384596) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r5 != 826626132) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r5 != 843403348) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r4 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        r11.skipBytes(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r4 = new byte[r6];
        r11.m51858(r4, 0, r6);
        r4 = m24230(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        r4 = new byte[r6];
        r11.m51858(r4, 0, r6);
        r4 = m24230(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r3 = new byte[r6];
        r11.m51858(r3, 0, r6);
        r3 = m24230(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        r9 = r11.getFilePointer() + r6;
        r11.skipBytes(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
    
        if (r11.readByte() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ab, code lost:
    
        r11.skipBytes(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        if (r11.readByte() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b5, code lost:
    
        r5 = (int) (r9 - r11.getFilePointer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
    
        if (r5 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        r1 = new byte[r5];
        r11.m51858(r1, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        return new l.C9398(r3, r1, r4);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9398 m24229(l.C23411 r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9398.m24229(l.᩻ۖܽ):l.ۢۛۜ");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m24230(byte[] r6) {
        /*
            int r0 = r6.length
            r1 = 1
            if (r0 >= r1) goto L6
            r6 = 0
            return r6
        L6:
            r0 = 0
            r0 = r6[r0]
            r2 = 2
            if (r0 == r1) goto L1a
            if (r0 == r2) goto L17
            r2 = 3
            if (r0 == r2) goto L14
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            goto L1c
        L14:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            goto L1c
        L17:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L1c
        L1a:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
        L1c:
            r2 = 1
        L1d:
            int r3 = r6.length
            if (r2 >= r3) goto L3e
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16
            if (r0 != r3) goto L32
            int r4 = r2 + 1
            int r5 = r6.length
            if (r4 >= r5) goto L37
            r5 = r6[r2]
            if (r5 != 0) goto L37
            r4 = r6[r4]
            if (r4 != 0) goto L37
            goto L3e
        L32:
            r4 = r6[r2]
            if (r4 != 0) goto L37
            goto L3e
        L37:
            if (r0 != r3) goto L3b
            r3 = 2
            goto L3c
        L3b:
            r3 = 1
        L3c:
            int r2 = r2 + r3
            goto L1d
        L3e:
            java.lang.String r3 = new java.lang.String
            int r2 = r2 - r1
            r3.<init>(r6, r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9398.m24230(byte[]):java.lang.String");
    }
}
