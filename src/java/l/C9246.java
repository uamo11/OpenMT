package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: 43ZG */
/* renamed from: l.ۢ֨֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9246 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16300 f28013;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f28015;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f28016;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28014 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28012 = 0;

    public C9246(ArrayList arrayList) {
        this.f28013 = C16300.m38334("", (C19954) null);
        this.f28016 = 0;
        this.f28015 = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        m23715(0, 0);
        C16300 c16300 = (C16300) arrayList.get(0);
        this.f28013 = c16300;
        this.f28016 = c16300.m38335().length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9246 m23714(C17712 c17712) {
        return new C9246(c17712.m41446());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char m23725() {
        if (this.f28012 < this.f28016) {
            return this.f28013.m38335().charAt(this.f28012);
        }
        return this.f28014 < this.f28015.size() + (-1) ? '\n' : (char) 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23728() {
        if (this.f28012 >= this.f28016) {
            return this.f28014 < this.f28015.size() + (-1) ? 10 : 0;
        }
        char charAt = this.f28013.m38335().charAt(this.f28012);
        if (!Character.isHighSurrogate(charAt) || this.f28012 + 1 >= this.f28016) {
            return charAt;
        }
        char charAt2 = this.f28013.m38335().charAt(this.f28012 + 1);
        return Character.isLowSurrogate(charAt2) ? Character.toCodePoint(charAt, charAt2) : charAt;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m23727() {
        int i = this.f28012;
        if (i <= 0) {
            return this.f28014 > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char charAt = this.f28013.m38335().charAt(i2);
        if (Character.isLowSurrogate(charAt) && i2 > 0) {
            char charAt2 = this.f28013.m38335().charAt(i - 2);
            if (Character.isHighSurrogate(charAt2)) {
                return Character.toCodePoint(charAt2, charAt);
            }
        }
        return charAt;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23720() {
        return this.f28012 < this.f28016 || this.f28014 < this.f28015.size() - 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23723() {
        C16300 m38334;
        int i = this.f28012 + 1;
        this.f28012 = i;
        if (i > this.f28016) {
            int i2 = this.f28014 + 1;
            this.f28014 = i2;
            List list = this.f28015;
            if (i2 < list.size()) {
                m38334 = (C16300) list.get(this.f28014);
            } else {
                m38334 = C16300.m38334("", (C19954) null);
            }
            this.f28013 = m38334;
            this.f28016 = m38334.m38335().length();
            this.f28012 = 0;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23726(char c) {
        if (m23725() != c) {
            return false;
        }
        m23723();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23721(String str) {
        int i = this.f28012;
        if (i < this.f28016 && str.length() + i <= this.f28016) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.f28013.m38335().charAt(this.f28012 + i2) == str.charAt(i2)) {
                }
            }
            this.f28012 = str.length() + this.f28012;
            return true;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23722(char c) {
        int i = 0;
        while (m23725() == c) {
            i++;
            m23723();
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23717(InterfaceC7129 interfaceC7129) {
        int i = 0;
        while (((C13478) interfaceC7129).m32516(m23725())) {
            i++;
            m23723();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        return r0;
     */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m23729() {
        /*
            r3 = this;
            r0 = 0
        L1:
            char r1 = r3.m23725()
            r2 = 32
            if (r1 == r2) goto Ld
            switch(r1) {
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto Ld;
                case 12: goto Ld;
                case 13: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r0
        Ld:
            int r0 = r0 + 1
            r3.m23723()
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9246.m23729():int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23716(char c) {
        int i = 0;
        while (true) {
            char m23725 = m23725();
            if (m23725 == 0) {
                return -1;
            }
            if (m23725 == c) {
                return i;
            }
            i++;
            m23723();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20535 m23724() {
        return new C20535(this.f28014, this.f28012);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23719(C20535 c20535) {
        int i = c20535.f66144;
        int i2 = c20535.f66143;
        m23715(i, i2);
        int i3 = c20535.f66144;
        this.f28014 = i3;
        this.f28012 = i2;
        C16300 c16300 = (C16300) this.f28015.get(i3);
        this.f28013 = c16300;
        this.f28016 = c16300.m38335().length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17712 m23718(C20535 c20535, C20535 c205352) {
        int i = c20535.f66144;
        int i2 = c20535.f66143;
        int i3 = c205352.f66144;
        int i4 = c205352.f66143;
        List list = this.f28015;
        if (i != i3) {
            C17712 c17712 = new C17712();
            C16300 c16300 = (C16300) list.get(i);
            c17712.m41445(c16300.m38336(i2, c16300.m38335().length()));
            while (true) {
                i++;
                if (i < i3) {
                    c17712.m41445((C16300) list.get(i));
                } else {
                    c17712.m41445(((C16300) list.get(i3)).m38336(0, i4));
                    return c17712;
                }
            }
        } else {
            C16300 c163002 = (C16300) list.get(i);
            CharSequence subSequence = c163002.m38335().subSequence(i2, i4);
            C19954 m38337 = c163002.m38337();
            C16300 m38334 = C16300.m38334(subSequence, m38337 != null ? m38337.m46025(i2, i4) : null);
            C17712 c177122 = new C17712();
            c177122.m41445(m38334);
            return c177122;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23715(int i, int i2) {
        List list = this.f28015;
        if (i < 0 || i >= list.size()) {
            StringBuilder m32308 = C13325.m32308(i, "Line index ", " out of range, number of lines: ");
            m32308.append(list.size());
            throw new IllegalArgumentException(m32308.toString());
        }
        C16300 c16300 = (C16300) list.get(i);
        if (i2 < 0 || i2 > c16300.m38335().length()) {
            StringBuilder m323082 = C13325.m32308(i2, "Index ", " out of range, line length: ");
            m323082.append(c16300.m38335().length());
            throw new IllegalArgumentException(m323082.toString());
        }
    }
}
