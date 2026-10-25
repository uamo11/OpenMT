package l;

import java.io.IOException;

/* compiled from: V4E2 */
/* renamed from: l.۫᩺᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12726 implements InterfaceC17733 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7787 f38282;

    public C12726(C7787 c7787) {
        this.f38282 = c7787;
    }

    @Override // l.InterfaceC17733
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18621 mo31019(C8743 c8743) {
        C7787 c7787 = this.f38282;
        try {
            C1505 m26800 = c7787.f24060.m26800(C11816.m28900(c8743.f26640.toString()).mo2334().mo2332());
            if (m26800 != null) {
                try {
                    C14136 c14136 = new C14136(m26800.m5185(0));
                    C18621 m33746 = c14136.m33746(m26800);
                    if (c14136.m33748(c8743, m33746)) {
                        return m33746;
                    }
                    C20032.m46179(m33746.f57745);
                    return null;
                } catch (IOException unused) {
                    C20032.m46179(m26800);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // l.InterfaceC17733
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31016(C8743 c8743) {
        this.f38282.f24060.m26804(C11816.m28900(c8743.f26640.toString()).mo2334().mo2332());
    }

    @Override // l.InterfaceC17733
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31015() {
        synchronized (this.f38282) {
        }
    }

    @Override // l.InterfaceC17733
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31017(C10154 c10154) {
        synchronized (this.f38282) {
        }
    }

    @Override // l.InterfaceC17733
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12975 mo31014(C18621 c18621) {
        C13680 c13680;
        C7787 c7787 = this.f38282;
        C10678 c10678 = c7787.f24060;
        C8743 c8743 = c18621.f57743;
        String str = c8743.f26643;
        C11749 c11749 = c8743.f26640;
        if (!C3395.m10359(str)) {
            if (str.equals("GET")) {
                int i = C0799.f2925;
                if (!C0799.m3018(c18621.f57742).contains("*")) {
                    C14136 c14136 = new C14136(c18621);
                    try {
                        c13680 = c10678.m26796(C11816.m28900(c11749.toString()).mo2334().mo2332());
                        if (c13680 != null) {
                            try {
                                c14136.m33747(c13680);
                                return new C6376(c7787, c13680);
                            } catch (IOException unused) {
                                if (c13680 != null) {
                                    c13680.m32918();
                                }
                                return null;
                            }
                        }
                    } catch (IOException unused2) {
                        c13680 = null;
                    }
                }
            }
            return null;
        }
        c10678.m26804(C11816.m28900(c11749.toString()).mo2334().mo2332());
        return null;
    }

    @Override // l.InterfaceC17733
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31018(C18621 c18621, C18621 c186212) {
        C13680 c13680;
        C14136 c14136 = new C14136(c186212);
        try {
            c13680 = ((C23309) c18621.f57745).f74924.m5186();
            if (c13680 != null) {
                try {
                    c14136.m33747(c13680);
                    c13680.m32919();
                } catch (IOException unused) {
                    if (c13680 != null) {
                        try {
                            c13680.m32918();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            c13680 = null;
        }
    }
}
