package l;

/* compiled from: W4LM */
/* renamed from: l.۟᩹ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7755 extends AbstractC14104 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6281 f23981;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f23982;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18276 f23983;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23984;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7755 f23985;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f23986;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7755 f23987;

    public C7755(C6281 c6281, boolean z, C18276 c18276, C7755 c7755) {
        super(589824, null);
        this.f23981 = c6281;
        this.f23986 = z;
        this.f23983 = c18276;
        int i = c18276.f56819;
        this.f23982 = i == 0 ? -1 : i - 2;
        this.f23987 = c7755;
        if (c7755 != null) {
            c7755.f23985 = this;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7755 m20785(C6281 c6281, String str, C7755 c7755) {
        C18276 c18276 = new C18276();
        c18276.m42618(c6281.m17326(str));
        c18276.m42618(0);
        return new C7755(c6281, true, c18276, c7755);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7755 m20784(l.C6281 r4, int r5, l.C23214 r6, java.lang.String r7, l.C7755 r8) {
        /*
            l.ᩳ᩶ۚ r0 = new l.ᩳ᩶ۚ
            r0.<init>()
            int r1 = r5 >>> 24
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L2a
            switch(r1) {
                case 16: goto L20;
                case 17: goto L20;
                case 18: goto L20;
                case 19: goto L18;
                case 20: goto L18;
                case 21: goto L18;
                case 22: goto L2a;
                case 23: goto L20;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 66: goto L20;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L1c;
                case 72: goto L1c;
                case 73: goto L1c;
                case 74: goto L1c;
                case 75: goto L1c;
                default: goto L12;
            }
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L18:
            r0.m42609(r1)
            goto L2f
        L1c:
            r0.m42616(r5)
            goto L2f
        L20:
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r5 = r5 & r3
            int r5 = r5 >> 8
            r0.m42619(r1, r5)
            goto L2f
        L2a:
            int r5 = r5 >>> 16
            r0.m42618(r5)
        L2f:
            l.C23214.m51506(r6, r0)
            int r5 = r4.m17326(r7)
            r0.m42618(r5)
            r5 = 0
            r0.m42618(r5)
            l.۟᩹ۚ r5 = new l.۟᩹ۚ
            r5.<init>(r4, r2, r0, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7755.m20784(l.ۛ᩶ۚ, int, l.᩺᩶ۚ, java.lang.String, l.۟᩹ۚ):l.۟᩹ۚ");
    }

    @Override // l.AbstractC14104
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20792(Object obj, String str) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        if (obj instanceof String) {
            c18276.m42619(115, c6281.m17326((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c18276.m42619(66, c6281.m17305((int) ((Byte) obj).byteValue()).f39901);
            return;
        }
        if (obj instanceof Boolean) {
            c18276.m42619(90, c6281.m17305(((Boolean) obj).booleanValue() ? 1 : 0).f39901);
            return;
        }
        if (obj instanceof Character) {
            c18276.m42619(67, c6281.m17305((int) ((Character) obj).charValue()).f39901);
            return;
        }
        if (obj instanceof Short) {
            c18276.m42619(83, c6281.m17305((int) ((Short) obj).shortValue()).f39901);
            return;
        }
        if (obj instanceof C11926) {
            c18276.m42619(99, c6281.m17326(((C11926) obj).m29099()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c18276.m42619(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c18276.m42619(66, c6281.m17305((int) bArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c18276.m42619(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c18276.m42619(90, c6281.m17305(zArr[i] ? 1 : 0).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c18276.m42619(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c18276.m42619(83, c6281.m17305((int) sArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c18276.m42619(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c18276.m42619(67, c6281.m17305((int) cArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c18276.m42619(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c18276.m42619(73, c6281.m17305(iArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c18276.m42619(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c18276.m42619(74, c6281.m17307(jArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c18276.m42619(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                c18276.m42619(70, c6281.m17304(fArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            c18276.m42619(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                c18276.m42619(68, c6281.m17303(dArr[i]).f39901);
                i++;
            }
            return;
        }
        C12631 m17308 = c6281.m17308(obj);
        c18276.m42619(".s.IFJDCS".charAt(m17308.f39902), m17308.f39901);
    }

    @Override // l.AbstractC14104
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20793(String str, String str2, String str3) {
        this.f23984++;
        boolean z = this.f23986;
        C18276 c18276 = this.f23983;
        C6281 c6281 = this.f23981;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(101, c6281.m17326(str2));
        c18276.m42618(c6281.m17326(str3));
    }

    @Override // l.AbstractC14104
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo20789(String str, String str2) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(64, c6281.m17326(str2));
        c18276.m42618(0);
        return new C7755(c6281, true, c18276, null);
    }

    @Override // l.AbstractC14104
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo20788(String str) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(91, 0);
        return new C7755(c6281, false, c18276, null);
    }

    @Override // l.AbstractC14104
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20790() {
        int i = this.f23982;
        if (i != -1) {
            byte[] bArr = this.f23983.f56818;
            int i2 = this.f23984;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20794(String str) {
        if (str != null) {
            this.f23981.m17326(str);
        }
        int i = 8;
        for (C7755 c7755 = this; c7755 != null; c7755 = c7755.f23987) {
            i += c7755.f23983.f56819;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20783(C7755 c7755, C7755 c77552, C7755 c77553, C7755 c77554) {
        int m20794 = c7755 != null ? c7755.m20794("RuntimeVisibleAnnotations") : 0;
        if (c77552 != null) {
            m20794 += c77552.m20794("RuntimeInvisibleAnnotations");
        }
        if (c77553 != null) {
            m20794 += c77553.m20794("RuntimeVisibleTypeAnnotations");
        }
        return c77554 != null ? m20794 + c77554.m20794("RuntimeInvisibleTypeAnnotations") : m20794;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20791(int i, C18276 c18276) {
        int i2 = 2;
        int i3 = 0;
        C7755 c7755 = null;
        for (C7755 c77552 = this; c77552 != null; c77552 = c77552.f23987) {
            c77552.mo20790();
            i2 += c77552.f23983.f56819;
            i3++;
            c7755 = c77552;
        }
        c18276.m42618(i);
        c18276.m42616(i2);
        c18276.m42618(i3);
        while (c7755 != null) {
            C18276 c182762 = c7755.f23983;
            c18276.m42613(0, c182762.f56819, c182762.f56818);
            c7755 = c7755.f23985;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20787(C6281 c6281, C7755 c7755, C7755 c77552, C7755 c77553, C7755 c77554, C18276 c18276) {
        if (c7755 != null) {
            c7755.m20791(c6281.m17326("RuntimeVisibleAnnotations"), c18276);
        }
        if (c77552 != null) {
            c77552.m20791(c6281.m17326("RuntimeInvisibleAnnotations"), c18276);
        }
        if (c77553 != null) {
            c77553.m20791(c6281.m17326("RuntimeVisibleTypeAnnotations"), c18276);
        }
        if (c77554 != null) {
            c77554.m20791(c6281.m17326("RuntimeInvisibleTypeAnnotations"), c18276);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20782(String str, C7755[] c7755Arr, int i) {
        int i2 = (i * 2) + 7;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += c7755Arr[i3] == null ? 0 : r2.m20794(str) - 8;
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20786(int i, C7755[] c7755Arr, int i2, C18276 c18276) {
        int i3 = (i2 * 2) + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += c7755Arr[i4] == null ? 0 : r4.m20794(null) - 8;
        }
        c18276.m42618(i);
        c18276.m42616(i3);
        c18276.m42609(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = 0;
            C7755 c7755 = null;
            for (C7755 c77552 = c7755Arr[i5]; c77552 != null; c77552 = c77552.f23987) {
                c77552.mo20790();
                i6++;
                c7755 = c77552;
            }
            c18276.m42618(i6);
            while (c7755 != null) {
                C18276 c182762 = c7755.f23983;
                c18276.m42613(0, c182762.f56819, c182762.f56818);
                c7755 = c7755.f23985;
            }
        }
    }
}
