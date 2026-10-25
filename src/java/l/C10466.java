package l;

import java.io.BufferedReader;

/* compiled from: 195F */
/* renamed from: l.ۤᩳ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10466 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13287 f31406;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f31409;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31408 = -2;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31407 = -2;

    public C10466(BufferedReader bufferedReader, C13287 c13287) {
        this.f31409 = bufferedReader;
        this.f31406 = c13287;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26345() {
        int m26344 = m26344();
        if (m26344 == -1) {
            return -1;
        }
        char c = (char) m26344;
        if (Character.isHighSurrogate(c)) {
            int m263442 = m26344();
            if (m263442 != -1) {
                char c2 = (char) m263442;
                if (Character.isLowSurrogate(c2)) {
                    return Character.toCodePoint(c, c2);
                }
            }
            this.f31407 = m263442;
        }
        return m26344;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26344() {
        int i = this.f31407;
        if (i != -2) {
            this.f31407 = -2;
            return i;
        }
        int i2 = this.f31408;
        BufferedReader bufferedReader = this.f31409;
        if (i2 != -2) {
            this.f31408 = -2;
        } else {
            i2 = bufferedReader.read();
        }
        if (i2 == -1) {
            return -1;
        }
        C13287 c13287 = this.f31406;
        if (i2 == 13) {
            int i3 = this.f31408;
            if (i3 != -2) {
                this.f31408 = -2;
            } else {
                i3 = bufferedReader.read();
            }
            if (i3 != 10) {
                if (c13287 != null) {
                    c13287.m32249("\r");
                }
                this.f31408 = i3;
                return 10;
            }
            if (c13287 != null) {
                c13287.m32249("\r\n");
                return 10;
            }
        } else {
            if (i2 != 10) {
                return i2;
            }
            if (c13287 != null) {
                c13287.m32249("\n");
            }
        }
        return 10;
    }
}
