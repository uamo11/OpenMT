package l;

import java.io.IOException;

/* compiled from: T19G */
/* renamed from: l.֫ᩳܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1993 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f6673;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6674;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f6675;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short f6676;

    public C1993(short s, int i, int i2, int i3) {
        this.f6676 = s;
        this.f6674 = i;
        this.f6673 = i2;
        this.f6675 = i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6526(int i) {
        short s = this.f6676;
        if (s != i) {
            throw new IOException(String.format("Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x", Integer.valueOf(i), Short.valueOf(s), Integer.valueOf(this.f6675)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1993 m6523(C5896 c5896) {
        int m16529 = c5896.m16529();
        if (c5896.m16525() < 8) {
            return new C1993((short) -1, 0, 0, m16529);
        }
        return new C1993(c5896.m16534(), c5896.m16537(), c5896.m16535(), m16529);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1993 m6525(C12951 c12951) {
        int m31488 = c12951.m31488();
        if (c12951.available() < 8) {
            return new C1993((short) -1, 0, 0, m31488);
        }
        return new C1993(c12951.readShort(), c12951.m31494(), c12951.readInt(), m31488);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1993 m6524(C23411 c23411) {
        int m51856 = c23411.m51856();
        if (c23411.length() - m51856 < 8) {
            return new C1993((short) -1, 0, 0, m51856);
        }
        return new C1993((short) c23411.mo21172(), c23411.mo21172(), c23411.readInt(), m51856);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6527(C12951 c12951) {
        c12951.seek(this.f6675 + this.f6673);
    }
}
