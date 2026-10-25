package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: 46SG */
/* renamed from: l.ᩴ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18992 {
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C2764 m43828(l.InterfaceC20758 r9, byte[] r10, l.C1143 r11, l.C21339 r12) {
        /*
            int r0 = r10.length
            r1 = 32
            if (r0 != r1) goto La3
            java.lang.Object r10 = r10.clone()
            byte[] r10 = (byte[]) r10
            l.᩷۠ᩴ r9 = r9.toAbsolutePath()
            l.۟ۙᩳ r0 = l.C7247.m19378(r9)
            r1 = 0
            boolean r2 = r0.m19392()     // Catch: java.lang.Throwable -> L98
            java.util.UUID r10 = m43826(r9, r10, r2)     // Catch: java.lang.Throwable -> L98
            boolean r2 = r0.m19392()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L8c
            l.᩺ۙᩳ r2 = r0.m19384(r11, r10)     // Catch: java.lang.Throwable -> L98
            l.᩸۬ᩳ r3 = r2.f73520     // Catch: java.lang.Throwable -> L82
            l.ۘ᩶ᩳ r4 = new l.ۘ᩶ᩳ     // Catch: java.lang.Throwable -> L82
            r4.<init>(r3, r9)     // Catch: java.lang.Throwable -> L82
            r12.m48374(r4)     // Catch: java.lang.Throwable -> L78
            l.C4175.m12617(r4)     // Catch: java.lang.Throwable -> L78
            l.۫᩹ᩳ r12 = new l.۫᩹ᩳ     // Catch: java.lang.Throwable -> L78
            l.ۨ᩹ᩳ r5 = l.C4175.m12616(r4)     // Catch: java.lang.Throwable -> L78
            r6 = 0
            r12.<init>(r5, r6)     // Catch: java.lang.Throwable -> L78
            l.ۡۗᩳ r5 = new l.ۡۗᩳ     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L6e
            l.ۖۗᩳ r3 = l.C4175.m12615(r4)     // Catch: java.lang.Throwable -> L6e
            byte[] r3 = r3.m7496()     // Catch: java.lang.Throwable -> L6e
            l.ۖۙᩳ r8 = l.C4175.m12613(r4)     // Catch: java.lang.Throwable -> L6e
            r5.m22373(r12, r3, r8)     // Catch: java.lang.Throwable -> L6e
            r12.close()     // Catch: java.lang.Throwable -> L78
            l.ۖۗᩳ r12 = l.C4175.m12615(r4)     // Catch: java.lang.Throwable -> L78
            byte[] r12 = r12.m7496()     // Catch: java.lang.Throwable -> L78
            l.۫᩶ᩳ r12 = l.C12641.m30913(r12)     // Catch: java.lang.Throwable -> L78
            r12.m30918(r9, r11)     // Catch: java.lang.Throwable -> L78
            r0.m19387(r2, r6)     // Catch: java.lang.Throwable -> L78
            r4.close()     // Catch: java.lang.Throwable -> L82
            r2.close()     // Catch: java.lang.Throwable -> L98
            goto L8c
        L6e:
            r9 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L78
        L77:
            throw r9     // Catch: java.lang.Throwable -> L78
        L78:
            r9 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L82
        L81:
            throw r9     // Catch: java.lang.Throwable -> L82
        L82:
            r9 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L98
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L98
        L8c:
            l.ۖ᩶ᩳ r12 = new l.ۖ᩶ᩳ     // Catch: java.lang.Throwable -> L98
            r12.<init>(r9, r0, r10, r11)     // Catch: java.lang.Throwable -> L98
            l.C2764.m8523(r12)     // Catch: java.lang.Throwable -> L95
            return r12
        L95:
            r9 = move-exception
            r1 = r12
            goto L99
        L98:
            r9 = move-exception
        L99:
            if (r1 != 0) goto L9f
            r0.close()
            goto La2
        L9f:
            r1.close()
        La2:
            throw r9
        La3:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Migration identity must have 32 bytes"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18992.m43828(l.᩷۠ᩴ, byte[], l.֨۬ᩳ, l.᩸ۘᩳ):l.ۖ᩶ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static UUID m43826(InterfaceC20758 interfaceC20758, byte[] bArr, boolean z) {
        InterfaceC20758 resolve = interfaceC20758.resolve("migration.id");
        InterfaceC20758 resolve2 = interfaceC20758.resolve("migration.id.tmp");
        boolean exists = C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS);
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        if (exists) {
            UUID m43827 = m43827(m43830(resolve), bArr);
            FileChannel open = C12084.open(resolve, EnumC3824.WRITE);
            try {
                open.force(true);
                open.close();
                interfaceC23015.mo28630(interfaceC20758);
                return m43827;
            } catch (Throwable th) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z) {
            throw new IOException("Existing recovery entry has no migration identity");
        }
        DirectoryStream newDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
        try {
            Iterator it = newDirectoryStream.iterator();
            while (it.hasNext()) {
                String interfaceC207582 = ((InterfaceC20758) it.next()).getFileName().toString();
                if (!interfaceC207582.equals("session.lock") && !interfaceC207582.equals("migration.id.tmp")) {
                    throw new IOException("Unidentified migration directory contains data");
                }
            }
            newDirectoryStream.close();
            EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
            if (C17229.exists(resolve2, enumC14406)) {
                if (!C17229.isRegularFile(resolve2, enumC14406)) {
                    throw new IOException("Migration identity temporary is not a regular file");
                }
                if (C17229.size(resolve2) == 64) {
                    byte[] m43830 = m43830(resolve2);
                    if (m43829(m43830)) {
                        m43827(m43830, bArr);
                    }
                }
                interfaceC23015.mo28633(resolve2);
                interfaceC23015.mo28630(interfaceC20758);
            }
            UUID randomUUID = UUID.randomUUID();
            C10130 c10130 = new C10130(64);
            c10130.writeInt(1295139913);
            c10130.writeInt(1);
            c10130.m25431(randomUUID.getMostSignificantBits());
            c10130.m25431(randomUUID.getLeastSignificantBits());
            c10130.write(bArr, 0, bArr.length);
            c10130.writeInt(0);
            c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
            interfaceC23015.mo28632(resolve2, c10130.m25444());
            interfaceC23015.mo28631(resolve2, resolve);
            interfaceC23015.mo28630(interfaceC20758);
            return randomUUID;
        } catch (Throwable th3) {
            if (newDirectoryStream != null) {
                try {
                    newDirectoryStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m43830(InterfaceC20758 interfaceC20758) {
        int i = 0;
        if (!C17229.isRegularFile(interfaceC20758, EnumC14406.NOFOLLOW_LINKS) || C17229.size(interfaceC20758) != 64) {
            throw new IOException("Invalid migration identity file");
        }
        InputStream newInputStream = C17229.newInputStream(interfaceC20758, new InterfaceC23579[0]);
        try {
            byte[] bArr = new byte[64];
            while (i < 64) {
                int read = newInputStream.read(bArr, i, 64 - i);
                if (read <= 0) {
                    throw new IOException("Migration identity read made no progress");
                }
                i += read;
            }
            if (newInputStream.read() != -1) {
                throw new IOException("Migration identity changed during reading");
            }
            newInputStream.close();
            return bArr;
        } catch (Throwable th) {
            if (newInputStream != null) {
                try {
                    newInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43829(byte[] bArr) {
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() == 1295139913 && c12951.readInt() == 1) {
            c12951.seek(56L);
            if (c12951.readInt() == 0 && c12951.readInt() == C1829.m6061(0, 60, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static UUID m43827(byte[] bArr, byte[] bArr2) {
        if (!m43829(bArr)) {
            throw new IOException("Invalid migration identity format or checksum");
        }
        C12951 c12951 = new C12951(bArr);
        c12951.seek(8L);
        UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
        byte[] bArr3 = new byte[32];
        c12951.m31489(32, bArr3);
        if (Arrays.equals(bArr2, bArr3)) {
            return uuid;
        }
        throw new IOException("Migration belongs to a different legacy source");
    }
}
