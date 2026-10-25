package l;

/* compiled from: W62A */
/* renamed from: l.ۢۘۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class RunnableC9338 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f28320;

    public RunnableC9338(C19922 c19922, String str) {
        super(c19922);
        this.f28320 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String m48358 = AbstractRunnableC21333.m48358(this.f28320);
        int length = m48358.length();
        C19922 c19922 = this.f68752;
        if (length < 1) {
            str = "550 Invalid argument\r\n";
        } else {
            AbstractC15440 m48364 = AbstractRunnableC21333.m48364(c19922, m48358);
            if (m48366(m48364)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (!m48364.mo23113()) {
                str = "550 Can't RMD a non-directory\r\n";
            } else if (AbstractRunnableC21333.m48365(m48364, c19922.m45865())) {
                str = "550 Won't RMD the root directory\r\n";
            } else {
                str = !m48364.mo23552() ? "550 Deletion error, possibly incomplete\r\n" : null;
            }
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("250 Removed directory\r\n");
        }
    }
}
