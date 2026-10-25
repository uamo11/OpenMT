package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.File;

/* compiled from: Y9AZ */
/* renamed from: l.ۡ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9150 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f27694;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2800 f27695;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f27696;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f27697;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f27698;

    public C9150(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, C2800 c2800, Runnable runnable) {
        this.f27698 = abstractActivityC3346;
        this.f27697 = abstractC15440;
        this.f27695 = c2800;
        this.f27694 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f27698);
        c22933.m51049(R.string.MT_Protector_res_0x7f120a36);
        c22933.m51038(R.string.MT_Protector_res_0x7f1204bd);
        c22933.mo49547();
        this.f27696 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String m12712;
        AbstractC15440 m36526 = C16293.f50117.m36526("term/bin");
        m36526.mo23552();
        m36526.m36508();
        C18090 c18090 = new C18090(this.f27697);
        try {
            m12712 = C4211.m12712(c18090);
            C19277 c19277 = new C19277(c18090.m42207());
            C22933 c22933 = this.f27696;
            C11003.requireNonNull(c22933);
            c19277.m44459(new C23595(c22933));
            for (C3545 c3545 : c18090.m42210()) {
                c19277.m44460(1);
                if (!c3545.isDirectory()) {
                    String name = c3545.getName();
                    if (name.startsWith(m12712)) {
                        String substring = name.substring(m12712.length());
                        if (substring.contains("/")) {
                            continue;
                        } else {
                            System.out.println("Extract: bin/" + substring);
                            AbstractC15440 m365262 = m36526.m36526(substring);
                            m365262.m36493(c18090.m42189(c3545));
                            if (!new File(m365262.mo23544()).setExecutable(true, false)) {
                                throw new Exception("Set Executable Failed: " + m365262.mo23544());
                            }
                        }
                    }
                }
            }
            C4211.m12709(c18090, null);
            c18090.close();
            AbstractC15440 m365263 = C16293.f50117.m36526("term/version");
            C10130 c10130 = new C10130();
            C2800 c2800 = this.f27695;
            c10130.writeInt(c2800.f8741);
            c10130.m25439(c2800.f8740);
            m365263.mo23552();
            m365263.m36496(c10130);
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ServiceC23281.m51598();
        C2094.m6881();
        this.f27694.run();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27698.m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f27694.run();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f27696.m51051();
    }
}
