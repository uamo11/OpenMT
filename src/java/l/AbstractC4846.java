package l;

import android.util.Pair;
import com.google.android.material.textfield.IndicatorViewController;

/* compiled from: B8N9 */
/* renamed from: l.ۙ᩵֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4846 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC4846 f15313 = new C21780();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo14095();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo14098(Object obj);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo14102(int i);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C20369 mo14103(int i, C20369 c20369, long j);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22485 mo14104(int i, C22485 c22485, boolean z);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo14107();

    static {
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m14110() {
        return mo14107() == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo14096(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo14109(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo14109(z) ? mo14099(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo14108(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo14099(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo14099(z) ? mo14109(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo14109(boolean z) {
        if (m14110()) {
            return -1;
        }
        return mo14107() - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo14099(boolean z) {
        return m14110() ? -1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14106(int i, C20369 c20369) {
        mo14103(i, c20369, 0L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pair m14100(C20369 c20369, C22485 c22485, int i, long j) {
        Pair m14101 = m14101(c20369, c22485, i, j, 0L);
        m14101.getClass();
        return m14101;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pair m14101(C20369 c20369, C22485 c22485, int i, long j, long j2) {
        C22632.m50627(i, mo14107());
        mo14103(i, c20369, j2);
        if (j == -9223372036854775807L) {
            j = c20369.f65749;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c20369.f65760;
        mo14104(i2, c22485, false);
        while (i2 < c20369.f65752 && c22485.f72804 != j) {
            int i3 = i2 + 1;
            if (mo14104(i3, c22485, false).f72804 > j) {
                break;
            }
            i2 = i3;
        }
        mo14104(i2, c22485, true);
        long j3 = j - c22485.f72804;
        long j4 = c22485.f72801;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = c22485.f72802;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22485 mo14105(Object obj, C22485 c22485) {
        return mo14104(mo14098(obj), c22485, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14097(int i, C22485 c22485, C20369 c20369, int i2, boolean z) {
        int i3 = mo14104(i, c22485, false).f72806;
        if (mo14103(i3, c20369, 0L).f65752 != i) {
            return i + 1;
        }
        int mo14096 = mo14096(i3, i2, z);
        if (mo14096 == -1) {
            return -1;
        }
        return mo14103(mo14096, c20369, 0L).f65760;
    }

    public boolean equals(Object obj) {
        int mo14109;
        if (this != obj) {
            if (obj instanceof AbstractC4846) {
                AbstractC4846 abstractC4846 = (AbstractC4846) obj;
                if (abstractC4846.mo14107() == mo14107() && abstractC4846.mo14095() == mo14095()) {
                    C20369 c20369 = new C20369();
                    C22485 c22485 = new C22485();
                    C20369 c203692 = new C20369();
                    C22485 c224852 = new C22485();
                    int i = 0;
                    while (true) {
                        if (i >= mo14107()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < mo14095()) {
                                    if (!mo14104(i2, c22485, true).equals(abstractC4846.mo14104(i2, c224852, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int mo14099 = mo14099(true);
                                    if (mo14099 == abstractC4846.mo14099(true) && (mo14109 = mo14109(true)) == abstractC4846.mo14109(true)) {
                                        while (mo14099 != mo14109) {
                                            int mo14096 = mo14096(mo14099, 0, true);
                                            if (mo14096 == abstractC4846.mo14096(mo14099, 0, true)) {
                                                mo14099 = mo14096;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!mo14103(i, c20369, 0L).equals(abstractC4846.mo14103(i, c203692, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C20369 c20369 = new C20369();
        C22485 c22485 = new C22485();
        int mo14107 = mo14107() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION;
        for (int i = 0; i < mo14107(); i++) {
            mo14107 = (mo14107 * 31) + mo14103(i, c20369, 0L).hashCode();
        }
        int mo14095 = mo14095() + (mo14107 * 31);
        for (int i2 = 0; i2 < mo14095(); i2++) {
            mo14095 = (mo14095 * 31) + mo14104(i2, c22485, true).hashCode();
        }
        int mo14099 = mo14099(true);
        while (mo14099 != -1) {
            mo14095 = (mo14095 * 31) + mo14099;
            mo14099 = mo14096(mo14099, 0, true);
        }
        return mo14095;
    }
}
