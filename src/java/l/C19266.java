package l;

import java.security.MessageDigest;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: LA2F */
/* renamed from: l.᩵ۚ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19266 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f60640 = {75, 71, 83, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 35, 36, 37};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44449(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest m12977 = C4324.m12977();
        m12977.update(C9969.m25130(str));
        return m12977.digest();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m44453(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[8];
        MessageDigest m12979 = C4324.m12979();
        m12979.update(bArr2);
        m12979.update(bArr3, 0, 8);
        System.arraycopy(m12979.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m44448(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44450(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[24];
        MessageDigest m12981 = C4324.m12981(bArr);
        m12981.update(C9969.m25130(str2.toUpperCase()));
        m12981.update(C9969.m25130(str.toUpperCase()));
        MessageDigest m129812 = C4324.m12981(m12981.digest());
        m129812.update(bArr2);
        m129812.update(bArr3);
        m129812.digest(bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 8);
        return bArr4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44452(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        m44448(bArr3, bArr2, bArr4);
        return bArr4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44451(InterfaceC18663 interfaceC18663, String str, byte[] bArr) {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] m25128 = C9969.m25128(str, interfaceC18663.mo27540());
        int length = m25128.length;
        System.arraycopy(m25128, 0, bArr2, 0, length <= 14 ? length : 14);
        m44448(bArr2, f60640, bArr3);
        m44448(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44448(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C4324.m12980(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
