package l;

/* compiled from: R7Z7 */
/* renamed from: l.ܿۜۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17176 extends C13439 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52641;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f52642;

    @Override // l.AbstractC19791
    /* renamed from: ᩴ */
    public final void mo5598() {
        C7381 m45497 = m45497();
        try {
            if (this.f40156) {
                new C3148().mo9572(m45497, this);
            }
            new C10204().m25613(m45497, this, this.f52642, this.f52641);
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 m19879 = m45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.ᩳۜۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17176.this.mo2847();
                    }
                };
                m19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("Subsystem for " + m45497.f22687);
                this.f63908.start();
            }
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651("ChannelSubsystem", e);
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
