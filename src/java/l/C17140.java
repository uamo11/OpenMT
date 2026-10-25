package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: S7BH */
/* renamed from: l.ܿۚۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17140 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m40234(InterfaceC2592 interfaceC2592, String str) {
        List list = (List) ((HashMap) ((C15996) interfaceC2592).m37813()).get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40231(InterfaceC2592 interfaceC2592, String str) {
        Map m37811 = ((C15996) interfaceC2592).m37811();
        if (m37811 == null) {
            return null;
        }
        HashMap hashMap = (HashMap) m37811;
        if (hashMap.isEmpty()) {
            return null;
        }
        String str2 = (String) hashMap.get(str);
        return str2 != null ? str2 : (String) hashMap.get(str.toLowerCase(Locale.ROOT));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m40237(C15996 c15996) {
        EnumC4003 m37807 = c15996.m37807();
        if (EnumC4003.POST.equals(m37807) || EnumC4003.PUT.equals(m37807)) {
            return true;
        }
        return m40233(c15996);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40233(C15996 c15996) {
        if (!m40235(c15996)) {
            String m40231 = m40231(c15996, "content-length");
            if (m40231 != null) {
                String trim = m40231.trim();
                if (!TextUtils.isEmpty(trim)) {
                    int i = 0;
                    while (true) {
                        if (i < trim.length()) {
                            char charAt = trim.charAt(i);
                            if (charAt < '0' || charAt > '9') {
                                break;
                            }
                            i++;
                        } else {
                            try {
                                if (Long.parseLong(trim) > 0) {
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40235(C15996 c15996) {
        String m40231 = m40231(c15996, "transfer-encoding");
        return (TextUtils.isEmpty(m40231) || TextUtils.isEmpty(m40231.trim())) ? false : true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m40236(C15996 c15996) {
        String m40231 = m40231(c15996, "content-length");
        if (TextUtils.isEmpty(m40231)) {
            throw new C10791(R.string.MT_Protector_res_0x7f120865, new Object[0]);
        }
        String trim = m40231.trim();
        if (TextUtils.isEmpty(trim)) {
            throw new C10791(R.string.MT_Protector_res_0x7f120863, new Object[0]);
        }
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (charAt < '0' || charAt > '9') {
                throw new C10791(R.string.MT_Protector_res_0x7f120863, new Object[0]);
            }
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused) {
            throw new C10791(R.string.MT_Protector_res_0x7f120863, new Object[0]);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m40238(C15996 c15996) {
        int parseInt;
        String m40231 = m40231(c15996, "content-length");
        if (TextUtils.isEmpty(m40231)) {
            parseInt = -1;
        } else {
            try {
                parseInt = Integer.parseInt(m40231);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(parseInt, 0));
        byte[] bArr = new byte[1024];
        InputStream m37810 = c15996.m37810();
        if (m37810 == null) {
            return "";
        }
        while (parseInt != 0) {
            int read = m37810.read(bArr, 0, parseInt > 0 ? Math.min(1024, parseInt) : 1024);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            if (parseInt > 0) {
                parseInt -= read;
            }
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m40239(C15996 c15996) {
        if (c15996.m37808()) {
            return c15996.m37809();
        }
        try {
            String m40238 = m40238(c15996);
            if (!m40238.isEmpty() || !TextUtils.isEmpty(m40231(c15996, "content-length"))) {
                c15996.m37801(m40238);
                return m40238;
            }
        } catch (IOException | RuntimeException unused) {
        }
        HashMap hashMap = new HashMap();
        c15996.m37802(hashMap);
        String str = (String) hashMap.get("postData");
        if (str == null) {
            str = (String) hashMap.get("content");
        }
        if (str == null) {
            str = "";
        }
        c15996.m37801(str);
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17846 m40232(C15996 c15996, long j) {
        CoderResult decode;
        CoderResult flush;
        CoderResult decode2;
        if (j < 0) {
            throw new C16434();
        }
        InputStream m37810 = c15996.m37810();
        if (m37810 == null && j > 0) {
            throw new C16434();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            ByteBuffer allocate = ByteBuffer.allocate(o.a.t);
            CharBuffer allocate2 = CharBuffer.allocate(8192);
            long j2 = j;
            while (j2 > 0) {
                try {
                    int read = m37810.read(bArr, 0, (int) Math.min(8192, j2));
                    if (read < 0) {
                        throw new C16434();
                    }
                    if (read == 0) {
                        throw new C16434();
                    }
                    messageDigest.update(bArr, 0, read);
                    allocate.put(bArr, 0, read);
                    allocate.flip();
                    do {
                        decode2 = onUnmappableCharacter.decode(allocate, allocate2, false);
                        allocate2.flip();
                        sb.append((CharSequence) allocate2);
                        allocate2.clear();
                    } while (decode2.isOverflow());
                    if (decode2.isError()) {
                        decode2.throwException();
                    }
                    allocate.compact();
                    j2 -= read;
                } catch (IOException e) {
                    throw new C16434(e);
                }
            }
            allocate.flip();
            do {
                decode = onUnmappableCharacter.decode(allocate, allocate2, true);
                allocate2.flip();
                sb.append((CharSequence) allocate2);
                allocate2.clear();
            } while (decode.isOverflow());
            if (decode.isError()) {
                decode.throwException();
            }
            do {
                flush = onUnmappableCharacter.flush(allocate2);
                allocate2.flip();
                sb.append((CharSequence) allocate2);
                allocate2.clear();
            } while (flush.isOverflow());
            if (flush.isError()) {
                flush.throwException();
            }
            String sb2 = sb.toString();
            c15996.m37801(sb2);
            return new C17846(sb2, messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
