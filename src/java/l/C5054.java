package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: H4SF */
/* renamed from: l.ۚۖ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5054 extends PushbackInputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final boolean f15887 = System.lineSeparator().equals("\r\n");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f15888 = System.lineSeparator().getBytes(StandardCharsets.US_ASCII);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15889;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C5054(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream, f15888.length + 1);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (((PushbackInputStream) this).in == null) {
            throw new IOException("Stream closed");
        }
        return ((PushbackInputStream) this).in.available() + (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (f15887) {
            return super.read();
        }
        return readInt();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (f15887) {
            return super.read(bArr, i, i2);
        }
        if (i2 < 1) {
            return 0;
        }
        int min = Math.min(i2, available());
        this.f15889 = min;
        if (min < 1) {
            this.f15889 = 1;
        }
        int readInt = readInt();
        if (readInt == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) readInt;
            int i5 = this.f15889 - 1;
            this.f15889 = i5;
            if (i5 <= 0 || (readInt = readInt()) == -1) {
                break;
            }
            i4 = i3;
        }
        return i3 - i;
    }

    private int readInt() {
        int read = super.read();
        if (read != 13) {
            return read;
        }
        int read2 = super.read();
        if (read2 != 10) {
            if (read2 != -1) {
                unread(read2);
            }
            return 13;
        }
        unread(f15888);
        this.f15889--;
        return super.read();
    }
}
