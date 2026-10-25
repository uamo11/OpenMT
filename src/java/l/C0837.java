package l;

import java.util.Date;

/* compiled from: M9V7 */
/* renamed from: l.֨ۖ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0837 implements InterfaceC14325, InterfaceC8079 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f3016;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f3017;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f3018;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f3019;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f3020;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f3021;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f3022;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f3023;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f3024;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3025;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 f3026;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f3027;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f3028;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f3029;

    @Override // l.InterfaceC14325
    public final int getType() {
        return 1;
    }

    public C0837(InterfaceC1023 interfaceC1023, boolean z) {
        this.f3026 = interfaceC1023;
        this.f3016 = z;
    }

    @Override // l.InterfaceC14325
    public final String getName() {
        return this.f3019;
    }

    @Override // l.InterfaceC14325
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo3113() {
        return this.f3021;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m3114() {
        return this.f3019;
    }

    @Override // l.InterfaceC14325
    public final int getAttributes() {
        return this.f3023;
    }

    @Override // l.InterfaceC14325
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long mo3111() {
        return this.f3029;
    }

    @Override // l.InterfaceC14325
    public final long length() {
        return this.f3024;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m3112() {
        return this.f3025;
    }

    @Override // l.InterfaceC8079
    /* renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        String m25126;
        this.f3025 = C1480.m5123(i, bArr);
        this.f3021 = C1480.m5123(i + 4, bArr);
        this.f3018 = C1480.m5127(i + 8, bArr);
        this.f3022 = C1480.m5127(i + 16, bArr);
        this.f3029 = C1480.m5127(i + 24, bArr);
        this.f3028 = C1480.m5127(i + 32, bArr);
        this.f3024 = C1480.m5125(i + 40, bArr);
        this.f3027 = C1480.m5125(i + 48, bArr);
        this.f3023 = C1480.m5123(i + 56, bArr);
        int m5123 = C1480.m5123(i + 60, bArr);
        this.f3017 = C1480.m5123(i + 64, bArr);
        this.f3020 = C9969.m25131(i + 70, bArr[i + 68] & 255, bArr);
        int i3 = i + 94;
        if (this.f3016) {
            if (m5123 > 0) {
                int i4 = i3 + m5123;
                if (bArr[i4 - 1] == 0 && bArr[i4 - 2] == 0) {
                    m5123 -= 2;
                }
            }
            m25126 = C9969.m25131(i3, m5123, bArr);
        } else {
            if (m5123 > 0 && bArr[(i3 + m5123) - 1] == 0) {
                m5123--;
            }
            m25126 = C9969.m25126(bArr, i3, m5123, this.f3026);
        }
        this.f3019 = m25126;
        return i - (i3 + m5123);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
        sb.append(this.f3025);
        sb.append(",fileIndex=");
        sb.append(this.f3021);
        sb.append(",creationTime=");
        sb.append(new Date(this.f3018));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f3022));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f3029));
        sb.append(",changeTime=");
        sb.append(new Date(this.f3028));
        sb.append(",endOfFile=");
        sb.append(this.f3024);
        sb.append(",allocationSize=");
        sb.append(this.f3027);
        sb.append(",extFileAttributes=");
        sb.append(this.f3023);
        sb.append(",eaSize=");
        sb.append(this.f3017);
        sb.append(",shortName=");
        sb.append(this.f3020);
        sb.append(",filename=");
        return new String(C9045.m23341(sb, this.f3019, "]"));
    }
}
