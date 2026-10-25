package l;

/* compiled from: X6PO */
/* renamed from: l.ܶۛۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15042 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d1, code lost:
    
        if (r6.isEmpty() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0130, code lost:
    
        if (((java.lang.Integer) r6.pop()).intValue() == r12) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
    
        if (r9 >= r16.length()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0174, code lost:
    
        r7 = r16.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017a, code lost:
    
        if (r10 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        if (r6.isEmpty() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0182, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r5.add(new l.C7988(r9, r7, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0184, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r6 = new boolean[r5.size()];
        r0 = r4.iterator();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
    
        if (r0.hasNext() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019c, code lost:
    
        r8 = (l.InterfaceC0463) r0.next();
        r19.m13206();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a9, code lost:
    
        if (l.C11516.m28345(r8) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b0, code lost:
    
        if (r7 >= r5.size()) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        r9 = r8.mo2054();
        r10 = ((l.C7988) r5.get(r7)).f24667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c0, code lost:
    
        if (r9 < r10) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c2, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c5, code lost:
    
        r8 = java.lang.Math.max(0, r7 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d6, code lost:
    
        if (r8 >= java.lang.Math.min(r5.size(), r7 + 2)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d8, code lost:
    
        r6[r8] = true;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01de, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m35583(java.lang.CharSequence r16, l.C3463 r17, java.lang.String r18, l.C4460 r19, l.C19012 r20) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15042.m35583(java.lang.CharSequence, l.ۗ᩶ۢ, java.lang.String, l.ۙۛۢ, l.ᩴ᩷ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35582(CharSequence charSequence, int i, int i2, C4460 c4460, C19012 c19012) {
        if (i2 - i > 1048576 - c19012.length()) {
            throw C12221.m29712(EnumC19402.LIMIT, "Formatted source length limit exceeded");
        }
        while (i < i2) {
            c4460.m13206();
            int i3 = i + 4096;
            c19012.m43854(i, Math.min(i2, i3), charSequence);
            i = i3;
        }
        c4460.m13206();
    }
}
