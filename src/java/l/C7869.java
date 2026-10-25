package l;

import java.io.IOException;
import java.util.UUID;

/* compiled from: Y6PV */
/* renamed from: l.۠֫ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7869 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11481 f24405;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12641 f24406;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f24407;

    public C7869(long j, C12641 c12641, C11481 c11481) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        this.f24407 = j;
        this.f24406 = c12641;
        this.f24405 = c11481;
        if (c11481 != null && c12641 != null && !c11481.m28306().equals(c12641.m30920())) {
            throw new IllegalStateException("Editor state and migration belong to different sessions");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7869 m21143(byte[] bArr, Long l2) {
        C12641 c12641;
        C11481 c11481 = null;
        if (bArr.length == 0 || (bArr.length >= 4 && new C12951(bArr).readInt() == 844322373)) {
            c12641 = null;
        } else {
            try {
                C12641 m30913 = C12641.m30913(bArr);
                c12641 = m30913;
                bArr = m30913.m30921();
            } catch (IOException e) {
                throw new IllegalStateException("Invalid editor session metadata", e);
            }
        }
        if (bArr.length == 0) {
            if (l2 == null) {
                throw new IllegalStateException("Editor saved mark has not been initialized");
            }
            return new C7869(l2.longValue(), c12641, null);
        }
        if (bArr.length != 16 && bArr.length != 100) {
            throw new IllegalStateException("Invalid editor saved state length");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != 844322373) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        int readInt = c12951.readInt();
        if (readInt != (bArr.length == 16 ? 1 : 2)) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        long readLong = c12951.readLong();
        if (readLong < -1) {
            throw new IllegalStateException("Invalid editor saved mark");
        }
        if (l2 != null && l2.longValue() != readLong) {
            throw new IllegalStateException("Editor saved mark is already initialized");
        }
        if (readInt == 2) {
            try {
                byte[] bArr2 = new byte[84];
                c12951.m31489(84, bArr2);
                c11481 = C11481.m28298(bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException("Invalid editor recovery attachment", e2);
            }
        }
        return new C7869(readLong, c12641, c11481);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m21148(long j) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        C11481 c11481 = this.f24405;
        C10130 c10130 = new C10130(c11481 == null ? 16 : 100);
        c10130.writeInt(844322373);
        c10130.writeInt(c11481 == null ? 1 : 2);
        c10130.m25431(j);
        if (c11481 != null) {
            c10130.write(c11481.m28304());
        }
        byte[] m25444 = c10130.m25444();
        C12641 c12641 = this.f24406;
        return c12641 == null ? m25444 : c12641.m30917(m25444);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21145(byte[] bArr, C11481 c11481, UUID uuid) {
        C7869 m21143 = m21143(bArr, (Long) null);
        long j = m21143.f24407;
        m21143.m21147(uuid);
        if (!c11481.m28306().equals(uuid)) {
            throw new IllegalStateException("Editor recovery attachment belongs to another session");
        }
        return new C7869(j, m21143.f24406, c11481).m21148(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0.m30921().length == 0) goto L14;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11481 m21144(java.util.UUID r3, byte[] r4) {
        /*
            if (r3 == 0) goto L4a
            int r0 = r4.length
            r1 = 0
            if (r0 != 0) goto L7
            goto L2e
        L7:
            int r0 = r4.length
            r2 = 4
            if (r0 < r2) goto L40
            l.۬ۜܽ r0 = new l.۬ۜܽ
            r0.<init>(r4)
            int r0 = r0.readInt()
            r2 = 844322373(0x32535645, float:1.2301432E-8)
            if (r0 == r2) goto L40
            l.۫᩶ᩳ r0 = l.C12641.m30913(r4)     // Catch: java.io.IOException -> L37
            java.util.UUID r2 = r0.m30920()     // Catch: java.io.IOException -> L37
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L37
            if (r2 == 0) goto L2f
            byte[] r0 = r0.m30921()     // Catch: java.io.IOException -> L37
            int r0 = r0.length     // Catch: java.io.IOException -> L37
            if (r0 != 0) goto L40
        L2e:
            return r1
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L37
            java.lang.String r4 = "Editor migration belongs to another session"
            r3.<init>(r4)     // Catch: java.io.IOException -> L37
            throw r3     // Catch: java.io.IOException -> L37
        L37:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid editor migration metadata"
            r4.<init>(r0, r3)
            throw r4
        L40:
            l.۠֫ܿ r4 = m21143(r4, r1)
            r4.m21147(r3)
            l.ۨۙᩳ r3 = r4.f24405
            return r3
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Editor recovery session identity is missing"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7869.m21144(java.util.UUID, byte[]):l.ۨۙᩳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21146(UUID uuid, byte[] bArr) {
        m21143(bArr, (Long) null).m21147(uuid);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21147(UUID uuid) {
        C12641 c12641;
        C11481 c11481;
        if (uuid == null || !(((c12641 = this.f24406) == null || c12641.m30920().equals(uuid)) && ((c11481 = this.f24405) == null || c11481.m28306().equals(uuid)))) {
            throw new IllegalStateException("Editor recovery metadata belongs to another session");
        }
    }
}
