package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: G4EL */
/* renamed from: l.᩶ۧ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20119 implements InterfaceC1274 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f65154;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short f65155;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65156;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65157;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f65158;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65159;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C20119(InterfaceC6171 interfaceC6171) {
        this.f65154 = interfaceC6171;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.f65159;
            InterfaceC6171 interfaceC6171 = this.f65154;
            if (i2 == 0) {
                interfaceC6171.skip(this.f65155);
                this.f65155 = (short) 0;
                if ((this.f65158 & 4) == 0) {
                    i = this.f65156;
                    int m13504 = C4596.m13504(interfaceC6171);
                    this.f65159 = m13504;
                    this.f65157 = m13504;
                    byte readByte = (byte) (interfaceC6171.readByte() & 255);
                    this.f65158 = (byte) (interfaceC6171.readByte() & 255);
                    Logger logger = C4596.f14658;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C18002.m42038(true, this.f65156, this.f65157, readByte, this.f65158));
                    }
                    readInt = interfaceC6171.readInt() & Integer.MAX_VALUE;
                    this.f65156 = readInt;
                    if (readByte != 9) {
                        C18002.m42040("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long mo4334 = interfaceC6171.mo4334(c12521, Math.min(8192L, i2));
                if (mo4334 != -1) {
                    this.f65159 = (int) (this.f65159 - mo4334);
                    return mo4334;
                }
            }
            return -1L;
        } while (readInt == i);
        C18002.m42040("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f65154.mo4333();
    }
}
