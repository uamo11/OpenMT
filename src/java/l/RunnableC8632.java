package l;

/* compiled from: 6652 */
/* renamed from: l.ۡۘۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class RunnableC8632 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f26355;

    public RunnableC8632(C19922 c19922, String str) {
        super(c19922);
        this.f26355 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String m48358 = AbstractRunnableC21333.m48358(this.f26355);
        C19922 c19922 = this.f68752;
        AbstractC15440 m48364 = AbstractRunnableC21333.m48364(c19922, m48358);
        if (m48366(m48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            str = !m48364.mo23120() ? "450 Cannot rename nonexistent file\r\n" : null;
        }
        if (str != null) {
            c19922.m45860(str);
            c19922.m45844((AbstractC15440) null);
        } else {
            c19922.m45860("350 Filename noted, now send RNTO\r\n");
            c19922.m45844(m48364);
        }
    }
}
