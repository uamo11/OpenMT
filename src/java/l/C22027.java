package l;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

/* compiled from: B784 */
/* renamed from: l.᩹ۗ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22027 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21322 m49560(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C6083.sort(arrayList, C8200.comparing(new C7915(0)));
        C6083.sort(arrayList2, new C14970());
        C10130 c10130 = new C10130(256);
        c10130.writeInt(1095784516);
        c10130.writeInt(1);
        c10130.writeInt(2);
        c10130.m25439(str);
        c10130.m25439(str2);
        c10130.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2362 c2362 = (C2362) it.next();
            c10130.m25439(c2362.f7550);
            c10130.m25439(c2362.f7552);
        }
        c10130.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c10130.m25439((String) it2.next());
        }
        return new C21322(str, c10130.m25426(C14460.m34534()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m49563(AbstractC15440 abstractC15440, C21322 c21322) {
        String str = c21322.f68712;
        MessageDigest m34534 = C14460.m34534();
        Charset charset = StandardCharsets.UTF_8;
        AbstractC15440 m36526 = abstractC15440.m36526(C14460.m34531(m34534.digest(str.getBytes(charset))).concat(".bin"));
        if (!m36526.mo23119()) {
            return null;
        }
        int length = str.getBytes(charset).length + 45;
        try {
            DataInputStream dataInputStream = new DataInputStream(m36526.mo27926());
            try {
                long mo23127 = m36526.mo23127();
                byte[] bArr = new byte[length];
                dataInputStream.readFully(bArr);
                C12951 c12951 = new C12951(bArr);
                if (c12951.readInt() == 1095784516 && c12951.readInt() == 1) {
                    String m31506 = c12951.m31506();
                    byte[] bArr2 = new byte[32];
                    c12951.m31489(32, bArr2);
                    int readInt = c12951.readInt();
                    if (str.equals(m31506) && Arrays.equals(c21322.f68713, bArr2) && readInt >= 0 && readInt == (mo23127 - length) - 4) {
                        byte[] bArr3 = new byte[readInt];
                        dataInputStream.readFully(bArr3);
                        byte[] bArr4 = new byte[4];
                        dataInputStream.readFully(bArr4);
                        int readInt2 = new C12951(bArr4).readInt();
                        if (dataInputStream.read() == -1) {
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                dataInputStream.close();
                                return bArr3;
                            }
                        }
                    }
                }
                dataInputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        if (!m36526.mo23120()) {
            return null;
        }
        m36526.mo23552();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49562(AbstractC15440 abstractC15440, C21322 c21322, byte[] bArr) {
        AbstractC15440 m36526 = abstractC15440.m36526(C14460.m34531(C14460.m34534().digest(c21322.f68712.getBytes(StandardCharsets.UTF_8))).concat(".bin"));
        m36526.mo35195();
        AbstractC15440 m36520 = m36526.m36520(".dex_build");
        try {
            OutputStream mo23555 = m36520.mo23555(false);
            try {
                m49561(mo23555, c21322, bArr);
                mo23555.close();
                m36520.m36501(m36526, false, true, null);
            } finally {
            }
        } finally {
            if (m36520.mo23120()) {
                m36520.mo23552();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49561(OutputStream outputStream, C21322 c21322, byte[] bArr) {
        C10130 c10130 = new C10130(96);
        c10130.writeInt(1095784516);
        c10130.writeInt(1);
        c10130.m25439(c21322.f68712);
        c10130.write(c21322.f68713);
        c10130.writeInt(bArr.length);
        c10130.m25421(outputStream);
        outputStream.write(bArr);
        c10130.m25440();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        c10130.writeInt((int) crc32.getValue());
        c10130.m25421(outputStream);
    }
}
