package l;

import com.google.android.material.textfield.IndicatorViewController;

/* compiled from: B8N9 */
/* renamed from: l.᩹᩵֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22485 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7214 f72800 = C7214.f22068;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f72801;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f72802;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f72803;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f72804;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f72805;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f72806;

    static {
        C5368.m15341(0, 1, 2, 3, 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50435(Object obj, Object obj2, int i, long j, long j2, C7214 c7214, boolean z) {
        this.f72803 = obj;
        this.f72802 = obj2;
        this.f72806 = i;
        this.f72801 = j;
        this.f72804 = j2;
        this.f72800 = c7214;
        this.f72805 = z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50438(int i) {
        C7214 c7214 = this.f72800;
        int i2 = c7214.f22070;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c7214.m19298(i).getClass();
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50433(int i) {
        this.f72800.m19298(i).getClass();
        return 0L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50436(int i) {
        return this.f72800.m19298(i).m32606(-1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50437(long j) {
        int i;
        C7214 c7214 = this.f72800;
        int i2 = c7214.f22070;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            c7214.m19298(i3).getClass();
        }
        while (i3 >= 0 && j != Long.MIN_VALUE) {
            c7214.m19298(i3).getClass();
            if (j >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            C13563 m19298 = c7214.m19298(i3);
            int i4 = m19298.f40471;
            if (i4 != -1) {
                while (i < i4) {
                    int i5 = m19298.f40473[i];
                    i = (i5 == 0 || i5 == 1) ? 0 : i + 1;
                }
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50432(long j) {
        C13563 m19298;
        int i;
        C7214 c7214 = this.f72800;
        long j2 = this.f72801;
        int i2 = c7214.f22070;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c7214.m19298(i3).getClass();
                c7214.m19298(i3).getClass();
                if (0 > j && ((i = (m19298 = c7214.m19298(i3)).f40471) == -1 || m19298.m32606(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c7214.m19298(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50434(int i, int i2) {
        C13563 m19298 = this.f72800.m19298(i);
        if (m19298.f40471 != -1) {
            return m19298.f40472[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50439(int i) {
        this.f72800.m19298(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C22485.class.equals(obj.getClass())) {
            return false;
        }
        C22485 c22485 = (C22485) obj;
        return C11003.equals(this.f72803, c22485.f72803) && C11003.equals(this.f72802, c22485.f72802) && this.f72806 == c22485.f72806 && this.f72801 == c22485.f72801 && this.f72804 == c22485.f72804 && this.f72805 == c22485.f72805 && C11003.equals(this.f72800, c22485.f72800);
    }

    public final int hashCode() {
        Object obj = this.f72803;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31;
        Object obj2 = this.f72802;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f72806) * 31;
        long j = this.f72801;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f72804;
        return this.f72800.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f72805 ? 1 : 0)) * 31);
    }
}
