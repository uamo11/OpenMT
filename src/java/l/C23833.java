package l;

import java.nio.ByteBuffer;

/* compiled from: 9B0Q */
/* renamed from: l.᩻ܿ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23833 extends C21012 {
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52524() {
        int m47823 = m47823(4);
        if (m47823 != 0) {
            return this.f67831.getInt(m47823 + this.f67832);
        }
        return 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52520() {
        int m47823 = m47823(6);
        return (m47823 == 0 || this.f67831.get(m47823 + this.f67832) == 0) ? false : true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m52523() {
        int m47823 = m47823(8);
        if (m47823 != 0) {
            return this.f67831.getShort(m47823 + this.f67832);
        }
        return (short) 0;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final short m52521() {
        int m47823 = m47823(12);
        if (m47823 != 0) {
            return this.f67831.getShort(m47823 + this.f67832);
        }
        return (short) 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m52522() {
        int m47823 = m47823(14);
        if (m47823 != 0) {
            return this.f67831.getShort(m47823 + this.f67832);
        }
        return (short) 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52519(int i) {
        int m47823 = m47823(16);
        if (m47823 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f67831;
        int i2 = m47823 + this.f67832;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52518() {
        int m47823 = m47823(16);
        if (m47823 == 0) {
            return 0;
        }
        int i = m47823 + this.f67832;
        return this.f67831.getInt(this.f67831.getInt(i) + i);
    }
}
