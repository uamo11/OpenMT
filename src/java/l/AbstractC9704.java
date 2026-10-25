package l;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: A9G4 */
/* renamed from: l.ۢܽۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC9704 implements Closeable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f29385;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f29386;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f29387;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: ֫ */
    public abstract int mo23238();

    /* renamed from: ۧ */
    public abstract int mo23239(byte[] bArr);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24673(C0097 c0097, int i) {
        this.f29387 = 0;
        byte[] bArr = this.f29386;
        if (bArr == null || bArr.length != 65536) {
            this.f29386 = new byte[65536];
        }
        byte[] bArr2 = this.f29386;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int mo23239 = mo23239(bArr2);
                c0097.m26077(mo23239, bArr2);
                this.f29385 += mo23239;
                this.f29387 += mo23239;
            } catch (IOException e) {
                throw new C10951(e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24672(C0097 c0097) {
        this.f29387 = 0;
        byte[] bArr = this.f29386;
        if (bArr == null || bArr.length != 65536) {
            this.f29386 = new byte[65536];
        }
        byte[] bArr2 = this.f29386;
        try {
            int mo23239 = mo23239(bArr2);
            c0097.m26077(mo23239, bArr2);
            this.f29385 += mo23239;
            this.f29387 += mo23239;
        } catch (IOException e) {
            throw new C10951(e);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m24675() {
        return this.f29385;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m24674() {
        return this.f29387;
    }
}
