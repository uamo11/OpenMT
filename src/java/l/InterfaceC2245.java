package l;

import java.io.Closeable;
import java.nio.channels.FileChannel;

/* compiled from: W4H2 */
/* renamed from: l.ۖۖܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public interface InterfaceC2245 extends Closeable {
    String getName();

    boolean isClosed();

    long length();

    long position();

    int read(byte[] bArr, int i, int i2);

    void seek(long j);

    void setLength(long j);

    void write(byte[] bArr, int i, int i2);

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    FileChannel mo7436();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    InterfaceC2245 mo7437();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    InterfaceC2245 mo7438(long j, long j2);

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    void mo7439();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    InterfaceC2245 mo7440(long j, long j2);

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    boolean mo7441();
}
