package l;

import android.util.Base64;
import com.alipay.sdk.m.p.d;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.SecretKey;

/* compiled from: G8CV */
/* renamed from: l.ۖ᩵ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2732 implements InterfaceC2452, InterfaceC19043, InterfaceC20123 {
    @Override // l.InterfaceC20123
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16614 mo8479(C16614 c16614, SecretKey secretKey) {
        return c16614;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8476(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(i, i2);
        }
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return "";
        }
        int i3 = i2 - i;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(i + i4);
        }
        return new String(cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8478(String str, byte[] bArr) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqlaL2//kwVLAAn+mac25arQOjgrRXVr4kl2nrcaoW05YzgdQzyPvADHD1zv3gg33fS+wQlzfnvKUHDSxOFGHubeW36Qkk85sNIZuBZk5ezJx00OdZafzdC6wUr7mreDUlylJWEGbfVALtP8osW8gS1c8H2i4jsHvamAWpwsYR0QIDAQAB", 0)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(generatePublic);
            signature.update(bArr);
            return signature.verify(Base64.decode(str, 0));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        c11955.m29153(System.currentTimeMillis());
        c16040.m37918(c11955);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m8475(String str, boolean z) {
        try {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return Class.forName(str, true, ClassLoader.getSystemClassLoader());
            }
        } catch (Throwable th) {
            if (z) {
                System.err.println("Caught " + th);
            }
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8477(CharSequence charSequence, boolean z, int i, String str, int i2) {
        int i3;
        char upperCase;
        char upperCase2;
        if (i >= 0 && i <= charSequence.length() - i2 && str.length() - i2 >= 0) {
            while (i3 < i2) {
                char charAt = charSequence.charAt(i + i3);
                char charAt2 = str.charAt(i3);
                i3 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i3 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8474(String str, CharSequence charSequence, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        if (str.isEmpty()) {
            return Math.min(Math.max(0, i), charSequence.length());
        }
        int length = charSequence.length() - str.length();
        for (int max = Math.max(0, i); max <= length; max++) {
            if (m8477(charSequence, false, max, str, str.length())) {
                return max;
            }
        }
        return -1;
    }
}
