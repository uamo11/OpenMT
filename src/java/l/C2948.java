package l;

/* compiled from: K8QR */
/* renamed from: l.ۗۖۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2948 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 f9349;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20628 f9352;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9354;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f9356;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9357;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9358;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9359;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9360;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19882 f9361;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C6516 f9353 = new C6516();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f9350 = new C17714();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f9351 = new C17714(1);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17714 f9355 = new C17714();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m8982() {
        C6516 c6516 = this.f9353;
        c6516.f20124 = 0;
        c6516.f20122 = 0L;
        c6516.f20119 = false;
        c6516.f20121 = false;
        c6516.f20126 = false;
        c6516.f20114 = null;
        this.f9357 = 0;
        this.f9359 = 0;
        this.f9354 = 0;
        this.f9360 = 0;
        this.f9358 = false;
    }

    public C2948(InterfaceC19383 interfaceC19383, C20628 c20628, C19882 c19882, C8353 c8353) {
        this.f9356 = interfaceC19383;
        this.f9352 = c20628;
        this.f9361 = c19882;
        this.f9349 = c8353;
        m8976(c20628, c19882);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8976(C20628 c20628, C19882 c19882) {
        this.f9352 = c20628;
        this.f9361 = c19882;
        this.f9356.mo8456(this.f9349);
        m8982();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8975(C19643 c19643) {
        C14276 c14276 = this.f9352.f66352;
        C19882 c19882 = this.f9353.f20123;
        String str = C3603.f11424;
        C23449 m34036 = c14276.m34036(c19882.f64177);
        C19643 m45154 = c19643.m45154(m34036 != null ? m34036.f75272 : null);
        C1297 m21948 = this.f9349.m21948();
        m21948.m4447(m45154);
        this.f9356.mo8456(m21948.m4440());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m8979() {
        if (!this.f9358) {
            return this.f9352.f66358[this.f9357];
        }
        return this.f9353.f20120[this.f9357];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m8977() {
        if (!this.f9358) {
            return this.f9352.f66357[this.f9357];
        }
        return this.f9353.f20125[this.f9359];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m8981() {
        if (!this.f9358) {
            return this.f9352.f66354[this.f9357];
        }
        return this.f9353.f20113[this.f9357];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8973() {
        int i;
        if (!this.f9358) {
            i = this.f9352.f66353[this.f9357];
        } else {
            i = this.f9353.f20116[this.f9357] ? 1 : 0;
        }
        return m8980() != null ? i | 1073741824 : i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m8978() {
        this.f9357++;
        if (!this.f9358) {
            return false;
        }
        int i = this.f9354 + 1;
        this.f9354 = i;
        int[] iArr = this.f9353.f20111;
        int i2 = this.f9359;
        if (i != iArr[i2]) {
            return true;
        }
        this.f9359 = i2 + 1;
        this.f9354 = 0;
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8974(int i, int i2) {
        C17714 c17714;
        C23449 m8980 = m8980();
        if (m8980 == null) {
            return 0;
        }
        int i3 = m8980.f75273;
        C6516 c6516 = this.f9353;
        if (i3 != 0) {
            c17714 = c6516.f20115;
        } else {
            byte[] bArr = m8980.f75270;
            String str = C3603.f11424;
            int length = bArr.length;
            C17714 c177142 = this.f9355;
            c177142.m41462(length, bArr);
            i3 = bArr.length;
            c17714 = c177142;
        }
        boolean z = c6516.f20121 && c6516.f20117[this.f9357];
        boolean z2 = z || i2 != 0;
        C17714 c177143 = this.f9351;
        c177143.m41482()[0] = (byte) ((z2 ? 128 : 0) | i3);
        c177143.m41484(0);
        InterfaceC19383 interfaceC19383 = this.f9356;
        interfaceC19383.mo8457(c177143, 1, 1);
        interfaceC19383.mo8457(c17714, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        C17714 c177144 = this.f9350;
        if (!z) {
            c177144.m41481(8);
            byte[] m41482 = c177144.m41482();
            m41482[0] = 0;
            m41482[1] = 1;
            m41482[2] = (byte) 0;
            m41482[3] = (byte) (i2 & 255);
            m41482[4] = (byte) ((i >> 24) & 255);
            m41482[5] = (byte) ((i >> 16) & 255);
            m41482[6] = (byte) ((i >> 8) & 255);
            m41482[7] = (byte) (i & 255);
            interfaceC19383.mo8457(c177144, 8, 1);
            return i3 + 9;
        }
        C17714 c177145 = c6516.f20115;
        int m41464 = c177145.m41464();
        c177145.m41478(-2);
        int i4 = (m41464 * 6) + 2;
        if (i2 != 0) {
            c177144.m41481(i4);
            byte[] m414822 = c177144.m41482();
            c177145.m41461(0, i4, m414822);
            int i5 = (((m414822[2] & 255) << 8) | (m414822[3] & 255)) + i2;
            m414822[2] = (byte) ((i5 >> 8) & 255);
            m414822[3] = (byte) (i5 & 255);
        } else {
            c177144 = c177145;
        }
        interfaceC19383.mo8457(c177144, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23449 m8980() {
        if (!this.f9358) {
            return null;
        }
        C6516 c6516 = this.f9353;
        C19882 c19882 = c6516.f20123;
        String str = C3603.f11424;
        int i = c19882.f64177;
        C23449 c23449 = c6516.f20114;
        if (c23449 == null) {
            c23449 = this.f9352.f66352.m34036(i);
        }
        if (c23449 == null || !c23449.f75271) {
            return null;
        }
        return c23449;
    }
}
