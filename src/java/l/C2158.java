package l;

import com.alipay.sdk.m.y.q;
import java.io.Writer;

/* compiled from: Q7P2 */
/* renamed from: l.֫᩻ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2158 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f7143 = 31;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Writer f7148;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f7147 = {'\\', '\"'};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f7141 = {'\\', '\\'};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f7142 = {'\\', 'n'};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final char[] f7145 = {'\\', 'r'};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final char[] f7139 = {'\\', 't'};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f7146 = {'\\', 'u', '2', '0', '2', '8'};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final char[] f7140 = {'\\', 'u', '2', '0', '2', '9'};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final char[] f7144 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C2158(Writer writer) {
        this.f7148 = writer;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m7120(String str) {
        this.f7148.write(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m7127(String str) {
        this.f7148.write(str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m7125(String str) {
        this.f7148.write(34);
        m7118(str);
        this.f7148.write(34);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo7119() {
        this.f7148.write(91);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7117() {
        this.f7148.write(93);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo7122() {
        this.f7148.write(44);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo7121() {
        this.f7148.write(123);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo7124() {
        this.f7148.write(q.h);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m7123(String str) {
        this.f7148.write(34);
        m7118(str);
        this.f7148.write(34);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo7126() {
        this.f7148.write(58);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo7128() {
        this.f7148.write(44);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m7118(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] m7116 = m7116(str.charAt(i2));
            if (m7116 != null) {
                this.f7148.write(str, i, i2 - i);
                this.f7148.write(m7116);
                i = i2 + 1;
            }
        }
        this.f7148.write(str, i, length - i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m7116(char c) {
        if (c > '\\') {
            if (c < 8232 || c > 8233) {
                return null;
            }
            return c == 8232 ? f7146 : f7140;
        }
        if (c == '\\') {
            return f7141;
        }
        if (c > '\"') {
            return null;
        }
        if (c == '\"') {
            return f7147;
        }
        if (c > 31) {
            return null;
        }
        if (c == '\n') {
            return f7142;
        }
        if (c == '\r') {
            return f7145;
        }
        if (c == '\t') {
            return f7139;
        }
        char[] cArr = f7144;
        return new char[]{'\\', 'u', '0', '0', cArr[(c >> 4) & 15], cArr[c & 15]};
    }
}
