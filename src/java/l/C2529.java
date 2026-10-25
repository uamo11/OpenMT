package l;

import java.util.Arrays;
import java.util.List;

/* compiled from: M6OO */
/* renamed from: l.ۖ۫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2529 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f8023;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f8024;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f8026;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f8027;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f8028;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f8029;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f8031;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f8030 = -1;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8025 = -1;

    public C2529(int i, C8931 c8931) {
        this.f8027 = i;
        C8931 c89312 = c8931.f63075;
        this.f8029 = c89312 != null ? c89312.mo1085() : -1;
        this.f8024 = c8931.f27156.mo2052();
        this.f8031 = i == 57 && (c8931.f63075 instanceof C21312);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8043(InterfaceC0463 interfaceC0463) {
        int type = interfaceC0463.getType();
        int i = this.f8027;
        if (i != 1) {
            if (i != 15 && i != 18) {
                if (i != 25) {
                    if (i != 34) {
                        if (i != 41) {
                            if (i != 54) {
                                if (i != 64 && i != 67) {
                                    if (i != 68) {
                                        switch (i) {
                                            case 21:
                                                if (type != 18) {
                                                }
                                                break;
                                            case 22:
                                                if (type != 17 && type != 38) {
                                                }
                                                break;
                                            case 23:
                                                if (type != 91 && type != 92) {
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                }
                                        }
                                    }
                                }
                            }
                            if (type != 92) {
                                return;
                            }
                        }
                        if (type != 136 && type != 95) {
                            return;
                        }
                    } else if (type != 43 && type != 91 && type != 92) {
                        return;
                    }
                } else if (type != 10 && type != 21) {
                    return;
                }
            }
            if (type != 136 && type != 133) {
                return;
            }
        } else if (type != 93) {
            return;
        }
        int[] iArr = this.f8028;
        if (iArr == null) {
            this.f8028 = new int[2];
        } else {
            int i2 = this.f8026;
            if (i2 == iArr.length) {
                this.f8028 = Arrays.copyOf(iArr, i2 * 2);
            }
        }
        int[] iArr2 = this.f8028;
        int i3 = this.f8026;
        this.f8026 = i3 + 1;
        iArr2[i3] = interfaceC0463.mo2052();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8041(int i) {
        return this.f8028[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8042(int i, List list) {
        for (int i2 = 0; i2 < this.f8026; i2++) {
            if (((InterfaceC0463) list.get(this.f8028[i2])).getType() == i) {
                return this.f8028[i2];
            }
        }
        return -1;
    }
}
