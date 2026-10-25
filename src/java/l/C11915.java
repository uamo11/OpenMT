package l;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: T6QN */
/* renamed from: l.ۨ᩵ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11915 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35618;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23721 f35620;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35621;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23888 f35622;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10483 f35623;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0813 f35624;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11789 f35625;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35626;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22477 f35627;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13576 f35628;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35629;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4342 f35630;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35631;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f35619 = -1;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35632 = FutureC3575.m10905(0L);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29078(C22477 c22477) {
        if (this.f35627 != null || this.f35618 != null || this.f35629 != null) {
            throw new IllegalStateException("Session directory lease is already owned");
        }
        this.f35627 = c22477;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11915 m29053(l.InterfaceC20758 r20, l.C1143 r21, l.C4671 r22, java.util.concurrent.Executor r23, int r24, l.InterfaceC17066 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11915.m29053(l.᩷۠ᩴ, l.֨۬ᩳ, l.ۙ۬ᩳ, java.util.concurrent.Executor, int, l.ܿۖ᩷, java.lang.String):l.ۨ᩵ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29056(Throwable th) {
        C22477 c22477;
        synchronized (this) {
            c22477 = this.f35627;
            this.f35627 = null;
        }
        if (c22477 != null) {
            c22477.m50428(th);
        }
    }

    public C11915(C23721 c23721, C4342 c4342, C10483 c10483, C23888 c23888) {
        this.f35620 = c23721;
        this.f35630 = c4342;
        this.f35623 = c10483;
        this.f35622 = c23888;
        this.f35624 = new C0813(c4342);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11915 m29054(InterfaceC20758 interfaceC20758, C6417 c6417) {
        C23721 m52300 = C23721.m52300(interfaceC20758, c6417.f19851, c6417.f19853);
        m52300.m52365();
        C11915 c11915 = new C11915(m52300, new C4342(m52300), null, new C23888(m52300, interfaceC20758, c6417.f19851, c6417.f19852));
        c11915.f35622.f77236 = c6417;
        return c11915;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29073(int i, int i2, CharSequence charSequence) {
        C4342 c4342 = this.f35630;
        c4342.m13048(c4342.length(), c4342.length(), charSequence, i, i2);
        this.f35620.m52349();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29076(C6249 c6249, Bundle bundle, C23077 c23077, String str, C6417 c6417, InterfaceC17066 interfaceC17066, int i) {
        C23721 c23721 = this.f35620;
        c23721.m52369();
        C4342 c4342 = this.f35630;
        c4342.setSelection(i, i);
        c4342.mo1600(false);
        C12704 m52357 = c23721.m52357();
        try {
            C12599 m17223 = c6249.m17223(m52357, bundle, c23077, str, 0, 0, true);
            m52357.close();
            this.f35622.getClass();
            m29055(bundle, c23077, m17223, c6417, 8388608, interfaceC17066, false);
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29077(C13576 c13576, int i, int i2) {
        this.f35628 = c13576;
        this.f35631 = i;
        Bundle m32653 = c13576.m32653();
        C23721 c23721 = this.f35620;
        C12704 m52357 = c23721.m52357();
        try {
            C12599 m17224 = this.f35623.f31452.m17224(m52357, m32653, c13576.m32656() == 1 ? this.f35623.f31451 : c13576.m32657(), c13576.m32658(), true, i2);
            m52357.close();
            try {
                C12704 m523572 = c23721.m52357();
                try {
                    C6249 m17218 = C6249.m17218(m17224.m30864(), i2, m523572);
                    try {
                        C10483 m17221 = m17218.m17221(c23721, c13576.m32656() == 1 ? this.f35623.f31451 : c13576.m32657());
                        C10483 c10483 = this.f35623;
                        this.f35623 = m17221;
                        if (c10483 != null) {
                            c10483.close();
                        }
                        m17218.close();
                        m523572.close();
                        m17224.close();
                        C23888 c23888 = this.f35622;
                        c23888.f77242 = c13576;
                        c23888.f77240 = i;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    m17224.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                m52357.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29072(int i) {
        Bundle m44358 = this.f35623.f31452.f19337.m44358();
        m44358.putInt("textPageSize", i);
        C23721 c23721 = this.f35620;
        C12704 m52357 = c23721.m52357();
        try {
            C10483 c10483 = this.f35623;
            C12599 m17222 = c10483.f31452.m17222(m52357, m44358, c10483.f31451);
            try {
                C6249 m17218 = C6249.m17218(m17222.m30864(), 8388608, m52357);
                try {
                    C10483 m17221 = m17218.m17221(c23721, this.f35623.f31451);
                    C10483 c104832 = this.f35623;
                    this.f35623 = m17221;
                    if (c104832 != null) {
                        c104832.close();
                    }
                    m17218.close();
                    m17222.close();
                    m52357.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                m52357.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29075(C2931 c2931, byte[] bArr, byte[] bArr2, C6417 c6417, int i) {
        Bundle m44358 = this.f35623.f31452.f19337.m44358();
        C12704 m52357 = this.f35620.m52357();
        try {
            C10483 c10483 = this.f35623;
            C12599 m17216 = C6249.m17216(m52357, m44358, c10483.f31451, c10483.f31452.f19335.m8946(c2931), bArr, bArr2, i);
            m52357.close();
            this.f35622.getClass();
            m29055(m44358, this.f35623.f31451, m17216, c6417, i, (InterfaceC17066) new C11461(), false);
        } catch (Throwable th) {
            try {
                m52357.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m29070(InterfaceC20758 interfaceC20758, AbstractC3322 abstractC3322, boolean z, int i, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z2) {
        C4342 c4342;
        String str;
        String str2;
        C23721 c23721;
        C12599 m17224;
        int i2;
        Bundle m44358 = this.f35623.f31452.f19337.m44358();
        boolean z3 = m44358.getBoolean("e2SourcePending");
        C23721 c237212 = this.f35620;
        if (!z3 && c237212.m52350().m14691()) {
            return this;
        }
        SystemClock.elapsedRealtime();
        if (z3) {
            C11273 m41183 = C17622.m41183(abstractC3322, z, i, interfaceC17066);
            m29059(interfaceC17066);
            if (m41183 != null) {
                m29057(abstractC3322, false, m41183, 0, 0, c6417, interfaceC17066, z2);
                m29067();
                return this;
            }
            if (m44358.getInt("textPageSize") <= 0 && this.f35628 == null) {
                this.f35625 = C11789.m28842(c237212, new C4838(abstractC3322), c6417.f19851, i, interfaceC17066);
            } else {
                return C13576.m32634(this, interfaceC20758, abstractC3322, i, c6417, interfaceC17066, -1L);
            }
        } else {
            InterfaceC20900 c4838 = new C4838(abstractC3322);
            if (interfaceC17066 instanceof C2037) {
                c4838 = new C23182(c4838, interfaceC17066);
            }
            this.f35625 = C11789.m28841(c237212, c4838, this.f35623.f31451.f74223);
        }
        m29067();
        String m14686 = this.f35625.m28847().m14686();
        String m8943 = z3 ? m14686 : this.f35623.f31452.f19335.m8943(m14686);
        C18495 m28849 = this.f35625.m28849();
        try {
            m29059(interfaceC17066);
            C4342 c43422 = this.f35630;
            if (m28849 != null) {
                InterfaceC0897 m26561 = c43422.m26561();
                C11003.requireNonNull(m26561);
                m26561.mo3242(m28849);
            }
            if (m28849 != null) {
                m28849.close();
            }
            if (!this.f35625.m28847().m14691() && this.f35625.m28847().m14689() != EnumC0191.LOADING) {
                throw new IOException("Cannot prepare source text", this.f35625.m28846());
            }
            C23077 m28848 = z3 ? this.f35625.m28848() : this.f35623.f31451;
            if (z3) {
                c43422.setSelection(0, 0);
                c43422.mo1600(false);
            }
            m44358.putBoolean("e2SourcePending", false);
            m44358.putBoolean("changed", c43422.isChanged());
            m44358.putBoolean(d.O, false);
            if (z3) {
                m44358.putLong("fileTime", ((C4733) abstractC3322).f15019.mo23117());
                m44358.putBoolean("checkFileExists", true);
            }
            String m146862 = (z3 || m8943.equals(m14686)) ? this.f35625.m28847().m14686() : m8943;
            C12704 m52357 = c237212.m52357();
            try {
                if (z3) {
                    c4342 = c43422;
                    str = m8943;
                    str2 = m14686;
                    i2 = 8388608;
                    m17224 = this.f35623.f31452.m17223(m52357, m44358, m28848, m146862, 0, 0, this.f35625.m28847().m14691());
                    c23721 = c237212;
                } else {
                    c4342 = c43422;
                    str = m8943;
                    str2 = m14686;
                    String str3 = m146862;
                    c23721 = c237212;
                    m17224 = this.f35623.f31452.m17224(m52357, m44358, m28848, str3, this.f35625.m28847().m14691(), 8388608);
                    i2 = 8388608;
                }
                m52357.close();
                m29055(m44358, m28848, m17224, c6417, i2, interfaceC17066, z2 && this.f35625.m28847().m14691());
                m29067();
                C11789 c11789 = this.f35625;
                boolean m14691 = c11789.m28847().m14691();
                while (c11789.m28847().m14689() == EnumC0191.LOADING) {
                    m29059(interfaceC17066);
                    m28849 = c11789.m28849();
                    try {
                        m29059(interfaceC17066);
                        if (m28849 != null) {
                            InterfaceC0897 m265612 = c4342.m26561();
                            C11003.requireNonNull(m265612);
                            m265612.mo3242(m28849);
                        }
                        if (m28849 != null) {
                            m28849.close();
                        }
                    } finally {
                    }
                }
                m29059(interfaceC17066);
                if (!c11789.m28847().m14691()) {
                    throw new IOException("Cannot display incomplete source text", c11789.m28846());
                }
                String m146863 = (z3 || str.equals(str2)) ? c11789.m28847().m14686() : str;
                c11789.close();
                this.f35625 = null;
                if (m14691) {
                    m29067();
                    return this;
                }
                m52357 = c23721.m52357();
                try {
                    C12599 m172242 = this.f35623.f31452.m17224(m52357, m44358, m28848, m146863, true, 8388608);
                    m52357.close();
                    m29055(m44358, m28848, m172242, c6417, 8388608, interfaceC17066, z2);
                    m29067();
                    return this;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29080() {
        return this.f35632.m10921((InterfaceC21423) new C13325(0));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29067() {
        SystemClock.elapsedRealtime();
        C23721 c23721 = this.f35620;
        c23721.length();
        Integer.toHexString(System.identityHashCode(c23721));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29074(Bundle bundle, C23077 c23077, C12599 c12599, C6417 c6417, C11461 c11461) {
        m29055(bundle, c23077, c12599, c6417, 8388608, (InterfaceC17066) c11461, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29055(Bundle bundle, C23077 c23077, C12599 c12599, C6417 c6417, int i, InterfaceC17066 interfaceC17066, boolean z) {
        C23721 c23721 = this.f35620;
        InterfaceC20758 m52636 = this.f35622.m52636();
        try {
            C12704 m52357 = c23721.m52357();
            try {
                C5377 m30978 = m52357.m30978((c12599.m30864().length * 4) + X931RNG.BLOCK64_RESEED_MAX);
                try {
                    C6249 m17218 = C6249.m17218(c12599.m30864(), i, m52357);
                    try {
                        m29059(interfaceC17066);
                        C11481 m28297 = C11481.m28297(m52636, c23721.m52352(), new ByteArrayInputStream(c12599.m30864()), c12599.m30864().length, i, c6417.f19851);
                        C7206 m52360 = c23721.m52360();
                        try {
                            FutureC3575 m52354 = c23721.m52354(m52360.m19286(C7869.m21145(m52360.m19285(), m28297, c23721.m52352())));
                            this.f35632 = m52354;
                            if (!z) {
                                m52354.m10930();
                            }
                            m52360.close();
                            C9240.m23681(m52636, bundle);
                            if (this.f35628 != null) {
                                this.f35632.m10930();
                                this.f35628.m32650(this.f35631, bundle, this.f35630.isChanged(), c23077.f74223, m17218.f19335.m8943(this.f35628.m32658()));
                            }
                            C10483 m17221 = m17218.m17221(c23721, c23077);
                            C10483 c10483 = this.f35623;
                            this.f35623 = m17221;
                            if (c10483 != null) {
                                c10483.close();
                            }
                            m17218.close();
                            if (m30978 != null) {
                                m30978.close();
                            }
                            m52357.close();
                            c12599.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29079() {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35621;
            if (futureC3575 == null) {
                C11789 c11789 = this.f35625;
                if (c11789 == null) {
                    return FutureC3575.m10905(null);
                }
                FutureC3575 m10896 = FutureC3575.m10896(new RunnableC0625(c11789), C1802.f6209);
                this.f35621 = m10896;
                this.f35625 = null;
                return m10896.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m29071(InterfaceC20758 interfaceC20758, C4733 c4733, boolean z, boolean z2, int i, int i2, int i3, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z3) {
        long j;
        C23721 c23721 = this.f35620;
        if (z3) {
            j = Math.max(0, c23721.m52359().m14642());
            if (this.f35628 != null) {
                for (int i4 = 0; i4 < this.f35631; i4++) {
                    m29059(interfaceC17066);
                    try {
                        j += r5.length();
                        this.f35628.m32646(i4, c6417).close();
                    } finally {
                    }
                }
            }
        } else {
            j = -1;
        }
        long j2 = j;
        C11273 m41182 = z ? C17622.m41182() : C17622.m41183(c4733, z2, i, interfaceC17066);
        m29059(interfaceC17066);
        if (m41182 == null && (this.f35628 != null || this.f35623.f31452.f19337.m44358().getInt("textPageSize") > 0)) {
            return C13576.m32634(this, interfaceC20758, c4733, i, c6417, interfaceC17066, j2);
        }
        if (this.f35628 != null) {
            return C13576.m32633(this, c4733, z, m41182, c6417, interfaceC17066, j2);
        }
        if (m41182 == null) {
            C4342 c4342 = this.f35630;
            c4342.replace(0, c4342.length(), (CharSequence) "");
            c23721.m52369();
            c4342.setSelection(0, 0);
            c4342.mo1600(false);
            Bundle m44358 = this.f35623.f31452.f19337.m44358();
            m44358.putBoolean("e2SourcePending", true);
            C12704 m52357 = c23721.m52357();
            try {
                C12599 m17223 = this.f35623.f31452.m17223(m52357, m44358, (C23077) null, "\n", i2, i3, false);
                try {
                    C6249 m17218 = C6249.m17218(m17223.m30864(), 8388608, m52357);
                    try {
                        C10483 m17221 = m17218.m17221(c23721, (C23077) null);
                        C10483 c10483 = this.f35623;
                        this.f35623 = m17221;
                        if (c10483 != null) {
                            c10483.close();
                        }
                        m17218.close();
                        m17223.close();
                        m52357.close();
                        return m29070(interfaceC20758, (AbstractC3322) c4733, z2, i, c6417, interfaceC17066, true);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            m29057(c4733, z, m41182, i2, i3, c6417, interfaceC17066, true);
            return this;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29057(AbstractC3322 abstractC3322, boolean z, C11273 c11273, int i, int i2, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z2) {
        CharSequence charSequence = c11273.f33779;
        m29059(interfaceC17066);
        C4342 c4342 = this.f35630;
        c4342.replace(0, c4342.length(), (CharSequence) "");
        C23721 c23721 = this.f35620;
        c23721.m52349();
        int i3 = 0;
        while (i3 < charSequence.length()) {
            long j = i3;
            int min = (int) Math.min(charSequence.length(), ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF + j);
            CharSequence charSequence2 = c11273.f33779;
            m29059(interfaceC17066);
            if ((c4342.length() + min) - j > 2147483647L) {
                throw new IOException("Reloaded text exceeds coordinate limit");
            }
            c4342.m13048(c4342.length(), c4342.length(), charSequence2, i3, min);
            c23721.m52349();
            i3 = min;
        }
        c23721.m52369();
        c4342.setSelection(0, 0);
        c4342.mo1600(false);
        Bundle m44358 = this.f35623.f31452.f19337.m44358();
        m44358.putBoolean("changed", false);
        m44358.putBoolean(d.O, false);
        m44358.putBoolean("e2SourcePending", false);
        if (!z) {
            m44358.putLong("fileTime", ((C4733) abstractC3322).f15019.mo23117());
            m44358.putBoolean("checkFileExists", true);
        }
        C12704 m52357 = c23721.m52357();
        try {
            C12599 m17223 = this.f35623.f31452.m17223(m52357, m44358, c11273.f33778, c11273.f33776, i, i2, true);
            m52357.close();
            m29055(m44358, c11273.f33778, m17223, c6417, 8388608, interfaceC17066, z2);
        } finally {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m29061(InterfaceC20758 interfaceC20758, C6417 c6417) {
        boolean z;
        C23721 c23721;
        C23077 c23077;
        C11915 m29053 = m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
        try {
            Bundle m44358 = m29053.f35623.f31452.f19337.m44358();
            String string = m44358.getString("filePath");
            if (string == null || string.equals("untitled")) {
                throw new IOException("Untitled session requires an output path");
            }
            AbstractC15440 m39866 = C16999.m39866(string, new String[0]);
            C4733 c4733 = new C4733(m39866);
            if (!m44358.getBoolean("forceTryAXml") && !m44358.getBoolean("forceTryClass")) {
                z = false;
                m29053 = m29053.m29070(interfaceC20758, (AbstractC3322) c4733, z, -1, c6417, (InterfaceC17066) new C11461(), false);
                c23721 = m29053.f35620;
                String m8943 = m29053.f35623.f31452.f19335.m8943(c23721.m52350().m14686());
                if (c23721.m52350().m14691() || (c23077 = m29053.f35623.f31451) == null) {
                    throw new IOException("Session text is not ready for saving");
                }
                C14799 m35199 = C14799.m35199(m29053, m8943, c23077);
                try {
                    m35199.m35203(c4733);
                    m35199.m35202();
                    m35199.close();
                    m29053.f35630.mo1600(false);
                    Bundle m443582 = m29053.f35623.f31452.f19337.m44358();
                    m443582.putBoolean("changed", false);
                    m443582.putBoolean(d.O, false);
                    m443582.putLong("fileTime", m39866.mo23117());
                    m443582.putBoolean("checkFileExists", true);
                    C12704 m52357 = c23721.m52357();
                    try {
                        C10483 c10483 = m29053.f35623;
                        C12599 m17224 = c10483.f31452.m17224(m52357, m443582, c10483.f31451, m8943, true, 8388608);
                        m52357.close();
                        m29053.m29055(m443582, m29053.f35623.f31451, m17224, c6417, 8388608, (InterfaceC17066) new C11461(), false);
                        m29053.m29069(c23721.m52371()).m10930();
                        return m443582;
                    } finally {
                    }
                } finally {
                }
            }
            z = true;
            m29053 = m29053.m29070(interfaceC20758, (AbstractC3322) c4733, z, -1, c6417, (InterfaceC17066) new C11461(), false);
            c23721 = m29053.f35620;
            String m89432 = m29053.f35623.f31452.f19335.m8943(c23721.m52350().m14686());
            if (c23721.m52350().m14691()) {
            }
            throw new IOException("Session text is not ready for saving");
        } catch (Throwable th) {
            m29053.m29068().m10930();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29059(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Fragment recovery is canceled");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29060(InterfaceC20758 interfaceC20758, C0604 c0604, C6417 c6417) {
        C11915 m29053 = m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
        C23721 c23721 = m29053.f35620;
        Throwable th = null;
        try {
            try {
                Bundle m44358 = m29053.f35623.f31452.f19337.m44358();
                c0604.m2480(m44358);
                C12704 m52357 = c23721.m52357();
                try {
                    C10483 c10483 = m29053.f35623;
                    C12599 m17222 = c10483.f31452.m17222(m52357, m44358, c10483.f31451);
                    m52357.close();
                    m29053.m29055(m44358, m29053.f35623.f31451, m17222, c6417, 8388608, (InterfaceC17066) new C11461(), false);
                    m29053.m29069(c23721.m52371()).m10930();
                    m29053.m29068().m10930();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    m29053.m29068().m10930();
                    throw th2;
                } catch (Error | RuntimeException e) {
                    if (0 == 0) {
                        throw e;
                    }
                    th.addSuppressed(e);
                    throw th2;
                }
            }
        } catch (IOException | Error | RuntimeException e2) {
            throw e2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29069(long j) {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35629;
            if (futureC3575 == null) {
                FutureC3575 futureC35752 = this.f35618;
                if (futureC35752 == null) {
                    synchronized (this.f35620) {
                        if (this.f35620.m52371() != j || this.f35620.m52361() < j) {
                            throw new IllegalStateException("Fragment final checkpoint is not current and durable");
                        }
                    }
                    this.f35624.close();
                    this.f35630.close();
                    final FutureC3575 futureC35753 = new FutureC3575();
                    this.f35618 = futureC35753;
                    FutureC3575 m52630 = this.f35622.m52630();
                    C23888 c23888 = this.f35622;
                    C11003.requireNonNull(c23888);
                    m52630.m10920(new RunnableC0918(1, c23888), C1802.f6209).m10911((InterfaceC15071) new C20382()).m10927(new InterfaceC21423() { // from class: l.ۙ᩵ᩳ
                        @Override // l.InterfaceC21423
                        public final Object apply(Object obj) {
                            final Throwable th = (Throwable) obj;
                            final C11915 c11915 = C11915.this;
                            C13576 c13576 = c11915.f35628;
                            return (c13576 == null ? FutureC3575.m10905(null) : c13576.m32655()).m10927(new InterfaceC21423() { // from class: l.᩸᩵ᩳ
                                @Override // l.InterfaceC21423
                                public final Object apply(Object obj2) {
                                    FutureC3575 m52366;
                                    m52366 = C11915.this.f35620.m52366();
                                    return m52366;
                                }
                            }).m10911(new InterfaceC15071() { // from class: l.᩹᩵ᩳ
                                @Override // l.InterfaceC15071
                                /* renamed from: ֫ */
                                public final Object mo25124(Object obj2, Throwable th2) {
                                    Throwable m29066;
                                    m29066 = C11915.m29066(th, th2);
                                    return m29066;
                                }
                            });
                        }
                    }).m10910(new InterfaceC8017() { // from class: l.ۗ᩵ᩳ
                        @Override // l.InterfaceC8017
                        /* renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            C11915.m29058(C11915.this, futureC35753, (Throwable) obj, th);
                        }
                    });
                    return futureC35753.m10921((InterfaceC21423) new C5368());
                }
                return futureC35752.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29058(C11915 c11915, FutureC3575 futureC3575, Throwable th, Throwable th2) {
        C10483 c10483;
        Throwable m29066 = m29066(th, th2);
        synchronized (c11915) {
            c10483 = c11915.f35623;
            c11915.f35623 = null;
        }
        if (c10483 != null) {
            c10483.close();
        }
        c11915.m29056(m29066);
        if (m29066 == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if ((m29066 instanceof C13452) && m29066.getCause() != null) {
            m29066 = m29066.getCause();
        }
        futureC3575.m10914(m29066);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29068() {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35629;
            if (futureC3575 == null) {
                FutureC3575 futureC35752 = this.f35618;
                this.f35624.close();
                final FutureC3575 futureC35753 = new FutureC3575();
                this.f35629 = futureC35753;
                (futureC35752 == null ? FutureC3575.m10905(null) : futureC35752.m10911((InterfaceC15071) new C23202(6))).m10927((InterfaceC21423) new C12620(0, this)).m10911((InterfaceC15071) new C10504(this)).m10927((InterfaceC21423) new C6270(this)).m10927(new InterfaceC21423() { // from class: l.ۚ᩵ᩳ
                    @Override // l.InterfaceC21423
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        final C11915 c11915 = C11915.this;
                        C13576 c13576 = c11915.f35628;
                        return (c13576 == null ? FutureC3575.m10905(null) : c13576.m32655()).m10927(new InterfaceC21423() { // from class: l.۠᩵ᩳ
                            @Override // l.InterfaceC21423
                            public final Object apply(Object obj2) {
                                FutureC3575 m52331;
                                m52331 = C11915.this.f35620.m52331();
                                return m52331;
                            }
                        }).m10911((InterfaceC15071) new C15441(th));
                    }
                }).m10910(new InterfaceC8017() { // from class: l.֨᩵ᩳ
                    @Override // l.InterfaceC8017
                    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
                    public final void mo4663(Object obj, Throwable th) {
                        C11915.m29064(C11915.this, futureC35753, (Throwable) obj, th);
                    }
                });
                return futureC35753.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Throwable m29051(C11915 c11915, Throwable th) {
        try {
            c11915.f35630.close();
            return th;
        } catch (Throwable th2) {
            return m29066(th, th2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29064(C11915 c11915, FutureC3575 futureC3575, Throwable th, Throwable th2) {
        C10483 c10483;
        Throwable m29066 = m29066(th, th2);
        synchronized (c11915) {
            c10483 = c11915.f35623;
            c11915.f35623 = null;
        }
        if (c10483 != null) {
            c10483.close();
        }
        c11915.m29056(m29066);
        if (m29066 == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if ((m29066 instanceof C13452) && m29066.getCause() != null) {
            m29066 = m29066.getCause();
        }
        futureC3575.m10914(m29066);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Throwable m29066(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        if (th2 != null && th != th2) {
            th.addSuppressed(th2);
        }
        return th;
    }
}
