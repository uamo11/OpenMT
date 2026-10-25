package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: X6S5 */
/* renamed from: l.ۛ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6291 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12641 m17329(InterfaceC20758 interfaceC20758, UUID uuid, InputStream inputStream, long j, C1143 c1143, InterfaceC23015 interfaceC23015) {
        long j2 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("Invalid migration state length");
        }
        C5377 m3921 = c1143.m3921(16384L);
        try {
            int i = 0;
            FileChannel open = C12084.open(interfaceC20758.resolve("migration-state.bin"), EnumC3824.CREATE_NEW, EnumC3824.WRITE);
            try {
                C10130 c10130 = new C10130(32);
                c10130.writeInt(1295143764);
                c10130.writeInt(1);
                c10130.m25431(uuid.getMostSignificantBits());
                c10130.m25431(uuid.getLeastSignificantBits());
                c10130.m25431(j);
                ByteBuffer wrap = ByteBuffer.wrap(c10130.m25438(), 0, c10130.size());
                do {
                    String str = "Migration state write made no progress";
                    if (!wrap.hasRemaining()) {
                        int i2 = 8192;
                        byte[] bArr = new byte[8192];
                        MessageDigest m34534 = C14460.m34534();
                        long j3 = j;
                        while (j3 != j2) {
                            int read = inputStream.read(bArr, i, (int) Math.min(j3, i2));
                            if (read > 0) {
                                String str2 = str;
                                long j4 = read;
                                if (j4 <= j3) {
                                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, 0, read);
                                    while (wrap2.hasRemaining()) {
                                        if (open.write(wrap2) <= 0) {
                                            throw new IOException(str2);
                                        }
                                    }
                                    m34534.update(bArr, 0, read);
                                    j3 -= j4;
                                    j2 = 0;
                                    str = str2;
                                    i2 = 8192;
                                    i = 0;
                                }
                            }
                            throw new EOFException("Truncated or stalled migration state input");
                        }
                        if (inputStream.read() != -1) {
                            throw new IOException("Trailing bytes in migration state input");
                        }
                        interfaceC23015.mo28629(open);
                        interfaceC23015.mo28630(interfaceC20758);
                        C12641 c12641 = new C12641(uuid, j, m34534.digest(), new byte[0]);
                        open.close();
                        m3921.close();
                        return c12641;
                    }
                } while (open.write(wrap) > 0);
                throw new IOException("Migration state write made no progress");
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m17328(InterfaceC20758 interfaceC20758, C12641 c12641, C1143 c1143, InterfaceC23015 interfaceC23015) {
        InterfaceC20758 resolve = interfaceC20758.resolve("migration-state.bin");
        if (!C17229.isRegularFile(resolve, EnumC14406.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state is not a regular file");
        }
        FileChannel open = interfaceC23015 == null ? C12084.open(resolve, EnumC3824.READ) : C12084.open(resolve, EnumC3824.READ, EnumC3824.WRITE);
        try {
            C5377 m3921 = c1143.m3921(16384L);
            try {
                long size = open.size();
                long j = c12641.f38086;
                if (size != j + 32) {
                    throw new IOException("Migration state length does not match commit");
                }
                int i = 8192;
                byte[] bArr = new byte[8192];
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 32);
                do {
                    if (!wrap.hasRemaining()) {
                        C12951 c12951 = new C12951(bArr);
                        if (c12951.readInt() != 1295143764 || c12951.readInt() != 1 || !new UUID(c12951.readLong(), c12951.readLong()).equals(c12641.f38084) || c12951.readLong() != j) {
                            throw new IOException("Migration state identity does not match commit");
                        }
                        MessageDigest m34534 = C14460.m34534();
                        long j2 = j;
                        while (j2 != 0) {
                            int min = (int) Math.min(j2, i);
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr, 0, min);
                            while (wrap2.hasRemaining()) {
                                if (open.read(wrap2) <= 0) {
                                    throw new EOFException("Truncated migration state file");
                                }
                            }
                            m34534.update(bArr, 0, min);
                            j2 -= min;
                            i = 8192;
                        }
                        if (!Arrays.equals(c12641.f38085, m34534.digest()) || open.size() != j + 32) {
                            throw new IOException("Migration state checksum does not match commit");
                        }
                        if (interfaceC23015 != null) {
                            interfaceC23015.mo28629(open);
                        }
                        m3921.close();
                        open.position(32L);
                        return new C10525(c12641, open);
                    }
                } while (open.read(wrap) > 0);
                throw new EOFException("Truncated migration state file");
            } finally {
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }
}
