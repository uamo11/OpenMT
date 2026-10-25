package l;

/* compiled from: I65P */
/* renamed from: l.ܿۘۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class RunnableC17098 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC17098(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        try {
            String mo23544 = c19922.m45852().mo23544();
            AbstractC15440 m45865 = c19922.m45865();
            if (m45865 != null) {
                mo23544 = mo23544.substring(m45865.mo23544().length());
            }
            if (mo23544.length() == 0) {
                mo23544 = "/";
            }
            c19922.m45860("257 \"" + mo23544 + "\"\r\n");
        } catch (Exception unused) {
            c19922.m45853();
        }
    }
}
