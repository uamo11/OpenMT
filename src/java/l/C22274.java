package l;

import java.io.IOException;
import java.util.HashMap;

/* compiled from: 4778 */
/* renamed from: l.᩹ۨ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22274 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f72258;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f72259;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f72260;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f72261;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f72262;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50001(long j, long j2) {
        for (int i = 0; i < 8; i++) {
            j = (j ^ (((int) (j2 >>> (i * 8))) & 255)) * 1099511628211L;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m50003(String str) {
        Integer num;
        num = (Integer) this.f72262.get(str);
        return num == null ? 0 : this.f72261[num.intValue()] & 255;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50004() {
        if (this.f72259) {
            AbstractC15440 m36526 = this.f72258.m36526(".axml_kind.bin.tmp");
            AbstractC15440 m365262 = this.f72258.m36526("axml_kind.bin");
            boolean z = false;
            try {
                try {
                    this.f72258.m36508();
                    m36526.mo23552();
                    C10130 c10130 = new C10130(this.f72261.length + 16);
                    c10130.writeInt(1296128067);
                    c10130.writeInt(1);
                    c10130.writeInt(this.f72261.length);
                    c10130.m25431(this.f72260);
                    c10130.m25434(this.f72261);
                    m36526.m36496(c10130);
                    m365262.mo23552();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException | RuntimeException unused) {
                m36526.mo23552();
            }
            if (!m36526.mo23551(m365262)) {
                throw new IOException("Failed to publish AXML kind cache");
            }
            this.f72259 = false;
            try {
                C15972.m37753();
            } catch (IOException | RuntimeException unused2) {
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (!z) {
                    m36526.mo23552();
                }
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50005(String str, boolean z) {
        Integer num = (Integer) this.f72262.get(str);
        if (num == null) {
            return;
        }
        byte b = (byte) (z ? 2 : 1);
        if (this.f72261[num.intValue()] != b) {
            this.f72261[num.intValue()] = b;
            this.f72259 = true;
        }
    }

    public C22274(AbstractC15440 abstractC15440, long j, byte[] bArr, HashMap hashMap) {
        this.f72258 = abstractC15440;
        this.f72260 = j;
        this.f72261 = bArr;
        this.f72262 = hashMap;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21569 m50006() {
        return new C21569(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r7 = new byte[r18.size()];
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22274 m50002(l.AbstractC15440 r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22274.m50002(l.ܶ᩵ܿ, java.util.ArrayList):l.᩹ۨ᩻");
    }
}
