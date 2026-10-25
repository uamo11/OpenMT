package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: L764 */
/* renamed from: l.ۨ۟᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11567 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34508;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34509;

    public C11567(int i, int i2) {
        this.f34509 = i;
        this.f34508 = i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11567 m28457(String str) {
        int i;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    if (randomAccessFile.length() < 20) {
                        throw m28455();
                    }
                    byte[] m28454 = m28454(randomAccessFile);
                    int i2 = m28454[4] & 255;
                    if (i2 == 1) {
                        i = 32;
                    } else {
                        if (i2 != 2) {
                            throw m28455();
                        }
                        i = 64;
                    }
                    if ((m28454[5] & 255) != 1) {
                        throw m28455();
                    }
                    randomAccessFile.seek(18L);
                    int readUnsignedByte = randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8);
                    if (readUnsignedByte != 40 && readUnsignedByte != 183 && readUnsignedByte != 3 && readUnsignedByte != 62) {
                        throw C3059.m9368("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    if (((readUnsignedByte != 40 && readUnsignedByte != 3) || i != 32) && ((readUnsignedByte != 183 && readUnsignedByte != 62) || i != 64)) {
                        throw C3059.m9368("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    C11567 c11567 = new C11567(readUnsignedByte, i);
                    randomAccessFile.close();
                    return c11567;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m28455();
            }
        } catch (C3059 e) {
            throw e;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m28456(String str) {
        char c;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    byte[] m28454 = m28454(randomAccessFile);
                    int i = m28454[4] & 255;
                    if (i == 1) {
                        c = ' ';
                    } else {
                        if (i != 2) {
                            throw m28455();
                        }
                        c = '@';
                    }
                    int i2 = m28454[5] & 255;
                    if ((i2 != 1 && i2 != 2) || (m28454[6] & 255) != 1) {
                        throw m28455();
                    }
                    int i3 = c == ' ' ? 52 : 64;
                    int i4 = c == ' ' ? 40 : 52;
                    if (randomAccessFile.length() < i3) {
                        throw m28455();
                    }
                    randomAccessFile.seek(i4);
                    int readUnsignedByte = randomAccessFile.readUnsignedByte();
                    int readUnsignedByte2 = randomAccessFile.readUnsignedByte();
                    if (i2 == 2) {
                        readUnsignedByte <<= 8;
                    } else {
                        readUnsignedByte2 <<= 8;
                    }
                    if ((readUnsignedByte | readUnsignedByte2) != i3) {
                        throw m28455();
                    }
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m28455();
            }
        } catch (C3059 e) {
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m28454(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 16) {
            throw m28455();
        }
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
            return bArr;
        }
        throw m28455();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28459() {
        int i = this.f34509;
        return (i == 3 || i == 62) ? "x86" : "arm";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28458(String str) {
        int i = this.f34509;
        if (i == 40) {
            return "thumb".equals(str) ? 16 : 32;
        }
        if (i == 183 || i == 62) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        return this.f34508;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28460(String str) {
        int i = this.f34509;
        return i == 40 ? "thumb".equals(str) ? "thumb" : "arm" : i == 183 ? "aarch64" : i == 62 ? "x86_64" : "x86";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m28461(String str) {
        int i = this.f34509;
        return i == 40 ? "thumb".equals(str) ? "mixed16_32" : "fixed32" : i == 183 ? "fixed32" : "variable";
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m28455() {
        return C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an Android little-endian ELF file.");
    }
}
