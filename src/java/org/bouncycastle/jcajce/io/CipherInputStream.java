package org.bouncycastle.jcajce.io;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import l.C0794;
import l.InterfaceC14905;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* loaded from: classes.dex */
public class CipherInputStream extends FilterInputStream implements InterfaceC14905 {
    public byte[] buf;
    public int bufOff;
    public final Cipher cipher;
    public boolean finalized;
    public final byte[] inputBuffer;
    public int maxBuf;
    public boolean nextChunkCalled;

    public CipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.inputBuffer = new byte[512];
        this.finalized = false;
        this.nextChunkCalled = false;
        this.cipher = cipher;
    }

    private byte[] finaliseCipher() {
        try {
            if (!this.nextChunkCalled) {
                nextChunk();
            }
            if (this.finalized) {
                return null;
            }
            this.finalized = true;
            return this.cipher.doFinal();
        } catch (GeneralSecurityException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        }
    }

    private int nextChunk() {
        if (this.finalized) {
            return -1;
        }
        this.nextChunkCalled = true;
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i = this.maxBuf;
            if (i != 0) {
                return i;
            }
            int read = ((FilterInputStream) this).in.read(this.inputBuffer);
            if (read == -1) {
                byte[] finaliseCipher = finaliseCipher();
                this.buf = finaliseCipher;
                if (finaliseCipher == null || finaliseCipher.length == 0) {
                    return -1;
                }
                int length = finaliseCipher.length;
                this.maxBuf = length;
                return length;
            }
            byte[] update = this.cipher.update(this.inputBuffer, 0, read);
            this.buf = update;
            if (update != null) {
                this.maxBuf = update.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterInputStream) this).in.close();
            this.bufOff = 0;
            this.maxBuf = 0;
        } finally {
            if (!this.finalized) {
                finaliseCipher();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        byte[] bArr = this.buf;
        int i = this.bufOff;
        this.bufOff = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.buf, this.bufOff, bArr, i, min);
        this.bufOff += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j, available());
        this.bufOff += min;
        return min;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
