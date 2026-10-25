package l;

import bin.mt.plus.R;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* compiled from: 44TS */
/* renamed from: l.֨ۧܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1082 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3950;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f3951;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f3952;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f3953;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3955;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f3956;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f3957;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC2494 f3959;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f3960;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f3961;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC3905 f3962;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12392 f3963;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14134 f3964;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f3965;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f3966;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public PatternSyntaxException f3967;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f3970;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f3972;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f3973;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12973 f3975;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C5316 f3976;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f3958 = -1;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f3978 = -1;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12164 f3954 = null;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f3949 = -1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19428 f3977 = new C19428();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f3974 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f3969 = false;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8817 f3968 = C8817.m22786(150);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f3971 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m3684(final boolean z, final boolean z2) {
        boolean z3;
        C5316 c5316 = this.f3976;
        if (c5316 != null && !c5316.m15239()) {
            c5316.m15234();
        }
        C12164 c12164 = this.f3954;
        if (c12164 == null) {
            this.f3969 = false;
            this.f3978 = -1;
            this.f3974 = -1;
            this.f3953 = null;
            PatternSyntaxException patternSyntaxException = this.f3967;
            if (patternSyntaxException != null) {
                m3673(patternSyntaxException);
            }
            return;
        }
        if (c5316 != null && c5316.f16580 == c12164) {
            z3 = c5316.f16582;
            if (!z3) {
                m3683(this.f3954.pattern());
            }
        }
        final C5316 c53162 = new C5316(this);
        this.f3976 = c53162;
        this.f3969 = false;
        this.f3978 = -1;
        c53162.m15235(C1802.f6208.submit(new Runnable() { // from class: l.ܽۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C1082.m3682(C1082.this, c53162, z, z2);
            }
        }));
    }

    public C1082(AbstractActivityC3346 abstractActivityC3346, C12392 c12392) {
        this.f3951 = abstractActivityC3346;
        this.f3963 = c12392;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3714(InterfaceC2494 interfaceC2494) {
        if (this.f3959 != interfaceC2494) {
            m3707();
        }
        this.f3959 = interfaceC2494;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m3727() {
        return this.f3950;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3724(boolean z) {
        if (this.f3950 != z) {
            m3707();
        }
        this.f3950 = z;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m3705(String str) {
        String str2;
        if (!m3694()) {
            return false;
        }
        int i = this.f3958;
        C12392 c12392 = this.f3963;
        return i == c12392.f37227 && (str2 = this.f3961) != null && str2.equals(str) && C11003.equals(this.f3975, c12392.m30518()) && this.f3966 == this.f3965 && this.f3960 == this.f3957 && this.f3970 == this.f3952;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3711(byte b) {
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 4) != 0;
        m3724((b & 8) != 0);
        boolean z4 = (b & 16) != 0;
        m3728(z);
        m3726(z2);
        m3716(z3);
        this.f3956 = z4;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3728(boolean z) {
        if (this.f3965 != z) {
            m3717();
        }
        this.f3965 = z;
        InterfaceC3905 interfaceC3905 = this.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11911(z);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m3726(boolean z) {
        if (this.f3957 != z) {
            m3717();
        }
        this.f3957 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3716(boolean z) {
        if (this.f3952 != z) {
            m3717();
        }
        this.f3952 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3721(boolean z) {
        this.f3956 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m3710() {
        byte b = this.f3965 ? (byte) 1 : (byte) 0;
        if (this.f3957) {
            b = (byte) (b | 2);
        }
        if (this.f3952) {
            b = (byte) (b | 4);
        }
        if (this.f3950) {
            b = (byte) (b | 8);
        }
        return this.f3956 ? (byte) (b | 16) : b;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m3722() {
        return this.f3965;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m3730() {
        return this.f3957;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m3725() {
        return this.f3952;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m3729() {
        return this.f3956;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3718() {
        boolean z = this.f3965;
        boolean z2 = this.f3952;
        boolean z3 = this.f3957;
        int i = z ? 8 : 16;
        if (!z2) {
            i |= 66;
        }
        return z3 ? i | 512 : i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3712(String str) {
        if (this.f3968.m22793() || this.f3963.f37258.mo9770()) {
            return;
        }
        this.f3971 = true;
        if (!m3705(str)) {
            m3672(str, true, false);
        } else {
            m3684(true, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3719(String str) {
        if (this.f3968.m22793() || this.f3963.f37258.mo9770()) {
            return;
        }
        this.f3971 = false;
        if (!m3705(str)) {
            m3672(str, false, false);
        } else {
            m3684(false, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3672(String str, boolean z, boolean z2) {
        this.f3969 = false;
        this.f3966 = this.f3965;
        this.f3960 = this.f3957;
        this.f3961 = str;
        C12392 c12392 = this.f3963;
        this.f3975 = c12392.m30518();
        this.f3970 = this.f3952;
        int i = c12392.f37227;
        this.f3978 = i;
        this.f3958 = i;
        this.f3954 = null;
        if (str.isEmpty()) {
            m3707();
            return;
        }
        try {
            C11459 m28259 = C11459.m28259(m3718(), str);
            this.f3967 = null;
            m3683(m28259);
            InterfaceC3905 interfaceC3905 = this.f3962;
            if (interfaceC3905 != null) {
                interfaceC3905.mo11910();
            }
            m3684(z, z2);
        } catch (PatternSyntaxException e) {
            m3673(e);
            this.f3967 = e;
            m3707();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3723(String str) {
        if (!C11003.equals(this.f3961, str)) {
            m3707();
        }
        C12392 c12392 = this.f3963;
        C6458 c6458 = c12392.f37173;
        if (str.isEmpty()) {
            c6458.m17851();
            c12392.m30423();
        } else {
            try {
                c6458.m17853(c12392.m30436(), C11459.m28259(m3718(), str));
            } catch (PatternSyntaxException unused) {
                c6458.m17858();
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m3717() {
        m3707();
        C14134 c14134 = this.f3964;
        if (c14134 != null) {
            c14134.m33740();
        }
        this.f3963.f37173.m17851();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3688(C12164 c12164, int i, boolean z) {
        if (C12268.m29802(c12164, i)) {
            return z || c12164.start() != i || c12164.end() != i || C12268.m29803(c12164);
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3696(C1082 c1082, int i) {
        if (c1082.f3977.m44770() == null || c1082.f3954 == null || c1082.f3977.m44770() != c1082.f3954.pattern() || c1082.f3953 == null) {
            return false;
        }
        int i2 = c1082.f3974;
        C12392 c12392 = c1082.f3963;
        return i2 == c12392.f37227 && c1082.f3953 == c12392.m30436() && c1082.f3955 == c1082.f3953.mo26548() && c1082.f3977.m44771() == i && c1082.f3977.m44768() == i && c1082.f3963.m30444() == i && c1082.f3963.m30448() == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0 == false) goto L14;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3683(l.C11459 r5) {
        /*
            r4 = this;
            l.۫ۨᩳ r0 = r4.f3963
            l.۟᩺ᩳ r0 = r0.m30436()
            r4.f3973 = r0
            int r0 = r0.mo26548()
            r4.f3972 = r0
            l.۫ۨᩳ r0 = r4.f3963
            int r0 = r0.f37227
            r4.f3949 = r0
            l.ۚۧܿ r0 = r4.f3976
            l.۫ۘܽ r1 = r4.f3954
            java.lang.String r2 = ""
            if (r1 == 0) goto L3a
            l.ۨۘܽ r1 = r1.pattern()
            if (r1 != r5) goto L3a
            if (r0 == 0) goto L31
            l.۫ۘܽ r1 = r0.f16580
            l.۫ۘܽ r3 = r4.f3954
            if (r1 != r3) goto L31
            boolean r0 = l.C5316.m15232(r0)
            if (r0 != 0) goto L31
            goto L3a
        L31:
            l.۫ۘܽ r5 = r4.f3954
            r5.m29615reset(r2)
            r5.m29604()
            return
        L3a:
            l.۫ۘܽ r5 = r5.matcher(r2)
            r5.m29604()
            r4.f3954 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1082.m3683(l.ۨۘܽ):void");
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m3694() {
        InterfaceC7785 interfaceC7785;
        if (this.f3954 == null) {
            return false;
        }
        InterfaceC7785 interfaceC77852 = this.f3973;
        C12392 c12392 = this.f3963;
        return interfaceC77852 == c12392.m30436() && (interfaceC7785 = this.f3973) != null && this.f3972 == interfaceC7785.mo26548() && this.f3949 == c12392.f37227;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3707() {
        C5316 c5316 = this.f3976;
        this.f3976 = null;
        if (c5316 != null) {
            c5316.m15234();
            c5316.m15236();
        }
        this.f3969 = false;
        this.f3978 = -1;
        this.f3974 = -1;
        this.f3953 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m3698(C5316 c5316) {
        return this.f3976 == c5316 && !c5316.m15237() && this.f3954 == c5316.f16580 && C11003.equals(this.f3961, c5316.f16578) && m3718() == c5316.f16584 && C11003.equals(this.f3963.m30518(), c5316.f16577) && this.f3959 == c5316.f16587 && this.f3950 == c5316.f16575;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m3686(C5316 c5316) {
        if (!m3698(c5316)) {
            return false;
        }
        InterfaceC7785 interfaceC7785 = c5316.f16569;
        C12392 c12392 = this.f3963;
        return interfaceC7785 == c12392.m30436() && c5316.f16588 == c5316.f16569.mo26548() && c5316.f16570 == c12392.f37227;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:20|(1:22)(1:(9:55|(1:60)|24|25|27|28|29|30|(2:32|33)(1:34))(2:53|54))|23|24|25|27|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0190, code lost:
    
        r3.m29599((java.lang.Runnable) null);
        r3.m29615reset((java.lang.CharSequence) "");
        r12.f16582 = true;
        r11 = new l.RunnableC17310(0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0177, code lost:
    
        l.C4925.m14315(new l.RunnableC14487(r11, r12, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        r3.m29599((java.lang.Runnable) null);
        r3.m29615reset((java.lang.CharSequence) "");
        r12.f16582 = true;
        r11 = new l.RunnableC17310(0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015b, code lost:
    
        l.C4925.m14315(new l.RunnableC23660(r11, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0163, code lost:
    
        r3.m29599((java.lang.Runnable) null);
        r3.m29615reset((java.lang.CharSequence) "");
        r12.f16582 = true;
        r11 = new l.RunnableC17310(0, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m3682(final l.C1082 r11, final l.C5316 r12, boolean r13, final boolean r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1082.m3682(l.֨ۧܿ, l.ۚۧܿ, boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3681(C1082 c1082, C5316 c5316, boolean z, C19428 c19428, boolean z2) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c1082.f3969 = z;
            int i = c5316.f16570;
            c1082.f3978 = i;
            if (z) {
                c1082.f3977 = c19428;
                c1082.f3974 = i;
                c1082.f3953 = c5316.f16569;
                c1082.f3955 = c5316.f16588;
                c1082.f3963.requestFocus();
                c1082.f3963.mo25922(c19428.m44771(), c19428.m44768());
                c1082.f3963.m30430(false);
                return;
            }
            c1082.m3700(z2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3678(C1082 c1082, C5316 c5316, RuntimeException runtimeException) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c1082.f3963.m30357(c5316.f16569, runtimeException);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3679(C1082 c1082, C5316 c5316, C14501 c14501) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            C21374.m48464(c14501.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3676(C1082 c1082, C5316 c5316) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            C21374.m48463(R.string.MT_Protector_res_0x7f120904);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m3687(final C5316 c5316, boolean z) {
        InterfaceC2494 interfaceC2494 = c5316.f16587;
        C14134 c14134 = c5316.f16573;
        if (interfaceC2494 == null || !c5316.f16575 || c5316.f16577 != null || !m3686(c5316)) {
            return false;
        }
        int mo7990 = interfaceC2494.mo7990();
        int mo7993 = interfaceC2494.mo7993();
        C12164 matcher = c5316.f16580.pattern().matcher((CharSequence) "");
        matcher.m29604();
        C11003.requireNonNull(c14134);
        matcher.m29599(new RunnableC19781(0, c14134));
        for (int i = 1; i < mo7990; i++) {
            try {
                c14134.m33742();
                if (!m3686(c5316)) {
                    break;
                }
                try {
                    final int i2 = ((z ? i : mo7990 - i) + mo7993) % mo7990;
                    final C19428 c19428 = new C19428();
                    try {
                        C7744 mo7991 = interfaceC2494.mo7991(i2);
                        try {
                            mo7991.m20766(new RunnableC19781(0, c14134));
                            matcher.m29615reset((CharSequence) mo7991);
                            if (m3688(matcher, 0, true)) {
                                c19428.m44769(matcher);
                                if (!z) {
                                    while (C12268.m29803(matcher)) {
                                        c19428.m44769(matcher);
                                    }
                                }
                                mo7991.close();
                                matcher.m29615reset((CharSequence) "");
                                C4925.m14315(new Runnable() { // from class: l.ۢۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1082.m3677(C1082.this, c5316, i2, c19428);
                                    }
                                });
                                matcher.m29599((Runnable) null);
                                matcher.m29615reset((CharSequence) "");
                                return true;
                            }
                            mo7991.close();
                            matcher.m29615reset((CharSequence) "");
                        } catch (Throwable th) {
                            try {
                                try {
                                    mo7991.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                matcher.m29615reset((CharSequence) "");
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    matcher.m29599((Runnable) null);
                    matcher.m29615reset((CharSequence) "");
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        matcher.m29599((Runnable) null);
        matcher.m29615reset((CharSequence) "");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۡۧܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3677(C1082 c1082, final C5316 c5316, int i, final C19428 c19428) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c5316.m15236();
            c5316.f16587.mo7992(i, new Runnable() { // from class: l.ۡۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C1082.m3680(C1082.this, c5316, c19428);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3680(C1082 c1082, C5316 c5316, C19428 c19428) {
        if (C11003.equals(c1082.f3961, c5316.f16578) && c1082.m3718() == c5316.f16584 && c1082.f3950) {
            c1082.m3683(c5316.f16580.pattern());
            int i = c1082.f3963.f37227;
            c1082.f3978 = i;
            c1082.f3958 = i;
            c1082.f3975 = null;
            c1082.f3977 = c19428;
            c1082.f3969 = true;
            c1082.f3974 = i;
            InterfaceC7785 m30436 = c1082.f3963.m30436();
            c1082.f3953 = m30436;
            c1082.f3955 = m30436.mo26548();
            c1082.f3963.requestFocus();
            c1082.f3963.mo25922(c19428.m44771(), c19428.m44768());
            c1082.f3963.m30430(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3713(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1082.m3713(java.lang.String, java.lang.String):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3720(String str, String str2) {
        if (this.f3964 == null && !this.f3968.m22793()) {
            C12392 c12392 = this.f3963;
            if (c12392.m30441() || c12392.f37258.mo9770()) {
                return;
            }
            this.f3978 = -1;
            this.f3958 = -1;
            if (str.length() == 0) {
                return;
            }
            try {
                C11459 m28259 = C11459.m28259(m3718(), str);
                if (this.f3965) {
                    try {
                        C13574.m32628(m28259, str2);
                    } catch (PatternSyntaxException e) {
                        m3673(e);
                        return;
                    }
                }
                InterfaceC3905 interfaceC3905 = this.f3962;
                if (interfaceC3905 != null) {
                    interfaceC3905.mo11910();
                }
                InterfaceC3905 interfaceC39052 = this.f3962;
                if (interfaceC39052 != null) {
                    interfaceC39052.mo11906();
                }
                InterfaceC7785 m30436 = c12392.m30436();
                int mo26548 = m30436.mo26548();
                final C12973 m30518 = c12392.m30518();
                boolean z = this.f3965;
                m3707();
                C14134 c14134 = new C14134(c12392, this.f3951, R.string.MT_Protector_res_0x7f1207a7, new BooleanSupplier() { // from class: l.ᩳۧܿ
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        boolean equals;
                        equals = C11003.equals(m30518, C1082.this.f3963.m30518());
                        return equals;
                    }
                });
                this.f3964 = c14134;
                new C15898(this, c14134, m30436, mo26548, m28259, m30518, str2, z, C7850.toPath(c12392.getContext().getCacheDir()).resolve("replace-output")).m20274();
            } catch (PatternSyntaxException e2) {
                m3673(e2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3715(InterfaceC3905 interfaceC3905) {
        this.f3962 = interfaceC3905;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m3690(C1082 c1082) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m3689(C1082 c1082) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m3700(boolean z) {
        this.f3962.mo11909(this.f3975 == null && this.f3959 != null && (!this.f3950 || z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3674(C1082 c1082, int i) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11907(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3673(PatternSyntaxException patternSyntaxException) {
        InterfaceC3905 interfaceC3905 = this.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11908(patternSyntaxException);
        }
    }
}
