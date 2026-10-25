package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.p.d;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: 4AYU */
/* renamed from: l.ۢᩳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9757 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24738(AbstractC15440 abstractC15440, AbstractC13262 abstractC13262, boolean z, boolean z2, InterfaceC13077 interfaceC13077) {
        List<AbstractC15357> singletonList;
        InterfaceC0562 m52514;
        InterfaceC0562 m525142;
        char c;
        char c2;
        byte[] bArr;
        C18929 c18929;
        InterfaceC0562 interfaceC0562;
        C9030 c9030;
        byte[] bArr2;
        byte[] bArr3;
        int i;
        int i2;
        if (!z && !z2) {
            throw new RuntimeException();
        }
        if (interfaceC13077 != null) {
            interfaceC13077.mo13118(z, z2);
        }
        PublicKey publicKey = abstractC13262.m32197().getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm)) {
            if (((RSAKey) publicKey).getModulus().bitLength() <= 3072) {
                HashMap hashMap = AbstractC15357.f47068;
                singletonList = Collections.singletonList(new C1247(259, XMSSKeyParameters.SHA_256, d.a, "SHA256withRSA", null));
            } else {
                HashMap hashMap2 = AbstractC15357.f47068;
                singletonList = Collections.singletonList(new C1247(260, XMSSKeyParameters.SHA_512, d.a, "SHA512withRSA", null));
            }
        } else if ("DSA".equalsIgnoreCase(algorithm)) {
            HashMap hashMap3 = AbstractC15357.f47068;
            singletonList = Collections.singletonList(new C1247(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null));
        } else {
            if (!"EC".equalsIgnoreCase(algorithm)) {
                throw new InvalidKeyException(C20094.m46315("Unsupported key algorithm: ", algorithm));
            }
            HashMap hashMap4 = AbstractC15357.f47068;
            singletonList = Collections.singletonList(new C1247(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null));
        }
        C23411 m36513 = abstractC15440.m36513("rw");
        try {
            C18929 c189292 = new C18929(m36513);
            if (c189292.m43698()) {
                throw new C1637(R.string.MT_Protector_res_0x7f120b45);
            }
            InterfaceC0562 m12290 = C4091.m12290((InterfaceC0562) C5502.m15636(m36513, 0L, c189292.m43694()));
            InterfaceC0562 m12294 = C4091.m12294(C5502.m15636(m36513, c189292.m43685(), c189292.m43691()));
            long m43696 = c189292.m43696();
            C9030 m12291 = C4091.m12291(C5502.m15636(m36513, m43696, c189292.m43688() - m43696));
            int m43685 = (int) (c189292.m43685() - m12290.size());
            if (m43685 != 0) {
                byte[] m23289 = m12291.m23289();
                int m23288 = m12291.m23288() + 16;
                C22955.m51081(C22955.m51077(m23288, m23289) - m43685, m23288, m23289);
            }
            if (interfaceC13077 == null) {
                m52514 = m12294;
                m525142 = m12291;
            } else {
                C23825 c23825 = new C23825((m12290.size() + m12294.size() + m12291.size()) * singletonList.size(), interfaceC13077);
                m12290 = c23825.m52514(m12290);
                m52514 = c23825.m52514(m12294);
                m525142 = c23825.m52514(m12291);
            }
            InterfaceC17066 m38504 = C16360.m38504(interfaceC13077);
            boolean z3 = false;
            for (AbstractC15357 abstractC15357 : singletonList) {
                if (z3) {
                    InterfaceC0562[] interfaceC0562Arr = {m12290, m52514, m525142};
                    int i3 = 0;
                    for (int i4 = 3; i3 < i4; i4 = 3) {
                        interfaceC0562Arr[i3].reset();
                        i3++;
                    }
                }
                abstractC15357.mo4094(m12290, m52514, m525142, m38504);
                if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                    m36513.close();
                    return;
                }
                z3 = true;
            }
            if (z) {
                byte[] m24743 = m24743(m24741(singletonList), m24742(abstractC13262.m32197()), new byte[4], new byte[4]);
                Iterator it = singletonList.iterator();
                while (it.hasNext()) {
                    ((AbstractC15357) it.next()).m36399(abstractC13262.m32193(), publicKey, m24743);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        m36513.close();
                        return;
                    }
                }
                byte[] m24744 = m24744(singletonList);
                byte[] m24740 = m24740(publicKey);
                int length = m24743.length + m24744.length + m24740.length;
                bArr = m24743(C22955.m51080(length + 16), C22955.m51080(length + 12), C22955.m51080(m24743.length), m24743, C22955.m51080(m24744.length), m24744, C22955.m51080(m24740.length), m24740);
                c = 7;
                c2 = 6;
            } else {
                c = 7;
                c2 = 6;
                bArr = null;
            }
            if (z2) {
                byte[] m247432 = m24743(m24741(singletonList), m24742(abstractC13262.m32197()), C22955.m51080(28), C22955.m51080(Integer.MAX_VALUE), new byte[4]);
                Iterator it2 = singletonList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC15357) it2.next()).m36399(abstractC13262.m32193(), publicKey, m247432);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        m36513.close();
                        return;
                    }
                }
                byte[] m247442 = m24744(singletonList);
                byte[] m247402 = m24740(publicKey);
                int length2 = m247432.length + m247442.length + m247402.length;
                int i5 = length2 + 20;
                byte[] m51080 = C22955.m51080(length2 + 24);
                byte[] m510802 = C22955.m51080(i5);
                byte[] m510803 = C22955.m51080(m247432.length);
                byte[] m510804 = C22955.m51080(28);
                byte[] m510805 = C22955.m51080(Integer.MAX_VALUE);
                c9030 = m12291;
                byte[] m510806 = C22955.m51080(m247442.length);
                interfaceC0562 = m12294;
                byte[] m510807 = C22955.m51080(m247402.length);
                c18929 = c189292;
                byte[][] bArr4 = new byte[10][];
                bArr4[0] = m51080;
                bArr4[1] = m510802;
                bArr4[2] = m510803;
                bArr4[3] = m247432;
                bArr4[4] = m510804;
                bArr4[5] = m510805;
                bArr4[c2] = m510806;
                bArr4[c] = m247442;
                bArr4[8] = m510807;
                bArr4[9] = m247402;
                bArr2 = m24743(bArr4);
            } else {
                c18929 = c189292;
                interfaceC0562 = m12294;
                c9030 = m12291;
                bArr2 = null;
            }
            if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                m36513.close();
                return;
            }
            int m44633 = C19373.m44633(!z ? 0 : bArr.length + 12, 8, !z2 ? 0 : bArr2.length + 12, 24);
            if (m44633 % 4096 != 0) {
                int i6 = m44633 % 4096;
                int i7 = 4096 - i6;
                if (i7 < 12) {
                    i7 = 8192 - i6;
                }
                bArr3 = new byte[i7];
                C22955.m51079(i7 - 8, 0, bArr3);
                C22955.m51078(1114793335, 8, bArr3);
                m44633 += i7;
            } else {
                bArr3 = null;
            }
            byte[] bArr5 = new byte[m44633];
            long j = m44633 - 8;
            C22955.m51079(j, 0, bArr5);
            if (z) {
                C22955.m51079(bArr.length + 4, 8, bArr5);
                C22955.m51078(1896449818, 16, bArr5);
                System.arraycopy(bArr, 0, bArr5, 20, bArr.length);
                i = bArr.length + 20;
            } else {
                i = 8;
            }
            if (z2) {
                C22955.m51079(bArr2.length + 4, i, bArr5);
                C22955.m51078(-262969152, i + 8, bArr5);
                int i8 = i + 12;
                System.arraycopy(bArr2, 0, bArr5, i8, bArr2.length);
                i = i8 + bArr2.length;
            }
            if (bArr3 != null) {
                System.arraycopy(bArr3, 0, bArr5, i, bArr3.length);
                i += bArr3.length;
            }
            C22955.m51079(j, i, bArr5);
            C22955.m51079(2334950737559900225L, i + 8, bArr5);
            C22955.m51079(3617552046287187010L, i + 16, bArr5);
            if (i + 24 != m44633) {
                throw new IllegalStateException();
            }
            if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                m36513.close();
                return;
            }
            int m43694 = (int) (c18929.m43694() % 4096);
            int i9 = m43694 == 0 ? 0 : 4096 - m43694;
            m36513.setLength(c18929.m43694());
            m36513.seek(c18929.m43694());
            if (i9 != 0) {
                i2 = 0;
                m36513.write(new byte[i9], 0, i9);
            } else {
                i2 = 0;
            }
            m36513.write(bArr5, i2, m44633);
            long filePointer = m36513.getFilePointer();
            interfaceC0562.reset();
            interfaceC0562.mo2313(interfaceC0562.size(), m36513);
            C22955.m51081(filePointer, c9030.m23288() + 16, c9030.m23289());
            c9030.reset();
            C4091.m12293(c9030, m36513, c9030.size());
            m36513.close();
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24743(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24741(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 4;
        int i2 = 4;
        while (it.hasNext()) {
            AbstractC15357 abstractC15357 = (AbstractC15357) it.next();
            byte[] m24739 = m24739(abstractC15357.mo4093(), abstractC15357.f47069);
            i2 += m24739.length;
            arrayList.add(m24739);
        }
        byte[] bArr = new byte[i2];
        C22955.m51078(i2 - 4, 0, bArr);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            i += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24742(X509Certificate... x509CertificateArr) {
        ArrayList arrayList = new ArrayList(x509CertificateArr.length);
        int i = 4;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            byte[] encoded = x509Certificate.getEncoded();
            i += encoded.length + 4;
            arrayList.add(encoded);
        }
        byte[] bArr = new byte[i];
        C22955.m51078(i - 4, 0, bArr);
        Iterator it = arrayList.iterator();
        int i2 = 4;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            C22955.m51078(bArr2.length, i2, bArr);
            int i3 = i2 + 4;
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i2 = i3 + bArr2.length;
        }
        return bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m24744(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC15357 abstractC15357 = (AbstractC15357) it.next();
            byte[] m24739 = m24739(abstractC15357.mo4093(), abstractC15357.f47070);
            i += m24739.length;
            arrayList.add(m24739);
        }
        byte[] bArr = new byte[i];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24739(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        C22955.m51078(bArr.length + 8, 0, bArr2);
        C22955.m51078(i, 4, bArr2);
        C22955.m51078(bArr.length, 8, bArr2);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24740(PublicKey publicKey) {
        try {
            byte[] encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            if (encoded != null && encoded.length != 0) {
                return encoded;
            }
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e);
        }
    }
}
