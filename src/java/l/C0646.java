package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: O6SM */
/* renamed from: l.֡᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0646 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12704 f2495;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2496;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f2497;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2498;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f2499;

    public C0646(C12704 c12704, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > c12704.length()) {
            throw new IllegalArgumentException("Legacy page range exceeds joined text");
        }
        this.f2496 = i;
        this.f2497 = i2;
        this.f2498 = c12704.m32421(i);
        this.f2499 = c12704.m32421(i + i2);
        this.f2495 = new C12704(c12704.m32420(), c12704.m30979());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2659(int i) {
        this.f2495.length();
        if (i < -1 || i > this.f2497) {
            throw new IOException("Legacy coordinate exceeds active page");
        }
        if (i == -1) {
            return -1;
        }
        return this.f2496 + i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2660(InputStream inputStream, long j, InterfaceC19698 interfaceC19698) {
        int i;
        C12704 c12704 = this.f2495;
        try {
            c12704.length();
            C23930 c23930 = new C23930(j, inputStream);
            if (j != 0) {
                if (c23930.readInt() != -1568513661) {
                    throw new IOException("Invalid legacy position stack magic");
                }
                int readByte = c23930.readByte() | (c23930.readByte() << 8);
                if (c23930.m52707() != readByte * 8) {
                    throw new IOException("Invalid legacy position stack length");
                }
                for (int i2 = 0; i2 < readByte; i2++) {
                    int readInt = c23930.readInt();
                    int readInt2 = c23930.readInt();
                    int i3 = this.f2496;
                    int i4 = this.f2498;
                    c12704.length();
                    if (readInt >= 0 && readInt2 >= 0) {
                        i = (int) Math.min((Math.min(readInt, this.f2499 - i4) + i4 == i4 ? i3 : c12704.m32422(r6)) + readInt2, i3 + this.f2497);
                        interfaceC19698.mo13416(readInt, readInt2, i);
                    }
                    i = -1;
                    interfaceC19698.mo13416(readInt, readInt2, i);
                }
                c23930.m52709();
                inputStream.close();
                return;
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2495.close();
    }
}
