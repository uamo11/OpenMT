package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: Y4D9 */
/* renamed from: l.ۨܽ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11816 implements Serializable, Comparable {
    public static final long serialVersionUID = 1;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final char[] f35247 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11816 f35248 = m28897(new byte[0]);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient String f35249;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f35250;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient int f35251;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11816 m28901(String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C11816(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r5 = null;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11816 m28896(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11816.m28896(java.lang.String):l.ۨܽ֡");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C11816 c11816 = (C11816) obj;
        int mo2336 = mo2336();
        int mo23362 = c11816.mo2336();
        int min = Math.min(mo2336, mo23362);
        for (int i = 0; i < min; i++) {
            int mo2325 = mo2325(i) & 255;
            int mo23252 = c11816.mo2325(i) & 255;
            if (mo2325 != mo23252) {
                return mo2325 < mo23252 ? -1 : 1;
            }
        }
        if (mo2336 == mo23362) {
            return 0;
        }
        return mo2336 < mo23362 ? -1 : 1;
    }

    public C11816(byte[] bArr) {
        this.f35250 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11816 m28897(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new C11816((byte[]) bArr.clone());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11816 m28900(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C11816 c11816 = new C11816(str.getBytes(C21736.f69703));
        c11816.f35249 = str;
        return c11816;
    }

    /* renamed from: ᩴ */
    public String mo2335() {
        String str = this.f35249;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f35250, C21736.f69703);
        this.f35249 = str2;
        return str2;
    }

    /* renamed from: ֫ */
    public String mo2326() {
        return C3349.m10248(this.f35250);
    }

    /* renamed from: ܿ */
    public C11816 mo2334() {
        return m28899("MD5");
    }

    /* renamed from: ᩻ */
    public C11816 mo2337() {
        return m28899(XMSSKeyParameters.SHA_256);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C11816 m28899(String str) {
        try {
            return m28897(MessageDigest.getInstance(str).digest(this.f35250));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ۧ */
    public String mo2332() {
        byte[] bArr = this.f35250;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f35247;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11816 m28898(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m28895(str.charAt(i2)) << 4) + m28895(str.charAt(i2 + 1)));
        }
        return m28897(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28895(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* renamed from: ۡ */
    public C11816 mo2330() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f35250;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + UTF8.S_CS3);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + UTF8.S_CS3);
                    }
                }
                return new C11816(bArr2);
            }
            i++;
        }
    }

    /* renamed from: ۢ */
    public C11816 mo2331() {
        byte[] bArr = this.f35250;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(C3200.m9831(this.f35250.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("endIndex > length(")));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C11816(bArr2);
    }

    /* renamed from: ֫ */
    public byte mo2325(int i) {
        return this.f35250[i];
    }

    /* renamed from: ᩷ */
    public int mo2336() {
        return this.f35250.length;
    }

    /* renamed from: ܺ */
    public byte[] mo2333() {
        return (byte[]) this.f35250.clone();
    }

    /* renamed from: ֫ */
    public void mo2327(C12521 c12521) {
        byte[] bArr = this.f35250;
        c12521.write(bArr, 0, bArr.length);
    }

    /* renamed from: ֫ */
    public boolean mo2329(C11816 c11816, int i) {
        return c11816.mo2328(0, this.f35250, 0, i);
    }

    /* renamed from: ֫ */
    public boolean mo2328(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f35250;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = C21736.f69703;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11816) {
            C11816 c11816 = (C11816) obj;
            int mo2336 = c11816.mo2336();
            byte[] bArr = this.f35250;
            if (mo2336 == bArr.length && c11816.mo2328(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f35251;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f35250);
        this.f35251 = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f35250.length == 0) {
            return "[size=0]";
        }
        String mo2335 = mo2335();
        int length = mo2335.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = mo2335.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = mo2335.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i != -1) {
            String replace = mo2335.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i >= mo2335.length()) {
                return C4860.m14172("[text=", replace, "]");
            }
            return "[size=" + this.f35250.length + " text=" + replace + "…]";
        }
        if (this.f35250.length <= 64) {
            return "[hex=" + mo2332() + "]";
        }
        return "[size=" + this.f35250.length + " hex=" + mo2331().mo2332() + "…]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new IllegalArgumentException(C19370.m44628(readInt, "byteCount < 0: "));
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        C11816 c11816 = new C11816(bArr);
        try {
            Field declaredField = C11816.class.getDeclaredField("᩸");
            declaredField.setAccessible(true);
            declaredField.set(this, c11816.f35250);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f35250.length);
        objectOutputStream.write(this.f35250);
    }
}
