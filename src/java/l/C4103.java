package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

/* compiled from: A774 */
/* renamed from: l.ۘᩳۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4103 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f13037;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f13038;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f13039;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f13040;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f13041;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f13042;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f13043;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f13044;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f13045;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f13046;

    public C4103(int i, String str, byte[] bArr, byte[] bArr2, String str2, String str3, byte[] bArr3, String str4, String str5) {
        this.f13041 = i;
        this.f13039 = str;
        this.f13045 = str4;
        this.f13040 = str5;
        this.f13046 = Arrays.copyOf(bArr, bArr.length);
        this.f13038 = C14460.m34531(bArr);
        this.f13043 = str2;
        this.f13044 = str3;
        this.f13037 = Arrays.copyOf(bArr2, bArr2.length);
        this.f13042 = Arrays.copyOf(bArr3, bArr3.length);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4103 m12325(int i, String str, String str2, String str3, byte[] bArr) {
        return new C4103(i, str, m12323(i, str), C14460.m34534().digest(bArr), str2, str3, bArr, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4103 m12319(int i, String str, String str2, String str3, byte[] bArr) {
        return new C4103(i, str, m12323(i, str), C14460.m34534().digest(bArr), "missing", C23816.m52500(bArr), bArr, str2, str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4103 m12327(String str, byte[] bArr, String str2) {
        return new C4103(this.f13041, this.f13039, this.f13046, C14460.m34534().digest(bArr), str, str2, bArr, this.f13045, this.f13040);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12329() {
        return this.f13045 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4103 m12326(AbstractC15440 abstractC15440) {
        String str;
        String str2;
        String name = abstractC15440.getName();
        if (!m12322(name)) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Invalid resource patch file name.");
        }
        try {
            byte[] m36506 = abstractC15440.m36506();
            C12951 c12951 = new C12951(m36506);
            if (c12951.readInt() != 1297240144) {
                throw new IOException("Unsupported resource patch format");
            }
            int readInt = c12951.readInt();
            if (readInt != 1 && readInt != 2) {
                throw new IOException("Unsupported resource patch format");
            }
            int readInt2 = c12951.readInt();
            String m31506 = c12951.m31506();
            if (readInt < 2 || !c12951.m31498()) {
                str = null;
                str2 = null;
            } else {
                String m31504 = c12951.m31504();
                String m315042 = c12951.m31504();
                if (m31504.isEmpty() || m315042.isEmpty()) {
                    throw new IOException("Invalid resource patch identity");
                }
                str = m31504;
                str2 = m315042;
            }
            String m315062 = c12951.m31506();
            String m315063 = c12951.m31506();
            byte[] bArr = new byte[32];
            c12951.m31489(32, bArr);
            int readInt3 = c12951.readInt();
            if (readInt3 < 0 || readInt3 > c12951.available() - 4) {
                throw new IOException("Invalid resource patch payload length");
            }
            byte[] bArr2 = new byte[readInt3];
            c12951.m31489(readInt3, bArr2);
            int readInt4 = c12951.readInt();
            if (c12951.available() != 0) {
                throw new IOException("Trailing resource patch bytes");
            }
            CRC32 crc32 = new CRC32();
            byte[] bArr3 = readInt == 1 ? bArr2 : m36506;
            if (readInt != 1) {
                readInt3 = m36506.length - 4;
            }
            crc32.update(bArr3, 0, readInt3);
            if (((int) crc32.getValue()) != readInt4) {
                throw new IOException("Resource patch CRC mismatch");
            }
            if (!Arrays.equals(bArr, C14460.m34534().digest(bArr2))) {
                throw new IOException("Resource patch entry hash mismatch");
            }
            String m52500 = C23816.m52500(bArr2);
            if (!m52500.equals(m315063) && !"sha256:".concat(C14460.m34531(bArr)).equals(m315063) && (m315063.length() != 40 || !C14460.m34531(C14460.m34532().digest(bArr2)).equals(m315063))) {
                throw new IOException("Resource patch targetVersion mismatch");
            }
            byte[] m12323 = m12323(readInt2, m31506);
            if (!name.equals(C14460.m34531(m12323).concat(".bin"))) {
                throw new IOException("Resource patch target hash mismatch");
            }
            return new C4103(readInt2, m31506, m12323, bArr, m315062, m52500, bArr2, str, str2);
        } catch (Exception e) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12328(AbstractC15440 abstractC15440) {
        AbstractC15440 m12320 = m12320(abstractC15440, this.f13038);
        m12320.mo35195();
        AbstractC15440 m36520 = m12320.m36520(".resource_patch");
        try {
            OutputStream mo23555 = m36520.mo23555(false);
            try {
                m12321(mo23555);
                mo23555.close();
                m36520.m36501(m12320, false, true, null);
            } finally {
            }
        } finally {
            if (m36520.mo23120()) {
                m36520.mo23552();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m12320(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526(str + ".bin");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m12322(String str) {
        if (str == null || str.length() != 68 || !str.endsWith(".bin")) {
            return false;
        }
        for (int i = 0; i < 64; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12323(int i, String str) {
        C10130 c10130 = new C10130(64);
        c10130.writeInt(1);
        c10130.writeInt(i);
        c10130.m25439(str);
        return c10130.m25426(C14460.m34534());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12324(ArrayList arrayList, byte[] bArr) {
        ArrayList m12318 = m12318(arrayList);
        C10130 c10130 = new C10130((m12318.size() * 64) + 64);
        c10130.writeInt(2);
        c10130.write(bArr, 0, bArr.length);
        c10130.writeInt(m12318.size());
        Iterator it = m12318.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            c10130.write(c4103.f13046);
            c10130.write(c4103.f13037);
            c10130.m25425(c4103.m12329());
            if (c4103.m12329()) {
                c10130.m25423((CharSequence) c4103.f13045);
                c10130.m25423((CharSequence) c4103.f13040);
            }
            c10130.m25439(c4103.f13044);
        }
        return c10130.m25426(C14460.m34534());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m12318(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        C6083.sort(arrayList2, C8200.comparing(new C5851(4)));
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12321(OutputStream outputStream) {
        C10130 c10130 = new C10130(96);
        c10130.writeInt(1297240144);
        c10130.writeInt(2);
        c10130.writeInt(this.f13041);
        c10130.m25439(this.f13039);
        c10130.m25425(m12329());
        if (m12329()) {
            c10130.m25423((CharSequence) this.f13045);
            c10130.m25423((CharSequence) this.f13040);
        }
        c10130.m25439(this.f13043);
        c10130.m25439(this.f13044);
        c10130.write(this.f13037);
        byte[] bArr = this.f13042;
        c10130.writeInt(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(c10130.m25438(), 0, c10130.size());
        crc32.update(bArr, 0, bArr.length);
        c10130.m25421(outputStream);
        outputStream.write(bArr);
        c10130.m25440();
        c10130.writeInt((int) crc32.getValue());
        c10130.m25421(outputStream);
    }
}
