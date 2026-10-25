package l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: Q8M2 */
/* renamed from: l.ۧۘۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10750 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26947(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = C23202.m51496(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26946(UUID uuid, byte[] bArr) {
        C1577 m26945 = m26945(bArr);
        if (m26945 == null) {
            return null;
        }
        UUID uuid2 = m26945.f5584;
        if (!uuid.equals(uuid2)) {
            C19956.m46037("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return m26945.f5583;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1577 m26945(byte[] bArr) {
        UUID[] uuidArr;
        C17714 c17714 = new C17714(bArr);
        if (c17714.m41483() < 32) {
            return null;
        }
        c17714.m41484(0);
        int m41457 = c17714.m41457();
        int m41493 = c17714.m41493();
        if (m41493 != m41457) {
            C19956.m46037("Advertised atom size (" + m41493 + ") does not match buffer size: " + m41457);
            return null;
        }
        int m414932 = c17714.m41493();
        if (m414932 != 1886614376) {
            C8083.m21451(m414932, "Atom type is not pssh: ");
            return null;
        }
        int m49483 = C21998.m49483(c17714.m41493());
        if (m49483 > 1) {
            C8083.m21451(m49483, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(c17714.m41487(), c17714.m41487());
        if (m49483 == 1) {
            int m41492 = c17714.m41492();
            uuidArr = new UUID[m41492];
            for (int i = 0; i < m41492; i++) {
                uuidArr[i] = new UUID(c17714.m41487(), c17714.m41487());
            }
        } else {
            uuidArr = null;
        }
        int m414922 = c17714.m41492();
        int m414572 = c17714.m41457();
        if (m414922 == m414572) {
            byte[] bArr2 = new byte[m414922];
            c17714.m41461(0, m414922, bArr2);
            return new C1577(uuid, m49483, bArr2, uuidArr);
        }
        C19956.m46037("Atom data size (" + m414922 + ") does not match the bytes left: " + m414572);
        return null;
    }
}
