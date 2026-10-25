package l;

/* compiled from: S7ZI */
/* renamed from: l.ܽۜۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16470 extends C13439 {
    @Override // l.AbstractC19791
    /* renamed from: ᩴ */
    public final void mo5598() {
        C7381 m45497 = m45497();
        try {
            m32473();
            new C12320().mo9572(m45497, this);
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 m19879 = m45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.ۧۜۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16470.this.mo2847();
                    }
                };
                m19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("Shell for " + m45497.f22687);
                this.f63908.start();
            }
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651("ChannelShell", e);
        }
    }

    @Override // l.AbstractC19791
    /* renamed from: ۜ */
    public final void mo5591() {
        C19708 c19708 = this.f63917;
        m45497();
        c19708.f63666 = null;
        C19708 c197082 = this.f63917;
        m45497();
        c197082.f63667 = null;
    }
}
