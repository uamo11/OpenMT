package l;

/* compiled from: 469D */
/* renamed from: l.ۘۘۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C3693 extends AbstractRunnableC21333 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11651;

    public C3693(C19922 c19922, String str) {
        super(c19922);
        this.f11651 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String m48358 = AbstractRunnableC21333.m48358(this.f11651);
        C19922 c19922 = this.f68752;
        AbstractC15440 m45852 = c19922.m45852();
        long j = 0;
        if (m48358.contains(AbstractC15440.f47291)) {
            str = "550 No directory traversal allowed in SIZE param\r\n";
        } else {
            AbstractC15440 m36526 = m45852.m36526(m48358);
            if (m48366(m36526)) {
                str = "550 SIZE target violates chroot\r\n";
            } else if (!m36526.mo23120()) {
                str = "550 Cannot get the SIZE of nonexistent object\r\n";
            } else if (m36526.mo23119()) {
                j = m36526.mo23127();
                str = null;
            } else {
                str = "550 Cannot get the size of a non-file\r\n";
            }
        }
        if (str != null) {
            c19922.m45860(str);
            return;
        }
        c19922.m45860("213 " + j + "\r\n");
    }
}
