package l;

import java.util.Arrays;

/* compiled from: 31A6 */
/* renamed from: l.᩷ᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21046 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47891(C18929 c18929, byte[] bArr) {
        if (!c18929.m43693()) {
            return null;
        }
        c18929.m43686(c18929.m43694());
        long m43689 = c18929.m43689() - 24;
        while (m43689 > 0 && m43689 >= 12) {
            long m436892 = c18929.m43689();
            if (m436892 < 4 || m436892 > m43689 - 8) {
                return null;
            }
            long m43697 = c18929.m43697() + m436892;
            if (c18929.m43690() == 1896449818) {
                try {
                    return m47890(c18929, m43697, bArr);
                } catch (RuntimeException | C20941 unused) {
                    return null;
                }
            }
            m43689 -= m436892 + 8;
            c18929.m43686(m43697);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47890(C18929 c18929, long j, byte[] bArr) {
        long m47887 = m47887(c18929, m47887(c18929, j));
        long m478872 = m47887(c18929, m47887);
        c18929.m43686(m47887(c18929, m478872));
        byte[] m47892 = m47892(c18929, m47887(c18929, m478872), bArr);
        if (m47892 == null) {
            return null;
        }
        m47887(c18929, m478872);
        c18929.m43686(m478872);
        if (m47887 - c18929.m43697() < 8) {
            throw new C20941("V2 signer is missing signatures or public key");
        }
        c18929.m43686(m47887(c18929, m47887));
        c18929.m43686(m47887(c18929, m47887));
        return m47892;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m47887(C18929 c18929, long j) {
        if (j - c18929.m43697() < 4) {
            throw new C20941("Length-prefixed field is missing its length");
        }
        int m43690 = c18929.m43690();
        long m43697 = j - c18929.m43697();
        if (m43690 >= 0) {
            long j2 = m43690;
            if (j2 <= m43697) {
                return c18929.m43697() + j2;
            }
        }
        throw new C20941("Length-prefixed field exceeds its container");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m47892(C18929 c18929, long j, byte[] bArr) {
        try {
            if (j - c18929.m43697() > 4194304) {
                throw new C20941("Signing certificate sequence exceeds safety limit");
            }
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            while (c18929.m43697() < j) {
                long m47887 = m47887(c18929, j);
                int m43697 = (int) (m47887 - c18929.m43697());
                if (m43697 == 0) {
                    throw new C20941("Signing certificate is empty");
                }
                if (m43697 > 1048576) {
                    throw new C20941("Signing certificate exceeds safety limit");
                }
                if (bArr3 != null && (bArr == null || bArr.length != m43697)) {
                    c18929.m43686(m47887);
                }
                byte[] m43687 = c18929.m43687(m43697);
                if (bArr3 == null) {
                    bArr3 = m43687;
                }
                if (bArr != null && Arrays.equals(bArr, m43687)) {
                    bArr2 = m43687;
                }
            }
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            return bArr2;
        } finally {
            c18929.m43686(j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47888(C18929 c18929, InterfaceC17066 interfaceC17066) {
        if (!c18929.m43693()) {
            return false;
        }
        c18929.m43686(c18929.m43694());
        long m43689 = c18929.m43689() - 24;
        while (m43689 > 0 && m43689 >= 12) {
            long m436892 = c18929.m43689();
            if (m436892 < 4 || m436892 > m43689 - 8) {
                return false;
            }
            long m43697 = c18929.m43697() + m436892;
            if (c18929.m43690() != 1896449818) {
                m43689 -= m436892 + 8;
                c18929.m43686(m43697);
            } else {
                try {
                    int m47887 = (int) (m47887(c18929, m43697) - c18929.m43697());
                    if (m47887 <= 16777216) {
                        return m47889(c18929.m43687(m47887), c18929.m43695(), c18929, interfaceC17066);
                    }
                    throw new C20941("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C20941 | Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r9 = l.C9652.m24593(r8);
        r10 = java.security.cert.CertificateFactory.getInstance("X.509");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (r9.hasRemaining() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        r7.add((java.security.cert.X509Certificate) r10.generateCertificate(new java.io.ByteArrayInputStream(l.C9652.m24594(r9))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        l.C9652.m24593(r8);
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r5.hasRemaining() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r9 = l.C9652.m24593(r5);
        r10 = r9.getInt();
        r9 = l.C9652.m24594(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (l.AbstractC15357.f47068.containsKey(java.lang.Integer.valueOf(r10)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r8.add(new l.C6934(r10, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r8.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r5 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r5.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r9 = (l.C6934) r5.next();
        r10 = l.AbstractC15357.m36398(r9.f21395);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r10.m36400(java.security.KeyFactory.getInstance(r10.mo4095()).generatePublic(new java.security.spec.X509EncodedKeySpec(r2)), r3, r9.f21396) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        if (java.util.Arrays.equals(r2, ((java.security.cert.X509Certificate) r7.get(0)).getPublicKey().getEncoded()) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        r2 = l.C5502.m15636(r17, 0, r18.m43694());
        r3 = l.C5502.m15636(r17, r18.m43685(), r18.m43691());
        r9 = r18.m43696();
        r5 = l.C4091.m12291(l.C5502.m15636(r17, r9, r18.m43688() - r9));
        r7 = (int) (r18.m43685() - r18.m43694());
        r9 = r5.m23289();
        r10 = r5.m23288() + 16;
        l.C22955.m51081(l.C22955.m51077(r10, r9) - r7, r10, r9);
        r7 = r8.iterator();
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014e, code lost:
    
        if (r7.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        r9 = (l.C6934) r7.next();
        r10 = l.AbstractC15357.m36398(r9.f21395);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
    
        if (r8 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
    
        r12 = new l.InterfaceC0562[]{r2, r3, r5};
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        if (r13 >= 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016b, code lost:
    
        r12[r13].reset();
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        r10.mo4094(r2, r3, r5, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        if (r19.mo1526() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
    
        if (java.util.Arrays.equals(r10.f47069, (byte[]) r6.get(java.lang.Integer.valueOf(r9.f21395))) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0194, code lost:
    
        r8 = true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m47889(byte[] r16, l.InterfaceC7889 r17, l.C18929 r18, l.InterfaceC17066 r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21046.m47889(byte[], l.۠ۖܽ, l.ᩴᩳᩳ, l.ܿۖ᩷):boolean");
    }
}
