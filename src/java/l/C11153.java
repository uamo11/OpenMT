package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: G4D4 */
/* renamed from: l.ۧᩳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11153 implements InterfaceC1274 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f33480;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Inflater f33481;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33482;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33483;

    public C11153(InterfaceC6171 interfaceC6171, Inflater inflater) {
        this.f33480 = interfaceC6171;
        this.f33481 = inflater;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        boolean z;
        if (this.f33483) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f33481;
            boolean needsInput = inflater.needsInput();
            InterfaceC6171 interfaceC6171 = this.f33480;
            z = false;
            if (needsInput) {
                int i = this.f33482;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f33482 -= remaining;
                    ((C4097) interfaceC6171).skip(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                C4097 c4097 = (C4097) interfaceC6171;
                if (c4097.mo12308()) {
                    z = true;
                } else {
                    C18914 c18914 = c4097.f13029.f37624;
                    int i2 = c18914.f59597;
                    int i3 = c18914.f59600;
                    int i4 = i2 - i3;
                    this.f33482 = i4;
                    inflater.setInput(c18914.f59596, i3, i4);
                }
            }
            try {
                C18914 m30705 = c12521.m30705(1);
                int inflate = inflater.inflate(m30705.f59596, m30705.f59597, (int) Math.min(8192L, 8192 - m30705.f59597));
                if (inflate > 0) {
                    m30705.f59597 += inflate;
                    long j2 = inflate;
                    c12521.f37625 += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f33482;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f33482 -= remaining2;
                    ((C4097) interfaceC6171).skip(remaining2);
                }
                if (m30705.f59600 != m30705.f59597) {
                    return -1L;
                }
                c12521.f37624 = m30705.m43656();
                C19620.m45064(m30705);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f33480.mo4333();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33483) {
            return;
        }
        this.f33481.end();
        this.f33483 = true;
        ((C4097) this.f33480).close();
    }
}
