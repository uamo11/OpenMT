package l;

import java.io.UnsupportedEncodingException;

/* compiled from: N5OE */
/* renamed from: l.᩶ۙ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19934 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f64535;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[][] f64536;

    public C19934(C10720 c10720) {
        c10720.m26904();
        c10720.m26904();
        c10720.m26904();
        int m26904 = c10720.m26904();
        this.f64535 = new String[m26904];
        this.f64536 = new byte[m26904][];
        for (int i = 0; i < m26904; i++) {
            int m269042 = c10720.m26904();
            try {
                this.f64535[i] = new String(c10720.m26902(m269042), 0, m269042 - 1, "US-ASCII");
                this.f64536[i] = c10720.m26902(20);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
