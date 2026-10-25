package l;

import java.io.EOFException;

/* compiled from: 498X */
/* renamed from: l.᩷ۗ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C20616 implements InterfaceC6504 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f66333;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66334 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC6504 f66335 = m47160();

    static {
        ApplicationC12518.m30701(148);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native InterfaceC2271 m47159(byte[] bArr);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private native InterfaceC6504 m47160();

    public C20616(byte[] bArr) {
        this.f66333 = bArr;
    }

    @Override // l.InterfaceC6504
    public final int read() {
        while (true) {
            InterfaceC6504 interfaceC6504 = this.f66335;
            if (interfaceC6504 == null) {
                return -1;
            }
            int read = interfaceC6504.read();
            if (read != -1) {
                return read;
            }
            this.f66335 = m47160();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m47161() {
        int read = read();
        if (read != -1) {
            return (byte) (read & 255);
        }
        throw new EOFException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47162() {
        return (m47161() & 255) | ((m47161() & 255) << 8) | ((m47161() & 255) << 16) | ((m47161() & 255) << 24);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47163() {
        return ((m47161() & 255) << 24) | ((m47161() & 255) << 16) | ((m47161() & 255) << 8) | (m47161() & 255);
    }
}
