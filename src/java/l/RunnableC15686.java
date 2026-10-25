package l;

/* compiled from: Q64Y */
/* renamed from: l.ܺۘۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class RunnableC15686 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f48353;

    public RunnableC15686(C19922 c19922, String str) {
        super(c19922);
        this.f48353 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String m48358 = AbstractRunnableC21333.m48358(this.f48353);
        C19922 c19922 = this.f68752;
        AbstractC15440 m48364 = AbstractRunnableC21333.m48364(c19922, m48358);
        if (m48366(m48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            AbstractC15440 m45857 = c19922.m45857();
            if (m45857 == null) {
                str = "550 Rename error, maybe RNFR not sent\r\n";
            } else {
                str = !m45857.mo23551(m48364) ? "550 Error during rename operation\r\n" : null;
            }
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("250 rename successful\r\n");
        }
        c19922.m45844((AbstractC15440) null);
    }
}
