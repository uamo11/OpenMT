package l;

import java.nio.ByteBuffer;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: M5FD */
/* renamed from: l.ᩳܳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18118 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56387;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56388;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14589 f56389;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f56390;

    public C18118(byte[] bArr) {
        C14589 c14589 = (C14589) C15399.m36436(((C23140) C15399.m36436(ByteBuffer.wrap(bArr), C23140.class)).f74394.m51340(), C14589.class);
        this.f56389 = c14589;
        this.f56390 = m42243(c14589.f44672);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final X509Certificate[] m42246() {
        List list = this.f56390;
        if (list.isEmpty()) {
            return null;
        }
        return (X509Certificate[]) list.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0178, code lost:
    
        if (r9.verify(r7) == false) goto L81;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m42245(byte[] r17) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18118.m42245(byte[]):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m42243(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ByteBuffer m51340 = ((C23161) list.get(i)).m51340();
            byte[] bArr = new byte[m51340.remaining()];
            m51340.get(bArr);
            try {
                arrayList.add(new C16000(C2596.m8223(bArr), bArr));
            } catch (CertificateException e) {
                throw new CertificateException("Failed to parse certificate #" + (i + 1), e);
            }
        }
        return arrayList;
    }

    static {
        HashMap hashMap = new HashMap();
        f56387 = hashMap;
        hashMap.put("1.2.840.113549.2.5", "MD5");
        hashMap.put(C6207.f19043, "SHA-1");
        hashMap.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        hashMap.put(C6207.f19042, XMSSKeyParameters.SHA_256);
        hashMap.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        hashMap.put("2.16.840.1.101.3.4.2.3", XMSSKeyParameters.SHA_512);
        HashMap hashMap2 = new HashMap();
        f56388 = hashMap2;
        hashMap2.put("1.2.840.113549.1.1.4", "MD5withRSA");
        hashMap2.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        hashMap2.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        hashMap2.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        hashMap2.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        hashMap2.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        hashMap2.put("1.2.840.10040.4.3", "SHA1withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        hashMap2.put(C6207.f19039, "SHA256withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.3", "SHA384withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.4", "SHA512withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.5", "SHA3-224withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.6", "SHA3-256withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.7", "SHA3-384withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.8", "SHA3-512withDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.9", "SHA3-224withECDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.10", "SHA3-256withECDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.11", "SHA3-384withECDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.12", "SHA3-512withECDSA");
        hashMap2.put("2.16.840.1.101.3.4.3.13", "SHA3-224withRSA");
        hashMap2.put("2.16.840.1.101.3.4.3.14", "SHA3-256withRSA");
        hashMap2.put("2.16.840.1.101.3.4.3.15", "SHA3-384withRSA");
        hashMap2.put("2.16.840.1.101.3.4.3.16", "SHA3-512withRSA");
        hashMap2.put("1.2.840.10045.4.1", "SHA1withECDSA");
        hashMap2.put("1.2.840.10045.4.3.1", "SHA224withECDSA");
        hashMap2.put("1.2.840.10045.4.3.2", "SHA256withECDSA");
        hashMap2.put("1.2.840.10045.4.3.3", "SHA384withECDSA");
        hashMap2.put("1.2.840.10045.4.3.4", "SHA512withECDSA");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42242(String str) {
        String str2 = (String) f56387.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C20094.m46315("Unsupported digest algorithm: ", str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42244(String str) {
        return (String) f56388.get(str);
    }
}
