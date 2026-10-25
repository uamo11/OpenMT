package l;

/* compiled from: J57T */
/* renamed from: l.ۧۘۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class RunnableC10749 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f32377;

    public RunnableC10749(C19922 c19922, String str) {
        super(c19922);
        this.f32377 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String m48358 = AbstractRunnableC21333.m48358(this.f32377);
        C19922 c19922 = this.f68752;
        String m45864 = c19922.m45864();
        if (m45864 == null) {
            c19922.m45860("503 Must send USER first\r\n");
            return;
        }
        if (m45864.equals("anonymous") && C14981.m35464()) {
            c19922.m45860("230 Guest login ok, read only access.\r\n");
            return;
        }
        if (C14981.m35465(m45864, m48358)) {
            c19922.m45860("230 Access granted\r\n");
            c19922.m45845(true);
        } else {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            c19922.m45860("530 Login incorrect.\r\n");
            c19922.m45845(false);
        }
    }
}
