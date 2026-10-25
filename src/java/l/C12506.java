package l;

import java.io.InputStreamReader;

/* compiled from: Y6XM */
/* renamed from: l.۫ܺۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12506 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f37567 = new char[8192];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37568;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37569;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f37570;

    public C12506(InputStreamReader inputStreamReader) {
        this.f37570 = inputStreamReader;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30689(C12506 c12506) {
        int m30687 = c12506.m30687();
        if (m30687 < 0) {
            return -1;
        }
        char c = (char) m30687;
        if (Character.isLowSurrogate(c)) {
            throw new C6156();
        }
        if (!Character.isHighSurrogate(c)) {
            return m30687;
        }
        int m306872 = c12506.m30687();
        if (m306872 >= 0) {
            char c2 = (char) m306872;
            if (Character.isLowSurrogate(c2)) {
                return Character.toCodePoint(c, c2);
            }
        }
        throw new C6156();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m30687() {
        int read;
        do {
            int i = this.f37569;
            int i2 = this.f37568;
            char[] cArr = this.f37567;
            if (i >= i2) {
                read = this.f37570.read(cArr);
                this.f37568 = read;
                this.f37569 = 0;
            } else {
                this.f37569 = i + 1;
                return cArr[i];
            }
        } while (read >= 0);
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30688(C12506 c12506) {
        char c;
        char[] cArr = c12506.f37567;
        do {
            boolean z = false;
            while (true) {
                int i = c12506.f37569;
                if (i < c12506.f37568) {
                    c12506.f37569 = i + 1;
                    c = cArr[i];
                    if (z) {
                        break;
                    }
                    if (Character.isLowSurrogate(c)) {
                        throw new C6156();
                    }
                    if (Character.isHighSurrogate(c)) {
                        z = true;
                    }
                } else {
                    int read = c12506.f37570.read(cArr);
                    c12506.f37568 = read;
                    c12506.f37569 = 0;
                    if (read < 0) {
                        if (z) {
                            throw new C6156();
                        }
                        return;
                    }
                }
            }
        } while (Character.isLowSurrogate(c));
        throw new C6156();
    }
}
