package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Z9MW */
/* renamed from: l.᩸֨᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21260 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f68584;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f68585;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f68586 = new ArrayList();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21965 f68587;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f68588;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f68589;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f68590;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22670 f68591;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f68592;

    public C21260(C21965 c21965, C16560 c16560, List list, Runnable runnable) {
        AbstractC15440 abstractC15440;
        this.f68587 = c21965;
        this.f68585 = c16560;
        this.f68584 = list;
        this.f68590 = runnable;
        abstractC15440 = c21965.f51870;
        this.f68592 = abstractC15440.m36526(C4303.m12893(c21965.m39741()));
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C5031 c5031;
        C5031 c50312;
        C21965 c21965 = this.f68587;
        c5031 = c21965.f70358;
        C22670 c22670 = c5031.m14529() ? new C22670() : null;
        this.f68591 = c22670;
        RunnableC7853 runnableC7853 = c22670 != null ? new RunnableC7853(c22670) : null;
        C22022 c22022 = new C22022(this.f68585.m39056());
        c50312 = c21965.f70358;
        c22022.m49558(c50312.m14529() ? R.string.MT_Protector_res_0x7f1202d0 : R.string.MT_Protector_res_0x7f12037a);
        c22022.m49556("...");
        c22022.m49543((Runnable) runnableC7853);
        c22022.m49548();
        this.f68589 = c22022;
        if (this.f68584.size() == 1) {
            this.f68589.m49545();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5031 c5031;
        InterfaceC0091 m14530;
        C5031 c50312;
        C5031 c50313;
        List<C10211> list = this.f68584;
        AbstractC15440 abstractC15440 = this.f68592;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        C22670 c22670 = this.f68591;
        C21965 c21965 = this.f68587;
        if (c22670 == null) {
            c50313 = c21965.f70358;
            m14530 = c50313.m14530((C22670) null);
        } else {
            c5031 = c21965.f70358;
            m14530 = c5031.m14530(this.f68591);
        }
        try {
            c50312 = c21965.f70358;
            int i = c50312.m14529() ? R.string.MT_Protector_res_0x7f1202d0 : R.string.MT_Protector_res_0x7f12037a;
            int i2 = 0;
            for (C10211 c10211 : list) {
                if (!this.f68589.m51053()) {
                    this.f68589.m49558(i);
                    this.f68589.m49553(0);
                    i2++;
                    this.f68589.m49552(i2, list.size());
                    this.f68589.m49556(c10211.m25626());
                    String m25626 = c10211.m25626();
                    String m25625 = c10211.m25625();
                    boolean m25621 = c10211.m25621();
                    C13621 entry = m14530.getEntry(m25625.substring(1) + m25626);
                    if (entry == null) {
                        entry = m25621 ? m14530.getEntry(m25626) : null;
                    }
                    if (entry == null) {
                        c10211.m25619();
                    } else {
                        AbstractC15440 m36526 = abstractC15440.m36526(c10211.m25628());
                        C23411 m36513 = m36526.m36513("rw");
                        try {
                            m14530.mo1051(entry, m36513, new C14908(this, entry));
                            m36513.close();
                            if (this.f68589.m51053()) {
                                m36526.mo27929();
                            } else {
                                c10211.m25620(m36526);
                                this.f68586.add(new C5977(m36526, c10211.m25626(), entry.m32740()));
                            }
                        } finally {
                        }
                    }
                } else {
                    m14530.close();
                    return;
                }
            }
            m14530.close();
        } catch (Throwable th) {
            try {
                m14530.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f68589.m51053()) {
            this.f68592.mo23552();
        } else {
            this.f68588 = true;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f68592.mo23552();
        if (this.f68589.m51053()) {
            return;
        }
        this.f68585.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f68589.m51051();
        C15528.m36596();
        if (this.f68588) {
            this.f68587.m39735(this.f68586);
            try {
                this.f68590.run();
            } catch (Throwable th) {
                this.f68585.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
