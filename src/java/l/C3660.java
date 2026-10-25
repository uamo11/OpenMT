package l;

import java.util.ArrayList;

/* compiled from: ZA06 */
/* renamed from: l.ۘۖ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3660 implements InterfaceC8079 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f11537;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11538;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f11539;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f11540;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11541;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f11542;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f11543;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11544;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f11545;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String[] f11546;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f11547;

    @Override // l.InterfaceC8079
    /* renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int m5121 = C1480.m5121(i, bArr);
        this.f11547 = m5121;
        if (m5121 != 3 && m5121 != 1) {
            throw new C13017(C3200.m9831(this.f11547, " referral not supported. Please report this to jcifs at samba dot org.", new StringBuilder("Version ")));
        }
        this.f11540 = C1480.m5121(i + 2, bArr);
        this.f11542 = C1480.m5121(i + 4, bArr);
        this.f11537 = C1480.m5121(i + 6, bArr);
        int i3 = i + 8;
        int i4 = this.f11547;
        if (i4 == 3) {
            this.f11538 = C1480.m5121(i3, bArr);
            this.f11541 = C1480.m5121(i + 10, bArr);
            int i5 = i + 12;
            if ((this.f11537 & 2) == 0) {
                int m51212 = C1480.m5121(i5, bArr);
                int m51213 = C1480.m5121(i + 14, bArr);
                int m51214 = C1480.m5121(i + 16, bArr);
                if (m51212 > 0) {
                    this.f11543 = m11159(m51212 + i, i2, bArr);
                }
                if (m51214 > 0) {
                    this.f11544 = m11159(m51214 + i, i2, bArr);
                }
                if (m51213 > 0) {
                    this.f11545 = m11159(i + m51213, i2, bArr);
                }
            } else {
                int m51215 = C1480.m5121(i5, bArr);
                int m51216 = C1480.m5121(i + 14, bArr);
                int m51217 = C1480.m5121(i + 16, bArr);
                if (m51215 > 0) {
                    this.f11539 = m11159(m51215 + i, i2, bArr);
                }
                if (m51217 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < m51216; i6++) {
                        String m11159 = m11159(i + m51217, i2, bArr);
                        arrayList.add(m11159);
                        m51217 += (m11159.length() * 2) + 2;
                    }
                    this.f11546 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (i4 == 1) {
            this.f11544 = m11159(i3, i2, bArr);
        }
        return this.f11540;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11159(int i, int i2, byte[] bArr) {
        if (i % 2 != 0) {
            i++;
        }
        return C9969.m25131(i, C9969.m25129(i, i2, bArr), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Referral[version=");
        sb.append(this.f11547);
        sb.append(",size=");
        sb.append(this.f11540);
        sb.append(",serverType=");
        sb.append(this.f11542);
        sb.append(",flags=");
        sb.append(this.f11537);
        sb.append(",proximity=");
        sb.append(this.f11538);
        sb.append(",ttl=");
        sb.append(this.f11541);
        sb.append(",path=");
        sb.append(this.f11543);
        sb.append(",altPath=");
        sb.append(this.f11545);
        sb.append(",node=");
        return new String(C9045.m23341(sb, this.f11544, "]"));
    }
}
