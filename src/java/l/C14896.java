package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: 43ZE */
/* renamed from: l.ܶ֨۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14896 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f45448;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45449 = 0;

    public C14896(int i) {
        this.f45448 = new byte[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35348(int i) {
        byte[] m17574 = C6322.m17574(this.f45449, this.f45448);
        this.f45448 = m17574;
        int i2 = this.f45449;
        this.f45449 = i2 + 1;
        m17574[i2] = (byte) i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35349(int i, int i2, byte[] bArr) {
        byte[] m17574 = C6322.m17574(this.f45449 + i2, this.f45448);
        this.f45448 = m17574;
        System.arraycopy(bArr, i, m17574, this.f45449, i2);
        this.f45449 += i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35351(int i) {
        byte[] m17574 = C6322.m17574(this.f45449 + 1, this.f45448);
        this.f45448 = m17574;
        int i2 = this.f45449;
        m17574[i2] = (byte) ((i >> 8) & 255);
        m17574[i2 + 1] = (byte) (i & 255);
        this.f45449 = i2 + 2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35352(int i) {
        byte[] m17574 = C6322.m17574(this.f45449 + 3, this.f45448);
        this.f45448 = m17574;
        int i2 = this.f45449;
        m17574[i2] = (byte) ((i >> 24) & 255);
        m17574[i2 + 1] = (byte) ((i >> 16) & 255);
        m17574[i2 + 2] = (byte) ((i >> 8) & 255);
        m17574[i2 + 3] = (byte) (i & 255);
        this.f45449 = i2 + 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35350(InputStream inputStream) {
        try {
            int i = this.f45449;
            int available = inputStream.available();
            byte[] m17574 = C6322.m17574(this.f45449 + available, this.f45448);
            this.f45448 = m17574;
            int read = inputStream.read(m17574, i, available);
            while (read != -1) {
                i += read;
                byte[] m175742 = C6322.m17574(i, this.f45448);
                this.f45448 = m175742;
                read = inputStream.read(m175742, i, m175742.length - i);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35353(int i) {
        byte[] bArr = this.f45448;
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char m35354(int i) {
        byte[] bArr = this.f45448;
        return (char) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }
}
