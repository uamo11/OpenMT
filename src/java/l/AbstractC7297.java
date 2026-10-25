package l;

import java.io.InputStream;

/* compiled from: J9OT */
/* renamed from: l.۟ۜۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC7297 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f22399;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22400 = 100;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22401 = Integer.MAX_VALUE;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2067 f22402;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m19546(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m19549(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public abstract int mo19550();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract String mo19551();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC8522 mo19552(InterfaceC12050 interfaceC12050, C17798 c17798);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19554(int i);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19555(int i, InterfaceC9228 interfaceC9228, C17798 c17798);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19556(InterfaceC9228 interfaceC9228, C17798 c17798);

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract long mo19557();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public abstract int mo19558();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract long mo19559();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract int mo19560();

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public abstract String mo19561();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public abstract float mo19562();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public abstract long mo19563();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo19564();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo19565(int i);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5886 mo19566();

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract int mo19567();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract int mo19568();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo19569();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo19570(int i);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19571();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19572();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19573(int i);

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract int mo19574();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public abstract long mo19575();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo19576();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract int mo19577();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract long mo19578();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract double mo19579();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC7297 m19547(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C13997.f41722;
            return m19548(false, 0, bArr.length, bArr);
        }
        return new C22819(inputStream);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC7297 m19548(boolean z, int i, int i2, byte[] bArr) {
        C11531 c11531 = new C11531(z, i, i2, bArr);
        try {
            c11531.mo19570(i2);
            return c11531;
        } catch (C2025 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19553() {
        if (this.f22399 >= this.f22400) {
            throw new C2025("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public AbstractC7297(int i) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19545(InputStream inputStream, int i) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw C2025.m6584();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C2025.m6584();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw C2025.m6580();
    }
}
