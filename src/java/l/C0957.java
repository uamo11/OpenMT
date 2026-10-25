package l;

/* compiled from: E998 */
/* renamed from: l.֨ۜܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0957 extends AbstractC21023 {

    /* renamed from: ۬ۗۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f3600;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f3601;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f3602;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f3603;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f3604;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20714[] f3605;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f3606;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f3607;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f3608;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f3609;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3074 f3610;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f3611;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f3612;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f3613;

    static {
        ApplicationC12518.m30701(13);
        f3600 = new short[]{7414, -26708, -26729, -26729, -26664, -26731, -26727, -26730, -26751, -26664, -26741, -26740, -26742, -26735, -26730, -26721, -26741};
    }

    public native C0957(C5896 c5896, C9327 c9327);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m3390(C20616 c20616);

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f3612;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3392() {
        this.f3605 = null;
    }

    @Override // l.InterfaceC12743
    public final C20714 getItem(int i) {
        C20714[] c20714Arr = this.f3605;
        if (c20714Arr != null && i >= 0 && i < this.f3612) {
            C20714 c20714 = c20714Arr[i];
            if (c20714 != null) {
                return c20714;
            }
            String m3388 = m3388(i);
            int[] m3387 = m3387(i);
            C20714[] c20714Arr2 = this.f3605;
            C20714 c207142 = new C20714(this, m3388, m3387);
            c20714Arr2[i] = c207142;
            return c207142;
        }
        return new C20714(this, m3388(i), m3387(i));
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3571 mo3389(int i) {
        if (i < 0 || i >= this.f3612) {
            throw C22412.m50343(i, this.f3612);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3391() {
        return this.f3603;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m3388(int i) {
        int i2;
        if (i < 0 || i >= this.f3612) {
            return C22412.m50343(i, this.f3612).toString();
        }
        int i3 = this.f3604;
        int i4 = this.f3608;
        int i5 = i3 + i4 + this.f3607[i];
        if (i5 < this.f3606 || i5 >= (i2 = this.f3609)) {
            return "";
        }
        C3074 c3074 = this.f3610;
        boolean z = this.f3603;
        String m47855 = m47855(c3074, i5, z, i2);
        if (m47855 == null) {
            int m3386 = m3386(i);
            if (m3386 != -1 && (m47855 = m47855(c3074, m3386, z, i2)) != null) {
                this.f3607[i] = (m3386 - i4) - this.f3604;
            }
            if (m47855 == null) {
                return "";
            }
        }
        return m47855;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m3386(int i) {
        C22412.m50341("getPreviousStringEndOffset " + i);
        int i2 = this.f3608;
        if (i == 0) {
            return i2 + this.f3604;
        }
        int i3 = i - 1;
        int i4 = i2 + this.f3604 + this.f3607[i3];
        C3074 c3074 = this.f3610;
        boolean z = this.f3603;
        int i5 = this.f3609;
        int m47849 = AbstractC21023.m47849(c3074, i4, z, i5);
        C22412.m50341("new offset " + m47849);
        if (m47849 != -1) {
            return m47849;
        }
        int m3386 = m3386(i3);
        if (m3386 == -1) {
            return -1;
        }
        return AbstractC21023.m47849(c3074, m3386, z, i5);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int[] m3387(int i) {
        if (i >= 0 && i < this.f3601) {
            C5896 m9403 = this.f3610.m9403(this.f3608 + this.f3602 + this.f3611[i]);
            C15859 c15859 = new C15859();
            while (true) {
                try {
                    int m16535 = m9403.m16535();
                    if (m16535 != -1) {
                        c15859.add(m16535);
                    } else {
                        return c15859.mo3586();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return null;
    }
}
