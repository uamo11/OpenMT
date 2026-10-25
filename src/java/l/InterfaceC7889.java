package l;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* compiled from: 54YN */
/* renamed from: l.۠ۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public interface InterfaceC7889 extends Closeable, SeekableByteChannel {
    int available();

    void flush();

    long getFilePointer();

    String getName();

    boolean isClosed();

    long length();

    int read();

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    int read(ByteBuffer byteBuffer);

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    void seek(long j);

    int skipBytes(int i);

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    int mo21172();

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    InterfaceC2245 mo21173();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    C23411 mo21174();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    int mo21175(int i, int i2, byte[] bArr);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    C23411 mo21176(long j, long j2);
}
