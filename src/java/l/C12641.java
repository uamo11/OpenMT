package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: T6SQ */
/* renamed from: l.۫᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12641 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final UUID f38084;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f38085;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f38086;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f38087;

    public C12641(UUID uuid, long j, byte[] bArr, byte[] bArr2) {
        this.f38084 = uuid;
        this.f38086 = j;
        this.f38085 = bArr == null ? null : (byte[]) bArr.clone();
        this.f38087 = (byte[]) bArr2.clone();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID m30920() {
        return this.f38084;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30919() {
        return this.f38085 != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m30922() {
        return this.f38086;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m30921() {
        return (byte[]) this.f38087.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m30917(byte[] bArr) {
        return m30914(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m30916() {
        return m30914(this.f38087);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m30914(byte[] bArr) {
        if (bArr.length > 8112) {
            throw new IllegalArgumentException("Migration user metadata is too large");
        }
        C10130 c10130 = new C10130(bArr.length + 80);
        c10130.writeInt(1295142215);
        c10130.writeInt(1);
        UUID uuid = this.f38084;
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        c10130.writeInt(m30919() ? 1 : 0);
        c10130.writeInt(0);
        c10130.m25431(this.f38086);
        c10130.write(m30919() ? this.f38085 : new byte[32]);
        c10130.writeInt(bArr.length);
        c10130.write(bArr, 0, bArr.length);
        c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
        return c10130.m25444();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12641 m30913(byte[] bArr) {
        if (bArr.length < 80 || bArr.length > 8192) {
            throw new IOException("Invalid migration metadata length");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != 1295142215 || c12951.readInt() != 1) {
            throw new IOException("Unsupported migration metadata");
        }
        UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
        int readInt = c12951.readInt();
        int readInt2 = c12951.readInt();
        long readLong = c12951.readLong();
        byte[] bArr2 = new byte[32];
        c12951.m31489(32, bArr2);
        int readInt3 = c12951.readInt();
        if ((readInt != 0 && readInt != 1) || readInt2 != 0 || readLong < 0 || readLong > 2147483647L || readInt3 != bArr.length - 80 || (readInt == 0 && (readLong != 0 || !Arrays.equals(bArr2, new byte[32])))) {
            throw new IOException("Invalid migration metadata fields");
        }
        byte[] bArr3 = new byte[readInt3];
        c12951.m31489(readInt3, bArr3);
        if (c12951.readInt() != C1829.m6061(0, bArr.length - 4, bArr)) {
            throw new IOException("Invalid migration metadata checksum");
        }
        return new C12641(uuid, readLong, readInt == 0 ? null : bArr2, bArr3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m30915(InterfaceC20758 interfaceC20758, C1143 c1143) {
        if (!m30919()) {
            throw new IOException("Migration has no external state");
        }
        return C6291.m17328(interfaceC20758, this, c1143, null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30918(InterfaceC20758 interfaceC20758, C1143 c1143) {
        if (m30919()) {
            C6291.m17328(interfaceC20758, this, c1143, InterfaceC23015.f74090).close();
        } else if (C17229.exists(interfaceC20758.resolve("migration-state.bin"), EnumC14406.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state file is not bound to its commit");
        }
    }
}
