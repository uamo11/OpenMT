package l;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: 6B02 */
/* renamed from: l.᩸ܽᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21709 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69668;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69669;

    public C21709(ArrayList arrayList, int i) {
        this.f69668 = i;
        this.f69669 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21709 m49040(byte[] bArr) {
        int mo4096;
        ByteBuffer byteBuffer;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer order = wrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        C16000 c16000 = null;
        if (order == null || !order.hasRemaining()) {
            arrayList = null;
        } else {
            if (order.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int i = 0;
            try {
                if (order.getInt() != 1) {
                    throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                }
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (order.hasRemaining()) {
                    i++;
                    ByteBuffer m24593 = C9652.m24593(order);
                    ByteBuffer m245932 = C9652.m24593(m24593);
                    int i3 = m24593.getInt();
                    int i4 = m24593.getInt();
                    AbstractC15357 m36396 = AbstractC15357.m36396(i2);
                    byte[] m24594 = C9652.m24594(m24593);
                    if (c16000 != null) {
                        C11003.requireNonNull(m36396);
                        String mo4098 = m36396.mo4098();
                        AlgorithmParameterSpec mo4097 = m36396.mo4097();
                        PublicKey publicKey = c16000.getPublicKey();
                        byteBuffer = order;
                        Signature signature = Signature.getInstance(mo4098);
                        signature.initVerify(publicKey);
                        if (mo4097 != null) {
                            signature.setParameter(mo4097);
                        }
                        signature.update(m245932);
                        if (!signature.verify(m24594)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + mo4098 + " when verifying V3SigningCertificateLineage object");
                        }
                    } else {
                        byteBuffer = order;
                    }
                    m245932.rewind();
                    byte[] m245942 = C9652.m24594(m245932);
                    int i5 = m245932.getInt();
                    if (c16000 != null && i2 != i5) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + m24593 + " when verifying V3SigningCertificateLineage object");
                    }
                    C16000 c160002 = new C16000(C2596.m8223(m245942), m245942);
                    if (hashSet.contains(c160002)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(c160002);
                    arrayList.add(new C2701(c160002, AbstractC15357.m36396(i5), AbstractC15357.m36396(i4), m24594, i3));
                    order = byteBuffer;
                    c16000 = c160002;
                    i2 = i4;
                }
            } catch (BufferUnderflowException e) {
                e = e;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (SignatureException e5) {
                e = e5;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (CertificateException e6) {
                throw new SecurityException(C18307.m42645(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e6);
            } catch (C20941 e7) {
                e = e7;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            }
        }
        if (arrayList == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator it = arrayList.iterator();
        int i6 = 28;
        while (it.hasNext()) {
            AbstractC15357 abstractC15357 = ((C2701) it.next()).f8444;
            if (abstractC15357 != null && (mo4096 = abstractC15357.mo4096()) > i6) {
                i6 = mo4096;
            }
        }
        return new C21709(arrayList, i6);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49041() {
        return this.f69669.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21709 m49042(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69669;
            if (i < arrayList.size()) {
                if (((C2701) arrayList.get(i)).f8445.equals(x509Certificate)) {
                    return new C21709(new ArrayList(arrayList.subList(0, i + 1)), this.f69668);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21709 m49039(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size = ((C21709) list.get(i3)).f69669.size();
            if (size > i2) {
                i = i3;
                i2 = size;
            }
        }
        ArrayList arrayList = ((C21709) list.get(i)).f69669;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != i) {
                ArrayList arrayList2 = ((C21709) list.get(i4)).f69669;
                if (!arrayList2.equals(arrayList.subList(0, arrayList2.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return (C21709) list.get(i);
    }
}
