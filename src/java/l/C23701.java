package l;

import android.graphics.Canvas;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* compiled from: X1VI */
/* renamed from: l.᩻۫ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23701 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static List f76752 = Arrays.asList("{}", "[]", "()");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f76753;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11737 f76754;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76755;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f76756;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f76757;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f76758;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76759;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f76760;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12392 f76761;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76762;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11737 f76763;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76764;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f76765;

    public C23701(C12392 c12392) {
        List list = f76752;
        this.f76763 = new C11737(list.size());
        this.f76754 = new C11737(list.size());
        this.f76761 = c12392;
        m52257(list);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52257(List list) {
        m52265();
        if (list == null) {
            list = f76752;
        }
        C11737 c11737 = this.f76763;
        c11737.clear();
        C11737 c117372 = this.f76754;
        c117372.clear();
        for (String str : list) {
            if (str.length() != 2) {
                throw new IllegalArgumentException(str);
            }
            c11737.mo27373(str.charAt(0), str.charAt(1));
            c117372.mo27373(str.charAt(1), str.charAt(0));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52251(int i) {
        if (!this.f76765 || this.f76760) {
            return -1;
        }
        int i2 = this.f76757;
        if (i == i2) {
            return this.f76756 + 1;
        }
        int i3 = this.f76756;
        int i4 = i3 + 1;
        if (i != i4) {
            if (i == i2 + 1) {
                return i4;
            }
            if (i != i3) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m52260(int i) {
        if (!this.f76765 || this.f76760) {
            return null;
        }
        int i2 = this.f76757;
        if (i != i2) {
            int i3 = this.f76756;
            if (i != i3 + 1 && i != i2 + 1 && i != i3) {
                return null;
            }
        }
        return new int[]{i2, this.f76756};
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52259(int i, int i2) {
        m52248(i, i2, 0, this.f76761.m30526());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52254(int i, int i2, int i3, int i4) {
        int m30526 = this.f76761.m30526();
        if (i3 >= 0 && i3 <= i4 && i4 <= m30526) {
            m52248(i, i2, i3, i4);
        } else {
            StringBuilder m46682 = C20361.m46682("Invalid syntax coverage [", i3, ", ", ") for length ", i4);
            m46682.append(m30526);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:16:0x0029, B:21:0x0037, B:24:0x0049, B:27:0x005a, B:30:0x006b, B:32:0x0079, B:34:0x007e, B:36:0x0084, B:40:0x008e, B:42:0x00a0, B:43:0x00a9, B:45:0x00bb, B:47:0x00c5, B:48:0x00c9, B:51:0x00a5), top: B:15:0x0029, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:16:0x0029, B:21:0x0037, B:24:0x0049, B:27:0x005a, B:30:0x006b, B:32:0x0079, B:34:0x007e, B:36:0x0084, B:40:0x008e, B:42:0x00a0, B:43:0x00a9, B:45:0x00bb, B:47:0x00c5, B:48:0x00c9, B:51:0x00a5), top: B:15:0x0029, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:16:0x0029, B:21:0x0037, B:24:0x0049, B:27:0x005a, B:30:0x006b, B:32:0x0079, B:34:0x007e, B:36:0x0084, B:40:0x008e, B:42:0x00a0, B:43:0x00a9, B:45:0x00bb, B:47:0x00c5, B:48:0x00c9, B:51:0x00a5), top: B:15:0x0029, outer: #2 }] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m52248(int r15, int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23701.m52248(int, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52247(C7744 c7744, int i, int i2, int i3, C6686 c6686) {
        char mo20130;
        int i4;
        int m30304;
        int i5;
        C15068 m18234;
        if (i >= i2 && i < i3) {
            char charAt = c7744.charAt(i);
            if (c6686 != null) {
                if (c6686.m18232(i, i + 1) && (m18234 = c6686.m18234((i4 = c6686.m18226(i)))) != null) {
                    mo20130 = m52245(m18234, charAt, true);
                    Math.max(i2, c6686.m18236(i4));
                    i5 = Math.min(i3, c6686.m18237(i4));
                    m30304 = c6686.m18233(i);
                }
            } else {
                mo20130 = this.f76763.mo20130(charAt);
                i4 = -1;
                m30304 = this.f76761.m30304(i);
                i5 = i3;
            }
            if (mo20130 != 0) {
                int i6 = i + 1;
                int indexOf = c7744.indexOf(mo20130, i6, i5);
                int i7 = 0;
                while (indexOf != -1) {
                    if (m52246(c6686, i4, indexOf, m30304)) {
                        int indexOf2 = c7744.indexOf(charAt, i6, indexOf);
                        int i8 = 0;
                        while (indexOf2 != -1) {
                            if (m52246(c6686, i4, indexOf2, m30304)) {
                                i8++;
                            }
                            indexOf2 = c7744.indexOf(charAt, indexOf2 + 1, indexOf);
                        }
                        int i9 = i7 + i8;
                        if (i9 == 0) {
                            this.f76755 = i;
                            this.f76764 = indexOf;
                            return true;
                        }
                        i6 = indexOf + 1;
                        i7 = i9 - 1;
                    }
                    indexOf = c7744.indexOf(mo20130, indexOf + 1, i5);
                }
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m52249(C7744 c7744, int i, int i2, int i3, C6686 c6686) {
        char mo20130;
        int m30304;
        int i4;
        C15068 m18234;
        int i5 = i2;
        if (i >= i5 && i < i3) {
            char charAt = c7744.charAt(i);
            if (c6686 != null) {
                if (c6686.m18232(i, i + 1) && (m18234 = c6686.m18234((i4 = c6686.m18226(i)))) != null) {
                    mo20130 = m52245(m18234, charAt, false);
                    i5 = Math.max(i5, c6686.m18236(i4));
                    Math.min(i3, c6686.m18237(i4));
                    m30304 = c6686.m18233(i);
                }
            } else {
                mo20130 = this.f76754.mo20130(charAt);
                m30304 = this.f76761.m30304(i);
                i4 = -1;
            }
            if (mo20130 != 0) {
                int lastIndexOf = c7744.lastIndexOf(mo20130, i5, i);
                int i6 = i - 1;
                int i7 = 0;
                while (lastIndexOf != -1) {
                    if (m52246(c6686, i4, lastIndexOf, m30304)) {
                        int i8 = i6 + 1;
                        int indexOf = c7744.indexOf(charAt, lastIndexOf + 1, i8);
                        int i9 = 0;
                        while (indexOf != -1) {
                            if (m52246(c6686, i4, indexOf, m30304)) {
                                i9++;
                            }
                            indexOf = c7744.indexOf(charAt, indexOf + 1, i8);
                        }
                        int i10 = i7 + i9;
                        if (i10 == 0) {
                            this.f76755 = lastIndexOf;
                            this.f76764 = i;
                            return true;
                        }
                        i6 = lastIndexOf - 1;
                        i7 = i10 - 1;
                    }
                    lastIndexOf = c7744.lastIndexOf(mo20130, i5, lastIndexOf);
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52246(C6686 c6686, int i, int i2, int i3) {
        return c6686 == null ? this.f76761.m30304(i2) == i3 : c6686.m18226(i2) == i && c6686.m18233(i2) == i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char m52245(C15068 c15068, char c, boolean z) {
        String str;
        List m35663 = c15068.m35663();
        if (m35663 == null) {
            m35663 = f76752;
        }
        int i = !z ? 1 : 0;
        int size = m35663.size();
        do {
            size--;
            if (size < 0) {
                return (char) 0;
            }
            str = (String) m35663.get(size);
        } while (str.charAt(i) != c);
        return str.charAt(z ? 1 : 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m52252(int i, int i2, int i3) {
        InterfaceC7785 m30436 = this.f76761.m30436();
        if (!this.f76765 || this.f76758 != m30436 || this.f76753 + 1 != m30436.mo26548()) {
            return -1L;
        }
        if (i2 == 0 && i3 == 0) {
            return -1L;
        }
        int i4 = i + i2;
        int i5 = this.f76757;
        if (i <= i5 && i5 < i4) {
            return -1L;
        }
        int i6 = this.f76756;
        if (i <= i6 && i6 < i4) {
            return -1L;
        }
        int i7 = i3 - i2;
        if (i5 >= i4) {
            i5 += i7;
        }
        if (i6 >= i4) {
            i6 += i7;
        }
        return (i5 << 32) | (i6 & 4294967295L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52255(long j) {
        if (j < 0) {
            return;
        }
        this.f76757 = (int) (j >>> 32);
        this.f76756 = (int) j;
        C12392 c12392 = this.f76761;
        this.f76753 = c12392.m30436().mo26548();
        this.f76760 = true;
        this.f76765 = true;
        m52253(c12392.m30444(), c12392.m30448());
        if (this.f76765) {
            this.f76762 = c12392.m30420(this.f76757);
            this.f76759 = c12392.m30420(this.f76756);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52253(int i, int i2) {
        int i3;
        int i4;
        if (this.f76760) {
            InterfaceC7785 interfaceC7785 = this.f76758;
            C12392 c12392 = this.f76761;
            if (interfaceC7785 == c12392.m30436() && this.f76753 == c12392.m30436().mo26548() && c12392.f37245.f73236 && c12392.isAttachedToWindow() && c12392.m30483() && !c12392.f37211 && i == i2 && (i == (i3 = this.f76757) || i == i3 + 1 || i == (i4 = this.f76756) || i == i4 + 1)) {
                return;
            }
        }
        m52265();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m52263() {
        return this.f76765;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52261() {
        this.f76760 = false;
        this.f76765 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m52265() {
        this.f76760 = false;
        InterfaceC7785 interfaceC7785 = this.f76758;
        C12392 c12392 = this.f76761;
        if (interfaceC7785 != c12392.m30436()) {
            this.f76758 = null;
        }
        if (this.f76765) {
            this.f76765 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c12392.postInvalidate();
            } else {
                c12392.invalidate();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52250() {
        return this.f76762;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52258() {
        return this.f76759;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52262() {
        return this.f76757;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52264() {
        return this.f76756;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52256(Canvas canvas, int i, int i2, float f, float f2, C1539 c1539, C22686 c22686, InterfaceC10961 interfaceC10961) {
        if (this.f76765 && this.f76761.isFocused()) {
            int i3 = this.f76757;
            if (i <= i3 && i3 < i2) {
                C20113 c20113 = (C20113) interfaceC10961;
                float m46370 = c20113.m46370(i, 0.0f, i3);
                int i4 = this.f76757;
                float m463702 = c20113.m46370(i4, 0.0f, i4 + 1);
                c1539.setColor(c22686.f73239);
                canvas.drawRect(m46370 + 0.0f, f, m46370 + m463702, f2, c1539);
            }
            int i5 = this.f76756;
            if (i > i5 || i5 >= i2) {
                return;
            }
            C20113 c201132 = (C20113) interfaceC10961;
            float m463703 = c201132.m46370(i, 0.0f, i5);
            int i6 = this.f76756;
            float m463704 = c201132.m46370(i6, 0.0f, i6 + 1);
            c1539.setColor(c22686.f73239);
            canvas.drawRect(m463703 + 0.0f, f, m463703 + m463704, f2, c1539);
        }
    }
}
