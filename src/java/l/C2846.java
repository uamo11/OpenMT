package l;

import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: 6626 */
/* renamed from: l.ۖ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2846 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f9086;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f9087;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18177 f9088;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f9089;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5396 f9090;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f9091;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f9092;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23034 f9093;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8218 f9094;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f9095;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f9096;

    public C2846(ViewOnClickListenerC5396 viewOnClickListenerC5396, String str, boolean z, boolean z2) {
        this.f9090 = viewOnClickListenerC5396;
        this.f9095 = viewOnClickListenerC5396.f16766;
        this.f9091 = str;
        this.f9087 = z;
        this.f9092 = z2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        boolean z = this.f9092;
        int i = R.string.MT_Protector_res_0x7f120808;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (z) {
            try {
                m20267(viewOnClickListenerC5396, R.string.MT_Protector_res_0x7f120808);
            } catch (RuntimeException unused) {
            }
        } else {
            if (!this.f9087) {
                i = R.string.MT_Protector_res_0x7f1203b0;
            }
            m20267(viewOnClickListenerC5396, i);
            this.f23322.m31860((Runnable) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo8740() {
        return this.f9092;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܺ᩺ܿ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܺ᩺ܿ] */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440 = this.f9095;
        if (C19780.m45467(abstractC15440.mo23554(), new C9196(this))) {
            boolean z = this.f9087;
            String str = this.f9091;
            if (!z) {
                C23034.m51172(str);
            }
            if (str != null) {
                ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
                C23034 c23034 = null;
                try {
                    c23034 = C23034.m51171(str, (C16250) new InterfaceC17066() { // from class: l.ܺ᩺ܿ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            return C2846.this.m8739();
                        }
                    });
                    C13428 m31005 = C12723.m31005(c23034, abstractC15440, (C16250) new InterfaceC17066() { // from class: l.ܺ᩺ܿ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            return C2846.this.m8739();
                        }
                    });
                    this.f9093 = c23034;
                    C18177 c18177 = m31005.f40126;
                    this.f9088 = c18177;
                    c18177.m42382(viewOnClickListenerC5396.getCacheDir());
                    this.f9094 = m31005.f40128;
                    this.f9096 = m31005.f40125;
                    this.f9086 = m31005.f40127;
                    return;
                } catch (Exception e) {
                    if (this.f9092 && !(e instanceof C23821) && viewOnClickListenerC5396.m15397()) {
                        this.f9089 = true;
                    } else if (c23034 != null && !viewOnClickListenerC5396.m15391(c23034)) {
                        try {
                            c23034.m51197();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else if (c23034 == null) {
                        C23034.m51173(str, e);
                    }
                    if (this.f9089) {
                        return;
                    }
                }
            }
            if (m8739()) {
                return;
            }
            if (!abstractC15440.m36507() && (!abstractC15440.mo27911() || !abstractC15440.mo23119())) {
                throw new IOException("File can not be read");
            }
            try {
                m8737();
            } catch (C23821 unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8737() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2846.m8737():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C18177 c18177;
        boolean z = this.f9089;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (z) {
            viewOnClickListenerC5396.m15392();
            return;
        }
        if (m8739() || (c18177 = this.f9088) == null) {
            m8738();
            if (viewOnClickListenerC5396.m15401()) {
                return;
            }
            viewOnClickListenerC5396.finish();
            return;
        }
        this.f9090.m15387(c18177, this.f9093, this.f9094, this.f9096, this.f9086);
        this.f9088 = null;
        this.f9093 = null;
        if (viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed() || viewOnClickListenerC5396.m15393() || C23196.m51454()) {
            return;
        }
        C21374.m48463(R.string.MT_Protector_res_0x7f120434);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        m8738();
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed()) {
            return;
        }
        viewOnClickListenerC5396.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m8738() {
        C18177 c18177 = this.f9088;
        if (c18177 != null) {
            try {
                c18177.close();
            } catch (IOException unused) {
            }
            this.f9088 = null;
        }
        C23034 c23034 = this.f9093;
        if (c23034 == null || this.f9090.m15391(c23034)) {
            return;
        }
        try {
            this.f9093.m51197();
        } catch (IOException unused2) {
        }
        this.f9093 = null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m8739() {
        if (this.f9090.m15400()) {
            return true;
        }
        C13136 c13136 = this.f23322;
        return c13136 != null && c13136.m31868();
    }
}
