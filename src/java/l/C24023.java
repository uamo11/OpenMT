package l;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: RAHB */
/* renamed from: l.᩻᩻ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24023 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77841;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f77842;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77843;

    public C24023(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f77842 = byteArray;
                this.f77843 = byteArray.length;
                this.f77841 = 0;
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52862() {
        return this.f77841;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte m52861() {
        int i = this.f77841;
        if (i >= this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        this.f77841 = i + 1;
        return this.f77842[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m52865() {
        return m52861();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52863(int i) {
        int i2 = this.f77841;
        if (i + i2 > this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f77842, i2, bArr, 0, i);
        this.f77841 += i;
        return new String(bArr, (i <= 0 || bArr[0] != 0) ? LocalizedMessage.DEFAULT_ENCODING : "UTF-16BE");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m52866(int i) {
        int i2 = this.f77841;
        if (i + i2 > this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f77842, i2, bArr, 0, i);
        this.f77841 += i;
        return new String(bArr, "UTF-16BE");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52868() {
        byte m52861 = m52861();
        return m52861 < 0 ? m52861 + 256 : m52861;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m52870() {
        return (((((m52868() << 8) + m52868()) << 8) + m52868()) << 8) + m52868();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52869() {
        return m52868() + (m52868() << 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52864(long j) {
        if (j > this.f77843 || j < 0) {
            throw new EOFException("Reached EOF, file size=" + this.f77843 + " offset=" + j);
        }
        this.f77841 = (int) j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52867(long j) {
        m52864(this.f77841 + j);
    }
}
