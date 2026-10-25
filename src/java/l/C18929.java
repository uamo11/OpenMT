package l;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: 21VN */
/* renamed from: l.ᩴᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18929 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f59646;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f59647;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f59648;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f59649;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23411 f59650;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f59651;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f59652;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18929(l.C23411 r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18929.<init>(l.᩻ۖܽ):void");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m43688() {
        return this.f59650.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43686(long j) {
        this.f59650.seek(j);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m43697() {
        return this.f59650.getFilePointer();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43692(int i) {
        if (i < 0) {
            throw new IOException(C19370.m44628(i, "Skip "));
        }
        C23411 c23411 = this.f59650;
        long filePointer = c23411.getFilePointer() + i;
        if (filePointer > c23411.length()) {
            throw new EOFException();
        }
        c23411.seek(filePointer);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43687(int i) {
        if (i < 0) {
            throw new IOException(C19370.m44628(i, "Read "));
        }
        long j = i;
        C23411 c23411 = this.f59650;
        if (j > c23411.length() - c23411.getFilePointer()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        c23411.m51858(bArr, 0, i);
        return bArr;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m43690() {
        C23411 c23411 = this.f59650;
        int read = c23411.read();
        int read2 = c23411.read();
        int read3 = c23411.read();
        int read4 = c23411.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        return (read4 << 24) | read | (read2 << 8) | (read3 << 16);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m43689() {
        C23411 c23411 = this.f59650;
        long read = c23411.read();
        long read2 = c23411.read();
        long read3 = c23411.read();
        long read4 = c23411.read();
        long read5 = c23411.read();
        long read6 = c23411.read();
        long read7 = c23411.read();
        long read8 = c23411.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        return (read8 << 56) | read | (read2 << 8) | (read3 << 16) | (read4 << 24) | (read5 << 32) | (read6 << 40) | (read7 << 48);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43698() {
        return this.f59652;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43694() {
        return this.f59649;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m43685() {
        return this.f59646;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m43691() {
        return this.f59647;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m43696() {
        return this.f59651;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m43693() {
        return this.f59648;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 m43695() {
        return this.f59650;
    }
}
