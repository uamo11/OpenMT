package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: 3AGE */
/* renamed from: l.ܰۡ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13724 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1936 f40993;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12519 f40994;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f40995;

    public C13724(AbstractActivityC3346 abstractActivityC3346, C1936 c1936) {
        this.f40995 = abstractActivityC3346;
        this.f40993 = c1936;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f40995, R.string.MT_Protector_res_0x7f1201e9);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        try {
            try {
                m33020();
                if (this.f23322.m31868()) {
                    C12519 c12519 = this.f40994;
                    if (c12519 == null || !c12519.m15539()) {
                        return;
                    }
                } else {
                    try {
                        this.f23322.m31858(R.string.MT_Protector_res_0x7f120af8);
                        m33021();
                        if (this.f23322.m31868()) {
                            C12519 c125192 = this.f40994;
                            if (c125192 == null || !c125192.m15539()) {
                                return;
                            }
                        } else {
                            this.f23322.m31863(R.string.MT_Protector_res_0x7f120408);
                            this.f40994.mo26242();
                            this.f40994.m13876();
                            if (this.f40994.m36355() != 226) {
                                throw new Exception(this.f40994.m36351());
                            }
                            C12519 c125193 = this.f40994;
                            if (c125193 == null || !c125193.m15539()) {
                                return;
                            }
                        }
                    } catch (C1637 e) {
                        throw e;
                    } catch (C19401 e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new Exception(C4925.m14327(R.string.MT_Protector_res_0x7f120afe) + ": " + e3.getMessage(), e3);
                    }
                }
                try {
                    this.f40994.mo13861();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C12519 c125194 = this.f40994;
                if (c125194 != null && c125194.m15539()) {
                    try {
                        this.f40994.mo13861();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            throw new Exception(C4925.m14327(R.string.MT_Protector_res_0x7f1201e7) + ": " + e4.getMessage(), e4);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m33020() {
        C12519 c12519 = new C12519(null);
        this.f40994 = c12519;
        C1936 c1936 = this.f40993;
        c12519.m36354(c1936.f6477);
        C12519 c125192 = this.f40994;
        Charset.forName(c1936.f6477);
        c125192.getClass();
        this.f40994.m15531(c1936.f6481, c1936.f6478);
        if (c1936.f6480) {
            this.f40994.m13854();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33021() {
        C1936 c1936 = this.f40993;
        String str = c1936.f6479;
        String str2 = c1936.f6482;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f40994.m13868(str, str2)) {
            return;
        }
        StringBuilder m19190 = C7166.m19190(C4925.m14327(R.string.MT_Protector_res_0x7f120afe), ": ");
        m19190.append(this.f40994.m36351());
        throw new C1637(m19190.toString());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f1206d4);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f40995.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
