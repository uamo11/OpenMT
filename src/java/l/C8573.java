package l;

/* compiled from: CAUR */
/* renamed from: l.ۡ֫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8573 extends C1517 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (java.lang.Throwable.class.isAssignableFrom(r2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r2 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r0 = new java.lang.Exception(r9, r8);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0166, code lost:
    
        if (r11 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0168, code lost:
    
        r0.setStackTrace(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        if (r6 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0171, code lost:
    
        if (r2 != r17.f5380) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0175, code lost:
    
        r2 = r4.m51838((java.lang.reflect.Type) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017b, code lost:
    
        if ((r2 instanceof l.C1517) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017d, code lost:
    
        r3 = (l.C1517) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0180, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0182, code lost:
    
        r2 = r6.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018e, code lost:
    
        if (r2.hasNext() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0190, code lost:
    
        r4 = (java.util.Map.Entry) r2.next();
        r5 = (java.lang.String) r4.getKey();
        r4 = r4.getValue();
        r5 = r3.m5205(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a4, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a6, code lost:
    
        r5.mo17832(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r0 = r2.getConstructors();
        r3 = r0.length;
        r7 = null;
        r10 = null;
        r12 = 0;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        if (r12 >= r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        r14 = r0[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        if (r14.getParameterTypes().length != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
    
        r18 = r0;
        r20 = r3;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0125, code lost:
    
        r12 = r12 + 1;
        r0 = r18;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f6, code lost:
    
        r18 = r0;
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fd, code lost:
    
        if (r14.getParameterTypes().length != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
    
        if (r14.getParameterTypes()[0] != java.lang.String.class) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0108, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0110, code lost:
    
        if (r14.getParameterTypes().length != 2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0119, code lost:
    
        if (r14.getParameterTypes()[0] != java.lang.String.class) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0122, code lost:
    
        if (r14.getParameterTypes()[1] != java.lang.Throwable.class) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        if (r13 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012e, code lost:
    
        r0 = (java.lang.Throwable) r13.newInstance(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015f, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        r0 = new java.lang.Exception(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013e, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0140, code lost:
    
        r0 = (java.lang.Throwable) r7.newInstance(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014e, code lost:
    
        if (r10 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0150, code lost:
    
        r3 = null;
        r0 = (java.lang.Throwable) r10.newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r0 = null;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b3, code lost:
    
        throw new l.C15082("create instance error", (java.lang.Throwable) r0);
     */
    @Override // l.C1517, l.InterfaceC19157
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5204(l.C11556 r18, java.lang.reflect.Type r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8573.mo5204(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
