package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MB3E */
/* renamed from: l.᩺ܶᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23077 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74220;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12534 f74221;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74222;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74223;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f74224;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f74225;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74226;

    public C23077(int i, int i2, boolean z, int i3, AbstractC15440 abstractC15440, C12534 c12534, Map map) {
        this.f74226 = i;
        this.f74223 = i2;
        this.f74224 = z;
        this.f74222 = i3;
        this.f74221 = c12534;
        this.f74220 = abstractC15440;
        this.f74225 = map;
    }

    public C23077(C12951 c12951) {
        this.f74226 = c12951.readByte() & 255;
        this.f74223 = c12951.m31494();
        this.f74224 = c12951.m31498();
        c12951.skipBytes(1);
        this.f74222 = c12951.readInt();
        String m31503 = c12951.m31503();
        boolean m31498 = c12951.m31498();
        if (m31503 != null) {
            this.f74220 = C16999.m39866(m31503, new String[0]);
        }
        if (m31498) {
            AbstractC15440 abstractC15440 = this.f74220;
            if (abstractC15440 != null && abstractC15440.mo23120()) {
                try {
                    C12534 c12534 = new C12534(this.f74220);
                    c12534.m30773();
                    this.f74221 = c12534;
                } catch (Throwable unused) {
                }
            }
            if (this.f74221 == null) {
                this.f74221 = new C12534();
            }
        }
        int readInt = c12951.readInt();
        this.f74225 = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String m31504 = c12951.m31504();
            int readInt2 = c12951.readInt();
            int readInt3 = c12951.readInt();
            String m315042 = c12951.m31504();
            int readInt4 = c12951.readInt();
            C14692[] c14692Arr = new C14692[readInt4];
            for (int i2 = 0; i2 < readInt4; i2++) {
                c14692Arr[i2] = new C14692(c12951.readInt(), c12951.readInt(), c12951.m31504());
            }
            this.f74225.put(m31504, new C16809(readInt2, m315042, c14692Arr, readInt3));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23077 m51238() {
        HashMap hashMap;
        Map map = this.f74225;
        if (map != null) {
            hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                C16809 c16809 = (C16809) entry.getValue();
                hashMap.put((String) entry.getKey(), new C16809(c16809.f51608, c16809.f51605, (C14692[]) c16809.f51607.clone(), c16809.f51604));
            }
        } else {
            hashMap = null;
        }
        int i = this.f74223;
        AbstractC15440 abstractC15440 = this.f74220;
        C12534 c12534 = this.f74221;
        return new C23077(this.f74226, i, this.f74224, this.f74222, abstractC15440, c12534, hashMap);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51241() {
        return this.f74226 == 255;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51240() {
        return this.f74226 == 254;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51242() {
        return this.f74226 == 253;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51237(int i) {
        long j;
        AbstractC15440 abstractC15440 = this.f74220;
        if (abstractC15440 != null) {
            String mo23554 = abstractC15440.mo23554();
            j = (mo23554 == null ? 0L : C5773.m16234(mo23554, false)) + 16;
        } else {
            j = 15;
        }
        m51236(i, j);
        Map map = this.f74225;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C16809 c16809 = (C16809) entry.getValue();
                String str = (String) entry.getKey();
                long m16234 = C5773.m16234(c16809.f51605, false) + (str == null ? 0L : C5773.m16234(str, false)) + 20 + j;
                m51236(i, m16234);
                for (C14692 c14692 : c16809.f51607) {
                    String str2 = c14692.f44875;
                    m16234 += (str2 == null ? 0L : C5773.m16234(str2, false)) + 12;
                    m51236(i, m16234);
                }
                j = m16234;
            }
        }
        return (int) j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51236(int i, long j) {
        if (i < 0 || j > i) {
            throw new IOException("Text parameters exceed recovery state limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51239(C10130 c10130) {
        c10130.writeByte(this.f74226);
        c10130.mo13231(this.f74223);
        c10130.m25425(this.f74224);
        c10130.writeByte(0);
        c10130.writeInt(this.f74222);
        AbstractC15440 abstractC15440 = this.f74220;
        c10130.m25424(abstractC15440 == null ? null : abstractC15440.mo23554());
        c10130.m25425(this.f74221 != null);
        Map map = this.f74225;
        if (map == null) {
            c10130.writeInt(0);
            return;
        }
        c10130.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c10130.m25423((CharSequence) entry.getKey());
            C16809 c16809 = (C16809) entry.getValue();
            c10130.writeInt(c16809.f51608);
            c10130.writeInt(c16809.f51604);
            c10130.m25423((CharSequence) c16809.f51605);
            C14692[] c14692Arr = c16809.f51607;
            c10130.writeInt(c14692Arr.length);
            for (C14692 c14692 : c14692Arr) {
                c10130.writeInt(c14692.f44876);
                c10130.writeInt(c14692.f44877);
                c10130.m25423((CharSequence) c14692.f44875);
            }
        }
    }
}
