package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.bouncycastle.asn1.BERTags;

/* compiled from: W73I */
/* renamed from: l.ۖۨܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2511 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f7977;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f7980;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7981;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7983;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f7984;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Inflater f7978 = new Inflater(true);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CRC32 f7985 = new CRC32();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f7982 = new byte[65536];

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f7979 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2511(InputStream inputStream) {
        this.f7977 = new PushbackInputStream(inputStream, 65536);
        try {
            m8013();
        } catch (Throwable th) {
            this.f7978.end();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f7979;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Inflater inflater = this.f7978;
        if (this.f7984) {
            throw new IOException("Stream closed");
        }
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        while (!this.f7983) {
            try {
                int inflate = inflater.inflate(bArr, i, i2);
                CRC32 crc32 = this.f7985;
                if (inflate > 0) {
                    crc32.update(bArr, i, inflate);
                    this.f7980 = (this.f7980 + inflate) & 4294967295L;
                    return inflate;
                }
                boolean finished = inflater.finished();
                byte[] bArr2 = this.f7982;
                PushbackInputStream pushbackInputStream = this.f7977;
                if (!finished) {
                    if (inflater.needsDictionary()) {
                        throw new ZipException("GZIP stream requires a preset dictionary");
                    }
                    if (!inflater.needsInput()) {
                        throw new ZipException("GZIP inflater made no progress");
                    }
                    int read = pushbackInputStream.read(bArr2);
                    this.f7981 = read;
                    if (read == -1) {
                        throw new EOFException("Unexpected end of GZIP compressed data");
                    }
                    inflater.setInput(bArr2, 0, read);
                } else {
                    int remaining = inflater.getRemaining();
                    if (remaining > 0) {
                        pushbackInputStream.unread(bArr2, this.f7981 - remaining, remaining);
                    }
                    long m8014 = m8014();
                    long m80142 = m8014();
                    if (m8014 != crc32.getValue()) {
                        throw new ZipException("Corrupt GZIP trailer CRC");
                    }
                    if (m80142 != this.f7980) {
                        throw new ZipException("Corrupt GZIP trailer size");
                    }
                    int read2 = pushbackInputStream.read();
                    if (read2 == -1) {
                        this.f7983 = true;
                    } else {
                        int read3 = pushbackInputStream.read();
                        if (read3 == -1 || read2 != 31 || read3 != 139) {
                            throw new ZipException("Trailing data after GZIP stream");
                        }
                        pushbackInputStream.unread(read3);
                        pushbackInputStream.unread(read2);
                        inflater.reset();
                        m8013();
                    }
                }
            } catch (DataFormatException e) {
                ZipException zipException = new ZipException("Invalid GZIP compressed data");
                zipException.initCause(e);
                throw zipException;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8013() {
        CRC32 crc32 = new CRC32();
        if (m8012(crc32) != 31 || m8012(crc32) != 139) {
            throw new ZipException("Invalid GZIP header");
        }
        if (m8012(crc32) != 8) {
            throw new ZipException("Unsupported GZIP compression method");
        }
        int m8012 = m8012(crc32);
        if ((m8012 & BERTags.FLAGS) != 0) {
            throw new ZipException("Reserved GZIP flags are set");
        }
        for (int i = 0; i < 6; i++) {
            m8012(crc32);
        }
        if ((m8012 & 4) != 0) {
            int m80122 = m8012(crc32) | (m8012(crc32) << 8);
            for (int i2 = 0; i2 < m80122; i2++) {
                m8012(crc32);
            }
        }
        if ((m8012 & 8) != 0) {
            while (m8012(crc32) != 0) {
            }
        }
        if ((m8012 & 16) != 0) {
            while (m8012(crc32) != 0) {
            }
        }
        if ((m8012 & 2) != 0) {
            if (((m8011("Unexpected end of GZIP header CRC") << 8) | m8011("Unexpected end of GZIP header CRC")) != (((int) crc32.getValue()) & 65535)) {
                throw new ZipException("Corrupt GZIP header CRC");
            }
        }
        this.f7985.reset();
        this.f7980 = 0L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8012(CRC32 crc32) {
        int m8011 = m8011("Unexpected end of GZIP header");
        crc32.update(m8011);
        return m8011;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m8014() {
        return m8011("Unexpected end of GZIP trailer") | (m8011("Unexpected end of GZIP trailer") << 8) | (m8011("Unexpected end of GZIP trailer") << 16) | (m8011("Unexpected end of GZIP trailer") << 24);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8011(String str) {
        int read = this.f7977.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException(str);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7984) {
            return;
        }
        this.f7984 = true;
        this.f7978.end();
        this.f7977.close();
    }
}
