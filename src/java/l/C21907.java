package l;

import java.nio.charset.StandardCharsets;

/* compiled from: S7YI */
/* renamed from: l.᩸᩻ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21907 extends C13439 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f70150 = new byte[0];

    @Override // l.AbstractC19791
    /* renamed from: ᩴ */
    public final void mo5598() {
        C7381 m45497 = m45497();
        try {
            m32473();
            new C4559(this.f70150).mo9572(m45497, this);
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 m19879 = m45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.ܶ᩻ۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21907.this.mo2847();
                    }
                };
                m19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("Exec thread " + m45497.f22687);
                this.f63908.start();
            }
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651("ChannelExec", e);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m49307() {
        byte[] bArr = C19356.f62660;
        this.f70150 = "echo '===SYSTEM_TYPE==='; uname -s; echo '===USER_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Users UniqueID; else cat /etc/passwd; fi; echo '===GROUP_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Groups PrimaryGroupID; else cat /etc/group; fi".getBytes(StandardCharsets.UTF_8);
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
