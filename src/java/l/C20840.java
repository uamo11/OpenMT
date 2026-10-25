package l;

import java.util.UnknownFormatConversionException;

/* compiled from: T5CS */
/* renamed from: l.᩷ۧᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20840 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67477;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f67478;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f67479;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[LOOP:0: B:10:0x0032->B:12:0x003e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20840(java.lang.String r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f67478 = r4
            r3.f67477 = r5
            boolean r0 = r3.m47655()
            if (r0 == 0) goto L2f
            java.lang.String r0 = r3.m47656()
            char r1 = r3.m47653()
            r2 = 36
            if (r1 != r2) goto L1d
            r3.m47654()
            goto L2f
        L1d:
            r1 = 0
            char r1 = r0.charAt(r1)
            r2 = 48
            if (r1 != r2) goto L30
            int r0 = r0.length()
            int r1 = r3.f67477
            int r1 = r1 - r0
            r3.f67477 = r1
        L2f:
            r0 = 0
        L30:
            if (r0 != 0) goto L42
        L32:
            java.lang.String r1 = ",-(+# 0<"
            char r2 = r3.m47653()
            int r1 = r1.indexOf(r2)
            if (r1 < 0) goto L42
            r3.m47654()
            goto L32
        L42:
            if (r0 != 0) goto L4d
            boolean r0 = r3.m47655()
            if (r0 == 0) goto L4d
            r3.m47656()
        L4d:
            char r0 = r3.m47653()
            r1 = 46
            if (r0 != r1) goto L6c
            r3.m47654()
            boolean r0 = r3.m47655()
            if (r0 == 0) goto L62
            r3.m47656()
            goto L6c
        L62:
            java.util.IllegalFormatPrecisionException r4 = new java.util.IllegalFormatPrecisionException
            char r5 = r3.m47653()
            r4.<init>(r5)
            throw r4
        L6c:
            char r0 = r3.m47653()
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L7c
            char r0 = r3.m47653()
            r1 = 84
            if (r0 != r1) goto L7f
        L7c:
            r3.m47654()
        L7f:
            r3.m47654()
            int r5 = r5 + (-1)
            int r0 = r3.f67477
            java.lang.String r4 = r4.substring(r5, r0)
            r3.f67479 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20840.<init>(java.lang.String, int):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m47656() {
        int i = this.f67477;
        while (m47655()) {
            m47654();
        }
        return this.f67478.substring(i, this.f67477);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private char m47653() {
        int i = this.f67477;
        String str = this.f67478;
        if (i == str.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        return str.charAt(this.f67477);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47654() {
        if (this.f67477 == this.f67478.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        this.f67477++;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m47655() {
        return this.f67477 != this.f67478.length() && Character.isDigit(m47653());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47657() {
        return this.f67477;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47658() {
        return this.f67479;
    }
}
