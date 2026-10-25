package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public enum IOUtils {
    ;


    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Log f834 = LogFactory.m302(IOUtils.class);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int f836 = 4096;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m780(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m781(InputStream inputStream) {
        return new String(m780(inputStream), StringUtils.f844);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m779(Closeable closeable, Log log) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (f834.mo293()) {
                    f834.mo292("Ignore failure in closing the Closeable", e);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m782(Closeable closeable, Log log) {
        m779(closeable, log);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m778(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
