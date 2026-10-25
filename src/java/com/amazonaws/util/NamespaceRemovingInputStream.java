package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f841;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f842;

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f842 = new byte[200];
        this.f841 = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        m281();
        int read = ((FilterInputStream) this).in.read();
        if (read != 120 || this.f841) {
            return read;
        }
        this.f842[0] = (byte) read;
        ((FilterInputStream) this).in.mark(this.f842.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f842;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f842, 0, read2 + 1, StringUtils.f844);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        int i = -1;
        if (stringPrefixSlicer.m786("xmlns")) {
            stringPrefixSlicer.m788();
            if (stringPrefixSlicer.m786("=")) {
                stringPrefixSlicer.m788();
                if (stringPrefixSlicer.m786("\"") && stringPrefixSlicer.m787()) {
                    i = str.length() - stringPrefixSlicer.m785().length();
                }
            }
        }
        if (i <= 0) {
            return read;
        }
        for (int i2 = 0; i2 < i - 1; i2++) {
            ((FilterInputStream) this).in.read();
        }
        int read3 = ((FilterInputStream) this).in.read();
        this.f841 = true;
        return read3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) read;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final class StringPrefixSlicer {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public String f843;

        public StringPrefixSlicer(String str) {
            this.f843 = str;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m785() {
            return this.f843;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m786(String str) {
            if (!this.f843.startsWith(str)) {
                return false;
            }
            this.f843 = this.f843.substring(str.length());
            return true;
        }

        /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final void m788() {
            if (this.f843.startsWith(" ")) {
                while (this.f843.startsWith(" ")) {
                    this.f843 = this.f843.substring(1);
                }
            }
        }

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final boolean m787() {
            int indexOf = this.f843.indexOf("\"");
            if (indexOf < 0) {
                return false;
            }
            this.f843 = this.f843.substring(indexOf + 1);
            return true;
        }
    }
}
