package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: B6RA */
/* renamed from: l.ۨۙᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11481 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f34289;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f34290;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID f34291;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID f34292;

    public C11481(UUID uuid, UUID uuid2, long j, byte[] bArr) {
        this.f34292 = uuid;
        this.f34291 = uuid2;
        this.f34290 = j;
        this.f34289 = bArr;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID m28306() {
        return this.f34292;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m28305() {
        return this.f34290;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m28304() {
        C10130 c10130 = new C10130(84);
        c10130.writeInt(843142226);
        c10130.writeInt(1);
        UUID uuid = this.f34292;
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        UUID uuid2 = this.f34291;
        c10130.m25431(uuid2.getMostSignificantBits());
        c10130.m25431(uuid2.getLeastSignificantBits());
        c10130.m25431(this.f34290);
        c10130.write(this.f34289);
        c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
        return c10130.m25444();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11481 m28298(byte[] bArr) {
        if (bArr.length == 84) {
            int m6061 = C1829.m6061(0, 80, bArr);
            C12951 c12951 = new C12951(bArr);
            c12951.seek(80);
            if (m6061 == c12951.readInt()) {
                C12951 c129512 = new C12951(bArr);
                if (c129512.readInt() != 843142226 || c129512.readInt() != 1) {
                    throw new IOException("Unsupported recovery attachment reference");
                }
                UUID uuid = new UUID(c129512.readLong(), c129512.readLong());
                UUID uuid2 = new UUID(c129512.readLong(), c129512.readLong());
                long readLong = c129512.readLong();
                if (readLong < 0 || readLong > 2147483647L) {
                    throw new IOException("Invalid recovery attachment length");
                }
                byte[] bArr2 = new byte[32];
                c129512.m31489(32, bArr2);
                return new C11481(uuid, uuid2, readLong, bArr2);
            }
        }
        throw new IOException("Invalid recovery attachment reference");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11481 m28297(l.InterfaceC20758 r16, java.util.UUID r17, java.io.ByteArrayInputStream r18, long r19, long r21, l.C1143 r23) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11481.m28297(l.᩷۠ᩴ, java.util.UUID, java.io.ByteArrayInputStream, long, long, l.֨۬ᩳ):l.ۨۙᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m28303(InterfaceC20758 interfaceC20758, UUID uuid, long j, C1143 c1143) {
        if (!this.f34292.equals(uuid)) {
            throw new IOException("Recovery attachment belongs to another session");
        }
        m28300(this.f34290, j);
        InterfaceC20758 m28299 = m28299(interfaceC20758, this.f34291);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(m28299, enumC14406)) {
            throw new IOException("Recovery attachment is not a regular file");
        }
        FileChannel open = C12084.open(m28299, EnumC3824.READ, enumC14406);
        try {
            C5377 m3921 = c1143.m3921(16384L);
            try {
                m28301(open, new byte[8192]);
                m3921.close();
                open.position(84L);
                return new C5836(this, open);
            } finally {
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28302(l.InterfaceC20758 r10, java.util.UUID r11, java.util.List r12) {
        /*
            l.᩺۬ᩳ r0 = l.InterfaceC23015.f74090
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        Lb:
            boolean r2 = r12.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L53
            java.lang.Object r2 = r12.next()
            l.ۨۙᩳ r2 = (l.C11481) r2
            java.util.UUID r5 = r2.f34292
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L4b
            java.util.UUID r2 = r2.f34291
            l.᩷۠ᩴ r2 = m28299(r10, r2)
            l.᩷۠ᩴ r2 = r2.getFileName()
            java.lang.String r2 = r2.toString()
            l.᩷۠ᩴ r5 = r10.resolve(r2)
            l.ܳ۠ᩴ[] r4 = new l.EnumC14406[r4]
            l.ܳ۠ᩴ r6 = l.EnumC14406.NOFOLLOW_LINKS
            r4[r3] = r6
            boolean r3 = l.C17229.isRegularFile(r5, r4)
            if (r3 == 0) goto L43
            r1.add(r2)
            goto Lb
        L43:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Live attachment is missing"
            r10.<init>(r11)
            throw r10
        L4b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Live attachment belongs to another session"
            r10.<init>(r11)
            throw r10
        L53:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto Le2
            java.lang.String r11 = "state-*.bin"
            java.nio.file.DirectoryStream r11 = l.C17229.newDirectoryStream(r10, r11)     // Catch: java.lang.Throwable -> Lda
            java.util.Iterator r12 = r11.iterator()     // Catch: java.lang.Throwable -> Lce
            r2 = 0
        L64:
            boolean r5 = r12.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r12.next()     // Catch: java.lang.Throwable -> Lcb
            l.᩷۠ᩴ r5 = (l.InterfaceC20758) r5     // Catch: java.lang.Throwable -> Lcb
            l.᩷۠ᩴ r6 = r5.getFileName()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r1.contains(r6)     // Catch: java.lang.Throwable -> Lcb
            if (r7 != 0) goto L64
            l.ܳ۠ᩴ[] r7 = new l.EnumC14406[r4]     // Catch: java.lang.Throwable -> Lcb
            l.ܳ۠ᩴ r8 = l.EnumC14406.NOFOLLOW_LINKS     // Catch: java.lang.Throwable -> Lcb
            r7[r3] = r8     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = l.C17229.isRegularFile(r5, r7)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L64
            int r7 = r6.length()     // Catch: java.lang.Throwable -> Lcb
            r8 = 46
            if (r7 == r8) goto L93
            goto L64
        L93:
            r7 = 6
            r8 = 42
            java.lang.String r7 = r6.substring(r7, r8)     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.Throwable -> Lcb
            java.util.UUID r7 = java.util.UUID.fromString(r7)     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.Throwable -> Lcb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r8.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r9 = "state-"
            r8.append(r9)     // Catch: java.lang.Throwable -> Lcb
            r8.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = ".bin"
            r8.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Lcb
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lcb
            if (r6 != 0) goto Lbb
            goto L64
        Lbb:
            l.C17229.delete(r5)     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            goto L64
        Lc0:
            r11.close()     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto Lc8
            r0.mo28630(r10)
        Lc8:
            return
        Lc9:
            r11 = move-exception
            goto Ldc
        Lcb:
            r12 = move-exception
            r3 = r2
            goto Lcf
        Lce:
            r12 = move-exception
        Lcf:
            if (r11 == 0) goto Ld9
            r11.close()     // Catch: java.lang.Throwable -> Ld5
            goto Ld9
        Ld5:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch: java.lang.Throwable -> Lda
        Ld9:
            throw r12     // Catch: java.lang.Throwable -> Lda
        Lda:
            r11 = move-exception
            r2 = r3
        Ldc:
            if (r2 == 0) goto Le1
            r0.mo28630(r10)
        Le1:
            throw r11
        Le2:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Attachment collection requires a durable live reference"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11481.m28302(l.᩷۠ᩴ, java.util.UUID, java.util.List):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28301(FileChannel fileChannel, byte[] bArr) {
        long size = fileChannel.size();
        long j = this.f34290;
        long j2 = 84 + j;
        if (size != j2) {
            throw new IOException("Recovery attachment length does not match reference");
        }
        fileChannel.position(0L);
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 84);
        while (wrap.hasRemaining()) {
            if (fileChannel.read(wrap) <= 0) {
                throw new EOFException("Truncated recovery attachment");
            }
        }
        if (!Arrays.equals(m28304(), Arrays.copyOf(bArr, 84))) {
            throw new IOException("Recovery attachment identity does not match reference");
        }
        MessageDigest m34534 = C14460.m34534();
        while (j != 0) {
            int min = (int) Math.min(j, bArr.length);
            ByteBuffer wrap2 = ByteBuffer.wrap(bArr, 0, min);
            while (wrap2.hasRemaining()) {
                if (fileChannel.read(wrap2) <= 0) {
                    throw new EOFException("Truncated recovery attachment");
                }
            }
            m34534.update(bArr, 0, min);
            j -= min;
        }
        if (!Arrays.equals(this.f34289, m34534.digest()) || fileChannel.size() != j2) {
            throw new IOException("Recovery attachment checksum does not match reference");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28300(long j, long j2) {
        if (j < 0 || j > 2147483647L || j2 < 0 || j > j2) {
            throw new IOException("Recovery attachment exceeds state limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m28299(InterfaceC20758 interfaceC20758, UUID uuid) {
        return interfaceC20758.resolve("state-" + uuid + ".bin");
    }
}
