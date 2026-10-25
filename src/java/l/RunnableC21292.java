package l;

/* compiled from: H5N1 */
/* renamed from: l.᩸ۖۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class RunnableC21292 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f68656;

    public RunnableC21292(C19922 c19922, String str) {
        super(c19922);
        this.f68656 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String m48358 = AbstractRunnableC21333.m48358(this.f68656);
        C19922 c19922 = this.f68752;
        AbstractC15440 m48364 = AbstractRunnableC21333.m48364(c19922, m48358);
        if (m48366(m48364)) {
            c19922.m45860("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (!m48364.mo23113()) {
            c19922.m45860("550 Can't CWD to invalid directory\r\n");
        } else if (m48364.mo27936()) {
            c19922.m45855(m48364);
            c19922.m45860("250 CWD successful\r\n");
        } else {
            c19922.m45860("550 That path is inaccessible\r\n");
        }
    }
}
