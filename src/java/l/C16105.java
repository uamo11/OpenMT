package l;

import java.util.Arrays;

/* compiled from: PB28 */
/* renamed from: l.ܺᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16105 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10220 m38013(C18929 c18929, boolean z, byte[] bArr) {
        if (!c18929.m43693()) {
            return null;
        }
        c18929.m43686(c18929.m43694());
        long m43689 = c18929.m43689() - 24;
        int i = z ? 462663009 : -262969152;
        while (m43689 > 0 && m43689 >= 12) {
            long m436892 = c18929.m43689();
            if (m436892 < 4 || m436892 > m43689 - 8) {
                return null;
            }
            long m43697 = c18929.m43697() + m436892;
            if (c18929.m43690() == i) {
                try {
                    return m38012(c18929, m43697, bArr);
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
    public static C10220 m38012(C18929 c18929, long j, byte[] bArr) {
        long m47887 = C21046.m47887(c18929, C21046.m47887(c18929, j));
        long m478872 = C21046.m47887(c18929, m47887);
        c18929.m43686(C21046.m47887(c18929, m478872));
        byte[] m47892 = C21046.m47892(c18929, C21046.m47887(c18929, m478872), bArr);
        if (m47892 == null) {
            return null;
        }
        if (m478872 - c18929.m43697() < 12) {
            throw new C20941("V3 signed data is missing SDK range or attributes");
        }
        int m43690 = c18929.m43690();
        int m436902 = c18929.m43690();
        long m478873 = C21046.m47887(c18929, m478872);
        long m43697 = c18929.m43697();
        long j2 = 0;
        while (true) {
            byte[] bArr2 = m47892;
            int i = m436902;
            if (c18929.m43697() >= m478873) {
                c18929.m43686(m43697);
                C21709 c21709 = null;
                while (c18929.m43697() < m478873) {
                    long m478874 = C21046.m47887(c18929, m478873);
                    if (m478874 - c18929.m43697() < 4) {
                        throw new C20941("V3 signing attribute is missing its ID");
                    }
                    if (c18929.m43690() != 1000370060) {
                        c18929.m43686(m478874);
                    } else {
                        try {
                            C21709 m49040 = C21709.m49040(c18929.m43687((int) (m478874 - c18929.m43697())));
                            c21709 = c21709 == null ? m49040 : C21709.m49039(Arrays.asList(c21709, m49040));
                        } catch (Exception e) {
                            throw new C20941("Failed to parse V3 signing certificate lineage", e);
                        }
                    }
                }
                c18929.m43686(m478872);
                if (m47887 - c18929.m43697() < 16) {
                    throw new C20941("V3 signer is missing SDK range, signatures, or public key");
                }
                int m436903 = c18929.m43690();
                int m436904 = c18929.m43690();
                if (m43690 != m436903 || i != m436904) {
                    throw new C20941("V3 signer SDK range does not match signed data");
                }
                c18929.m43686(C21046.m47887(c18929, m47887));
                c18929.m43686(C21046.m47887(c18929, m47887));
                return new C10220(bArr2, c21709);
            }
            long m478875 = C21046.m47887(c18929, m478873);
            if (m478875 - c18929.m43697() < 4) {
                throw new C20941("V3 signing attribute is missing its ID");
            }
            if (c18929.m43690() == 1000370060) {
                long m436972 = (m478875 - c18929.m43697()) + j2;
                if (m436972 > 4194304) {
                    throw new C20941("V3 proof-of-rotation data exceeds safety limit");
                }
                j2 = m436972;
            }
            c18929.m43686(m478875);
            m47892 = bArr2;
            m436902 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38014(C18929 c18929, boolean z, InterfaceC17066 interfaceC17066) {
        if (!c18929.m43693()) {
            return false;
        }
        c18929.m43686(c18929.m43694());
        long m43689 = c18929.m43689() - 24;
        int i = z ? 462663009 : -262969152;
        while (m43689 > 0 && m43689 >= 12) {
            long m436892 = c18929.m43689();
            if (m436892 < 4 || m436892 > m43689 - 8) {
                return false;
            }
            long m43697 = c18929.m43697() + m436892;
            if (c18929.m43690() == i) {
                try {
                    int m47887 = (int) (C21046.m47887(c18929, m43697) - c18929.m43697());
                    if (m47887 <= 16777216) {
                        return m38015(c18929.m43687(m47887), c18929.m43695(), c18929, interfaceC17066);
                    }
                    throw new C20941("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C20941 | Exception unused) {
                    return false;
                }
            }
            m43689 -= m436892 + 8;
            c18929.m43686(m43697);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        r11 = l.C9652.m24593(r10);
        r12 = java.security.cert.CertificateFactory.getInstance("X.509");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r11.hasRemaining() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r9.add((java.security.cert.X509Certificate) r12.generateCertificate(new java.io.ByteArrayInputStream(l.C9652.m24594(r11))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        r11 = r10.getInt();
        r12 = r10.getInt();
        l.C9652.m24593(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r11 != r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r12 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r7.hasRemaining() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        r6 = l.C9652.m24593(r7);
        r10 = r6.getInt();
        r6 = l.C9652.m24594(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (l.AbstractC15357.f47068.containsKey(java.lang.Integer.valueOf(r10)) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        r5.add(new l.C9051(r10, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        if (r5.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r6 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r6.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        r7 = (l.C9051) r6.next();
        r10 = r7.f27451;
        r10 = l.AbstractC15357.m36398(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        r11 = java.security.KeyFactory.getInstance(r10.mo4095()).generatePublic(new java.security.spec.X509EncodedKeySpec(r2));
        r7 = r7.f27452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (r10.m36400(r11, r3, r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (java.util.Arrays.equals(r2, ((java.security.cert.X509Certificate) r9.get(0)).getPublicKey().getEncoded()) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        r2 = l.C5502.m15636(r17, 0, r18.m43694());
        r3 = l.C5502.m15636(r17, r18.m43685(), r18.m43691());
        r6 = r18.m43696();
        r6 = l.C4091.m12291(l.C5502.m15636(r17, r6, r18.m43688() - r6));
        r7 = (int) (r18.m43685() - r18.m43694());
        r9 = r6.m23289();
        r10 = r6.m23288() + 16;
        l.C22955.m51081(l.C22955.m51077(r10, r9) - r7, r10, r9);
        r5 = r5.iterator();
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0168, code lost:
    
        if (r5.hasNext() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        r9 = (l.C9051) r5.next();
        r10 = r9.f27451;
        r10 = l.AbstractC15357.m36398(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        if (r7 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017a, code lost:
    
        r11 = new l.InterfaceC0562[]{r2, r3, r6};
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0185, code lost:
    
        if (r12 >= 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0187, code lost:
    
        r11[r12].reset();
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018f, code lost:
    
        r10.mo4094(r2, r3, r6, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0198, code lost:
    
        if (r19.mo1526() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019b, code lost:
    
        r10 = r10.f47069;
        r9 = r9.f27451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01af, code lost:
    
        if (java.util.Arrays.equals(r10, (byte[]) r8.get(java.lang.Integer.valueOf(r9))) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b2, code lost:
    
        r7 = true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m38015(byte[] r16, l.InterfaceC7889 r17, l.C18929 r18, l.InterfaceC17066 r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16105.m38015(byte[], l.۠ۖܽ, l.ᩴᩳᩳ, l.ܿۖ᩷):boolean");
    }
}
