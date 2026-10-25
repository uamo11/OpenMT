package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: 22T1 */
/* renamed from: l.ܳۤۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14460 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f44309 = new AtomicReference();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f44310 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m34534() {
        try {
            return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m34532() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MessageDigest m34526() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34527(MessageDigest messageDigest, InputStream inputStream) {
        AtomicReference atomicReference = f44309;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, read);
                }
            } finally {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34529(MessageDigest messageDigest, MessageDigest messageDigest2, InputStream inputStream) {
        AtomicReference atomicReference = f44309;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
                messageDigest2.update(bArr, 0, read);
            } finally {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34528(MessageDigest messageDigest, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0 && charAt < 128) {
                messageDigest.update((byte) charAt);
            } else if (charAt < 2048) {
                messageDigest.update((byte) (((charAt >> 6) & 31) | 192));
                messageDigest.update((byte) ((charAt & '?') | 128));
            } else {
                messageDigest.update((byte) (((charAt >> '\f') & 15) | BERTags.FLAGS));
                messageDigest.update((byte) (((charAt >> 6) & 63) | 128));
                messageDigest.update((byte) ((charAt & '?') | 128));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34531(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f44310;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m34535(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string length is not even.");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int digit = Character.digit(str.charAt(i), 16);
            int digit2 = Character.digit(str.charAt(i + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("Invalid hex digit in input.");
            }
            bArr[i / 2] = (byte) ((digit << 4) + digit2);
        }
        return bArr;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34533(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (byte b : bArr) {
            if (i > 0) {
                cArr[i] = ':';
                i++;
            }
            int i2 = i + 1;
            char[] cArr2 = f44310;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34524(String str) {
        MessageDigest m34526 = m34526();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            m34526.update((byte) (str.charAt(i) & 255));
        }
        return m34531(m34526.digest());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34525(byte[] bArr) {
        MessageDigest m34526 = m34526();
        m34526.update(bArr);
        return m34531(m34526.digest());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34530(String str) {
        MessageDigest m34526 = m34526();
        m34526.update(str.getBytes(StandardCharsets.UTF_8));
        return m34531(m34526.digest());
    }
}
